package gqc;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qlm.j1;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class x {

    @NotNull
    public static final w Companion = new w();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f145668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f145669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f145670c;

    public /* synthetic */ x(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            j1.f(v.f145667a.getDescriptor(), i, 7);
            throw null;
        }
        this.f145668a = str;
        this.f145669b = str2;
        this.f145670c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x)) {
            return false;
        }
        x xVar = (x) obj2;
        return Intrinsics.f(this.f145668a, xVar.f145668a) && Intrinsics.f(this.f145669b, xVar.f145669b) && Intrinsics.f(this.f145670c, xVar.f145670c);
    }

    public final int hashCode() {
        return this.f145670c.hashCode() + p.a.c(this.f145668a.hashCode() * 31, 31, this.f145669b);
    }
}
