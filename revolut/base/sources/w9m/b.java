package w9m;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListLayoutInfo;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.Iterator;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import nkm.y;
import zhm.d0;

/* JADX INFO: loaded from: classes23.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LazyListState f295763a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function2 f295764b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableState f295765c;
    public final State d;

    public b(LazyListState lazyListState, Function2 snapOffsetForItem) {
        Intrinsics.checkNotNullParameter(lazyListState, "lazyListState");
        Intrinsics.checkNotNullParameter(snapOffsetForItem, "snapOffsetForItem");
        this.f295763a = lazyListState;
        this.f295764b = snapOffsetForItem;
        this.f295765c = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(0, null, 2, null);
        this.d = SnapshotStateKt.derivedStateOf(new h7.h(this, 3));
    }

    public final boolean a() {
        LazyListState lazyListState = this.f295763a;
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) d0.o0(lazyListState.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo == null) {
            return false;
        }
        return lazyListItemInfo.getIndex() < lazyListState.getLayoutInfo().getTotalItemsCount() - 1 || lazyListItemInfo.getOffset() + lazyListItemInfo.getSize() > f();
    }

    public final boolean b() {
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) d0.d0(this.f295763a.getLayoutInfo().getVisibleItemsInfo());
        if (lazyListItemInfo == null) {
            return false;
        }
        return lazyListItemInfo.getIndex() > 0 || lazyListItemInfo.getOffset() < 0;
    }

    public final int c(int i) {
        Object objInvoke;
        int iC;
        int iIntValue;
        nkm.d0 d0VarX = y.x(d0.Q(this.f295763a.getLayoutInfo().getVisibleItemsInfo()), a.f);
        Iterator it8 = d0VarX.f216835a.iterator();
        while (true) {
            if (!it8.hasNext()) {
                objInvoke = null;
                break;
            }
            objInvoke = d0VarX.f216836b.invoke(it8.next());
            if (((c) objInvoke).f295766a.getIndex() == i) {
                break;
            }
        }
        c cVar = (c) objInvoke;
        Function2 function2 = this.f295764b;
        if (cVar != null) {
            iC = cVar.f295766a.getOffset();
            iIntValue = ((Number) function2.invoke(this, cVar)).intValue();
        } else {
            c cVarE = e();
            if (cVarE == null) {
                return 0;
            }
            iC = rim.d.c((i - r2.getIndex()) * d()) + cVarE.f295766a.getOffset();
            iIntValue = ((Number) function2.invoke(this, cVarE)).intValue();
        }
        return iC - iIntValue;
    }

    public final float d() {
        Object next;
        LazyListState lazyListState = this.f295763a;
        LazyListLayoutInfo layoutInfo = lazyListState.getLayoutInfo();
        if (layoutInfo.getVisibleItemsInfo().isEmpty()) {
            return -1.0f;
        }
        Iterator<T> it8 = layoutInfo.getVisibleItemsInfo().iterator();
        Object next2 = null;
        if (it8.hasNext()) {
            next = it8.next();
            if (it8.hasNext()) {
                int offset = ((LazyListItemInfo) next).getOffset();
                do {
                    Object next3 = it8.next();
                    int offset2 = ((LazyListItemInfo) next3).getOffset();
                    if (offset > offset2) {
                        next = next3;
                        offset = offset2;
                    }
                } while (it8.hasNext());
            }
        } else {
            next = null;
        }
        LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
        if (lazyListItemInfo == null) {
            return -1.0f;
        }
        Iterator<T> it9 = layoutInfo.getVisibleItemsInfo().iterator();
        if (it9.hasNext()) {
            next2 = it9.next();
            if (it9.hasNext()) {
                LazyListItemInfo lazyListItemInfo2 = (LazyListItemInfo) next2;
                int offset3 = lazyListItemInfo2.getOffset() + lazyListItemInfo2.getSize();
                do {
                    Object next4 = it9.next();
                    LazyListItemInfo lazyListItemInfo3 = (LazyListItemInfo) next4;
                    int offset4 = lazyListItemInfo3.getOffset() + lazyListItemInfo3.getSize();
                    if (offset3 < offset4) {
                        next2 = next4;
                        offset3 = offset4;
                    }
                } while (it9.hasNext());
            }
        }
        LazyListItemInfo lazyListItemInfo4 = (LazyListItemInfo) next2;
        if (lazyListItemInfo4 == null) {
            return -1.0f;
        }
        if (Math.max(lazyListItemInfo.getOffset() + lazyListItemInfo.getSize(), lazyListItemInfo4.getOffset() + lazyListItemInfo4.getSize()) - Math.min(lazyListItemInfo.getOffset(), lazyListItemInfo4.getOffset()) == 0) {
            return -1.0f;
        }
        LazyListLayoutInfo layoutInfo2 = lazyListState.getLayoutInfo();
        int offset5 = 0;
        if (layoutInfo2.getVisibleItemsInfo().size() >= 2) {
            LazyListItemInfo lazyListItemInfo5 = layoutInfo2.getVisibleItemsInfo().get(0);
            offset5 = layoutInfo2.getVisibleItemsInfo().get(1).getOffset() - (lazyListItemInfo5.getSize() + lazyListItemInfo5.getOffset());
        }
        return (r4 + offset5) / layoutInfo.getVisibleItemsInfo().size();
    }

    public final c e() {
        return (c) this.d.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int f() {
        return this.f295763a.getLayoutInfo().getViewportEndOffset() - ((Number) this.f295765c.getValue()).intValue();
    }
}
