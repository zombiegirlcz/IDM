package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/AuthorisationFrequency;", "Landroid/os/Parcelable;", "", "INTRADAY", "DAILY", "WEEKLY", "MONTHLY", "QUARTERLY", "SEMIANNUALLY", "ANNUALLY", "FORTNIGHTLY", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class AuthorisationFrequency implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AuthorisationFrequency[] $VALUES;
    public static final AuthorisationFrequency ANNUALLY;

    @NotNull
    public static final Parcelable.Creator<AuthorisationFrequency> CREATOR;
    public static final AuthorisationFrequency DAILY;
    public static final AuthorisationFrequency FORTNIGHTLY;
    public static final AuthorisationFrequency INTRADAY;
    public static final AuthorisationFrequency MONTHLY;
    public static final AuthorisationFrequency QUARTERLY;
    public static final AuthorisationFrequency SEMIANNUALLY;
    public static final AuthorisationFrequency WEEKLY;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return AuthorisationFrequency.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AuthorisationFrequency[i];
        }
    }

    static {
        AuthorisationFrequency authorisationFrequency = new AuthorisationFrequency("INTRADAY", 0);
        INTRADAY = authorisationFrequency;
        AuthorisationFrequency authorisationFrequency2 = new AuthorisationFrequency("DAILY", 1);
        DAILY = authorisationFrequency2;
        AuthorisationFrequency authorisationFrequency3 = new AuthorisationFrequency("WEEKLY", 2);
        WEEKLY = authorisationFrequency3;
        AuthorisationFrequency authorisationFrequency4 = new AuthorisationFrequency("MONTHLY", 3);
        MONTHLY = authorisationFrequency4;
        AuthorisationFrequency authorisationFrequency5 = new AuthorisationFrequency("QUARTERLY", 4);
        QUARTERLY = authorisationFrequency5;
        AuthorisationFrequency authorisationFrequency6 = new AuthorisationFrequency("SEMIANNUALLY", 5);
        SEMIANNUALLY = authorisationFrequency6;
        AuthorisationFrequency authorisationFrequency7 = new AuthorisationFrequency("ANNUALLY", 6);
        ANNUALLY = authorisationFrequency7;
        AuthorisationFrequency authorisationFrequency8 = new AuthorisationFrequency("FORTNIGHTLY", 7);
        FORTNIGHTLY = authorisationFrequency8;
        AuthorisationFrequency[] authorisationFrequencyArr = {authorisationFrequency, authorisationFrequency2, authorisationFrequency3, authorisationFrequency4, authorisationFrequency5, authorisationFrequency6, authorisationFrequency7, authorisationFrequency8};
        $VALUES = authorisationFrequencyArr;
        $ENTRIES = s.n(authorisationFrequencyArr);
        CREATOR = new a();
    }

    public static AuthorisationFrequency valueOf(String str) {
        return (AuthorisationFrequency) Enum.valueOf(AuthorisationFrequency.class, str);
    }

    public static AuthorisationFrequency[] values() {
        return (AuthorisationFrequency[]) $VALUES.clone();
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
