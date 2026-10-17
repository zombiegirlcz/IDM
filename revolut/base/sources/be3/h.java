package be3;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class h implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f14659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f14660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final TextLocalisedClause f14661c;
    public final Image d;

    public h(List items, boolean z, TextLocalisedClause balanceDescription, Image image) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(balanceDescription, "balanceDescription");
        this.f14659a = items;
        this.f14660b = z;
        this.f14661c = balanceDescription;
        this.d = image;
    }

    @Override // jki.n
    public final List c() {
        return this.f14659a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.f14659a, hVar.f14659a) && this.f14660b == hVar.f14660b && this.f14661c.equals(hVar.f14661c) && Intrinsics.f(this.d, hVar.d);
    }

    public final int hashCode() {
        int iA = t61.a.a(j6.a.c(this.f14659a.hashCode() * 31, 31, this.f14660b), 31, this.f14661c);
        Image image = this.d;
        return iA + (image == null ? 0 : image.hashCode());
    }
}
