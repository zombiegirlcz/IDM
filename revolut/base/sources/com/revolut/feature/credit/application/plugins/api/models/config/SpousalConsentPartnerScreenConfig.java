package com.revolut.feature.credit.application.plugins.api.models.config;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/credit/application/plugins/api/models/config/SpousalConsentPartnerScreenConfig;", "Lcom/revolut/feature/credit/application/plugins/api/models/config/ScreenConfig;", "", "toString", "()Ljava/lang/String;", "feature_credit_application_plugins_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SpousalConsentPartnerScreenConfig extends ScreenConfig {

    @NotNull
    public static final Parcelable.Creator<SpousalConsentPartnerScreenConfig> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f66424a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f66425b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f66426c;
    public final Clause d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SpousalConsentPartnerScreenConfig((Clause) parcel.readParcelable(SpousalConsentPartnerScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(SpousalConsentPartnerScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(SpousalConsentPartnerScreenConfig.class.getClassLoader()), (Clause) parcel.readParcelable(SpousalConsentPartnerScreenConfig.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SpousalConsentPartnerScreenConfig[i];
        }
    }

    public SpousalConsentPartnerScreenConfig(Clause title, Clause subtitle, Clause primaryButtonText, Clause secondaryButtonText) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(secondaryButtonText, "secondaryButtonText");
        this.f66424a = title;
        this.f66425b = subtitle;
        this.f66426c = primaryButtonText;
        this.d = secondaryButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof SpousalConsentPartnerScreenConfig)) {
            return false;
        }
        SpousalConsentPartnerScreenConfig spousalConsentPartnerScreenConfig = (SpousalConsentPartnerScreenConfig) obj2;
        return Intrinsics.f(this.f66424a, spousalConsentPartnerScreenConfig.f66424a) && Intrinsics.f(this.f66425b, spousalConsentPartnerScreenConfig.f66425b) && Intrinsics.f(this.f66426c, spousalConsentPartnerScreenConfig.f66426c) && Intrinsics.f(this.d, spousalConsentPartnerScreenConfig.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + p.a.a(p.a.a(this.f66424a.hashCode() * 31, 31, this.f66425b), 31, this.f66426c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f66424a, i);
        dest.writeParcelable(this.f66425b, i);
        dest.writeParcelable(this.f66426c, i);
        dest.writeParcelable(this.d, i);
    }
}
