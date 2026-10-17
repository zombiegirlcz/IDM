package com.revolut.feature.cooldown_checker.api;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/cooldown_checker/api/UserActivity;", "Landroid/os/Parcelable;", "", "EmailChange", "PhoneNumberChange", "AddBeneficiary", "feature_cooldown_checker_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UserActivity implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ UserActivity[] $VALUES;
    public static final UserActivity AddBeneficiary;

    @NotNull
    public static final Parcelable.Creator<UserActivity> CREATOR;
    public static final UserActivity EmailChange;
    public static final UserActivity PhoneNumberChange;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return UserActivity.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserActivity[i];
        }
    }

    static {
        UserActivity userActivity = new UserActivity("EmailChange", 0);
        EmailChange = userActivity;
        UserActivity userActivity2 = new UserActivity("PhoneNumberChange", 1);
        PhoneNumberChange = userActivity2;
        UserActivity userActivity3 = new UserActivity("AddBeneficiary", 2);
        AddBeneficiary = userActivity3;
        UserActivity[] userActivityArr = {userActivity, userActivity2, userActivity3};
        $VALUES = userActivityArr;
        $ENTRIES = s.n(userActivityArr);
        CREATOR = new a();
    }

    public static UserActivity valueOf(String str) {
        return (UserActivity) Enum.valueOf(UserActivity.class, str);
    }

    public static UserActivity[] values() {
        return (UserActivity[]) $VALUES.clone();
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
