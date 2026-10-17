package r74;

import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes22.dex */
public final class n implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f251998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f251999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f252000c;

    public /* synthetic */ n(List list) {
        this(list, false, null);
    }

    @Override // cli.p
    public final List c() {
        return this.f251998a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n)) {
            return false;
        }
        n nVar = (n) obj2;
        return Intrinsics.f(this.f251998a, nVar.f251998a) && this.f251999b == nVar.f251999b && Intrinsics.f(this.f252000c, nVar.f252000c);
    }

    public final int hashCode() {
        int iC = j6.a.c(this.f251998a.hashCode() * 31, 31, this.f251999b);
        ResourceImage resourceImage = this.f252000c;
        return iC + (resourceImage == null ? 0 : resourceImage.hashCode());
    }

    public n(List items, boolean z, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.f251998a = items;
        this.f251999b = z;
        this.f252000c = resourceImage;
    }
}
