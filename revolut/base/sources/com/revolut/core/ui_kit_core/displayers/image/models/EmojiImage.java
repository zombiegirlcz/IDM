package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/EmojiImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EmojiImage implements Image {

    @NotNull
    public static final Parcelable.Creator<EmojiImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59914a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f59915b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f59916c;
    public final int d;
    public final Clause e;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new EmojiImage(parcel.readInt(), parcel.readInt(), parcel.readInt(), (Clause) parcel.readParcelable(EmojiImage.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new EmojiImage[i];
        }
    }

    public EmojiImage(int i, int i2, int i3, Clause clause, String emojiCode) {
        Intrinsics.checkNotNullParameter(emojiCode, "emojiCode");
        this.f59914a = emojiCode;
        this.f59915b = i;
        this.f59916c = i2;
        this.d = i3;
        this.e = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof EmojiImage)) {
            return false;
        }
        EmojiImage emojiImage = (EmojiImage) obj2;
        return Intrinsics.f(this.f59914a, emojiImage.f59914a) && this.f59915b == emojiImage.f59915b && this.f59916c == emojiImage.f59916c && this.d == emojiImage.d && Intrinsics.f(this.e, emojiImage.e);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getE() {
        return this.e;
    }

    public final int hashCode() {
        int iB = j6.a.b(this.d, j6.a.b(this.f59916c, j6.a.b(this.f59915b, this.f59914a.hashCode() * 31, 31), 31), 31);
        Clause clause = this.e;
        return iB + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59914a);
        dest.writeInt(this.f59915b);
        dest.writeInt(this.f59916c);
        dest.writeInt(this.d);
        dest.writeParcelable(this.e, i);
    }

    public /* synthetic */ EmojiImage(String str, int i, int i2) {
        this(i, i2, R$attr.uikit_colorTransparent, null, str);
    }
}
