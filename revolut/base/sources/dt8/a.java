package dt8;

import aii.e;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117398a;

    public a(String redirectUrl) {
        Intrinsics.checkNotNullParameter(redirectUrl, "redirectUrl");
        this.f117398a = redirectUrl;
    }

    public final String b() {
        return this.f117398a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof a) && Intrinsics.f(this.f117398a, ((a) obj2).f117398a);
    }

    public final int hashCode() {
        return this.f117398a.hashCode();
    }
}
