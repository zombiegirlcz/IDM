package okl;

import com.revolut.sso.impl.domain.models.AuthResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class g0 extends kotlin.jvm.internal.q implements Function0 {
    public final /* synthetic */ com.revolut.sso.impl.ui.auth.n f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ AuthResult.Success f226182g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.revolut.sso.impl.ui.auth.n nVar, AuthResult.Success success) {
        super(0, kotlin.jvm.internal.s.class, "finishAuthentication", "launchEnablePasskeyPromptScreen$lambda$0$finishAuthentication(Lcom/revolut/sso/impl/ui/auth/AuthenticationFlowModel;Lcom/revolut/sso/impl/domain/models/AuthResult$Success;)V", 0);
        this.f = nVar;
        this.f226182g = success;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        com.revolut.sso.impl.ui.auth.n.f3(this.f, this.f226182g);
        return Unit.f186387a;
    }
}
