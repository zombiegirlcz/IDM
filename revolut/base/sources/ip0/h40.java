package ip0;

import com.revolut.core.ui_kit.models.Clause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class h40 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f164505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f164506c;
    public final g40 d;

    public h40(String listId, Clause title, Clause subtitle, g40 state) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(state, "state");
        this.f164504a = listId;
        this.f164505b = title;
        this.f164506c = subtitle;
        this.d = state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h40)) {
            return false;
        }
        h40 h40Var = (h40) obj2;
        return Intrinsics.f(this.f164504a, h40Var.f164504a) && this.f164505b.equals(h40Var.f164505b) && this.f164506c.equals(h40Var.f164506c) && this.d.equals(h40Var.d);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + ((this.d.hashCode() + p.a.b(p.a.b(this.f164504a.hashCode() * 31, 31, this.f164505b), 31, this.f164506c)) * 31);
    }
}
