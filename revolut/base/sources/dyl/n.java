package dyl;

import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class n extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Path f121167a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RectF f121168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ float[] f121169c;

    public n(Path path, RectF rectF, float[] fArr) {
        this.f121167a = path;
        this.f121168b = rectF;
        this.f121169c = fArr;
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outline, "outline");
        Path path = this.f121167a;
        path.reset();
        float width = view.getWidth();
        float height = view.getHeight();
        RectF rectF = this.f121168b;
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
        path.addRoundRect(rectF, this.f121169c, Path.Direction.CW);
        outline.setConvexPath(path);
    }
}
