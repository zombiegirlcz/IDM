package jsl;

import com.google.crypto.tink.shaded.protobuf.t1;
import com.revolut.data.model.Data;
import ip0.s7;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class z0 implements d0 {

    @NotNull
    public static final y0 Companion = new y0();
    public static final ArrayList f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kbb.c f178258a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lsl.l f178259b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nsl.s f178260c;
    public final osl.o d;
    public final rsl.s e;

    static {
        List listC = zhm.u.c(new s7("list_id_invest_order_details_loading_1", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        List listK = zhm.v.k(new s7("list_id_invest_order_details_loading_2", 0, 0, 0, 0, false, null, 126), new s7("list_id_invest_order_details_loading_3", 0, 0, 0, 0, false, null, 126), new s7("list_id_invest_order_details_loading_4", 0, 0, 0, 0, false, null, 126), new s7("list_id_invest_order_details_loading_5", 0, 0, 0, 0, false, null, 126));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        f = zhm.w.u(zhm.v.k(listC, listK));
    }

    public z0(kbb.c investSecuritiesOrderStateMapperDelegate, lsl.l investCommoditiesOrderStateMapperDelegate, nsl.s investFundOrderStateMapperDelegate, osl.o investMutualFundOrderStateMapperDelegate, rsl.s investNoteOrderStateMapperDelegate) {
        Intrinsics.checkNotNullParameter(investSecuritiesOrderStateMapperDelegate, "investSecuritiesOrderStateMapperDelegate");
        Intrinsics.checkNotNullParameter(investCommoditiesOrderStateMapperDelegate, "investCommoditiesOrderStateMapperDelegate");
        Intrinsics.checkNotNullParameter(investFundOrderStateMapperDelegate, "investFundOrderStateMapperDelegate");
        Intrinsics.checkNotNullParameter(investMutualFundOrderStateMapperDelegate, "investMutualFundOrderStateMapperDelegate");
        Intrinsics.checkNotNullParameter(investNoteOrderStateMapperDelegate, "investNoteOrderStateMapperDelegate");
        this.f178258a = investSecuritiesOrderStateMapperDelegate;
        this.f178259b = investCommoditiesOrderStateMapperDelegate;
        this.f178260c = investFundOrderStateMapperDelegate;
        this.d = investMutualFundOrderStateMapperDelegate;
        this.e = investNoteOrderStateMapperDelegate;
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        j0 j0Var;
        p domainState = (p) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        t tVar = domainState.f178229a;
        List list = domainState.f178230b;
        boolean z = tVar instanceof r;
        h0 h0Var = h0.f178214a;
        if (z) {
            return new j0(h0Var, zhm.f0.f322471a);
        }
        if (tVar instanceof s) {
            return new j0(g0.f178213a, f);
        }
        Data dataW = null;
        if (tVar instanceof q) {
            return new j0(h0Var, iii.c.b(null, null, 6, false));
        }
        if (tVar instanceof a0) {
            a0 domainState2 = (a0) tVar;
            Intrinsics.checkNotNullParameter(domainState2, "domainState");
            Data data = domainState2.f178197b;
            Data data2 = domainState2.f178198c;
            Data data3 = domainState2.d;
            Data data4 = domainState2.e;
            Data data5 = domainState2.i;
            Data data6 = domainState2.k;
            if (data != null && data2 != null && data3 != null && data4 != null && data5 != null && data6 != null) {
                dataW = t1.x(data, data2, data3, data4, data5, data6);
            }
            if (dataW != null) {
                kbb.c cVar = this.f178258a;
                j0 j0Var2 = (j0) iii.c.f(dataW, new psl.a0(cVar, domainState2, 0), new kp0.m(cVar, domainState2, 27), new lk7.p(cVar, 18, domainState2, list));
                if (j0Var2 != null) {
                    return j0Var2;
                }
            }
            return new j0(h0Var, zhm.f0.f322471a);
        }
        if (tVar instanceof v) {
            v domainState3 = (v) tVar;
            Intrinsics.checkNotNullParameter(domainState3, "domainState");
            Data data7 = domainState3.f178243a;
            Data data8 = domainState3.f178244b;
            Data data9 = domainState3.f178245c;
            if (data7 != null && data8 != null && data9 != null) {
                dataW = t1.u(data7, data8, data9);
            }
            return (dataW == null || (j0Var = (j0) iii.c.f(dataW, new lsl.b(1), new lnk.o(12), new koe.y(this.f178259b, domainState3, 23))) == null) ? new j0(h0Var, zhm.f0.f322471a) : j0Var;
        }
        if (tVar instanceof w) {
            w domainState4 = (w) tVar;
            Intrinsics.checkNotNullParameter(domainState4, "domainState");
            Data data10 = domainState4.f178246a;
            Data data11 = domainState4.f178248c;
            Data data12 = domainState4.f178247b;
            Data data13 = domainState4.d;
            Data data14 = domainState4.f;
            Data data15 = domainState4.f178249g;
            if (data10 != null && data11 != null && data12 != null && data13 != null && data14 != null && data15 != null) {
                dataW = t1.x(data10, data11, data12, data13, data14, data15);
            }
            if (dataW != null) {
                nsl.s sVar = this.f178260c;
                j0 j0Var3 = (j0) iii.c.f(dataW, new nrb.c(sVar, 21), new nsl.d(2), new lk7.p(sVar, 7, domainState4, list));
                if (j0Var3 != null) {
                    return j0Var3;
                }
            }
            return new j0(h0Var, zhm.f0.f322471a);
        }
        if (tVar instanceof x) {
            x domainState5 = (x) tVar;
            Intrinsics.checkNotNullParameter(domainState5, "domainState");
            Data data16 = domainState5.f178251a;
            Data data17 = domainState5.f178252b;
            Data data18 = domainState5.f178253c;
            Data data19 = domainState5.e;
            Data data20 = domainState5.f;
            if (data16 != null && data17 != null && data18 != null && data19 != null && data20 != null) {
                dataW = t1.w(data16, data17, data18, data19, data20);
            }
            if (dataW != null) {
                osl.o oVar = this.d;
                j0 j0Var4 = (j0) iii.c.f(dataW, new os9.f(oVar), new oq3.e(19), new lk7.p(oVar, 14, domainState5, list));
                if (j0Var4 != null) {
                    return j0Var4;
                }
            }
            return new j0(h0Var, zhm.f0.f322471a);
        }
        if (!(tVar instanceof y)) {
            throw new NoWhenBranchMatchedException();
        }
        y domainState6 = (y) tVar;
        Intrinsics.checkNotNullParameter(domainState6, "domainState");
        Data data21 = domainState6.f178254a;
        Data data22 = domainState6.f178255b;
        Data data23 = domainState6.d;
        Data data24 = domainState6.f178257g;
        Data data25 = domainState6.f;
        if (data21 != null && data22 != null && data23 != null && data24 != null && data25 != null) {
            dataW = t1.w(data21, data22, data23, data24, data25);
        }
        if (dataW != null) {
            rsl.s sVar2 = this.e;
            j0 j0Var5 = (j0) iii.c.f(dataW, new rsl.p(sVar2, domainState6, 0), new qce.b(sVar2, domainState6, 12), new rsl.q(sVar2, domainState6, 0));
            if (j0Var5 != null) {
                return j0Var5;
            }
        }
        return new j0(h0Var, zhm.f0.f322471a);
    }
}
