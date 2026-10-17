package fml;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f136480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f136481b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f136482c;
    public final g d;

    public h(TextLocalisedClause title, aim.e items, g primaryActionButton, g secondaryActionButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(primaryActionButton, "primaryActionButton");
        Intrinsics.checkNotNullParameter(secondaryActionButton, "secondaryActionButton");
        this.f136480a = title;
        this.f136481b = items;
        this.f136482c = primaryActionButton;
        this.d = secondaryActionButton;
    }

    @Override // cli.p
    public final List c() {
        return this.f136481b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f136480a.equals(hVar.f136480a) && Intrinsics.f(this.f136481b, hVar.f136481b) && this.f136482c.equals(hVar.f136482c) && this.d.equals(hVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f136482c.hashCode() + p.a.d(this.f136480a.hashCode() * 31, 31, this.f136481b)) * 31);
    }
}
