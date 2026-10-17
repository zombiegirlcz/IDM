package jt4;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.credit.card.api.navigation.descriptor.CreditCardDialog$InputData;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import om4.d0;
import vkm.q;
import yji.l;
import zhm.h0;

/* JADX INFO: loaded from: classes22.dex */
public final class i extends oki.h implements a {
    public final CreditCardDialog$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final d0 f178347p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ky4.e f178348q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f178349r;

    public i(CreditCardDialog$InputData inputData, d0 creditCardDialogInteractor, j stateMapper) {
        Data data;
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(creditCardDialogInteractor, "creditCardDialogInteractor");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f178347p = creditCardDialogInteractor;
        this.f178348q = new ky4.e(0);
        if (inputData instanceof CreditCardDialog$InputData.PreLoadedContent) {
            data = new Data(((CreditCardDialog$InputData.PreLoadedContent) inputData).f68992a, null, false, 6, null);
        } else {
            if (!(inputData instanceof CreditCardDialog$InputData.LoadContent)) {
                throw new NoWhenBranchMatchedException();
            }
            data = new Data(null, null, true, 3, null);
        }
        this.f178349r = mra.d.b(this, new b(data), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        CreditCardDialog$InputData creditCardDialog$InputData = this.o;
        if (creditCardDialog$InputData instanceof CreditCardDialog$InputData.LoadContent) {
            CreditCardDialog$InputData.LoadContent loadContent = (CreditCardDialog$InputData.LoadContent) creditCardDialog$InputData;
            Continuation continuation = null;
            l.a1(this, rd0.e.n(q.Q(this.f178348q, new a67.c(continuation, this, loadContent.f68990a, loadContent.f68991b, 24)), h0.f322473a), null, null, new jij.h(this, continuation, 26), 3);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f178349r;
    }
}
