package hgb;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class w implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f152160a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.retail.salary_account.impl.salary_hub.a f152161b;

    public /* synthetic */ w(com.revolut.feature.retail.salary_account.impl.salary_hub.a aVar, int i) {
        this.f152160a = i;
        this.f152161b = aVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f152160a) {
            case 0:
                k update = (k) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return k.a(update, null, null, ((etj.o) this.f152161b.f82992q).i(), 3);
            default:
                dii.g outputData = (dii.g) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                boolean z = outputData instanceof dii.e;
                com.revolut.feature.retail.salary_account.impl.salary_hub.a aVar = this.f152161b;
                if (z) {
                    aVar.K2(new v(aVar, 3));
                } else if (outputData instanceof dii.b) {
                    Object obj3 = ((dii.b) outputData).f115065a.d;
                    String str = obj3 instanceof String ? (String) obj3 : null;
                    if (str != null) {
                        aVar.J2(str);
                    }
                } else if (!(outputData instanceof dii.c) && !(outputData instanceof dii.d) && !(outputData instanceof dii.f)) {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.f186387a;
        }
    }
}
