package uv1;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.RegisterAlias$Alias;
import com.revolut.feature.crypto.withdraw.api.models.CryptoAddress;
import com.revolut.feature.terms.api.model.TermsScope;
import com.revolut.feature.topup_screen.common.CardDetails;
import com.revolut.retail.core.navigation.FeatureCommand;
import com.revolut.retail.feature.api.userauth.navigation.UserOnboardingNavigationProvider$UseCase;
import com.revolut.sso.impl.domain.models.Claim;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes20.dex */
public final class c0 extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f283263w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Object f283264x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Object f283265y;
    public final /* synthetic */ Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(int i, Object obj2, Object obj3, Object obj4, Object obj5, Continuation continuation) {
        super(1, continuation);
        this.u = i;
        this.f283263w = obj2;
        this.f283264x = obj3;
        this.f283265y = obj4;
        this.z = obj5;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new c0((d0) this.f283264x, (Alias) this.z, continuation);
            case 1:
                return new c0(1, (com.revolut.feature.topup_screen.impl.flows.topup.flow.i) this.f283263w, (String) this.f283264x, (String) this.f283265y, (CardDetails) this.z, continuation);
            case 2:
                return new c0((v73.o) this.f283264x, (String) this.f283265y, (j60.a) this.z, continuation, 2);
            case 3:
                return new c0((Ref$BooleanRef) this.f283264x, (CoroutineScope) this.f283265y, (ved.o) this.z, continuation, 3);
            case 4:
                return new c0((vg7.i) this.f283264x, this.f283265y, (vg7.a) this.z, continuation, 4);
            case 5:
                return new c0((com.revolut.feature.product.onboarding.flow.a) this.f283265y, (vja.g) this.z, continuation, 5);
            case 6:
                return new c0((vjk.d) this.f283265y, (Function0) this.z, continuation, 6);
            case 7:
                return new c0((com.revolut.feature.crypto.withdraw.impl.ui_v3.send.confirmation.a) this.f283264x, (TermsScope) this.f283265y, (wi0.b) this.z, continuation, 7);
            case 8:
                return new c0((com.revolut.feature.travel.hotels.impl.ui_kompot.screen.checkout.a) this.f283264x, (afi.a) this.f283265y, (ecg.j) this.z, continuation, 8);
            case 9:
                return new c0(9, (wc2.e) this.f283263w, (RegisterAlias$Alias) this.f283264x, (jx1.g) this.f283265y, (Function1) this.z, continuation);
            case 10:
                return new c0((wc2.e) this.f283264x, (RegisterAlias$Alias) this.f283265y, (String) this.z, continuation, 10);
            case 11:
                return new c0(11, (wll.e) this.f283263w, (String) this.f283264x, (Claim) this.f283265y, (Set) this.z, continuation);
            case 12:
                return new c0(12, (wll.e) this.f283263w, (String) this.f283264x, (gkl.m) this.f283265y, (Set) this.z, continuation);
            case 13:
                return new c0((com.revolut.feature.workflow.engine.sdk_flow.f) this.f283265y, (od9.e) this.z, continuation, 13);
            case 14:
                return new c0((com.revolut.feature.workflow.engine.sdk_flow.f) this.f283264x, (String) this.f283265y, (od9.e) this.z, continuation, 14);
            case 15:
                return new c0((xd2.f) this.f283263w, (String) this.f283264x, (Alias) this.z, (String) this.f283265y, continuation);
            case 16:
                return new c0((xd2.f) this.f283264x, (Alias) this.z, (String) this.f283265y, continuation);
            case 17:
                return new c0((xd2.f) this.f283263w, (Alias) this.z, (jx1.g) this.f283264x, (xd2.o) this.f283265y, continuation, 17);
            case 18:
                return new c0((xd2.f) this.f283263w, (Alias) this.z, (jx1.g) this.f283264x, (xd2.o) this.f283265y, continuation, 18);
            case 19:
                return new c0((yff.u) this.f283264x, (String) this.f283265y, (String) this.z, continuation, 19);
            case 20:
                return new c0((com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) this.f283264x, (UserOnboardingNavigationProvider$UseCase) this.f283265y, (yji.l) this.z, continuation, 20);
            case 21:
                return new c0((com.revolut.retail.feature.impl.userauth.screen.revolut_sso.c) this.f283264x, (UserOnboardingNavigationProvider$UseCase) this.f283265y, (FeatureCommand) this.z, continuation, 21);
            case 22:
                return new c0((com.revolut.feature.crypto.withdraw.impl.ui_v3.a) this.f283265y, (x2j.b) this.z, continuation, 22);
            default:
                return new c0((com.revolut.feature.crypto.withdraw.impl.ui_v3.a) this.f283264x, (CryptoAddress) this.f283265y, (xi0.b) this.z, continuation, 23);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((c0) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x064f  */
    /* JADX WARN: Removed duplicated region for block: B:306:0x078e  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x0841  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x0846  */
    /* JADX WARN: Removed duplicated region for block: B:375:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:377:0x0909  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:506:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:519:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:523:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:524:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:526:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:528:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0142  */
    /* JADX WARN: Type inference failed for: r1v20 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3034
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: uv1.c0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f283264x = obj2;
        this.f283265y = obj3;
        this.z = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Object obj2, Object obj3, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f283265y = obj2;
        this.z = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(d0 d0Var, Alias alias, Continuation continuation) {
        super(1, continuation);
        this.u = 0;
        this.f283264x = d0Var;
        this.z = alias;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xd2.f fVar, Alias alias, String str, Continuation continuation) {
        super(1, continuation);
        this.u = 16;
        this.f283264x = fVar;
        this.z = alias;
        this.f283265y = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(xd2.f fVar, Alias alias, jx1.g gVar, Function1 function1, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f283263w = fVar;
        this.z = alias;
        this.f283264x = gVar;
        this.f283265y = function1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(xd2.f fVar, String str, Alias alias, String str2, Continuation continuation) {
        super(1, continuation);
        this.u = 15;
        this.f283263w = fVar;
        this.f283264x = str;
        this.z = alias;
        this.f283265y = str2;
    }
}
