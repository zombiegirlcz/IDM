package pj4;

import cli.p;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.UrlImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class i implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f236668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f236669b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final aw0.i f236670c;

    public i(List items, UrlImage urlImage, aw0.i iVar) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f236668a = items;
        this.f236669b = urlImage;
        this.f236670c = iVar;
    }

    @Override // cli.p
    public final List c() {
        return this.f236668a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f236668a, iVar.f236668a) && Intrinsics.f(this.f236669b, iVar.f236669b) && Intrinsics.f(this.f236670c, iVar.f236670c);
    }

    public final int hashCode() {
        int iHashCode = this.f236668a.hashCode() * 31;
        Image image = this.f236669b;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        aw0.i iVar = this.f236670c;
        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
    }
}
