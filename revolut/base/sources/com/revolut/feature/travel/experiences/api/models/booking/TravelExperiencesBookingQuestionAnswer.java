package com.revolut.feature.travel.experiences.api.models.booking;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.travel.experiences.api.models.experience.TravelExperienceBookingQuestion;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.t0;
import myf.b;
import myf.d;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/booking/TravelExperiencesBookingQuestionAnswer;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperiencesBookingQuestionAnswer implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperiencesBookingQuestionAnswer> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TravelExperienceBookingQuestion f92761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f92763c;
    public final Integer d;
    public final b e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TravelExperiencesBookingQuestionAnswer(TravelExperienceBookingQuestion.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : d.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? b.valueOf(parcel.readString()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperiencesBookingQuestionAnswer[i];
        }
    }

    public TravelExperiencesBookingQuestionAnswer(TravelExperienceBookingQuestion question, String rawValue, d dVar, Integer num, b bVar) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        this.f92761a = question;
        this.f92762b = rawValue;
        this.f92763c = dVar;
        this.d = num;
        this.e = bVar;
    }

    public static TravelExperiencesBookingQuestionAnswer a(TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer, String rawValue, d dVar, int i) {
        TravelExperienceBookingQuestion question = travelExperiencesBookingQuestionAnswer.f92761a;
        if ((i & 4) != 0) {
            dVar = travelExperiencesBookingQuestionAnswer.f92763c;
        }
        Integer num = travelExperiencesBookingQuestionAnswer.d;
        b bVar = travelExperiencesBookingQuestionAnswer.e;
        travelExperiencesBookingQuestionAnswer.getClass();
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        return new TravelExperiencesBookingQuestionAnswer(question, rawValue, dVar, num, bVar);
    }

    public final String b() {
        String str = this.f92761a.f92788a;
        Object obj2 = this.d;
        if (obj2 == null) {
            m70.a.c(t0.f186434a);
            obj2 = "";
        }
        return str + obj2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperiencesBookingQuestionAnswer)) {
            return false;
        }
        TravelExperiencesBookingQuestionAnswer travelExperiencesBookingQuestionAnswer = (TravelExperiencesBookingQuestionAnswer) obj2;
        return Intrinsics.f(this.f92761a, travelExperiencesBookingQuestionAnswer.f92761a) && Intrinsics.f(this.f92762b, travelExperiencesBookingQuestionAnswer.f92762b) && this.f92763c == travelExperiencesBookingQuestionAnswer.f92763c && Intrinsics.f(this.d, travelExperiencesBookingQuestionAnswer.d) && this.e == travelExperiencesBookingQuestionAnswer.e;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f92761a.hashCode() * 31, 31, this.f92762b);
        d dVar = this.f92763c;
        int iHashCode = (iC + (dVar == null ? 0 : dVar.hashCode())) * 31;
        Integer num = this.d;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        b bVar = this.e;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        this.f92761a.writeToParcel(dest, i);
        dest.writeString(this.f92762b);
        d dVar = this.f92763c;
        if (dVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(dVar.name());
        }
        Integer num = this.d;
        if (num == null) {
            dest.writeInt(0);
        } else {
            p.a.B(dest, 1, num);
        }
        b bVar = this.e;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
    }
}
