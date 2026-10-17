package ise;

import com.revolut.data.model.Data;
import com.revolut.domain.models.transactions.ThreeDSTransaction;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f168206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ThreeDSTransaction f168207b;

    public /* synthetic */ k(ThreeDSTransaction threeDSTransaction, int i) {
        this.f168206a = i;
        this.f168207b = threeDSTransaction;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        Data data;
        n0 n0Var;
        switch (this.f168206a) {
            case 0:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                Iterator it8 = cards.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (Intrinsics.f(((h93.f0) next).f150110a, this.f168207b.f60541m)) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (h93.f0) next;
            default:
                j0 j0Var = (j0) obj2;
                Data dataP = zi0.c.P(ThreeDSTransaction.a(this.f168207b), false, null, 3);
                Data data2 = j0Var.f168202c;
                try {
                    Object content = data2.getContent();
                    if (content != null) {
                        n0 n0Var2 = (n0) content;
                        h93.f0 card = n0Var2.f168219a;
                        yt8.i kycStatus = n0Var2.f168220b;
                        long j2 = n0Var2.f168221c;
                        String str = n0Var2.d;
                        Intrinsics.checkNotNullParameter(card, "card");
                        Intrinsics.checkNotNullParameter(kycStatus, "kycStatus");
                        n0Var = new n0(card, kycStatus, j2, str, true);
                    } else {
                        n0Var = null;
                    }
                    data = new Data(n0Var, data2.getError(), data2.getLoading());
                    break;
                } catch (Throwable th10) {
                    data = new Data(null, th10, data2.getLoading());
                }
                return j0.a(j0Var, dataP, data, null, null, null, null, null, null, null, false, 8185);
        }
    }
}
