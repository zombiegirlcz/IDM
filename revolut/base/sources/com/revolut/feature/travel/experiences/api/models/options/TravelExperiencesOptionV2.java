package com.revolut.feature.travel.experiences.api.models.options;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.v;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/options/TravelExperiencesOptionV2;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Language", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesOptionV2 implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesOptionV2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperiencesOption f92869a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f92870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Language f92871c;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/options/TravelExperiencesOptionV2$Language;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Language implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Language> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92873b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final v f92874c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Language(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : v.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Language[i];
            }
        }

        public Language(String id10, String label, v vVar) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f92872a = id10;
            this.f92873b = label;
            this.f92874c = vVar;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Language)) {
                return false;
            }
            Language language = (Language) obj2;
            return Intrinsics.f(this.f92872a, language.f92872a) && Intrinsics.f(this.f92873b, language.f92873b) && this.f92874c == language.f92874c;
        }

        public final int hashCode() {
            int iC = p.a.c(this.f92872a.hashCode() * 31, 31, this.f92873b);
            v vVar = this.f92874c;
            return iC + (vVar == null ? 0 : vVar.hashCode());
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92872a);
            dest.writeString(this.f92873b);
            v vVar = this.f92874c;
            if (vVar == null) {
                dest.writeInt(0);
            } else {
                dest.writeInt(1);
                dest.writeString(vVar.name());
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesOptionV2(TravelExperiencesOption.CREATOR.createFromParcel(parcel), (LocalDate) parcel.readSerializable(), parcel.readInt() == 0 ? null : Language.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesOptionV2[i];
        }
    }

    public TravelExperiencesOptionV2(TravelExperiencesOption option, LocalDate date, Language language) {
        Intrinsics.checkNotNullParameter(option, "option");
        Intrinsics.checkNotNullParameter(date, "date");
        this.f92869a = option;
        this.f92870b = date;
        this.f92871c = language;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesOptionV2)) {
            return false;
        }
        TravelExperiencesOptionV2 travelExperiencesOptionV2 = (TravelExperiencesOptionV2) obj2;
        return Intrinsics.f(this.f92869a, travelExperiencesOptionV2.f92869a) && Intrinsics.f(this.f92870b, travelExperiencesOptionV2.f92870b) && Intrinsics.f(this.f92871c, travelExperiencesOptionV2.f92871c);
    }

    public final int hashCode() {
        int iA = y.a(this.f92869a.hashCode() * 31, 31, this.f92870b);
        Language language = this.f92871c;
        return iA + (language == null ? 0 : language.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f92869a.writeToParcel(dest, i);
        dest.writeSerializable(this.f92870b);
        Language language = this.f92871c;
        if (language == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            language.writeToParcel(dest, i);
        }
    }
}
