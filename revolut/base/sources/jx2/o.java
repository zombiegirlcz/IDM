package jx2;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LargeActionButton.ButtonStyle f179056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f179057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f179058c;
    public final Image d;
    public final boolean e;

    public o(LargeActionButton.ButtonStyle style, Clause text, boolean z, Image image, boolean z3) {
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(text, "text");
        this.f179056a = style;
        this.f179057b = text;
        this.f179058c = z;
        this.d = image;
        this.e = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.f179056a, oVar.f179056a) && Intrinsics.f(this.f179057b, oVar.f179057b) && this.f179058c == oVar.f179058c && Intrinsics.f(this.d, oVar.d) && this.e == oVar.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.a(this.f179056a.hashCode() * 31, 31, this.f179057b), 31, this.f179058c);
        Image image = this.d;
        return Boolean.hashCode(this.e) + ((iC + (image == null ? 0 : image.hashCode())) * 31);
    }
}
