package ip0;

import com.revolut.core.ui_kit.delegates.CenteredAmountDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class z8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CenteredAmountDelegate.Model f167416b;

    public /* synthetic */ z8(CenteredAmountDelegate.Model model, int i) {
        this.f167415a = i;
        this.f167416b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f167415a) {
            case 0:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Unit it9 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                break;
            case 2:
                Unit it10 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it10, "it");
                break;
            case 3:
                Unit it11 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                break;
            case 4:
                Unit it12 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it12, "it");
                break;
            case 5:
                Unit it13 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it13, "it");
                break;
            case 6:
                Unit it14 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it14, "it");
                break;
            case 7:
                Unit it15 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it15, "it");
                break;
            case 8:
                Boolean focus = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(focus, "focus");
                return new aw0.f4(this.f167416b.f51972a, focus.booleanValue());
            case 9:
                Unit it16 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it16, "it");
                break;
            case 10:
                Unit it17 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it17, "it");
                break;
            default:
                Unit it18 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it18, "it");
                break;
        }
        return this.f167416b;
    }
}
