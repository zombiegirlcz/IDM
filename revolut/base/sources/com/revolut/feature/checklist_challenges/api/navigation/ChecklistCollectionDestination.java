package com.revolut.feature.checklist_challenges.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/checklist_challenges/api/navigation/ChecklistCollectionDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_checklist_challenges_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChecklistCollectionDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<ChecklistCollectionDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f65808a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnalyticsProduct f65809b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ChecklistCollectionDestination(parcel.readString(), (AnalyticsProduct) parcel.readParcelable(ChecklistCollectionDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ChecklistCollectionDestination[i];
        }
    }

    public ChecklistCollectionDestination(String id10, AnalyticsProduct analyticsProduct) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(analyticsProduct, "analyticsProduct");
        this.f65808a = id10;
        this.f65809b = analyticsProduct;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ChecklistCollectionDestination)) {
            return false;
        }
        ChecklistCollectionDestination checklistCollectionDestination = (ChecklistCollectionDestination) obj2;
        return Intrinsics.f(this.f65808a, checklistCollectionDestination.f65808a) && Intrinsics.f(this.f65809b, checklistCollectionDestination.f65809b);
    }

    public final int hashCode() {
        return this.f65809b.hashCode() + (this.f65808a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f65808a);
        dest.writeParcelable(this.f65809b, i);
    }
}
