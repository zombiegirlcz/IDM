package im6;

import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model.CrossBorderCountryDepartmentUiModel;
import com.revolut.feature.external_accounts.impl.ui.flow.cross_border.model.CrossBorderInstitutionPaymentInfoUiModel;
import kotlin.jvm.internal.Intrinsics;
import se6.b;
import se6.i;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static CrossBorderCountryDepartmentUiModel a(i countryDepartment) {
        Intrinsics.checkNotNullParameter(countryDepartment, "countryDepartment");
        String str = countryDepartment.f262136a;
        String str2 = countryDepartment.f262137b;
        String str3 = countryDepartment.f262138c;
        boolean z = countryDepartment.d;
        boolean z3 = countryDepartment.e;
        boolean z4 = countryDepartment.f;
        b bVar = countryDepartment.f262139g;
        CrossBorderInstitutionPaymentInfoUiModel crossBorderInstitutionPaymentInfoUiModel = bVar != null ? new CrossBorderInstitutionPaymentInfoUiModel(bVar.f262122a, bVar.f262123b, bVar.f262124c, bVar.d, bVar.e) : null;
        se6.a aVar = countryDepartment.f262140h;
        return new CrossBorderCountryDepartmentUiModel(str, str2, str3, z, z3, z4, crossBorderInstitutionPaymentInfoUiModel, aVar != null ? new CrossBorderCountryDepartmentUiModel.Outage(aVar.f262119a, aVar.f262120b, aVar.f262121c) : null);
    }
}
