package w5b;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@mlm.g
public final class b4 {

    @NotNull
    public static final a4 Companion = new a4();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294788b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294789c;

    public /* synthetic */ b4(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            qlm.j1.f(z3.f295091a.getDescriptor(), i, 7);
            throw null;
        }
        this.f294787a = str;
        this.f294788b = str2;
        this.f294789c = str3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b4)) {
            return false;
        }
        b4 b4Var = (b4) obj2;
        return Intrinsics.f(this.f294787a, b4Var.f294787a) && Intrinsics.f(this.f294788b, b4Var.f294788b) && Intrinsics.f(this.f294789c, b4Var.f294789c);
    }

    public final int hashCode() {
        return this.f294789c.hashCode() + p.a.c(this.f294787a.hashCode() * 31, 31, this.f294788b);
    }

    public b4(String title, String message, String actionLabel) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(actionLabel, "actionLabel");
        this.f294787a = title;
        this.f294788b = message;
        this.f294789c = actionLabel;
    }
}
