package ip0;

import com.revolut.core.ui_kit.delegates.SmallActionButtonDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class hf0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f164545a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ SmallActionButtonDelegate.Model f164546b;

    public /* synthetic */ hf0(SmallActionButtonDelegate.Model model, int i) {
        this.f164545a = i;
        this.f164546b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f164545a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f164546b;
    }
}
