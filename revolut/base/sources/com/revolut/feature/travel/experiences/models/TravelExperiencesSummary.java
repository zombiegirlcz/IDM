package com.revolut.feature.travel.experiences.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.models.TravelExperienceCancellationPolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/models/TravelExperiencesSummary;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesSummary implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesSummary> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f93201a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f93202b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f93203c;
    public final String d;
    public final TravelExperienceRatings e;
    public final TravelExperiencesPricing f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final TravelExperienceCancellationPolicy.Experience f93204g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesSummary(parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readInt() == 0 ? null : TravelExperienceRatings.CREATOR.createFromParcel(parcel), TravelExperiencesPricing.CREATOR.createFromParcel(parcel), TravelExperienceCancellationPolicy.Experience.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesSummary[i];
        }
    }

    public TravelExperiencesSummary(String id10, String name, List images, String description, TravelExperienceRatings travelExperienceRatings, TravelExperiencesPricing startingPrice, TravelExperienceCancellationPolicy.Experience cancellationPolicy) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(images, "images");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(startingPrice, "startingPrice");
        Intrinsics.checkNotNullParameter(cancellationPolicy, "cancellationPolicy");
        this.f93201a = id10;
        this.f93202b = name;
        this.f93203c = images;
        this.d = description;
        this.e = travelExperienceRatings;
        this.f = startingPrice;
        this.f93204g = cancellationPolicy;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesSummary)) {
            return false;
        }
        TravelExperiencesSummary travelExperiencesSummary = (TravelExperiencesSummary) obj2;
        return Intrinsics.f(this.f93201a, travelExperiencesSummary.f93201a) && Intrinsics.f(this.f93202b, travelExperiencesSummary.f93202b) && Intrinsics.f(this.f93203c, travelExperiencesSummary.f93203c) && Intrinsics.f(this.d, travelExperiencesSummary.d) && Intrinsics.f(this.e, travelExperiencesSummary.e) && Intrinsics.f(this.f, travelExperiencesSummary.f) && Intrinsics.f(this.f93204g, travelExperiencesSummary.f93204g);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.d(p.a.c(this.f93201a.hashCode() * 31, 31, this.f93202b), 31, this.f93203c), 31, this.d);
        TravelExperienceRatings travelExperienceRatings = this.e;
        return this.f93204g.hashCode() + ((this.f.hashCode() + ((iC + (travelExperienceRatings == null ? 0 : travelExperienceRatings.hashCode())) * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f93201a);
        dest.writeString(this.f93202b);
        dest.writeStringList(this.f93203c);
        dest.writeString(this.d);
        TravelExperienceRatings travelExperienceRatings = this.e;
        if (travelExperienceRatings == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            travelExperienceRatings.writeToParcel(dest, i);
        }
        this.f.writeToParcel(dest, i);
        this.f93204g.writeToParcel(dest, i);
    }
}
