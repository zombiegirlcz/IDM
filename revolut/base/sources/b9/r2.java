package b9;

import android.graphics.Canvas;
import android.graphics.Path;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: loaded from: classes16.dex */
public final class r2 extends s2 {
    public final Path d;
    public final /* synthetic */ w2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r2(w2 w2Var, Path path, float f) {
        super(w2Var, f, BitmapDescriptorFactory.HUE_RED);
        this.e = w2Var;
        this.d = path;
    }

    @Override // b9.s2, g4i.a
    public final void r(String str) {
        w2 w2Var = this.e;
        if (w2Var.r0()) {
            u2 u2Var = (u2) w2Var.d;
            if (u2Var.f13482b) {
                ((Canvas) w2Var.f13499b).drawTextOnPath(str, this.d, this.f13465a, this.f13466b, u2Var.d);
            }
            u2 u2Var2 = (u2) w2Var.d;
            if (u2Var2.f13483c) {
                ((Canvas) w2Var.f13499b).drawTextOnPath(str, this.d, this.f13465a, this.f13466b, u2Var2.e);
            }
        }
        this.f13465a = ((u2) w2Var.d).d.measureText(str) + this.f13465a;
    }
}
