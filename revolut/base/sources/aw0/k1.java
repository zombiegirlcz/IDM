package aw0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f10385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f10386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f10387c;

    public k1(Clause title, Clause subtitle, LayeredImage layeredImage, int i) {
        layeredImage = (i & 4) != 0 ? null : layeredImage;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        this.f10385a = title;
        this.f10386b = subtitle;
        this.f10387c = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k1)) {
            return false;
        }
        k1 k1Var = (k1) obj2;
        return Intrinsics.f(this.f10385a, k1Var.f10385a) && this.f10386b.equals(k1Var.f10386b) && Intrinsics.f(this.f10387c, k1Var.f10387c);
    }

    public final int hashCode() {
        int iB = p.a.b(this.f10385a.hashCode() * 31, 31, this.f10386b);
        Image image = this.f10387c;
        return (iB + (image == null ? 0 : image.hashCode())) * 923521;
    }
}
