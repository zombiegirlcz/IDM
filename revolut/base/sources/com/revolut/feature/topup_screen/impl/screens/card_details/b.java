package com.revolut.feature.topup_screen.impl.screens.card_details;

import ang.f;
import cli.g;
import cli.n;
import cli.y;
import com.revolut.domain.models.externalcards.CardholderVerificationStatus;
import com.revolut.feature.topup_screen.api.TopupApi$Toggles;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$InputData;
import com.revolut.feature.topup_screen.api.descriptor.CardDetailsScreenDescriptor$OutputData$CardData;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.feature.topup_screen.common.ExpireDateFormatter$CardExpire;
import grl.b4;
import hx7.e;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.f0;
import oki.h;
import org.jetbrains.annotations.NotNull;
import owe.d;
import rpi.j;
import tnb.k;
import v06.i;
import v0f.a0;
import v0f.d0;
import v0f.g0;
import v0f.t;
import v0f.u;
import v0f.v;
import vkm.j2;
import vkm.q;
import yji.l;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends h implements v {

    @NotNull
    public static final a0 Companion = new a0();
    public final l61.a A;
    public final d B;
    public final owe.a C;
    public final gte.a D;
    public final rve.h E;
    public final com.revolut.kompot.navigable.vc.modal.a F;
    public final y G;
    public final CardDetailsScreenDescriptor$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final f f91091p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final y51.a f91092q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final wig.a f91093r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final j60.a f91094s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final u53.b f91095t;
    public final ni0.f u;
    public final j v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final n60.a f91096w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final w53.b f91097x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final s70.a f91098y;
    public final n8b.a z;

    public b(CardDetailsScreenDescriptor$InputData inputData, f userInteractor, y51.a externalCardsInteractor, wig.a fundsProtectionDialogMapper, j60.a bottomDialogExtension, u53.b scanActivityCommandProvider, ni0.f paymentCardRecognitionResultExtractor, j secureKeyboardView, n60.a keyboardControllerExtension, w53.b nfcScanManager, s70.a intentProvider, n8b.a countryInteractor, l61.a userCompanyInteractor, d japaneseRestrictionDialogProvider, owe.a addCardConsentDialogProvider, gte.a featureToggleInteractor, rve.h externalCardVerificationInteractor, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(externalCardsInteractor, "externalCardsInteractor");
        Intrinsics.checkNotNullParameter(fundsProtectionDialogMapper, "fundsProtectionDialogMapper");
        Intrinsics.checkNotNullParameter(bottomDialogExtension, "bottomDialogExtension");
        Intrinsics.checkNotNullParameter(scanActivityCommandProvider, "scanActivityCommandProvider");
        Intrinsics.checkNotNullParameter(paymentCardRecognitionResultExtractor, "paymentCardRecognitionResultExtractor");
        Intrinsics.checkNotNullParameter(secureKeyboardView, "secureKeyboardView");
        Intrinsics.checkNotNullParameter(keyboardControllerExtension, "keyboardControllerExtension");
        Intrinsics.checkNotNullParameter(nfcScanManager, "nfcScanManager");
        Intrinsics.checkNotNullParameter(intentProvider, "intentProvider");
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        Intrinsics.checkNotNullParameter(userCompanyInteractor, "userCompanyInteractor");
        Intrinsics.checkNotNullParameter(japaneseRestrictionDialogProvider, "japaneseRestrictionDialogProvider");
        Intrinsics.checkNotNullParameter(addCardConsentDialogProvider, "addCardConsentDialogProvider");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(externalCardVerificationInteractor, "externalCardVerificationInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f91091p = userInteractor;
        this.f91092q = externalCardsInteractor;
        this.f91093r = fundsProtectionDialogMapper;
        this.f91094s = bottomDialogExtension;
        this.f91095t = scanActivityCommandProvider;
        this.u = paymentCardRecognitionResultExtractor;
        this.v = secureKeyboardView;
        this.f91096w = keyboardControllerExtension;
        this.f91097x = nfcScanManager;
        this.f91098y = intentProvider;
        this.z = countryInteractor;
        this.A = userCompanyInteractor;
        this.B = japaneseRestrictionDialogProvider;
        this.C = addCardConsentDialogProvider;
        this.D = featureToggleInteractor;
        this.E = externalCardVerificationInteractor;
        this.F = e.a(this, new umd.n(this, 26));
        this.G = mra.d.b(this, new u("", "", "", "", null, t.CARD, null, yte.a.MANUAL, false, false, false, false, false, false), stateMapper, null, false, 12);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object I2(com.revolut.feature.topup_screen.impl.screens.card_details.b r14, gim.c r15) throws java.lang.Throwable {
        /*
            boolean r0 = r15 instanceof v0f.k0
            if (r0 == 0) goto L13
            r0 = r15
            v0f.k0 r0 = (v0f.k0) r0
            int r1 = r0.f284813w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f284813w = r1
            goto L18
        L13:
            v0f.k0 r0 = new v0f.k0
            r0.<init>(r14, r15)
        L18:
            java.lang.Object r15 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f284813w
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L28
            yhm.o.b(r15)
            goto L40
        L28:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L30:
            yhm.o.b(r15)
            y51.a r15 = r14.f91092q
            r0.f284813w = r4
            e0f.z r15 = (e0f.z) r15
            java.lang.Object r15 = r15.h(r3, r0)
            if (r15 != r1) goto L40
            return r1
        L40:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            r0 = 0
            if (r15 == 0) goto L8e
            owe.d r15 = r14.B
            r15.getClass()
            nii.y0 r15 = new nii.y0
            com.revolut.core.ui_kit.models.TextLocalisedClause r5 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.topup_screen.impl.R$string.add_card_details_restrictions_apply
            r2 = 14
            r5.<init>(r1, r0, r0, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r6 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.feature.topup_screen.impl.R$string.topup_card_restrictions_prompt_subtitle
            r6.<init>(r1, r0, r0, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r8 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.retail.common.ui.R$string.common_action_continue
            r8.<init>(r1, r0, r0, r2)
            com.revolut.core.ui_kit.models.TextLocalisedClause r9 = new com.revolut.core.ui_kit.models.TextLocalisedClause
            int r1 = com.revolut.retail.common.ui.R$string.common_action_cancel
            r9.<init>(r1, r0, r0, r2)
            nii.l0 r4 = new nii.l0
            r12 = 0
            r13 = 932(0x3a4, float:1.306E-42)
            r7 = 0
            r10 = 0
            r11 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 5
            r15.<init>(r0, r4, r3, r1)
            kotlinx.coroutines.flow.Flow r6 = r14.X1(r15)
            v0f.d0 r9 = new v0f.d0
            r15 = 4
            r9.<init>(r14, r0, r15)
            r10 = 3
            r8 = 0
            r5 = r14
            yji.l.a1(r5, r6, r7, r8, r9, r10)
            goto L92
        L8e:
            r5 = r14
            r5.J2(r0)
        L92:
            kotlin.Unit r14 = kotlin.Unit.f186387a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.topup_screen.impl.screens.card_details.b.I2(com.revolut.feature.topup_screen.impl.screens.card_details.b, gim.c):java.lang.Object");
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        int i = 26;
        l2(new g0(this, continuation, 1), new yi5.b(i));
        l2(new g0(this, continuation, 2), new yi5.b(i));
        l.a1(this, q.H(new i(this, continuation, 1), q.q(new k(this.G.B(new uyh.t(24)), 17))), null, null, new d0(this, continuation, 3), 3);
        l2(new mt8.b(this, continuation, 11), new yi5.b(26));
    }

    public final void J2(Boolean bool) {
        u uVar = (u) ((j2) this.G.f22677a).getValue();
        String str = uVar.f284824a;
        t61.j jVar = uVar.e;
        String expireDate = uVar.f284825b;
        Intrinsics.checkNotNullParameter(expireDate, "expireDate");
        if (expireDate.length() != 4) {
            throw new IllegalArgumentException("Expire date should contain 4 digits: MMyy");
        }
        ExpireDateFormatter$CardExpire expireDateFormatter$CardExpire = new ExpireDateFormatter$CardExpire(Integer.parseInt(f0.U0(2, expireDate)), Integer.parseInt(f0.V0(2, expireDate)) + b4.EXPIRED_OR_INVALID_KEY_VALUE);
        String str2 = uVar.f284826c;
        String str3 = uVar.d;
        if (!pd.b.j(jVar != null ? Boolean.valueOf(jVar.f268165m) : null)) {
            str3 = null;
        }
        CardDetails cardDetails = new CardDetails(str, expireDateFormatter$CardExpire, str2, str3);
        if (((jte.d) this.D).c(TopupApi$Toggles.TopUpCardOwnerVerification.f90471c)) {
            yte.a aVar = uVar.f284828h;
            if (jVar == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            l2(new s56.d0(this, cardDetails, aVar, bool, jVar, (Continuation) null, 13), new yi5.b(26));
            return;
        }
        yte.a aVar2 = uVar.f284828h;
        if (jVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        K2(cardDetails, aVar2, jVar, bool, null, null);
    }

    @Override // zki.h
    public final com.revolut.kompot.navigable.vc.modal.a K() {
        return this.F;
    }

    public final void K2(CardDetails cardDetails, yte.a aVar, t61.j jVar, Boolean bool, String str, CardholderVerificationStatus cardholderVerificationStatus) {
        if (jVar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        C2(new CardDetailsScreenDescriptor$OutputData$CardData(cardDetails, aVar, jVar, str, cardholderVerificationStatus, null, bool));
        if (this.o.f90483a) {
            return;
        }
        B2();
    }

    @Override // yji.l
    public final void P1() {
        this.v.y();
    }

    @Override // yji.l
    public final void T1(long j2) {
        urd.n nVar = new urd.n(rd0.e.b(this.f91094s.t()), 26);
        uyh.t tVar = new uyh.t(21);
        y yVar = this.G;
        Continuation continuation = null;
        l.b1(this, yh5.b.d(yVar.B(tVar), nVar), null, new d0(this, continuation, 0), 3);
        l.b1(this, yh5.b.d(yVar.B(new uyh.t(22)), new k(yVar.B(new uyh.t(23)), 16)), null, new d0(this, continuation, 2), 3);
        n2(new g0(this, continuation, 0), new whi.b(6));
    }

    @Override // cli.z
    public final g getState() {
        return this.G;
    }
}
