package htf;

import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.transfer_reasons.api.R$string;
import com.revolut.feature.transfer_reasons.impl.ui.reasons.TransferReasonsScreenContract$InputData;
import com.revolut.feature.transfer_reasons.models.reason.TransferReasonCategory;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zhm.d0;
import zhm.h0;

/* JADX INFO: loaded from: classes9.dex */
public final class r extends oki.h implements o {
    public final csf.a o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final psf.a f155380p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final TransferReasonsScreenContract$InputData f155381q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final isf.d f155382r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Flow f155383s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Flow f155384t;
    public final y u;

    public r(cli.n stateMapper, fnc.s factory, csf.a additionalInfoInteractor, psf.a faqDestinationsProvider, TransferReasonsScreenContract$InputData inputData, isf.d provider, Flow selectedReasonsFlow, Flow selectedCategoryFlow) {
        Object next;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(additionalInfoInteractor, "additionalInfoInteractor");
        Intrinsics.checkNotNullParameter(faqDestinationsProvider, "faqDestinationsProvider");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(provider, "provider");
        Intrinsics.checkNotNullParameter(selectedReasonsFlow, "selectedReasonsFlow");
        Intrinsics.checkNotNullParameter(selectedCategoryFlow, "selectedCategoryFlow");
        this.o = additionalInfoInteractor;
        this.f155380p = faqDestinationsProvider;
        this.f155381q = inputData;
        this.f155382r = provider;
        this.f155383s = selectedReasonsFlow;
        this.f155384t = selectedCategoryFlow;
        TransferReasonsScreenContract$InputData transferReasonsScreenContract$InputData = (TransferReasonsScreenContract$InputData) factory.f136657b;
        ArrayList arrayList = transferReasonsScreenContract$InputData.f92391b;
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        Iterator it8 = arrayList.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            String str = ((TransferReasonCategory) next).f92435a;
            TransferReasonCategory transferReasonCategory = transferReasonsScreenContract$InputData.f92392c;
            if (Intrinsics.f(str, transferReasonCategory != null ? transferReasonCategory.f92435a : null)) {
                break;
            }
        }
        TransferReasonCategory transferReasonCategory2 = (TransferReasonCategory) next;
        TransferReasonCategory transferReasonCategory3 = transferReasonCategory2 == null ? (TransferReasonCategory) d0.b0(arrayList) : transferReasonCategory2;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!Intrinsics.f(((TransferReasonCategory) obj2).f92435a, transferReasonCategory3.f92435a)) {
                arrayList2.add(obj2);
            }
        }
        this.u = mra.d.b(this, new g(transferReasonsScreenContract$InputData.f92390a, transferReasonCategory3, new h(new TextLocalisedClause(R$string.transfer_reasons_outbound_other_form_types, null, null, 14), arrayList2), transferReasonCategory2, h0.f322473a, false), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        Continuation continuation = null;
        yji.l.a1(this, this.f155383s, null, null, new q(this, continuation, 0), 3);
        yji.l.a1(this, this.f155384t, null, null, new q(this, continuation, 1), 3);
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.u;
    }
}
