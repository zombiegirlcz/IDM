package op0;

import com.revolut.core.ui_kit.delegates.NewsDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e3 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f227235a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f3 f227236b;

    public /* synthetic */ e3(f3 f3Var, int i) {
        this.f227235a = i;
        this.f227236b = f3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f227235a) {
            case 0:
                NewsDelegate.Model model = (NewsDelegate.Model) obj2;
                d3 d3Var = this.f227236b.u;
                if (d3Var != null) {
                    Intrinsics.h(model);
                    d3Var.invoke(model);
                }
                break;
            case 1:
                NewsDelegate.Model model2 = (NewsDelegate.Model) obj2;
                d3 d3Var2 = this.f227236b.v;
                if (d3Var2 != null) {
                    Intrinsics.h(model2);
                    d3Var2.invoke(model2);
                }
                break;
            case 2:
                NewsDelegate.Model model3 = (NewsDelegate.Model) obj2;
                d3 d3Var3 = this.f227236b.f227248t;
                if (d3Var3 != null) {
                    Intrinsics.h(model3);
                    d3Var3.invoke(model3);
                }
                break;
            default:
                ty0.a aVar = (ty0.a) obj2;
                d3 d3Var4 = this.f227236b.f227249w;
                if (d3Var4 != null) {
                    Intrinsics.h(aVar);
                    d3Var4.invoke(aVar);
                }
                break;
        }
        return Unit.f186387a;
    }
}
