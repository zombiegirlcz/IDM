package com.revolut.feature.invest.smart_notifications.api.domain;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/invest/smart_notifications/api/domain/WealthSmartFeedDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_invest_smart_notifications_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WealthSmartFeedDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<WealthSmartFeedDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f76422a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(tdh.a.valueOf(parcel.readString()));
            }
            return new WealthSmartFeedDestination(linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WealthSmartFeedDestination[i];
        }
    }

    public WealthSmartFeedDestination(Set selectedFilters) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f76422a = selectedFilters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof WealthSmartFeedDestination) && Intrinsics.f(this.f76422a, ((WealthSmartFeedDestination) obj2).f76422a);
    }

    public final int hashCode() {
        return this.f76422a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f76422a, dest);
        while (itV.hasNext()) {
            dest.writeString(((tdh.a) itV.next()).name());
        }
    }
}
