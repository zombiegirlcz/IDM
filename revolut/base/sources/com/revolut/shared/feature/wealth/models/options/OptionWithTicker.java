package com.revolut.shared.feature.wealth.models.options;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.shared.feature.wealth.models.instrument.InstrumentTicker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/wealth/models/options/OptionWithTicker;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_wealth_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class OptionWithTicker implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<OptionWithTicker> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Option f105142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InstrumentTicker f105143b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new OptionWithTicker(Option.CREATOR.createFromParcel(parcel), InstrumentTicker.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new OptionWithTicker[i];
        }
    }

    public OptionWithTicker(Option option, InstrumentTicker ticker) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(ticker, "ticker");
        this.f105142a = option;
        this.f105143b = ticker;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof OptionWithTicker)) {
            return false;
        }
        OptionWithTicker optionWithTicker = (OptionWithTicker) obj2;
        return Intrinsics.f(this.f105142a, optionWithTicker.f105142a) && Intrinsics.f(this.f105143b, optionWithTicker.f105143b);
    }

    public final int hashCode() {
        return this.f105143b.hashCode() + (this.f105142a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f105142a.writeToParcel(dest, i);
        this.f105143b.writeToParcel(dest, i);
    }
}
