package wk;

import android.animation.ValueAnimator;
import android.view.View;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.onfido.android.sdk.capture.ui.finalscreen.FinalScreenFragment;
import com.revolut.feature.picker.legacy.PickerScreen;
import jo0.m;
import kotlin.Unit;
import kotlin.reflect.KProperty;
import x.b;
import y7a.f0;
import y7a.r;
import y7a.v;
import yr0.o;
import yt0.h;
import yt0.i0;
import yw0.f;

/* JADX INFO: loaded from: classes17.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f298169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f298170b;

    public /* synthetic */ a(Object obj2, int i) {
        this.f298169a = i;
        this.f298170b = obj2;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.f298169a;
        Object obj2 = this.f298170b;
        switch (i) {
            case 0:
                FinalScreenFragment.onCreateView$lambda$1$lambda$0((FinalScreenFragment) obj2, view);
                break;
            case 1:
                KProperty[] kPropertyArr = PickerScreen.m0;
                f0 f0VarI3 = ((PickerScreen) obj2).T2();
                f0VarI3.v2(new v(f0VarI3.y2().d(((r) f0VarI3.t2()).f311449c, f0VarI3.f311442q.f80358a)));
                break;
            case 2:
                ((o) obj2).dismiss();
                break;
            case 3:
                h hVar = (h) obj2;
                if (!hVar.f316561a.getNonCancelableActivator().a()) {
                    hVar.f316561a.getOnDismiss$ui_kit_components_release().invoke();
                    break;
                }
                break;
            case 4:
                i0 i0Var = (i0) obj2;
                if (!i0Var.f316561a.getNonCancelableActivator().a()) {
                    i0Var.f316561a.getOnDismiss$ui_kit_components_release().invoke();
                    break;
                }
                break;
            case 5:
                ((f) obj2).f.onNext(Unit.f186387a);
                break;
            default:
                zxl.a aVar = (zxl.a) obj2;
                int i2 = zxl.a.d;
                if (aVar.getVisibility() == 0) {
                    if (!m.f176851h) {
                        aVar.a(true);
                    } else {
                        ValueAnimator valueAnimator = aVar.f326350a;
                        if (valueAnimator != null) {
                            valueAnimator.pause();
                        }
                        aVar.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(150L).withEndAction(new b(aVar, 17)).start();
                    }
                }
                break;
        }
    }
}
