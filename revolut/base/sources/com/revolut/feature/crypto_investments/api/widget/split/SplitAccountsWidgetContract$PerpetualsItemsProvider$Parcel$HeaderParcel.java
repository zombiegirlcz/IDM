package com.revolut.feature.crypto_investments.api.widget.split;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ut5.f;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"com/revolut/feature/crypto_investments/api/widget/split/SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel", "", "", "toString", "()Ljava/lang/String;", "ut5/f", "feature_crypto_investments_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f71417a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel(f.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel[i];
        }
    }

    public SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel(f action) {
        Intrinsics.checkNotNullParameter(action, "action");
        this.f71417a = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel) && this.f71417a == ((SplitAccountsWidgetContract$PerpetualsItemsProvider$Parcel$HeaderParcel) obj2).f71417a;
    }

    public final int hashCode() {
        return this.f71417a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f71417a.name());
    }
}
