package com.revolut.feature.subaccount.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CurrencySelectionMode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"com/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType", "Landroid/os/Parcelable;", "Personal", "Group", "Joint", "RevPoints", "Pro", "ProTax", "Junior", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$Group;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$Joint;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$Junior;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$Personal;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$Pro;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$ProTax;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$RevPoints;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CreateSubaccountFlowProvider$CreateSubaccountType implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CreateSubaccountFlowProvider$CurrencySelectionMode f88967a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$RevPoints;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType;", "<init>", "()V", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RevPoints extends CreateSubaccountFlowProvider$CreateSubaccountType {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final RevPoints f88974b = new RevPoints();

        @NotNull
        public static final Parcelable.Creator<RevPoints> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return RevPoints.f88974b;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RevPoints[i];
            }
        }

        private RevPoints() {
            super(CreateSubaccountFlowProvider$CurrencySelectionMode.Default.f88975a);
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

    public CreateSubaccountFlowProvider$CreateSubaccountType(CreateSubaccountFlowProvider$CurrencySelectionMode createSubaccountFlowProvider$CurrencySelectionMode) {
        this.f88967a = createSubaccountFlowProvider$CurrencySelectionMode;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public CreateSubaccountFlowProvider$CurrencySelectionMode getF88967a() {
        return this.f88967a;
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$Group;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Group extends CreateSubaccountFlowProvider$CreateSubaccountType {

        @NotNull
        public static final Parcelable.Creator<Group> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode f88968b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Group((CreateSubaccountFlowProvider$CurrencySelectionMode) parcel.readParcelable(Group.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Group[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Group(CreateSubaccountFlowProvider$CurrencySelectionMode currencySelectionMode) {
            super(currencySelectionMode);
            Intrinsics.checkNotNullParameter(currencySelectionMode, "currencySelectionMode");
            this.f88968b = currencySelectionMode;
        }

        @Override // com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode getF88967a() {
            return this.f88968b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Group) && Intrinsics.f(this.f88968b, ((Group) obj2).f88968b);
        }

        public final int hashCode() {
            return this.f88968b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88968b, i);
        }

        public Group() {
            this(CreateSubaccountFlowProvider$CurrencySelectionMode.Default.f88975a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$Joint;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Joint extends CreateSubaccountFlowProvider$CreateSubaccountType {

        @NotNull
        public static final Parcelable.Creator<Joint> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode f88969b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Joint((CreateSubaccountFlowProvider$CurrencySelectionMode) parcel.readParcelable(Joint.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Joint[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Joint(CreateSubaccountFlowProvider$CurrencySelectionMode currencySelectionMode) {
            super(currencySelectionMode);
            Intrinsics.checkNotNullParameter(currencySelectionMode, "currencySelectionMode");
            this.f88969b = currencySelectionMode;
        }

        @Override // com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode getF88967a() {
            return this.f88969b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Joint) && Intrinsics.f(this.f88969b, ((Joint) obj2).f88969b);
        }

        public final int hashCode() {
            return this.f88969b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88969b, i);
        }

        public Joint() {
            this(CreateSubaccountFlowProvider$CurrencySelectionMode.Default.f88975a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$Junior;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Junior extends CreateSubaccountFlowProvider$CreateSubaccountType {

        @NotNull
        public static final Parcelable.Creator<Junior> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode f88970b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Junior((CreateSubaccountFlowProvider$CurrencySelectionMode) parcel.readParcelable(Junior.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Junior[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Junior(CreateSubaccountFlowProvider$CurrencySelectionMode currencySelectionMode) {
            super(currencySelectionMode);
            Intrinsics.checkNotNullParameter(currencySelectionMode, "currencySelectionMode");
            this.f88970b = currencySelectionMode;
        }

        @Override // com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode getF88967a() {
            return this.f88970b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Junior) && Intrinsics.f(this.f88970b, ((Junior) obj2).f88970b);
        }

        public final int hashCode() {
            return this.f88970b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88970b, i);
        }

        public Junior() {
            this(CreateSubaccountFlowProvider$CurrencySelectionMode.Default.f88975a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$Personal;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Personal extends CreateSubaccountFlowProvider$CreateSubaccountType {

        @NotNull
        public static final Parcelable.Creator<Personal> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode f88971b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Personal((CreateSubaccountFlowProvider$CurrencySelectionMode) parcel.readParcelable(Personal.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Personal[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Personal(CreateSubaccountFlowProvider$CurrencySelectionMode currencySelectionMode) {
            super(currencySelectionMode);
            Intrinsics.checkNotNullParameter(currencySelectionMode, "currencySelectionMode");
            this.f88971b = currencySelectionMode;
        }

        @Override // com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode getF88967a() {
            return this.f88971b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Personal) && Intrinsics.f(this.f88971b, ((Personal) obj2).f88971b);
        }

        public final int hashCode() {
            return this.f88971b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88971b, i);
        }

        public Personal() {
            this(CreateSubaccountFlowProvider$CurrencySelectionMode.Default.f88975a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$Pro;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Pro extends CreateSubaccountFlowProvider$CreateSubaccountType {

        @NotNull
        public static final Parcelable.Creator<Pro> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode f88972b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Pro((CreateSubaccountFlowProvider$CurrencySelectionMode) parcel.readParcelable(Pro.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Pro[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Pro(CreateSubaccountFlowProvider$CurrencySelectionMode currencySelectionMode) {
            super(currencySelectionMode);
            Intrinsics.checkNotNullParameter(currencySelectionMode, "currencySelectionMode");
            this.f88972b = currencySelectionMode;
        }

        @Override // com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode getF88967a() {
            return this.f88972b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Pro) && Intrinsics.f(this.f88972b, ((Pro) obj2).f88972b);
        }

        public final int hashCode() {
            return this.f88972b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88972b, i);
        }

        public Pro() {
            this(CreateSubaccountFlowProvider$CurrencySelectionMode.Default.f88975a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType$ProTax;", "Lcom/revolut/feature/subaccount/api/navigation/CreateSubaccountFlowProvider$CreateSubaccountType;", "", "toString", "()Ljava/lang/String;", "feature_subaccount_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ProTax extends CreateSubaccountFlowProvider$CreateSubaccountType {

        @NotNull
        public static final Parcelable.Creator<ProTax> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode f88973b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ProTax((CreateSubaccountFlowProvider$CurrencySelectionMode) parcel.readParcelable(ProTax.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ProTax[i];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ProTax(CreateSubaccountFlowProvider$CurrencySelectionMode currencySelectionMode) {
            super(currencySelectionMode);
            Intrinsics.checkNotNullParameter(currencySelectionMode, "currencySelectionMode");
            this.f88973b = currencySelectionMode;
        }

        @Override // com.revolut.feature.subaccount.api.navigation.CreateSubaccountFlowProvider$CreateSubaccountType
        /* JADX INFO: renamed from: a, reason: from getter */
        public final CreateSubaccountFlowProvider$CurrencySelectionMode getF88967a() {
            return this.f88973b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ProTax) && Intrinsics.f(this.f88973b, ((ProTax) obj2).f88973b);
        }

        public final int hashCode() {
            return this.f88973b.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f88973b, i);
        }

        public ProTax() {
            this(CreateSubaccountFlowProvider$CurrencySelectionMode.Default.f88975a);
        }
    }
}
