package ts0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f273884a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f273885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f273886c;

    public l0(Clause title, String id10, List fractions) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(fractions, "fractions");
        this.f273884a = id10;
        this.f273885b = title;
        this.f273886c = fractions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj2;
        return Intrinsics.f(this.f273884a, l0Var.f273884a) && Intrinsics.f(this.f273885b, l0Var.f273885b) && Intrinsics.f(this.f273886c, l0Var.f273886c);
    }

    public final int hashCode() {
        return this.f273886c.hashCode() + p.a.a(this.f273884a.hashCode() * 31, 31, this.f273885b);
    }
}
