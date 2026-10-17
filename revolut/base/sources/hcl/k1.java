package hcl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class k1 {

    @NotNull
    public static final j1 Companion = new j1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f151043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f151044b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f151045c;

    public /* synthetic */ k1(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(i1.f151017a.getDescriptor(), i, 7);
            throw null;
        }
        this.f151043a = str;
        this.f151044b = str2;
        this.f151045c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f151043a, k1Var.f151043a) && Intrinsics.f(this.f151044b, k1Var.f151044b) && Intrinsics.f(this.f151045c, k1Var.f151045c);
    }

    public final int hashCode() {
        return this.f151045c.hashCode() + p.a.c(this.f151043a.hashCode() * 31, 31, this.f151044b);
    }

    public k1(String icon, String title, String description) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f151043a = icon;
        this.f151044b = title;
        this.f151045c = description;
    }
}
