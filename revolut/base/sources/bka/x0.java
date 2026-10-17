package bka;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes5.dex */
@mlm.g
public final class x0 {

    @NotNull
    public static final w0 Companion = new w0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f16346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f16347b;

    public /* synthetic */ x0(int i, String str, String str2) {
        if (3 != (i & 3)) {
            j1.f(v0.f16342a.getDescriptor(), i, 3);
            throw null;
        }
        this.f16346a = str;
        this.f16347b = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.f16346a, x0Var.f16346a) && Intrinsics.f(this.f16347b, x0Var.f16347b);
    }

    public final int hashCode() {
        return this.f16347b.hashCode() + (this.f16346a.hashCode() * 31);
    }

    public x0(String title, String link) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(link, "link");
        this.f16346a = title;
        this.f16347b = link;
    }
}
