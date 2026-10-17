package jjg;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f174943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f174944b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f174945c;
    public final Image d;
    public final List e;

    public c(TextClause title, TextLocalisedClause description, Image icon, List items, List actions) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(actions, "actions");
        this.f174943a = items;
        this.f174944b = title;
        this.f174945c = description;
        this.d = icon;
        this.e = actions;
    }

    @Override // cli.p
    public final List c() {
        return this.f174943a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f174943a, cVar.f174943a) && Intrinsics.f(this.f174944b, cVar.f174944b) && Intrinsics.f(this.f174945c, cVar.f174945c) && Intrinsics.f(this.d, cVar.d) && Intrinsics.f(this.e, cVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + a10.b.c(this.d, t61.a.a(v7.b(this.f174943a.hashCode() * 31, 31, this.f174944b), 31, this.f174945c), 31);
    }
}
