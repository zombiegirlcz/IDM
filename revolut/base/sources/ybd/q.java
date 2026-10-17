package ybd;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes7.dex */
@mlm.g
public final class q {

    @NotNull
    public static final p Companion = new p();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f312265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f312266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f312267c;
    public final String d;

    public /* synthetic */ q(int i, int i2, int i3, String str, String str2) {
        if (15 != (i & 15)) {
            j1.f(o.f312260a.getDescriptor(), i, 15);
            throw null;
        }
        this.f312265a = i2;
        this.f312266b = i3;
        this.f312267c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f312265a == qVar.f312265a && this.f312266b == qVar.f312266b && Intrinsics.f(this.f312267c, qVar.f312267c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(j6.a.b(this.f312266b, Integer.hashCode(this.f312265a) * 31, 31), 31, this.f312267c);
    }

    public q(int i, int i2, String backgroundColor, String progressColor) {
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(progressColor, "progressColor");
        this.f312265a = i;
        this.f312266b = i2;
        this.f312267c = backgroundColor;
        this.d = progressColor;
    }
}
