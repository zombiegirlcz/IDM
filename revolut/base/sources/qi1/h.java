package qi1;

import aw0.n6;
import aw0.o9;
import cli.j;
import cli.k;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.address.common.impl.flow.validation_flow.bad_address.BadAddressSheetContract$InputData;
import com.revolut.feature.address.models.Address;
import com.revolut.feature.address.models.AddressVerificationFailureReason;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes20.dex */
public final class h implements n {

    @NotNull
    public static final f Companion = new f();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final BadAddressSheetContract$InputData f246626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final uh1.a f246627b;

    public h(BadAddressSheetContract$InputData inputData, uh1.a addressPrinter) {
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(addressPrinter, "addressPrinter");
        this.f246626a = inputData;
        this.f246627b = addressPrinter;
    }

    @Override // cli.n
    public final o c(j jVar) {
        TextLocalisedClause textLocalisedClause;
        k domainState = (k) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        BadAddressSheetContract$InputData badAddressSheetContract$InputData = this.f246626a;
        AddressVerificationFailureReason addressVerificationFailureReason = badAddressSheetContract$InputData.f61029b;
        int i = addressVerificationFailureReason == null ? -1 : g.f246625a[addressVerificationFailureReason.ordinal()];
        if (i == -1) {
            textLocalisedClause = new TextLocalisedClause(R$string.address_verification_unverified_address_subtitle, null, null, 14);
        } else {
            if (i != 1) {
                throw new NoWhenBranchMatchedException();
            }
            textLocalisedClause = new TextLocalisedClause(R$string.address_verification_unverified_address_subtitle_non_residential, null, null, 14);
        }
        TextLocalisedClause textLocalisedClause2 = textLocalisedClause;
        Address address = badAddressSheetContract$InputData.f61028a;
        List listC = u.c(new RowDelegate.Model("POOR_ADDRESS_LIST_ID", null, new TextClause(((yi1.a) this.f246627b).b(address, address.getFormat()), (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, null, null, 0, 0, 0, 0, 536870906));
        yp0.b.k(listC, 0, 0, 0, 0, 31);
        return new cii.b(new aw0.h(false, new n6(new TextLocalisedClause(R$string.address_verification_unverified_address_continue_button, null, null, 14), LargeActionButton.ButtonStyle.f58725a, null, null, false, null, null, 1020), new n6(new TextLocalisedClause(R$string.address_verification_unverified_address_edit_button, null, null, 14), LargeActionButton.ButtonStyle.f58726b, null, null, false, null, null, 1020), null, null, null, 121), listC, new lw0.a(new TextLocalisedClause(R$string.address_verification_unverified_address_title, null, null, 14), textLocalisedClause2, null, null, false, 28));
    }
}
