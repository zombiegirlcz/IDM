package com.revolut.feature.travel.experiences.api.models.experience;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import myf.d;
import myf.e;
import myf.f;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0007\u0005\u0006\u0007\b\t\n\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\f"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceBookingQuestion;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "myf/e", "myf/f", "myf/d", "Category", "AnswerUnit", "Validation", "Value", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelExperienceBookingQuestion implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<TravelExperienceBookingQuestion> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92789b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f92790c;
    public final List d;
    public final List e;
    public final Validation f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final e f92791g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f92792h;
    public final Category i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final List f92793j;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceBookingQuestion$AnswerUnit;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AnswerUnit implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<AnswerUnit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final d f92794a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AnswerUnit(d.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AnswerUnit[i];
            }
        }

        public AnswerUnit(d id10) {
            Intrinsics.checkNotNullParameter(id10, "id");
            this.f92794a = id10;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof AnswerUnit) && this.f92794a == ((AnswerUnit) obj2).f92794a;
        }

        public final int hashCode() {
            return this.f92794a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92794a.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceBookingQuestion$Category;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Category implements Parcelable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92796b;

        @NotNull
        public static final Parcelable.Creator<Category> CREATOR = new b();

        public static final class b implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Category(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Category[i];
            }
        }

        public Category(String id10, String label) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(label, "label");
            this.f92795a = id10;
            this.f92796b = label;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Category)) {
                return false;
            }
            Category category = (Category) obj2;
            return Intrinsics.f(this.f92795a, category.f92795a) && Intrinsics.f(this.f92796b, category.f92796b);
        }

        public final int hashCode() {
            return this.f92796b.hashCode() + (this.f92795a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92795a);
            dest.writeString(this.f92796b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceBookingQuestion$Validation;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Validation implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Validation> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f92797a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Validation(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Validation[i];
            }
        }

        public Validation(int i) {
            this.f92797a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Validation) && this.f92797a == ((Validation) obj2).f92797a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f92797a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f92797a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/travel/experiences/api/models/experience/TravelExperienceBookingQuestion$Value;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_travel_experiences_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Value implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Value> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92798a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f92799b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f92800c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperiencesBookingPrerequisiteQuestion.CREATOR, parcel, arrayList, iA, 1);
                }
                return new Value(string, string2, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Value[i];
            }
        }

        public Value(String value, String label, List prerequisites) {
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(prerequisites, "prerequisites");
            this.f92798a = value;
            this.f92799b = label;
            this.f92800c = prerequisites;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Value)) {
                return false;
            }
            Value value = (Value) obj2;
            return Intrinsics.f(this.f92798a, value.f92798a) && Intrinsics.f(this.f92799b, value.f92799b) && Intrinsics.f(this.f92800c, value.f92800c);
        }

        public final int hashCode() {
            return this.f92800c.hashCode() + p.a.c(this.f92798a.hashCode() * 31, 31, this.f92799b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f92798a);
            dest.writeString(this.f92799b);
            Iterator itV = p.a.v(this.f92800c, dest);
            while (itV.hasNext()) {
                ((TravelExperiencesBookingPrerequisiteQuestion) itV.next()).writeToParcel(dest, i);
            }
        }
    }

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            int iA;
            ArrayList arrayList3;
            e eVar;
            boolean z;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            f fVarValueOf = f.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA2 = 0;
                while (iA2 != i) {
                    iA2 = org.bouncycastle.jcajce.provider.digest.a.a(AnswerUnit.CREATOR, parcel, arrayList, iA2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                int iA3 = 0;
                while (iA3 != i2) {
                    iA3 = org.bouncycastle.jcajce.provider.digest.a.a(Value.CREATOR, parcel, arrayList2, iA3, 1);
                }
            }
            Validation validationCreateFromParcel = Validation.CREATOR.createFromParcel(parcel);
            e eVarValueOf = e.valueOf(parcel.readString());
            if (parcel.readInt() != 0) {
                iA = 0;
                arrayList3 = arrayList2;
                eVar = eVarValueOf;
                z = true;
            } else {
                iA = 0;
                arrayList3 = arrayList2;
                eVar = eVarValueOf;
                z = false;
            }
            Category categoryCreateFromParcel = parcel.readInt() != 0 ? Category.CREATOR.createFromParcel(parcel) : null;
            int i3 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i3);
            while (iA != i3) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(TravelExperiencesBookingPrerequisiteQuestion.CREATOR, parcel, arrayList4, iA, 1);
            }
            return new TravelExperienceBookingQuestion(string, string2, fVarValueOf, arrayList, arrayList3, validationCreateFromParcel, eVar, z, categoryCreateFromParcel, arrayList4);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TravelExperienceBookingQuestion[i];
        }
    }

    public TravelExperienceBookingQuestion(String id10, String label, f type, ArrayList arrayList, ArrayList arrayList2, Validation validation, e group, boolean z, Category category, List prerequisites) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(validation, "validation");
        Intrinsics.checkNotNullParameter(group, "group");
        Intrinsics.checkNotNullParameter(prerequisites, "prerequisites");
        this.f92788a = id10;
        this.f92789b = label;
        this.f92790c = type;
        this.d = arrayList;
        this.e = arrayList2;
        this.f = validation;
        this.f92791g = group;
        this.f92792h = z;
        this.i = category;
        this.f92793j = prerequisites;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TravelExperienceBookingQuestion)) {
            return false;
        }
        TravelExperienceBookingQuestion travelExperienceBookingQuestion = (TravelExperienceBookingQuestion) obj2;
        return Intrinsics.f(this.f92788a, travelExperienceBookingQuestion.f92788a) && Intrinsics.f(this.f92789b, travelExperienceBookingQuestion.f92789b) && this.f92790c == travelExperienceBookingQuestion.f92790c && Intrinsics.f(this.d, travelExperienceBookingQuestion.d) && Intrinsics.f(this.e, travelExperienceBookingQuestion.e) && Intrinsics.f(this.f, travelExperienceBookingQuestion.f) && this.f92791g == travelExperienceBookingQuestion.f92791g && this.f92792h == travelExperienceBookingQuestion.f92792h && Intrinsics.f(this.i, travelExperienceBookingQuestion.i) && Intrinsics.f(this.f92793j, travelExperienceBookingQuestion.f92793j);
    }

    public final int hashCode() {
        int iHashCode = (this.f92790c.hashCode() + p.a.c(this.f92788a.hashCode() * 31, 31, this.f92789b)) * 31;
        List list = this.d;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.e;
        int iC = j6.a.c((this.f92791g.hashCode() + j6.a.b(this.f.f92797a, (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31)) * 31, 31, this.f92792h);
        Category category = this.i;
        return this.f92793j.hashCode() + ((iC + (category != null ? category.hashCode() : 0)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f92788a);
        dest.writeString(this.f92789b);
        dest.writeString(this.f92790c.name());
        List list = this.d;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((AnswerUnit) itQ.next()).writeToParcel(dest, i);
            }
        }
        List list2 = this.e;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ2 = v0.a.q(dest, 1, list2);
            while (itQ2.hasNext()) {
                ((Value) itQ2.next()).writeToParcel(dest, i);
            }
        }
        this.f.writeToParcel(dest, i);
        dest.writeString(this.f92791g.name());
        dest.writeInt(this.f92792h ? 1 : 0);
        Category category = this.i;
        if (category == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            category.writeToParcel(dest, i);
        }
        Iterator itV = p.a.v(this.f92793j, dest);
        while (itV.hasNext()) {
            ((TravelExperiencesBookingPrerequisiteQuestion) itV.next()).writeToParcel(dest, i);
        }
    }
}
