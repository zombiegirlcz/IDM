package sw8;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.kyc.api.R$string;
import com.revolut.feature.kyc.api.my_number.JpMyNumberKycStatusViewConfigurationFactory$Parcel;
import kotlin.Pair;
import nii.l0;
import nii.w;
import nii.y0;
import nii.z;

/* JADX INFO: loaded from: classes4.dex */
public final class a {
    public final y0 a(int i) {
        Pair pair;
        switch (i) {
            case 20200:
                pair = new Pair("JP_MY_NUMBER_RECEIVER_ISSUES", new l0(new TextLocalisedClause(R$string.payments_jp_mynumber_overseas_remittance_status_missing_for_receiver_title, null, null, 14), new TextLocalisedClause(R$string.payments_jp_mynumber_overseas_remittance_status_missing_for_receiver_description, null, null, 14), null, new TextLocalisedClause(R$string.payments_jp_mynumber_overseas_remittance_status_warning_primary_button, null, null, 14), null, JpMyNumberKycStatusViewConfigurationFactory$Parcel.RECEIVER_ISSUES, false, null, 980));
                break;
            case 20201:
                pair = new Pair("JP_MY_NUMBER_ABSENT", new z(new TextLocalisedClause(R$string.payments_jp_mynumber_overseas_remittance_status_missing_title, null, null, 14), new TextLocalisedClause(R$string.payments_jp_mynumber_overseas_remittance_status_missing_description, null, null, 14), new TextLocalisedClause(R$string.payments_jp_mynumber_overseas_remittance_status_missing_primary_button, null, null, 14), null, null, JpMyNumberKycStatusViewConfigurationFactory$Parcel.ABSENT, false, null, null, null, null, null, null, 32628));
                break;
            case 20202:
                pair = new Pair("JP_MY_NUMBER_PENDING", new l0(new TextLocalisedClause(R$string.payments_jp_mynumber_overseas_remittance_status_warning_title, null, null, 14), new TextLocalisedClause(R$string.payments_jp_mynumber_overseas_remittance_status_warning_pending_description, null, null, 14), null, new TextLocalisedClause(R$string.payments_jp_mynumber_overseas_remittance_status_warning_primary_button, null, null, 14), null, JpMyNumberKycStatusViewConfigurationFactory$Parcel.PENDING, false, null, 980));
                break;
            default:
                return null;
        }
        return new y0((String) pair.f186385a, (w) pair.f186386b, false, 4);
    }
}
