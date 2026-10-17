package dob;

import bq5.j0;
import com.revolut.core.ui_kit.delegates.g6;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.impl.ui.instalment.hub.CreditCardInstalmentHubScreen;
import com.revolut.feature.credit.card.impl.ui.instalment.term.InstalmentTermScreen;
import com.revolut.feature.crypto.withdraw.impl.ui_v3.addbeneficiary.createbeneficiary.recipienttypedialog.CryptoRecipientTypeDialogController;
import com.revolut.feature.kyc.impl.screens.incode_consent.IncodeDocumentProcessingConsentScreen;
import com.revolut.feature.rev_points.impl.ui.challenges.details.RevPointsChallengeDetailsScreen;
import com.revolut.feature.security_hub.impl.ui.add_to_click_to_pay.AddToClickToPayScreen;
import com.revolut.feature.wealth_discovery.impl.collection.popular_first_buy.PopularFirstBuyScreen;
import com.revolut.retail.core.navigation.NaviCommand;
import com.revolut.shared.feature.wealth.models.trading_accounts.TradingAccounts;
import cp4.k0;
import cp4.l;
import cp4.y;
import dp4.q;
import dp4.r;
import dp4.s;
import dp4.t;
import dp4.w;
import dr2.m;
import dr7.j;
import dx5.n;
import gim.i;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import r10.v;
import vf0.k;

/* JADX INFO: loaded from: classes6.dex */
public final class c extends i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Object f116476w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f116476w = obj2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c cVar = new c((h) this.f116476w, continuation, 0);
                cVar.v = obj2;
                return cVar;
            case 1:
                c cVar2 = new c((PopularFirstBuyScreen) this.f116476w, continuation, 1);
                cVar2.v = obj2;
                return cVar2;
            case 2:
                c cVar3 = new c((q) this.f116476w, continuation, 2);
                cVar3.v = obj2;
                return cVar3;
            case 3:
                c cVar4 = new c((r) this.f116476w, continuation, 3);
                cVar4.v = obj2;
                return cVar4;
            case 4:
                c cVar5 = new c((s) this.f116476w, continuation, 4);
                cVar5.v = obj2;
                return cVar5;
            case 5:
                c cVar6 = new c((t) this.f116476w, continuation, 5);
                cVar6.v = obj2;
                return cVar6;
            case 6:
                c cVar7 = new c((w) this.f116476w, continuation, 6);
                cVar7.v = obj2;
                return cVar7;
            case 7:
                c cVar8 = new c((a5h.g) this.f116476w, continuation, 7);
                cVar8.v = obj2;
                return cVar8;
            case 8:
                c cVar9 = new c((CryptoRecipientTypeDialogController) this.f116476w, continuation, 8);
                cVar9.v = obj2;
                return cVar9;
            case 9:
                c cVar10 = new c((m) this.f116476w, continuation, 9);
                cVar10.v = obj2;
                return cVar10;
            case 10:
                c cVar11 = new c((j) this.f116476w, continuation, 10);
                cVar11.v = obj2;
                return cVar11;
            case 11:
                c cVar12 = new c((ds2.i) this.f116476w, continuation, 11);
                cVar12.v = obj2;
                return cVar12;
            case 12:
                c cVar13 = new c((CreditCardInstalmentHubScreen) this.f116476w, continuation, 12);
                cVar13.v = obj2;
                return cVar13;
            case 13:
                c cVar14 = new c((com.revolut.feature.business.referrals.ui.screens.referral_campaign_state.a) this.f116476w, continuation, 13);
                cVar14.v = obj2;
                return cVar14;
            case 14:
                c cVar15 = new c((InstalmentTermScreen) this.f116476w, continuation, 14);
                cVar15.v = obj2;
                return cVar15;
            case 15:
                c cVar16 = new c((com.revolut.feature.credit.card.impl.ui.instalment.term.b) this.f116476w, continuation, 15);
                cVar16.v = obj2;
                return cVar16;
            case 16:
                c cVar17 = new c((v) this.f116476w, continuation, 16);
                cVar17.v = obj2;
                return cVar17;
            case 17:
                c cVar18 = new c((AddToClickToPayScreen) this.f116476w, continuation, 17);
                cVar18.v = obj2;
                return cVar18;
            case 18:
                c cVar19 = new c((duc.i) this.f116476w, continuation, 18);
                cVar19.v = obj2;
                return cVar19;
            case 19:
                c cVar20 = new c((dug.i) this.f116476w, continuation, 19);
                cVar20.v = obj2;
                return cVar20;
            case 20:
                c cVar21 = new c((duk.i) this.f116476w, continuation, 20);
                cVar21.v = obj2;
                return cVar21;
            case 21:
                c cVar22 = new c((dw7.h) this.f116476w, continuation, 21);
                cVar22.v = obj2;
                return cVar22;
            case 22:
                c cVar23 = new c((dwd.a) this.f116476w, continuation, 22);
                cVar23.v = obj2;
                return cVar23;
            case 23:
                c cVar24 = new c((n) this.f116476w, continuation, 23);
                cVar24.v = obj2;
                return cVar24;
            case 24:
                c cVar25 = new c((IncodeDocumentProcessingConsentScreen) this.f116476w, continuation, 24);
                cVar25.v = obj2;
                return cVar25;
            case 25:
                c cVar26 = new c((dz6.q) this.f116476w, continuation, 25);
                cVar26.v = obj2;
                return cVar26;
            case 26:
                c cVar27 = new c((RevPointsChallengeDetailsScreen) this.f116476w, continuation, 26);
                cVar27.v = obj2;
                return cVar27;
            case 27:
                c cVar28 = new c((dzd.g) this.f116476w, continuation, 27);
                cVar28.v = obj2;
                return cVar28;
            case 28:
                c cVar29 = new c((com.revolut.feature_crypto_order_flow.impl.flow.a) this.f116476w, continuation, 28);
                cVar29.v = obj2;
                return cVar29;
            default:
                c cVar30 = new c((e07.j) this.f116476w, continuation, 29);
                cVar30.v = obj2;
                return cVar30;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((c) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((c) create((g6) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((c) create((l) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((c) create((cp4.n) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 4:
                return ((c) create((cp4.r) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 5:
                return ((c) create((cp4.t) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 6:
                return ((c) create((y) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 7:
                return ((c) create((k0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 8:
                return ((c) create((j0) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 9:
                return ((c) create((dr2.f) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 10:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 11:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 12:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 13:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 14:
                return ((c) create(obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 15:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 16:
                return ((c) create((Pair) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 17:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 18:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 19:
                return ((c) create((TradingAccounts) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 20:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 21:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 22:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 23:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 24:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 25:
                return ((c) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 26:
                return ((c) create((ty0.a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 27:
                return ((c) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 28:
                return ((c) create((NaviCommand) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((c) create((k) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x014b  */
    /* JADX WARN: Type inference failed for: r10v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r23v2 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v6 */
    /* JADX WARN: Type inference failed for: r2v115, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v126, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v62, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v87, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 2066
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dob.c.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
