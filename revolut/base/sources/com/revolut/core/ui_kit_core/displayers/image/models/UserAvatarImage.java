package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$Style;
import com.revolut.core.ui_kit_core.displayers.image.models.UserNamePlaceholder;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00062\u00020\u00012\u00020\u0002:\u0001\u0007J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UserAvatarImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lyy0/p;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserAvatarImage implements Image, p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UserNamePlaceholder f60044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final StylableContactImage$ContactStyle f60045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Clause f60046c;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    @NotNull
    public static final Parcelable.Creator<UserAvatarImage> CREATOR = new b();
    public static final UserNamePlaceholder.Default d = new UserNamePlaceholder.Default("", 0);

    /* JADX INFO: renamed from: com.revolut.core.ui_kit_core.displayers.image.models.UserAvatarImage$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new UserAvatarImage((UserNamePlaceholder) parcel.readParcelable(UserAvatarImage.class.getClassLoader()), (StylableContactImage$ContactStyle) parcel.readParcelable(UserAvatarImage.class.getClassLoader()), (Clause) parcel.readParcelable(UserAvatarImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new UserAvatarImage[i];
        }
    }

    public UserAvatarImage(UserNamePlaceholder userNamePlaceholder, StylableContactImage$ContactStyle stylableContactImage$ContactStyle, Clause clause) {
        this.f60044a = userNamePlaceholder;
        this.f60045b = stylableContactImage$ContactStyle;
        this.f60046c = clause;
    }

    public static UserAvatarImage b(UserAvatarImage userAvatarImage, StylableContactImage$ContactStyle stylableContactImage$ContactStyle) {
        UserNamePlaceholder userNamePlaceholder = userAvatarImage.f60044a;
        Clause clause = userAvatarImage.f60046c;
        userAvatarImage.getClass();
        return new UserAvatarImage(userNamePlaceholder, stylableContactImage$ContactStyle, clause);
    }

    @Override // yy0.p
    public final Image a(StylableContactImage$ContactStyle stylableContactImage$ContactStyle) {
        return b(this, stylableContactImage$ContactStyle);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof UserAvatarImage)) {
            return false;
        }
        UserAvatarImage userAvatarImage = (UserAvatarImage) obj2;
        return Intrinsics.f(this.f60044a, userAvatarImage.f60044a) && Intrinsics.f(this.f60045b, userAvatarImage.f60045b) && Intrinsics.f(this.f60046c, userAvatarImage.f60046c);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF60046c() {
        return this.f60046c;
    }

    @Override // yy0.p
    /* JADX INFO: renamed from: h, reason: from getter */
    public final StylableContactImage$ContactStyle getF60045b() {
        return this.f60045b;
    }

    public final int hashCode() {
        UserNamePlaceholder userNamePlaceholder = this.f60044a;
        int iHashCode = (userNamePlaceholder == null ? 0 : userNamePlaceholder.hashCode()) * 31;
        StylableContactImage$ContactStyle stylableContactImage$ContactStyle = this.f60045b;
        int iHashCode2 = (iHashCode + (stylableContactImage$ContactStyle == null ? 0 : stylableContactImage$ContactStyle.hashCode())) * 31;
        Clause clause = this.f60046c;
        return iHashCode2 + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60044a, i);
        dest.writeParcelable(this.f60045b, i);
        dest.writeParcelable(this.f60046c, i);
    }

    public /* synthetic */ UserAvatarImage(UserNamePlaceholder userNamePlaceholder, StylableContactImage$Style stylableContactImage$Style, TextLocalisedClause textLocalisedClause, int i) {
        this(userNamePlaceholder, (i & 2) != 0 ? null : stylableContactImage$Style, (i & 4) != 0 ? null : textLocalisedClause);
    }
}
