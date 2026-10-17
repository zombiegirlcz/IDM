package ei4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import tx0.r3;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f126402a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f126403b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f126404c;
    public final r3 d;
    public final TextLocalisedClause e;

    public j(ArrayList items, TextLocalisedClause title, TextLocalisedClause description, r3 endImage, TextLocalisedClause buttonTitle) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(endImage, "endImage");
        Intrinsics.checkNotNullParameter(buttonTitle, "buttonTitle");
        this.f126402a = items;
        this.f126403b = title;
        this.f126404c = description;
        this.d = endImage;
        this.e = buttonTitle;
    }

    @Override // cli.p
    public final List c() {
        return this.f126402a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f126402a.equals(jVar.f126402a) && this.f126403b.equals(jVar.f126403b) && this.f126404c.equals(jVar.f126404c) && this.d.equals(jVar.d) && this.e.equals(jVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.f275236a.hashCode() + t61.a.a(t61.a.a(this.f126402a.hashCode() * 31, 31, this.f126403b), 31, this.f126404c)) * 31);
    }
}
