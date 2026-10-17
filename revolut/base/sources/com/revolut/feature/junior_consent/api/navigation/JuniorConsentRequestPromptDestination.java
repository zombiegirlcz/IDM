package com.revolut.feature.junior_consent.api.navigation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.kompot.bridge.navigation.KompotDestination;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/junior_consent/api/navigation/JuniorConsentRequestPromptDestination;", "Lcom/revolut/kompot/bridge/navigation/KompotDestination;", "", "toString", "()Ljava/lang/String;", "feature_junior_consent_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JuniorConsentRequestPromptDestination implements KompotDestination {

    @NotNull
    public static final Parcelable.Creator<JuniorConsentRequestPromptDestination> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f76866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ConsentTypeId f76867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Media f76868c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new JuniorConsentRequestPromptDestination(parcel.readString(), (ConsentTypeId) parcel.readParcelable(JuniorConsentRequestPromptDestination.class.getClassLoader()), (Media) parcel.readParcelable(JuniorConsentRequestPromptDestination.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new JuniorConsentRequestPromptDestination[i];
        }
    }

    public JuniorConsentRequestPromptDestination(String juniorId, ConsentTypeId consentTypeId, Media promptMedia) {
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(consentTypeId, "consentTypeId");
        Intrinsics.checkNotNullParameter(promptMedia, "promptMedia");
        this.f76866a = juniorId;
        this.f76867b = consentTypeId;
        this.f76868c = promptMedia;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ConsentTypeId getF76867b() {
        return this.f76867b;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF76866a() {
        return this.f76866a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Media getF76868c() {
        return this.f76868c;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof JuniorConsentRequestPromptDestination)) {
            return false;
        }
        JuniorConsentRequestPromptDestination juniorConsentRequestPromptDestination = (JuniorConsentRequestPromptDestination) obj2;
        return Intrinsics.f(this.f76866a, juniorConsentRequestPromptDestination.f76866a) && Intrinsics.f(this.f76867b, juniorConsentRequestPromptDestination.f76867b) && Intrinsics.f(this.f76868c, juniorConsentRequestPromptDestination.f76868c);
    }

    public final int hashCode() {
        return this.f76868c.hashCode() + ((this.f76867b.hashCode() + (this.f76866a.hashCode() * 31)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f76866a);
        dest.writeParcelable(this.f76867b, i);
        dest.writeParcelable(this.f76868c, i);
    }
}
