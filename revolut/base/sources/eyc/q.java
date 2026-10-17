package eyc;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class q implements cli.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f130666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ir2.h f130667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ir2.d f130668c;
    public final List d;
    public final h60.b e;

    public q(Image image, ir2.h navBarModel, ir2.d twinButtonModel, List items, h60.b bVar) {
        Intrinsics.checkNotNullParameter(navBarModel, "navBarModel");
        Intrinsics.checkNotNullParameter(twinButtonModel, "twinButtonModel");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f130666a = image;
        this.f130667b = navBarModel;
        this.f130668c = twinButtonModel;
        this.d = items;
        this.e = bVar;
    }

    @Override // cli.p
    public final List c() {
        return this.d;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return Intrinsics.f(this.f130666a, qVar.f130666a) && Intrinsics.f(this.f130667b, qVar.f130667b) && Intrinsics.f(this.f130668c, qVar.f130668c) && Intrinsics.f(this.d, qVar.d) && Intrinsics.f(this.e, qVar.e);
    }

    public final int hashCode() {
        Image image = this.f130666a;
        int iD = p.a.d((this.f130668c.hashCode() + ((this.f130667b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31)) * 31)) * 31, 31, this.d);
        h60.b bVar = this.e;
        return iD + (bVar != null ? bVar.hashCode() : 0);
    }
}
