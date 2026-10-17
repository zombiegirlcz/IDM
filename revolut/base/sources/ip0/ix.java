package ip0;

import com.revolut.core.ui_kit.delegates.MultiTargetFanChartDelegate;
import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import com.revolut.core.ui_kit.delegates.PhoneEditorDelegate;
import com.revolut.core.ui_kit.delegates.PlainTextDelegate;
import com.revolut.core.ui_kit.delegates.PlanWidgetDelegate;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ix implements kfm.g, kfm.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f164754b;

    public /* synthetic */ ix(int i, Function1 function1) {
        this.f164753a = i;
        this.f164754b = function1;
    }

    @Override // kfm.g
    public void accept(Object obj2) {
        switch (this.f164753a) {
            case 0:
                ((wk) this.f164754b).invoke(obj2);
                break;
            case 21:
                ((i4g.g) this.f164754b).invoke(obj2);
                break;
            case 22:
                ((ad) this.f164754b).invoke(obj2);
                break;
            default:
                ((v00) this.f164754b).invoke(obj2);
                break;
        }
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public Object apply(Object p0) {
        int i = this.f164753a;
        Function1 function1 = this.f164754b;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (kx) ((ad) function1).invoke(p0);
            case 2:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lx) ((jx) function1).invoke(p0);
            case 3:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lx) ((jx) function1).invoke(p0);
            case 4:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (lx) ((jx) function1).invoke(p0);
            case 5:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (px) ((ad) function1).invoke(p0);
            case 6:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (MultiTargetFanChartDelegate.a) ((za) function1).invoke(p0);
            case 7:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NewRevolutCardDelegate.Model) ((cy) function1).invoke(p0);
            case 8:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NewRevolutCardDelegate.Model) ((cy) function1).invoke(p0);
            case 9:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NewRevolutCardDelegate.Model) ((cy) function1).invoke(p0);
            case 10:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NewRevolutCardDelegate.Model) ((cy) function1).invoke(p0);
            case 11:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NewRevolutCardDelegate.Model) ((cy) function1).invoke(p0);
            case 12:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NewRevolutCardDelegate.Model) ((cy) function1).invoke(p0);
            case 13:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (NewRevolutCardDelegate.Model) ((cy) function1).invoke(p0);
            case 14:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.da) ((qz) function1).invoke(p0);
            case 15:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.da) ((qz) function1).invoke(p0);
            case 16:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.ea) ((ad) function1).invoke(p0);
            case 17:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (l00) ((ad) function1).invoke(p0);
            case 18:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((o00) function1).invoke(p0);
            case 19:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (String) ((za) function1).invoke(p0);
            case 20:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PhoneEditorDelegate.PhoneData) ((o00) function1).invoke(p0);
            case 21:
            case 22:
            case 23:
            default:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (l30) ((za) function1).invoke(p0);
            case 24:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (PlainTextDelegate.Model) ((wk) function1).invoke(p0);
            case 25:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.sa) ((za) function1).invoke(p0);
            case 26:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (x10) ((w10) function1).invoke(p0);
            case 27:
                ResourceImage resourceImage = PlanWidgetDelegate.f;
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (com.revolut.core.ui_kit.delegates.gb) ((w10) function1).invoke(p0);
            case 28:
                Intrinsics.checkNotNullParameter(p0, "p0");
                return (k30) ((za) function1).invoke(p0);
        }
    }
}
