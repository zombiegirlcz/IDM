package vlk;

import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import com.revolut.core.ui_kit.views.navbar.NavBarLargeCentred;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.GlyphImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f290492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final NavBarLargeCentred.Model f290493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f290494c;
    public final aw0.i d;
    public final AnimatedBackgroundType e;

    public q(List items, NavBarLargeCentred.Model model, GlyphImage glyphImage, aw0.i iVar, AnimatedBackgroundType animatedBackgroundType) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f290492a = items;
        this.f290493b = model;
        this.f290494c = glyphImage;
        this.d = iVar;
        this.e = animatedBackgroundType;
    }

    @Override // cli.p
    public final List c() {
        return this.f290492a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f290492a, qVar.f290492a) && Intrinsics.f(this.f290493b, qVar.f290493b) && Intrinsics.f(this.f290494c, qVar.f290494c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        int iHashCode = this.f290492a.hashCode() * 31;
        NavBarLargeCentred.Model model = this.f290493b;
        int iHashCode2 = (iHashCode + (model == null ? 0 : model.hashCode())) * 31;
        Image image = this.f290494c;
        int iHashCode3 = (iHashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        aw0.i iVar = this.d;
        int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
        AnimatedBackgroundType animatedBackgroundType = this.e;
        return iHashCode4 + (animatedBackgroundType != null ? animatedBackgroundType.hashCode() : 0);
    }
}
