package rrc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class w implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f256803a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f256804b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f256805c;
    public final Clause d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ResourceImage f256806g;

    public w(AbstractList items, boolean z, Clause title, Clause clause, Clause primaryNavbarButtonText, Clause clause2, ResourceImage closeButtonImage) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryNavbarButtonText, "primaryNavbarButtonText");
        Intrinsics.checkNotNullParameter(closeButtonImage, "closeButtonImage");
        this.f256803a = items;
        this.f256804b = z;
        this.f256805c = title;
        this.d = clause;
        this.e = primaryNavbarButtonText;
        this.f = clause2;
        this.f256806g = closeButtonImage;
    }

    @Override // cli.p
    public final List c() {
        return this.f256803a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof w)) {
            return false;
        }
        w wVar = (w) obj2;
        return Intrinsics.f(this.f256803a, wVar.f256803a) && this.f256804b == wVar.f256804b && Intrinsics.f(this.f256805c, wVar.f256805c) && Intrinsics.f(this.d, wVar.d) && Intrinsics.f(this.e, wVar.e) && Intrinsics.f(this.f, wVar.f) && this.f256806g.equals(wVar.f256806g);
    }

    public final int hashCode() {
        int iA = p.a.a(j6.a.c(this.f256803a.hashCode() * 31, 31, this.f256804b), 31, this.f256805c);
        Clause clause = this.d;
        int iA2 = p.a.a((iA + (clause == null ? 0 : clause.hashCode())) * 31, 31, this.e);
        Clause clause2 = this.f;
        return this.f256806g.hashCode() + ((iA2 + (clause2 != null ? clause2.hashCode() : 0)) * 31);
    }
}
