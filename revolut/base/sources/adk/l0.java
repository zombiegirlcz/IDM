package adk;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final s f3403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f3404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f3405c;
    public final String d;
    public final v e;

    public /* synthetic */ l0(int i, s sVar, String str, String str2, String str3, v vVar) {
        if (31 != (i & 31)) {
            qlm.j1.f(j0.f3400a.getDescriptor(), i, 31);
            throw null;
        }
        this.f3403a = sVar;
        this.f3404b = str;
        this.f3405c = str2;
        this.d = str3;
        this.e = vVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f3403a, l0Var.f3403a) && Intrinsics.f(this.f3404b, l0Var.f3404b) && Intrinsics.f(this.f3405c, l0Var.f3405c) && Intrinsics.f(this.d, l0Var.d) && Intrinsics.f(this.e, l0Var.e);
    }

    public final int hashCode() {
        s sVar = this.f3403a;
        int iC = p.a.c(p.a.c((sVar == null ? 0 : sVar.hashCode()) * 31, 31, this.f3404b), 31, this.f3405c);
        String str = this.d;
        return this.e.hashCode() + ((iC + (str != null ? str.hashCode() : 0)) * 31);
    }

    public l0(s sVar, String backgroundImageUrl, String title, String str, v bottomSheet) {
        Intrinsics.checkNotNullParameter(backgroundImageUrl, "backgroundImageUrl");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(bottomSheet, "bottomSheet");
        this.f3403a = sVar;
        this.f3404b = backgroundImageUrl;
        this.f3405c = title;
        this.d = str;
        this.e = bottomSheet;
    }
}
