package ba6;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b93.b f13952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f13953b;

    public n(b93.b code, String url2) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f13952a = code;
        this.f13953b = url2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f13952a, nVar.f13952a) && Intrinsics.f(this.f13953b, nVar.f13953b);
    }

    public final int hashCode() {
        return this.f13953b.hashCode() + (this.f13952a.hashCode() * 31);
    }
}
