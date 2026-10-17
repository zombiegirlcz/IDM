package hg9;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.pay_bills_taxes.impl.ui.errors.FormServerError;
import com.revolut.feature.pay_bills_taxes.impl.ui.screen.error.FormErrorsScreenContract$InputData;
import kotlin.jvm.internal.Intrinsics;
import tsk.t;

/* JADX INFO: loaded from: classes5.dex */
public final class m extends oki.h implements dli.b {
    public final wo1.b o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final t f152126p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final FormErrorsScreenContract$InputData f152127q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final b f152128r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final y f152129s;

    public m(wo1.b billsInteractor, t errorParser, FormErrorsScreenContract$InputData inputData, b subtitleBuilder, n stateMapper) {
        Intrinsics.checkNotNullParameter(billsInteractor, "billsInteractor");
        Intrinsics.checkNotNullParameter(errorParser, "errorParser");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(subtitleBuilder, "subtitleBuilder");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = billsInteractor;
        this.f152126p = errorParser;
        this.f152127q = inputData;
        this.f152128r = subtitleBuilder;
        this.f152129s = mra.d.b(this, new g(new Data(null, null, true, 3, null), inputData.f78708b.f78712c), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        FormServerError formServerError = this.f152127q.f78709c;
        if (formServerError != null) {
            H2(this.f152129s, new h8b.b(this, formServerError, 18));
            return;
        }
        l2(new gvc.m(this, null, 15), new gwc.h(1, this, m.class, "handleError", "handleError(Ljava/lang/Throwable;)Z", 0, 28));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f152129s;
    }
}
