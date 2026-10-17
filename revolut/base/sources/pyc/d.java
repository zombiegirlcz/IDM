package pyc;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f240766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f240767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f240768c;
    public final boolean d;
    public final Clause e;
    public final Image f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Image f240769g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f240770h;

    public d(Clause title, Clause toolbarTitle, Clause description, boolean z, Clause clause, Image image, LayeredImage layeredImage, int i) {
        clause = (i & 16) != 0 ? null : clause;
        image = (i & 32) != 0 ? null : image;
        layeredImage = (i & 64) != 0 ? null : layeredImage;
        boolean z3 = (i & 128) != 0;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(toolbarTitle, "toolbarTitle");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f240766a = title;
        this.f240767b = toolbarTitle;
        this.f240768c = description;
        this.d = z;
        this.e = clause;
        this.f = image;
        this.f240769g = layeredImage;
        this.f240770h = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d)) {
            return false;
        }
        d dVar = (d) obj2;
        return this.f240766a.equals(dVar.f240766a) && this.f240767b.equals(dVar.f240767b) && this.f240768c.equals(dVar.f240768c) && this.d == dVar.d && Intrinsics.f(this.e, dVar.e) && Intrinsics.f(this.f, dVar.f) && Intrinsics.f(this.f240769g, dVar.f240769g) && this.f240770h == dVar.f240770h;
    }

    public final int hashCode() {
        int iC = j6.a.c(p.a.b(p.a.b(this.f240766a.hashCode() * 31, 31, this.f240767b), 31, this.f240768c), 31, this.d);
        Clause clause = this.e;
        int iHashCode = (iC + (clause == null ? 0 : clause.hashCode())) * 31;
        Image image = this.f;
        int iHashCode2 = (iHashCode + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.f240769g;
        return Boolean.hashCode(this.f240770h) + ((iHashCode2 + (image2 != null ? image2.hashCode() : 0)) * 31);
    }
}
