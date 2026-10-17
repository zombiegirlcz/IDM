package dcl;

import android.content.Context;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.revolut.feature.cryptocommodity_invest.impl.ui.standalone_symbol.screen.StandaloneSymbolCustomisationScreen;
import com.revolut.feature.shared_separate_favourites.api.combined_watchlist.SelectAssetsInputData;
import com.revolut.kompot.navigable.vc.ViewController;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements qfd.a, vh.d, SuccessContinuation, igm.o, igm.p, igm.d, com.google.crypto.tink.shaded.protobuf.e0 {
    public /* synthetic */ q(Object obj2) {
    }

    @Override // qfd.a
    public ViewController a(SelectAssetsInputData inputData) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        return new StandaloneSymbolCustomisationScreen();
    }

    @Override // igm.o
    public Object apply(Object obj2) {
        Object[] objArr = (Object[]) obj2;
        if (objArr.length != 3) {
            throw new IllegalArgumentException("Array of size 3 expected but got " + objArr.length);
        }
        Object obj3 = objArr[0];
        Object obj4 = objArr[1];
        Object obj5 = objArr[2];
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:337:0x062b  */
    /* JADX WARN: Removed duplicated region for block: B:367:0x06a3  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x06a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:425:0x00b1 A[SYNTHETIC] */
    @Override // vh.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public yh.b b(java.lang.String r30, vh.a r31, int r32, int r33, aim.f r34) throws com.google.zxing.WriterException {
        /*
            Method dump skipped, instruction units count: 2070
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dcl.q.b(java.lang.String, vh.a, int, int, aim.f):yh.b");
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00d2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.revolut.core.ui_kit.models.CompositeClause c(com.revolut.data.model.Data r17, dj0.d r18) {
        /*
            Method dump skipped, instruction units count: 472
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dcl.q.c(com.revolut.data.model.Data, dj0.d):com.revolut.core.ui_kit.models.CompositeClause");
    }

    @Override // igm.p
    public boolean test(Object obj2) {
        throw null;
    }

    @Override // com.google.android.gms.tasks.SuccessContinuation
    public Task then(Object obj2) {
        return Tasks.forResult(Boolean.TRUE);
    }

    public q(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public q(r39.a homeFactory, qy5.a creditFactory) {
        Intrinsics.checkNotNullParameter(homeFactory, "homeFactory");
        Intrinsics.checkNotNullParameter(creditFactory, "creditFactory");
    }

    public q(wt5.a cryptoInvestmentsCalculations) {
        Intrinsics.checkNotNullParameter(cryptoInvestmentsCalculations, "cryptoInvestmentsCalculations");
    }

    public q(ynj.e commonUiBuilder) {
        Intrinsics.checkNotNullParameter(commonUiBuilder, "commonUiBuilder");
    }

    public q(aa0.i conditionsInteractor, xl2.f backendFlowConfiguration) {
        Intrinsics.checkNotNullParameter(conditionsInteractor, "conditionsInteractor");
        Intrinsics.checkNotNullParameter(backendFlowConfiguration, "backendFlowConfiguration");
    }

    public q() {
    }
}
