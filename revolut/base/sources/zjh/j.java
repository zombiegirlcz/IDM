package zjh;

import akl.s1;
import au6.p1;
import au6.y3;
import aw0.o9;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.tasks.OnFailureListener;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.be_driven_design.models.domain.FincrimeHomeScreen$V2;
import com.revolut.feature.cashback.impl.R$string;
import com.revolut.feature.credit.loan.autopay.impl.network.LoanAutopayService;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.crypto.withdraw.api.models.FiatCryptoMoney;
import com.revolut.feature.revolutpay.impl.ui.instore.paymentscreen.InStorePaymentScreen;
import com.revolut.feature.statements.api.documents_hub.period.StatementPeriodSelection;
import com.revolut.feature.statements.api.models.StatementPeriod;
import com.revolut.feature.statements.api.models.StatementPeriodType;
import com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.ThreeDsScreen;
import com.revolut.feature.wealth.ui.impl.cash_balance.CashBalanceController;
import com.revolut.feature_retail_user_declarations.purpose.screen.PurposeOfAccountScreenContract$InputData;
import et6.z3;
import h93.f0;
import h93.j0;
import h93.l0;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import skm.e0;
import skm.p0;
import yhm.m;
import zhm.h0;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public class j implements zp0.c, w0h.f, dd3.a, kfm.o, OnFailureListener, lkd.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f322839a;

    public j(ew2.q function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.f322839a = function;
    }

    public static eq5.p i(wp5.b amountFitsInLimitsStatus, wp5.a amountFitsInBalanceStatus, boolean z, FiatCryptoMoney withdrawAmount, dj0.d cryptoBalance) {
        Intrinsics.checkNotNullParameter(amountFitsInLimitsStatus, "amountFitsInLimitsStatus");
        Intrinsics.checkNotNullParameter(amountFitsInBalanceStatus, "amountFitsInBalanceStatus");
        Intrinsics.checkNotNullParameter(withdrawAmount, "withdrawAmount");
        Intrinsics.checkNotNullParameter(cryptoBalance, "cryptoBalance");
        return (!withdrawAmount.f71113b.k() || amountFitsInLimitsStatus == wp5.b.LowBalance || amountFitsInBalanceStatus == wp5.a.ZeroBalance) ? amountFitsInBalanceStatus != wp5.a.WithinBalance ? new eq5.k(amountFitsInBalanceStatus) : amountFitsInLimitsStatus != wp5.b.AmountFitsInLimits ? new eq5.n(amountFitsInLimitsStatus) : z ? eq5.l.f128285a : eq5.m.f128289a : eq5.o.f128297a;
    }

    public static String j(LocalDate localDate, String str, Locale locale) {
        String str2 = localDate.format(DateTimeFormatter.ofPattern(str, locale));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    public static boolean q(cci.g gVar) {
        switch (fci.p.f133801a[gVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
            case 41:
            case 42:
            case 43:
            case 44:
            case 45:
            case 46:
            case 47:
                return true;
            default:
                return false;
        }
    }

    public static md6.b s(md6.e eVar) {
        return new md6.b(eVar, md6.m.f204493a, md6.d.DISCOVERY, md6.f.AGGREGATED);
    }

    public static void t(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        Exception exc2 = new Exception(j6.a.q("Connection error: ", description));
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, null, null, exc2, h0Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.List v(zjh.j r18, com.revolut.data.model.Data r19) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.j.v(zjh.j, com.revolut.data.model.Data):java.util.List");
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0078, code lost:
    
        if (r0.k(r10, r11, r12, r1) == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008c, code lost:
    
        if (r0.g(r10, r11, r12, r1) == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a0, code lost:
    
        if (r0.h(r10, r11, r12, r1) == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00b4, code lost:
    
        if (p(r10, r11, r12, r1) == r2) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00c5, code lost:
    
        if (r0.f(r10, r11, r12, r1) == r2) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // lkd.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object Y(com.revolut.feature.slot_manager.api.model.SlotContext r10, lkd.j r11, lkd.d r12, kotlin.coroutines.Continuation r13) {
        /*
            Method dump skipped, instruction units count: 217
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.j.Y(com.revolut.feature.slot_manager.api.model.SlotContext, lkd.j, lkd.d, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // dd3.a
    public String a() {
        return hha.s.p((hha.d) this.f322839a) ? "3D214" : "3D114";
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public /* synthetic */ Object apply(Object obj2) {
        return ((ew2.q) this.f322839a).invoke(obj2);
    }

    @Override // dd3.a
    public int b() {
        return R$string.cashback_source_plan_title;
    }

    @Override // w0h.f
    public Object d(gim.c cVar) {
        return ((n28.d) this.f322839a).e(cVar);
    }

    @Override // w0h.f
    public TextLocalisedClause e() {
        return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_top_movers_header_title, null, null, 14);
    }

    @Override // w0h.f
    public TextLocalisedClause f() {
        return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_common_error_action, null, null, 14);
    }

    @Override // w0h.f
    public TextLocalisedClause g() {
        return new TextLocalisedClause(com.revolut.retail.wealth.resources.R$string.wealth_invest_widget_top_movers_error_title, null, null, 14);
    }

    @Override // w0h.f
    public w0h.d h() {
        return w0h.d.STOCK;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // zp0.c
    public void k(String extractedValue, String formattedValue, boolean z) {
        Intrinsics.checkNotNullParameter(extractedValue, "extractedValue");
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        b9c.k kVar = (b9c.k) ((b9c.f) ((InStorePaymentScreen) this.f322839a).Z.getValue());
        kVar.getClass();
        Intrinsics.checkNotNullParameter(formattedValue, "formattedValue");
        kVar.x2(new b4b.x(1, kVar.f13711p.d(formattedValue)));
    }

    public Flow l(CryptoAddress beneficiary, List toBaseCurrencyExchangeRates, FiatCryptoMoney withdrawAmount) {
        Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
        Intrinsics.checkNotNullParameter(toBaseCurrencyExchangeRates, "toBaseCurrencyExchangeRates");
        Intrinsics.checkNotNullParameter(withdrawAmount, "withdrawAmount");
        return vkm.q.q(nim.a.v(rd0.e.b(((ap5.b) this.f322839a).i(beneficiary.f71060b, false)), new eed.i(beneficiary, 8, withdrawAmount, toBaseCurrencyExchangeRates)));
    }

    public Flow m(dj0.d withdrawAmountInCrypto, xi0.b withdrawCurrency) {
        Intrinsics.checkNotNullParameter(withdrawCurrency, "withdrawCurrency");
        Intrinsics.checkNotNullParameter(withdrawAmountInCrypto, "withdrawAmountInCrypto");
        return vkm.q.q(nim.a.v(rd0.e.b(((ap5.b) this.f322839a).i(withdrawCurrency, false)), new ar3.a(7, withdrawAmountInCrypto)));
    }

    public Object n(gim.i iVar) {
        wo1.b bVar = (wo1.b) this.f322839a;
        rm6.c cVar = new rm6.c(((vp1.c) bVar).f291042a, xo1.g.F24, null, 7);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, cVar, iVar);
    }

    public f0 o(b93.d cardScope) {
        Intrinsics.checkNotNullParameter(cardScope, "cardScope");
        if (!((r10.q) this.f322839a).O()) {
            return null;
        }
        if (cardScope != b93.d.ALL && cardScope != b93.d.RETAIL) {
            return null;
        }
        b93.b.Companion.getClass();
        b93.b bVar = b93.b.r4;
        t0 t0Var = t0.f186434a;
        m70.a.c(t0Var);
        b93.j jVar = new b93.j(bVar, "");
        h93.r rVar = h93.r.ACTIVE;
        h93.h hVar = new h93.h(h93.g.NONE, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, h93.e.UNKNOWN, null, null);
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        Intrinsics.checkNotNullParameter(t0Var, "<this>");
        h93.q qVar = h93.q.ACTIVE;
        return new f0("REVOLUT_PAY_MANAGEMENT", "", true, false, true, rVar, null, jVar, hVar, 0L, qVar, qVar, l0.UNKNOWN, j0.RETAIL, "", null, r0.g());
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception it8) {
        Intrinsics.checkNotNullParameter(it8, "it");
        eim.c cVar = (eim.c) this.f322839a;
        m.Companion companion = yhm.m.INSTANCE;
        cVar.resumeWith(Boolean.FALSE);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object p(com.revolut.feature.slot_manager.api.model.SlotContext r5, ekd.n0 r6, akd.a r7, gim.c r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof fld.b
            if (r0 == 0) goto L13
            r0 = r8
            fld.b r0 = (fld.b) r0
            int r1 = r0.f135945w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f135945w = r1
            goto L18
        L13:
            fld.b r0 = new fld.b
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f135945w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r8)
            goto L3f
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r8)
            java.lang.Object r8 = r4.f322839a
            skd.i r8 = (skd.i) r8
            r0.f135945w = r3
            java.lang.Object r5 = r8.j(r5, r6, r7, r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.j.p(com.revolut.feature.slot_manager.api.model.SlotContext, ekd.n0, akd.a, gim.c):java.lang.Object");
    }

    public Clause r(StatementPeriodSelection selection) {
        qd0.b bVar = (qd0.b) this.f322839a;
        Intrinsics.checkNotNullParameter(selection, "selection");
        StatementPeriodType statementPeriodType = selection.f88217a;
        StatementPeriod statementPeriod = selection.f88218b;
        switch (d0e.d.f110354a[statementPeriodType.ordinal()]) {
            case 1:
                return new TextLocalisedClause(com.revolut.feature.statements.R$string.statement_period_all_time, null, null, 14);
            case 2:
                Locale localeB = ((s80.b) bVar).b();
                boolean zF = Intrinsics.f(statementPeriod.getStart(), statementPeriod.getEnd());
                boolean z = statementPeriod.getStart().getYear() == statementPeriod.getEnd().getYear();
                if (z && statementPeriod.getStart().getMonth() == statementPeriod.getEnd().getMonth()) {
                    z = true;
                }
                return new TextClause(zF ? j(statementPeriod.getStart(), "d MMM yyyy", localeB) : z ? com.google.android.gms.internal.mlkit_vision_face.a.o(j(statementPeriod.getStart(), "d", localeB), " – ", j(statementPeriod.getEnd(), "d MMM yyyy", localeB)) : z ? com.google.android.gms.internal.mlkit_vision_face.a.o(j(statementPeriod.getStart(), "d MMM", localeB), " – ", j(statementPeriod.getEnd(), "d MMM yyyy", localeB)) : com.google.android.gms.internal.mlkit_vision_face.a.o(j(statementPeriod.getStart(), "d MMM yyyy", localeB), " – ", j(statementPeriod.getEnd(), "d MMM yyyy", localeB)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            case 3:
            case 4:
            case 5:
            case 6:
                Locale localeB2 = ((s80.b) bVar).b();
                z = statementPeriod.getStart().getYear() == statementPeriod.getEnd().getYear();
                return new TextClause((z && statementPeriod.getStart().getMonth() == statementPeriod.getEnd().getMonth()) ? j(statementPeriod.getStart(), "MMM yyyy", localeB2) : z ? com.google.android.gms.internal.mlkit_vision_face.a.o(j(statementPeriod.getStart(), "MMM", localeB2), " – ", j(statementPeriod.getEnd(), "MMM yyyy", localeB2)) : com.google.android.gms.internal.mlkit_vision_face.a.o(j(statementPeriod.getStart(), "MMM yyyy", localeB2), " – ", j(statementPeriod.getEnd(), "MMM yyyy", localeB2)), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public void u(String scheme) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c cVar = (com.revolut.feature.topup_screen.impl.flows.topup.screen.three_ds.c) ((ThreeDsScreen) this.f322839a).R2();
        cVar.H2(cVar.f90966w, new dz7.k(3));
    }

    public ghb.j w(fhb.c statusDto) {
        Intrinsics.checkNotNullParameter(statusDto, "statusDto");
        gr2.y yVar = statusDto.d;
        if (yVar == null) {
            return ghb.i.f143900a;
        }
        fr2.c cVarF = ((hr2.c) ((z9l.h) this.f322839a)).f(yVar);
        return !(cVarF instanceof FincrimeHomeScreen$V2) ? new ghb.h(new IllegalStateException("Salary Switch tracker unsupported")) : new ghb.g(new ghb.f(statusDto.f135193a, statusDto.f135194b, statusDto.f135195c, (FincrimeHomeScreen$V2) cVarF));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object x(fs6.h r10, gim.c r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof et6.z3
            if (r0 == 0) goto L13
            r0 = r11
            et6.z3 r0 = (et6.z3) r0
            int r1 = r0.f129394x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129394x = r1
            goto L18
        L13:
            et6.z3 r0 = new et6.z3
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129394x
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L47
            if (r2 == r6) goto L41
            if (r2 == r5) goto L3d
            if (r2 == r4) goto L39
            if (r2 != r3) goto L31
            yhm.o.b(r11)
            return r11
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            yhm.o.b(r11)
            return r11
        L3d:
            yhm.o.b(r11)
            return r11
        L41:
            fs6.h r10 = r0.u
            yhm.o.b(r11)
            goto L63
        L47:
            yhm.o.b(r11)
            boolean r11 = r10.f137614c
            boolean r2 = r10.d
            if (r11 == 0) goto L6f
            fs6.g r8 = r10.f137613b
            boolean r8 = r8.f137609a
            if (r8 == 0) goto L6f
            if (r2 == 0) goto L6f
            r0.u = r10
            r0.f129394x = r6
            java.lang.Object r11 = r9.y(r10, r0)
            if (r11 != r1) goto L63
            goto L89
        L63:
            r0.u = r7
            r0.f129394x = r5
            java.lang.Object r10 = r9.z(r10, r0)
            if (r10 != r1) goto L6e
            goto L89
        L6e:
            return r10
        L6f:
            if (r11 == 0) goto L7d
            r0.u = r7
            r0.f129394x = r4
            java.lang.Object r10 = r9.y(r10, r0)
            if (r10 != r1) goto L7c
            goto L89
        L7c:
            return r10
        L7d:
            if (r2 == 0) goto L8b
            r0.u = r7
            r0.f129394x = r3
            java.lang.Object r10 = r9.z(r10, r0)
            if (r10 != r1) goto L8a
        L89:
            return r1
        L8a:
            return r10
        L8b:
            com.revolut.feature.freelancer.common.models.vat_reminders.FreelancerVatReminder r10 = r10.f137612a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: zjh.j.x(fs6.h, gim.c):java.lang.Object");
    }

    public Object y(fs6.h hVar, z3 z3Var) {
        y3 y3Var = (y3) this.f322839a;
        fs6.d dVar = new fs6.d(hVar.f137612a.f73497a, hVar.f137613b.f137609a);
        y3Var.getClass();
        s1 s1Var = new s1(y3Var, dVar, (Continuation) null, 16);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, s1Var, z3Var);
    }

    public Object z(fs6.h hVar, z3 z3Var) {
        y3 y3Var = (y3) this.f322839a;
        String str = hVar.f137612a.f73497a;
        fs6.g gVar = hVar.f137613b;
        fs6.f fVar = new fs6.f(str, gVar.f137610b, gVar.f137611c);
        y3Var.getClass();
        s1 s1Var = new s1(y3Var, fVar, (Continuation) null, 17);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, s1Var, z3Var);
    }

    public /* synthetic */ j(Object obj2) {
        this.f322839a = obj2;
    }

    public j(CameraUpdate internal) {
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.f322839a = internal;
    }

    public j(y21.c repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f322839a = repository;
    }

    public j(PurposeOfAccountScreenContract$InputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        this.f322839a = inputData;
    }

    public j(vrl.a extendedHoursInteractor) {
        Intrinsics.checkNotNullParameter(extendedHoursInteractor, "extendedHoursInteractor");
        this.f322839a = extendedHoursInteractor;
    }

    public j(f1e.d repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f322839a = repository;
    }

    public j(ij0.a networkConfiguration) {
        Intrinsics.checkNotNullParameter(networkConfiguration, "networkConfiguration");
        this.f322839a = networkConfiguration;
    }

    public j(n28.d widgetAvailabilityProvider) {
        Intrinsics.checkNotNullParameter(widgetAvailabilityProvider, "widgetAvailabilityProvider");
        this.f322839a = widgetAvailabilityProvider;
    }

    public j(w4l.f dod2) {
        Intrinsics.checkNotNullParameter(dod2, "dod");
        this.f322839a = dod2;
    }

    public j(wo1.b billsInteractor) {
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        this.f322839a = billsInteractor;
    }

    public j(z9l.h fincrimeHomeScreenDomainMapper) {
        Intrinsics.checkNotNullParameter(fincrimeHomeScreenDomainMapper, "fincrimeHomeScreenDomainMapper");
        this.f322839a = fincrimeHomeScreenDomainMapper;
    }

    public j(LoanAutopayService loanAutopayService) {
        Intrinsics.checkNotNullParameter(loanAutopayService, "loanAutopayService");
        this.f322839a = loanAutopayService;
    }

    public j(z0h.d disclaimersDataProvider) {
        Intrinsics.checkNotNullParameter(disclaimersDataProvider, "disclaimersDataProvider");
        this.f322839a = disclaimersDataProvider;
    }

    public j(p1 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f322839a = repository;
    }

    public j(ed6.a colombiaLegalEntityProvider) {
        Intrinsics.checkNotNullParameter(colombiaLegalEntityProvider, "colombiaLegalEntityProvider");
        this.f322839a = colombiaLegalEntityProvider;
    }

    public j(skd.i slotManagerInteractor) {
        Intrinsics.checkNotNullParameter(slotManagerInteractor, "slotManagerInteractor");
        this.f322839a = slotManagerInteractor;
    }

    public j(cej.b mobilePlansFeatureAvailabilityInteractor, ynj.m installationStateResolver) {
        Intrinsics.checkNotNullParameter(mobilePlansFeatureAvailabilityInteractor, "mobilePlansFeatureAvailabilityInteractor");
        Intrinsics.checkNotNullParameter(installationStateResolver, "installationStateResolver");
        this.f322839a = mobilePlansFeatureAvailabilityInteractor;
    }

    public j(f61.a ratesPlotInteractor) {
        Intrinsics.checkNotNullParameter(ratesPlotInteractor, "ratesPlotInteractor");
        this.f322839a = ratesPlotInteractor;
    }

    public j(i4b.f legalEntityContextProvider) {
        Intrinsics.checkNotNullParameter(legalEntityContextProvider, "legalEntityContextProvider");
        this.f322839a = legalEntityContextProvider;
    }

    public j(qd0.b languageProvider) {
        Intrinsics.checkNotNullParameter(languageProvider, "languageProvider");
        this.f322839a = languageProvider;
    }

    public j(r10.q revolutPayManagementInteractor) {
        Intrinsics.checkNotNullParameter(revolutPayManagementInteractor, "revolutPayManagementInteractor");
        this.f322839a = revolutPayManagementInteractor;
    }

    public j(y3 repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f322839a = repository;
    }

    public j(hha.d currentPlan) {
        Intrinsics.checkNotNullParameter(currentPlan, "currentPlan");
        this.f322839a = currentPlan;
    }

    public j(ap5.b cryptoWithdrawInteractor) {
        Intrinsics.checkNotNullParameter(cryptoWithdrawInteractor, "cryptoWithdrawInteractor");
        this.f322839a = cryptoWithdrawInteractor;
    }

    public j(zvk.b assetStatsGroupMapper) {
        Intrinsics.checkNotNullParameter(assetStatsGroupMapper, "assetStatsGroupMapper");
        this.f322839a = assetStatsGroupMapper;
    }

    public j(CashBalanceController cashBalanceController) {
        this.f322839a = cashBalanceController.W;
    }
}
