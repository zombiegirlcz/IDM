package j1f;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes8.dex */
@mlm.g
public final class g0 {

    @NotNull
    public static final c0 Companion = new c0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f170381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f170382b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f170383c;

    public /* synthetic */ g0(int i, String str, String str2, f0 f0Var) {
        if (7 != (i & 7)) {
            j1.f(b0.f170366a.getDescriptor(), i, 7);
            throw null;
        }
        this.f170381a = str;
        this.f170382b = str2;
        this.f170383c = f0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj2;
        return Intrinsics.f(this.f170381a, g0Var.f170381a) && Intrinsics.f(this.f170382b, g0Var.f170382b) && Intrinsics.f(this.f170383c, g0Var.f170383c);
    }

    public final int hashCode() {
        return this.f170383c.hashCode() + p.a.c(this.f170381a.hashCode() * 31, 31, this.f170382b);
    }

    public g0(String partnerPointsBuyRate, String partnerUnit, f0 display) {
        Intrinsics.checkNotNullParameter(partnerPointsBuyRate, "partnerPointsBuyRate");
        Intrinsics.checkNotNullParameter(partnerUnit, "partnerUnit");
        Intrinsics.checkNotNullParameter(display, "display");
        this.f170381a = partnerPointsBuyRate;
        this.f170382b = partnerUnit;
        this.f170383c = display;
    }
}
