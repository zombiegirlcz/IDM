package com.revolut.feature.credit.application.plugins.impl.ui.mortgage_signature.flow;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy3.i;
import yy3.s;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Documents", "Document", "SigningMethods", "SigningMethodsInfo", "Otp", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step$Document;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step$Documents;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step$Otp;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step$SigningMethods;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step$SigningMethodsInfo;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface MortgageSignatureFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step$Document;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Document implements MortgageSignatureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Document> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final du3.a f68030a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Document((du3.a) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Document[i];
            }
        }

        public Document(du3.a document) {
            Intrinsics.checkNotNullParameter(document, "document");
            this.f68030a = document;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Document) && Intrinsics.f(this.f68030a, ((Document) obj2).f68030a);
        }

        public final int hashCode() {
            return this.f68030a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68030a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step$Documents;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Documents implements MortgageSignatureFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Documents f68031a = new Documents();

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Documents.f68031a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step$Otp;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Otp implements MortgageSignatureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Otp> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final i f68032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f68033b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f68034c;
        public final long d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Otp((i) parcel.readSerializable(), parcel.readString(), parcel.readString(), parcel.readLong());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Otp[i];
            }
        }

        public Otp(i method, String processId, String oneTimePassword, long j2) {
            Intrinsics.checkNotNullParameter(method, "method");
            Intrinsics.checkNotNullParameter(processId, "processId");
            Intrinsics.checkNotNullParameter(oneTimePassword, "oneTimePassword");
            this.f68032a = method;
            this.f68033b = processId;
            this.f68034c = oneTimePassword;
            this.d = j2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Otp)) {
                return false;
            }
            Otp otp = (Otp) obj2;
            return Intrinsics.f(this.f68032a, otp.f68032a) && Intrinsics.f(this.f68033b, otp.f68033b) && Intrinsics.f(this.f68034c, otp.f68034c) && this.d == otp.d;
        }

        public final int hashCode() {
            return Long.hashCode(this.d) + p.a.c(p.a.c(this.f68032a.hashCode() * 31, 31, this.f68033b), 31, this.f68034c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68032a);
            dest.writeString(this.f68033b);
            dest.writeString(this.f68034c);
            dest.writeLong(this.d);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step$SigningMethods;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SigningMethods implements MortgageSignatureFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SigningMethods f68035a = new SigningMethods();

        @NotNull
        public static final Parcelable.Creator<SigningMethods> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SigningMethods.f68035a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SigningMethods[i];
            }
        }

        private SigningMethods() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step$SigningMethodsInfo;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/mortgage_signature/flow/MortgageSignatureFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SigningMethodsInfo implements MortgageSignatureFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<SigningMethodsInfo> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s f68036a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SigningMethodsInfo((s) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SigningMethodsInfo[i];
            }
        }

        public SigningMethodsInfo(s configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f68036a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof SigningMethodsInfo) && Intrinsics.f(this.f68036a, ((SigningMethodsInfo) obj2).f68036a);
        }

        public final int hashCode() {
            return this.f68036a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f68036a);
        }
    }
}
