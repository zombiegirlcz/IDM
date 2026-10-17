package ntj;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@mlm.g
public final class a1 {

    @NotNull
    public static final z0 Companion = new z0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f219045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f219046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w0 f219047c;

    public /* synthetic */ a1(int i, String str, String str2, w0 w0Var) {
        if (7 != (i & 7)) {
            qlm.j1.f(y0.f219143a.getDescriptor(), i, 7);
            throw null;
        }
        this.f219045a = str;
        this.f219046b = str2;
        this.f219047c = w0Var;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a1)) {
            return false;
        }
        a1 a1Var = (a1) obj2;
        return Intrinsics.f(this.f219045a, a1Var.f219045a) && Intrinsics.f(this.f219046b, a1Var.f219046b) && Intrinsics.f(this.f219047c, a1Var.f219047c);
    }

    public final int hashCode() {
        return this.f219047c.hashCode() + p.a.c(this.f219045a.hashCode() * 31, 31, this.f219046b);
    }

    public a1(String title, String backgroundAsset, w0 action) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(backgroundAsset, "backgroundAsset");
        Intrinsics.checkNotNullParameter(action, "action");
        this.f219045a = title;
        this.f219046b = backgroundAsset;
        this.f219047c = action;
    }
}
