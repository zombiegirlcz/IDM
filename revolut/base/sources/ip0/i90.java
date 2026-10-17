package ip0;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class i90 implements e90 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f164663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ResourceImage f164664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f164665c;

    public i90(String listId, ResourceImage imageUnselected, ResourceImage imageSelected) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(imageUnselected, "imageUnselected");
        Intrinsics.checkNotNullParameter(imageSelected, "imageSelected");
        this.f164663a = listId;
        this.f164664b = imageUnselected;
        this.f164665c = imageSelected;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof i90)) {
            return false;
        }
        i90 i90Var = (i90) obj2;
        return Intrinsics.f(this.f164663a, i90Var.f164663a) && this.f164664b.equals(i90Var.f164664b) && this.f164665c.equals(i90Var.f164665c);
    }

    public final int hashCode() {
        return org.bouncycastle.jcajce.provider.digest.a.b(this.f164665c, org.bouncycastle.jcajce.provider.digest.a.b(this.f164664b, this.f164663a.hashCode() * 31, 31), 31);
    }
}
