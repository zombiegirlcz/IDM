package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class d1 {

    @NotNull
    public static final c1 Companion = new c1();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f219056c;
    public final String d;

    public /* synthetic */ d1(int i, String str, String str2, String str3, String str4) {
        if (15 != (i & 15)) {
            qlm.j1.f(b1.f219049a.getDescriptor(), i, 15);
            throw null;
        }
        this.f219054a = str;
        this.f219055b = str2;
        this.f219056c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj2;
        return Intrinsics.f(this.f219054a, d1Var.f219054a) && Intrinsics.f(this.f219055b, d1Var.f219055b) && Intrinsics.f(this.f219056c, d1Var.f219056c) && Intrinsics.f(this.d, d1Var.d);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f219054a.hashCode() * 31, 31, this.f219055b), 31, this.f219056c);
        String str = this.d;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public d1(String id10, String title, String asset, String str) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(asset, "asset");
        this.f219054a = id10;
        this.f219055b = title;
        this.f219056c = asset;
        this.d = str;
    }
}
