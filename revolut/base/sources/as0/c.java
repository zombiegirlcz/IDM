package as0;

import android.graphics.PointF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fu0.g;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final koi.b f8738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f8739b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public g[] f8740c;
    public final PointF d;
    public boolean e;

    public c(koi.b holder, boolean z) {
        PointF offset = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Intrinsics.checkNotNullParameter(holder, "holder");
        Intrinsics.checkNotNullParameter(offset, "offset");
        this.f8738a = holder;
        this.f8739b = z;
        this.f8740c = null;
        this.d = offset;
        this.e = false;
    }
}
