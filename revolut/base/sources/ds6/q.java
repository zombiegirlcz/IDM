package ds6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f117249a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117250b;

    public q(String websiteUrl, String str) {
        Intrinsics.checkNotNullParameter(websiteUrl, "websiteUrl");
        this.f117249a = websiteUrl;
        this.f117250b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f117249a, qVar.f117249a) && Intrinsics.f(this.f117250b, qVar.f117250b);
    }

    public final int hashCode() {
        int iHashCode = this.f117249a.hashCode() * 31;
        String str = this.f117250b;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
