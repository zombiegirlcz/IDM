package s1l;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@mlm.g
public final class s0 {

    @NotNull
    public static final r0 Companion = new r0();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f259204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f259206c;

    public /* synthetic */ s0(int i, q qVar, String str, boolean z) {
        if (7 != (i & 7)) {
            j1.f(q0.f259202a.getDescriptor(), i, 7);
            throw null;
        }
        this.f259204a = qVar;
        this.f259205b = str;
        this.f259206c = z;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj2;
        return Intrinsics.f(this.f259204a, s0Var.f259204a) && Intrinsics.f(this.f259205b, s0Var.f259205b) && this.f259206c == s0Var.f259206c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f259206c) + p.a.c(this.f259204a.f259201a.hashCode() * 31, 31, this.f259205b);
    }

    public s0(q icon, String title, boolean z) {
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f259204a = icon;
        this.f259205b = title;
        this.f259206c = z;
    }
}
