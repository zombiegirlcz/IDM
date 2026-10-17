package iv7;

import cli.n;
import cli.y;
import com.revolut.data.model.Data;
import com.revolut.feature.insurance.api.models.details.RemoteDocument;
import com.revolut.feature.insurance.api.navigation.InsuranceDestination$SuitabilityStatement;
import com.revolut.feature.insurance_embedded.impl.ui.screen.documents.preview.InsuranceDocumentsPreviewScreenContract$InputData;
import com.revolut.feature_web_view.declaration.WebViewControllerDescriptor;
import com.revolut.feature_web_view.declaration.WebViewInputData;
import com.revolut.feature_web_view.declaration.WebViewScreenTitleSource;
import com.revolut.kompot.common.ControllerDestination;
import kj7.o;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import yji.l;

/* JADX INFO: loaded from: classes4.dex */
public final class i extends oki.h implements e {
    public final InsuranceDocumentsPreviewScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final si7.a f168770p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final ang.f f168771q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final y f168772r;

    public i(n stateMapper, InsuranceDocumentsPreviewScreenContract$InputData inputData, si7.a insuranceInteractor, ang.f userInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(insuranceInteractor, "insuranceInteractor");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        this.o = inputData;
        this.f168770p = insuranceInteractor;
        this.f168771q = userInteractor;
        this.f168772r = mra.d.b(this, new d(new Data(null, null, true, 3, null), new Data(null, null, true, 3, null)), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        l.a1(this, rd0.e.b(this.f168771q.k(false)), null, null, new h(this, null, 1), 3);
        String planId = this.o.f76099a;
        fj7.b bVar = (fj7.b) this.f168770p;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        o oVar = (o) bVar.f135546a;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(planId, "planId");
        l.a1(this, rd0.e.b(oVar.e.f(planId, false)), null, null, new h(this, null, 0), 3);
    }

    public final void I2(Object obj2, String id10) {
        Intrinsics.checkNotNullParameter(id10, "id");
        int iHashCode = id10.hashCode();
        y yVar = this.f168772r;
        if (iHashCode != -796128527) {
            if (iHashCode != 258325705) {
                if (iHashCode == 381231978 && id10.equals("ID_OTHER_PROVIDERS_LINK")) {
                    if ((obj2 instanceof String ? (String) obj2 : null) != null) {
                        K2((String) obj2);
                        return;
                    }
                    return;
                }
            } else if (id10.equals("ID_SUITABILITY_STATEMENT")) {
                ti7.f fVar = (ti7.f) ((d) ((j2) yVar.f22677a).getValue()).f168765b.getContent();
                if (fVar == null) {
                    throw new IllegalStateException("no plan insurance review details found");
                }
                C1(new InsuranceDestination$SuitabilityStatement(fVar.f271434b));
                return;
            }
        } else if (id10.equals("ID_GENERAL_INFORMATION")) {
            ti7.f fVar2 = (ti7.f) ((d) ((j2) yVar.f22677a).getValue()).f168765b.getContent();
            if (fVar2 == null) {
                throw new IllegalStateException("no plan insurance review details found");
            }
            String str = fVar2.f271435c;
            if (str == null) {
                return;
            }
            K2(str);
            return;
        }
        if (obj2 instanceof RemoteDocument) {
            RemoteDocument remoteDocument = (RemoteDocument) obj2;
            J2(remoteDocument.f75013a, remoteDocument.f75014b);
        } else if (obj2 instanceof ti7.j) {
            ti7.j jVar = (ti7.j) obj2;
            J2(jVar.f271442b, jVar.f271443c);
        }
    }

    public final void J2(String str, vi7.a aVar) {
        int i = g.f168768a[aVar.ordinal()];
        if (i == 1) {
            A1(new ikf.g(this, str, null, 22), new yi5.b(25));
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            K2(str);
        }
    }

    public final void K2(String str) {
        C1(new ControllerDestination.Stack(new WebViewControllerDescriptor(new WebViewInputData(str, WebViewScreenTitleSource.Html.f98166a, false)), null, true));
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f168772r;
    }
}
