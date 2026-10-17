package tv7;

import cli.n;
import cli.y;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.insurance_embedded.impl.R$string;
import com.revolut.feature.insurance_embedded.impl.data.model.d0;
import com.revolut.feature.insurance_embedded.impl.ui.screen.embedded.get_help.GetHelpScreenContract$InputData;
import gu7.g1;
import kotlin.jvm.internal.Intrinsics;
import tna.p;
import zhm.u;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends oki.h implements dli.b {
    public final GetHelpScreenContract$InputData o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final hu7.j f274725p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final sv7.a f274726q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final tr7.a f274727r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final mu7.c f274728s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final y f274729t;

    public j(n stateMapper, GetHelpScreenContract$InputData inputData, hu7.j detailRepository, sv7.a contactsControllerModelExtension, tr7.a copyToClipboardHelper, mu7.c insuranceDetailsLayoutInteractor) {
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(detailRepository, "detailRepository");
        Intrinsics.checkNotNullParameter(contactsControllerModelExtension, "contactsControllerModelExtension");
        Intrinsics.checkNotNullParameter(copyToClipboardHelper, "copyToClipboardHelper");
        Intrinsics.checkNotNullParameter(insuranceDetailsLayoutInteractor, "insuranceDetailsLayoutInteractor");
        this.o = inputData;
        this.f274725p = detailRepository;
        this.f274726q = contactsControllerModelExtension;
        this.f274727r = copyToClipboardHelper;
        this.f274728s = insuranceDetailsLayoutInteractor;
        this.f274729t = mra.d.b(this, new h(0), stateMapper, null, false, 12);
    }

    @Override // yji.l
    public final void I1() {
        yji.l.a1(this, mu7.c.a(this.f274728s, this.o.f76127a, false, 6), null, null, new p(this, null, 17), 3);
    }

    public final void I2(Object obj2, String listId) {
        Intrinsics.checkNotNullParameter(listId, "listId");
        if (obj2 instanceof d0) {
            ((sv7.c) this.f274726q).Z2((d0) obj2);
        } else if (obj2 instanceof g1) {
            g1 g1Var = (g1) obj2;
            tr7.a.b(this.f274727r, g1Var.f146751b, new TextLocalisedClause(R$string.embedded_insurance_insurance_details_copy_accessibility_label, u.c(g1Var.f146750a), null, 12), 2);
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f274729t;
    }
}
