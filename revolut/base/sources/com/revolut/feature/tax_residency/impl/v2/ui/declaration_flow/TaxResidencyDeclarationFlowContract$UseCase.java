package com.revolut.feature.tax_residency.impl.v2.ui.declaration_flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase", "Landroid/os/Parcelable;", "Edit", "Remove", "Add", "RequestMissingTin", "RequestMissingResidency", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase$Add;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase$Edit;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase$Remove;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase$RequestMissingResidency;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase$RequestMissingTin;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface TaxResidencyDeclarationFlowContract$UseCase extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase$Add;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Add implements TaxResidencyDeclarationFlowContract$UseCase {

        @NotNull
        public static final Parcelable.Creator<Add> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90226a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Add(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Add[i];
            }
        }

        public Add(String str) {
            this.f90226a = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Add) && Intrinsics.f(this.f90226a, ((Add) obj2).f90226a);
        }

        public final int hashCode() {
            String str = this.f90226a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90226a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase$Edit;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase;", "", "toString", "()Ljava/lang/String;", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edit implements TaxResidencyDeclarationFlowContract$UseCase {

        @NotNull
        public static final Parcelable.Creator<Edit> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f90227a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f90228b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Edit(parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Edit[i];
            }
        }

        public Edit(String tin, boolean z) {
            Intrinsics.checkNotNullParameter(tin, "tin");
            this.f90227a = tin;
            this.f90228b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Edit)) {
                return false;
            }
            Edit edit = (Edit) obj2;
            return Intrinsics.f(this.f90227a, edit.f90227a) && this.f90228b == edit.f90228b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f90228b) + (this.f90227a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f90227a);
            dest.writeInt(this.f90228b ? 1 : 0);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase$Remove;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Remove implements TaxResidencyDeclarationFlowContract$UseCase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Remove f90229a = new Remove();

        @NotNull
        public static final Parcelable.Creator<Remove> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Remove.f90229a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Remove[i];
            }
        }

        private Remove() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase$RequestMissingResidency;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestMissingResidency implements TaxResidencyDeclarationFlowContract$UseCase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestMissingResidency f90230a = new RequestMissingResidency();

        @NotNull
        public static final Parcelable.Creator<RequestMissingResidency> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestMissingResidency.f90230a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestMissingResidency[i];
            }
        }

        private RequestMissingResidency() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase$RequestMissingTin;", "Lcom/revolut/feature/tax_residency/impl/v2/ui/declaration_flow/TaxResidencyDeclarationFlowContract$UseCase;", "<init>", "()V", "feature_tax_residency_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RequestMissingTin implements TaxResidencyDeclarationFlowContract$UseCase {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final RequestMissingTin f90231a = new RequestMissingTin();

        @NotNull
        public static final Parcelable.Creator<RequestMissingTin> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RequestMissingTin.f90231a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RequestMissingTin[i];
            }
        }

        private RequestMissingTin() {
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
}
