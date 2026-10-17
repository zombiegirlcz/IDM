package com.revolut.feature.shared.consent.prompt.builder.api.model;

import a10.b;
import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/shared/consent/prompt/builder/api/model/ConsentPromptData;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_consent_prompt_builder_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConsentPromptData implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ConsentPromptData> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f86086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f86087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f86088c;
    public final Image d;
    public final Clause e;
    public final Clause f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f86089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f86090h;
    public final String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final v6d.a f86091j;
    public final ResourceImage k;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ConsentPromptData(parcel.readString(), (Clause) parcel.readParcelable(ConsentPromptData.class.getClassLoader()), (Clause) parcel.readParcelable(ConsentPromptData.class.getClassLoader()), (Image) parcel.readParcelable(ConsentPromptData.class.getClassLoader()), (Clause) parcel.readParcelable(ConsentPromptData.class.getClassLoader()), (Clause) parcel.readParcelable(ConsentPromptData.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), v6d.a.valueOf(parcel.readString()), (ResourceImage) parcel.readParcelable(ConsentPromptData.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ConsentPromptData[i];
        }
    }

    public ConsentPromptData(String promptId, Clause title, Clause subtitle, Image image, Clause acceptButtonTitle, Clause declineButtonTitle, String str, String str2, String juniorId, v6d.a consentName, ResourceImage resourceImage) {
        Intrinsics.checkNotNullParameter(promptId, "promptId");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(acceptButtonTitle, "acceptButtonTitle");
        Intrinsics.checkNotNullParameter(declineButtonTitle, "declineButtonTitle");
        Intrinsics.checkNotNullParameter(juniorId, "juniorId");
        Intrinsics.checkNotNullParameter(consentName, "consentName");
        this.f86086a = promptId;
        this.f86087b = title;
        this.f86088c = subtitle;
        this.d = image;
        this.e = acceptButtonTitle;
        this.f = declineButtonTitle;
        this.f86089g = str;
        this.f86090h = str2;
        this.i = juniorId;
        this.f86091j = consentName;
        this.k = resourceImage;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ConsentPromptData)) {
            return false;
        }
        ConsentPromptData consentPromptData = (ConsentPromptData) obj2;
        return Intrinsics.f(this.f86086a, consentPromptData.f86086a) && Intrinsics.f(this.f86087b, consentPromptData.f86087b) && Intrinsics.f(this.f86088c, consentPromptData.f86088c) && Intrinsics.f(this.d, consentPromptData.d) && Intrinsics.f(this.e, consentPromptData.e) && Intrinsics.f(this.f, consentPromptData.f) && Intrinsics.f(this.f86089g, consentPromptData.f86089g) && Intrinsics.f(this.f86090h, consentPromptData.f86090h) && Intrinsics.f(this.i, consentPromptData.i) && this.f86091j == consentPromptData.f86091j && Intrinsics.f(this.k, consentPromptData.k);
    }

    public final int hashCode() {
        int iA = p.a.a(p.a.a(b.c(this.d, p.a.a(p.a.a(this.f86086a.hashCode() * 31, 31, this.f86087b), 31, this.f86088c), 31), 31, this.e), 31, this.f);
        String str = this.f86089g;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f86090h;
        int iHashCode2 = (this.f86091j.hashCode() + p.a.c((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.i)) * 31;
        ResourceImage resourceImage = this.k;
        return iHashCode2 + (resourceImage != null ? resourceImage.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f86086a);
        dest.writeParcelable(this.f86087b, i);
        dest.writeParcelable(this.f86088c, i);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
        dest.writeString(this.f86089g);
        dest.writeString(this.f86090h);
        dest.writeString(this.i);
        dest.writeString(this.f86091j.name());
        dest.writeParcelable(this.k, i);
    }
}
