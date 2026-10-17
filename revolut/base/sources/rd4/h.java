package rd4;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.ArrayList;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f253338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f253339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f253340c;

    public h(TextLocalisedClause title, TextClause subtitle, ArrayList items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f253338a = title;
        this.f253339b = subtitle;
        this.f253340c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f253340c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f253338a.equals(hVar.f253338a) && this.f253339b.equals(hVar.f253339b) && this.f253340c.equals(hVar.f253340c);
    }

    public final int hashCode() {
        return this.f253340c.hashCode() + v7.b(this.f253338a.hashCode() * 31, 31, this.f253339b);
    }
}
