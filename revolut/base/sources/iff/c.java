package iff;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f161011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f161012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xi0.b f161013c;

    public /* synthetic */ c(long j2, xi0.b bVar, int i) {
        this.f161011a = i;
        this.f161012b = j2;
        this.f161013c = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f161011a) {
            case 0:
                List transactions = (List) obj2;
                Intrinsics.checkNotNullParameter(transactions, "transactions");
                long size = (long) (((((double) transactions.size()) * 0.5d) * this.f161012b) / ((double) 3));
                xi0.b bVar = this.f161013c;
                Intrinsics.h(bVar);
                return new dj0.d(size, bVar);
            case 1:
                prd.a update = (prd.a) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                dj0.d enteredAmount = new dj0.d(this.f161012b, this.f161013c);
                update.getClass();
                Intrinsics.checkNotNullParameter(enteredAmount, "enteredAmount");
                return new prd.a(enteredAmount);
            default:
                tq4.d update2 = (tq4.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                dj0.d dVar = new dj0.d(this.f161012b, this.f161013c);
                dj0.d minCreditLimit = update2.f273521b;
                dj0.d maxCreditLimit = update2.f273522c;
                dj0.d nonSelectableMinCreditLimit = update2.d;
                xi0.b currency = update2.e;
                Intrinsics.checkNotNullParameter(minCreditLimit, "minCreditLimit");
                Intrinsics.checkNotNullParameter(maxCreditLimit, "maxCreditLimit");
                Intrinsics.checkNotNullParameter(nonSelectableMinCreditLimit, "nonSelectableMinCreditLimit");
                Intrinsics.checkNotNullParameter(currency, "currency");
                return new tq4.d(dVar, minCreditLimit, maxCreditLimit, nonSelectableMinCreditLimit, currency);
        }
    }
}
