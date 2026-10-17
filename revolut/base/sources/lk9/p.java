package lk9;

import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MoneyClause f196318a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f196319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextClause f196320c;
    public final CompositeClause d;
    public final Image e;
    public final List f;

    public p(MoneyClause title, TextClause toolbarTitle, TextClause description, CompositeClause hintDescription, Image icon, List actions) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(hintDescription, "hintDescription");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f196318a = title;
        this.f196319b = toolbarTitle;
        this.f196320c = description;
        this.d = hintDescription;
        this.e = icon;
        this.f = actions;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return this.f196318a.equals(pVar.f196318a) && this.f196319b.equals(pVar.f196319b) && this.f196320c.equals(pVar.f196320c) && this.d.equals(pVar.d) && this.e.equals(pVar.e) && Intrinsics.f(this.f, pVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + a10.b.c(this.e, h30.l.c(this.d, v7.b(v7.b(this.f196318a.hashCode() * 31, 31, this.f196319b), 31, this.f196320c), 31), 31);
    }
}
