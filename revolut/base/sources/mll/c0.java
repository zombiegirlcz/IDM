package mll;

import android.view.View;
import android.widget.ImageView;
import com.revolut.core.model.account.AccountId;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.card_order_new.api.CardOrderAccountWrapper;
import com.revolut.feature.pix.api.model.AliasRegistrationType;
import com.revolut.feature.pix.api.model.PhoneNumber;
import com.revolut.feature.pix.api.model.PixKey;
import com.revolut.feature.pix.api.model.PortabilityRequestArgsModel;
import com.revolut.feature.pix.api.model.TokenVerificationRequest;
import com.revolut.feature.pix.impl.data.network.AliasManagementService;
import com.revolut.feature.separate_favourites.api.alerts.widget.AlertsWidgetContext;
import com.revolut.feature.shared_separate_favourites.domain.FavouritesAssetTypeKey;
import com.revolut.feature.shared_separate_favourites.domain.alerts.AlertItem;
import com.revolut.retail.feature.api.trips.models.Trip;
import com.revolut.sso.impl.domain.models.Claim;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import mx0.a1;
import mx0.c1;
import n33.t0;
import n4d.r0;
import nii.y0;

/* JADX INFO: loaded from: classes12.dex */
public final class c0 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f207046w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f207047x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Object f207048y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207046w = obj2;
        this.f207047x = obj3;
        this.f207048y = obj4;
    }

    private final Object b(Object obj2) {
        String str;
        String strR;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            AliasManagementService aliasManagementService = ((n8a.o) this.f207046w).f213340a;
            AliasRegistrationType aliasRegistrationType = (AliasRegistrationType) this.f207047x;
            Intrinsics.checkNotNullParameter(aliasRegistrationType, "<this>");
            boolean z = aliasRegistrationType instanceof AliasRegistrationType.Email;
            AliasRegistrationType.UserDocument userDocument = AliasRegistrationType.UserDocument.f80394a;
            AliasRegistrationType.RandomKey randomKey = AliasRegistrationType.RandomKey.f80393a;
            if (z) {
                str = "EMAIL";
            } else if (aliasRegistrationType instanceof AliasRegistrationType.Phone) {
                str = "PHONE";
            } else if (Intrinsics.f(aliasRegistrationType, randomKey)) {
                str = "EVP";
            } else {
                if (!Intrinsics.f(aliasRegistrationType, userDocument)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "CPF";
            }
            if (z) {
                strR = ((AliasRegistrationType.Email) aliasRegistrationType).f80388b;
            } else if (aliasRegistrationType instanceof AliasRegistrationType.Phone) {
                PhoneNumber phoneNumber = ((AliasRegistrationType.Phone) aliasRegistrationType).f80391b;
                strR = a0.d.r(hx7.a.J(phoneNumber.f80395a), phoneNumber.f80396b);
            } else {
                if (!Intrinsics.f(aliasRegistrationType, randomKey) && !Intrinsics.f(aliasRegistrationType, userDocument)) {
                    throw new NoWhenBranchMatchedException();
                }
                strR = null;
            }
            l8a.c cVar = new l8a.c(str, strR);
            AliasRegistrationType.Inputtable inputtable = aliasRegistrationType instanceof AliasRegistrationType.Inputtable ? (AliasRegistrationType.Inputtable) aliasRegistrationType : null;
            l8a.e eVar = new l8a.e(cVar, inputtable != null ? inputtable.getF80392c() : null);
            wj0.b bVar = new wj0.b("create_alias");
            String strA = vca.a.a((AccountId) this.f207048y);
            this.v = 1;
            obj2 = aliasManagementService.createAlias(eVar, bVar, "PIX", strA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return ((l8a.m) obj2).getOperationId();
    }

    private final Object c(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            AliasManagementService aliasManagementService = ((n8a.o) this.f207046w).f213340a;
            PixKey pixKey = (PixKey) this.f207047x;
            Intrinsics.checkNotNullParameter(pixKey, "<this>");
            l8a.f fVar = new l8a.f(k8a.c.a(pixKey));
            wj0.b bVar = new wj0.b("delete_alias");
            String strA = vca.a.a((AccountId) this.f207048y);
            this.v = 1;
            obj2 = aliasManagementService.deleteAlias(fVar, bVar, "PIX", strA, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return ((l8a.m) obj2).getOperationId();
    }

    private final Object n(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            AliasManagementService aliasManagementService = ((n8a.o) this.f207046w).f213340a;
            String f80482a = ((PortabilityRequestArgsModel) this.f207047x).getF80482a();
            wj0.b bVar = new wj0.b("request_alias_migration");
            String strA = vca.a.a((AccountId) this.f207048y);
            this.v = 1;
            if (aliasManagementService.claimAlias(f80482a, bVar, "PIX", strA, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        return Unit.f186387a;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                c0 c0Var = new c0((com.revolut.sso.impl.ui.combined_authentication.flow.c) this.f207047x, (Claim) this.f207048y, continuation, 0);
                c0Var.f207046w = obj2;
                return c0Var;
            case 1:
                return new c0((com.revolut.feature.insurance_car.impl.ui.flow.onboarding.main.j) this.f207046w, (String) this.f207047x, (rl7.a) this.f207048y, continuation, 1);
            case 2:
                return new c0((mn1.b0) this.f207047x, (h1j.d) this.f207048y, continuation, 2);
            case 3:
                return new c0((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f207046w, (Trip) this.f207047x, (iod.b) this.f207048y, continuation, 3);
            case 4:
                return new c0((com.revolut.feature.spending_analytics.impl.ui.rev10.analytics_dashboard.trips.flow.a) this.f207046w, (Trip) this.f207047x, (ard.h) this.f207048y, continuation, 4);
            case 5:
                return new c0((mqc.e) this.f207046w, (String) this.f207047x, (cqc.c) this.f207048y, continuation, 5);
            case 6:
                return new c0((mqc.k) this.f207047x, (String) this.f207048y, continuation, 6);
            case 7:
                c0 c0Var2 = new c0((mqd.o) this.f207048y, continuation, 7);
                c0Var2.f207046w = obj2;
                return c0Var2;
            case 8:
                c0 c0Var3 = new c0((mqg.e) this.f207047x, (String) this.f207048y, continuation, 8);
                c0Var3.f207046w = obj2;
                return c0Var3;
            case 9:
                return new c0((mv2.o) this.f207046w, (t61.g) this.f207047x, (String) this.f207048y, continuation, 9);
            case 10:
                return new c0((xv.p) this.f207046w, (dx.o) this.f207047x, (xv.m) this.f207048y, continuation, 10);
            case 11:
                return new c0((a1) this.f207046w, (Image) this.f207047x, (ImageView) this.f207048y, continuation, 11);
            case 12:
                return new c0((View) this.f207046w, (c1) this.f207047x, (Image) this.f207048y, continuation, 12);
            case 13:
                c0 c0Var4 = new c0((List) this.f207047x, (c1) this.f207048y, continuation, 13);
                c0Var4.f207046w = obj2;
                return c0Var4;
            case 14:
                c0 c0Var5 = new c0((mzh.e) this.f207048y, continuation, 14);
                c0Var5.f207046w = obj2;
                return c0Var5;
            case 15:
                c0 c0Var6 = new c0((y0) this.f207047x, (n1g.r) this.f207048y, continuation, 15);
                c0Var6.f207046w = obj2;
                return c0Var6;
            case 16:
                return new c0((n23.k) this.f207047x, (String) this.f207048y, this.f207046w, continuation);
            case 17:
                c0 c0Var7 = new c0((n2d.g) this.f207047x, (AlertsWidgetContext) this.f207048y, continuation, 17);
                c0Var7.f207046w = obj2;
                return c0Var7;
            case 18:
                c0 c0Var8 = new c0((n2d.g) this.f207047x, (AlertItem) this.f207048y, continuation, 18);
                c0Var8.f207046w = obj2;
                return c0Var8;
            case 19:
                return new c0((t0) this.f207046w, (kc8.a) this.f207047x, (CardOrderAccountWrapper) this.f207048y, continuation, 19);
            case 20:
                return new c0((n4d.m) this.f207046w, (String) this.f207047x, (Map) this.f207048y, continuation, 20);
            case 21:
                return new c0((n4d.m) this.f207046w, (UUID) this.f207047x, (String) this.f207048y, continuation, 21);
            case 22:
                return new c0((r0) this.f207046w, (FavouritesAssetTypeKey) this.f207047x, (String) this.f207048y, continuation, 22);
            case 23:
                return new c0((r0) this.f207046w, (FavouritesAssetTypeKey) this.f207047x, (Pair) this.f207048y, continuation, 23);
            case 24:
                return new c0((List) this.f207046w, (r0) this.f207047x, (FavouritesAssetTypeKey) this.f207048y, continuation, 24);
            case 25:
                return new c0((r0) this.f207046w, (String) this.f207047x, (List) this.f207048y, continuation, 25);
            case 26:
                return new c0((n8a.o) this.f207046w, (AliasRegistrationType) this.f207047x, (AccountId) this.f207048y, continuation, 26);
            case 27:
                return new c0((n8a.o) this.f207046w, (PixKey) this.f207047x, (AccountId) this.f207048y, continuation, 27);
            case 28:
                return new c0((n8a.o) this.f207046w, (PortabilityRequestArgsModel) this.f207047x, (AccountId) this.f207048y, continuation, 28);
            default:
                return new c0((n8a.o) this.f207046w, (TokenVerificationRequest) this.f207047x, (AccountId) this.f207048y, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((c0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00ad, code lost:
    
        if (r0 == r8) goto L36;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:425:0x09a7  */
    /* JADX WARN: Removed duplicated region for block: B:427:0x09c3  */
    /* JADX WARN: Removed duplicated region for block: B:565:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:573:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:580:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [com.revolut.core.ui_kit.models.Style, java.lang.String, java.util.List, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r30v3, types: [com.revolut.core.ui_kit.models.Clause] */
    /* JADX WARN: Type inference failed for: r30v4 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mll.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207047x = obj2;
        this.f207048y = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f207048y = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(n23.k kVar, String str, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.u = 16;
        this.f207047x = kVar;
        this.f207048y = str;
        this.f207046w = obj2;
    }
}
