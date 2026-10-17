package aff;

import ce9.p;
import com.revolut.feature.transaction.recogniser.api.domain.models.TransactionRecogniserDetails;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4043a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f4044b;

    public /* synthetic */ m(p pVar, int i) {
        this.f4043a = i;
        this.f4044b = pVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f4043a) {
            case 0:
                p merchantTransactions = this.f4044b;
                Intrinsics.h(merchantTransactions);
                TransactionRecogniserDetails recogniserDetails = ((e) obj2).f4036a;
                Intrinsics.checkNotNullParameter(recogniserDetails, "recogniserDetails");
                Intrinsics.checkNotNullParameter(merchantTransactions, "merchantTransactions");
                return new e(recogniserDetails, merchantTransactions);
            case 1:
                je5.g gVar = (je5.g) obj2;
                p pagingState = this.f4044b;
                Intrinsics.h(pagingState);
                String query = gVar.f173217b;
                gVar.getClass();
                Intrinsics.checkNotNullParameter(pagingState, "pagingState");
                Intrinsics.checkNotNullParameter(query, "query");
                return new je5.g(pagingState, query);
            case 2:
                ry5.f fVar = (ry5.f) obj2;
                p pagingState2 = this.f4044b;
                Intrinsics.h(pagingState2);
                String query2 = fVar.f258228b;
                fVar.getClass();
                Intrinsics.checkNotNullParameter(pagingState2, "pagingState");
                Intrinsics.checkNotNullParameter(query2, "query");
                return new ry5.f(pagingState2, query2);
            default:
                p pVar = this.f4044b;
                Intrinsics.h(pVar);
                return zfd.h.a((zfd.h) obj2, pVar, null, null, null, 14);
        }
    }
}
