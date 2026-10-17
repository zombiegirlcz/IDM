package yf4;

import cli.p;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import mx0.c7;

/* JADX INFO: loaded from: classes22.dex */
public final class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextLocalisedClause f313176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f313177b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f313178c;
    public final c7 d;
    public final boolean e;
    public final boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f313179g;

    public h(TextLocalisedClause title, TextClause textClause, TextLocalisedClause confirmButtonTitle, c7 footerContent, boolean z, boolean z3, List items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(confirmButtonTitle, "confirmButtonTitle");
        Intrinsics.checkNotNullParameter(footerContent, "footerContent");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f313176a = title;
        this.f313177b = textClause;
        this.f313178c = confirmButtonTitle;
        this.d = footerContent;
        this.e = z;
        this.f = z3;
        this.f313179g = items;
    }

    @Override // cli.p
    public final List c() {
        return this.f313179g;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f313176a.equals(hVar.f313176a) && this.f313177b.equals(hVar.f313177b) && this.f313178c.equals(hVar.f313178c) && this.d.equals(hVar.d) && this.e == hVar.e && this.f == hVar.f && Intrinsics.f(this.f313179g, hVar.f313179g);
    }

    public final int hashCode() {
        return this.f313179g.hashCode() + j6.a.c(j6.a.c((this.d.hashCode() + t61.a.a(v7.b(this.f313176a.hashCode() * 31, 31, this.f313177b), 31, this.f313178c)) * 31, 31, this.e), 31, this.f);
    }
}
