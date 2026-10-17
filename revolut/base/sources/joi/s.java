package joi;

import android.graphics.Rect;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f177127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f177128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ViewOutlineProvider f177129c;
    public final iv0.s d;
    public final Rect e;

    public s(Rect rect, boolean z, ViewOutlineProvider viewOutlineProvider) {
        iv0.s outline = new iv0.s(BitmapDescriptorFactory.HUE_RED, true);
        Rect temporaryClipBounds = new Rect();
        Intrinsics.checkNotNullParameter(outline, "outline");
        Intrinsics.checkNotNullParameter(temporaryClipBounds, "temporaryClipBounds");
        this.f177127a = rect;
        this.f177128b = z;
        this.f177129c = viewOutlineProvider;
        this.d = outline;
        this.e = temporaryClipBounds;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.f177127a, sVar.f177127a) && this.f177128b == sVar.f177128b && Intrinsics.f(this.f177129c, sVar.f177129c) && Intrinsics.f(this.d, sVar.d) && Intrinsics.f(this.e, sVar.e);
    }

    public final int hashCode() {
        Rect rect = this.f177127a;
        int iC = j6.a.c((rect == null ? 0 : rect.hashCode()) * 31, 31, this.f177128b);
        ViewOutlineProvider viewOutlineProvider = this.f177129c;
        return this.e.hashCode() + ((this.d.hashCode() + ((iC + (viewOutlineProvider != null ? viewOutlineProvider.hashCode() : 0)) * 31)) * 31);
    }
}
