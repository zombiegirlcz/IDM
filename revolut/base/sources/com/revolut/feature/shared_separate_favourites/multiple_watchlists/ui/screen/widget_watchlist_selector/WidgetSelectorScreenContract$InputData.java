package com.revolut.feature.shared_separate_favourites.multiple_watchlists.ui.screen.widget_watchlist_selector;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.data.database.models.openbanking.d;
import com.revolut.kompot.common.IOData$Input;
import ehe.n;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/shared_separate_favourites/multiple_watchlists/ui/screen/widget_watchlist_selector/WidgetSelectorScreenContract$InputData", "Lcom/revolut/kompot/common/IOData$Input;", "", "toString", "()Ljava/lang/String;", "feature_shared_separate_favourites_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WidgetSelectorScreenContract$InputData implements IOData$Input {

    @NotNull
    public static final Parcelable.Creator<WidgetSelectorScreenContract$InputData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Set f86938b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            int i = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(i);
            int iE = 0;
            while (iE != i) {
                iE = d.e(WidgetSelectorScreenContract$InputData.class, parcel, linkedHashSet, iE, 1);
            }
            return new WidgetSelectorScreenContract$InputData(string, linkedHashSet);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WidgetSelectorScreenContract$InputData[i];
        }
    }

    public WidgetSelectorScreenContract$InputData(String str, Set assetTypeKeys) {
        Intrinsics.checkNotNullParameter(assetTypeKeys, "assetTypeKeys");
        this.f86937a = str;
        this.f86938b = assetTypeKeys;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WidgetSelectorScreenContract$InputData)) {
            return false;
        }
        WidgetSelectorScreenContract$InputData widgetSelectorScreenContract$InputData = (WidgetSelectorScreenContract$InputData) obj2;
        return Intrinsics.f(this.f86937a, widgetSelectorScreenContract$InputData.f86937a) && Intrinsics.f(this.f86938b, widgetSelectorScreenContract$InputData.f86938b);
    }

    public final int hashCode() {
        String str = this.f86937a;
        return this.f86938b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86937a);
        Iterator itV = n.v(this.f86938b, dest);
        while (itV.hasNext()) {
            dest.writeParcelable((Parcelable) itV.next(), i);
        }
    }
}
