package jc6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.model.Data;
import com.revolut.feature.donations.impl.R$string;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.DonationSchedule;
import com.revolut.feature.donations.impl.ui.kompot.screen.recurring.amount.RecurringDonationAmountScreenContract$InputData;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import nii.y0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import skm.a2;
import te0.w;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends jki.g implements l {

    @NotNull
    public static final n Companion = new n();
    public final b A;
    public final nd.o B;
    public final f01.c C;
    public final j D;
    public a2 E;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final RecurringDonationAmountScreenContract$InputData f172729p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final w80.b f172730q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wsg.n f172731r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final aa6.c f172732s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final xua.a f172733t;
    public final aa6.a u;
    public final eli.j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.revolut.domain.interactors.transactions.a f172734w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final jx0.a f172735x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final o7.b f172736y;
    public final l2j.a z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jki.p stateMapper, RecurringDonationAmountScreenContract$InputData inputData, w80.b moneyEditAmountFormatter, wsg.n walletInteractor, aa6.c donationsInteractor, xua.a recurringPaymentInteractor, aa6.a donationPocketsInteractor, eli.j twoFaErrorHandler, com.revolut.domain.interactors.transactions.a transactionsInteractor, jx0.a referralsInviteFriendsInteractor, o7.b orderQuoteInteractor, l2j.a currencyChooserFlowFactory, b charitySuccessStatusViewFactory, nd.o chooserIntentNavigationCommandFactory, f01.c uiKitResources) {
        super(stateMapper);
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(moneyEditAmountFormatter, "moneyEditAmountFormatter");
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(donationsInteractor, "donationsInteractor");
        Intrinsics.checkNotNullParameter(recurringPaymentInteractor, "recurringPaymentInteractor");
        Intrinsics.checkNotNullParameter(donationPocketsInteractor, "donationPocketsInteractor");
        Intrinsics.checkNotNullParameter(twoFaErrorHandler, "twoFaErrorHandler");
        Intrinsics.checkNotNullParameter(transactionsInteractor, "transactionsInteractor");
        Intrinsics.checkNotNullParameter(referralsInviteFriendsInteractor, "referralsInviteFriendsInteractor");
        Intrinsics.checkNotNullParameter(orderQuoteInteractor, "orderQuoteInteractor");
        Intrinsics.checkNotNullParameter(currencyChooserFlowFactory, "currencyChooserFlowFactory");
        Intrinsics.checkNotNullParameter(charitySuccessStatusViewFactory, "charitySuccessStatusViewFactory");
        Intrinsics.checkNotNullParameter(chooserIntentNavigationCommandFactory, "chooserIntentNavigationCommandFactory");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f172729p = inputData;
        this.f172730q = moneyEditAmountFormatter;
        this.f172731r = walletInteractor;
        this.f172732s = donationsInteractor;
        this.f172733t = recurringPaymentInteractor;
        this.u = donationPocketsInteractor;
        this.v = twoFaErrorHandler;
        this.f172734w = transactionsInteractor;
        this.f172735x = referralsInviteFriendsInteractor;
        this.f172736y = orderQuoteInteractor;
        this.z = currencyChooserFlowFactory;
        this.A = charitySuccessStatusViewFactory;
        this.B = chooserIntentNavigationCommandFactory;
        this.C = uiKitResources;
        DonationSchedule donationSchedule = inputData.f72105b;
        Data data = new Data(null, null, false, 7, null);
        Data data2 = new Data(null, null, false, 7, null);
        nqi.c.Companion.getClass();
        nqi.c cVar = nqi.c.f218470c;
        dj0.d.Companion.getClass();
        this.D = new j(donationSchedule, data, data2, cVar, dj0.d.d, new Data(null, null, false, 7, null), null);
    }

    public static void A2(s sVar, nqi.c cVar, Data data, int i) {
        if ((i & 2) != 0) {
            data = ((j) sVar.t2()).f172715c;
        }
        sVar.l2(new r(data, sVar, ((j) sVar.t2()).f172714b, cVar, (Continuation) null), new yi5.b(26));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object y2(jc6.s r5, gim.c r6) {
        /*
            boolean r0 = r6 instanceof jc6.o
            if (r0 == 0) goto L13
            r0 = r6
            jc6.o r0 = (jc6.o) r0
            int r1 = r0.f172723x
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172723x = r1
            goto L18
        L13:
            jc6.o r0 = new jc6.o
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.v
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172723x
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ba6.l r5 = r0.u
            yhm.o.b(r6)
            goto L58
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            yhm.o.b(r6)
            jki.i r6 = r5.t2()
            jc6.j r6 = (jc6.j) r6
            com.revolut.data.model.Data r6 = r6.f172714b
            java.lang.Object r6 = r6.getContent()
            ba6.l r6 = (ba6.l) r6
            if (r6 == 0) goto L71
            jx0.a r5 = r5.f172735x
            efm.d0 r5 = r5.l()
            r0.u = r6
            r0.f172723x = r3
            java.lang.Object r5 = nim.a.b(r5, r0)
            if (r5 != r1) goto L55
            return r1
        L55:
            r4 = r6
            r6 = r5
            r5 = r4
        L58:
            java.lang.String r6 = (java.lang.String) r6
            java.lang.String r0 = "?ref="
            java.lang.StringBuilder r6 = v0.a.l(r6, r0)
            java.lang.String r0 = r5.f13944l
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            jc6.k r0 = new jc6.k
            java.lang.String r5 = r5.f13939b
            r0.<init>(r5, r6)
            return r0
        L71:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: jc6.s.y2(jc6.s, gim.c):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object z2(jc6.s r10, xi0.b r11, gim.c r12) {
        /*
            boolean r0 = r12 instanceof jc6.p
            if (r0 == 0) goto L13
            r0 = r12
            jc6.p r0 = (jc6.p) r0
            int r1 = r0.f172724w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f172724w = r1
            goto L18
        L13:
            jc6.p r0 = new jc6.p
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f172724w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r12)
            goto L62
        L27:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L2f:
            yhm.o.b(r12)
            wsg.n r4 = r10.f172731r
            r8 = 0
            r9 = 62
            r6 = 0
            r7 = 0
            r5 = r11
            efm.d0 r10 = osg.b.r(r4, r5, r6, r7, r8, r9)
            i5f.g r11 = new i5f.g
            r12 = 5
            r11.<init>(r12, r5)
            j6k.g r12 = new j6k.g
            r2 = 14
            r12.<init>(r11, r2)
            r10.getClass()
            ufm.i r11 = new ufm.i
            r2 = 1
            r11.<init>(r10, r12, r2)
            java.lang.String r10 = "map(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r10)
            r0.f172724w = r3
            java.lang.Object r12 = nim.a.b(r11, r0)
            if (r12 != r1) goto L62
            return r1
        L62:
            java.lang.String r10 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r10)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: jc6.s.z2(jc6.s, xi0.b, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        RecurringDonationAmountScreenContract$InputData recurringDonationAmountScreenContract$InputData = this.f172729p;
        yji.l.a1(this, rd0.e.b(w.l(((sa6.t) this.f172732s).b(recurringDonationAmountScreenContract$InputData.f72104a, false), nim.a.w(((yua.q) this.f172733t).r(recurringDonationAmountScreenContract$InputData.f72104a), new j7b.l(22)))), null, null, new i4g.d(this, (Continuation) null, 11), 3);
    }

    @Override // yji.l
    public final boolean o1(Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        X1(new y0(null, new z(new TextLocalisedClause(R$string.donations_create_recurring_donations_error_title, null, null, 14), null, null, null, null, null, false, null, null, null, null, null, null, 32766), false, 5));
        return true;
    }

    @Override // jki.g
    public final jki.i r2() {
        return this.D;
    }
}
