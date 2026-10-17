package dlf;

import com.revolut.feature_pdf_view.PdfViewFeatureConfiguration;
import com.revolut.feature_pdf_view.Source;
import com.revolut.retail.core.navigation.FeatureCommand;
import elf.s0;
import klf.h0;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends yji.n implements s0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final h0 f115734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zf3.a f115735m;

    public b(h0 commonDataSource, zf3.a checkTopupInteractor) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(checkTopupInteractor, "checkTopupInteractor");
        this.f115734l = commonDataSource;
        this.f115735m = checkTopupInteractor;
    }

    @Override // elf.s0
    public final Object c(Object obj2, String str, Continuation continuation) {
        boolean z;
        if (Intrinsics.f(str, "ID_EXTRAS_CHECK")) {
            Intrinsics.i(obj2, "null cannot be cast to non-null type com.revolut.domain.models.transactions.TransactionDescriptor.GroupId");
            String transactionId = ((k71.c) obj2).f181775b;
            zf3.a aVar = this.f115735m;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(transactionId, "transactionId");
            A2(u0.b(new FeatureCommand(new PdfViewFeatureConfiguration(new Source.Remote(j6.a.r(aVar.f321858b, "/cheque/", transactionId, "/pdf")), null, true, true, null, null, false, 488))));
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
