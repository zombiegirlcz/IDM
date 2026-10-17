package i9h;

import com.revolut.core.ui_kit.delegates.SingleChoiceDelegate;
import com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsActivity;
import com.revolut.feature.wealth.impl.ui.activities.mosttraded.MostTradedAssetsScreenContract$Configuration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f159847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MostTradedAssetsActivity f159848b;

    public /* synthetic */ b(MostTradedAssetsActivity mostTradedAssetsActivity, int i) {
        this.f159847a = i;
        this.f159848b = mostTradedAssetsActivity;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f159847a;
        MostTradedAssetsActivity mostTradedAssetsActivity = this.f159848b;
        switch (i) {
            case 0:
                int i2 = MostTradedAssetsActivity.C0;
                return ((MostTradedAssetsScreenContract$Configuration) mostTradedAssetsActivity.G0()).getE();
            case 1:
                int i3 = MostTradedAssetsActivity.C0;
                return new z4l.j(7, zhm.u.c((SingleChoiceDelegate) mostTradedAssetsActivity.A0.getValue()), false);
            default:
                return (z4l.j) mostTradedAssetsActivity.B0.getValue();
        }
    }
}
