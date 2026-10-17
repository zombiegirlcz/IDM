package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class w0 {

    @NotNull
    public static final v0 Companion = new v0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219137b;

    public /* synthetic */ w0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            qlm.j1.f(u0.f219133a.getDescriptor(), i, 3);
            throw null;
        }
        this.f219136a = str;
        this.f219137b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj2;
        return Intrinsics.f(this.f219136a, w0Var.f219136a) && Intrinsics.f(this.f219137b, w0Var.f219137b);
    }

    public final int hashCode() {
        return this.f219137b.hashCode() + (this.f219136a.hashCode() * 31);
    }

    public w0(String title, String deeplink) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        this.f219136a = title;
        this.f219137b = deeplink;
    }
}
