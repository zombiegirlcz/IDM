package com.revolut.feature.invest.smart_notifications.impl.ui.screen.feed;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/invest/smart_notifications/impl/ui/screen/feed/SmartFeedScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_invest_smart_notifications_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SmartFeedScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<SmartFeedScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f76439a;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            for (int i2 = 0; i2 != i; i2++) {
                linkedHashSet.add(tdh.a.valueOf(parcel.readString()));
            }
            return new SmartFeedScreenContract$InputData(linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SmartFeedScreenContract$InputData[i];
        }
    }

    public SmartFeedScreenContract$InputData(Set selectedFilters) {
        Intrinsics.checkNotNullParameter(selectedFilters, "selectedFilters");
        this.f76439a = selectedFilters;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SmartFeedScreenContract$InputData) && Intrinsics.f(this.f76439a, ((SmartFeedScreenContract$InputData) obj2).f76439a);
    }

    public final int hashCode() {
        return this.f76439a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        Iterator itV = n.v(this.f76439a, dest);
        while (itV.hasNext()) {
            dest.writeString(((tdh.a) itV.next()).name());
        }
    }
}
