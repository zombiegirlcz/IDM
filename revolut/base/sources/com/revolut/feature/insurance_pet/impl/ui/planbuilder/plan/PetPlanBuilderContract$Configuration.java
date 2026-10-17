package com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zw7.c0;
import zw7.z;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/planbuilder/plan/PetPlanBuilderContract$Configuration", "Landroid/os/Parcelable;", "<init>", "()V", "DefaultConfig", "RenewalPlanConfig", "Lcom/revolut/feature/insurance_pet/impl/ui/planbuilder/plan/PetPlanBuilderContract$Configuration$DefaultConfig;", "Lcom/revolut/feature/insurance_pet/impl/ui/planbuilder/plan/PetPlanBuilderContract$Configuration$RenewalPlanConfig;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PetPlanBuilderContract$Configuration implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/planbuilder/plan/PetPlanBuilderContract$Configuration$DefaultConfig;", "Lcom/revolut/feature/insurance_pet/impl/ui/planbuilder/plan/PetPlanBuilderContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DefaultConfig extends PetPlanBuilderContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<DefaultConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0 f76375c;
        public final z d;
        public final Date e;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DefaultConfig(parcel.readString(), parcel.readString(), c0.valueOf(parcel.readString()), z.valueOf(parcel.readString()), (Date) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DefaultConfig[i];
            }
        }

        public DefaultConfig(String petId, String petName, c0 petType, z petGender, Date policyStartDate) {
            Intrinsics.checkNotNullParameter(petId, "petId");
            Intrinsics.checkNotNullParameter(petName, "petName");
            Intrinsics.checkNotNullParameter(petType, "petType");
            Intrinsics.checkNotNullParameter(petGender, "petGender");
            Intrinsics.checkNotNullParameter(policyStartDate, "policyStartDate");
            this.f76373a = petId;
            this.f76374b = petName;
            this.f76375c = petType;
            this.d = petGender;
            this.e = policyStartDate;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final z getD() {
            return this.d;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF76376a() {
            return this.f76373a;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF76377b() {
            return this.f76374b;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration
        /* JADX INFO: renamed from: d, reason: from getter */
        public final c0 getF76378c() {
            return this.f76375c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Date getE() {
            return this.e;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DefaultConfig)) {
                return false;
            }
            DefaultConfig defaultConfig = (DefaultConfig) obj2;
            return Intrinsics.f(this.f76373a, defaultConfig.f76373a) && Intrinsics.f(this.f76374b, defaultConfig.f76374b) && this.f76375c == defaultConfig.f76375c && this.d == defaultConfig.d && Intrinsics.f(this.e, defaultConfig.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + ((this.d.hashCode() + ((this.f76375c.hashCode() + p.a.c(this.f76373a.hashCode() * 31, 31, this.f76374b)) * 31)) * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76373a);
            dest.writeString(this.f76374b);
            dest.writeString(this.f76375c.name());
            dest.writeString(this.d.name());
            dest.writeSerializable(this.e);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/planbuilder/plan/PetPlanBuilderContract$Configuration$RenewalPlanConfig;", "Lcom/revolut/feature/insurance_pet/impl/ui/planbuilder/plan/PetPlanBuilderContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RenewalPlanConfig extends PetPlanBuilderContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<RenewalPlanConfig> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76377b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c0 f76378c;
        public final z d;
        public final Date e;
        public final String f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final boolean f76379g;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RenewalPlanConfig(parcel.readString(), parcel.readString(), c0.valueOf(parcel.readString()), z.valueOf(parcel.readString()), (Date) parcel.readSerializable(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RenewalPlanConfig[i];
            }
        }

        public RenewalPlanConfig(String petId, String petName, c0 petType, z petGender, Date policyStartDate, String quoteOptionId, boolean z) {
            Intrinsics.checkNotNullParameter(petId, "petId");
            Intrinsics.checkNotNullParameter(petName, "petName");
            Intrinsics.checkNotNullParameter(petType, "petType");
            Intrinsics.checkNotNullParameter(petGender, "petGender");
            Intrinsics.checkNotNullParameter(policyStartDate, "policyStartDate");
            Intrinsics.checkNotNullParameter(quoteOptionId, "quoteOptionId");
            this.f76376a = petId;
            this.f76377b = petName;
            this.f76378c = petType;
            this.d = petGender;
            this.e = policyStartDate;
            this.f = quoteOptionId;
            this.f76379g = z;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final z getD() {
            return this.d;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF76376a() {
            return this.f76376a;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF76377b() {
            return this.f76377b;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration
        /* JADX INFO: renamed from: d, reason: from getter */
        public final c0 getF76378c() {
            return this.f76378c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.planbuilder.plan.PetPlanBuilderContract$Configuration
        /* JADX INFO: renamed from: e, reason: from getter */
        public final Date getE() {
            return this.e;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RenewalPlanConfig)) {
                return false;
            }
            RenewalPlanConfig renewalPlanConfig = (RenewalPlanConfig) obj2;
            return Intrinsics.f(this.f76376a, renewalPlanConfig.f76376a) && Intrinsics.f(this.f76377b, renewalPlanConfig.f76377b) && this.f76378c == renewalPlanConfig.f76378c && this.d == renewalPlanConfig.d && Intrinsics.f(this.e, renewalPlanConfig.e) && Intrinsics.f(this.f, renewalPlanConfig.f) && this.f76379g == renewalPlanConfig.f76379g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f76379g) + p.a.c(t61.a.e(this.e, (this.d.hashCode() + ((this.f76378c.hashCode() + p.a.c(this.f76376a.hashCode() * 31, 31, this.f76377b)) * 31)) * 31, 31), 31, this.f);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76376a);
            dest.writeString(this.f76377b);
            dest.writeString(this.f76378c.name());
            dest.writeString(this.d.name());
            dest.writeSerializable(this.e);
            dest.writeString(this.f);
            dest.writeInt(this.f76379g ? 1 : 0);
        }
    }

    private PetPlanBuilderContract$Configuration() {
    }

    /* JADX INFO: renamed from: a */
    public abstract z getD();

    /* JADX INFO: renamed from: b */
    public abstract String getF76376a();

    /* JADX INFO: renamed from: c */
    public abstract String getF76377b();

    /* JADX INFO: renamed from: d */
    public abstract c0 getF76378c();

    /* JADX INFO: renamed from: e */
    public abstract Date getE();
}
