package vxg;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f293083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f293084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f293085c;

    public a(Clause assetClause, Image assetImage, float f) {
        Intrinsics.checkNotNullParameter(assetClause, "assetClause");
        Intrinsics.checkNotNullParameter(assetImage, "assetImage");
        this.f293083a = assetClause;
        this.f293084b = assetImage;
        this.f293085c = f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f293083a.equals(aVar.f293083a) && this.f293084b.equals(aVar.f293084b) && Float.compare(this.f293085c, aVar.f293085c) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f293085c) + a10.b.c(this.f293084b, this.f293083a.hashCode() * 31, 31);
    }
}
