package snc;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import jki.n;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f264507a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h f264508b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f264509c;

    public i(Image image, h header, List items) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f264507a = image;
        this.f264508b = header;
        this.f264509c = items;
    }

    @Override // jki.n
    public final List c() {
        return this.f264509c;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i)) {
            return false;
        }
        i iVar = (i) obj2;
        return Intrinsics.f(this.f264507a, iVar.f264507a) && Intrinsics.f(this.f264508b, iVar.f264508b) && Intrinsics.f(this.f264509c, iVar.f264509c);
    }

    public final int hashCode() {
        Image image = this.f264507a;
        return this.f264509c.hashCode() + ((this.f264508b.hashCode() + ((image == null ? 0 : image.hashCode()) * 31)) * 31);
    }
}
