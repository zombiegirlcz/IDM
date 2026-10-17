package u09;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f276097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f276098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c0 f276099c;
    public final ArrayList d;

    public a0(String id10, String text, c0 selection, ArrayList options) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(selection, "selection");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f276097a = id10;
        this.f276098b = text;
        this.f276099c = selection;
        this.d = options;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj2;
        return Intrinsics.f(this.f276097a, a0Var.f276097a) && Intrinsics.f(this.f276098b, a0Var.f276098b) && this.f276099c == a0Var.f276099c && this.d.equals(a0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f276099c.hashCode() + p.a.c(this.f276097a.hashCode() * 31, 31, this.f276098b)) * 31);
    }
}
