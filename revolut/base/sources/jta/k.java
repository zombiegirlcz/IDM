package jta;

import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextClause f178445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f178446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Image f178447c;

    public k(TextClause title, boolean z, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f178445a = title;
        this.f178446b = z;
        this.f178447c = resourceImage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof k)) {
            return false;
        }
        k kVar = (k) obj2;
        return this.f178445a.equals(kVar.f178445a) && this.f178446b == kVar.f178446b && Intrinsics.f(this.f178447c, kVar.f178447c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f178445a.hashCode() * 31, 31, this.f178446b);
        Image image = this.f178447c;
        return iC + (image == null ? 0 : image.hashCode());
    }
}
