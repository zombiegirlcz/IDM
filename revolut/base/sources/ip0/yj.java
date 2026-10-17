package ip0;

import com.revolut.core.ui_kit.delegates.FullScreenStateDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class yj implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f167324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ FullScreenStateDelegate.Model f167325b;

    public /* synthetic */ yj(FullScreenStateDelegate.Model model, int i) {
        this.f167324a = i;
        this.f167325b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f167324a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 1:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 2:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            case 3:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f167325b;
    }
}
