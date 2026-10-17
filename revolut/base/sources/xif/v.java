package xif;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f306384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f306385b;

    public /* synthetic */ v(z zVar, int i) {
        this.f306384a = i;
        this.f306385b = zVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f306384a) {
            case 0:
                y params = (y) obj2;
                Intrinsics.checkNotNullParameter(params, "params");
                return (qjf.b) this.f306385b.f306393b.get(params.a());
            case 1:
                x params2 = (x) obj2;
                Intrinsics.checkNotNullParameter(params2, "params");
                return this.f306385b.f306392a.getTransactionWarrantBannerBySubjectId(params2.f306390b, params2.f306391c, params2.f306389a);
            default:
                w params3 = (w) obj2;
                Intrinsics.checkNotNullParameter(params3, "params");
                return this.f306385b.f306392a.getTransactionWarrantBannerByConfiscationId(params3.f306387b, params3.f306388c, params3.f306386a);
        }
    }
}
