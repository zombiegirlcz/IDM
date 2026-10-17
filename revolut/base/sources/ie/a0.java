package ie;

import android.util.Log;
import android.widget.FrameLayout;
import androidx.camera.core.SurfaceRequest;
import androidx.camera.core.impl.Timebase;
import androidx.camera.video.Recorder;
import androidx.core.view.ViewCompat;
import com.revolut.core.ui_kit.internal.drawables.FloatingBottomBarDrawable;
import com.revolut.core.ui_kit.views.FloatingBottomBarView;
import kotlin.NoWhenBranchMatchedException;
import le.k2;
import mx0.s6;
import mx0.t6;
import mx0.u6;
import mx0.v6;
import rv0.f;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f160504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f160505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f160506c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ a0(Object obj2, Object obj3, Object obj4, boolean z, int i) {
        this.f160504a = i;
        this.f160506c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f160505b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        FloatingBottomBarDrawable floatingBottomBarDrawable;
        switch (this.f160504a) {
            case 0:
                oe.c cVar = (oe.c) this.f160506c;
                k2 k2Var = (k2) this.d;
                ke.c cVar2 = (ke.c) this.e;
                cVar.getClass();
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                }
                ((oe.a) cVar.f224498b).d(k2Var, cVar2.b(), this.f160505b);
                return;
            case 1:
                FloatingBottomBarView floatingBottomBarView = (FloatingBottomBarView) this.f160506c;
                Integer num = (Integer) this.d;
                Integer num2 = (Integer) this.e;
                floatingBottomBarView.pendingSelectionAnimation = null;
                u6 u6Var = ((v6) floatingBottomBarView.C).f210050a;
                if (u6Var instanceof t6) {
                    floatingBottomBarDrawable = ((t6) u6Var).f210013a;
                } else {
                    if (!(u6Var instanceof s6)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    floatingBottomBarDrawable = ((s6) u6Var).f209994b;
                }
                floatingBottomBarDrawable.b(num, num2, this.f160505b);
                return;
            case 2:
                ((Recorder) this.f160506c).lambda$onSurfaceRequested$1((SurfaceRequest) this.d, (Timebase) this.e, this.f160505b);
                return;
            default:
                FrameLayout frameLayout = (FrameLayout) this.f160506c;
                sv0.c cVar3 = (sv0.c) this.d;
                rv0.g gVar = (rv0.g) this.e;
                frameLayout.setVisibility(8);
                sv0.c.o(cVar3, gVar, 2);
                if (this.f160505b) {
                    if (cVar3.f265817l instanceof rv0.e) {
                        cVar3.f265817l = f.a.f257638a;
                        ViewCompat.requestApplyInsets(cVar3.f265812b.getDecorView());
                    }
                    cVar3.f265814g = null;
                    return;
                }
                return;
        }
    }
}
