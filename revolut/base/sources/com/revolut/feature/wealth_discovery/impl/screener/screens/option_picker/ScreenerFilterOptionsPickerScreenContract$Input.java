package com.revolut.feature.wealth_discovery.impl.screener.screens.option_picker;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.wealth_discovery.impl.screener.domain.model.ScreenerFilter$Options;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.shared.feature.wealth.models.screener.ScreenerSelectedFilter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/wealth_discovery/impl/screener/screens/option_picker/ScreenerFilterOptionsPickerScreenContract$Input", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_wealth_discovery_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScreenerFilterOptionsPickerScreenContract$Input implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<ScreenerFilterOptionsPickerScreenContract$Input> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ScreenerFilter$Options f96263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ScreenerSelectedFilter.Options f96264b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ScreenerFilterOptionsPickerScreenContract$Input(ScreenerFilter$Options.CREATOR.createFromParcel(parcel), (ScreenerSelectedFilter.Options) parcel.readParcelable(ScreenerFilterOptionsPickerScreenContract$Input.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ScreenerFilterOptionsPickerScreenContract$Input[i];
        }
    }

    public ScreenerFilterOptionsPickerScreenContract$Input(ScreenerFilter$Options filter, ScreenerSelectedFilter.Options options) {
        Intrinsics.checkNotNullParameter(filter, "filter");
        this.f96263a = filter;
        this.f96264b = options;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ScreenerFilterOptionsPickerScreenContract$Input)) {
            return false;
        }
        ScreenerFilterOptionsPickerScreenContract$Input screenerFilterOptionsPickerScreenContract$Input = (ScreenerFilterOptionsPickerScreenContract$Input) obj2;
        return Intrinsics.f(this.f96263a, screenerFilterOptionsPickerScreenContract$Input.f96263a) && Intrinsics.f(this.f96264b, screenerFilterOptionsPickerScreenContract$Input.f96264b);
    }

    public final int hashCode() {
        int iHashCode = this.f96263a.hashCode() * 31;
        ScreenerSelectedFilter.Options options = this.f96264b;
        return iHashCode + (options == null ? 0 : options.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f96263a.writeToParcel(dest, i);
        dest.writeParcelable(this.f96264b, i);
    }
}
