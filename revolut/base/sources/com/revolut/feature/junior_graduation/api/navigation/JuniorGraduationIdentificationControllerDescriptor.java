package com.revolut.feature.junior_graduation.api.navigation;

import aii.e;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/junior_graduation/api/navigation/JuniorGraduationIdentificationControllerDescriptor;", "Laii/e;", "Lcom/revolut/feature/junior_graduation/api/navigation/IdentificationFlowPublicContract$OutputData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_junior_graduation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorGraduationIdentificationControllerDescriptor implements e, Parcelable {

    @NotNull
    public static final Parcelable.Creator<JuniorGraduationIdentificationControllerDescriptor> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76921a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f76922b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f76923c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorGraduationIdentificationControllerDescriptor(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorGraduationIdentificationControllerDescriptor[i];
        }
    }

    public JuniorGraduationIdentificationControllerDescriptor(String juniorFirstName, String phoneNumber, boolean z) {
        Intrinsics.checkNotNullParameter(juniorFirstName, "juniorFirstName");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        this.f76921a = juniorFirstName;
        this.f76922b = phoneNumber;
        this.f76923c = z;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getF76923c() {
        return this.f76923c;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getF76921a() {
        return this.f76921a;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getF76922b() {
        return this.f76922b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorGraduationIdentificationControllerDescriptor)) {
            return false;
        }
        JuniorGraduationIdentificationControllerDescriptor juniorGraduationIdentificationControllerDescriptor = (JuniorGraduationIdentificationControllerDescriptor) obj2;
        return Intrinsics.f(this.f76921a, juniorGraduationIdentificationControllerDescriptor.f76921a) && Intrinsics.f(this.f76922b, juniorGraduationIdentificationControllerDescriptor.f76922b) && this.f76923c == juniorGraduationIdentificationControllerDescriptor.f76923c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f76923c) + p.a.c(this.f76921a.hashCode() * 31, 31, this.f76922b);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76921a);
        dest.writeString(this.f76922b);
        dest.writeInt(this.f76923c ? 1 : 0);
    }
}
