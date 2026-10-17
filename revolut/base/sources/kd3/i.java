package kd3;

import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ip0.v7;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class i implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f182786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f182787b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MoneyClause f182788c;
    public final Image d;

    public i(List items, Image image, MoneyClause title, Image image2) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(title, "title");
        this.f182786a = items;
        this.f182787b = image;
        this.f182788c = title;
        this.d = image2;
    }

    @Override // jki.n
    public final List c() {
        return this.f182786a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f182786a, iVar.f182786a) && Intrinsics.f(this.f182787b, iVar.f182787b) && this.f182788c.equals(iVar.f182788c) && Intrinsics.f(this.d, iVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.f182786a.hashCode() * 31;
        Image image = this.f182787b;
        int iA = v7.a((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.f182788c);
        Image image2 = this.d;
        return iA + (image2 != null ? image2.hashCode() : 0);
    }
}
