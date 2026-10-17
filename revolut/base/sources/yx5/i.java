package yx5;

import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import ny5.v;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f317563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b f317564b;

    public /* synthetic */ i(com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b bVar, int i) {
        this.f317563a = i;
        this.f317564b = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f317563a) {
            case 0:
                Pair pair = (Pair) obj2;
                Intrinsics.checkNotNullParameter(pair, "<destruct>");
                return this.f317564b.f71590q.a((List) pair.f186385a, (v) pair.f186386b);
            default:
                dw5.b outputData = (dw5.b) obj2;
                Intrinsics.checkNotNullParameter(outputData, "outputData");
                com.revolut.feature.cryptocommodity_invest.impl.ui.activities.discoverall.ui.kompot.b bVar = this.f317564b;
                bVar.n2(new yv1.k(bVar, outputData, null, 4), new whi.b(6));
                return Unit.f186387a;
        }
    }
}
