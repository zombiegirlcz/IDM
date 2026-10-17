package com.revolut.feature.credit.card.impl.ui.repay_with_review;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0081\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/credit/card/impl/ui/repay_with_review/AutoPayAction;", "Landroid/os/Parcelable;", "", "NOT_AVAILABLE", "SETUP", "MANAGE", "feature_credit_card_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AutoPayAction implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AutoPayAction[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<AutoPayAction> CREATOR;
    public static final AutoPayAction MANAGE;
    public static final AutoPayAction NOT_AVAILABLE;
    public static final AutoPayAction SETUP;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return AutoPayAction.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AutoPayAction[i];
        }
    }

    static {
        AutoPayAction autoPayAction = new AutoPayAction("NOT_AVAILABLE", 0);
        NOT_AVAILABLE = autoPayAction;
        AutoPayAction autoPayAction2 = new AutoPayAction("SETUP", 1);
        SETUP = autoPayAction2;
        AutoPayAction autoPayAction3 = new AutoPayAction("MANAGE", 2);
        MANAGE = autoPayAction3;
        AutoPayAction[] autoPayActionArr = {autoPayAction, autoPayAction2, autoPayAction3};
        $VALUES = autoPayActionArr;
        $ENTRIES = s.n(autoPayActionArr);
        CREATOR = new a();
    }

    public static AutoPayAction valueOf(String str) {
        return (AutoPayAction) Enum.valueOf(AutoPayAction.class, str);
    }

    public static AutoPayAction[] values() {
        return (AutoPayAction[]) $VALUES.clone();
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
