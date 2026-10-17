package m9d;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.models.TrackableClause;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class e0 implements h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f203691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TrackableClause f203692b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f203693c;

    public e0(TextLocalisedClause smallTitle, TrackableClause bigTitle, TextLocalisedClause toolbarTitle) {
        Intrinsics.checkNotNullParameter(smallTitle, "smallTitle");
        Intrinsics.checkNotNullParameter(bigTitle, "bigTitle");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        this.f203691a = smallTitle;
        this.f203692b = bigTitle;
        this.f203693c = toolbarTitle;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return this.f203691a.equals(e0Var.f203691a) && this.f203692b.equals(e0Var.f203692b) && this.f203693c.equals(e0Var.f203693c);
    }

    public final int hashCode() {
        return this.f203693c.hashCode() + ((this.f203692b.hashCode() + (this.f203691a.hashCode() * 31)) * 31);
    }
}
