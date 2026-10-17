package com.revolut.feature.insurance_embedded.impl.ui.flow.embedded;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.kompot.navigable.flow.FlowStep;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"com/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "InsuranceDetails", "Documents", "SimpleTextDocument", "GetHelp", "MakeClaim", "MakeCfacClaim", "Coverage", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$Coverage;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$Documents;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$GetHelp;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$InsuranceDetails;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$MakeCfacClaim;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$MakeClaim;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$SimpleTextDocument;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class InsuranceDetailsFlowContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$Coverage;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Coverage extends InsuranceDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Coverage> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f76071a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Coverage(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Coverage[i];
            }
        }

        public Coverage(String coverageId) {
            Intrinsics.checkNotNullParameter(coverageId, "coverageId");
            this.f76071a = coverageId;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Coverage) && Intrinsics.f(this.f76071a, ((Coverage) obj2).f76071a);
        }

        public final int hashCode() {
            return this.f76071a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f76071a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$Documents;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step;", "<init>", "()V", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Documents extends InsuranceDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Documents f76072a = new Documents();

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Documents.f76072a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Documents[i];
            }
        }

        private Documents() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$GetHelp;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step;", "<init>", "()V", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class GetHelp extends InsuranceDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final GetHelp f76073a = new GetHelp();

        @NotNull
        public static final Parcelable.Creator<GetHelp> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return GetHelp.f76073a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new GetHelp[i];
            }
        }

        private GetHelp() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$InsuranceDetails;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step;", "<init>", "()V", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class InsuranceDetails extends InsuranceDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final InsuranceDetails f76074a = new InsuranceDetails();

        @NotNull
        public static final Parcelable.Creator<InsuranceDetails> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return InsuranceDetails.f76074a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new InsuranceDetails[i];
            }
        }

        private InsuranceDetails() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$MakeCfacClaim;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step;", "<init>", "()V", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MakeCfacClaim extends InsuranceDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MakeCfacClaim f76075a = new MakeCfacClaim();

        @NotNull
        public static final Parcelable.Creator<MakeCfacClaim> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MakeCfacClaim.f76075a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MakeCfacClaim[i];
            }
        }

        private MakeCfacClaim() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$MakeClaim;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step;", "<init>", "()V", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class MakeClaim extends InsuranceDetailsFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final MakeClaim f76076a = new MakeClaim();

        @NotNull
        public static final Parcelable.Creator<MakeClaim> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return MakeClaim.f76076a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new MakeClaim[i];
            }
        }

        private MakeClaim() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step$SimpleTextDocument;", "Lcom/revolut/feature/insurance_embedded/impl/ui/flow/embedded/InsuranceDetailsFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_insurance_embedded_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SimpleTextDocument extends InsuranceDetailsFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SimpleTextDocument> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f76077a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f76078b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SimpleTextDocument((Clause) parcel.readParcelable(SimpleTextDocument.class.getClassLoader()), parcel.createStringArrayList());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SimpleTextDocument[i];
            }
        }

        public SimpleTextDocument(Clause title, List values) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(values, "values");
            this.f76077a = title;
            this.f76078b = values;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof SimpleTextDocument)) {
                return false;
            }
            SimpleTextDocument simpleTextDocument = (SimpleTextDocument) obj2;
            return Intrinsics.f(this.f76077a, simpleTextDocument.f76077a) && Intrinsics.f(this.f76078b, simpleTextDocument.f76078b);
        }

        public final int hashCode() {
            return this.f76078b.hashCode() + (this.f76077a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f76077a, i);
            dest.writeStringList(this.f76078b);
        }
    }

    private InsuranceDetailsFlowContract$Step() {
    }
}
