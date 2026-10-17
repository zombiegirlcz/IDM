package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentPartnerPopupScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "<init>", "()V", "Waiting", "Respond", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentPartnerPopupScreenConfig$Respond;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentPartnerPopupScreenConfig$Waiting;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class SpousalConsentPartnerPopupScreenConfig extends ScreenConfig {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentPartnerPopupScreenConfig$Respond;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentPartnerPopupScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Respond extends SpousalConsentPartnerPopupScreenConfig {

        @NotNull
        public static final Parcelable.Creator<Respond> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66418a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66419b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f66420c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Respond((Clause) parcel.readParcelable(Respond.class.getClassLoader()), (Clause) parcel.readParcelable(Respond.class.getClassLoader()), (Clause) parcel.readParcelable(Respond.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Respond[i];
            }
        }

        public Respond(Clause title, Clause description, Clause primaryButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            this.f66418a = title;
            this.f66419b = description;
            this.f66420c = primaryButton;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF66423c() {
            return this.f66420c;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Respond)) {
                return false;
            }
            Respond respond = (Respond) obj2;
            return Intrinsics.f(this.f66418a, respond.f66418a) && Intrinsics.f(this.f66419b, respond.f66419b) && Intrinsics.f(this.f66420c, respond.f66420c);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final Clause getF66422b() {
            return this.f66419b;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF66421a() {
            return this.f66418a;
        }

        public final int hashCode() {
            return this.f66420c.hashCode() + p.a.a(this.f66418a.hashCode() * 31, 31, this.f66419b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66418a, i);
            dest.writeParcelable(this.f66419b, i);
            dest.writeParcelable(this.f66420c, i);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentPartnerPopupScreenConfig$Waiting;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentPartnerPopupScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Waiting extends SpousalConsentPartnerPopupScreenConfig {

        @NotNull
        public static final Parcelable.Creator<Waiting> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f66421a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f66422b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Clause f66423c;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Waiting((Clause) parcel.readParcelable(Waiting.class.getClassLoader()), (Clause) parcel.readParcelable(Waiting.class.getClassLoader()), (Clause) parcel.readParcelable(Waiting.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Waiting[i];
            }
        }

        public Waiting(Clause title, Clause description, Clause primaryButton) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(description, "description");
            Intrinsics.checkNotNullParameter(primaryButton, "primaryButton");
            this.f66421a = title;
            this.f66422b = description;
            this.f66423c = primaryButton;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig
        /* JADX INFO: renamed from: a, reason: from getter */
        public final Clause getF66423c() {
            return this.f66423c;
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
            return Intrinsics.f(this.f66421a, waiting.f66421a) && Intrinsics.f(this.f66422b, waiting.f66422b) && Intrinsics.f(this.f66423c, waiting.f66423c);
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig
        /* JADX INFO: renamed from: getDescription, reason: from getter */
        public final Clause getF66422b() {
            return this.f66422b;
        }

        @Override // com.revolut.feature.credit.application.plugins.api.models.config.SpousalConsentPartnerPopupScreenConfig
        /* JADX INFO: renamed from: getTitle, reason: from getter */
        public final Clause getF66421a() {
            return this.f66421a;
        }

        public final int hashCode() {
            return this.f66423c.hashCode() + p.a.a(this.f66421a.hashCode() * 31, 31, this.f66422b);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f66421a, i);
            dest.writeParcelable(this.f66422b, i);
            dest.writeParcelable(this.f66423c, i);
        }
    }

    private SpousalConsentPartnerPopupScreenConfig() {
    }

    /* JADX INFO: renamed from: a */
    public abstract Clause getF66423c();

    /* JADX INFO: renamed from: getDescription */
    public abstract Clause getF66422b();

    /* JADX INFO: renamed from: getTitle */
    public abstract Clause getF66421a();
}
