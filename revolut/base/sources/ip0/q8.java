package ip0;

import com.revolut.core.ui_kit.delegates.CellDetailsTwinButtonsDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class q8 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CellDetailsTwinButtonsDelegate.Model f165935b;

    public /* synthetic */ q8(CellDetailsTwinButtonsDelegate.Model model, int i) {
        this.f165934a = i;
        this.f165935b = model;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Unit it8 = (Unit) obj2;
        switch (this.f165934a) {
            case 0:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
            default:
                Intrinsics.checkNotNullParameter(it8, "it");
                break;
        }
        return this.f165935b;
    }
}
