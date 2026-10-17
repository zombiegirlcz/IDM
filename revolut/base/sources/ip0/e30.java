package ip0;

import android.view.ViewPropertyAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.delegates.ProgressStepHorizontalV2Delegate;
import com.revolut.core.ui_kit.delegates.ProgressStepVerticalV2Delegate;
import com.revolut.core.ui_kit.delegates.PromptContentDelegate;
import com.revolut.core.ui_kit.delegates.PromptMarketingContentDelegate;
import com.revolut.core.ui_kit.delegates.SearchButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.SmartTileExchangeDelegate;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e30 implements kfm.o, kfm.g, kfm.p, efm.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164013a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f164014b;

    public /* synthetic */ e30(Object obj2, int i) {
        this.f164013a = i;
        this.f164014b = obj2;
    }

    @Override // efm.u
    public void a(tfm.z0 subscriber) {
        cc0 cc0Var = (cc0) this.f164014b;
        Intrinsics.checkNotNullParameter(subscriber, "subscriber");
        try {
            ViewPropertyAnimator listener = cc0Var.f163718h.animate().alpha(BitmapDescriptorFactory.HUE_RED).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(1000L).setListener(new dy0.t(cc0Var, subscriber, 3));
            Intrinsics.checkNotNullExpressionValue(listener, "setListener(...)");
            listener.start();
            subscriber.d(new d80.g(listener, 1));
        } catch (Exception e) {
            subscriber.b(e);
        }
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f164013a) {
            case 13:
                ((w10) this.f164014b).invoke(obj2);
                break;
            case 15:
                ((w10) this.f164014b).invoke(obj2);
                break;
            case 19:
                ((w10) this.f164014b).invoke(obj2);
                break;
            default:
                ((wk) this.f164014b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f164013a;
        Object obj2 = this.f164014b;
        switch (i) {
            case 0:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (m30) ((d30) obj2).invoke(p0);
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h30) ((za) obj2).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (i30) ((d30) obj2).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (f30) ((za) obj2).invoke(p0);
            case 4:
                Color.Solid solid = ProgressStepHorizontalV2Delegate.d;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (h40) ((w10) obj2).invoke(p0);
            case 5:
                Color.Solid solid2 = ProgressStepVerticalV2Delegate.i;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ProgressStepVerticalV2Delegate.Model) ((y40) obj2).invoke(p0);
            case 6:
                Color.Solid solid3 = ProgressStepVerticalV2Delegate.i;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ProgressStepVerticalV2Delegate.Model) ((y40) obj2).invoke(p0);
            case 7:
                Color.Solid solid4 = ProgressStepVerticalV2Delegate.i;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ProgressStepVerticalV2Delegate.Model) ((y40) obj2).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PromptContentDelegate.Model) ((n60) obj2).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PromptContentDelegate.Model) ((n60) obj2).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (q60) ((w10) obj2).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PromptMarketingContentDelegate.Model) ((s60) obj2).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PromptMarketingContentDelegate.Model) ((s60) obj2).invoke(p0);
            case 13:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            default:
                SmartTileExchangeDelegate.Companion aVar = SmartTileExchangeDelegate.INSTANCE;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.yg) ((eg0) obj2).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (u70) ((w10) obj2).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (efm.w) ((w10) obj2).invoke(p0);
            case 21:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (koi.j) ((za) obj2).invoke(p0);
            case 22:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SearchButtonDelegate.Model) ((w10) obj2).invoke(p0);
            case 23:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ed0) ((dd0) obj2).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (ed0) ((dd0) obj2).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                ((za) obj2).invoke(p0);
                return null;
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SmallActionButtonDelegate.Model) ((hf0) obj2).invoke(p0);
            case 27:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (SmallActionButtonDelegate.Model) ((hf0) obj2).invoke(p0);
        }
    }

    @Override // kfm.p
    public boolean test(Object p0) {
        switch (this.f164013a) {
            case 16:
                za zaVar = (za) this.f164014b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) zaVar.invoke(p0)).booleanValue();
            default:
                za zaVar2 = (za) this.f164014b;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return ((Boolean) zaVar2.invoke(p0)).booleanValue();
        }
    }
}
