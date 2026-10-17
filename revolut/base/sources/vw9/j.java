package vw9;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.CdnImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class j implements cli.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f292662a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f292663b;

    public j(h navBarState, CdnImage cdnImage) {
        Intrinsics.checkNotNullParameter(navBarState, "navBarState");
        this.f292662a = navBarState;
        this.f292663b = cdnImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f292662a, jVar.f292662a) && Intrinsics.f(this.f292663b, jVar.f292663b);
    }

    public final int hashCode() {
        int iHashCode = this.f292662a.hashCode() * 31;
        Image image = this.f292663b;
        return iHashCode + (image == null ? 0 : image.hashCode());
    }
}
