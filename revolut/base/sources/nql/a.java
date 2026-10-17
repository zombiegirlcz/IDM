package nql;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import vo8.b;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f218481a;

    public a(Function0 ssoReauthenticationInterceptionEnabled) {
        Intrinsics.checkNotNullParameter(ssoReauthenticationInterceptionEnabled, "ssoReauthenticationInterceptionEnabled");
        this.f218481a = ssoReauthenticationInterceptionEnabled;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f218481a, ((a) obj2).f218481a);
    }

    public final int hashCode() {
        return this.f218481a.hashCode();
    }

    public a() {
        this(new b(5));
    }
}
