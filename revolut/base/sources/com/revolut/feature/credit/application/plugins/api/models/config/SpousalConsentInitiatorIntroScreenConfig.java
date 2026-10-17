package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "<init>", "()V", "ApplyForOtherProduct", "NeedPartnerConsent", "AwaitingResponse", "ApplicationDecline", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig$ApplicationDecline;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig$ApplyForOtherProduct;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig$AwaitingResponse;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig$NeedPartnerConsent;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SpousalConsentInitiatorIntroScreenConfig extends ScreenConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig$ApplicationDecline;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApplicationDecline extends SpousalConsentInitiatorIntroScreenConfig {

        @NotNull
        public static final Parcelable.Creator<ApplicationDecline> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f66392c;
        public final Clause d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApplicationDecline((Clause) parcel.readParcelable(ApplicationDecline.class.getClassLoader()), (Clause) parcel.readParcelable(ApplicationDecline.class.getClassLoader()), (Clause) parcel.readParcelable(ApplicationDecline.class.getClassLoader()), (Clause) parcel.readParcelable(ApplicationDecline.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApplicationDecline[i];
            }
        }

        public ApplicationDecline(Clause title, Clause description, Clause primaryButtonText, Clause secondaryButtonText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            this.f66390a = title;
            this.f66391b = description;
            this.f66392c = primaryButtonText;
            this.d = secondaryButtonText;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF66401c() {
            return this.f66392c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ApplicationDecline)) {
                return false;
            }
            ApplicationDecline applicationDecline = (ApplicationDecline) obj2;
            return Intrinsics.f(this.f66390a, applicationDecline.f66390a) && Intrinsics.f(this.f66391b, applicationDecline.f66391b) && Intrinsics.f(this.f66392c, applicationDecline.f66392c) && Intrinsics.f(this.d, applicationDecline.d);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final Clause getF66400b() {
            return this.f66391b;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF66399a() {
            return this.f66390a;
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.a(p.a.a(this.f66390a.hashCode() * 31, 31, this.f66391b), 31, this.f66392c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66390a, i);
            dest.writeParcelable(this.f66391b, i);
            dest.writeParcelable(this.f66392c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig$ApplyForOtherProduct;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ApplyForOtherProduct extends SpousalConsentInitiatorIntroScreenConfig {

        @NotNull
        public static final Parcelable.Creator<ApplyForOtherProduct> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f66395c;
        public final Clause d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ApplyForOtherProduct((Clause) parcel.readParcelable(ApplyForOtherProduct.class.getClassLoader()), (Clause) parcel.readParcelable(ApplyForOtherProduct.class.getClassLoader()), (Clause) parcel.readParcelable(ApplyForOtherProduct.class.getClassLoader()), (Clause) parcel.readParcelable(ApplyForOtherProduct.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ApplyForOtherProduct[i];
            }
        }

        public ApplyForOtherProduct(Clause title, Clause description, Clause primaryButtonText, Clause secondaryButtonText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            this.f66393a = title;
            this.f66394b = description;
            this.f66395c = primaryButtonText;
            this.d = secondaryButtonText;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF66401c() {
            return this.f66395c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof ApplyForOtherProduct)) {
                return false;
            }
            ApplyForOtherProduct applyForOtherProduct = (ApplyForOtherProduct) obj2;
            return Intrinsics.f(this.f66393a, applyForOtherProduct.f66393a) && Intrinsics.f(this.f66394b, applyForOtherProduct.f66394b) && Intrinsics.f(this.f66395c, applyForOtherProduct.f66395c) && Intrinsics.f(this.d, applyForOtherProduct.d);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final Clause getF66400b() {
            return this.f66394b;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF66399a() {
            return this.f66393a;
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.a(p.a.a(this.f66393a.hashCode() * 31, 31, this.f66394b), 31, this.f66395c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66393a, i);
            dest.writeParcelable(this.f66394b, i);
            dest.writeParcelable(this.f66395c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig$AwaitingResponse;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AwaitingResponse extends SpousalConsentInitiatorIntroScreenConfig {

        @NotNull
        public static final Parcelable.Creator<AwaitingResponse> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66396a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f66398c;
        public final Clause d;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new AwaitingResponse((Clause) parcel.readParcelable(AwaitingResponse.class.getClassLoader()), (Clause) parcel.readParcelable(AwaitingResponse.class.getClassLoader()), (Clause) parcel.readParcelable(AwaitingResponse.class.getClassLoader()), (Clause) parcel.readParcelable(AwaitingResponse.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new AwaitingResponse[i];
            }
        }

        public AwaitingResponse(Clause title, Clause description, Clause primaryButtonText, Clause secondaryButtonText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
            this.f66396a = title;
            this.f66397b = description;
            this.f66398c = primaryButtonText;
            this.d = secondaryButtonText;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF66401c() {
            return this.f66398c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof AwaitingResponse)) {
                return false;
            }
            AwaitingResponse awaitingResponse = (AwaitingResponse) obj2;
            return Intrinsics.f(this.f66396a, awaitingResponse.f66396a) && Intrinsics.f(this.f66397b, awaitingResponse.f66397b) && Intrinsics.f(this.f66398c, awaitingResponse.f66398c) && Intrinsics.f(this.d, awaitingResponse.d);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final Clause getF66400b() {
            return this.f66397b;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF66399a() {
            return this.f66396a;
        }

        public final int hashCode() {
            return this.d.hashCode() + p.a.a(p.a.a(this.f66396a.hashCode() * 31, 31, this.f66397b), 31, this.f66398c);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66396a, i);
            dest.writeParcelable(this.f66397b, i);
            dest.writeParcelable(this.f66398c, i);
            dest.writeParcelable(this.d, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig$NeedPartnerConsent;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentInitiatorIntroScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NeedPartnerConsent extends SpousalConsentInitiatorIntroScreenConfig {

        @NotNull
        public static final Parcelable.Creator<NeedPartnerConsent> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f66401c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new NeedPartnerConsent((Clause) parcel.readParcelable(NeedPartnerConsent.class.getClassLoader()), (Clause) parcel.readParcelable(NeedPartnerConsent.class.getClassLoader()), (Clause) parcel.readParcelable(NeedPartnerConsent.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new NeedPartnerConsent[i];
            }
        }

        public NeedPartnerConsent(Clause title, Clause description, Clause primaryButtonText) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
            this.f66399a = title;
            this.f66400b = description;
            this.f66401c = primaryButtonText;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF66401c() {
            return this.f66401c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof NeedPartnerConsent)) {
                return false;
            }
            NeedPartnerConsent needPartnerConsent = (NeedPartnerConsent) obj2;
            return Intrinsics.f(this.f66399a, needPartnerConsent.f66399a) && Intrinsics.f(this.f66400b, needPartnerConsent.f66400b) && Intrinsics.f(this.f66401c, needPartnerConsent.f66401c);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final Clause getF66400b() {
            return this.f66400b;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentInitiatorIntroScreenConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF66399a() {
            return this.f66399a;
        }

        public final int hashCode() {
            return this.f66401c.hashCode() + p.a.a(this.f66399a.hashCode() * 31, 31, this.f66400b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66399a, i);
            dest.writeParcelable(this.f66400b, i);
            dest.writeParcelable(this.f66401c, i);
        }
    }

    private SpousalConsentInitiatorIntroScreenConfig() {
    }

    /* JADX INFO: renamed from: a */
    public abstract Clause getF66401c();

    /* JADX INFO: renamed from: getDescription */
    public abstract Clause getF66400b();

    /* JADX INFO: renamed from: getTitle */
    public abstract Clause getF66399a();
}
