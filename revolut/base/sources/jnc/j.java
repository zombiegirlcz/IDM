package jnc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class j implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f176693a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f176694b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f176695c;
    public final boolean d;
    public final Image e;

    public j(TextClause title, TextClause toolbarTitle, Clause clause, boolean z, Image icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.f176693a = title;
        this.f176694b = toolbarTitle;
        this.f176695c = clause;
        this.d = z;
        this.e = icon;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return this.f176693a.equals(jVar.f176693a) && this.f176694b.equals(jVar.f176694b) && Intrinsics.f(this.f176695c, jVar.f176695c) && this.d == jVar.d && this.e.equals(jVar.e);
    }

    public final int hashCode() {
        int iB = v7.b(this.f176693a.hashCode() * 31, 31, this.f176694b);
        Clause clause = this.f176695c;
        return this.e.hashCode() + j6.a.c((iB + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.d);
    }
}
