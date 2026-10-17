package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class n1 {

    @NotNull
    public static final m1 Companion = new m1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294934c;
    public final String d;

    public /* synthetic */ n1(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(l1.f294909a.getDescriptor(), i, 15);
            throw null;
        }
        this.f294932a = str;
        this.f294933b = str2;
        this.f294934c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n1)) {
            return false;
        }
        n1 n1Var = (n1) obj2;
        return Intrinsics.f(this.f294932a, n1Var.f294932a) && Intrinsics.f(this.f294933b, n1Var.f294933b) && Intrinsics.f(this.f294934c, n1Var.f294934c) && Intrinsics.f(this.d, n1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(p.a.c(this.f294932a.hashCode() * 31, 31, this.f294933b), 31, this.f294934c);
    }

    public n1(String title, String subtitle, String cardUrl, String logoUrl) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(cardUrl, "cardUrl");
        Intrinsics.checkNotNullParameter(logoUrl, "logoUrl");
        this.f294932a = title;
        this.f294933b = subtitle;
        this.f294934c = cardUrl;
        this.d = logoUrl;
    }
}
