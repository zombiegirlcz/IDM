package com.revolut.feature.insurance_car.impl.data.model;

import android.os.Parcel;
import android.os.Parcelable;
import h30.l;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kl7.n0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_car/impl/data/model/ApplicationForm;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_insurance_car_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ApplicationForm implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ApplicationForm> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f75166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LocalDate f75167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InsurableCar f75168c;
    public final Survey d;
    public final List e;
    public final Map f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f75169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f75170h;
    public final List i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f75171j;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            LocalDate localDate = (LocalDate) parcel.readSerializable();
            LinkedHashMap linkedHashMap = null;
            InsurableCar insurableCarCreateFromParcel = parcel.readInt() == 0 ? null : InsurableCar.CREATOR.createFromParcel(parcel);
            Survey surveyCreateFromParcel = parcel.readInt() == 0 ? null : Survey.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i = parcel.readInt();
                arrayList = new ArrayList(i);
                int iA = 0;
                while (iA != i) {
                    iA = org.bouncycastle.jcajce.provider.digest.a.a(AdditionalDriver.CREATOR, parcel, arrayList, iA, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i2 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap.put(n0.valueOf(parcel.readString()), Boolean.valueOf(parcel.readInt() != 0));
                }
            }
            int i5 = parcel.readInt();
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList(i5);
            int iA2 = 0;
            while (iA2 != i5) {
                iA2 = org.bouncycastle.jcajce.provider.digest.a.a(InsurableCar.CREATOR, parcel, arrayList3, iA2, 1);
            }
            int i6 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i6);
            int iA3 = 0;
            while (iA3 != i6) {
                iA3 = org.bouncycastle.jcajce.provider.digest.a.a(InsurableCar.CREATOR, parcel, arrayList4, iA3, 1);
            }
            int i21 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i21);
            int iA4 = 0;
            while (iA4 != i21) {
                iA4 = org.bouncycastle.jcajce.provider.digest.a.a(InsurableCar.CREATOR, parcel, arrayList5, iA4, 1);
            }
            return new ApplicationForm(string, localDate, insurableCarCreateFromParcel, surveyCreateFromParcel, arrayList2, linkedHashMap, arrayList3, arrayList4, arrayList5, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ApplicationForm[i];
        }
    }

    public ApplicationForm(String id10, LocalDate localDate, InsurableCar insurableCar, Survey survey, List list, Map map, List replaceVehicles, List substituteVehicles, List additionalVehicles, boolean z) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(replaceVehicles, "replaceVehicles");
        Intrinsics.checkNotNullParameter(substituteVehicles, "substituteVehicles");
        Intrinsics.checkNotNullParameter(additionalVehicles, "additionalVehicles");
        this.f75166a = id10;
        this.f75167b = localDate;
        this.f75168c = insurableCar;
        this.d = survey;
        this.e = list;
        this.f = map;
        this.f75169g = replaceVehicles;
        this.f75170h = substituteVehicles;
        this.i = additionalVehicles;
        this.f75171j = z;
    }

    public static ApplicationForm a(ApplicationForm applicationForm, LocalDate localDate, InsurableCar insurableCar, Survey survey, List list, Map map, int i) {
        String id10 = applicationForm.f75166a;
        if ((i & 2) != 0) {
            localDate = applicationForm.f75167b;
        }
        LocalDate localDate2 = localDate;
        if ((i & 4) != 0) {
            insurableCar = applicationForm.f75168c;
        }
        InsurableCar insurableCar2 = insurableCar;
        if ((i & 8) != 0) {
            survey = applicationForm.d;
        }
        Survey survey2 = survey;
        if ((i & 16) != 0) {
            list = applicationForm.e;
        }
        List list2 = list;
        Map map2 = (i & 32) != 0 ? applicationForm.f : map;
        List replaceVehicles = applicationForm.f75169g;
        List substituteVehicles = applicationForm.f75170h;
        List additionalVehicles = applicationForm.i;
        boolean z = applicationForm.f75171j;
        applicationForm.getClass();
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(replaceVehicles, "replaceVehicles");
        Intrinsics.checkNotNullParameter(substituteVehicles, "substituteVehicles");
        Intrinsics.checkNotNullParameter(additionalVehicles, "additionalVehicles");
        return new ApplicationForm(id10, localDate2, insurableCar2, survey2, list2, map2, replaceVehicles, substituteVehicles, additionalVehicles, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ApplicationForm)) {
            return false;
        }
        ApplicationForm applicationForm = (ApplicationForm) obj2;
        return Intrinsics.f(this.f75166a, applicationForm.f75166a) && Intrinsics.f(this.f75167b, applicationForm.f75167b) && Intrinsics.f(this.f75168c, applicationForm.f75168c) && Intrinsics.f(this.d, applicationForm.d) && Intrinsics.f(this.e, applicationForm.e) && Intrinsics.f(this.f, applicationForm.f) && Intrinsics.f(this.f75169g, applicationForm.f75169g) && Intrinsics.f(this.f75170h, applicationForm.f75170h) && Intrinsics.f(this.i, applicationForm.i) && this.f75171j == applicationForm.f75171j;
    }

    public final int hashCode() {
        int iHashCode = this.f75166a.hashCode() * 31;
        LocalDate localDate = this.f75167b;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        InsurableCar insurableCar = this.f75168c;
        int iHashCode3 = (iHashCode2 + (insurableCar == null ? 0 : insurableCar.hashCode())) * 31;
        Survey survey = this.d;
        int iHashCode4 = (iHashCode3 + (survey == null ? 0 : survey.hashCode())) * 31;
        List list = this.e;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map map = this.f;
        return Boolean.hashCode(this.f75171j) + p.a.d(p.a.d(p.a.d((iHashCode5 + (map != null ? map.hashCode() : 0)) * 31, 31, this.f75169g), 31, this.f75170h), 31, this.i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f75166a);
        dest.writeSerializable(this.f75167b);
        InsurableCar insurableCar = this.f75168c;
        if (insurableCar == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            insurableCar.writeToParcel(dest, i);
        }
        Survey survey = this.d;
        if (survey == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            survey.writeToParcel(dest, i);
        }
        List list = this.e;
        if (list == null) {
            dest.writeInt(0);
        } else {
            Iterator itQ = v0.a.q(dest, 1, list);
            while (itQ.hasNext()) {
                ((AdditionalDriver) itQ.next()).writeToParcel(dest, i);
            }
        }
        Map map = this.f;
        if (map == null) {
            dest.writeInt(0);
        } else {
            Iterator itV = l.v(dest, 1, map);
            while (itV.hasNext()) {
                Map.Entry entry = (Map.Entry) itV.next();
                dest.writeString(((n0) entry.getKey()).name());
                dest.writeInt(((Boolean) entry.getValue()).booleanValue() ? 1 : 0);
            }
        }
        Iterator itV2 = p.a.v(this.f75169g, dest);
        while (itV2.hasNext()) {
            ((InsurableCar) itV2.next()).writeToParcel(dest, i);
        }
        Iterator itV3 = p.a.v(this.f75170h, dest);
        while (itV3.hasNext()) {
            ((InsurableCar) itV3.next()).writeToParcel(dest, i);
        }
        Iterator itV4 = p.a.v(this.i, dest);
        while (itV4.hasNext()) {
            ((InsurableCar) itV4.next()).writeToParcel(dest, i);
        }
        dest.writeInt(this.f75171j ? 1 : 0);
    }
}
