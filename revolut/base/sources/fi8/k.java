package fi8;

import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.junior_onboarding.api.model.ConsentMechanics;
import com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.JuniorDetailsConfirmationScreenContract$InputData;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import rh8.o0;
import yji.l;
import zhm.h0;
import zhm.q0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class k extends oki.h implements h {
    public final ang.f o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final o0 f135353p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final prl.e f135354q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f135355r;

    public k(JuniorDetailsConfirmationScreenContract$InputData inputData, com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation.mapper.a stateMapper, ang.f userInteractor, o0 termsProvider, prl.e juniorCreationInteractor) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(termsProvider, "termsProvider");
        Intrinsics.checkNotNullParameter(juniorCreationInteractor, "juniorCreationInteractor");
        this.o = userInteractor;
        this.f135353p = termsProvider;
        this.f135354q = juniorCreationInteractor;
        Data data = new Data(null, null, true, 3, null);
        Data data2 = new Data(null, null, true, 3, null);
        h0 h0Var = h0.f322473a;
        ArrayList<ConsentMechanics.OptOut> arrayList = inputData.f77021a.e;
        int iB = q0.b(w.t(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iB < 16 ? 16 : iB);
        for (ConsentMechanics.OptOut optOut : arrayList) {
            linkedHashMap.put(optOut.f76951a, Boolean.valueOf(optOut.f76953c));
        }
        this.f135355r = mra.d.b(this, new f(data, data2, h0Var, linkedHashMap), stateMapper, new a(), false, 8);
    }

    @Override // yji.l
    public final void I1() {
        l2(new ewa.d(this, null, 21), new yi5.b(26));
        l.a1(this, this.o.j(w4l.j.f294644c), null, null, new j(this, null, 1), 3);
        l.a1(this, rd0.e.b(this.f135353p.d()), null, null, new j(this, null, 0), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f135355r;
    }
}
