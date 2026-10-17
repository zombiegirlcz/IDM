package fr0;

import android.graphics.Canvas;
import android.graphics.Path;
import android.view.MotionEvent;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import fr0.j;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.a0;

/* JADX INFO: loaded from: classes19.dex */
public abstract class i {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public j.f f137344a;
    public float d;
    public float e;
    public float f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f137347g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f137348h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f137349j;
    public boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f137350l;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f137345b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f137346c = new ArrayList();
    public float i = 1.0f;

    public static final class a {
        private a() {
        }
    }

    public abstract void a(float f, float f4);

    public abstract void b(float f, float f4, float f5);

    public abstract void c(float f, float f4, float f5);

    public abstract void d(Canvas canvas);

    public abstract float e();

    public abstract float f();

    public abstract Path g();

    public abstract boolean h(float f, float f4);

    public abstract void i(float f);

    public abstract void j(MotionEvent motionEvent);

    public final void k(MotionEvent event) {
        j.f fVar;
        float f;
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction() & 255;
        if (action == 0) {
            j.f action2 = new j.f(0);
            this.f137344a = action2;
            this.f137345b.add(action2);
            Intrinsics.checkNotNullParameter(action2, "action");
            this.f137346c.add(action2);
            j.f fVar2 = this.f137344a;
            if (fVar2 != null) {
                fVar2.f137357b = e();
            }
            j.f fVar3 = this.f137344a;
            if (fVar3 != null) {
                fVar3.f137358c = f();
            }
            this.d = event.getX();
            this.e = event.getY();
            return;
        }
        if (action != 2) {
            if (action != 5) {
                this.f137344a = null;
                return;
            } else {
                if (event.getPointerCount() > 2) {
                    return;
                }
                this.f = event.getX(1);
                this.f137347g = event.getY(1);
                return;
            }
        }
        if (event.getPointerCount() == 1) {
            float x3 = event.getX();
            float y2 = event.getY();
            float x5 = event.getX() - this.d;
            float y5 = event.getY() - this.e;
            if (Math.abs(x5) > 3.0f || Math.abs(y5) > 3.0f) {
                float f4 = x3 - this.d;
                float f5 = y2 - this.e;
                if (this.f137344a != null) {
                    if (this.f137349j) {
                        f4 = BitmapDescriptorFactory.HUE_RED;
                    }
                    if (this.k) {
                        f5 = BitmapDescriptorFactory.HUE_RED;
                    }
                    a(f4, f5);
                }
                this.d = x3;
                this.e = y2;
            }
        }
        if (event.getPointerCount() == 2) {
            float x7 = event.getX(0);
            float y9 = event.getY(0);
            float x20 = event.getX(1);
            float y11 = event.getY(1);
            double d = x7 - x20;
            double d5 = y9 - y11;
            float fSqrt = (float) Math.sqrt(Math.pow(d5, 2.0d) + Math.pow(d, 2.0d));
            float f6 = this.d;
            float f32 = this.e;
            float f35 = this.f;
            float fSqrt2 = (float) Math.sqrt(Math.pow(f32 - this.f137347g, 2.0d) + Math.pow(f6 - f35, 2.0d));
            float degrees = (float) Math.toDegrees(Math.atan2(d5, d));
            float degrees2 = (float) Math.toDegrees(Math.atan2(this.e - this.f137347g, this.d - this.f));
            float f36 = 2;
            float f37 = (x7 + x20) / f36;
            float f41 = (y9 + y11) / f36;
            float f42 = (this.d + this.f) / f36;
            float f57 = (this.e + this.f137347g) / f36;
            float f69 = f37 - f42;
            float f75 = f41 - f57;
            if (this.f137344a != null) {
                if (this.f137349j) {
                    f69 = BitmapDescriptorFactory.HUE_RED;
                }
                if (this.k) {
                    f75 = BitmapDescriptorFactory.HUE_RED;
                }
                a(f69, f75);
            }
            float f77 = fSqrt / fSqrt2;
            float f81 = this.i;
            float f82 = f81 * f77;
            if (f82 < 3.0f && f82 > 0.3f) {
                if (f82 < 0.3f) {
                    float f93 = 3.0f / f77;
                    f82 = f81 * f93;
                    f = f93;
                } else {
                    f = f77;
                }
                j.f fVar4 = this.f137344a;
                if (fVar4 != null) {
                    this.i = f82;
                    fVar4.f137356a /= f;
                    c(f77, f37, f41);
                }
            }
            float f94 = degrees - degrees2;
            if (!this.f137350l && (fVar = this.f137344a) != null) {
                fVar.d += f94;
                b(f94, f37, f41);
            }
            this.d = x7;
            this.e = y9;
            this.f = x20;
            this.f137347g = y11;
        }
    }

    public abstract void l(int i);

    public boolean m() {
        return this.f137346c.isEmpty();
    }

    public void n() {
        j jVar = (j) a0.I(this.f137346c);
        if (jVar == null || !(jVar instanceof j.f)) {
            return;
        }
        float fE = e();
        float f = f();
        float f4 = this.i;
        j.f fVar = (j.f) jVar;
        float f5 = fVar.f137356a;
        this.i = f4 * f5;
        c(f5, fE, f);
        b(-fVar.d, fE, f);
        a(fVar.f137357b - fE, fVar.f137358c - f);
    }
}
