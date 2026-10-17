package ts;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes17.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f273851a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f273852b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f273853c;

    public h(TextLocalisedClause title, TextLocalisedClause description, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f273851a = title;
        this.f273852b = description;
        this.f273853c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f273853c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f273851a.equals(hVar.f273851a) && this.f273852b.equals(hVar.f273852b) && this.f273853c.equals(hVar.f273853c);
    }

    public final int hashCode() {
        return this.f273853c.hashCode() + t61.a.a(this.f273851a.hashCode() * 31, 31, this.f273852b);
    }
}
