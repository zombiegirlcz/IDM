package nv7;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f219544a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f219545b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f219546c;

    public h(TextClause title, TextClause textClause, List navBarMenuItems) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(navBarMenuItems, "navBarMenuItems");
        this.f219544a = title;
        this.f219545b = textClause;
        this.f219546c = navBarMenuItems;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f219544a.equals(hVar.f219544a) && Intrinsics.f(this.f219545b, hVar.f219545b) && Intrinsics.f(this.f219546c, hVar.f219546c);
    }

    public final int hashCode() {
        int iHashCode = this.f219544a.hashCode() * 31;
        Clause clause = this.f219545b;
        return this.f219546c.hashCode() + ((iHashCode + (clause == null ? 0 : clause.hashCode())) * 31);
    }
}
