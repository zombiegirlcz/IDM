package com.revolut.feature.junior_onboarding.impl.ui.personal_data_creation.details_confirmation;

import android.os.Parcel;
import android.os.Parcelable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import wp5.y;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/revolut/feature/junior_onboarding/impl/ui/personal_data_creation/details_confirmation/JuniorDetailsConfirmationScreenContract$PersonalDetails", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorDetailsConfirmationScreenContract$PersonalDetails implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<JuniorDetailsConfirmationScreenContract$PersonalDetails> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f77023a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f77024b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f77025c;
    public final LocalDate d;
    public final ArrayList e;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iE = 0;
            while (iE != i) {
                iE = j6.a.e(JuniorDetailsConfirmationScreenContract$PersonalDetails.class, parcel, arrayList, iE, 1);
            }
            return new JuniorDetailsConfirmationScreenContract$PersonalDetails(string, string2, string3, localDate, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorDetailsConfirmationScreenContract$PersonalDetails[i];
        }
    }

    public JuniorDetailsConfirmationScreenContract$PersonalDetails(String firstName, String firstLastName, String secondLastName, LocalDate birthday, ArrayList consents) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(firstLastName, "firstLastName");
        Intrinsics.checkNotNullParameter(secondLastName, "secondLastName");
        Intrinsics.checkNotNullParameter(birthday, "birthday");
        Intrinsics.checkNotNullParameter(consents, "consents");
        this.f77023a = firstName;
        this.f77024b = firstLastName;
        this.f77025c = secondLastName;
        this.d = birthday;
        this.e = consents;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorDetailsConfirmationScreenContract$PersonalDetails)) {
            return false;
        }
        JuniorDetailsConfirmationScreenContract$PersonalDetails juniorDetailsConfirmationScreenContract$PersonalDetails = (JuniorDetailsConfirmationScreenContract$PersonalDetails) obj2;
        return Intrinsics.f(this.f77023a, juniorDetailsConfirmationScreenContract$PersonalDetails.f77023a) && Intrinsics.f(this.f77024b, juniorDetailsConfirmationScreenContract$PersonalDetails.f77024b) && Intrinsics.f(this.f77025c, juniorDetailsConfirmationScreenContract$PersonalDetails.f77025c) && Intrinsics.f(this.d, juniorDetailsConfirmationScreenContract$PersonalDetails.d) && this.e.equals(juniorDetailsConfirmationScreenContract$PersonalDetails.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + y.a(p.a.c(p.a.c(this.f77023a.hashCode() * 31, 31, this.f77024b), 31, this.f77025c), 31, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f77023a);
        dest.writeString(this.f77024b);
        dest.writeString(this.f77025c);
        dest.writeSerializable(this.d);
        Iterator itY = j6.a.y(this.e, dest);
        while (itY.hasNext()) {
            dest.writeParcelable((Parcelable) itY.next(), i);
        }
    }
}
