package ie6;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.extension_auth.api.model.ExtensionAuthRequestData;
import com.revolut.sso.api.R$string;
import efm.d0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import nii.l0;
import nii.y0;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final class n extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public ExtensionAuthRequestData v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f160644w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f160645x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(r rVar, ExtensionAuthRequestData extensionAuthRequestData, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f160645x = rVar;
        this.v = extensionAuthRequestData;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new n(this.f160645x, this.v, continuation, 0);
            case 1:
                return new n(this.f160645x, continuation);
            default:
                return new n(this.f160645x, this.v, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((n) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objB;
        ExtensionAuthRequestData extensionAuthRequestData;
        int i = this.u;
        int i2 = 0;
        r rVar = this.f160645x;
        Continuation continuation = null;
        int i3 = 1;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.f160644w;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    m mVar = new m(rVar, this.v, continuation, i2);
                    this.f160644w = 1;
                    if (u0.b0(rVar.X(), "SECONDARY_BUTTON_TAG", mVar, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                r rVar2 = this.f160645x;
                fe6.a aVar2 = rVar2.o;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i6 = this.f160644w;
                if (i6 == 0) {
                    yhm.o.b(obj2);
                    d0<be6.k> verificationCode = ((be6.j) aVar2.f134453a).f14687a.getVerificationCode("app");
                    be6.h hVar = be6.h.f;
                    a0.b bVar = new a0.b(29);
                    verificationCode.getClass();
                    ufm.i iVar = new ufm.i(verificationCode, bVar, 1);
                    Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
                    ufm.n nVarI0 = te0.w.i0(iVar);
                    this.f160644w = 1;
                    objB = nim.a.b(nVarI0, this);
                    if (objB == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i6 != 1) {
                        if (i6 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        extensionAuthRequestData = this.v;
                        yhm.o.b(obj2);
                        rVar2.H2(rVar2.f160648q, new i9e.a(extensionAuthRequestData, 17));
                        long f72185c = extensionAuthRequestData.getF72185c();
                        rVar2.l2(new eh1.g(3, f72185c, rVar2, null), new id8.a(7));
                        return Unit.f186387a;
                    }
                    yhm.o.b(obj2);
                    objB = obj2;
                }
                ExtensionAuthRequestData requestData = (ExtensionAuthRequestData) objB;
                Intrinsics.h(requestData);
                aVar2.getClass();
                Intrinsics.checkNotNullParameter(requestData, "requestData");
                pfm.r rVarA = ((be6.j) aVar2.f134453a).a(requestData.getF72187h());
                this.v = requestData;
                this.f160644w = 2;
                if (nim.a.a(rVarA, this) == aVar3) {
                    return aVar3;
                }
                extensionAuthRequestData = requestData;
                rVar2.H2(rVar2.f160648q, new i9e.a(extensionAuthRequestData, 17));
                long f72185c2 = extensionAuthRequestData.getF72185c();
                rVar2.l2(new eh1.g(3, f72185c2, rVar2, null), new id8.a(7));
                return Unit.f186387a;
            default:
                ExtensionAuthRequestData extensionAuthRequestData2 = this.v;
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i21 = this.f160644w;
                if (i21 == 0) {
                    yhm.o.b(obj2);
                    m mVar2 = new m(rVar, extensionAuthRequestData2, continuation, i3);
                    this.f160644w = 1;
                    if (u0.b0(rVar.X(), "MAIN_BUTTON_TAG", mVar2, this) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i21 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                if (extensionAuthRequestData2 instanceof ExtensionAuthRequestData.AppChallenge) {
                    yji.l.b1(rVar, rVar.X1(new y0("REPORT_SUSPICIOUS_DIALOG_ID", new l0(new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_title, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_subtitle, null, null, 14), null, new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_suspisious, null, null, 14), new TextLocalisedClause(R$string.revolut_sso_login_rejection_popup_dismiss, null, null, 14), null, false, null, 996), false, 4)), null, new p(rVar, null, 2), 3);
                } else {
                    rVar.C2(aii.q.f5292a);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(r rVar, Continuation continuation) {
        super(2, continuation);
        this.u = 1;
        this.f160645x = rVar;
    }
}
