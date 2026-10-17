package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class pa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Image f10474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f10475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final oa f10476c;

    public pa(Image image, Clause text, oa style) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(style, "style");
        this.f10474a = image;
        this.f10475b = text;
        this.f10476c = style;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof pa)) {
            return false;
        }
        pa paVar = (pa) obj2;
        return Intrinsics.f(this.f10474a, paVar.f10474a) && Intrinsics.f(this.f10475b, paVar.f10475b) && this.f10476c == paVar.f10476c;
    }

    public final int hashCode() {
        Image image = this.f10474a;
        return this.f10476c.hashCode() + p.a.a((image == null ? 0 : image.hashCode()) * 31, 31, this.f10475b);
    }
}
