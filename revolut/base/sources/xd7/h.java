package xd7;

import cli.p;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f304280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f304281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f304282c;
    public final TextLocalisedClause d;
    public final String e;
    public final rd7.c f;

    public h(ArrayList items, int i, List menuItems, TextLocalisedClause title, String caption, rd7.c captionMode) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(menuItems, "menuItems");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(caption, "caption");
        Intrinsics.checkNotNullParameter(captionMode, "captionMode");
        this.f304280a = items;
        this.f304281b = i;
        this.f304282c = menuItems;
        this.d = title;
        this.e = caption;
        this.f = captionMode;
    }

    @Override // cli.p
    public final List c() {
        return this.f304280a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f304280a.equals(hVar.f304280a) && this.f304281b == hVar.f304281b && Intrinsics.f(this.f304282c, hVar.f304282c) && this.d.equals(hVar.d) && Intrinsics.f(this.e, hVar.e) && this.f == hVar.f;
    }

    public final int hashCode() {
        return this.f.hashCode() + p.a.c(t61.a.a(p.a.d(j6.a.b(this.f304281b, this.f304280a.hashCode() * 31, 31), 31, this.f304282c), 31, this.d), 31, this.e);
    }
}
