package yo7;

import com.revolut.feature.insurance_car.impl.data.model.AdditionalDriver;
import com.revolut.feature.insurance_car.impl.data.model.Answer;
import com.revolut.feature.insurance_car.impl.data.model.Occupation;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements jki.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final v f315608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f315609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f315610c;
    public final LocalDate d;
    public final AdditionalDriver.Relationship e;
    public final Answer.LicenceType f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Answer.LicenceDuration f315611g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Answer.ClaimsState f315612h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Answer.PenaltyPoints f315613j;
    public final Boolean k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Boolean f315614l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Answer.EmploymentStatus f315615m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Occupation f315616n;

    public h(v mode, String firstName, String lastName, LocalDate localDate, AdditionalDriver.Relationship relationship, Answer.LicenceType licenceType, Answer.LicenceDuration licenceDuration, Answer.ClaimsState claimsState, List claimsDetails, Answer.PenaltyPoints penaltyPoints, Boolean bool, Boolean bool2, Answer.EmploymentStatus employmentStatus, Occupation occupation) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(claimsDetails, "claimsDetails");
        this.f315608a = mode;
        this.f315609b = firstName;
        this.f315610c = lastName;
        this.d = localDate;
        this.e = relationship;
        this.f = licenceType;
        this.f315611g = licenceDuration;
        this.f315612h = claimsState;
        this.i = claimsDetails;
        this.f315613j = penaltyPoints;
        this.k = bool;
        this.f315614l = bool2;
        this.f315615m = employmentStatus;
        this.f315616n = occupation;
    }

    public static h a(h hVar, String str, String str2, LocalDate localDate, AdditionalDriver.Relationship relationship, Answer.LicenceType licenceType, Answer.LicenceDuration licenceDuration, Answer.ClaimsState claimsState, ArrayList arrayList, Answer.PenaltyPoints penaltyPoints, Boolean bool, Boolean bool2, Answer.EmploymentStatus employmentStatus, Occupation occupation, int i) {
        v mode = hVar.f315608a;
        String firstName = (i & 2) != 0 ? hVar.f315609b : str;
        String lastName = (i & 4) != 0 ? hVar.f315610c : str2;
        LocalDate localDate2 = (i & 8) != 0 ? hVar.d : localDate;
        AdditionalDriver.Relationship relationship2 = (i & 16) != 0 ? hVar.e : relationship;
        Answer.LicenceType licenceType2 = (i & 32) != 0 ? hVar.f : licenceType;
        Answer.LicenceDuration licenceDuration2 = (i & 64) != 0 ? hVar.f315611g : licenceDuration;
        Answer.ClaimsState claimsState2 = (i & 128) != 0 ? hVar.f315612h : claimsState;
        List claimsDetails = (i & 256) != 0 ? hVar.i : arrayList;
        Answer.PenaltyPoints penaltyPoints2 = (i & 512) != 0 ? hVar.f315613j : penaltyPoints;
        Boolean bool3 = (i & 1024) != 0 ? hVar.k : bool;
        Boolean bool4 = (i & 2048) != 0 ? hVar.f315614l : bool2;
        Answer.EmploymentStatus employmentStatus2 = (i & 4096) != 0 ? hVar.f315615m : employmentStatus;
        Occupation occupation2 = (i & 8192) != 0 ? hVar.f315616n : occupation;
        hVar.getClass();
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(claimsDetails, "claimsDetails");
        return new h(mode, firstName, lastName, localDate2, relationship2, licenceType2, licenceDuration2, claimsState2, claimsDetails, penaltyPoints2, bool3, bool4, employmentStatus2, occupation2);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return this.f315608a == hVar.f315608a && Intrinsics.f(this.f315609b, hVar.f315609b) && Intrinsics.f(this.f315610c, hVar.f315610c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f && this.f315611g == hVar.f315611g && this.f315612h == hVar.f315612h && Intrinsics.f(this.i, hVar.i) && this.f315613j == hVar.f315613j && Intrinsics.f(this.k, hVar.k) && Intrinsics.f(this.f315614l, hVar.f315614l) && this.f315615m == hVar.f315615m && Intrinsics.f(this.f315616n, hVar.f315616n);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f315608a.hashCode() * 31, 31, this.f315609b), 31, this.f315610c);
        LocalDate localDate = this.d;
        int iHashCode = (iC + (localDate == null ? 0 : localDate.hashCode())) * 31;
        AdditionalDriver.Relationship relationship = this.e;
        int iHashCode2 = (iHashCode + (relationship == null ? 0 : relationship.hashCode())) * 31;
        Answer.LicenceType licenceType = this.f;
        int iHashCode3 = (iHashCode2 + (licenceType == null ? 0 : licenceType.hashCode())) * 31;
        Answer.LicenceDuration licenceDuration = this.f315611g;
        int iHashCode4 = (iHashCode3 + (licenceDuration == null ? 0 : licenceDuration.hashCode())) * 31;
        Answer.ClaimsState claimsState = this.f315612h;
        int iD = p.a.d((iHashCode4 + (claimsState == null ? 0 : claimsState.hashCode())) * 31, 31, this.i);
        Answer.PenaltyPoints penaltyPoints = this.f315613j;
        int iHashCode5 = (iD + (penaltyPoints == null ? 0 : penaltyPoints.hashCode())) * 31;
        Boolean bool = this.k;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.f315614l;
        int iHashCode7 = (iHashCode6 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Answer.EmploymentStatus employmentStatus = this.f315615m;
        int iHashCode8 = (iHashCode7 + (employmentStatus == null ? 0 : employmentStatus.hashCode())) * 31;
        Occupation occupation = this.f315616n;
        return iHashCode8 + (occupation != null ? occupation.hashCode() : 0);
    }
}
