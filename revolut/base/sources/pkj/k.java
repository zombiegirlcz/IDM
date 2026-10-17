package pkj;

import cli.n;
import cli.y;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPorting;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberSelections;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_number_transfer.EsimMobilePlanNumberTransferScreenContract$InputData;
import dej.q0;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes11.dex */
public final class k extends oki.h implements dli.b {

    @NotNull
    public static final j Companion = new j();
    public final EsimMobilePlanNumberTransferScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final r10.d f237206p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final z80.b f237207q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f237208r;

    public k(n stateMapper, EsimMobilePlanNumberTransferScreenContract$InputData inputData, r10.d numberTransferInteractor, z80.b phoneToolsProvider) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(numberTransferInteractor, "numberTransferInteractor");
        Intrinsics.checkNotNullParameter(phoneToolsProvider, "phoneToolsProvider");
        this.o = inputData;
        this.f237206p = numberTransferInteractor;
        this.f237207q = phoneToolsProvider;
        this.f237208r = mra.d.b(this, new e(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        wi0.b bVar;
        EsimMobilePlanNumberTransferScreenContract$InputData esimMobilePlanNumberTransferScreenContract$InputData = this.o;
        EsimPhoneNumberSelections esimPhoneNumberSelections = esimMobilePlanNumberTransferScreenContract$InputData.f101255a;
        EsimGiftRecipient esimGiftRecipient = esimMobilePlanNumberTransferScreenContract$InputData.f101256b;
        EsimPhoneNumberPorting esimPhoneNumberPorting = esimPhoneNumberSelections.f100408b.f100404a;
        Continuation continuation = null;
        if (esimPhoneNumberPorting != null && (bVar = (wi0.b) d0.d0(esimPhoneNumberPorting.f100332b)) != null) {
            H2(this.f237208r, new pj3.b(I2(this.f237206p.r0(esimGiftRecipient != null ? esimGiftRecipient.f : null, bVar)), this, 4));
            if (esimGiftRecipient == null) {
                l2(new of6.d(this, bVar, continuation, 18), new yi5.b(26));
                return;
            }
            return;
        }
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("No eligible countries");
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.a(rd0.c.ERROR, "EsimMobilePlanNumberTransferScreenModel", null, illegalArgumentException, h0Var);
        B2();
    }

    public final q0 I2(q0 q0Var) {
        String str = q0Var.f113622a;
        wi0.b countryCode = q0Var.f113624c;
        String number = kotlin.text.d0.e0(this.f237207q.a(str, countryCode.f297794a, yk0.b.NATIONAL), "0");
        int i = q0Var.f113623b;
        Intrinsics.checkNotNullParameter(number, "number");
        Intrinsics.checkNotNullParameter(countryCode, "countryCode");
        return new q0(i, number, countryCode);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f237208r;
    }
}
