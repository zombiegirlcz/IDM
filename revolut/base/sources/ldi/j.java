package ldi;

import com.revolut.data.model.Data;
import com.revolut.feature.rev_points.params.RevPointsTransactionPageParams;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import m1c.q1;
import zhm.f0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f194141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RevPointsTransactionPageParams f194142b;

    public /* synthetic */ j(RevPointsTransactionPageParams revPointsTransactionPageParams, int i) {
        this.f194141a = i;
        this.f194142b = revPointsTransactionPageParams;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f194141a) {
            case 0:
                Data it8 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                List list = (List) it8.getContent();
                if (list == null) {
                    list = f0.f322471a;
                }
                return new lk0.e(list, this.f194142b, it8.getLoading(), null, it8.getError(), 8);
            case 1:
                Data it9 = (Data) obj2;
                Intrinsics.checkNotNullParameter(it9, "it");
                List list2 = (List) it9.getContent();
                if (list2 == null) {
                    list2 = f0.f322471a;
                }
                return new lk0.e(list2, this.f194142b, it9.getLoading(), null, it9.getError(), 8);
            default:
                List cachedTransactions = (List) obj2;
                Intrinsics.checkNotNullParameter(cachedTransactions, "cachedTransactions");
                return new q1(cachedTransactions, cachedTransactions.size() < this.f194142b.f84104a);
        }
    }
}
