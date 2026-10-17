package cuj;

import au0.z0;
import com.revolut.core.ui_kit.models.TextClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class j extends k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z0 f109041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f109042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f109043c;

    public j(z0 title, TextClause toolbarTitle, List pages) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(pages, "pages");
        this.f109041a = title;
        this.f109042b = toolbarTitle;
        this.f109043c = pages;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f109041a.equals(jVar.f109041a) && this.f109042b.equals(jVar.f109042b) && Intrinsics.f(this.f109043c, jVar.f109043c);
    }

    public final int hashCode() {
        return this.f109043c.hashCode() + v7.b(this.f109041a.hashCode() * 31, 31, this.f109042b);
    }
}
