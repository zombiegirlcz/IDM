package x0f;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.LayeredImage;
import ip0.v7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f301595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TextClause f301596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f301597c;
    public final Image d;

    public q(TextClause title, TextClause description, Image logo, LayeredImage layeredImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(logo, "logo");
        this.f301595a = title;
        this.f301596b = description;
        this.f301597c = logo;
        this.d = layeredImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof q)) {
            return false;
        }
        q qVar = (q) obj2;
        return this.f301595a.equals(qVar.f301595a) && this.f301596b.equals(qVar.f301596b) && Intrinsics.f(this.f301597c, qVar.f301597c) && Intrinsics.f(this.d, qVar.d);
    }

    public final int hashCode() {
        int iC = a10.b.c(this.f301597c, v7.b(this.f301595a.hashCode() * 31, 31, this.f301596b), 31);
        Image image = this.d;
        return iC + (image == null ? 0 : image.hashCode());
    }
}
