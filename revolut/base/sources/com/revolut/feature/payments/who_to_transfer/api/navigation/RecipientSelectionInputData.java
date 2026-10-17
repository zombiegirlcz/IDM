package com.revolut.feature.payments.who_to_transfer.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.feature.payments.who_to_transfer.api.common.RecipientCountryCurrencyConfig;
import com.revolut.feature.payments.who_to_transfer.api.navigation.RecipientSelectionType;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.h0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/who_to_transfer/api/navigation/RecipientSelectionInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_who_to_transfer_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RecipientSelectionInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RecipientSelectionInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f80015a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f80016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f80017c;
    public final Set d;
    public final jq9.a e;
    public final RecipientCountryCurrencyConfig f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RecipientSelectionType f80018g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Set f80019h;

    public static final class a implements Parcelable.Creator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            int i;
            Clause clause = (Clause) j6.a.f(parcel, "parcel", RecipientSelectionInputData.class);
            int iE = 0;
            boolean z = true;
            if (parcel.readInt() != 0) {
                i = 1;
            } else {
                i = 1;
                z = false;
            }
            boolean z3 = parcel.readInt() != 0 ? i : 0;
            int i2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i2);
            int iE2 = 0;
            while (iE2 != i2) {
                iE2 = d.e(RecipientSelectionInputData.class, parcel, linkedHashSet, iE2, i);
            }
            jq9.a aVarValueOf = jq9.a.valueOf(parcel.readString());
            RecipientCountryCurrencyConfig recipientCountryCurrencyConfigCreateFromParcel = parcel.readInt() == 0 ? null : RecipientCountryCurrencyConfig.CREATOR.createFromParcel(parcel);
            RecipientSelectionType recipientSelectionType = (RecipientSelectionType) parcel.readParcelable(RecipientSelectionInputData.class.getClassLoader());
            int i3 = parcel.readInt();
            LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
            while (iE != i3) {
                iE = d.e(RecipientSelectionInputData.class, parcel, linkedHashSet2, iE, i);
            }
            return new RecipientSelectionInputData(clause, z, z3, linkedHashSet, aVarValueOf, recipientCountryCurrencyConfigCreateFromParcel, recipientSelectionType, linkedHashSet2);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RecipientSelectionInputData[i];
        }
    }

    public RecipientSelectionInputData(Clause clause, boolean z, boolean z3, Set availableFilters, jq9.a juniorIncludingMode, RecipientCountryCurrencyConfig recipientCountryCurrencyConfig, RecipientSelectionType type, Set additionalConfig) {
        Intrinsics.checkNotNullParameter(availableFilters, "availableFilters");
        Intrinsics.checkNotNullParameter(juniorIncludingMode, "juniorIncludingMode");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(additionalConfig, "additionalConfig");
        this.f80015a = clause;
        this.f80016b = z;
        this.f80017c = z3;
        this.d = availableFilters;
        this.e = juniorIncludingMode;
        this.f = recipientCountryCurrencyConfig;
        this.f80018g = type;
        this.f80019h = additionalConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RecipientSelectionInputData)) {
            return false;
        }
        RecipientSelectionInputData recipientSelectionInputData = (RecipientSelectionInputData) obj2;
        return Intrinsics.f(this.f80015a, recipientSelectionInputData.f80015a) && this.f80016b == recipientSelectionInputData.f80016b && this.f80017c == recipientSelectionInputData.f80017c && Intrinsics.f(this.d, recipientSelectionInputData.d) && this.e == recipientSelectionInputData.e && Intrinsics.f(this.f, recipientSelectionInputData.f) && Intrinsics.f(this.f80018g, recipientSelectionInputData.f80018g) && Intrinsics.f(this.f80019h, recipientSelectionInputData.f80019h);
    }

    public final int hashCode() {
        Clause clause = this.f80015a;
        int iHashCode = (this.e.hashCode() + p.a.f(j6.a.c(j6.a.c((clause == null ? 0 : clause.hashCode()) * 31, 31, this.f80016b), 31, this.f80017c), 31, this.d)) * 31;
        RecipientCountryCurrencyConfig recipientCountryCurrencyConfig = this.f;
        return this.f80019h.hashCode() + ((this.f80018g.hashCode() + ((iHashCode + (recipientCountryCurrencyConfig != null ? recipientCountryCurrencyConfig.hashCode() : 0)) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f80015a, i);
        dest.writeInt(this.f80016b ? 1 : 0);
        dest.writeInt(this.f80017c ? 1 : 0);
        Iterator itV = n.v(this.d, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
        dest.writeString(this.e.name());
        RecipientCountryCurrencyConfig recipientCountryCurrencyConfig = this.f;
        if (recipientCountryCurrencyConfig == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            recipientCountryCurrencyConfig.writeToParcel(dest, i);
        }
        dest.writeParcelable(this.f80018g, i);
        Iterator itV2 = n.v(this.f80019h, dest);
        while (itV2.hasNext()) {
            dest.writeParcelable((Parcelable) itV2.next(), i);
        }
    }

    public RecipientSelectionInputData(TextLocalisedClause textLocalisedClause, boolean z, boolean z3, Set set, jq9.a aVar, RecipientCountryCurrencyConfig recipientCountryCurrencyConfig, RecipientSelectionType recipientSelectionType, Set set2, int i) {
        this((i & 1) != 0 ? null : textLocalisedClause, z, z3, set, (i & 16) != 0 ? jq9.a.NONE : aVar, (i & 32) != 0 ? null : recipientCountryCurrencyConfig, (i & 64) != 0 ? RecipientSelectionType.Default.f80020a : recipientSelectionType, (i & 128) != 0 ? h0.f322473a : set2);
    }
}
