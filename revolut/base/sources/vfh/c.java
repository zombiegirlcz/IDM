package vfh;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f288642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Image f288643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f288644c;
    public final b d;

    public c(Clause title, Image image, String ref2, b type) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(type, "type");
        this.f288642a = title;
        this.f288643b = image;
        this.f288644c = ref2;
        this.d = type;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f288642a.equals(cVar.f288642a) && this.f288643b.equals(cVar.f288643b) && Intrinsics.f(this.f288644c, cVar.f288644c) && this.d == cVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.c(a10.b.c(this.f288643b, this.f288642a.hashCode() * 31, 31), 31, this.f288644c);
    }
}
