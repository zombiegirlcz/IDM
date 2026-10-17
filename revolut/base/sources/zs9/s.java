package zs9;

import com.revolut.core.ui_kit_core.displayers.image.Image;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class s implements jki.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f324840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f324841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f324842c;

    public s(List items, Image image, boolean z) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(image, "image");
        this.f324840a = items;
        this.f324841b = image;
        this.f324842c = z;
    }

    @Override // jki.n
    public final List c() {
        return this.f324840a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f324840a, sVar.f324840a) && Intrinsics.f(this.f324841b, sVar.f324841b) && this.f324842c == sVar.f324842c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f324842c) + a10.b.c(this.f324841b, this.f324840a.hashCode() * 31, 31);
    }
}
