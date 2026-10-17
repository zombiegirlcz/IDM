package ys0;

import android.content.Context;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.TextPaint;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jb3.l;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;
import zhm.v;
import zhm.w;

/* JADX INFO: loaded from: classes19.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f316374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Paint f316375b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Paint f316376c;
    public final Paint d;
    public final Paint e;
    public final Paint f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final a f316377g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final TextPaint f316378h;
    public final int i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f316379j;
    public final ArrayList k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f316380l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f316381m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f316382n;

    public b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f316374a = context;
        this.f316375b = new Paint();
        this.f316376c = new Paint();
        this.d = new Paint();
        this.e = new Paint();
        this.f = new Paint();
        this.f316377g = new a(new Paint(), new TextPaint());
        this.f316378h = new TextPaint();
        this.i = kli.a.s(R$attr.uikit_colorPerformancePositive, context);
        a();
        kli.a.s(R$attr.uikit_colorPerformanceNegative, context);
        a();
        kli.a.s(R$attr.uikit_colorPerformancePositive_30, context);
        kli.a.s(R$attr.uikit_colorBackground_30, context);
        kli.a.s(R$attr.uikit_colorPerformanceNegative_30, context);
        this.f316379j = kli.a.s(R$attr.uikit_colorDeepGrey_50, context);
        List listK = v.k(Float.valueOf(2.0f), Float.valueOf(8.0f));
        ArrayList arrayList = new ArrayList(w.t(listK, 10));
        Iterator it8 = listK.iterator();
        while (it8.hasNext()) {
            arrayList.add(Float.valueOf(kli.a.k(this.f316374a, ((Number) it8.next()).floatValue())));
        }
        this.k = arrayList;
        this.f316380l = kli.a.k(this.f316374a, 2.0f);
        this.f316382n = kli.a.k(this.f316374a, 12.0f);
        this.f316381m = kli.a.s(R$attr.uikit_colorGreyTone50, this.f316374a);
        a();
    }

    public final void a() {
        Paint paint = this.f316375b;
        paint.setColor(-1);
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setAntiAlias(true);
        paint.setDither(true);
        Paint paint2 = this.f316376c;
        paint2.setStyle(style);
        paint2.setAntiAlias(true);
        paint2.setDither(true);
        Paint paint3 = this.d;
        paint3.setAntiAlias(true);
        paint3.setDither(true);
        Paint.Style style2 = Paint.Style.STROKE;
        paint3.setStyle(style2);
        paint3.setStrokeJoin(Paint.Join.ROUND);
        paint3.setStrokeCap(Paint.Cap.ROUND);
        paint3.setColor(this.i);
        Context context = this.f316374a;
        paint3.setStrokeWidth(kli.a.k(context, 3.0f));
        this.e.setDither(true);
        int iS = kli.a.s(R$attr.uikit_colorBackground, context);
        Paint paint4 = this.f;
        paint4.setColor(iS);
        paint4.setAlpha(99);
        paint4.setAntiAlias(true);
        paint4.setStyle(style);
        Paint.Align align = Paint.Align.CENTER;
        TextPaint textPaint = this.f316378h;
        textPaint.setTextAlign(align);
        textPaint.setAntiAlias(true);
        l.d(textPaint, context, R$attr.internal_textAppearanceBody2);
        textPaint.setColor(kli.a.s(R$attr.uikit_colorGreyTone50, context));
        textPaint.setTextSize(kli.a.k(context, 14.0f));
        a aVar = this.f316377g;
        Paint paint5 = aVar.f316372a;
        paint5.setStyle(style2);
        paint5.setColor(this.f316379j);
        paint5.setStrokeWidth(this.f316380l);
        ArrayList arrayList = this.k;
        if (arrayList != null) {
            paint5.setPathEffect(new DashPathEffect(d0.a1(arrayList), BitmapDescriptorFactory.HUE_RED));
        }
        TextPaint textPaint2 = aVar.f316373b;
        l.d(textPaint2, context, R$attr.internal_textAppearanceBody3);
        textPaint2.setTextSize(this.f316382n);
        textPaint2.setColor(this.f316381m);
        textPaint2.setAntiAlias(true);
    }
}
