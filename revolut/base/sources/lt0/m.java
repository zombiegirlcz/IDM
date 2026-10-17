package lt0;

import android.text.Layout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Layout f199747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f199748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f199749c;
    public float d;

    public m(Layout layout, int i, float f) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        this.f199747a = layout;
        this.f199748b = f;
        this.f199749c = i;
        this.d = BitmapDescriptorFactory.HUE_RED;
    }
}
