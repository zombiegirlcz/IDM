package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsPersonalisationTargetingOnboardingPrompt;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsPersonalisationTargetingOnboardingPrompt implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsPersonalisationTargetingOnboardingPrompt> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84025b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84026c;
    public final ArrayList d;
    public final RevPointsTextWithLinks e;
    public final RevPointsPersonalisationTargetingOnboardingCta f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final RevPointsPersonalisationTargetingOnboardingCta f84027g;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            int iA = 0;
            while (iA != i) {
                iA = org.bouncycastle.jcajce.provider.digest.a.a(RevPointsPersonalisationTargetingOnboardingStep.CREATOR, parcel, arrayList, iA, 1);
            }
            RevPointsTextWithLinks revPointsTextWithLinksCreateFromParcel = RevPointsTextWithLinks.CREATOR.createFromParcel(parcel);
            Parcelable.Creator<RevPointsPersonalisationTargetingOnboardingCta> creator = RevPointsPersonalisationTargetingOnboardingCta.CREATOR;
            return new RevPointsPersonalisationTargetingOnboardingPrompt(string, string2, string3, arrayList, revPointsTextWithLinksCreateFromParcel, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPersonalisationTargetingOnboardingPrompt[i];
        }
    }

    public RevPointsPersonalisationTargetingOnboardingPrompt(String title, String subtitle, String assetUrl, ArrayList steps, RevPointsTextWithLinks disclaimer, RevPointsPersonalisationTargetingOnboardingCta personalisedOffersCta, RevPointsPersonalisationTargetingOnboardingCta revPointsPersonalisationTargetingOnboardingCta) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(assetUrl, "assetUrl");
        Intrinsics.checkNotNullParameter(steps, "steps");
        Intrinsics.checkNotNullParameter(disclaimer, "disclaimer");
        Intrinsics.checkNotNullParameter(personalisedOffersCta, "personalisedOffersCta");
        this.f84024a = title;
        this.f84025b = subtitle;
        this.f84026c = assetUrl;
        this.d = steps;
        this.e = disclaimer;
        this.f = personalisedOffersCta;
        this.f84027g = revPointsPersonalisationTargetingOnboardingCta;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPersonalisationTargetingOnboardingPrompt)) {
            return false;
        }
        RevPointsPersonalisationTargetingOnboardingPrompt revPointsPersonalisationTargetingOnboardingPrompt = (RevPointsPersonalisationTargetingOnboardingPrompt) obj2;
        return Intrinsics.f(this.f84024a, revPointsPersonalisationTargetingOnboardingPrompt.f84024a) && Intrinsics.f(this.f84025b, revPointsPersonalisationTargetingOnboardingPrompt.f84025b) && Intrinsics.f(this.f84026c, revPointsPersonalisationTargetingOnboardingPrompt.f84026c) && this.d.equals(revPointsPersonalisationTargetingOnboardingPrompt.d) && Intrinsics.f(this.e, revPointsPersonalisationTargetingOnboardingPrompt.e) && Intrinsics.f(this.f, revPointsPersonalisationTargetingOnboardingPrompt.f) && Intrinsics.f(this.f84027g, revPointsPersonalisationTargetingOnboardingPrompt.f84027g);
    }

    public final int hashCode() {
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + com.google.android.gms.internal.mlkit_vision_face.a.b(this.d, p.a.c(p.a.c(this.f84024a.hashCode() * 31, 31, this.f84025b), 31, this.f84026c), 31)) * 31)) * 31;
        RevPointsPersonalisationTargetingOnboardingCta revPointsPersonalisationTargetingOnboardingCta = this.f84027g;
        return iHashCode + (revPointsPersonalisationTargetingOnboardingCta == null ? 0 : revPointsPersonalisationTargetingOnboardingCta.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84024a);
        dest.writeString(this.f84025b);
        dest.writeString(this.f84026c);
        Iterator itY = j6.a.y(this.d, dest);
        while (itY.hasNext()) {
            ((RevPointsPersonalisationTargetingOnboardingStep) itY.next()).writeToParcel(dest, i);
        }
        this.e.writeToParcel(dest, i);
        this.f.writeToParcel(dest, i);
        RevPointsPersonalisationTargetingOnboardingCta revPointsPersonalisationTargetingOnboardingCta = this.f84027g;
        if (revPointsPersonalisationTargetingOnboardingCta == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            revPointsPersonalisationTargetingOnboardingCta.writeToParcel(dest, i);
        }
    }
}
