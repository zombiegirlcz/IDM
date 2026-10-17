package rtl;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.trading.orders.ui.invest.placement.account.selector.screen.InvestAccountSelectorScreenContract$InputData;
import ip0.gu;
import ip0.nb0;
import ip0.pb0;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;
import z0h.q1;
import zhm.d0;

/* JADX INFO: loaded from: classes12.dex */
public final class x implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final stl.c f257342a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final stl.d f257343b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final stl.b f257344c;
    public final InvestAccountSelectorScreenContract$InputData d;
    public final q1 e;
    public final List f;

    public x(stl.c investmentAccountsMapper, stl.d mainAccountsMapper, stl.b commodityAccountsMapper, InvestAccountSelectorScreenContract$InputData inputData, q1 wealthDisclaimersMapper) {
        Intrinsics.checkNotNullParameter(investmentAccountsMapper, "investmentAccountsMapper");
        Intrinsics.checkNotNullParameter(mainAccountsMapper, "mainAccountsMapper");
        Intrinsics.checkNotNullParameter(commodityAccountsMapper, "commodityAccountsMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(wealthDisclaimersMapper, "wealthDisclaimersMapper");
        this.f257342a = investmentAccountsMapper;
        this.f257343b = mainAccountsMapper;
        this.f257344c = commodityAccountsMapper;
        this.d = inputData;
        this.e = wealthDisclaimersMapper;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(yp0.b.h(zhm.u.c(nb0.b(pb0.Companion, "loading_investment_account_item", false, 0, false, 30)), new gu("loading_investment_account_header_item", 0, 0, 30), null, 0, 126));
        ArrayList arrayList2 = new ArrayList(3);
        for (int i = 0; i < 3; i++) {
            arrayList2.add(nb0.b(pb0.Companion, a0.d.n("loading_main_accounts_item_", i), false, 0, false, 30));
        }
        arrayList.addAll(yp0.b.h(arrayList2, new gu("loading_main_accounts_header_item", 0, 0, 30), null, R$attr.uikit_dp0, LDSFile.EF_DG4_TAG));
        this.f = d0.d1(arrayList);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        final k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        final int i = 0;
        List list = (List) iii.c.f(t1.v(domainState.f257326b, domainState.f257327c, domainState.d, domainState.e), new rrd.l(this, 5), new rnd.d0(27), new Function3(this) { // from class: rtl.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f257340b;

            {
                this.f257340b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:135:0x045f  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0227  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x02f7  */
            /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v17, types: [java.util.List] */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r51, java.lang.Object r52, java.lang.Object r53) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1204
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: rtl.w.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        final int i2 = 1;
        List list2 = (List) iii.c.f(domainState.f257328g, new rsl.c(17), new rnd.d0(28), new Function3(this) { // from class: rtl.w

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ x f257340b;

            {
                this.f257340b = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:135:0x045f  */
            /* JADX WARN: Removed duplicated region for block: B:59:0x0227  */
            /* JADX WARN: Removed duplicated region for block: B:87:0x02f7  */
            /* JADX WARN: Type inference failed for: r4v15, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v16, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r4v17, types: [java.util.List] */
            @Override // kotlin.jvm.functions.Function3
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invoke(java.lang.Object r51, java.lang.Object r52, java.lang.Object r53) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 1204
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: rtl.w.invoke(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
            }
        });
        int i3 = R$attr.uikit_dp0;
        yp0.b.q(list2, i3, i3, 0, 0, 12);
        return new r(i2b.a.o(list, list2));
    }
}
