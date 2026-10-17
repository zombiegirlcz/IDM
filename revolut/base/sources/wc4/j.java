package wc4;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class j implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f296340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f296341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f296342c;
    public final TextLocalisedClause d;
    public final boolean e;

    public j(List items, ResourceImage navigationIcon, TextLocalisedClause title, TextLocalisedClause textLocalisedClause) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(navigationIcon, "navigationIcon");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f296340a = items;
        this.f296341b = navigationIcon;
        this.f296342c = title;
        this.d = textLocalisedClause;
        this.e = true;
    }

    @Override // cli.p
    public final List c() {
        return this.f296340a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f296340a, jVar.f296340a) && this.f296341b.equals(jVar.f296341b) && this.f296342c.equals(jVar.f296342c) && this.d.equals(jVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + t61.a.a(org.bouncycastle.jcajce.provider.digest.a.b(this.f296341b, this.f296340a.hashCode() * 31, 31), 31, this.f296342c);
    }
}
