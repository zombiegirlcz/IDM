package e05;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.credit.forbearance.application.impl.ui.forbearance.spinner.ForbearanceSpinnerPresenter$ApplicationIdRetrieveError;
import com.revolut.retail.common.ui.R$string;
import com.revolut.retail.operation_status.modal_status.StatusViewConfiguration;
import com.revolut.revolut.feature_fourthline_impl.R;
import dz7.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vz4.l;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f121413b;

    public /* synthetic */ d(i iVar, int i) {
        this.f121412a = i;
        this.f121413b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f121412a) {
            case 0:
                l lVar = (l) this.f121413b.k;
                lVar.getClass();
                pfm.h hVar = new pfm.h(new ty7.b(lVar, 16), 2);
                Intrinsics.checkNotNullExpressionValue(hVar, "fromAction(...)");
                return hVar;
            case 1:
                lz4.a status = (lz4.a) obj2;
                Intrinsics.checkNotNullParameter(status, "status");
                return new ufm.i(((sz4.b) this.f121413b.f121421m).a(status).o(), new dz7.l(new k(10), 8), 1);
            default:
                if (((Throwable) obj2) instanceof ForbearanceSpinnerPresenter$ApplicationIdRetrieveError) {
                    ((k3l.d) this.f121413b.f121422n).O(new StatusViewConfiguration.Error("ID_STATUS_DIALOG_ERROR", new TextLocalisedClause(R.string.error_generic, null, null, 14), null, new TextLocalisedClause(R$string.common_ok, null, null, 14), null, null, null, 8180));
                }
                return Unit.f186387a;
        }
    }
}
