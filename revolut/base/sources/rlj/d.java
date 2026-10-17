package rlj;

import com.revolut.core.ui_kit.delegates.InputTextDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.retail.feature.esim.api.model.EsimPhoneNumberPortingOwnerAccountType;
import com.revolut.retail.feature.esim.impl.R$string;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.crypto.digests.Blake2xsDigest;
import org.jetbrains.annotations.NotNull;
import yp0.r;

/* JADX INFO: loaded from: classes11.dex */
public final class d {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    public static InputTextDelegate.Model a(EsimPhoneNumberPortingOwnerAccountType phoneNumberType) {
        TextLocalisedClause textLocalisedClause;
        TextLocalisedClause textLocalisedClause2;
        Intrinsics.checkNotNullParameter(phoneNumberType, "phoneNumberType");
        TextLocalisedClause textLocalisedClause3 = new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_phone_number_type_picker_title, null, null, 14);
        int i = e.f255090a[phoneNumberType.f100367a.ordinal()];
        if (i == 1) {
            textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_phone_number_type_picker_option_personal, null, null, 14);
        } else {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                textLocalisedClause2 = null;
                return r.a(new InputTextDelegate.Model("ID_NUMBER_TRANSFER_PHONE_NUMBER_TYPE_PICKER", textLocalisedClause2, textLocalisedClause3, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
            }
            textLocalisedClause = new TextLocalisedClause(R$string.esim_mobile_plan_number_transfer_confirmation_phone_number_type_picker_option_business, null, null, 14);
        }
        textLocalisedClause2 = textLocalisedClause;
        return r.a(new InputTextDelegate.Model("ID_NUMBER_TRANSFER_PHONE_NUMBER_TYPE_PICKER", textLocalisedClause2, textLocalisedClause3, null, false, null, false, null, null, null, null, null, null, false, null, null, false, false, false, false, null, 0, null, null, false, false, null, null, false, null, false, false, null, false, false, 0, false, false, null, null, null, null, 0, 0, 0, 0, -8, Blake2xsDigest.UNKNOWN_DIGEST_LENGTH));
    }
}
