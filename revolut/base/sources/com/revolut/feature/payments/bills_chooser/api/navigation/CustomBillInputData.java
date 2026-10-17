package com.revolut.feature.payments.bills_chooser.api.navigation;

import a0.d;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.bills_chooser.api.navigation.LimitedCurrenciesConfig;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xi0.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/payments/bills_chooser/api/navigation/CustomBillInputData;", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_payments_bills_chooser_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomBillInputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<CustomBillInputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f79189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f79190b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f79191c;
    public final b d;
    public final boolean e;
    public final LimitedCurrenciesConfig f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomBillInputData((Clause) parcel.readParcelable(CustomBillInputData.class.getClassLoader()), parcel.readString(), parcel.readLong(), (b) parcel.readSerializable(), parcel.readInt() != 0, (LimitedCurrenciesConfig) parcel.readParcelable(CustomBillInputData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomBillInputData[i];
        }
    }

    public CustomBillInputData(Clause title, String name, long j2, b currency, boolean z, LimitedCurrenciesConfig limitedCurrenciesConfig) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(currency, "currency");
        Intrinsics.checkNotNullParameter(limitedCurrenciesConfig, "limitedCurrenciesConfig");
        this.f79189a = title;
        this.f79190b = name;
        this.f79191c = j2;
        this.d = currency;
        this.e = z;
        this.f = limitedCurrenciesConfig;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomBillInputData)) {
            return false;
        }
        CustomBillInputData customBillInputData = (CustomBillInputData) obj2;
        return Intrinsics.f(this.f79189a, customBillInputData.f79189a) && Intrinsics.f(this.f79190b, customBillInputData.f79190b) && this.f79191c == customBillInputData.f79191c && Intrinsics.f(this.d, customBillInputData.d) && this.e == customBillInputData.e && Intrinsics.f(this.f, customBillInputData.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + j6.a.c(l.j(this.d, d.c(p.a.c(this.f79189a.hashCode() * 31, 31, this.f79190b), 31, this.f79191c), 31), 31, this.e);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f79189a, i);
        dest.writeString(this.f79190b);
        dest.writeLong(this.f79191c);
        dest.writeSerializable(this.d);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ CustomBillInputData(TextLocalisedClause textLocalisedClause, String str, long j2, b bVar, boolean z, LimitedCurrenciesConfig limitedCurrenciesConfig, int i) {
        this(textLocalisedClause, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? 0L : j2, bVar, z, (i & 32) != 0 ? LimitedCurrenciesConfig.DisallowAll.f79193a : limitedCurrenciesConfig);
    }
}
