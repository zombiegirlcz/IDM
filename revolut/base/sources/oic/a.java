package oic;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f225593a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f225594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f225595c;

    public a(int i, Clause clause, ResourceImage resourceImage, boolean z) {
        z = (i & 4) != 0 ? true : z;
        resourceImage = (i & 8) != 0 ? null : resourceImage;
        Intrinsics.checkNotNullParameter(clause, "clause");
        this.f225593a = clause;
        this.f225594b = z;
        this.f225595c = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return this.f225593a.equals(aVar.f225593a) && this.f225594b == aVar.f225594b && Intrinsics.f(this.f225595c, aVar.f225595c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f225593a.hashCode() * 961, 31, this.f225594b);
        Image image = this.f225595c;
        return iC + (image == null ? 0 : image.hashCode());
    }
}
