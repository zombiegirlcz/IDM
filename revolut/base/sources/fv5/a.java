package fv5;

import a09.a0;
import com.revolut.feature.transactions.api.navigation.TransactionsFeatureConfig;
import com.revolut.retail.core.navigation.FeatureCommand;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ofm.q;
import pfm.h;
import tof.a3;
import tof.i7;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f138345a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f138346b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a3 f138347c;

    public /* synthetic */ a(d dVar, a3 a3Var, int i) {
        this.f138345a = i;
        this.f138346b = dVar;
        this.f138347c = a3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f138345a) {
            case 0:
                i7 filter = (i7) obj2;
                Intrinsics.checkNotNullParameter(filter, "filter");
                return new h(new a0(this.f138346b, 14, this.f138347c, filter), 2);
            default:
                Throwable it8 = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                d dVar = this.f138346b;
                dVar.getClass();
                return dVar.n3(new FeatureCommand(new TransactionsFeatureConfig.Details(q.P(this.f138347c), com.revolut.feature.transactions.api.navigation.a.CRYPTO, null, null, 124)));
        }
    }
}
