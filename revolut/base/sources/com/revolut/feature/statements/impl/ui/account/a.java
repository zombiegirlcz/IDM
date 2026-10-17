package com.revolut.feature.statements.impl.ui.account;

import ael.u0;
import ang.f;
import cli.y;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.statements.api.models.StatementProductType;
import com.revolut.feature.statements.api.models.StatementsFormat;
import com.revolut.feature.statements.api.models.StatementsType;
import com.revolut.feature.statements.api.navigation.AccountStatementProduct;
import efm.r;
import ghk.a0;
import i0e.e;
import i0e.v;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import krl.m;
import mra.d;
import oki.h;
import org.jetbrains.annotations.NotNull;
import vkm.j2;
import wr1.s;
import wug.k;
import wyd.b;
import wyd.g;
import wyd.j;
import wyd.o;
import wyd.p;
import wyd.q;
import wyd.x;
import yji.l;
import zhm.d0;
import zhm.f0;
import zhm.h0;
import zhm.w;
import zhm.y0;
import zxd.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends h implements q {

    @NotNull
    public static final b Companion = new b();
    public final p o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f88286p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final e f88287q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final f f88288r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ij0.a f88289s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final vyd.a f88290t;
    public final n0e.b u;
    public final hk0.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final phm.a f88291w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final sf0.h f88292x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final y f88293y;
    public final com.revolut.kompot.navigable.vc.modal.a z;

    public a(o mapper, p input, c statementsInteractor, e periodSelector, f userInteractor, ij0.a coreNetworkConfiguration, vyd.a dialogModelConfigurationFactory, n0e.b statementsNaviCommandsFactory, hk0.a networkFileRepository, ehe.o currencyAccountPickerInteractor, sf0.h serverErrorParser) {
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(input, "input");
        Intrinsics.checkNotNullParameter(statementsInteractor, "statementsInteractor");
        Intrinsics.checkNotNullParameter(periodSelector, "periodSelector");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(coreNetworkConfiguration, "coreNetworkConfiguration");
        Intrinsics.checkNotNullParameter(dialogModelConfigurationFactory, "dialogModelConfigurationFactory");
        Intrinsics.checkNotNullParameter(statementsNaviCommandsFactory, "statementsNaviCommandsFactory");
        Intrinsics.checkNotNullParameter(networkFileRepository, "networkFileRepository");
        Intrinsics.checkNotNullParameter(currencyAccountPickerInteractor, "currencyAccountPickerInteractor");
        Intrinsics.checkNotNullParameter(serverErrorParser, "serverErrorParser");
        this.o = input;
        this.f88286p = statementsInteractor;
        this.f88287q = periodSelector;
        this.f88288r = userInteractor;
        this.f88289s = coreNetworkConfiguration;
        this.f88290t = dialogModelConfigurationFactory;
        this.u = statementsNaviCommandsFactory;
        this.v = networkFileRepository;
        this.f88291w = currencyAccountPickerInteractor;
        this.f88292x = serverErrorParser;
        this.f88293y = d.b(this, new x("TAB_ID_PDF", h0.f322473a, new v(f0.f322471a), null, wyd.v.f301264a), mapper, null, false, 12);
        this.z = hx7.e.a(this, new wtj.c(this, 20));
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.statements.impl.ui.account.a r11, java.lang.String r12, com.revolut.feature.statements.api.models.StatementsFormat r13, gim.c r14) {
        /*
            boolean r3 = r14 instanceof wyd.d
            if (r3 == 0) goto L14
            r3 = r14
            wyd.d r3 = (wyd.d) r3
            int r4 = r3.f301247w
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r3.f301247w = r4
        L12:
            r6 = r3
            goto L1a
        L14:
            wyd.d r3 = new wyd.d
            r3.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r1 = r6.u
            fim.a r7 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.f301247w
            r8 = 1
            if (r3 == 0) goto L31
            if (r3 != r8) goto L29
            yhm.o.b(r1)
            goto L85
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L31:
            yhm.o.b(r1)
            java.net.URL r1 = new java.net.URL
            r1.<init>(r12)
            java.lang.String r1 = r1.getHost()
            java.net.URL r3 = new java.net.URL
            ij0.a r4 = r11.f88289s
            java.lang.String r4 = r4.getBaseUrl()
            r3.<init>(r4)
            java.lang.String r3 = r3.getHost()
            boolean r3 = kotlin.jvm.internal.Intrinsics.f(r1, r3)
            int[] r1 = wyd.c.f301243a
            int r4 = r13.ordinal()
            r1 = r1[r4]
            r4 = 0
            if (r1 == r8) goto L8e
            r5 = 2
            if (r1 != r5) goto L88
            up4.h r9 = new up4.h
            r1 = 10
            r9.<init>(r1)
            o9a.v r10 = new o9a.v
            r1 = 17
            r10.<init>(r1)
            bw6.k r0 = new bw6.k
            r5 = 14
            r1 = r11
            r2 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f301247w = r8
            r1 = 0
            r5 = r6
            r6 = 1
            r4 = r0
            r3 = r9
            r2 = r10
            r0 = r11
            java.lang.Object r1 = n14.k.Q(r0, r1, r2, r3, r4, r5, r6)
            if (r1 != r7) goto L85
            return r7
        L85:
            nii.e r1 = (nii.e) r1
            goto L99
        L88:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L8e:
            nii.d r1 = new nii.d
            n0e.b r3 = r11.u
            com.revolut.retail.core.navigation.FeatureCommand r2 = r3.c(r4, r12)
            r1.<init>(r2, r4)
        L99:
            boolean r2 = r1 instanceof nii.d
            if (r2 == 0) goto Laa
            nii.d r1 = (nii.d) r1
            java.lang.Object r1 = r1.f216133a
            com.revolut.retail.core.navigation.NaviCommand r1 = (com.revolut.retail.core.navigation.NaviCommand) r1
            com.revolut.kompot.bridge.navigation.BridgeDestination r1 = zh9.u0.b(r1)
            r11.C1(r1)
        Laa:
            kotlin.Unit r0 = kotlin.Unit.f186387a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.statements.impl.ui.account.a.I2(com.revolut.feature.statements.impl.ui.account.a, java.lang.String, com.revolut.feature.statements.api.models.StatementsFormat, gim.c):java.lang.Object");
    }

    public static final a0 J2(a aVar, Set set, boolean z, String str) {
        io3.h aVar2;
        e eVar = aVar.f88287q;
        p pVar = aVar.o;
        AccountStatementProduct accountStatementProduct = pVar.f301258a;
        StatementPeriod statementPeriod = pVar.d;
        Set setB = y0.b(O2(accountStatementProduct));
        if (z) {
            aVar2 = new i0e.b(y0.b(StatementPeriodType.MONTH), statementPeriod, null, 4);
        } else {
            aVar2 = new i0e.a(statementPeriod == null ? StatementPeriodType.MONTH : StatementPeriodType.CUSTOM, statementPeriod);
        }
        return ((i0e.q) eVar).c3(setB, aVar2, set, str);
    }

    public static StatementsFormat K2(x xVar) throws Throwable {
        String str = xVar.f301265a;
        if (Intrinsics.f(str, "TAB_ID_PDF")) {
            return StatementsFormat.PDF;
        }
        if (Intrinsics.f(str, "TAB_ID_EXCEL")) {
            return StatementsFormat.EXCEL;
        }
        hx7.e.n(new IllegalArgumentException(j6.a.q("Unknown selected tab: ", xVar.f301265a)));
        return StatementsFormat.PDF;
    }

    public static Set L2(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (((AccountsStatementsContract$SelectableCurrency) obj2).f88285b) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((AccountsStatementsContract$SelectableCurrency) it8.next()).f88284a);
        }
        return d0.i1(arrayList2);
    }

    public static Set M2(Set set) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : set) {
            if (((AccountsStatementsContract$SelectableCurrency) obj2).f88285b) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
        Iterator it8 = arrayList.iterator();
        while (it8.hasNext()) {
            arrayList2.add(((AccountsStatementsContract$SelectableCurrency) it8.next()).f88284a.f306286a);
        }
        return d0.i1(arrayList2);
    }

    public static StatementProductType O2(AccountStatementProduct accountStatementProduct) {
        if (!(accountStatementProduct instanceof AccountStatementProduct.PersonalCurrent) && !(accountStatementProduct instanceof AccountStatementProduct.Teen)) {
            if (accountStatementProduct instanceof AccountStatementProduct.JointCurrent) {
                return StatementProductType.JOINT_CURRENT;
            }
            if (accountStatementProduct instanceof AccountStatementProduct.Pro) {
                return StatementProductType.PRO;
            }
            if (accountStatementProduct instanceof AccountStatementProduct.Commodities) {
                return StatementProductType.COMMODITIES;
            }
            if (accountStatementProduct instanceof AccountStatementProduct.Junior) {
                return StatementProductType.JUNIOR;
            }
            throw new NoWhenBranchMatchedException();
        }
        return StatementProductType.PERSONAL_CURRENT;
    }

    @Override // yji.l
    public final void I1() {
        String str;
        p pVar = this.o;
        AccountStatementProduct accountStatementProduct = pVar.f301258a;
        StatementProductType statementProductTypeO2 = O2(accountStatementProduct);
        Continuation continuation = null;
        if (accountStatementProduct instanceof AccountStatementProduct.Teen) {
            str = ((AccountStatementProduct.Teen) accountStatementProduct).f88239a;
        } else {
            if (!(accountStatementProduct instanceof AccountStatementProduct.PersonalCurrent) && !(accountStatementProduct instanceof AccountStatementProduct.JointCurrent) && !(accountStatementProduct instanceof AccountStatementProduct.Pro) && !(accountStatementProduct instanceof AccountStatementProduct.Commodities) && !(accountStatementProduct instanceof AccountStatementProduct.Junior)) {
                throw new NoWhenBranchMatchedException();
            }
            str = null;
        }
        l.a1(this, mo3.a.e(rd0.e.b(pd.b.r(((ryd.w) this.f88286p).g(str, y0.b(statementProductTypeO2)), new wtl.f(accountStatementProduct, 6, this, statementProductTypeO2))), new k(26), new k(27)), null, null, new wyd.h(this, continuation, 2), 3);
        r rVarX = this.f88288r.f(false).x();
        Intrinsics.checkNotNullExpressionValue(rVarX, "toObservable(...)");
        vkm.d dVarB = rd0.e.b(rVarX);
        j jVar = new kotlin.jvm.internal.h0() { // from class: wyd.j
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((x) obj2).f301266b;
            }
        };
        y yVar = this.f88293y;
        int i = 3;
        l.a1(this, vkm.q.Q(new t38.e(dVarB, 24, yVar.B(jVar), new g(this, null, 1)), new wf0.f0(i, this, str, continuation)), null, null, new wyd.h(this, continuation, i), 3);
        l.a1(this, new wyd.f(new t38.e(dVarB, 24, yVar.B(new kotlin.jvm.internal.h0() { // from class: wyd.k
            @Override // kotlin.jvm.internal.h0, wim.p
            public final Object get(Object obj2) {
                return ((x) obj2).f301266b;
            }
        }), new g(this, null, 0)), this, 0), null, null, new wyd.h(this, continuation, 0), 3);
        l.a1(this, ((i0e.q) this.f88287q).f157383p, null, null, new wyd.h(this, continuation, 1), 3);
        if (!pVar.f301260c || pVar.d == null) {
            return;
        }
        l2(new s(this, continuation, 12), new yi5.b(26));
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.z;
    }

    public final void N2() {
        String str;
        String id10;
        r rVarN;
        x xVar = (x) ((j2) this.f88293y.f22677a).getValue();
        StatementsFormat statementsFormatK2 = K2(xVar);
        Set set = xVar.f301266b;
        StatementPeriod statementPeriod = xVar.d;
        p pVar = this.o;
        AccountStatementProduct accountStatementProduct = pVar.f301258a;
        boolean z = accountStatementProduct instanceof AccountStatementProduct.Pro;
        c cVar = this.f88286p;
        if (z) {
            if (statementPeriod == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            LocalDate fromDate = statementPeriod.getStart();
            LocalDate toDate = statementPeriod.getEnd();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : set) {
                if (((AccountsStatementsContract$SelectableCurrency) obj2).f88285b) {
                    arrayList.add(obj2);
                }
            }
            ArrayList currencies = new ArrayList(w.t(arrayList, 10));
            Iterator it8 = arrayList.iterator();
            while (it8.hasNext()) {
                currencies.add(((AccountsStatementsContract$SelectableCurrency) it8.next()).f88284a.f306286a);
            }
            StatementsFormat format = K2(xVar);
            StatementsType type = StatementsType.OFFICIAL;
            ryd.w wVar = (ryd.w) cVar;
            wVar.getClass();
            Intrinsics.checkNotNullParameter(fromDate, "fromDate");
            Intrinsics.checkNotNullParameter(toDate, "toDate");
            Intrinsics.checkNotNullParameter(currencies, "currencies");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(type, "type");
            rVarN = wVar.n(2, new u0((Object) wVar, fromDate, toDate, (Collection) currencies, (Object) format, (Enum) type, 15));
        } else if (accountStatementProduct instanceof AccountStatementProduct.Junior) {
            String juniorId = ((AccountStatementProduct.Junior) accountStatementProduct).f88236a;
            Set set2 = set;
            ArrayList arrayList2 = new ArrayList(w.t(set2, 10));
            Iterator it9 = set2.iterator();
            while (it9.hasNext()) {
                arrayList2.add(((AccountsStatementsContract$SelectableCurrency) it9.next()).f88284a);
            }
            xi0.b currency = (xi0.b) d0.b0(arrayList2);
            if (statementPeriod == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            LocalDate fromDate2 = statementPeriod.getStart();
            LocalDate toDate2 = statementPeriod.getEnd();
            StatementsFormat format2 = K2(xVar);
            StatementsType type2 = StatementsType.OFFICIAL;
            ryd.w wVar2 = (ryd.w) cVar;
            wVar2.getClass();
            Intrinsics.checkNotNullParameter(juniorId, "juniorId");
            Intrinsics.checkNotNullParameter(fromDate2, "fromDate");
            Intrinsics.checkNotNullParameter(toDate2, "toDate");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(format2, "format");
            Intrinsics.checkNotNullParameter(type2, "type");
            rVarN = wVar2.n(2, new m(wVar2, juniorId, fromDate2, toDate2, currency, format2, type2));
        } else {
            if (!(accountStatementProduct instanceof AccountStatementProduct.PersonalCurrent) && !(accountStatementProduct instanceof AccountStatementProduct.Commodities) && !(accountStatementProduct instanceof AccountStatementProduct.JointCurrent) && !(accountStatementProduct instanceof AccountStatementProduct.Teen)) {
                throw new NoWhenBranchMatchedException();
            }
            if (statementPeriod == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            LocalDate fromDate3 = statementPeriod.getStart();
            LocalDate toDate3 = statementPeriod.getEnd();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj3 : set) {
                if (((AccountsStatementsContract$SelectableCurrency) obj3).f88285b) {
                    arrayList3.add(obj3);
                }
            }
            ArrayList currencies2 = new ArrayList(w.t(arrayList3, 10));
            Iterator it10 = arrayList3.iterator();
            while (it10.hasNext()) {
                currencies2.add(((AccountsStatementsContract$SelectableCurrency) it10.next()).f88284a.f306286a);
            }
            StatementsFormat format3 = K2(xVar);
            StatementsType type3 = StatementsType.OFFICIAL;
            AccountStatementProduct accountStatementProduct2 = pVar.f301258a;
            if (accountStatementProduct2 instanceof AccountStatementProduct.Teen) {
                id10 = ((AccountStatementProduct.Teen) accountStatementProduct2).f88240b;
            } else if (accountStatementProduct2 instanceof AccountStatementProduct.JointCurrent) {
                id10 = ((AccountStatementProduct.JointCurrent) accountStatementProduct2).f88235a.f51413b;
                Intrinsics.checkNotNullParameter(id10, "id");
            } else {
                if (!(accountStatementProduct2 instanceof AccountStatementProduct.PersonalCurrent) && !(accountStatementProduct2 instanceof AccountStatementProduct.Pro) && !(accountStatementProduct2 instanceof AccountStatementProduct.Commodities) && !(accountStatementProduct2 instanceof AccountStatementProduct.Junior)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = null;
                ryd.w wVar3 = (ryd.w) cVar;
                wVar3.getClass();
                Intrinsics.checkNotNullParameter(fromDate3, "fromDate");
                Intrinsics.checkNotNullParameter(toDate3, "toDate");
                Intrinsics.checkNotNullParameter(currencies2, "currencies");
                Intrinsics.checkNotNullParameter(format3, "format");
                Intrinsics.checkNotNullParameter(type3, "type");
                rVarN = wVar3.n(2, new m(wVar3, fromDate3, toDate3, currencies2, format3, type3, str));
            }
            str = id10;
            ryd.w wVar32 = (ryd.w) cVar;
            wVar32.getClass();
            Intrinsics.checkNotNullParameter(fromDate3, "fromDate");
            Intrinsics.checkNotNullParameter(toDate3, "toDate");
            Intrinsics.checkNotNullParameter(currencies2, "currencies");
            Intrinsics.checkNotNullParameter(format3, "format");
            Intrinsics.checkNotNullParameter(type3, "type");
            rVarN = wVar32.n(2, new m(wVar32, fromDate3, toDate3, currencies2, format3, type3, str));
        }
        l.a1(this, ue8.c.i0(byd.g.a(byd.g.c(rd0.e.b(o70.a.f(rVarN)), X(), this.f88290t.d(), new wyd.a(this, 0), new wyd.a(this, 1))), this), null, null, new wih.c(this, statementsFormatK2, (Continuation) null, 15), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f88293y;
    }
}
