package com.revolut.shared.feature.event_appearance.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.views.ImageWithAnimatedBackgroundView;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.media.Media;
import com.revolut.core.ui_kit_core.displayers.video.models.UrlVideo;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/feature/event_appearance/api/models/WelcomeAppearance;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_shared_event_appearance_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WelcomeAppearance implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<WelcomeAppearance> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f104714a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ImageWithAnimatedBackgroundView.Model f104715b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Media f104716c;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new WelcomeAppearance((Clause) parcel.readParcelable(WelcomeAppearance.class.getClassLoader()), (ImageWithAnimatedBackgroundView.Model) parcel.readParcelable(WelcomeAppearance.class.getClassLoader()), (Media) parcel.readParcelable(WelcomeAppearance.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WelcomeAppearance[i];
        }
    }

    public WelcomeAppearance(Clause message, ImageWithAnimatedBackgroundView.Model model, Media media) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f104714a = message;
        this.f104715b = model;
        this.f104716c = media;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof WelcomeAppearance)) {
            return false;
        }
        WelcomeAppearance welcomeAppearance = (WelcomeAppearance) obj2;
        return Intrinsics.f(this.f104714a, welcomeAppearance.f104714a) && Intrinsics.f(this.f104715b, welcomeAppearance.f104715b) && Intrinsics.f(this.f104716c, welcomeAppearance.f104716c);
    }

    public final int hashCode() {
        int iHashCode = this.f104714a.hashCode() * 31;
        ImageWithAnimatedBackgroundView.Model model = this.f104715b;
        int iHashCode2 = (iHashCode + (model == null ? 0 : model.hashCode())) * 31;
        Media media = this.f104716c;
        return iHashCode2 + (media != null ? media.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f104714a, i);
        dest.writeParcelable(this.f104715b, i);
        dest.writeParcelable(this.f104716c, i);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WelcomeAppearance(Clause message, Image image, UrlVideo urlVideo) {
        this(message, image != null ? new ImageWithAnimatedBackgroundView.Model(image, null) : null, urlVideo);
        Intrinsics.checkNotNullParameter(message, "message");
    }
}
