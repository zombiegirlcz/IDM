package com.revolut.retail.feature.marketnews.impl.flows.wealthnews.destination;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$EmptyInput;
import com.revolut.kompot.common.InternalDestination;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/retail/feature/marketnews/impl/flows/wealthnews/destination/WealthDailyNewsDestination;", "Lcom/revolut/kompot/common/InternalDestination;", "Lcom/revolut/kompot/common/IOData$EmptyInput;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthDailyNewsDestination extends InternalDestination<IOData$EmptyInput> {

    @NotNull
    public static final Parcelable.Creator<WealthDailyNewsDestination> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final DateTime f101845b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final WealthNewsCategory f101846c;
    public final boolean d;

    /* JADX INFO: loaded from: classes11.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthDailyNewsDestination((DateTime) parcel.readSerializable(), (WealthNewsCategory) parcel.readParcelable(WealthDailyNewsDestination.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthDailyNewsDestination[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WealthDailyNewsDestination(DateTime date, WealthNewsCategory category, boolean z) {
        super(IOData$EmptyInput.f98299a);
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f101845b = date;
        this.f101846c = category;
        this.d = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthDailyNewsDestination)) {
            return false;
        }
        WealthDailyNewsDestination wealthDailyNewsDestination = (WealthDailyNewsDestination) obj2;
        return Intrinsics.f(this.f101845b, wealthDailyNewsDestination.f101845b) && Intrinsics.f(this.f101846c, wealthDailyNewsDestination.f101846c) && this.d == wealthDailyNewsDestination.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.f101846c.hashCode() + (this.f101845b.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101845b);
        dest.writeParcelable(this.f101846c, i);
        dest.writeInt(this.d ? 1 : 0);
    }
}
