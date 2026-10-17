package dki;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.OverScroller;

/* JADX INFO: loaded from: classes10.dex */
public final class v implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f115555a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f115556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f115557c;
    public final Object d;
    public final /* synthetic */ Object e;

    public v(View view, int i, int i2, x xVar) {
        this.d = view;
        this.f115556b = i;
        this.f115557c = i2;
        this.e = xVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f115555a) {
            case 0:
                ValueAnimator valueAnimatorOfObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(this.f115556b), Integer.valueOf(this.f115557c));
                valueAnimatorOfObject.setDuration(300L);
                valueAnimatorOfObject.addUpdateListener(new w((x) this.e, 0));
                valueAnimatorOfObject.start();
                break;
            case 1:
                hu0.f fVar = (hu0.f) this.e;
                OverScroller overScroller = (OverScroller) this.d;
                if (!overScroller.isFinished() && overScroller.computeScrollOffset()) {
                    int currX = overScroller.getCurrX();
                    int currY = overScroller.getCurrY();
                    fVar.f155496m.postTranslate(this.f115556b - currX, this.f115557c - currY);
                    fVar.a();
                    this.f115556b = currX;
                    this.f115557c = currY;
                    fVar.f155493h.postOnAnimation(this);
                }
                break;
            default:
                vc.t tVar = (vc.t) this.e;
                vc.c cVar = (vc.c) this.d;
                tVar.c(new vc.c(cVar.f287571a, this.f115556b, this.f115557c, cVar.d, cVar.e, cVar.f, cVar.f287574g, cVar.f287575h, cVar.i));
                break;
        }
    }

    public v(vc.t tVar, vc.c cVar, int i, int i2) {
        this.e = tVar;
        this.d = cVar;
        this.f115556b = i;
        this.f115557c = i2;
    }

    public v(hu0.f fVar, Context context) {
        this.e = fVar;
        this.d = new OverScroller(context);
    }
}
