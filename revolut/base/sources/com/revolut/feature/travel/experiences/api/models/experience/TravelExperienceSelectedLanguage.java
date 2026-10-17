package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceSelectedLanguage;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceSelectedLanguage implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceSelectedLanguage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92848c;
    public final v d;

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
            return new TravelExperienceSelectedLanguage(string, string2, arrayList, parcel.readInt() == 0 ? null : v.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceSelectedLanguage[i];
        }
    }

    public TravelExperienceSelectedLanguage(String id10, String label, List availableGuideTypes, v vVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(availableGuideTypes, "availableGuideTypes");
        this.f92846a = id10;
        this.f92847b = label;
        this.f92848c = availableGuideTypes;
        this.d = vVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceSelectedLanguage)) {
            return false;
        }
        TravelExperienceSelectedLanguage travelExperienceSelectedLanguage = (TravelExperienceSelectedLanguage) obj2;
        return Intrinsics.f(this.f92846a, travelExperienceSelectedLanguage.f92846a) && Intrinsics.f(this.f92847b, travelExperienceSelectedLanguage.f92847b) && Intrinsics.f(this.f92848c, travelExperienceSelectedLanguage.f92848c) && this.d == travelExperienceSelectedLanguage.d;
    }

    public final int hashCode() {
        int iD = p.a.d(p.a.c(this.f92846a.hashCode() * 31, 31, this.f92847b), 31, this.f92848c);
        v vVar = this.d;
        return iD + (vVar == null ? 0 : vVar.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92846a);
        dest.writeString(this.f92847b);
        Iterator itV = p.a.v(this.f92848c, dest);
        while (itV.hasNext()) {
            dest.writeString(((v) itV.next()).name());
        }
        v vVar = this.d;
        if (vVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(vVar.name());
        }
    }
}
