package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class a0 {

    @NotNull
    public static final z Companion = new z();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16296b;

    public /* synthetic */ a0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(y.f16348a.getDescriptor(), i, 3);
            throw null;
        }
        this.f16295a = str;
        this.f16296b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f16295a, a0Var.f16295a) && Intrinsics.f(this.f16296b, a0Var.f16296b);
    }

    public final int hashCode() {
        return this.f16296b.hashCode() + (this.f16295a.hashCode() * 31);
    }

    public a0(String text, String url2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f16295a = text;
        this.f16296b = url2;
    }
}
