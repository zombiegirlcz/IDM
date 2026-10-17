package com.revolut.feature.subaccount.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/SubaccountType;", "Landroid/os/Parcelable;", "<init>", "()V", "Personal", "Group", "Junior", "Teen", "Pro", "ProTax", "Joint", "Lcom/revolut/feature/subaccount/api/models/SubaccountType$Group;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType$Joint;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType$Junior;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType$Personal;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType$Pro;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType$ProTax;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType$Teen;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SubaccountType implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/SubaccountType$Group;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Group extends SubaccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Group f88960a = new Group();

        @NotNull
        public static final Parcelable.Creator<Group> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Group.f88960a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        private Group() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/SubaccountType$Joint;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Joint extends SubaccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Joint f88961a = new Joint();

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Joint.f88961a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        private Joint() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/SubaccountType$Junior;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Junior extends SubaccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Junior f88962a = new Junior();

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Junior.f88962a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        private Junior() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/SubaccountType$Personal;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Personal extends SubaccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Personal f88963a = new Personal();

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Personal.f88963a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        private Personal() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/SubaccountType$Pro;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Pro extends SubaccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Pro f88964a = new Pro();

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Pro.f88964a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        private Pro() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/SubaccountType$ProTax;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ProTax extends SubaccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ProTax f88965a = new ProTax();

        @NotNull
        public static final Parcelable.Creator<ProTax> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ProTax.f88965a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProTax[i];
            }
        }

        private ProTax() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/models/SubaccountType$Teen;", "Lcom/revolut/feature/subaccount/api/models/SubaccountType;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Teen extends SubaccountType {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Teen f88966a = new Teen();

        @NotNull
        public static final Parcelable.Creator<Teen> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Teen.f88966a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Teen[i];
            }
        }

        private Teen() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    private SubaccountType() {
    }
}
