package wif;

import com.revolut.data.model.Data;
import com.revolut.feature.transactions.impl.data.network.SavingsInterestTransactionsService;
import e4k.m0;
import efm.d0;
import efm.r;
import java.io.IOException;
import java.io.StringWriter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import te0.w;
import ufm.i;
import wf6.o;
import wgk.f;
import xe.e;
import yhf.v;
import zhm.f0;

/* JADX INFO: loaded from: classes13.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f297889a;

    public a(SavingsInterestTransactionsService transactionsService) {
        Intrinsics.checkNotNullParameter(transactionsService, "transactionsService");
        this.f297889a = transactionsService;
    }

    public String a(Object obj2) {
        StringWriter stringWriter = new StringWriter();
        try {
            xe.d dVar = (xe.d) this.f297889a;
            e eVar = new e(stringWriter, dVar.f304508a, dVar.f304509b, dVar.f304510c, dVar.d);
            eVar.a(obj2);
            eVar.c();
            eVar.f304512b.flush();
        } catch (IOException unused) {
        }
        return stringWriter.toString();
    }

    public r b(long j2) {
        px9.c cVar = (px9.c) this.f297889a;
        sfm.b bVar = new sfm.b(new i(cVar.f240586b.f(false), new pva.c(9, new px0.a(4)), 1), new pva.c(10, new m0(cVar, j2, 11)), 2);
        Intrinsics.checkNotNullExpressionValue(bVar, "flatMapObservable(...)");
        f0 f0Var = f0.f322471a;
        r rVarStartWith = bVar.startWith(new Data(f0Var, null, true, 2, null));
        Intrinsics.checkNotNullExpressionValue(rVarStartWith, "startWith(...)");
        return ue0.e.E(rVarStartWith, new Data(f0Var, null, false, 6, null));
    }

    @Override // wif.c
    public d0 c(b params) {
        Intrinsics.checkNotNullParameter(params, "params");
        d0<v> transactionDetails = ((SavingsInterestTransactionsService) this.f297889a).getTransactionDetails(params.b());
        o oVar = new o(11, new f(9));
        transactionDetails.getClass();
        i iVar = new i(transactionDetails, oVar, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    public r d(wog.a featureName) {
        Intrinsics.checkNotNullParameter(featureName, "featureName");
        boolean z = true;
        if (((o8b.c) ((n8b.a) this.f297889a)).g()) {
            switch (zog.a.f324053a[featureName.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    z = false;
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return w.h(Boolean.valueOf(z));
    }

    public a(n8b.a countryInteractor) {
        Intrinsics.checkNotNullParameter(countryInteractor, "countryInteractor");
        this.f297889a = countryInteractor;
    }

    public a(px9.c recentMessagesInteractor) {
        Intrinsics.checkNotNullParameter(recentMessagesInteractor, "recentMessagesInteractor");
        this.f297889a = recentMessagesInteractor;
    }

    public a(xe.d dVar) {
        this.f297889a = dVar;
    }
}
