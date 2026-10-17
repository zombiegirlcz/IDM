package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_core.displayers.image.StylableContactImage$ContactStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import yy0.p;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/AvatarByUserIdImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lyy0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AvatarByUserIdImage implements Image, p {

    @NotNull
    public static final Parcelable.Creator<AvatarByUserIdImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f59842b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f59843c;
    public final boolean d;
    public final StylableContactImage$ContactStyle e;
    public final Clause f;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new AvatarByUserIdImage(parcel.readString(), parcel.readString(), parcel.readFloat(), parcel.readInt() != 0, (StylableContactImage$ContactStyle) parcel.readParcelable(AvatarByUserIdImage.class.getClassLoader()), (Clause) parcel.readParcelable(AvatarByUserIdImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AvatarByUserIdImage[i];
        }
    }

    public AvatarByUserIdImage(String userId, String userName, float f, boolean z, StylableContactImage$ContactStyle stylableContactImage$ContactStyle, Clause clause) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(userName, "userName");
        this.f59841a = userId;
        this.f59842b = userName;
        this.f59843c = f;
        this.d = z;
        this.e = stylableContactImage$ContactStyle;
        this.f = clause;
    }

    @Override // yy0.p
    public final Image a(StylableContactImage$ContactStyle stylableContactImage$ContactStyle) {
        String userId = this.f59841a;
        Intrinsics.checkNotNullParameter(userId, "userId");
        String userName = this.f59842b;
        Intrinsics.checkNotNullParameter(userName, "userName");
        return new AvatarByUserIdImage(userId, userName, this.f59843c, this.d, stylableContactImage$ContactStyle, this.f);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof AvatarByUserIdImage)) {
            return false;
        }
        AvatarByUserIdImage avatarByUserIdImage = (AvatarByUserIdImage) obj2;
        return Intrinsics.f(this.f59841a, avatarByUserIdImage.f59841a) && Intrinsics.f(this.f59842b, avatarByUserIdImage.f59842b) && Float.compare(this.f59843c, avatarByUserIdImage.f59843c) == 0 && this.d == avatarByUserIdImage.d && Intrinsics.f(this.e, avatarByUserIdImage.e) && Intrinsics.f(this.f, avatarByUserIdImage.f);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59910c() {
        return this.f;
    }

    @Override // yy0.p
    /* JADX INFO: renamed from: h, reason: from getter */
    public final StylableContactImage$ContactStyle getD() {
        return this.e;
    }

    public final int hashCode() {
        int iC = j6.a.c(m72.b.b(this.f59843c, p.a.c(this.f59841a.hashCode() * 31, 31, this.f59842b), 31), 31, this.d);
        StylableContactImage$ContactStyle stylableContactImage$ContactStyle = this.e;
        int iHashCode = (iC + (stylableContactImage$ContactStyle == null ? 0 : stylableContactImage$ContactStyle.hashCode())) * 31;
        Clause clause = this.f;
        return iHashCode + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59841a);
        dest.writeString(this.f59842b);
        dest.writeFloat(this.f59843c);
        dest.writeInt(this.d ? 1 : 0);
        dest.writeParcelable(this.e, i);
        dest.writeParcelable(this.f, i);
    }

    public /* synthetic */ AvatarByUserIdImage(String str, String str2, float f, StylableContactImage$ContactStyle stylableContactImage$ContactStyle, int i) {
        this(str, str2, f, false, (i & 16) != 0 ? null : stylableContactImage$ContactStyle, null);
    }
}
