package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class q6 {

    @NotNull
    public static final p6 Companion = new p6();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294990b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294991c;

    public /* synthetic */ q6(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(o6.f294967a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294989a = str;
        this.f294990b = str2;
        this.f294991c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q6)) {
            return false;
        }
        q6 q6Var = (q6) obj2;
        return Intrinsics.f(this.f294989a, q6Var.f294989a) && Intrinsics.f(this.f294990b, q6Var.f294990b) && Intrinsics.f(this.f294991c, q6Var.f294991c);
    }

    public final int hashCode() {
        return this.f294991c.hashCode() + p.a.c(this.f294989a.hashCode() * 31, 31, this.f294990b);
    }

    public q6(String title, String message, String actionLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
        this.f294989a = title;
        this.f294990b = message;
        this.f294991c = actionLabel;
    }
}
