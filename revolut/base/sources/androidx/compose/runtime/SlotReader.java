package androidx.compose.runtime;

import ch.qos.logback.core.CoreConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\tJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\tJ\u0015\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006¢\u0006\u0004\b\u0012\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\tJ\u0015\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\fJ\u0017\u0010\u0015\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u000fJ\u0017\u0010\u0016\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u000fJ\u0015\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\fJ\u0015\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\fJ\u0017\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u000fJ\u001f\u0010\u0019\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u001d¢\u0006\u0004\b!\u0010\u001fJ\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010\u001fJ\r\u0010#\u001a\u00020\u001d¢\u0006\u0004\b#\u0010\u001fJ\r\u0010$\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u001d¢\u0006\u0004\b&\u0010\u001fJ\u0015\u0010'\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b)\u0010(J\r\u0010*\u001a\u00020\u001d¢\u0006\u0004\b*\u0010\u001fJ\u0013\u0010-\u001a\b\u0012\u0004\u0012\u00020,0+¢\u0006\u0004\b-\u0010.J\u000f\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00103\u001a\u0002022\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b3\u00104J\u001d\u0010\u000e\u001a\u0004\u0018\u00010\u0001*\u0002052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000e\u00106J\u001d\u00107\u001a\u0004\u0018\u00010\u0001*\u0002052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b7\u00106J\u001d\u00108\u001a\u0004\u0018\u00010\u0001*\u0002052\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00106R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u001e\u0010A\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010?R6\u0010G\u001a\"\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020E\u0018\u00010Dj\u0010\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020E\u0018\u0001`F8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR$\u0010J\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\"\u0010N\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010?\u001a\u0004\bO\u0010%\"\u0004\bP\u0010(R$\u0010Q\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bQ\u0010?\u001a\u0004\bR\u0010%R$\u0010\b\u001a\u00020\u00062\u0006\u0010I\u001a\u00020\u00068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\b\u0010?\u001a\u0004\bS\u0010%R\u0014\u0010U\u001a\u00020T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010?R\u0016\u0010X\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010?R\u0016\u0010Y\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bY\u0010?R$\u0010Z\u001a\u00020\n2\u0006\u0010I\u001a\u00020\n8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bZ\u0010K\u001a\u0004\b[\u0010MR\u0011\u0010]\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\\\u0010%R\u0011\u0010_\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b^\u0010%R\u0011\u0010\u000b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010MR\u0011\u0010`\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b`\u0010MR\u0011\u0010b\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\ba\u0010MR\u0011\u0010\u0010\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bc\u0010%R\u0011\u0010e\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bd\u0010%R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bf\u0010%R\u0011\u0010h\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bg\u0010%R\u0011\u0010\u0014\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bi\u0010MR\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bj\u0010\u001cR\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u00018F¢\u0006\u0006\u001a\u0004\bk\u0010\u001cR\u0011\u0010m\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bl\u0010%R\u0011\u0010o\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bn\u0010%¨\u0006p"}, d2 = {"Landroidx/compose/runtime/SlotReader;", "", "Landroidx/compose/runtime/SlotTable;", "table", "<init>", "(Landroidx/compose/runtime/SlotTable;)V", "", "index", "parent", "(I)I", "", "isNode", "(I)Z", "nodeCount", "node", "(I)Ljava/lang/Object;", "groupSize", "group", "slotSize", "groupKey", "hasObjectKey", "groupObjectKey", "groupAux", "hasMark", "containsMark", "groupGet", "(II)Ljava/lang/Object;", "next", "()Ljava/lang/Object;", "", "beginEmpty", "()V", "endEmpty", "close", "startGroup", "startNode", "skipGroup", "()I", "skipToGroupEnd", "reposition", "(I)V", "restoreParent", "endGroup", "", "Landroidx/compose/runtime/KeyInfo;", "extractKeys", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "Landroidx/compose/runtime/Anchor;", "anchor", "(I)Landroidx/compose/runtime/Anchor;", "", "([II)Ljava/lang/Object;", "aux", "objectKey", "Landroidx/compose/runtime/SlotTable;", "getTable$runtime", "()Landroidx/compose/runtime/SlotTable;", "groups", "[I", "groupsSize", "I", "", "slots", "[Ljava/lang/Object;", "slotsSize", "Ljava/util/HashMap;", "Landroidx/compose/runtime/GroupSourceInformation;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "Ljava/util/HashMap;", "value", "closed", "Z", "getClosed", "()Z", "currentGroup", "getCurrentGroup", "setCurrentGroup", "currentEnd", "getCurrentEnd", "getParent", "Landroidx/compose/runtime/IntStack;", "currentSlotStack", "Landroidx/compose/runtime/IntStack;", "emptyCount", "currentSlot", "currentSlotEnd", "hadNext", "getHadNext", "getSize", "size", "getSlot", "slot", "isGroupEnd", "getInEmpty", "inEmpty", "getGroupSize", "getGroupEnd", "groupEnd", "getGroupKey", "getGroupSlotIndex", "groupSlotIndex", "getHasObjectKey", "getGroupObjectKey", "getGroupAux", "getParentNodes", "parentNodes", "getRemainingSlots", "remainingSlots", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SlotReader {
    private boolean closed;
    private int currentEnd;
    private int currentGroup;
    private int currentSlot;
    private int currentSlotEnd;

    @NotNull
    private final IntStack currentSlotStack;
    private int emptyCount;

    @NotNull
    private final int[] groups;
    private final int groupsSize;
    private boolean hadNext;
    private int parent;

    @NotNull
    private Object[] slots;
    private final int slotsSize;
    private HashMap<Anchor, GroupSourceInformation> sourceInformationMap;

    @NotNull
    private final SlotTable table;

    public SlotReader(@NotNull SlotTable slotTable) {
        this.table = slotTable;
        this.groups = slotTable.getGroups();
        int groupsSize = slotTable.getGroupsSize();
        this.groupsSize = groupsSize;
        this.slots = slotTable.getSlots();
        this.slotsSize = slotTable.getSlotsSize();
        this.currentEnd = groupsSize;
        this.parent = -1;
        this.currentSlotStack = new IntStack();
    }

    private final Object aux(int[] iArr, int i) {
        return (iArr[(i * 5) + 1] & 268435456) != 0 ? this.slots[SlotTableKt.auxIndex(iArr, i)] : Composer.INSTANCE.getEmpty();
    }

    private final Object objectKey(int[] iArr, int i) {
        if ((iArr[(i * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0) {
            return this.slots[SlotTableKt.objectKeyIndex(iArr, i)];
        }
        return null;
    }

    @NotNull
    public final Anchor anchor(int index) {
        ArrayList<Anchor> anchors$runtime = this.table.getAnchors$runtime();
        int iSearch = SlotTableKt.search(anchors$runtime, index, this.groupsSize);
        if (iSearch >= 0) {
            return anchors$runtime.get(iSearch);
        }
        Anchor anchor = new Anchor(index);
        anchors$runtime.add(-(iSearch + 1), anchor);
        return anchor;
    }

    public final void beginEmpty() {
        this.emptyCount++;
    }

    public final void close() {
        this.closed = true;
        this.table.close$runtime(this, this.sourceInformationMap);
        this.slots = new Object[0];
    }

    public final boolean containsMark(int index) {
        return (this.groups[(index * 5) + 1] & 67108864) != 0;
    }

    public final void endEmpty() {
        if (!(this.emptyCount > 0)) {
            PreconditionsKt.throwIllegalArgumentException("Unbalanced begin/end empty");
        }
        this.emptyCount--;
    }

    public final void endGroup() {
        if (this.emptyCount == 0) {
            if (!(this.currentGroup == this.currentEnd)) {
                ComposerKt.composeImmediateRuntimeError("endGroup() not called at the end of a group");
            }
            int[] iArr = this.groups;
            int i = iArr[(this.parent * 5) + 2];
            this.parent = i;
            this.currentEnd = i < 0 ? this.groupsSize : SlotTableKt.groupSize(iArr, i) + i;
            int iPop = this.currentSlotStack.pop();
            if (iPop < 0) {
                this.currentSlot = 0;
                this.currentSlotEnd = 0;
            } else {
                this.currentSlot = iPop;
                this.currentSlotEnd = i >= this.groupsSize - 1 ? this.slotsSize : this.groups[((i + 1) * 5) + 4];
            }
        }
    }

    @NotNull
    public final List<KeyInfo> extractKeys() {
        ArrayList arrayList = new ArrayList();
        if (this.emptyCount <= 0) {
            int i = 0;
            int iGroupSize = this.currentGroup;
            while (true) {
                int i2 = i;
                if (iGroupSize >= this.currentEnd) {
                    break;
                }
                int[] iArr = this.groups;
                int i3 = iGroupSize * 5;
                int i5 = iArr[i3];
                Object objObjectKey = objectKey(iArr, iGroupSize);
                int i6 = 1;
                int i21 = this.groups[i3 + 1];
                if ((1073741824 & i21) == 0) {
                    i6 = i21 & 67108863;
                }
                i = i2 + 1;
                arrayList.add(new KeyInfo(i5, objObjectKey, iGroupSize, i6, i2));
                iGroupSize += SlotTableKt.groupSize(this.groups, iGroupSize);
            }
        }
        return arrayList;
    }

    public final boolean getClosed() {
        return this.closed;
    }

    public final int getCurrentEnd() {
        return this.currentEnd;
    }

    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final Object getGroupAux() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return aux(this.groups, i);
        }
        return 0;
    }

    public final int getGroupEnd() {
        return this.currentEnd;
    }

    public final int getGroupKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return this.groups[i * 5];
        }
        return 0;
    }

    public final Object getGroupObjectKey() {
        int i = this.currentGroup;
        if (i < this.currentEnd) {
            return objectKey(this.groups, i);
        }
        return null;
    }

    public final int getGroupSize() {
        return SlotTableKt.groupSize(this.groups, this.currentGroup);
    }

    public final int getGroupSlotIndex() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    public final boolean getHadNext() {
        return this.hadNext;
    }

    public final boolean getHasObjectKey() {
        int i = this.currentGroup;
        return i < this.currentEnd && (this.groups[(i * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean getInEmpty() {
        return this.emptyCount > 0;
    }

    public final int getParent() {
        return this.parent;
    }

    public final int getParentNodes() {
        int i = this.parent;
        if (i >= 0) {
            return this.groups[(i * 5) + 1] & 67108863;
        }
        return 0;
    }

    public final int getRemainingSlots() {
        return this.currentSlotEnd - this.currentSlot;
    }

    /* JADX INFO: renamed from: getSize, reason: from getter */
    public final int getGroupsSize() {
        return this.groupsSize;
    }

    public final int getSlot() {
        return this.currentSlot - SlotTableKt.slotAnchor(this.groups, this.parent);
    }

    @NotNull
    /* JADX INFO: renamed from: getTable$runtime, reason: from getter */
    public final SlotTable getTable() {
        return this.table;
    }

    public final Object groupAux(int index) {
        return aux(this.groups, index);
    }

    public final Object groupGet(int index) {
        return groupGet(this.currentGroup, index);
    }

    public final int groupKey(int index) {
        return this.groups[index * 5];
    }

    public final Object groupObjectKey(int index) {
        return objectKey(this.groups, index);
    }

    public final int groupSize(int index) {
        return SlotTableKt.groupSize(this.groups, index);
    }

    public final boolean hasMark(int index) {
        return (this.groups[(index * 5) + 1] & 134217728) != 0;
    }

    public final boolean hasObjectKey(int index) {
        return (this.groups[(index * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final boolean isGroupEnd() {
        return getInEmpty() || this.currentGroup == this.currentEnd;
    }

    public final boolean isNode() {
        return (this.groups[(this.currentGroup * 5) + 1] & 1073741824) != 0;
    }

    public final Object next() {
        int i;
        if (this.emptyCount > 0 || (i = this.currentSlot) >= this.currentSlotEnd) {
            this.hadNext = false;
            return Composer.INSTANCE.getEmpty();
        }
        this.hadNext = true;
        Object[] objArr = this.slots;
        this.currentSlot = i + 1;
        return objArr[i];
    }

    public final Object node(int index) {
        int[] iArr = this.groups;
        if ((iArr[(index * 5) + 1] & 1073741824) != 0) {
            return node(iArr, index);
        }
        return null;
    }

    public final int nodeCount(int index) {
        return this.groups[(index * 5) + 1] & 67108863;
    }

    public final int parent(int index) {
        return this.groups[(index * 5) + 2];
    }

    public final void reposition(int index) {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot reposition while in an empty region");
        }
        this.currentGroup = index;
        int i = this.groupsSize;
        int i2 = index < i ? this.groups[(index * 5) + 2] : -1;
        if (i2 != this.parent) {
            this.parent = i2;
            if (i2 < 0) {
                this.currentEnd = i;
            } else {
                this.currentEnd = SlotTableKt.groupSize(this.groups, i2) + i2;
            }
            this.currentSlot = 0;
            this.currentSlotEnd = 0;
        }
    }

    public final void restoreParent(int index) {
        int iGroupSize = SlotTableKt.groupSize(this.groups, index) + index;
        int i = this.currentGroup;
        if (!(i >= index && i <= iGroupSize)) {
            ComposerKt.composeImmediateRuntimeError("Index " + index + " is not a parent of " + i);
        }
        this.parent = index;
        this.currentEnd = iGroupSize;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int skipGroup() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip while in an empty region");
        }
        int[] iArr = this.groups;
        int i = this.currentGroup;
        int i2 = (iArr[(i * 5) + 1] & 1073741824) == 0 ? iArr[(i * 5) + 1] & 67108863 : 1;
        this.currentGroup = SlotTableKt.groupSize(iArr, i) + i;
        return i2;
    }

    public final void skipToGroupEnd() {
        if (!(this.emptyCount == 0)) {
            ComposerKt.composeImmediateRuntimeError("Cannot skip the enclosing group while in an empty region");
        }
        this.currentGroup = this.currentEnd;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
    }

    public final int slotSize(int group) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i = group + 1;
        return (i < this.groupsSize ? this.groups[(i * 5) + 4] : this.slotsSize) - iSlotAnchor;
    }

    public final void startGroup() {
        if (this.emptyCount <= 0) {
            int i = this.parent;
            int i2 = this.currentGroup;
            if (!(this.groups[(i2 * 5) + 2] == i)) {
                PreconditionsKt.throwIllegalArgumentException("Invalid slot table detected");
            }
            HashMap<Anchor, GroupSourceInformation> map = this.sourceInformationMap;
            if (map != null) {
                map.get(anchor(i));
            }
            IntStack intStack = this.currentSlotStack;
            int i3 = this.currentSlot;
            int i5 = this.currentSlotEnd;
            if (i3 == 0 && i5 == 0) {
                intStack.push(-1);
            } else {
                intStack.push(i3);
            }
            this.parent = i2;
            this.currentEnd = SlotTableKt.groupSize(this.groups, i2) + i2;
            int i6 = i2 + 1;
            this.currentGroup = i6;
            this.currentSlot = SlotTableKt.slotAnchor(this.groups, i2);
            this.currentSlotEnd = i2 >= this.groupsSize - 1 ? this.slotsSize : this.groups[(i6 * 5) + 4];
        }
    }

    public final void startNode() {
        if (this.emptyCount <= 0) {
            if (!((this.groups[(this.currentGroup * 5) + 1] & 1073741824) != 0)) {
                PreconditionsKt.throwIllegalArgumentException("Expected a node group");
            }
            startGroup();
        }
    }

    @NotNull
    public String toString() {
        StringBuilder sb6 = new StringBuilder("SlotReader(current=");
        sb6.append(this.currentGroup);
        sb6.append(", key=");
        sb6.append(getGroupKey());
        sb6.append(", parent=");
        sb6.append(this.parent);
        sb6.append(", end=");
        return j6.a.t(sb6, this.currentEnd, CoreConstants.RIGHT_PARENTHESIS_CHAR);
    }

    public final Object groupGet(int group, int index) {
        int iSlotAnchor = SlotTableKt.slotAnchor(this.groups, group);
        int i = group + 1;
        int i2 = iSlotAnchor + index;
        return i2 < (i < this.groupsSize ? this.groups[(i * 5) + 4] : this.slotsSize) ? this.slots[i2] : Composer.INSTANCE.getEmpty();
    }

    public final boolean isNode(int index) {
        return (this.groups[(index * 5) + 1] & 1073741824) != 0;
    }

    private final Object node(int[] iArr, int i) {
        int i2 = i * 5;
        if ((iArr[i2 + 1] & 1073741824) != 0) {
            return this.slots[iArr[i2 + 4]];
        }
        return Composer.INSTANCE.getEmpty();
    }
}
