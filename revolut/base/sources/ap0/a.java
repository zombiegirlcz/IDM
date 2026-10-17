package ap0;

import com.revolut.core.ui_kit.models.Clause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f8018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f8019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f8020c;
    public final boolean d;

    public a(Clause title, List suggestions, boolean z, boolean z3) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(suggestions, "suggestions");
        this.f8018a = title;
        this.f8019b = suggestions;
        this.f8020c = z;
        this.d = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f8018a, aVar.f8018a) && Intrinsics.f(this.f8019b, aVar.f8019b) && this.f8020c == aVar.f8020c && this.d == aVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + j6.a.c(p.a.d(this.f8018a.hashCode() * 31, 31, this.f8019b), 31, this.f8020c);
    }
}
