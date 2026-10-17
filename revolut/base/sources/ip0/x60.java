package ip0;

import com.revolut.core.ui_kit.delegates.PromptMarketingContentLoadingDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class x60 implements koi.j, ny0.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f167099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final w60 f167100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ResourceImage f167101c;

    public x60(String listId, w60 shimmeringStyle, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(shimmeringStyle, "shimmeringStyle");
        this.f167099a = listId;
        this.f167100b = shimmeringStyle;
        this.f167101c = resourceImage;
    }

    @Override // koi.j
    public final koi.k T1() {
        return new PromptMarketingContentLoadingDelegate();
    }

    @Override // koi.j
    /* JADX INFO: renamed from: b */
    public final String getF52603a() {
        return this.f167099a;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x60)) {
            return false;
        }
        x60 x60Var = (x60) obj2;
        return Intrinsics.f(this.f167099a, x60Var.f167099a) && this.f167100b == x60Var.f167100b && Intrinsics.f(this.f167101c, x60Var.f167101c);
    }

    @Override // ny0.h
    public final boolean getFitsReadableArea() {
        return false;
    }

    public final int hashCode() {
        int iHashCode = (this.f167100b.hashCode() + (this.f167099a.hashCode() * 31)) * 31;
        ResourceImage resourceImage = this.f167101c;
        return iHashCode + (resourceImage == null ? 0 : resourceImage.hashCode());
    }

    @Override // koi.j
    public final Object z(Object oldItem) {
        Intrinsics.checkNotNullParameter(oldItem, "oldItem");
        if (!(oldItem instanceof x60)) {
            return null;
        }
        return new y60(((x60) oldItem).f167100b != this.f167100b, !Intrinsics.f(r5.f167101c, this.f167101c));
    }
}
