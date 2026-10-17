package yed;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class s implements t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f312899a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextLocalisedClause f312900b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f312901c;
    public final boolean d;
    public final Image e;

    public s(List items, TextLocalisedClause title, boolean z, boolean z3, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f312899a = items;
        this.f312900b = title;
        this.f312901c = z;
        this.d = z3;
        this.e = resourceImage;
    }

    @Override // jki.n
    public final List c() {
        return this.f312899a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return this.f312899a.equals(sVar.f312899a) && this.f312900b.equals(sVar.f312900b) && this.f312901c == sVar.f312901c && this.d == sVar.d && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        int iC = j6.a.c(j6.a.c(t61.a.a(this.f312899a.hashCode() * 31, 31, this.f312900b), 31, this.f312901c), 31, this.d);
        Image image = this.e;
        return iC + (image == null ? 0 : image.hashCode());
    }
}
