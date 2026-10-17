package ip0;

import java.time.LocalDate;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ud implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166644a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.g5 f166645b;

    public /* synthetic */ ud(com.revolut.core.ui_kit.delegates.g5 g5Var, int i) {
        this.f166644a = i;
        this.f166645b = g5Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f166644a) {
            case 0:
                ms0.k0 clickData = (ms0.k0) obj2;
                Intrinsics.checkNotNullParameter(clickData, "clickData");
                return new vd(this.f166645b, clickData.f208305a);
            default:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                Object obj3 = pair.f186385a;
                Intrinsics.checkNotNullExpressionValue(obj3, "component1(...)");
                Object obj4 = pair.f186386b;
                Intrinsics.checkNotNullExpressionValue(obj4, "component2(...)");
                LocalDate localDate = (LocalDate) ((od0.i) obj3).g();
                return new wd(this.f166645b, (LocalDate) obj4, localDate);
        }
    }
}
