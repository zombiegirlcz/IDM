package oic;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f225597a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f225598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f225599c;
    public final Image d;
    public final boolean e;
    public final LargeActionButton.ButtonStyle f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f225600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f225601h;

    public c(Clause primaryClause, Clause secondaryClause, ResourceImage resourceImage, ResourceImage resourceImage2, LargeActionButton.ButtonStyle.BlackOrWhiteButton.Plain plain, boolean z, boolean z3, int i) {
        resourceImage = (i & 8) != 0 ? null : resourceImage;
        resourceImage2 = (i & 16) != 0 ? null : resourceImage2;
        boolean z4 = (i & 32) == 0;
        plain = (i & 64) != 0 ? null : plain;
        z = (i & 128) != 0 ? true : z;
        z3 = (i & 256) != 0 ? true : z3;
        Intrinsics.checkNotNullParameter(primaryClause, "primaryClause");
        Intrinsics.checkNotNullParameter(secondaryClause, "secondaryClause");
        this.f225597a = primaryClause;
        this.f225598b = secondaryClause;
        this.f225599c = resourceImage;
        this.d = resourceImage2;
        this.e = z4;
        this.f = plain;
        this.f225600g = z;
        this.f225601h = z3;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return this.f225597a.equals(cVar.f225597a) && this.f225598b.equals(cVar.f225598b) && Intrinsics.f(this.f225599c, cVar.f225599c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && Intrinsics.f(this.f, cVar.f) && this.f225600g == cVar.f225600g && this.f225601h == cVar.f225601h;
    }

    public final int hashCode() {
        int iB = p.a.b(this.f225597a.hashCode() * 31, 961, this.f225598b);
        Image image = this.f225599c;
        int iHashCode = (iB + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.d;
        int iC = j6.a.c((iHashCode + (image2 == null ? 0 : image2.hashCode())) * 31, 31, this.e);
        LargeActionButton.ButtonStyle buttonStyle = this.f;
        return Boolean.hashCode(this.f225601h) + j6.a.c((iC + (buttonStyle != null ? buttonStyle.hashCode() : 0)) * 31, 31, this.f225600g);
    }
}
