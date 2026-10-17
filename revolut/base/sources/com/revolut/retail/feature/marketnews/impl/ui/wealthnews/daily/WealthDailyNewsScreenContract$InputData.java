package com.revolut.retail.feature.marketnews.impl.ui.wealthnews.daily;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import com.revolut.retail.feature.marketnews.api.domain.model.WealthNewsCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/retail/feature/marketnews/impl/ui/wealthnews/daily/WealthDailyNewsScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_market_news_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthDailyNewsScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WealthDailyNewsScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DateTime f101871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final WealthNewsCategory f101872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f101873c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WealthDailyNewsScreenContract$InputData((DateTime) parcel.readSerializable(), (WealthNewsCategory) parcel.readParcelable(WealthDailyNewsScreenContract$InputData.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthDailyNewsScreenContract$InputData[i];
        }
    }

    public WealthDailyNewsScreenContract$InputData(DateTime date, WealthNewsCategory category, boolean z) {
        Intrinsics.checkNotNullParameter(date, "date");
        Intrinsics.checkNotNullParameter(category, "category");
        this.f101871a = date;
        this.f101872b = category;
        this.f101873c = z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WealthDailyNewsScreenContract$InputData)) {
            return false;
        }
        WealthDailyNewsScreenContract$InputData wealthDailyNewsScreenContract$InputData = (WealthDailyNewsScreenContract$InputData) obj2;
        return Intrinsics.f(this.f101871a, wealthDailyNewsScreenContract$InputData.f101871a) && Intrinsics.f(this.f101872b, wealthDailyNewsScreenContract$InputData.f101872b) && this.f101873c == wealthDailyNewsScreenContract$InputData.f101873c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f101873c) + ((this.f101872b.hashCode() + (this.f101871a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.f101871a);
        dest.writeParcelable(this.f101872b, i);
        dest.writeInt(this.f101873c ? 1 : 0);
    }
}
