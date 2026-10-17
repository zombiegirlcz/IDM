package ys5;

import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import tof.a3;
import tof.i7;
import yc7.k;
import zh9.u0;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f316401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f f316402b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f316403c;

    public /* synthetic */ e(f fVar, a3 a3Var, int i) {
        this.f316401a = i;
        this.f316402b = fVar;
        this.f316403c = a3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f316401a) {
            case 0:
                i7 filter = (i7) obj2;
                Intrinsics.checkNotNullParameter(filter, "filter");
                return new pfm.h(new k(this.f316402b, 3, this.f316403c, filter), 2);
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f316402b.b(u0.c(new TransactionsFeatureConfig.Details(q.P(this.f316403c), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)));
        }
    }
}
