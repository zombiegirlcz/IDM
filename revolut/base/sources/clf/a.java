package clf;

import akd.s;
import chc.c0;
import cmf.p;
import com.revolut.feature.slot_manager.api.model.SlotContext;
import elf.s0;
import gld.f0;
import k71.i;
import klf.f2;
import klf.m1;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import mkd.d;
import vkm.q;
import yji.n;
import zhm.u;
import zhm.y0;

/* JADX INFO: loaded from: classes8.dex */
public final class a extends n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final f2 f24989l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final d f24990m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final i f24991n;
    public final m1 o;

    public a(f2 slotDataSource, d slotManagerFeedExtension, i transactionDescriptor, m1 juniorDataSource) {
        Intrinsics.checkNotNullParameter(slotDataSource, "slotDataSource");
        Intrinsics.checkNotNullParameter(slotManagerFeedExtension, "slotManagerFeedExtension");
        Intrinsics.checkNotNullParameter(transactionDescriptor, "transactionDescriptor");
        Intrinsics.checkNotNullParameter(juniorDataSource, "juniorDataSource");
        this.f24989l = slotDataSource;
        this.f24990m = slotManagerFeedExtension;
        this.f24991n = transactionDescriptor;
        this.o = juniorDataSource;
    }

    @Override // yji.n
    public final void D2() {
        ((f0) this.f24990m).c3(new mkd.a(new SlotContext(s.TRANSACTION_DETAILS, y0.b(this.f24991n.a()))));
    }

    public final p Z2() {
        return new p(q.Q(this.o.a(), new bw4.s(null, this, 17)), new c0(23), u.c(this), "slotManager");
    }

    @Override // elf.s0
    public final Object c(Object obj2, String listId, Continuation continuation) {
        f0 f0Var = (f0) this.f24990m;
        f0Var.getClass();
        Intrinsics.checkNotNullParameter(listId, "listId");
        return Boolean.valueOf(f0Var.f144638l.a(listId, null));
    }
}
