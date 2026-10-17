package up5;

import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class b0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f281868a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f281869b;

    public /* synthetic */ b0(d dVar, int i) {
        this.f281868a = i;
        this.f281869b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        xi0.b withdrawCurrency = (xi0.b) obj2;
        switch (this.f281868a) {
            case 0:
                Intrinsics.checkNotNullParameter(withdrawCurrency, "withdrawCurrency");
                break;
            default:
                Intrinsics.checkNotNullParameter(withdrawCurrency, "withdrawCurrency");
                break;
        }
        return new Pair(this.f281869b, withdrawCurrency);
    }
}
