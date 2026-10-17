package buk;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f18899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f18900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f18901c;

    public f(TextLocalisedClause title, TextLocalisedClause description, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f18899a = title;
        this.f18900b = description;
        this.f18901c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f18901c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof f)) {
            return false;
        }
        f fVar = (f) obj2;
        return this.f18899a.equals(fVar.f18899a) && this.f18900b.equals(fVar.f18900b) && this.f18901c.equals(fVar.f18901c);
    }

    public final int hashCode() {
        return this.f18901c.hashCode() + t61.a.a(this.f18899a.hashCode() * 31, 31, this.f18900b);
    }
}
