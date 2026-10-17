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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/Party;", "Landroid/os/Parcelable;", "", "DEBTOR", "CREDITOR", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class Party implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Party[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<Party> CREATOR;
    public static final Party CREDITOR;
    public static final Party DEBTOR;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return Party.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Party[i];
        }
    }

    static {
        Party party = new Party("DEBTOR", 0);
        DEBTOR = party;
        Party party2 = new Party("CREDITOR", 1);
        CREDITOR = party2;
        Party[] partyArr = {party, party2};
        $VALUES = partyArr;
        $ENTRIES = s.n(partyArr);
        CREATOR = new a();
    }

    public static Party valueOf(String str) {
        return (Party) Enum.valueOf(Party.class, str);
    }

    public static Party[] values() {
        return (Party[]) $VALUES.clone();
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
