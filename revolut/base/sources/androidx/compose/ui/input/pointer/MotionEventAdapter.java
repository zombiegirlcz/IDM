package androidx.compose.ui.input.pointer;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.collection.LongSparseArray;
import androidx.compose.ui.geometry.Offset;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.bouncycastle.crypto.hpke.HPKE;
import org.jetbrains.annotations.NotNull;
import zsc.p;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0001>B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\bJ\u001b\u0010\r\u001a\u00020\f*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\bJ/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u001f\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 H\u0000¢\u0006\u0004\b#\u0010$J\u0015\u0010&\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*R \u0010,\u001a\u00020+8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b,\u0010-\u0012\u0004\b0\u0010\u0003\u001a\u0004\b.\u0010/R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u0019048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u00109\u001a\b\u0012\u0004\u0012\u000208078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0016\u0010=\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010<¨\u0006?"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter;", "", "<init>", "()V", "Landroid/view/MotionEvent;", "motionEvent", "", "addFreshIds", "(Landroid/view/MotionEvent;)V", "removeStaleIds", "", "pointerId", "", "hasPointerId", "(Landroid/view/MotionEvent;I)Z", "motionEventPointerId", "Landroidx/compose/ui/input/pointer/PointerId;", "getComposePointerId-_I2yYro", "(I)J", "getComposePointerId", "clearOnDeviceChange", "Landroidx/compose/ui/input/pointer/PositionCalculator;", "positionCalculator", "index", "pressed", "Landroidx/compose/ui/input/pointer/PointerInputEventData;", "createPointerInputEventData", "(Landroidx/compose/ui/input/pointer/PositionCalculator;Landroid/view/MotionEvent;IZ)Landroidx/compose/ui/input/pointer/PointerInputEventData;", "Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent$ui", "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/pointer/PositionCalculator;)Landroidx/compose/ui/input/pointer/PointerInputEvent;", "convertToPointerInputEvent", "Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;", "primaryDirectionalMotionAxisOverride", "Landroidx/compose/ui/input/indirect/AndroidIndirectPointerEvent;", "convertToIndirectPointerEvent-k92h6UU$ui", "(Landroid/view/MotionEvent;Landroidx/compose/ui/input/indirect/IndirectPointerEventPrimaryDirectionalMotionAxis;)Landroidx/compose/ui/input/indirect/AndroidIndirectPointerEvent;", "convertToIndirectPointerEvent", "endStream", "(I)V", "", "nextId", "J", "Landroid/util/SparseLongArray;", "motionEventToComposePointerIdMap", "Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui", "()Landroid/util/SparseLongArray;", "getMotionEventToComposePointerIdMap$ui$annotations", "Landroid/util/SparseBooleanArray;", "activeHoverIds", "Landroid/util/SparseBooleanArray;", "", "pointers", "Ljava/util/List;", "Landroidx/collection/LongSparseArray;", "Landroidx/compose/ui/input/pointer/MotionEventAdapter$IndirectPointerEventData;", "previousIndirectPointerEventData", "Landroidx/collection/LongSparseArray;", "previousToolType", "I", "previousSource", "IndirectPointerEventData", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MotionEventAdapter {
    private long nextId;

    @NotNull
    private final SparseLongArray motionEventToComposePointerIdMap = new SparseLongArray();

    @NotNull
    private final SparseBooleanArray activeHoverIds = new SparseBooleanArray();

    @NotNull
    private final List<PointerInputEventData> pointers = new ArrayList();

    @NotNull
    private final LongSparseArray<IndirectPointerEventData> previousIndirectPointerEventData = new LongSparseArray<>(0, 1, null);
    private int previousToolType = -1;
    private int previousSource = -1;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0010\b\u0083@\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u000f\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0013\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0017\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u000b\u0088\u0001\n\u0092\u0001\u00020\u0002¨\u0006 "}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter$IndirectPointerEventData;", "", "", "uptime", "Landroidx/compose/ui/geometry/Offset;", "position", "", "down", "constructor-impl", "(JJZ)J", "packedValue", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "J", "getPackedValue", "()J", "getDown-impl", "(J)Z", "getUptime-impl", "getPosition-F1C5BW0", "Companion", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IndirectPointerEventData {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private final long packedValue;

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\n\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0002J\u0010\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005H\u0002¨\u0006\f"}, d2 = {"Landroidx/compose/ui/input/pointer/MotionEventAdapter$IndirectPointerEventData$Companion;", "", "<init>", "()V", "packShorts", "", "val1", "", "val2", "unpackShort1", "value", "unpackShort2", "ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final int packShorts(short val1, short val2) {
                return (val1 << 16) | (val2 & HPKE.aead_EXPORT_ONLY);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short unpackShort1(int value) {
                return (short) (value >>> 16);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public final short unpackShort2(int value) {
                return (short) (value & Blake2xsDigest.UNKNOWN_DIGEST_LENGTH);
            }

            private Companion() {
            }
        }

        private /* synthetic */ IndirectPointerEventData(long j2) {
            this.packedValue = j2;
        }

        /* JADX INFO: renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ IndirectPointerEventData m2425boximpl(long j2) {
            return new IndirectPointerEventData(j2);
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m2426constructorimpl(long j2) {
            return j2;
        }

        /* JADX INFO: renamed from: equals-impl, reason: not valid java name */
        public static boolean m2428equalsimpl(long j2, Object obj2) {
            return (obj2 instanceof IndirectPointerEventData) && j2 == ((IndirectPointerEventData) obj2).getPackedValue();
        }

        /* JADX INFO: renamed from: getDown-impl, reason: not valid java name */
        public static final boolean m2429getDownimpl(long j2) {
            return (j2 & 1) != 0;
        }

        /* JADX INFO: renamed from: getPosition-F1C5BW0, reason: not valid java name */
        public static final long m2430getPositionF1C5BW0(long j2) {
            int i = (int) (j2 >>> 32);
            Companion companion = INSTANCE;
            float fUnpackShort1 = companion.unpackShort1(i);
            return Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(companion.unpackShort2(i))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fUnpackShort1) << 32));
        }

        /* JADX INFO: renamed from: getUptime-impl, reason: not valid java name */
        public static final long m2431getUptimeimpl(long j2) {
            return (j2 >> 1) & 2147483647L;
        }

        /* JADX INFO: renamed from: hashCode-impl, reason: not valid java name */
        public static int m2432hashCodeimpl(long j2) {
            return Long.hashCode(j2);
        }

        /* JADX INFO: renamed from: toString-impl, reason: not valid java name */
        public static String m2433toStringimpl(long j2) {
            return "IndirectPointerEventData(packedValue=" + j2 + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public boolean equals(Object obj2) {
            return m2428equalsimpl(this.packedValue, obj2);
        }

        public int hashCode() {
            return m2432hashCodeimpl(this.packedValue);
        }

        public String toString() {
            return m2433toStringimpl(this.packedValue);
        }

        /* JADX INFO: renamed from: unbox-impl, reason: not valid java name and from getter */
        public final /* synthetic */ long getPackedValue() {
            return this.packedValue;
        }

        /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
        public static long m2427constructorimpl(long j2, long j3, boolean z) {
            return m2426constructorimpl(((j2 & 2147483647L) << 1) | (z ? 1L : 0L) | (((long) INSTANCE.packShorts((short) Float.intBitsToFloat((int) (j3 >> 32)), (short) Float.intBitsToFloat((int) (j3 & BodyPartID.bodyIdMax)))) << 32));
        }
    }

    private final void addFreshIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.motionEventToComposePointerIdMap;
                long j2 = this.nextId;
                this.nextId = 1 + j2;
                sparseLongArray.put(pointerId, j2);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.motionEventToComposePointerIdMap.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.motionEventToComposePointerIdMap;
            long j3 = this.nextId;
            this.nextId = 1 + j3;
            sparseLongArray2.put(pointerId2, j3);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.activeHoverIds.put(pointerId2, true);
            }
        }
    }

    private final void clearOnDeviceChange(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.previousToolType && source == this.previousSource) {
            return;
        }
        this.previousToolType = toolType;
        this.previousSource = source;
        this.activeHoverIds.clear();
        this.motionEventToComposePointerIdMap.clear();
    }

    private final PointerInputEventData createPointerInputEventData(PositionCalculator positionCalculator, MotionEvent motionEvent, int index, boolean pressed) {
        long jMo2503screenToLocalMKHz9U;
        long jM2435toRawOffsetdBAh8RU;
        int i;
        long jM2423getComposePointerId_I2yYro = m2423getComposePointerId_I2yYro(motionEvent.getPointerId(index));
        float pressure = motionEvent.getPressure(index);
        float x3 = motionEvent.getX(index);
        float y2 = motionEvent.getY(index);
        long jFloatToRawIntBits = Float.floatToRawIntBits(x3);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(y2);
        char c2 = p.SPACE_CHAR;
        long j2 = BodyPartID.bodyIdMax;
        long jM1827constructorimpl = Offset.m1827constructorimpl((jFloatToRawIntBits2 & BodyPartID.bodyIdMax) | (jFloatToRawIntBits << 32));
        long jM1829copydBAh8RU$default = Offset.m1829copydBAh8RU$default(jM1827constructorimpl, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);
        if (index == 0) {
            jM2435toRawOffsetdBAh8RU = Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(motionEvent.getRawY())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32));
            jMo2503screenToLocalMKHz9U = positionCalculator.mo2503screenToLocalMKHz9U(jM2435toRawOffsetdBAh8RU);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jM2435toRawOffsetdBAh8RU = MotionEventHelper.INSTANCE.m2435toRawOffsetdBAh8RU(motionEvent, index);
            jMo2503screenToLocalMKHz9U = positionCalculator.mo2503screenToLocalMKHz9U(jM2435toRawOffsetdBAh8RU);
        } else {
            long jMo2502localToScreenMKHz9U = positionCalculator.mo2502localToScreenMKHz9U(jM1827constructorimpl);
            jMo2503screenToLocalMKHz9U = jM1827constructorimpl;
            jM2435toRawOffsetdBAh8RU = jMo2502localToScreenMKHz9U;
        }
        int toolType = motionEvent.getToolType(index);
        int iM2501getUnknownT8wyACA = toolType != 0 ? toolType != 1 ? toolType != 2 ? toolType != 3 ? toolType != 4 ? PointerType.INSTANCE.m2501getUnknownT8wyACA() : PointerType.INSTANCE.m2497getEraserT8wyACA() : PointerType.INSTANCE.m2498getMouseT8wyACA() : PointerType.INSTANCE.m2499getStylusT8wyACA() : PointerType.INSTANCE.m2500getTouchT8wyACA() : PointerType.INSTANCE.m2501getUnknownT8wyACA();
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        int i2 = 0;
        while (i2 < historySize) {
            float historicalX = motionEvent.getHistoricalX(index, i2);
            float historicalY = motionEvent.getHistoricalY(index, i2);
            char c3 = c2;
            long j3 = j2;
            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 || (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) >= 2139095040) {
                i = i2;
            } else {
                long jM1827constructorimpl2 = Offset.m1827constructorimpl((((long) Float.floatToRawIntBits(historicalX)) << c3) | (((long) Float.floatToRawIntBits(historicalY)) & j3));
                i = i2;
                arrayList.add(new HistoricalChange(motionEvent.getHistoricalEventTime(i), jM1827constructorimpl2, jM1827constructorimpl2, null));
            }
            i2 = i + 1;
            c2 = c3;
            j2 = j3;
        }
        return new PointerInputEventData(jM2423getComposePointerId_I2yYro, motionEvent.getEventTime(), jM2435toRawOffsetdBAh8RU, jMo2503screenToLocalMKHz9U, pressed, pressure, iM2501getUnknownT8wyACA, this.activeHoverIds.get(motionEvent.getPointerId(index), false), arrayList, motionEvent.getActionMasked() == 8 ? Offset.m1827constructorimpl((((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + BitmapDescriptorFactory.HUE_RED)) & j2) | (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c2)) : Offset.INSTANCE.m1845getZeroF1C5BW0(), jM1829copydBAh8RU$default, null);
    }

    /* JADX INFO: renamed from: getComposePointerId-_I2yYro, reason: not valid java name */
    private final long m2423getComposePointerId_I2yYro(int motionEventPointerId) {
        long jValueAt;
        int iIndexOfKey = this.motionEventToComposePointerIdMap.indexOfKey(motionEventPointerId);
        if (iIndexOfKey >= 0) {
            jValueAt = this.motionEventToComposePointerIdMap.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.nextId;
            this.nextId = 1 + jValueAt;
            this.motionEventToComposePointerIdMap.put(motionEventPointerId, jValueAt);
        }
        return PointerId.m2457constructorimpl(jValueAt);
    }

    private final boolean hasPointerId(MotionEvent motionEvent, int i) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (motionEvent.getPointerId(i2) == i) {
                return true;
            }
        }
        return false;
    }

    private final void removeStaleIds(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.activeHoverIds.get(pointerId, false)) {
                this.motionEventToComposePointerIdMap.delete(pointerId);
                this.activeHoverIds.delete(pointerId);
            }
        }
        if (this.motionEventToComposePointerIdMap.size() > motionEvent.getPointerCount()) {
            for (int size = this.motionEventToComposePointerIdMap.size() - 1; -1 < size; size--) {
                int iKeyAt = this.motionEventToComposePointerIdMap.keyAt(size);
                if (!hasPointerId(motionEvent, iKeyAt)) {
                    this.motionEventToComposePointerIdMap.removeAt(size);
                    this.activeHoverIds.delete(iKeyAt);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d5  */
    /* JADX INFO: renamed from: convertToIndirectPointerEvent-k92h6UU$ui, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent m2424convertToIndirectPointerEventk92h6UU$ui(@org.jetbrains.annotations.NotNull android.view.MotionEvent r28, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis r29) {
        /*
            Method dump skipped, instruction units count: 256
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.input.pointer.MotionEventAdapter.m2424convertToIndirectPointerEventk92h6UU$ui(android.view.MotionEvent, androidx.compose.ui.input.indirect.IndirectPointerEventPrimaryDirectionalMotionAxis):androidx.compose.ui.input.indirect.AndroidIndirectPointerEvent");
    }

    public final PointerInputEvent convertToPointerInputEvent$ui(@NotNull MotionEvent motionEvent, @NotNull PositionCalculator positionCalculator) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3 || actionMasked == 4) {
            this.motionEventToComposePointerIdMap.clear();
            this.activeHoverIds.clear();
            return null;
        }
        clearOnDeviceChange(motionEvent);
        addFreshIds(motionEvent);
        boolean z = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
        boolean z3 = actionMasked == 8;
        if (z) {
            this.activeHoverIds.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.pointers.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i = 0;
        while (i < pointerCount) {
            this.pointers.add(createPointerInputEventData(positionCalculator, motionEvent, i, (z || i == actionIndex || (z3 && motionEvent.getButtonState() == 0)) ? false : true));
            i++;
        }
        removeStaleIds(motionEvent);
        return new PointerInputEvent(motionEvent.getEventTime(), this.pointers, motionEvent);
    }

    public final void endStream(int pointerId) {
        this.activeHoverIds.delete(pointerId);
        this.motionEventToComposePointerIdMap.delete(pointerId);
    }
}
