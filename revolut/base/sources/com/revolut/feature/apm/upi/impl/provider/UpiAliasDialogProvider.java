package com.revolut.feature.apm.upi.impl.provider;

import android.os.Parcel;
import android.os.Parcelable;
import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.apm.upi.api.R$string;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import nii.l0;
import nii.z;
import org.jetbrains.annotations.NotNull;
import vc.s;
import zhm.v;

/* JADX INFO: loaded from: classes21.dex */
public final class UpiAliasDialogProvider {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/upi/impl/provider/UpiAliasDialogProvider$ActionableErrorDialogType;", "Landroid/os/Parcelable;", "", "SINGLE_BUTTON_TRY_AGAIN", "DOUBLE_BUTTON_TRY_AGAIN_AND_BANK_DETAILS", "DOUBLE_BUTTON_CONFIRM_ALIAS_CHANGE", "feature_apm_upi_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ActionableErrorDialogType implements Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ActionableErrorDialogType[] $VALUES;

        @NotNull
        public static final Parcelable.Creator<ActionableErrorDialogType> CREATOR;
        public static final ActionableErrorDialogType DOUBLE_BUTTON_CONFIRM_ALIAS_CHANGE;
        public static final ActionableErrorDialogType DOUBLE_BUTTON_TRY_AGAIN_AND_BANK_DETAILS;
        public static final ActionableErrorDialogType SINGLE_BUTTON_TRY_AGAIN;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return ActionableErrorDialogType.valueOf(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ActionableErrorDialogType[i];
            }
        }

        static {
            ActionableErrorDialogType actionableErrorDialogType = new ActionableErrorDialogType("SINGLE_BUTTON_TRY_AGAIN", 0);
            SINGLE_BUTTON_TRY_AGAIN = actionableErrorDialogType;
            ActionableErrorDialogType actionableErrorDialogType2 = new ActionableErrorDialogType("DOUBLE_BUTTON_TRY_AGAIN_AND_BANK_DETAILS", 1);
            DOUBLE_BUTTON_TRY_AGAIN_AND_BANK_DETAILS = actionableErrorDialogType2;
            ActionableErrorDialogType actionableErrorDialogType3 = new ActionableErrorDialogType("DOUBLE_BUTTON_CONFIRM_ALIAS_CHANGE", 2);
            DOUBLE_BUTTON_CONFIRM_ALIAS_CHANGE = actionableErrorDialogType3;
            ActionableErrorDialogType[] actionableErrorDialogTypeArr = {actionableErrorDialogType, actionableErrorDialogType2, actionableErrorDialogType3};
            $VALUES = actionableErrorDialogTypeArr;
            $ENTRIES = s.n(actionableErrorDialogTypeArr);
            CREATOR = new a();
        }

        public static ActionableErrorDialogType valueOf(String str) {
            return (ActionableErrorDialogType) Enum.valueOf(ActionableErrorDialogType.class, str);
        }

        public static ActionableErrorDialogType[] values() {
            return (ActionableErrorDialogType[]) $VALUES.clone();
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(name());
        }
    }

    public static z a() {
        return new z(new TextLocalisedClause(R$string.upi_id_mobile_error_not_found_title, null, null, 14), new TextLocalisedClause(R$string.upi_id_mobile_error_not_found_description, null, null, 14), new TextLocalisedClause(R$string.upi_id_mobile_error_not_found_primary_cta, null, null, 14), new TextLocalisedClause(R$string.upi_id_mobile_error_not_found_secondary_cta, null, null, 14), null, ActionableErrorDialogType.DOUBLE_BUTTON_TRY_AGAIN_AND_BANK_DETAILS, false, null, null, null, null, null, null, 32596);
    }

    public static l0 b(String newBeneficiaryName, String aliasValue) {
        Intrinsics.checkNotNullParameter(newBeneficiaryName, "newBeneficiaryName");
        Intrinsics.checkNotNullParameter(aliasValue, "aliasValue");
        return new l0(new TextLocalisedClause(R$string.upi_id_mobile_error_name_changed_title, null, null, 14), new CompositeClause(v.k(new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_change_subtitle, null, null, 14), new TextClause(newBeneficiaryName, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), new TextClause(aliasValue, (Style) null, (Integer) null, false, (o9) null, (List) null, 126)), new TextClause("\n", (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 12), null, new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_change_confirm, null, null, 14), new TextLocalisedClause(com.revolut.feature.apm.core.api.R$string.apm_contact_change_change_recipient, null, null, 14), ActionableErrorDialogType.DOUBLE_BUTTON_CONFIRM_ALIAS_CHANGE, false, null, 964);
    }

    public static l0 c() {
        return new l0(new TextLocalisedClause(R$string.upi_id_mobile_error_generic_title, null, null, 14), new TextLocalisedClause(R$string.upi_id_mobile_error_generic_description, null, null, 14), null, new TextLocalisedClause(R$string.upi_id_mobile_error_generic_primary_cta, null, null, 14), null, ActionableErrorDialogType.SINGLE_BUTTON_TRY_AGAIN, false, null, 964);
    }
}
