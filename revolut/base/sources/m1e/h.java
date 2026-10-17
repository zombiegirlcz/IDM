package m1e;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f201481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f201482b;

    public h(TextLocalisedClause buttonText, List items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        this.f201481a = items;
        this.f201482b = buttonText;
    }

    @Override // cli.p
    public final List c() {
        return this.f201481a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f201481a, hVar.f201481a) && this.f201482b.equals(hVar.f201482b);
    }

    public final int hashCode() {
        return this.f201482b.hashCode() + (this.f201481a.hashCode() * 31);
    }
}
