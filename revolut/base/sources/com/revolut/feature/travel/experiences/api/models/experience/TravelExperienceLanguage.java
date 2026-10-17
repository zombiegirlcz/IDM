package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceLanguage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "myf/v", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceLanguage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceLanguage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92824b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f92825c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(v.valueOf(parcel.readString()));
            }
            return new TravelExperienceLanguage(string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceLanguage[i];
        }
    }

    public TravelExperienceLanguage(String id10, String label, ArrayList guideTypes) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(guideTypes, "guideTypes");
        this.f92823a = id10;
        this.f92824b = label;
        this.f92825c = guideTypes;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceLanguage)) {
            return false;
        }
        TravelExperienceLanguage travelExperienceLanguage = (TravelExperienceLanguage) obj2;
        return Intrinsics.f(this.f92823a, travelExperienceLanguage.f92823a) && Intrinsics.f(this.f92824b, travelExperienceLanguage.f92824b) && this.f92825c.equals(travelExperienceLanguage.f92825c);
    }

    public final int hashCode() {
        return this.f92825c.hashCode() + p.a.c(this.f92823a.hashCode() * 31, 31, this.f92824b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92823a);
        dest.writeString(this.f92824b);
        Iterator itY = j6.a.y(this.f92825c, dest);
        while (itY.hasNext()) {
            dest.writeString(((v) itY.next()).name());
        }
    }
}
