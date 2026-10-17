package lml;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f197097a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f197098b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f197099c;

    public g(TextLocalisedClause title, TextLocalisedClause description, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f197097a = title;
        this.f197098b = description;
        this.f197099c = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f197099c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f197097a.equals(gVar.f197097a) && this.f197098b.equals(gVar.f197098b) && this.f197099c.equals(gVar.f197099c);
    }

    public final int hashCode() {
        return this.f197099c.hashCode() + t61.a.a(this.f197097a.hashCode() * 31, 31, this.f197098b);
    }
}
