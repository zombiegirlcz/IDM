package mx0;

import android.graphics.Bitmap;
import android.graphics.Outline;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f210083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f210084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f210085c;
    public float d;
    public int e;
    public int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f210086g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f210087h;
    public float i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Bitmap f210088j;
    public int k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f210089l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f210090m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f210091n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f210092p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f210093q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final int[] f210094r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Outline f210095s;

    public wb() {
        this(0);
    }

    public final void a(View expandView) {
        Intrinsics.checkNotNullParameter(expandView, "expandView");
        int[] iArr = this.f210094r;
        expandView.getLocationInWindow(iArr);
        this.f210089l = expandView.getWidth() / 5;
        this.f210090m = expandView.getHeight() / 5;
        this.f = ((expandView.getWidth() + iArr[0]) / 2) - (this.f210089l / 2);
        this.e = (expandView.getHeight() / 4) + iArr[1];
        this.f210086g = BitmapDescriptorFactory.HUE_RED;
        this.f210087h = BitmapDescriptorFactory.HUE_RED;
        this.f210091n = 0;
        this.o = 0;
        this.f210092p = this.f210089l;
        this.f210093q = this.f210090m;
    }

    public final void b(View sourceView) {
        Intrinsics.checkNotNullParameter(sourceView, "sourceView");
        int[] iArr = this.f210094r;
        sourceView.getLocationInWindow(iArr);
        Rect rectA = or0.q.a(sourceView, true);
        this.f = iArr[0];
        this.e = iArr[1];
        this.f210086g = sourceView.getPivotX();
        this.f210087h = sourceView.getPivotY();
        this.f210085c = sourceView.getScaleX();
        this.f210089l = sourceView.getWidth();
        this.f210090m = sourceView.getHeight();
        Outline outline = this.f210095s;
        outline.setEmpty();
        Intrinsics.checkNotNullParameter(sourceView, "<this>");
        Intrinsics.checkNotNullParameter(outline, "outline");
        ViewOutlineProvider outlineProvider = sourceView.getOutlineProvider();
        float fFloatValue = BitmapDescriptorFactory.HUE_RED;
        if (outlineProvider != null) {
            outlineProvider.getOutline(sourceView, outline);
            float radius = outline.getRadius();
            Float fValueOf = Float.valueOf(radius);
            if (outline.isEmpty() || radius <= BitmapDescriptorFactory.HUE_RED) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            }
        }
        this.i = fFloatValue;
        this.f210091n = rectA.left;
        this.o = rectA.top;
        this.f210092p = rectA.width();
        this.f210093q = rectA.height();
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof wb)) {
            return false;
        }
        wb wbVar = (wb) obj2;
        return Float.compare(this.f210083a, wbVar.f210083a) == 0 && Float.compare(this.f210084b, wbVar.f210084b) == 0 && Float.compare(this.f210085c, wbVar.f210085c) == 0 && Float.compare(this.d, wbVar.d) == 0 && this.e == wbVar.e && this.f == wbVar.f && Float.compare(this.f210086g, wbVar.f210086g) == 0 && Float.compare(this.f210087h, wbVar.f210087h) == 0 && Float.compare(this.i, wbVar.i) == 0 && Intrinsics.f(this.f210088j, wbVar.f210088j) && this.k == wbVar.k;
    }

    public final int hashCode() {
        int iB = m72.b.b(this.i, m72.b.b(this.f210087h, m72.b.b(this.f210086g, j6.a.b(this.f, j6.a.b(this.e, m72.b.b(this.d, m72.b.b(this.f210085c, m72.b.b(this.f210084b, Float.hashCode(this.f210083a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
        Bitmap bitmap = this.f210088j;
        return Integer.hashCode(this.k) + ((iB + (bitmap == null ? 0 : bitmap.hashCode())) * 31);
    }

    public wb(int i) {
        this.f210083a = BitmapDescriptorFactory.HUE_RED;
        this.f210084b = BitmapDescriptorFactory.HUE_RED;
        this.f210085c = 1.0f;
        this.d = 1.0f;
        this.e = 0;
        this.f = 0;
        this.f210086g = BitmapDescriptorFactory.HUE_RED;
        this.f210087h = BitmapDescriptorFactory.HUE_RED;
        this.i = BitmapDescriptorFactory.HUE_RED;
        this.f210088j = null;
        this.k = 0;
        this.f210094r = new int[2];
        this.f210095s = new Outline();
        this.f210083a = BitmapDescriptorFactory.HUE_RED;
        this.f210084b = BitmapDescriptorFactory.HUE_RED;
        this.f210085c = 1.0f;
        this.d = 1.0f;
        this.k = 0;
    }
}
