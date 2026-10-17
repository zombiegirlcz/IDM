package com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zw7.t;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/insurance_pet/impl/ui/cancellation/feedback/CancellationFeedbackScreenContract$Configuration", "Landroid/os/Parcelable;", "<init>", "()V", "CancelPolicy", "RejectRenewal", "Lcom/revolut/feature/insurance_pet/impl/ui/cancellation/feedback/CancellationFeedbackScreenContract$Configuration$CancelPolicy;", "Lcom/revolut/feature/insurance_pet/impl/ui/cancellation/feedback/CancellationFeedbackScreenContract$Configuration$RejectRenewal;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class CancellationFeedbackScreenContract$Configuration implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/cancellation/feedback/CancellationFeedbackScreenContract$Configuration$CancelPolicy;", "Lcom/revolut/feature/insurance_pet/impl/ui/cancellation/feedback/CancellationFeedbackScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CancelPolicy extends CancellationFeedbackScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<CancelPolicy> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76250a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76251b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f76252c;
        public final List d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 != i; i2++) {
                    arrayList.add(t.valueOf(parcel.readString()));
                }
                return new CancelPolicy(string, string2, string3, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new CancelPolicy[i];
            }
        }

        public CancelPolicy(String policyId, String petName, String petId, List petIssues) {
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            Intrinsics.checkNotNullParameter(petName, "petName");
            Intrinsics.checkNotNullParameter(petId, "petId");
            Intrinsics.checkNotNullParameter(petIssues, "petIssues");
            this.f76250a = policyId;
            this.f76251b = petName;
            this.f76252c = petId;
            this.d = petIssues;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF76253a() {
            return this.f76252c;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF76254b() {
            return this.f76251b;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF76255c() {
            return this.f76250a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof CancelPolicy)) {
                return false;
            }
            CancelPolicy cancelPolicy = (CancelPolicy) obj2;
            return Intrinsics.f(this.f76250a, cancelPolicy.f76250a) && Intrinsics.f(this.f76251b, cancelPolicy.f76251b) && Intrinsics.f(this.f76252c, cancelPolicy.f76252c) && Intrinsics.f(this.d, cancelPolicy.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.c(p.a.c(this.f76250a.hashCode() * 31, 31, this.f76251b), 31, this.f76252c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76250a);
            dest.writeString(this.f76251b);
            dest.writeString(this.f76252c);
            Iterator itV = p.a.v(this.d, dest);
            while (itV.hasNext()) {
                dest.writeString(((t) itV.next()).name());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_pet/impl/ui/cancellation/feedback/CancellationFeedbackScreenContract$Configuration$RejectRenewal;", "Lcom/revolut/feature/insurance_pet/impl/ui/cancellation/feedback/CancellationFeedbackScreenContract$Configuration;", "", "toString", "()Ljava/lang/String;", "feature_insurance_pet_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RejectRenewal extends CancellationFeedbackScreenContract$Configuration {

        @NotNull
        public static final Parcelable.Creator<RejectRenewal> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76253a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f76254b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f76255c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RejectRenewal(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RejectRenewal[i];
            }
        }

        public RejectRenewal(String petId, String petName, String policyId) {
            Intrinsics.checkNotNullParameter(petId, "petId");
            Intrinsics.checkNotNullParameter(petName, "petName");
            Intrinsics.checkNotNullParameter(policyId, "policyId");
            this.f76253a = petId;
            this.f76254b = petName;
            this.f76255c = policyId;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration
        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getF76253a() {
            return this.f76253a;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration
        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getF76254b() {
            return this.f76254b;
        }

        @Override // com.revolut.feature.insurance_pet.impl.ui.cancellation.feedback.CancellationFeedbackScreenContract$Configuration
        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getF76255c() {
            return this.f76255c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RejectRenewal)) {
                return false;
            }
            RejectRenewal rejectRenewal = (RejectRenewal) obj2;
            return Intrinsics.f(this.f76253a, rejectRenewal.f76253a) && Intrinsics.f(this.f76254b, rejectRenewal.f76254b) && Intrinsics.f(this.f76255c, rejectRenewal.f76255c);
        }

        public final int hashCode() {
            return this.f76255c.hashCode() + p.a.c(this.f76253a.hashCode() * 31, 31, this.f76254b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76253a);
            dest.writeString(this.f76254b);
            dest.writeString(this.f76255c);
        }
    }

    private CancellationFeedbackScreenContract$Configuration() {
    }

    /* JADX INFO: renamed from: a */
    public abstract String getF76253a();

    /* JADX INFO: renamed from: b */
    public abstract String getF76254b();

    /* JADX INFO: renamed from: c */
    public abstract String getF76255c();
}
