package ud3;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit.delegates.CounterTextDelegate;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.data.model.Data;
import ip0.gu;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class i0 implements jki.p {

    @NotNull
    public static final g0 Companion = new g0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.g f279112a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wd3.b f279113b;

    public i0(thf.g transactionItemMapper, cd3.b cashbackSourceItemProvider, wd3.b revPointsBannerItemMapper) {
        Intrinsics.checkNotNullParameter(transactionItemMapper, "transactionItemMapper");
        Intrinsics.checkNotNullParameter(cashbackSourceItemProvider, "cashbackSourceItemProvider");
        Intrinsics.checkNotNullParameter(revPointsBannerItemMapper, "revPointsBannerItemMapper");
        this.f279112a = transactionItemMapper;
        this.f279113b = revPointsBannerItemMapper;
    }

    public static aim.e b(String str, String str2) {
        aim.e eVarB = zhm.u.b();
        eVarB.add(new gu(str, 0, R$attr.uikit_dp8, 26));
        List listJ = nkm.y.J(nkm.y.H(nkm.y.x(nkm.t.g(0, h0.f), new te8.a(str2, 25)), 3));
        yp0.b.k(listJ, 0, 0, 0, 0, 31);
        eVarB.addAll(listJ);
        return zhm.u.a(eVarB);
    }

    @Override // jki.p
    public final jki.m a(jki.i iVar) {
        i domainState = (i) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        Data data = domainState.f279103a;
        Data data2 = domainState.e;
        Data data3 = domainState.d;
        List list = (List) iii.c.f(t1.y(data, domainState.d, domainState.e, domainState.f279107h, domainState.k, domainState.i, domainState.f279109l), new m(this, 5), new f0(2), new u3b.h(this, 4));
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        qv0.i iVar2 = !domainState.f279111n ? null : (qv0.i) iii.c.f(t1.t(domainState.f279109l, domainState.f279110m), new wd3.a(0), new w6b.a(22), new w2a.o(this.f279113b, 13));
        if (iVar2 != null) {
            yp0.b.l(iVar2, 0, 0, 0, 0, null, false, 63);
        } else {
            iVar2 = null;
        }
        int iIntValue = ((Number) iii.c.f(data, new m(3), new f0(4), new u3b.h(5))).intValue();
        CounterTextDelegate.Model model = new CounterTextDelegate.Model("ID_TOTAL_CASHBACK", new CompositeClause(zhm.d0.E0((List) iii.c.f(domainState.f, new m(8), new f0(6), new u3b.h(7)), zhm.u.c(new TextLocalisedClause(iIntValue, null, null, 14))), null, null, null, 14), (CounterTextDelegate.c) iii.c.f(data, new m(7), new f0(5), new u3b.h(6)), null, !r3.isEmpty(), null, null, 0, 0, 0, 0, 2024);
        yp0.b.l(model, 0, R$attr.uikit_dp16, 0, 0, null, false, 61);
        return new l(i2b.a.o(i2b.a.o(i2b.a.o(i2b.a.o(i2b.a.o(i2b.a.r(iVar2, model), (List) iii.c.f(domainState.f279104b, new m(this, 4), new f0(1), new tch.c(this, 28))), list), !list.isEmpty() ? (List) iii.c.f(t1.t(data3, data2), new m(6), new f0(3), new tch.c(29, domainState, false, this)) : zhm.f0.f322471a), (List) iii.c.f(t1.x(domainState.f279103a, domainState.f279105c, domainState.d, domainState.e, domainState.f279106g, domainState.i), new m(this, 9), new f0(0), new u3b.h(this, 3))), list.isEmpty() ? (List) iii.c.f(t1.t(data3, data2), new m(6), new f0(3), new tch.c(29, domainState, false, this)) : zhm.f0.f322471a));
    }
}
