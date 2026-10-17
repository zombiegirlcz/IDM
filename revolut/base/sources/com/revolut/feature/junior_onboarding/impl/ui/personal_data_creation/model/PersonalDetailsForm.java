package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.model;

import android.os.Parcel;
import android.os.Parcelable;
import bj0.b;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/model/PersonalDetailsForm;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDetailsForm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PersonalDetailsForm> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77040a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77041b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77042c;
    public final LocalDate d;
    public final b e;
    public final ArrayList f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            b bVarValueOf = b.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(PersonalDetailsForm.class, parcel, arrayList, iE, 1);
            }
            return new PersonalDetailsForm(string, string2, string3, localDate, bVarValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PersonalDetailsForm[i];
        }
    }

    public PersonalDetailsForm(String firstName, String firstLastName, String secondLastName, LocalDate birthday, b gender, ArrayList consents) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstLastName, "firstLastName");
        Intrinsics.checkNotNullParameter(secondLastName, "secondLastName");
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(consents, "consents");
        this.f77040a = firstName;
        this.f77041b = firstLastName;
        this.f77042c = secondLastName;
        this.d = birthday;
        this.e = gender;
        this.f = consents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PersonalDetailsForm)) {
            return false;
        }
        PersonalDetailsForm personalDetailsForm = (PersonalDetailsForm) obj2;
        return Intrinsics.f(this.f77040a, personalDetailsForm.f77040a) && Intrinsics.f(this.f77041b, personalDetailsForm.f77041b) && Intrinsics.f(this.f77042c, personalDetailsForm.f77042c) && Intrinsics.f(this.d, personalDetailsForm.d) && this.e == personalDetailsForm.e && this.f.equals(personalDetailsForm.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + y.a(p.a.c(p.a.c(this.f77040a.hashCode() * 31, 31, this.f77041b), 31, this.f77042c), 31, this.d)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77040a);
        dest.writeString(this.f77041b);
        dest.writeString(this.f77042c);
        dest.writeSerializable(this.d);
        dest.writeString(this.e.name());
        Iterator itY = j6.a.y(this.f, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
