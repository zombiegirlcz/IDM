package hcl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class p1 {

    @NotNull
    public static final o1 Companion = new o1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151106b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151107c;
    public final String d;

    public /* synthetic */ p1(int i, String str, String str2, String str3, String str4) {
        if (7 != (i & 7)) {
            qlm.j1.f(n1.f151087a.getDescriptor(), i, 7);
            throw null;
        }
        this.f151105a = str;
        this.f151106b = str2;
        this.f151107c = str3;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) obj2;
        return Intrinsics.f(this.f151105a, p1Var.f151105a) && Intrinsics.f(this.f151106b, p1Var.f151106b) && Intrinsics.f(this.f151107c, p1Var.f151107c) && Intrinsics.f(this.d, p1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f151105a.hashCode() * 31, 31, this.f151106b), 31, this.f151107c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public p1(String imageUrl, String position, String name, String str) {
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(position, "position");
        Intrinsics.checkNotNullParameter(name, "name");
        this.f151105a = imageUrl;
        this.f151106b = position;
        this.f151107c = name;
        this.d = str;
    }
}
