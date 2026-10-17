package b9;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes16.dex */
public class s2 extends g4i.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f13465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f13466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w2 f13467c;

    public s2(w2 w2Var, float f, float f4) {
        this.f13467c = w2Var;
        this.f13465a = f;
        this.f13466b = f4;
    }

    @Override // g4i.a
    public void r(String str) {
        w2 w2Var = this.f13467c;
        if (w2Var.r0()) {
            u2 u2Var = (u2) w2Var.d;
            if (u2Var.f13482b) {
                ((Canvas) w2Var.f13499b).drawText(str, this.f13465a, this.f13466b, u2Var.d);
            }
            u2 u2Var2 = (u2) w2Var.d;
            if (u2Var2.f13483c) {
                ((Canvas) w2Var.f13499b).drawText(str, this.f13465a, this.f13466b, u2Var2.e);
            }
        }
        this.f13465a = ((u2) w2Var.d).d.measureText(str) + this.f13465a;
    }
}
