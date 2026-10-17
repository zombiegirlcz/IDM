package yt0;

import android.content.Context;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import ix0.i1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class e0 extends ViewOutlineProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f316534a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f316535b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f316536c;
    public final int d;

    public e0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.d = rr0.q.b(context, rr0.o.FULLSCREEN_PAGED);
    }

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(outline, "outline");
        if (view.getWidth() == 0) {
            return;
        }
        float f = rim.d.c(((float) view.getLeft()) / ((float) view.getWidth())) == 0 ? this.f316535b : 0.0f;
        int iC = rim.d.c(i1.b(this.f316536c, BitmapDescriptorFactory.HUE_RED, f));
        float fB = i1.b(this.d, BitmapDescriptorFactory.HUE_RED, f);
        outline.setRoundRect(0, iC, view.getWidth(), view.getHeight() + ((int) fB), fB);
    }
}
