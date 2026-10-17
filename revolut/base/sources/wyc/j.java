package wyc;

import com.revolut.data.model.Data;
import com.revolut.feature.selfserve.sot.api.models.IncomeSource;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements cli.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f301213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Data f301214b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Data f301215c;
    public final IncomeSource d;

    public j(String transactionId, Data chosenTransaction, Data incomeSources, IncomeSource incomeSource) {
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(chosenTransaction, "chosenTransaction");
        Intrinsics.checkNotNullParameter(incomeSources, "incomeSources");
        this.f301213a = transactionId;
        this.f301214b = chosenTransaction;
        this.f301215c = incomeSources;
        this.d = incomeSource;
    }

    public static j a(j jVar, Data chosenTransaction, Data incomeSources, int i) {
        String transactionId = jVar.f301213a;
        if ((i & 2) != 0) {
            chosenTransaction = jVar.f301214b;
        }
        if ((i & 4) != 0) {
            incomeSources = jVar.f301215c;
        }
        IncomeSource incomeSource = jVar.d;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(transactionId, "transactionId");
        Intrinsics.checkNotNullParameter(chosenTransaction, "chosenTransaction");
        Intrinsics.checkNotNullParameter(incomeSources, "incomeSources");
        return new j(transactionId, chosenTransaction, incomeSources, incomeSource);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f301213a, jVar.f301213a) && Intrinsics.f(this.f301214b, jVar.f301214b) && Intrinsics.f(this.f301215c, jVar.f301215c) && Intrinsics.f(this.d, jVar.d);
    }

    public final int hashCode() {
        int iC = kii.e.c(this.f301215c, kii.e.c(this.f301214b, this.f301213a.hashCode() * 31, 31), 31);
        IncomeSource incomeSource = this.d;
        return iC + (incomeSource == null ? 0 : incomeSource.hashCode());
    }
}
