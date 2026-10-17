package hcl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class e1 {

    @NotNull
    public static final d1 Companion = new d1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f150976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f150977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f150978c;

    public /* synthetic */ e1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(c1.f150953a.getDescriptor(), i, 7);
            throw null;
        }
        this.f150976a = str;
        this.f150977b = str2;
        this.f150978c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) obj2;
        return Intrinsics.f(this.f150976a, e1Var.f150976a) && Intrinsics.f(this.f150977b, e1Var.f150977b) && Intrinsics.f(this.f150978c, e1Var.f150978c);
    }

    public final int hashCode() {
        return this.f150978c.hashCode() + p.a.c(this.f150976a.hashCode() * 31, 31, this.f150977b);
    }

    public e1(String icon, String name, String url2) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(url2, "url");
        this.f150976a = icon;
        this.f150977b = name;
        this.f150978c = url2;
    }
}
