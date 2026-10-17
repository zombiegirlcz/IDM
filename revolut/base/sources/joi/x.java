package joi;

import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r10.f f177143a;

    public x(r10.f headerOutlineScheduler) {
        Intrinsics.checkNotNullParameter(headerOutlineScheduler, "headerOutlineScheduler");
        this.f177143a = headerOutlineScheduler;
    }

    public static void a(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        view.setClipBounds(null);
        view.setTranslationY(BitmapDescriptorFactory.HUE_RED);
        view.setAlpha(1.0f);
    }
}
