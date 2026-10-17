package ip0;

import com.revolut.core.ui_kit.delegates.InputDualTextDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class pq implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InputDualTextDelegate.Model f165859b;

    public /* synthetic */ pq(InputDualTextDelegate.Model model, int i) {
        this.f165858a = i;
        this.f165859b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f165858a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f165859b;
    }
}
