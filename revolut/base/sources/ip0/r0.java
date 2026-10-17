package ip0;

import com.revolut.core.ui_kit.delegates.AmountEditDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class r0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AmountEditDelegate.Model f166071b;

    public /* synthetic */ r0(AmountEditDelegate.Model model, int i) {
        this.f166070a = i;
        this.f166071b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f166070a) {
            case 0:
                bw0.n it8 = (bw0.n) obj2;
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
                Boolean focus = (Boolean) obj2;
                Intrinsics.checkNotNullParameter(focus, "focus");
                return new aw0.f4(this.f166071b.f51624a, focus.booleanValue());
            default:
                bw0.n it11 = (bw0.n) obj2;
                Intrinsics.checkNotNullParameter(it11, "it");
                break;
        }
        return this.f166071b;
    }
}
