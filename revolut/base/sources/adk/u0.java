package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class u0 {

    @NotNull
    public static final t0 Companion = new t0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f3433a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3435c;
    public final boolean d;
    public final String e;

    public u0(String title, String str, String imageUrl, String promotionalPromptType, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        Intrinsics.checkNotNullParameter(promotionalPromptType, "promotionalPromptType");
        this.f3433a = title;
        this.f3434b = str;
        this.f3435c = imageUrl;
        this.d = z;
        this.e = promotionalPromptType;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u0)) {
            return false;
        }
        u0 u0Var = (u0) obj2;
        return Intrinsics.f(this.f3433a, u0Var.f3433a) && Intrinsics.f(this.f3434b, u0Var.f3434b) && Intrinsics.f(this.f3435c, u0Var.f3435c) && this.d == u0Var.d && Intrinsics.f(this.e, u0Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.f3433a.hashCode() * 31;
        String str = this.f3434b;
        return this.e.hashCode() + j6.a.c(p.a.c((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f3435c), 31, this.d);
    }

    public /* synthetic */ u0(String str, String str2, String str3, String str4, boolean z, int i) {
        if (31 != (i & 31)) {
            qlm.j1.f(s0.f3431a.getDescriptor(), i, 31);
            throw null;
        }
        this.f3433a = str;
        this.f3434b = str2;
        this.f3435c = str3;
        this.d = z;
        this.e = str4;
    }
}
