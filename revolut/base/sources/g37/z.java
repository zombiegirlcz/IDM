package g37;

import com.revolut.feature.apm.core.models.alias.beneficiary.ResolveAlias;
import com.revolut.feature.retail.cobranded_cards.api.domain.model.CobrandedCardsPlanHubInfoBannerActionSuccess;
import com.revolut.feature.terms.api.model.Terms;
import com.revolut.shared.feature.user_declarations.api.navigation.DateOfBirthControllerDescriptor$OutputData;
import g8i.e0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f140237w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f140238x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c cVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 3;
        this.f140237w = cVar;
        this.f140238x = (gim.i) function1;
    }

    /* JADX WARN: Type inference failed for: r2v16, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v6, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z((com.revolut.feature.freelancer.impl.ui.tax_hub.hub.hub.e) this.f140238x, continuation, 0);
            case 1:
                return new z((g42.f) this.f140237w, (CoroutineScope) this.f140238x, continuation, 1);
            case 2:
                return new z((com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.f140237w, (String) this.f140238x, continuation, 2);
            case 3:
                return new z((com.revolut.feature.payments_migration.impl.ui.screen.migrate_subscriptions.c) this.f140237w, (Function1) this.f140238x, continuation);
            case 4:
                return new z((ty0.a) this.f140237w, (g6i.i) this.f140238x, continuation, 4);
            case 5:
                return new z((g6k.r) this.f140237w, (i6k.b) this.f140238x, continuation, 5);
            case 6:
                return new z((g6k.r) this.f140237w, (i6k.c) this.f140238x, continuation, 6);
            case 7:
                return new z((g6k.r) this.f140237w, (i6k.d) this.f140238x, continuation, 7);
            case 8:
                return new z((g6k.r) this.f140237w, (Function1) this.f140238x, continuation);
            case 9:
                return new z((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.f140237w, (CobrandedCardsPlanHubInfoBannerActionSuccess) this.f140238x, continuation, 9);
            case 10:
                return new z((com.revolut.feature.retail.cobranded_cards.impl.presentation.screens.plan_hub.e) this.f140237w, (String) this.f140238x, continuation, 10);
            case 11:
                return new z((com.revolut.feature.subaccount.impl.ui.edit.invite.flow.a) this.f140237w, (s7e.d) this.f140238x, continuation, 11);
            case 12:
                return new z((e0) this.f140237w, (ty0.a) this.f140238x, continuation, 12);
            case 13:
                return new z((ga2.g) this.f140237w, (ResolveAlias) this.f140238x, continuation, 13);
            case 14:
                return new z((com.revolut.feature.credit.application.plugins.impl.ui.documents_upload_plugin.b) this.f140237w, (nii.h) this.f140238x, continuation, 14);
            case 15:
                return new z((com.revolut.feature.onboarding.impl.onboarding.v) this.f140237w, (ha9.e) this.f140238x, continuation, 15);
            case 16:
                return new z((ma9.f) this.f140237w, (com.revolut.feature.onboarding.impl.onboarding.v) this.f140238x, continuation, 16);
            case 17:
                return new z((DateOfBirthControllerDescriptor$OutputData) this.f140237w, (com.revolut.feature.onboarding.impl.onboarding.v) this.f140238x, continuation, 17);
            case 18:
                return new z((com.revolut.feature.onboarding.impl.onboarding.v) this.f140237w, (lbl.a) this.f140238x, continuation, 18);
            case 19:
                return new z((com.revolut.feature.onboarding.impl.onboarding.v) this.f140237w, (mb9.d) this.f140238x, continuation, 19);
            case 20:
                return new z((com.revolut.feature.onboarding.impl.onboarding.v) this.f140237w, (List) this.f140238x, continuation, 20);
            case 21:
                return new z((vb9.d) this.f140237w, (com.revolut.feature.onboarding.impl.onboarding.v) this.f140238x, continuation, 21);
            case 22:
                return new z((gaf.k) this.f140237w, (gaf.e) this.f140238x, continuation, 22);
            case 23:
                return new z((gah.e) this.f140237w, (d1h.a) this.f140238x, continuation, 23);
            case 24:
                return new z((com.revolut.feature.credit.application.plugins.impl.ui.family_credit_card_settings.flow.a) this.f140237w, (hb4.h) this.f140238x, continuation, 24);
            case 25:
                return new z((com.revolut.feature_retail_user_declarations.email_verification.otp_flow.b) this.f140237w, (String) this.f140238x, continuation, 25);
            case 26:
                return new z((gcg.e0) this.f140237w, this.f140238x, continuation, 26);
            case 27:
                return new z((gck.w) this.f140237w, (List) this.f140238x, continuation, 27);
            case 28:
                return new z((gd9.j) this.f140237w, (Terms) this.f140238x, continuation, 28);
            default:
                return new z((com.revolut.feature.junior_graduation.impl.ui.screen.identification.a) this.f140238x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:437:0x087d  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0883  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a4  */
    /* JADX WARN: Type inference failed for: r10v3, types: [gim.i, kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r10v8, types: [gim.i, kotlin.jvm.functions.Function1] */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g37.z.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public z(g6k.r rVar, Function1 function1, Continuation continuation) {
        super(1, continuation);
        this.u = 8;
        this.f140237w = rVar;
        this.f140238x = (gim.i) function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f140237w = obj2;
        this.f140238x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(oki.h hVar, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f140238x = hVar;
    }
}
