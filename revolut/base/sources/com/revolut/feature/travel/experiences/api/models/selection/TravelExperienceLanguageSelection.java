package com.revolut.feature.travel.experiences.api.models.selection;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceSelectedLanguage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceLanguageSelection;", "Landroid/os/Parcelable;", "<init>", "()V", "Selected", "NoSelection", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceLanguageSelection$NoSelection;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceLanguageSelection$Selected;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class TravelExperienceLanguageSelection implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceLanguageSelection$NoSelection;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceLanguageSelection;", "<init>", "()V", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class NoSelection extends TravelExperienceLanguageSelection {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final NoSelection f92910a = new NoSelection();

        @NotNull
        public static final Parcelable.Creator<NoSelection> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return NoSelection.f92910a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NoSelection[i];
            }
        }

        private NoSelection() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceLanguageSelection$Selected;", "Lcom/revolut/feature/travel/experiences/api/models/selection/TravelExperienceLanguageSelection;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Selected extends TravelExperienceLanguageSelection {

        @NotNull
        public static final Parcelable.Creator<Selected> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final TravelExperienceSelectedLanguage f92911a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Selected(TravelExperienceSelectedLanguage.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Selected[i];
            }
        }

        public Selected(TravelExperienceSelectedLanguage language) {
            Intrinsics.checkNotNullParameter(language, "language");
            this.f92911a = language;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Selected) && Intrinsics.f(this.f92911a, ((Selected) obj2).f92911a);
        }

        public final int hashCode() {
            return this.f92911a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            this.f92911a.writeToParcel(dest, i);
        }
    }

    private TravelExperienceLanguageSelection() {
    }
}
