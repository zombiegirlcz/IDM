package b9;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes16.dex */
public final class u2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m1 f13481a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13482b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f13483c;
    public final Paint d;
    public final Paint e;
    public b0 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public b0 f13484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13485h;

    public u2() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(Constants.TAG_ATMEL_SERIAL);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(Constants.TAG_ATMEL_SERIAL);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.f13481a = m1.a();
    }

    public u2(u2 u2Var) {
        this.f13482b = u2Var.f13482b;
        this.f13483c = u2Var.f13483c;
        this.d = new Paint(u2Var.d);
        this.e = new Paint(u2Var.e);
        b0 b0Var = u2Var.f;
        if (b0Var != null) {
            this.f = new b0(b0Var);
        }
        b0 b0Var2 = u2Var.f13484g;
        if (b0Var2 != null) {
            this.f13484g = new b0(b0Var2);
        }
        this.f13485h = u2Var.f13485h;
        try {
            this.f13481a = (m1) u2Var.f13481a.clone();
        } catch (CloneNotSupportedException e) {
            this.f13481a = m1.a();
        }
    }
}
