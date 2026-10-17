package wf4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f296968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f296969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f296970c;

    public g(TextLocalisedClause title, TextLocalisedClause description, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f296968a = items;
        this.f296969b = title;
        this.f296970c = description;
    }

    @Override // cli.p
    public final List c() {
        return this.f296968a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f296968a.equals(gVar.f296968a) && this.f296969b.equals(gVar.f296969b) && this.f296970c.equals(gVar.f296970c);
    }

    public final int hashCode() {
        return this.f296970c.hashCode() + t61.a.a(this.f296968a.hashCode() * 31, 31, this.f296969b);
    }
}
