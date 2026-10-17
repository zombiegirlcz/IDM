package u6b;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f277532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x6b.h f277533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final x6b.d f277534c;
    public final List d;

    public j(TextLocalisedClause headerTitle, x6b.h headerState, x6b.d actionButtonState, List items) {
        Intrinsics.checkNotNullParameter(headerTitle, "headerTitle");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(actionButtonState, "actionButtonState");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f277532a = headerTitle;
        this.f277533b = headerState;
        this.f277534c = actionButtonState;
        this.d = items;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f277532a.equals(jVar.f277532a) && Intrinsics.f(this.f277533b, jVar.f277533b) && Intrinsics.f(this.f277534c, jVar.f277534c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f277534c.hashCode() + ((this.f277533b.hashCode() + (this.f277532a.hashCode() * 31)) * 31)) * 31);
    }
}
