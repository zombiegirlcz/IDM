package cqh;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f108109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f108110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f108111c;

    public i(TextLocalisedClause title, TextLocalisedClause subtitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f108109a = items;
        this.f108110b = title;
        this.f108111c = subtitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f108109a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return this.f108109a.equals(iVar.f108109a) && this.f108110b.equals(iVar.f108110b) && this.f108111c.equals(iVar.f108111c);
    }

    public final int hashCode() {
        return this.f108111c.hashCode() + t61.a.a(this.f108109a.hashCode() * 31, 31, this.f108110b);
    }
}
