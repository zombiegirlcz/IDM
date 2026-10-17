package tll;

import bjl.p0;
import com.revolut.retail.feature.api.userauth.UserAuthFeatureApi$Toggles$DisableStrictPhoneValidation;
import com.revolut.sso.impl.domain.models.Identifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f272107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zzl.c f272108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p0 f272109c;

    public d(z80.b phoneToolsProvider, zzl.c regexMatcher, p0 revolutSsoDependenciesProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        Intrinsics.checkNotNullParameter(regexMatcher, "regexMatcher");
        Intrinsics.checkNotNullParameter(revolutSsoDependenciesProvider, "revolutSsoDependenciesProvider");
        this.f272107a = phoneToolsProvider;
        this.f272108b = regexMatcher;
        this.f272109c = revolutSsoDependenciesProvider;
    }

    public final boolean a(Identifier identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        if (identifier instanceof Identifier.Email) {
            return this.f272108b.a("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z0-9-]{2,63}$", ((Identifier.Email) identifier).f106149a);
        }
        if (!(identifier instanceof Identifier.Phone)) {
            throw new NoWhenBranchMatchedException();
        }
        if (!((rqk.k) this.f272109c).f.a(UserAuthFeatureApi$Toggles$DisableStrictPhoneValidation.f99270a)) {
            return true;
        }
        Identifier.Phone phone = (Identifier.Phone) identifier;
        return this.f272107a.k(phone.f106150a, phone.f106152c.f297794a);
    }
}
