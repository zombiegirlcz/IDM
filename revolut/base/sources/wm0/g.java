package wm0;

import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.cert.Certificate;
import java.util.Enumeration;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KeyStore f298587a;

    public final Enumeration a() throws KeyStoreException {
        Enumeration<String> enumerationAliases = this.f298587a.aliases();
        Intrinsics.checkNotNullExpressionValue(enumerationAliases, "aliases(...)");
        return enumerationAliases;
    }

    public final boolean b(String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(alias, "alias");
        return this.f298587a.containsAlias(alias);
    }

    public final void c(String alias) throws KeyStoreException {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(alias, "alias");
        this.f298587a.deleteEntry(alias);
    }

    public final Certificate d(String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(alias, "alias");
        return this.f298587a.getCertificate(alias);
    }

    public final Key e(String alias) {
        Intrinsics.checkNotNullParameter(alias, "alias");
        Intrinsics.checkNotNullParameter(alias, "alias");
        return this.f298587a.getKey(alias, null);
    }

    public final boolean equals(Object obj2) {
        if (obj2 instanceof g) {
            return Intrinsics.f(this.f298587a, ((g) obj2).f298587a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f298587a.hashCode();
    }

    public final String toString() {
        return "KeyStoreWrapperImpl(keyStore=" + this.f298587a + ")";
    }
}
