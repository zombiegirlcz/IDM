package wed;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f296754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f0 f296755b;

    public /* synthetic */ s(f0 f0Var, int i) {
        this.f296754a = i;
        this.f296755b = f0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f296754a) {
            case 0:
                Map it8 = (Map) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                f0 f0Var = this.f296755b;
                f0Var.f296726q.A(((ghd.d) f0Var.f296728s).a(((l) f0Var.t2()).f296743b, ((l) f0Var.t2()).f296744c, it8));
                return Unit.f186387a;
            case 1:
                Map assetTypesOrder = (Map) obj2;
                Intrinsics.checkNotNullParameter(assetTypesOrder, "assetTypesOrder");
                f0 f0Var2 = this.f296755b;
                f0Var2.f296726q.x(((ghd.d) f0Var2.f296728s).a(((l) f0Var2.t2()).f296743b, ((l) f0Var2.t2()).f296744c, assetTypesOrder));
                return Unit.f186387a;
            default:
                l updateState = (l) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return l.a((l) this.f296755b.t2(), null, null, null, null, null, null, true, null, 383);
        }
    }
}
