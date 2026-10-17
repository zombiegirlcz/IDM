package com.revolut.feature.subaccount.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import dj0.d;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pcd.f0;
import pcd.g0;
import pcd.h0;
import pcd.s;
import xi0.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00042\u00020\u0001:\b\u0005\u0006\u0007\b\t\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/Subaccount;", "Landroid/os/Parcelable;", "<init>", "()V", "Companion", "Personal", "Junior", "Teen", "Group", "Pro", "ProTax", "Joint", "a", "Lcom/revolut/feature/subaccount/api/models/Subaccount$Group;", "Lcom/revolut/feature/subaccount/api/models/Subaccount$Joint;", "Lcom/revolut/feature/subaccount/api/models/Subaccount$Junior;", "Lcom/revolut/feature/subaccount/api/models/Subaccount$Personal;", "Lcom/revolut/feature/subaccount/api/models/Subaccount$Pro;", "Lcom/revolut/feature/subaccount/api/models/Subaccount$ProTax;", "Lcom/revolut/feature/subaccount/api/models/Subaccount$Teen;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Subaccount implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/Subaccount$Group;", "Lcom/revolut/feature/subaccount/api/models/Subaccount;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Group extends Subaccount {

        @NotNull
        public static final Parcelable.Creator<Group> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f88953a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Group((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        public Group(s vault) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f88953a = vault;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        public final SubaccountType c() {
            return SubaccountType.Group.f88960a;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final s getF88959a() {
            return this.f88953a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Group) && Intrinsics.f(this.f88953a, ((Group) obj2).f88953a);
        }

        public final int hashCode() {
            return this.f88953a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88953a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/Subaccount$Joint;", "Lcom/revolut/feature/subaccount/api/models/Subaccount;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint extends Subaccount {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f88954a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        public Joint(s vault) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f88954a = vault;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        public final SubaccountType c() {
            return SubaccountType.Joint.f88961a;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final s getF88959a() {
            return this.f88954a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Joint) && Intrinsics.f(this.f88954a, ((Joint) obj2).f88954a);
        }

        public final int hashCode() {
            return this.f88954a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88954a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/Subaccount$Junior;", "Lcom/revolut/feature/subaccount/api/models/Subaccount;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior extends Subaccount {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f88955a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        public Junior(s vault) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f88955a = vault;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        public final SubaccountType c() {
            return SubaccountType.Junior.f88962a;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final s getF88959a() {
            return this.f88955a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Junior) && Intrinsics.f(this.f88955a, ((Junior) obj2).f88955a);
        }

        public final int hashCode() {
            return this.f88955a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88955a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/Subaccount$Personal;", "Lcom/revolut/feature/subaccount/api/models/Subaccount;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Personal extends Subaccount {

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f88956a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Personal((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        public Personal(s vault) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f88956a = vault;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        public final SubaccountType c() {
            return SubaccountType.Personal.f88963a;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final s getF88959a() {
            return this.f88956a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Personal) && Intrinsics.f(this.f88956a, ((Personal) obj2).f88956a);
        }

        public final int hashCode() {
            return this.f88956a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88956a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/Subaccount$Pro;", "Lcom/revolut/feature/subaccount/api/models/Subaccount;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pro extends Subaccount {

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f88957a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pro((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        public Pro(s vault) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f88957a = vault;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        public final SubaccountType c() {
            return SubaccountType.Pro.f88964a;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final s getF88959a() {
            return this.f88957a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pro) && Intrinsics.f(this.f88957a, ((Pro) obj2).f88957a);
        }

        public final int hashCode() {
            return this.f88957a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88957a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/Subaccount$ProTax;", "Lcom/revolut/feature/subaccount/api/models/Subaccount;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProTax extends Subaccount {

        @NotNull
        public static final Parcelable.Creator<ProTax> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f88958a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProTax((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProTax[i];
            }
        }

        public ProTax(s vault) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f88958a = vault;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        public final SubaccountType c() {
            return SubaccountType.ProTax.f88965a;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final s getF88959a() {
            return this.f88958a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProTax) && Intrinsics.f(this.f88958a, ((ProTax) obj2).f88958a);
        }

        public final int hashCode() {
            return this.f88958a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88958a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/Subaccount$Teen;", "Lcom/revolut/feature/subaccount/api/models/Subaccount;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Teen extends Subaccount {

        @NotNull
        public static final Parcelable.Creator<Teen> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f88959a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Teen((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Teen[i];
            }
        }

        public Teen(s vault) {
            Intrinsics.checkNotNullParameter(vault, "vault");
            this.f88959a = vault;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        public final SubaccountType c() {
            return SubaccountType.Teen.f88966a;
        }

        @Override // com.revolut.feature.subaccount.api.models.Subaccount
        /* JADX INFO: renamed from: d, reason: from getter */
        public final s getF88959a() {
            return this.f88959a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Teen) && Intrinsics.f(this.f88959a, ((Teen) obj2).f88959a);
        }

        public final int hashCode() {
            return this.f88959a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f88959a);
        }
    }

    private Subaccount() {
    }

    public final String a() {
        return getF88959a().getCurrency();
    }

    public final boolean b() {
        return getF88959a().f234883c != h0.ACTIVE;
    }

    public abstract SubaccountType c();

    /* JADX INFO: renamed from: d */
    public abstract s getF88959a();

    public final d getBalance() {
        return new d(getF88959a().f234885h.f234861c, getCurrency());
    }

    public final b getCurrency() {
        xi0.a aVar = b.Companion;
        String strA = a();
        aVar.getClass();
        return xi0.a.a(strA);
    }

    public final String getName() {
        return getF88959a().f234885h.f234859a;
    }

    public final String getPocketId() {
        g0 g0Var = getF88959a().f234885h;
        f0 f0Var = g0Var instanceof f0 ? (f0) g0Var : null;
        if (f0Var != null) {
            return f0Var.d.f234875a;
        }
        return null;
    }
}
