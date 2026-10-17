package xkl;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.sso.api.R$string;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
public final class k implements zl0.a {

    @NotNull
    public static final j Companion = new j();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f01.a f306891a;

    public k(f01.a uiKitResources) {
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        this.f306891a = uiKitResources;
    }

    @Override // zl0.a
    public final wl0.g a() {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.revolut_sso_authorisation_biometrics, null, null, 14);
        f01.a aVar = this.f306891a;
        return new wl0.g(aVar.b(textLocalisedClause).toString(), aVar.b(new TextLocalisedClause(R$string.revolut_sso_login_biometric_prompt_cancel, null, null, 14)).toString(), false);
    }

    @Override // zl0.a
    public final wl0.f b() {
        throw new IllegalStateException("Custom biometric is not yet supported");
    }
}
