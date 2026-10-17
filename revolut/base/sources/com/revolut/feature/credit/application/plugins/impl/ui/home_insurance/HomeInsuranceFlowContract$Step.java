package com.revolut.feature.credit.application.plugins.impl.ui.home_insurance;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.kompot.navigable.flow.FlowStep;
import ht3.l0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import ny3.p;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "Initial", "Intro", "Disclaimer", "Requirements", "DocumentsUpload", "ContinueWebViewPopup", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$ContinueWebViewPopup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$Disclaimer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$DocumentsUpload;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$Requirements;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface HomeInsuranceFlowContract$Step extends FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$ContinueWebViewPopup;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContinueWebViewPopup implements HomeInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<ContinueWebViewPopup> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uy3.d f67772a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f67773b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ContinueWebViewPopup((uy3.d) parcel.readSerializable(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ContinueWebViewPopup[i];
            }
        }

        public ContinueWebViewPopup(uy3.d configuration, String url2) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f67772a = configuration;
            this.f67773b = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ContinueWebViewPopup)) {
                return false;
            }
            ContinueWebViewPopup continueWebViewPopup = (ContinueWebViewPopup) obj2;
            return Intrinsics.f(this.f67772a, continueWebViewPopup.f67772a) && Intrinsics.f(this.f67773b, continueWebViewPopup.f67773b);
        }

        public final int hashCode() {
            return this.f67773b.hashCode() + (this.f67772a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67772a);
            dest.writeString(this.f67773b);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$Disclaimer;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Disclaimer implements HomeInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Disclaimer> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f67774a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Disclaimer((l0) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disclaimer[i];
            }
        }

        public Disclaimer(l0 configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67774a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Disclaimer) && Intrinsics.f(this.f67774a, ((Disclaimer) obj2).f67774a);
        }

        public final int hashCode() {
            return this.f67774a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67774a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$DocumentsUpload;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentsUpload implements HomeInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentsUpload> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p f67775a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentsUpload((p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentsUpload[i];
            }
        }

        public DocumentsUpload(p configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67775a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof DocumentsUpload) && Intrinsics.f(this.f67775a, ((DocumentsUpload) obj2).f67775a);
        }

        public final int hashCode() {
            return this.f67775a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67775a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$Initial;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Initial implements HomeInsuranceFlowContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Initial f67776a = new Initial();

        @NotNull
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Initial.f67776a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Initial[i];
            }
        }

        private Initial() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro implements HomeInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final uy3.b f67777a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Intro((uy3.b) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(uy3.b configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f67777a = configuration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof Intro) && Intrinsics.f(this.f67777a, ((Intro) obj2).f67777a);
        }

        public final int hashCode() {
            return this.f67777a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67777a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step$Requirements;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/home_insurance/HomeInsuranceFlowContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Requirements implements HomeInsuranceFlowContract$Step {

        @NotNull
        public static final Parcelable.Creator<Requirements> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l0 f67778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p f67779b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Requirements((l0) parcel.readSerializable(), (p) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Requirements[i];
            }
        }

        public Requirements(l0 configuration, p documentsUploadConfiguration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(documentsUploadConfiguration, "documentsUploadConfiguration");
            this.f67778a = configuration;
            this.f67779b = documentsUploadConfiguration;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Requirements)) {
                return false;
            }
            Requirements requirements = (Requirements) obj2;
            return Intrinsics.f(this.f67778a, requirements.f67778a) && Intrinsics.f(this.f67779b, requirements.f67779b);
        }

        public final int hashCode() {
            return this.f67779b.hashCode() + (this.f67778a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67778a);
            dest.writeSerializable(this.f67779b);
        }
    }
}
