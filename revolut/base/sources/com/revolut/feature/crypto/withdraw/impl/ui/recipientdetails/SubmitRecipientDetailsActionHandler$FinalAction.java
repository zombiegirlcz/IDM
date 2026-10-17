package com.revolut.feature.crypto.withdraw.impl.ui.recipientdetails;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"com/revolut/feature/crypto/withdraw/impl/ui/recipientdetails/SubmitRecipientDetailsActionHandler$FinalAction", "Landroid/os/Parcelable;", "", "Lcom/revolut/feature/crypto/withdraw/impl/ui/recipientdetails/SubmitRecipientDetailsActionHandler$FinalAction;", "GO_BACK", "DO_NOTHING", "feature_crypto_withdraw_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SubmitRecipientDetailsActionHandler$FinalAction implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubmitRecipientDetailsActionHandler$FinalAction[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<SubmitRecipientDetailsActionHandler$FinalAction> CREATOR;
    public static final SubmitRecipientDetailsActionHandler$FinalAction DO_NOTHING;
    public static final SubmitRecipientDetailsActionHandler$FinalAction GO_BACK;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return SubmitRecipientDetailsActionHandler$FinalAction.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SubmitRecipientDetailsActionHandler$FinalAction[i];
        }
    }

    static {
        SubmitRecipientDetailsActionHandler$FinalAction submitRecipientDetailsActionHandler$FinalAction = new SubmitRecipientDetailsActionHandler$FinalAction("GO_BACK", 0);
        GO_BACK = submitRecipientDetailsActionHandler$FinalAction;
        SubmitRecipientDetailsActionHandler$FinalAction submitRecipientDetailsActionHandler$FinalAction2 = new SubmitRecipientDetailsActionHandler$FinalAction("DO_NOTHING", 1);
        DO_NOTHING = submitRecipientDetailsActionHandler$FinalAction2;
        SubmitRecipientDetailsActionHandler$FinalAction[] submitRecipientDetailsActionHandler$FinalActionArr = {submitRecipientDetailsActionHandler$FinalAction, submitRecipientDetailsActionHandler$FinalAction2};
        $VALUES = submitRecipientDetailsActionHandler$FinalActionArr;
        $ENTRIES = s.n(submitRecipientDetailsActionHandler$FinalActionArr);
        CREATOR = new a();
    }

    public static SubmitRecipientDetailsActionHandler$FinalAction valueOf(String str) {
        return (SubmitRecipientDetailsActionHandler$FinalAction) Enum.valueOf(SubmitRecipientDetailsActionHandler$FinalAction.class, str);
    }

    public static SubmitRecipientDetailsActionHandler$FinalAction[] values() {
        return (SubmitRecipientDetailsActionHandler$FinalAction[]) $VALUES.clone();
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
