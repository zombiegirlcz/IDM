package com.revolut.feature.card_management.impl.ui.kompot.settings;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.model.account.AccountId;
import com.revolut.kompot.common.IOData$Input;
import h30.l;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/card_management/impl/ui/kompot/settings/RevolutCardSettingsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_card_management_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevolutCardSettingsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<RevolutCardSettingsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64900a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AccountId f64901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wy2.a f64902c;
    public final wy2.b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevolutCardSettingsScreenContract$InputData(parcel.readString(), (AccountId) parcel.readParcelable(RevolutCardSettingsScreenContract$InputData.class.getClassLoader()), wy2.a.valueOf(parcel.readString()), wy2.b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevolutCardSettingsScreenContract$InputData[i];
        }
    }

    public RevolutCardSettingsScreenContract$InputData(String cardId, AccountId accountId, wy2.a flowName, wy2.b flowType) {
        Intrinsics.checkNotNullParameter(cardId, "cardId");
        Intrinsics.checkNotNullParameter(accountId, "accountId");
        Intrinsics.checkNotNullParameter(flowName, "flowName");
        Intrinsics.checkNotNullParameter(flowType, "flowType");
        this.f64900a = cardId;
        this.f64901b = accountId;
        this.f64902c = flowName;
        this.d = flowType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevolutCardSettingsScreenContract$InputData)) {
            return false;
        }
        RevolutCardSettingsScreenContract$InputData revolutCardSettingsScreenContract$InputData = (RevolutCardSettingsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f64900a, revolutCardSettingsScreenContract$InputData.f64900a) && Intrinsics.f(this.f64901b, revolutCardSettingsScreenContract$InputData.f64901b) && this.f64902c == revolutCardSettingsScreenContract$InputData.f64902c && this.d == revolutCardSettingsScreenContract$InputData.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f64902c.hashCode() + l.b(this.f64901b, this.f64900a.hashCode() * 31, 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64900a);
        dest.writeParcelable(this.f64901b, i);
        dest.writeString(this.f64902c.name());
        dest.writeString(this.d.name());
    }
}
