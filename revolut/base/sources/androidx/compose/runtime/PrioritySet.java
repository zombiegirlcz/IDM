package androidx.compose.runtime;

import androidx.collection.MutableIntList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0014\u001a\u00020\u0006¢\u0006\u0004\b\u0013\u0010\u0011\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Landroidx/compose/runtime/PrioritySet;", "", "Landroidx/collection/MutableIntList;", "list", "constructor-impl", "(Landroidx/collection/MutableIntList;)Landroidx/collection/MutableIntList;", "", "value", "", "add-impl", "(Landroidx/collection/MutableIntList;I)V", "add", "", "isNotEmpty-impl", "(Landroidx/collection/MutableIntList;)Z", "isNotEmpty", "peek-impl", "(Landroidx/collection/MutableIntList;)I", "peek", "takeMax-impl", "takeMax", "runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class PrioritySet {
    /* JADX INFO: renamed from: add-impl, reason: not valid java name */
    public static final void m1644addimpl(MutableIntList mutableIntList, int i) {
        if (mutableIntList._size == 0 || !(mutableIntList.get(0) == i || mutableIntList.get(mutableIntList._size - 1) == i)) {
            int i2 = mutableIntList._size;
            mutableIntList.add(i);
            while (i2 > 0) {
                int i3 = ((i2 + 1) >>> 1) - 1;
                int i5 = mutableIntList.get(i3);
                if (i <= i5) {
                    break;
                }
                mutableIntList.set(i2, i5);
                i2 = i3;
            }
            mutableIntList.set(i2, i);
        }
    }

    @NotNull
    /* JADX INFO: renamed from: constructor-impl, reason: not valid java name */
    public static MutableIntList m1645constructorimpl(@NotNull MutableIntList mutableIntList) {
        return mutableIntList;
    }

    /* JADX INFO: renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ MutableIntList m1646constructorimpl$default(MutableIntList mutableIntList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        int i2 = 1;
        if ((i & 1) != 0) {
            mutableIntList = new MutableIntList(0, i2, null);
        }
        return m1645constructorimpl(mutableIntList);
    }

    /* JADX INFO: renamed from: isNotEmpty-impl, reason: not valid java name */
    public static final boolean m1647isNotEmptyimpl(MutableIntList mutableIntList) {
        return mutableIntList._size != 0;
    }

    /* JADX INFO: renamed from: peek-impl, reason: not valid java name */
    public static final int m1648peekimpl(MutableIntList mutableIntList) {
        return mutableIntList.first();
    }

    /* JADX INFO: renamed from: takeMax-impl, reason: not valid java name */
    public static final int m1649takeMaximpl(MutableIntList mutableIntList) {
        int i;
        int i2 = mutableIntList._size;
        int i3 = mutableIntList.get(0);
        while (mutableIntList._size != 0 && mutableIntList.get(0) == i3) {
            mutableIntList.set(0, mutableIntList.last());
            mutableIntList.removeAt(mutableIntList._size - 1);
            int i5 = mutableIntList._size;
            int i6 = i5 >>> 1;
            int i21 = 0;
            while (i21 < i6) {
                int i22 = mutableIntList.get(i21);
                int i32 = (i21 + 1) * 2;
                int i33 = i32 - 1;
                int i43 = mutableIntList.get(i33);
                if (i32 >= i5 || (i = mutableIntList.get(i32)) <= i43) {
                    if (i43 > i22) {
                        mutableIntList.set(i21, i43);
                        mutableIntList.set(i33, i22);
                        i21 = i33;
                    }
                } else if (i > i22) {
                    mutableIntList.set(i21, i);
                    mutableIntList.set(i32, i22);
                    i21 = i32;
                }
            }
        }
        return i3;
    }
}
