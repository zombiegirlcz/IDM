package qci;

import com.revolut.core.ui_kit.views.navbar.TextNavBarMenuItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f244795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f244796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f244797c;
    public final String d;
    public final TextNavBarMenuItem e;

    public h(List items, boolean z, boolean z3, String searchString, TextNavBarMenuItem textNavBarMenuItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        this.f244795a = items;
        this.f244796b = z;
        this.f244797c = z3;
        this.d = searchString;
        this.e = textNavBarMenuItem;
    }

    @Override // cli.p
    public final List c() {
        return this.f244795a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f244795a, hVar.f244795a) && this.f244796b == hVar.f244796b && this.f244797c == hVar.f244797c && Intrinsics.f(this.d, hVar.d) && Intrinsics.f(this.e, hVar.e);
    }

    public final int hashCode() {
        int iC = p.a.c(j6.a.c(j6.a.c(this.f244795a.hashCode() * 31, 31, this.f244796b), 31, this.f244797c), 31, this.d);
        TextNavBarMenuItem textNavBarMenuItem = this.e;
        return iC + (textNavBarMenuItem == null ? 0 : textNavBarMenuItem.hashCode());
    }
}
