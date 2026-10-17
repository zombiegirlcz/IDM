package sv1;

import com.revolut.feature.apm.core.models.alias.Alias;
import com.revolut.feature.apm.core.models.alias.AliasType;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z80.b f265825a;

    public a(z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.f265825a = phoneToolsProvider;
    }

    public final String a(Alias alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        AliasType aliasType = alias.f61878a;
        String str = alias.f61879b;
        if (Intrinsics.f(aliasType, AliasType.ALPHANUMERIC.f61892b) || Intrinsics.f(aliasType, AliasType.TAX_NUMBER.f61897b) || Intrinsics.f(aliasType, AliasType.DOCUMENT_ID.f61893b) || Intrinsics.f(aliasType, AliasType.EMAIL.f61894b) || Intrinsics.f(aliasType, AliasType.REVTAG_EMAIL.f61896b)) {
            return str;
        }
        if (!Intrinsics.f(aliasType, AliasType.PHONE.f61895b)) {
            throw new NoWhenBranchMatchedException();
        }
        wi0.b.Companion.getClass();
        return z80.b.b(this.f265825a, str, "CO", null, 4);
    }
}
