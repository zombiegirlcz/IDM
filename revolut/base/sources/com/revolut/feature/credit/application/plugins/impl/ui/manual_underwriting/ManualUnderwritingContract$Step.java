package com.revolut.feature.credit.application.plugins.impl.ui.manual_underwriting;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.w0;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.feature.credit.application.plugins.api.models.config.WaitingPopupScreenConfig;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingIntroScreenContent;
import com.revolut.feature.credit.application.plugins.api.models.plugins.manual_underwriting.ManualUnderwritingReferralFlag;
import com.revolut.kompot.navigable.flow.FlowStep;
import hs3.z1;
import java.util.ArrayList;
import java.util.Iterator;
import jv3.b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okl.m;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"com/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step", "Lcom/revolut/kompot/navigable/flow/FlowStep;", "<init>", "()V", "Intro", "Documents", "DocumentOptions", "TicketorProgress", "ModalStep", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$DocumentOptions;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$Documents;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$TicketorProgress;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class ManualUnderwritingContract$Step implements FlowStep {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$DocumentOptions;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class DocumentOptions extends ManualUnderwritingContract$Step {

        @NotNull
        public static final Parcelable.Creator<DocumentOptions> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ManualUnderwritingReferralFlag f67903a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f67904b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new DocumentOptions((ManualUnderwritingReferralFlag) parcel.readParcelable(DocumentOptions.class.getClassLoader()), b.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DocumentOptions[i];
            }
        }

        public DocumentOptions(ManualUnderwritingReferralFlag referralFlag, b type) {
            Intrinsics.checkNotNullParameter(referralFlag, "referralFlag");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f67903a = referralFlag;
            this.f67904b = type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof DocumentOptions)) {
                return false;
            }
            DocumentOptions documentOptions = (DocumentOptions) obj2;
            return Intrinsics.f(this.f67903a, documentOptions.f67903a) && this.f67904b == documentOptions.f67904b;
        }

        public final int hashCode() {
            return this.f67904b.hashCode() + (this.f67903a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67903a, i);
            dest.writeString(this.f67904b.name());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$Documents;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Documents extends ManualUnderwritingContract$Step {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Documents f67905a = new Documents();

        @NotNull
        public static final Parcelable.Creator<Documents> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Documents.f67905a;
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$Intro;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Intro extends ManualUnderwritingContract$Step {

        @NotNull
        public static final Parcelable.Creator<Intro> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ManualUnderwritingIntroScreenContent f67906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ArrayList f67907b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                ManualUnderwritingIntroScreenContent manualUnderwritingIntroScreenContent = (ManualUnderwritingIntroScreenContent) j6.a.f(parcel, "parcel", Intro.class);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                int iE = 0;
                while (iE != i) {
                    iE = j6.a.e(Intro.class, parcel, arrayList, iE, 1);
                }
                return new Intro(manualUnderwritingIntroScreenContent, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Intro[i];
            }
        }

        public Intro(ManualUnderwritingIntroScreenContent introScreen, ArrayList referralFlags) {
            Intrinsics.checkNotNullParameter(introScreen, "introScreen");
            Intrinsics.checkNotNullParameter(referralFlags, "referralFlags");
            this.f67906a = introScreen;
            this.f67907b = referralFlags;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Intro)) {
                return false;
            }
            Intro intro = (Intro) obj2;
            return Intrinsics.f(this.f67906a, intro.f67906a) && this.f67907b.equals(intro.f67907b);
        }

        public final int hashCode() {
            return this.f67907b.hashCode() + (this.f67906a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f67906a, i);
            Iterator itY = j6.a.y(this.f67907b, dest);
            while (itY.hasNext()) {
                dest.writeParcelable((Parcelable) itY.next(), i);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$ModalStep;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step;", "<init>", "()V", "AdditionalInfoRequired", "Waiting", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$ModalStep$AdditionalInfoRequired;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$ModalStep$Waiting;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class ModalStep extends ManualUnderwritingContract$Step {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$ModalStep$AdditionalInfoRequired;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$ModalStep;", "<init>", "()V", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class AdditionalInfoRequired extends ModalStep {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final AdditionalInfoRequired f67908a = new AdditionalInfoRequired();

            @NotNull
            public static final Parcelable.Creator<AdditionalInfoRequired> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return AdditionalInfoRequired.f67908a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new AdditionalInfoRequired[i];
                }
            }

            private AdditionalInfoRequired() {
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

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$ModalStep$Waiting;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$ModalStep;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Waiting extends ModalStep {

            @NotNull
            public static final Parcelable.Creator<Waiting> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final WaitingPopupScreenConfig f67909a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final w0 f67910b;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Waiting((WaitingPopupScreenConfig) parcel.readParcelable(Waiting.class.getClassLoader()), ((AnalyticsContext) parcel.readParcelable(Waiting.class.getClassLoader())).f50296a);
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Waiting[i];
                }
            }

            public Waiting(WaitingPopupScreenConfig config, w0 w0Var) {
                Intrinsics.checkNotNullParameter(config, "config");
                this.f67909a = config;
                this.f67910b = w0Var;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof Waiting)) {
                    return false;
                }
                Waiting waiting = (Waiting) obj2;
                return Intrinsics.f(this.f67909a, waiting.f67909a) && Intrinsics.f(this.f67910b, waiting.f67910b);
            }

            public final int hashCode() {
                return AnalyticsContext.a(this.f67910b) + (this.f67909a.hashCode() * 31);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeParcelable(this.f67909a, i);
                m.x(this.f67910b, dest, i);
            }
        }

        private ModalStep() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step$TicketorProgress;", "Lcom/revolut/feature/credit/application/plugins/impl/ui/manual_underwriting/ManualUnderwritingContract$Step;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class TicketorProgress extends ManualUnderwritingContract$Step {

        @NotNull
        public static final Parcelable.Creator<TicketorProgress> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final z1 f67911a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new TicketorProgress((z1) parcel.readSerializable());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new TicketorProgress[i];
            }
        }

        public TicketorProgress(z1 metadata) {
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            this.f67911a = metadata;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof TicketorProgress) && Intrinsics.f(this.f67911a, ((TicketorProgress) obj2).f67911a);
        }

        public final int hashCode() {
            return this.f67911a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.f67911a);
        }
    }

    private ManualUnderwritingContract$Step() {
    }
}
