package b9;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes16.dex */
public final class t2 extends g4i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13473a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f13475c;
    public final /* synthetic */ w2 d;
    public final Object e;

    public t2(w2 w2Var, float f, float f4) {
        this.f13473a = 1;
        this.d = w2Var;
        this.e = new RectF();
        this.f13474b = f;
        this.f13475c = f4;
    }

    @Override // g4i.a
    public final boolean b(f2 f2Var) {
        switch (this.f13473a) {
            case 0:
                return !(f2Var instanceof g2);
            default:
                if (!(f2Var instanceof g2)) {
                    return true;
                }
                g2 g2Var = (g2) f2Var;
                s1 s1VarC = f2Var.f13479a.c(g2Var.f13348n);
                if (s1VarC == null) {
                    w2.u("TextPath path reference '%s' not found", g2Var.f13348n);
                } else {
                    u0 u0Var = (u0) s1VarC;
                    q2 q2Var = new q2(u0Var.o);
                    Matrix matrix = u0Var.f13383n;
                    Path path = q2Var.f13451a;
                    if (matrix != null) {
                        path.transform(matrix);
                    }
                    RectF rectF = new RectF();
                    path.computeBounds(rectF, true);
                    ((RectF) this.e).union(rectF);
                }
                return false;
        }
    }

    @Override // g4i.a
    public final void r(String str) {
        String str2;
        switch (this.f13473a) {
            case 0:
                w2 w2Var = this.d;
                if (w2Var.r0()) {
                    Path path = new Path();
                    str2 = str;
                    ((u2) w2Var.d).d.getTextPath(str2, 0, str.length(), this.f13474b, this.f13475c, path);
                    ((Path) this.e).addPath(path);
                } else {
                    str2 = str;
                }
                this.f13474b = ((u2) w2Var.d).d.measureText(str2) + this.f13474b;
                break;
            default:
                w2 w2Var2 = this.d;
                if (w2Var2.r0()) {
                    Rect rect = new Rect();
                    ((u2) w2Var2.d).d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.f13474b, this.f13475c);
                    ((RectF) this.e).union(rectF);
                }
                this.f13474b = ((u2) w2Var2.d).d.measureText(str) + this.f13474b;
                break;
        }
    }

    public t2(w2 w2Var, float f, float f4, Path path) {
        this.f13473a = 0;
        this.d = w2Var;
        this.f13474b = f;
        this.f13475c = f4;
        this.e = path;
    }
}
