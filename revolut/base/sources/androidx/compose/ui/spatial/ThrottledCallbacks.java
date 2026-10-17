package androidx.compose.ui.spatial;

import androidx.collection.IntObjectMapKt;
import androidx.collection.MutableIntObjectMap;
import androidx.compose.ui.node.DelegatableNode;
import androidx.compose.ui.node.DelegatableNodeKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.LayoutNodeKt;
import androidx.compose.ui.unit.IntOffset;
import ib.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b#\b\u0001\u0018\u00002\u00020\u0001:\u0001YB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJA\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010 \u001a\u00020\u00182\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u0011¢\u0006\u0004\b%\u0010#J3\u0010*\u001a\u00020\u00182\n\u0010'\u001a\u00060&R\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0000¢\u0006\u0004\b(\u0010)J=\u00100\u001a\u00020\u00182\n\u0010'\u001a\u00060&R\u00020\u00002\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020\u0011H\u0002¢\u0006\u0004\b.\u0010/JE\u00104\u001a\u00020\u00112\n\u0010'\u001a\u00060&R\u00020\u00002\u0006\u0010+\u001a\u00020\u00042\u0006\u0010,\u001a\u00020\u00042\b\u0010-\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001f\u001a\u00020\u00112\u0006\u00101\u001a\u00020\u0011H\u0002¢\u0006\u0004\b2\u00103J\u001b\u00105\u001a\u00020\f2\n\u0010'\u001a\u00060&R\u00020\u0000H\u0002¢\u0006\u0004\b5\u00106J5\u0010:\u001a\u00060&R\u00020\u0000*\f\u0012\b\u0012\u00060&R\u00020\u0000072\u0006\u00108\u001a\u00020\t2\n\u00109\u001a\u00060&R\u00020\u0000H\u0002¢\u0006\u0004\b:\u0010;J1\u0010<\u001a\u00020\f*\f\u0012\b\u0012\u00060&R\u00020\u0000072\u0006\u00108\u001a\u00020\t2\n\u00109\u001a\u00060&R\u00020\u0000H\u0002¢\u0006\u0004\b<\u0010=R!\u0010>\u001a\f\u0012\b\u0012\u00060&R\u00020\u0000078\u0006¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR(\u0010B\u001a\b\u0018\u00010&R\u00020\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\"\u0010H\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010#R\"\u0010+\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b+\u0010I\u001a\u0004\bM\u0010K\"\u0004\bN\u0010#R\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010I\u001a\u0004\bO\u0010K\"\u0004\bP\u0010#R\"\u0010Q\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010I\u001a\u0004\bR\u0010K\"\u0004\bS\u0010#R$\u0010-\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X¨\u0006Z"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks;", "", "<init>", "()V", "Landroidx/compose/ui/unit/IntOffset;", b.Screen, "window", "Landroidx/compose/ui/graphics/Matrix;", "matrix", "", "windowWidth", "windowHeight", "", "updateOffsets-LDcG7Xg", "(JJ[FII)Z", "updateOffsets", "id", "", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "callback", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "registerOnRectChanged", "(IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "topLeft", "bottomRight", "currentMillis", "fireOnUpdatedRect", "(IJJJ)V", "fireOnRectChangedEntries", "(J)V", "fireGlobalChangeEntries", "triggerDebounced", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "entry", "fireWithUpdatedRect$ui", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJJ)V", "fireWithUpdatedRect", "windowOffset", "screenOffset", "viewToWindowMatrix", "fire-WY9HvpM", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJ)V", "fire", "minDeadline", "debounceEntry-b8qMvQI", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;JJ[FJJ)J", "debounceEntry", "removeFromGlobalEntries", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z", "Landroidx/collection/MutableIntObjectMap;", "key", "value", "multiPut", "(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "multiRemove", "(Landroidx/collection/MutableIntObjectMap;ILandroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)Z", "rectChangedMap", "Landroidx/collection/MutableIntObjectMap;", "getRectChangedMap", "()Landroidx/collection/MutableIntObjectMap;", "globalChangeEntries", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getGlobalChangeEntries", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setGlobalChangeEntries", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "minDebounceDeadline", "J", "getMinDebounceDeadline", "()J", "setMinDebounceDeadline", "getWindowOffset-nOcc-ac", "setWindowOffset--gyyYBs", "getScreenOffset-nOcc-ac", "setScreenOffset--gyyYBs", "windowSize", "getWindowSize", "setWindowSize", "[F", "getViewToWindowMatrix-3i98HWw", "()[F", "setViewToWindowMatrix-Q8lPUPs", "([F)V", "Entry", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ThrottledCallbacks {
    private Entry globalChangeEntries;
    private long screenOffset;
    private float[] viewToWindowMatrix;
    private long windowOffset;
    private long windowSize;

    @NotNull
    private final MutableIntObjectMap<Entry> rectChangedMap = IntObjectMapKt.mutableIntObjectMapOf();
    private long minDebounceDeadline = -1;

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0086\u0004\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J7\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b!\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8\u0006¢\u0006\f\n\u0004\b\f\u0010%\u001a\u0004\b&\u0010'R(\u0010)\u001a\b\u0018\u00010\u0000R\u00020(8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u0010\u0011\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u001e\u001a\u0004\b/\u0010 \"\u0004\b0\u00101R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b2\u0010 \"\u0004\b3\u00101R\"\u00104\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001e\u001a\u0004\b5\u0010 \"\u0004\b6\u00101R\"\u00107\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u001e\u001a\u0004\b8\u0010 \"\u0004\b9\u00101¨\u0006:"}, d2 = {"Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "Landroidx/compose/ui/node/DelegatableNode$RegistrationHandle;", "", "id", "", "throttleMillis", "debounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "node", "Lkotlin/Function1;", "Landroidx/compose/ui/spatial/RelativeLayoutBounds;", "", "callback", "<init>", "(Landroidx/compose/ui/spatial/ThrottledCallbacks;IJJLandroidx/compose/ui/node/DelegatableNode;Lkotlin/jvm/functions/Function1;)V", "unregister", "()V", "topLeft", "bottomRight", "Landroidx/compose/ui/unit/IntOffset;", "windowOffset", "screenOffset", "Landroidx/compose/ui/graphics/Matrix;", "viewToWindowMatrix", "fire-9b-9wPM", "(JJJJ[F)V", "fire", "I", "getId", "()I", "J", "getThrottleMillis", "()J", "getDebounceMillis", "Landroidx/compose/ui/node/DelegatableNode;", "getNode", "()Landroidx/compose/ui/node/DelegatableNode;", "Lkotlin/jvm/functions/Function1;", "getCallback", "()Lkotlin/jvm/functions/Function1;", "Landroidx/compose/ui/spatial/ThrottledCallbacks;", "next", "Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "getNext", "()Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;", "setNext", "(Landroidx/compose/ui/spatial/ThrottledCallbacks$Entry;)V", "getTopLeft", "setTopLeft", "(J)V", "getBottomRight", "setBottomRight", "lastInvokeMillis", "getLastInvokeMillis", "setLastInvokeMillis", "lastUninvokedFireMillis", "getLastUninvokedFireMillis", "setLastUninvokedFireMillis", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class Entry implements DelegatableNode.RegistrationHandle {
        private long bottomRight;

        @NotNull
        private final Function1<RelativeLayoutBounds, Unit> callback;
        private final long debounceMillis;
        private final int id;
        private long lastInvokeMillis = Long.MIN_VALUE;
        private long lastUninvokedFireMillis = -1;
        private Entry next;

        @NotNull
        private final DelegatableNode node;
        private final long throttleMillis;
        private long topLeft;

        /* JADX WARN: Multi-variable type inference failed */
        public Entry(int i, long j2, long j3, @NotNull DelegatableNode delegatableNode, @NotNull Function1<? super RelativeLayoutBounds, Unit> function1) {
            this.id = i;
            this.throttleMillis = j2;
            this.debounceMillis = j3;
            this.node = delegatableNode;
            this.callback = function1;
        }

        /* JADX INFO: renamed from: fire-9b-9wPM, reason: not valid java name */
        public final void m2851fire9b9wPM(long topLeft, long bottomRight, long windowOffset, long screenOffset, float[] viewToWindowMatrix) {
            RelativeLayoutBounds relativeLayoutBoundsM2852rectInfoForDg36KO4 = ThrottledCallbacksKt.m2852rectInfoForDg36KO4(this.node, topLeft, bottomRight, windowOffset, screenOffset, ThrottledCallbacks.this.getWindowSize(), viewToWindowMatrix);
            if (relativeLayoutBoundsM2852rectInfoForDg36KO4 == null) {
                return;
            }
            this.callback.invoke(relativeLayoutBoundsM2852rectInfoForDg36KO4);
        }

        public final long getBottomRight() {
            return this.bottomRight;
        }

        public final long getDebounceMillis() {
            return this.debounceMillis;
        }

        public final long getLastInvokeMillis() {
            return this.lastInvokeMillis;
        }

        public final long getLastUninvokedFireMillis() {
            return this.lastUninvokedFireMillis;
        }

        public final Entry getNext() {
            return this.next;
        }

        @NotNull
        public final DelegatableNode getNode() {
            return this.node;
        }

        public final long getThrottleMillis() {
            return this.throttleMillis;
        }

        public final long getTopLeft() {
            return this.topLeft;
        }

        public final void setBottomRight(long j2) {
            this.bottomRight = j2;
        }

        public final void setLastInvokeMillis(long j2) {
            this.lastInvokeMillis = j2;
        }

        public final void setLastUninvokedFireMillis(long j2) {
            this.lastUninvokedFireMillis = j2;
        }

        public final void setNext(Entry entry) {
            this.next = entry;
        }

        public final void setTopLeft(long j2) {
            this.topLeft = j2;
        }

        @Override // androidx.compose.ui.node.DelegatableNode.RegistrationHandle
        public void unregister() {
            ThrottledCallbacks throttledCallbacks = ThrottledCallbacks.this;
            if (throttledCallbacks.multiRemove(throttledCallbacks.getRectChangedMap(), this.id, this)) {
                return;
            }
            ThrottledCallbacks.this.removeFromGlobalEntries(this);
        }
    }

    public ThrottledCallbacks() {
        IntOffset.Companion companion = IntOffset.INSTANCE;
        this.windowOffset = companion.m3343getZeronOccac();
        this.screenOffset = companion.m3343getZeronOccac();
    }

    /* JADX INFO: renamed from: debounceEntry-b8qMvQI, reason: not valid java name */
    private final long m2848debounceEntryb8qMvQI(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis, long minDeadline) {
        if (entry.getDebounceMillis() <= 0 || entry.getLastUninvokedFireMillis() <= 0) {
            return minDeadline;
        }
        if (currentMillis - entry.getLastUninvokedFireMillis() < entry.getDebounceMillis()) {
            return Math.min(minDeadline, entry.getDebounceMillis() + entry.getLastUninvokedFireMillis());
        }
        entry.setLastInvokeMillis(currentMillis);
        entry.setLastUninvokedFireMillis(-1L);
        entry.m2851fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        return minDeadline;
    }

    /* JADX INFO: renamed from: fire-WY9HvpM, reason: not valid java name */
    private final void m2849fireWY9HvpM(Entry entry, long windowOffset, long screenOffset, float[] viewToWindowMatrix, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        boolean z = currentMillis - lastInvokeMillis > entry.getThrottleMillis() || lastInvokeMillis == Long.MIN_VALUE;
        boolean z3 = entry.getDebounceMillis() == 0;
        entry.setLastUninvokedFireMillis(currentMillis);
        if (z && z3) {
            entry.setLastInvokeMillis(currentMillis);
            entry.m2851fire9b9wPM(entry.getTopLeft(), entry.getBottomRight(), windowOffset, screenOffset, viewToWindowMatrix);
        }
        if (z3) {
            return;
        }
        long j2 = this.minDebounceDeadline;
        long debounceMillis = entry.getDebounceMillis() + currentMillis;
        if (j2 <= 0 || debounceMillis >= j2) {
            return;
        }
        this.minDebounceDeadline = j2;
    }

    private final Entry multiPut(MutableIntObjectMap<Entry> mutableIntObjectMap, int i, Entry entry) {
        Entry entry2 = mutableIntObjectMap.get(i);
        if (entry2 == null) {
            mutableIntObjectMap.set(i, entry);
            entry2 = entry;
        }
        Entry next = entry2;
        if (next != entry) {
            while (next.getNext() != null) {
                next = next.getNext();
                Intrinsics.h(next);
            }
            next.setNext(entry);
        }
        return entry;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean multiRemove(MutableIntObjectMap<Entry> mutableIntObjectMap, int i, Entry entry) {
        Entry entryRemove = mutableIntObjectMap.remove(i);
        if (entryRemove == null) {
            return false;
        }
        if (entryRemove.equals(entry)) {
            Entry next = entry.getNext();
            entry.setNext(null);
            if (next != null) {
                mutableIntObjectMap.put(i, next);
            } else {
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(entry.getNode().getNode());
                if (layoutNodeRequireLayoutNode.getAddedToRectList()) {
                    LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().unsetHasCallbacksFor(layoutNodeRequireLayoutNode);
                }
            }
            return true;
        }
        mutableIntObjectMap.put(i, entryRemove);
        while (true) {
            if (entryRemove == null) {
                break;
            }
            Entry next2 = entryRemove.getNext();
            if (next2 == null) {
                return false;
            }
            if (next2 == entry) {
                entryRemove.setNext(entry.getNext());
                entry.setNext(null);
                break;
            }
            entryRemove = entryRemove.getNext();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean removeFromGlobalEntries(Entry entry) {
        Entry entry2 = this.globalChangeEntries;
        if (entry2 == entry) {
            this.globalChangeEntries = entry2.getNext();
            entry.setNext(null);
            return true;
        }
        Entry next = entry2 != null ? entry2.getNext() : null;
        while (true) {
            Entry entry3 = next;
            Entry entry4 = entry2;
            entry2 = entry3;
            if (entry2 == null) {
                return false;
            }
            if (entry2 == entry) {
                if (entry4 != null) {
                    entry4.setNext(entry2.getNext());
                }
                entry.setNext(null);
                return true;
            }
            next = entry2.getNext();
        }
    }

    public final void fireGlobalChangeEntries(long currentMillis) {
        long j2 = this.windowOffset;
        long j3 = this.screenOffset;
        float[] fArr = this.viewToWindowMatrix;
        Entry entry = this.globalChangeEntries;
        if (entry != null) {
            for (Entry next = entry; next != null; next = next.getNext()) {
                LayoutNode layoutNodeRequireLayoutNode = DelegatableNodeKt.requireLayoutNode(next.getNode());
                long jM2841getOffsetFromRectListForBjo55l4 = LayoutNodeKt.requireOwner(layoutNodeRequireLayoutNode).getRectManager().m2841getOffsetFromRectListForBjo55l4(layoutNodeRequireLayoutNode);
                long lastSize = layoutNodeRequireLayoutNode.getLastSize();
                next.setTopLeft(jM2841getOffsetFromRectListForBjo55l4);
                next.setBottomRight((((long) (IntOffset.m3334getXimpl(jM2841getOffsetFromRectListForBjo55l4) + ((int) (lastSize >> 32)))) << 32) | (((long) (IntOffset.m3335getYimpl(jM2841getOffsetFromRectListForBjo55l4) + ((int) (lastSize & BodyPartID.bodyIdMax)))) & BodyPartID.bodyIdMax));
                m2849fireWY9HvpM(next, j2, j3, fArr, currentMillis);
            }
        }
    }

    public final void fireOnRectChangedEntries(long currentMillis) {
        ThrottledCallbacks throttledCallbacks = this;
        long j2 = throttledCallbacks.windowOffset;
        long j3 = throttledCallbacks.screenOffset;
        float[] fArr = throttledCallbacks.viewToWindowMatrix;
        MutableIntObjectMap<Entry> mutableIntObjectMap = throttledCallbacks.rectChangedMap;
        Object[] objArr = mutableIntObjectMap.values;
        long[] jArr = mutableIntObjectMap.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j5 = jArr[i];
            if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                long j16 = j5;
                int i3 = 0;
                while (i3 < i2) {
                    if ((j16 & 255) < 128) {
                        Entry next = (Entry) objArr[(i << 3) + i3];
                        while (next != null) {
                            int i5 = i3;
                            Entry entry = next;
                            throttledCallbacks.m2849fireWY9HvpM(entry, j2, j3, fArr, currentMillis);
                            next = entry.getNext();
                            throttledCallbacks = this;
                            i3 = i5;
                        }
                    }
                    j16 >>= 8;
                    i3++;
                    throttledCallbacks = this;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            }
            i++;
            throttledCallbacks = this;
        }
    }

    public final void fireOnUpdatedRect(int id10, long topLeft, long bottomRight, long currentMillis) {
        Entry next = this.rectChangedMap.get(id10);
        while (true) {
            Entry entry = next;
            if (entry == null) {
                return;
            }
            next = entry.getNext();
            fireWithUpdatedRect$ui(entry, topLeft, bottomRight, currentMillis);
        }
    }

    public final void fireWithUpdatedRect$ui(@NotNull Entry entry, long topLeft, long bottomRight, long currentMillis) {
        long lastInvokeMillis = entry.getLastInvokeMillis();
        long throttleMillis = entry.getThrottleMillis();
        long debounceMillis = entry.getDebounceMillis();
        boolean z = currentMillis - lastInvokeMillis >= throttleMillis || lastInvokeMillis == Long.MIN_VALUE;
        boolean z3 = debounceMillis == 0;
        boolean z4 = throttleMillis == 0;
        entry.setTopLeft(topLeft);
        entry.setBottomRight(bottomRight);
        boolean z6 = !(z3 || z4) || z3;
        if (z && z6) {
            entry.setLastUninvokedFireMillis(-1L);
            entry.setLastInvokeMillis(currentMillis);
            entry.m2851fire9b9wPM(topLeft, bottomRight, this.windowOffset, this.screenOffset, this.viewToWindowMatrix);
        } else {
            if (z3) {
                return;
            }
            entry.setLastUninvokedFireMillis(currentMillis);
            long j2 = this.minDebounceDeadline;
            long j3 = currentMillis + debounceMillis;
            if (j2 <= 0 || j3 >= j2) {
                return;
            }
            this.minDebounceDeadline = j2;
        }
    }

    public final long getMinDebounceDeadline() {
        return this.minDebounceDeadline;
    }

    @NotNull
    public final MutableIntObjectMap<Entry> getRectChangedMap() {
        return this.rectChangedMap;
    }

    public final long getWindowSize() {
        return this.windowSize;
    }

    @NotNull
    public final DelegatableNode.RegistrationHandle registerOnRectChanged(int id10, long throttleMillis, long debounceMillis, @NotNull DelegatableNode node, @NotNull Function1<? super RelativeLayoutBounds, Unit> callback) {
        return multiPut(this.rectChangedMap, id10, new Entry(id10, throttleMillis, debounceMillis == 0 ? throttleMillis : debounceMillis, node, callback));
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x008c A[LOOP:0: B:8:0x0023->B:25:0x008c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0096 A[EDGE_INSN: B:39:0x0096->B:27:0x0096 BREAK  A[LOOP:0: B:8:0x0023->B:25:0x008c], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void triggerDebounced(long r27) {
        /*
            r26 = this;
            r0 = r26
            long r1 = r0.minDebounceDeadline
            int r1 = (r1 > r27 ? 1 : (r1 == r27 ? 0 : -1))
            if (r1 <= 0) goto L9
            return
        L9:
            long r2 = r0.windowOffset
            long r4 = r0.screenOffset
            float[] r6 = r0.viewToWindowMatrix
            androidx.collection.MutableIntObjectMap<androidx.compose.ui.spatial.ThrottledCallbacks$Entry> r1 = r0.rectChangedMap
            java.lang.Object[] r11 = r1.values
            long[] r12 = r1.metadata
            int r1 = r12.length
            int r13 = r1 + (-2)
            if (r13 < 0) goto L8f
            r16 = 0
            r1 = r16
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L23:
            r9 = r12[r1]
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r14 = ~r9
            r19 = 7
            long r14 = r14 << r19
            long r14 = r14 & r9
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r14 = r14 & r19
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 == 0) goto L8a
            int r14 = r1 - r13
            int r14 = ~r14
            int r14 = r14 >>> 31
            r15 = 8
            int r14 = 8 - r14
            r19 = r9
            r9 = r16
        L48:
            if (r9 >= r14) goto L84
            r21 = 255(0xff, double:1.26E-321)
            long r21 = r19 & r21
            r23 = 128(0x80, double:6.3E-322)
            int r10 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r10 >= 0) goto L7a
            int r10 = r1 << 3
            int r10 = r10 + r9
            r10 = r11[r10]
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r10 = (androidx.compose.ui.spatial.ThrottledCallbacks.Entry) r10
        L5b:
            if (r10 == 0) goto L74
            r25 = r1
            r21 = r9
            r1 = r10
            r9 = r7
            r7 = r27
            long r9 = r0.m2848debounceEntryb8qMvQI(r1, r2, r4, r6, r7, r9)
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r1 = r1.getNext()
            r7 = r9
            r9 = r21
            r10 = r1
            r1 = r25
            goto L5b
        L74:
            r21 = r9
            r9 = r7
        L77:
            r25 = r1
            goto L7d
        L7a:
            r21 = r9
            goto L77
        L7d:
            long r19 = r19 >> r15
            int r9 = r21 + 1
            r1 = r25
            goto L48
        L84:
            r25 = r1
            if (r14 != r15) goto L96
            r1 = r25
        L8a:
            if (r1 == r13) goto L96
            int r1 = r1 + 1
            goto L23
        L8f:
            r17 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r7 = r17
        L96:
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r1 = r0.globalChangeEntries
            if (r1 == 0) goto La9
            r9 = r7
        L9b:
            if (r1 == 0) goto La8
            r7 = r27
            long r9 = r0.m2848debounceEntryb8qMvQI(r1, r2, r4, r6, r7, r9)
            androidx.compose.ui.spatial.ThrottledCallbacks$Entry r1 = r1.getNext()
            goto L9b
        La8:
            r7 = r9
        La9:
            int r1 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r1 != 0) goto Laf
            r7 = -1
        Laf:
            r0.minDebounceDeadline = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.ThrottledCallbacks.triggerDebounced(long):void");
    }

    /* JADX INFO: renamed from: updateOffsets-LDcG7Xg, reason: not valid java name */
    public final boolean m2850updateOffsetsLDcG7Xg(long screen, long window, float[] matrix, int windowWidth, int windowHeight) {
        boolean z;
        if (IntOffset.m3333equalsimpl0(window, this.windowOffset)) {
            z = false;
        } else {
            this.windowOffset = window;
            z = true;
        }
        if (!IntOffset.m3333equalsimpl0(screen, this.screenOffset)) {
            this.screenOffset = screen;
            z = true;
        }
        if (matrix != null) {
            this.viewToWindowMatrix = matrix;
            z = true;
        }
        long j2 = (((long) windowWidth) << 32) | (((long) windowHeight) & BodyPartID.bodyIdMax);
        if (j2 == this.windowSize) {
            return z;
        }
        this.windowSize = j2;
        return true;
    }
}
