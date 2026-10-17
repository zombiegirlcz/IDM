package ny4;

import com.revolut.feature.address.models.Address;
import com.revolut.feature.credit.direct.debit.account_confirmation.InternalData;
import com.revolut.feature.credit.direct.debit.account_selection.models.AccountSelectionSelectedData;
import do3.n;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes22.dex */
public final /* synthetic */ class i implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f220660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f220661b;

    public /* synthetic */ i(k kVar, int i) {
        this.f220660a = i;
        this.f220661b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws IOException {
        switch (this.f220660a) {
            case 0:
                Throwable error = (Throwable) obj2;
                Intrinsics.checkNotNullParameter(error, "error");
                this.f220661b.x2(new nd8.l(error, 3));
                return Boolean.FALSE;
            default:
                n user = (n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                AccountSelectionSelectedData accountSelectionSelectedData = this.f220661b.f220665r.f69866a;
                Address address = user.k;
                String[] elements = {address != null ? address.getStreetLine1() : null, address != null ? address.getPostcode() : null, address != null ? address.getCity() : null};
                Intrinsics.checkNotNullParameter(elements, "elements");
                String strK0 = d0.k0(kotlin.collections.d.L(elements), "\n", null, null, 0, null, 62);
                String str = accountSelectionSelectedData.f69891a;
                String str2 = accountSelectionSelectedData.f69892b;
                String str3 = accountSelectionSelectedData.f69893c;
                String strK02 = accountSelectionSelectedData.d;
                if (strK02 == null) {
                    String[] elements2 = {user.f116410c, user.d, user.e};
                    Intrinsics.checkNotNullParameter(elements2, "elements");
                    strK02 = d0.k0(kotlin.collections.d.L(elements2), " ", null, null, 0, null, 62);
                }
                return new InternalData(str, str2, strK02, strK0, str3);
        }
    }
}
