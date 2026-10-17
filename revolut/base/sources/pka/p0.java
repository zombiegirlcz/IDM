package pka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class p0 {

    @NotNull
    public static final o0 Companion = new o0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f236983a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f236984b;

    public /* synthetic */ p0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(n0.f236980a.getDescriptor(), i, 3);
            throw null;
        }
        this.f236983a = str;
        this.f236984b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj2;
        return Intrinsics.f(this.f236983a, p0Var.f236983a) && Intrinsics.f(this.f236984b, p0Var.f236984b);
    }

    public final int hashCode() {
        return this.f236984b.hashCode() + (this.f236983a.hashCode() * 31);
    }

    public p0(String title, String link) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f236983a = title;
        this.f236984b = link;
    }
}
