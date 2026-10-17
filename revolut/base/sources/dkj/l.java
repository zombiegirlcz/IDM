package dkj;

import a31.w;
import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.retail.feature.esim.api.model.EsimFeaturedPhoneNumberTiers;
import com.revolut.retail.feature.esim.api.model.EsimGiftRecipient;
import com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_featured_number_selection.EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData;
import dfj.i1;
import java.io.Serializable;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import skm.e0;
import skm.p0;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes11.dex */
public final class l extends oki.h implements dli.b {
    public final EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i1 f115577p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ugc.a f115578q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f115579r;

    public l(EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData inputData, i1 esimPhoneNumberInteractor, ugc.a giftRecipientNameResolver, n stateMapper) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(esimPhoneNumberInteractor, "esimPhoneNumberInteractor");
        Intrinsics.checkNotNullParameter(giftRecipientNameResolver, "giftRecipientNameResolver");
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        this.o = inputData;
        this.f115577p = esimPhoneNumberInteractor;
        this.f115578q = giftRecipientNameResolver;
        this.f115579r = mra.d.b(this, new g(new Data(null, null, true, 3, null), null, true, null), stateMapper, null, false, 12);
    }

    public static final Object I2(l lVar, g gVar, d3i.g gVar2) {
        String strN;
        EsimMobilePlanFeaturedNumberSelectionScreenContract$InputData esimMobilePlanFeaturedNumberSelectionScreenContract$InputData = lVar.o;
        String str = ((EsimFeaturedPhoneNumberTiers) d0.b0(esimMobilePlanFeaturedNumberSelectionScreenContract$InputData.f101221c.f100256a)).f100258b;
        i1 i1Var = lVar.f115577p;
        String str2 = esimMobilePlanFeaturedNumberSelectionScreenContract$InputData.f101219a;
        Long l2 = gVar.f115570b;
        EsimGiftRecipient esimGiftRecipient = esimMobilePlanFeaturedNumberSelectionScreenContract$InputData.f101220b;
        if (esimGiftRecipient != null) {
            lVar.f115578q.getClass();
            strN = ugc.a.n(esimGiftRecipient);
        } else {
            strN = null;
        }
        String str3 = strN;
        i1Var.getClass();
        w wVar = new w((Object) i1Var, str2, str, (Object) l2, (Serializable) str3, (Continuation) null, 17);
        p0 p0Var = p0.f264001a;
        return e0.J(elm.f.f127540b, wVar, gVar2);
    }

    @Override // yji.l
    public final void I1() {
        J2();
    }

    public final void J2() {
        g gVar = (g) ((j2) this.f115579r.f22677a).getValue();
        if (!gVar.f115569a.getLoading() || gVar.f115569a.getContent() == null) {
            l2(new d3i.g(this, gVar, null, 28), new yi5.b(26));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f115579r;
    }
}
