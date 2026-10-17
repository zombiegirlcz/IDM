package yc0;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.HtmlClause;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.feature.address.common.api.flow.AddressFlowContract$InputData;
import com.revolut.feature.address.common.api.flow.FieldMode;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.backend_flow.domain.models.AddressInputItem;
import com.revolut.feature.backend_flow.domain.models.BackendFlowNavigationIcon;
import com.revolut.feature.backend_flow.domain.models.FormScreen;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f312414a;

    public c(b0 iconProvider) {
        Intrinsics.checkNotNullParameter(iconProvider, "iconProvider");
        this.f312414a = iconProvider;
    }

    public final AddressFlowContract$InputData a(FormScreen screen, AddressInputItem item) {
        FieldMode editable;
        qh1.b bVar;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(item, "item");
        AddressInputItem.CountrySelector countrySelector = item.f63235c;
        xl2.c cVar = countrySelector.f63250a;
        Address address = item.d;
        if (address == null) {
            wi0.b bVar2 = countrySelector.f63251b;
            address = bVar2 != null ? new Address(null, null, null, null, null, bVar2.f297794a, null, null, null, null, null, null, null, null, null, 32735, null) : null;
        }
        Address address2 = address;
        TextClause textClauseN = uj3.b.n(screen);
        HtmlClause htmlClauseK = uj3.b.k(screen);
        Clause clauseJ = uj3.b.j(screen);
        boolean z = !item.f63234b;
        if (address2 == null) {
            editable = new FieldMode.Editable(true);
        } else {
            int i = b.f312413a[cVar.ordinal()];
            if (i == 1) {
                editable = FieldMode.Hidden.f60954a;
            } else if (i == 2) {
                editable = FieldMode.NotEditable.f60955a;
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                editable = new FieldMode.Editable(true);
            }
        }
        FieldMode fieldMode = editable;
        h hVar = (h) this.f312414a;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(screen, "screen");
        boolean zJ = hVar.f312425a.J(screen);
        BackendFlowNavigationIcon.BackArrow backArrow = BackendFlowNavigationIcon.BackArrow.f63285a;
        BackendFlowNavigationIcon backendFlowNavigationIconA = zJ ? hVar.a() : backArrow;
        if (Intrinsics.f(backendFlowNavigationIconA, BackendFlowNavigationIcon.Cross.f63286a)) {
            bVar = qh1.b.CLOSE;
        } else if (Intrinsics.f(backendFlowNavigationIconA, BackendFlowNavigationIcon.Hidden.f63287a)) {
            bVar = qh1.b.NONE;
        } else {
            if (!Intrinsics.f(backendFlowNavigationIconA, backArrow) && backendFlowNavigationIconA != null) {
                throw new NoWhenBranchMatchedException();
            }
            bVar = qh1.b.BACK;
        }
        return new AddressFlowContract$InputData(address2, textClauseN, htmlClauseK, z, clauseJ, fieldMode, bVar, null, false, null, 2078468);
    }
}
