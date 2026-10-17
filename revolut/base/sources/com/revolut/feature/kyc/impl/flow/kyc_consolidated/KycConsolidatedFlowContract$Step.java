package com.revolut.feature.kyc.impl.flow.kyc_consolidated;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import my8.l;
import my8.r;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"com/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "SingleDocPrompt", "SubmitCitizenship", "RemoteDocs", "Lcom/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$Step$RemoteDocs;", "Lcom/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$Step$SingleDocPrompt;", "Lcom/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$Step$SubmitCitizenship;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class KycConsolidatedFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$Step$RemoteDocs;", "Lcom/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RemoteDocs extends KycConsolidatedFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<RemoteDocs> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f77733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f77734b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new RemoteDocs((wi0.b) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new RemoteDocs[i];
            }
        }

        public RemoteDocs(wi0.b citizenship, String documentsLanguageTag) {
            Intrinsics.checkNotNullParameter(citizenship, "citizenship");
            Intrinsics.checkNotNullParameter(documentsLanguageTag, "documentsLanguageTag");
            this.f77733a = citizenship;
            this.f77734b = documentsLanguageTag;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof RemoteDocs)) {
                return false;
            }
            RemoteDocs remoteDocs = (RemoteDocs) obj2;
            return Intrinsics.f(this.f77733a, remoteDocs.f77733a) && Intrinsics.f(this.f77734b, remoteDocs.f77734b);
        }

        public final int hashCode() {
            return this.f77734b.hashCode() + (this.f77733a.f297794a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77733a);
            dest.writeString(this.f77734b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$Step$SingleDocPrompt;", "Lcom/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SingleDocPrompt extends KycConsolidatedFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SingleDocPrompt> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f77735a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f77736b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final r f77737c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SingleDocPrompt((l) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), r.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SingleDocPrompt[i];
            }
        }

        public SingleDocPrompt(l doc2, wi0.b countryCode, r kycScope) {
            Intrinsics.checkNotNullParameter(doc2, "doc");
            Intrinsics.checkNotNullParameter(countryCode, "countryCode");
            Intrinsics.checkNotNullParameter(kycScope, "kycScope");
            this.f77735a = doc2;
            this.f77736b = countryCode;
            this.f77737c = kycScope;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SingleDocPrompt)) {
                return false;
            }
            SingleDocPrompt singleDocPrompt = (SingleDocPrompt) obj2;
            return Intrinsics.f(this.f77735a, singleDocPrompt.f77735a) && Intrinsics.f(this.f77736b, singleDocPrompt.f77736b) && this.f77737c == singleDocPrompt.f77737c;
        }

        public final int hashCode() {
            return this.f77737c.hashCode() + p.a.c(this.f77735a.hashCode() * 31, 31, this.f77736b.f297794a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77735a);
            dest.writeSerializable(this.f77736b);
            dest.writeString(this.f77737c.name());
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$Step$SubmitCitizenship;", "Lcom/revolut/feature/kyc/impl/flow/kyc_consolidated/KycConsolidatedFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_kyc_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SubmitCitizenship extends KycConsolidatedFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SubmitCitizenship> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final wi0.b f77738a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final wi0.b f77739b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f77740c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SubmitCitizenship((wi0.b) parcel.readSerializable(), (wi0.b) parcel.readSerializable(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SubmitCitizenship[i];
            }
        }

        public SubmitCitizenship(wi0.b suggestedCitizenship, wi0.b residencyCountry, boolean z) {
            Intrinsics.checkNotNullParameter(suggestedCitizenship, "suggestedCitizenship");
            Intrinsics.checkNotNullParameter(residencyCountry, "residencyCountry");
            this.f77738a = suggestedCitizenship;
            this.f77739b = residencyCountry;
            this.f77740c = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SubmitCitizenship)) {
                return false;
            }
            SubmitCitizenship submitCitizenship = (SubmitCitizenship) obj2;
            return Intrinsics.f(this.f77738a, submitCitizenship.f77738a) && Intrinsics.f(this.f77739b, submitCitizenship.f77739b) && this.f77740c == submitCitizenship.f77740c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f77740c) + p.a.c(this.f77738a.f297794a.hashCode() * 31, 31, this.f77739b.f297794a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f77738a);
            dest.writeSerializable(this.f77739b);
            dest.writeInt(this.f77740c ? 1 : 0);
        }
    }

    private KycConsolidatedFlowContract$Step() {
    }
}
