package yi1;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.address.common.api.R$string;
import com.revolut.feature.address.models.Address;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes20.dex */
public final class e {
    public static TextLocalisedClause a(Address.Type addressType) {
        Intrinsics.checkNotNullParameter(addressType, "addressType");
        int i = d.f314217a[addressType.ordinal()];
        if (i == 1) {
            return new TextLocalisedClause(R$string.shared_address_flow_address_type_office, null, null, 14);
        }
        if (i == 2) {
            return new TextLocalisedClause(R$string.shared_address_flow_address_type_coworking, null, null, 14);
        }
        if (i == 3) {
            return new TextLocalisedClause(R$string.shared_address_flow_address_type_home, null, null, 14);
        }
        if (i == 4) {
            return new TextLocalisedClause(R$string.shared_address_flow_address_type_private_mailbox, null, null, 14);
        }
        if (i == 5) {
            return new TextLocalisedClause(R$string.shared_address_flow_address_type_other, null, null, 14);
        }
        throw new NoWhenBranchMatchedException();
    }
}
