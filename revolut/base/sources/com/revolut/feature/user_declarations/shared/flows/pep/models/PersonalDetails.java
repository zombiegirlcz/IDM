package com.revolut.feature.user_declarations.shared.flows.pep.models;

import android.os.Parcel;
import android.os.Parcelable;
import gog.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/user_declarations/shared/flows/pep/models/PersonalDetails;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_user_declarations_shared_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<PersonalDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f94642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f94643b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f94644c;
    public final String d;
    public final String e;
    public final gog.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f94645g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new PersonalDetails(parcel.readString(), parcel.readInt() == 0 ? null : b.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? gog.a.valueOf(parcel.readString()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PersonalDetails[i];
        }
    }

    public PersonalDetails(String id10, b bVar, String firstName, String firstSurname, String str, gog.a aVar, String str2) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstSurname, "firstSurname");
        this.f94642a = id10;
        this.f94643b = bVar;
        this.f94644c = firstName;
        this.d = firstSurname;
        this.e = str;
        this.f = aVar;
        this.f94645g = str2;
    }

    public static PersonalDetails a(PersonalDetails personalDetails, b bVar, String firstName, String firstSurname, String str, gog.a aVar, String str2, int i) {
        b bVar2 = bVar;
        String id10 = personalDetails.f94642a;
        if ((i & 2) != 0) {
            bVar2 = personalDetails.f94643b;
        }
        if ((i & 4) != 0) {
            firstName = personalDetails.f94644c;
        }
        if ((i & 8) != 0) {
            firstSurname = personalDetails.d;
        }
        if ((i & 16) != 0) {
            str = personalDetails.e;
        }
        if ((i & 32) != 0) {
            aVar = personalDetails.f;
        }
        if ((i & 64) != 0) {
            str2 = personalDetails.f94645g;
        }
        String str3 = str2;
        personalDetails.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstSurname, "firstSurname");
        gog.a aVar2 = aVar;
        String str4 = str;
        String str5 = firstSurname;
        return new PersonalDetails(id10, bVar2, firstName, str5, str4, aVar2, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof PersonalDetails)) {
            return false;
        }
        PersonalDetails personalDetails = (PersonalDetails) obj2;
        return Intrinsics.f(this.f94642a, personalDetails.f94642a) && this.f94643b == personalDetails.f94643b && Intrinsics.f(this.f94644c, personalDetails.f94644c) && Intrinsics.f(this.d, personalDetails.d) && Intrinsics.f(this.e, personalDetails.e) && this.f == personalDetails.f && Intrinsics.f(this.f94645g, personalDetails.f94645g);
    }

    public final int hashCode() {
        int iHashCode = this.f94642a.hashCode() * 31;
        b bVar = this.f94643b;
        int iC = p.a.c(p.a.c((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31, 31, this.f94644c), 31, this.d);
        String str = this.e;
        int iHashCode2 = (iC + (str == null ? 0 : str.hashCode())) * 31;
        gog.a aVar = this.f;
        int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        String str2 = this.f94645g;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94642a);
        b bVar = this.f94643b;
        if (bVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(bVar.name());
        }
        dest.writeString(this.f94644c);
        dest.writeString(this.d);
        dest.writeString(this.e);
        gog.a aVar = this.f;
        if (aVar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeString(aVar.name());
        }
        dest.writeString(this.f94645g);
    }
}
