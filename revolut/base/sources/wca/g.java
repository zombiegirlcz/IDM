package wca;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class g implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f296370a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f296371b;

    public g(TextLocalisedClause subtitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f296370a = subtitle;
        this.f296371b = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f296371b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof g)) {
            return false;
        }
        g gVar = (g) obj2;
        return this.f296370a.equals(gVar.f296370a) && this.f296371b.equals(gVar.f296371b);
    }

    public final int hashCode() {
        return this.f296371b.hashCode() + (this.f296370a.hashCode() * 31);
    }
}
