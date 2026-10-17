package com.revolut.feature.be_driven_design.models.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/be_driven_design/models/domain/FincrimeHomeScreenDescriptionAction;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_selfserve_entity_config_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FincrimeHomeScreenDescriptionAction implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<FincrimeHomeScreenDescriptionAction> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final FincrimeHomeScreenAction f64151b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new FincrimeHomeScreenDescriptionAction(parcel.readString(), (FincrimeHomeScreenAction) parcel.readParcelable(FincrimeHomeScreenDescriptionAction.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new FincrimeHomeScreenDescriptionAction[i];
        }
    }

    public FincrimeHomeScreenDescriptionAction(String title, FincrimeHomeScreenAction fincrimeHomeScreenAction) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.f64150a = title;
        this.f64151b = fincrimeHomeScreenAction;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof FincrimeHomeScreenDescriptionAction)) {
            return false;
        }
        FincrimeHomeScreenDescriptionAction fincrimeHomeScreenDescriptionAction = (FincrimeHomeScreenDescriptionAction) obj2;
        return Intrinsics.f(this.f64150a, fincrimeHomeScreenDescriptionAction.f64150a) && Intrinsics.f(this.f64151b, fincrimeHomeScreenDescriptionAction.f64151b);
    }

    public final int hashCode() {
        int iHashCode = this.f64150a.hashCode() * 31;
        FincrimeHomeScreenAction fincrimeHomeScreenAction = this.f64151b;
        return iHashCode + (fincrimeHomeScreenAction == null ? 0 : fincrimeHomeScreenAction.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f64150a);
        dest.writeParcelable(this.f64151b, i);
    }
}
