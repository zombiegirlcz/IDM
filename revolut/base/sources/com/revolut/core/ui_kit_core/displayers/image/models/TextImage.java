package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.revolut.core.ui.models.Color;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import ehe.n;
import ez0.g;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/TextImage;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextImage implements Image {

    @NotNull
    public static final Parcelable.Creator<TextImage> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CharSequence f60009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color f60010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Color f60011c;
    public final Color d;
    public final int e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final g f60012g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Clause f60013h;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new TextImage((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (Color) parcel.readParcelable(TextImage.class.getClassLoader()), (Color) parcel.readParcelable(TextImage.class.getClassLoader()), (Color) parcel.readParcelable(TextImage.class.getClassLoader()), parcel.readInt(), parcel.readInt(), g.valueOf(parcel.readString()), (Clause) parcel.readParcelable(TextImage.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TextImage[i];
        }
    }

    public TextImage(CharSequence text, Color textColor, Color backgroundColor, Color borderColor, int i, int i2, g backgroundType, Clause clause) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textColor, "textColor");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(borderColor, "borderColor");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f60009a = text;
        this.f60010b = textColor;
        this.f60011c = backgroundColor;
        this.d = borderColor;
        this.e = i;
        this.f = i2;
        this.f60012g = backgroundType;
        this.f60013h = clause;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof TextImage)) {
            return false;
        }
        TextImage textImage = (TextImage) obj2;
        return Intrinsics.f(this.f60009a, textImage.f60009a) && Intrinsics.f(this.f60010b, textImage.f60010b) && Intrinsics.f(this.f60011c, textImage.f60011c) && Intrinsics.f(this.d, textImage.d) && this.e == textImage.e && this.f == textImage.f && this.f60012g == textImage.f60012g && Intrinsics.f(this.f60013h, textImage.f60013h);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getD() {
        return this.f60013h;
    }

    public final int hashCode() {
        int iHashCode = (this.f60012g.hashCode() + j6.a.b(this.f, j6.a.b(this.e, n.d(this.d, n.d(this.f60011c, n.d(this.f60010b, this.f60009a.hashCode() * 31, 31), 31), 31), 31), 31)) * 31;
        Clause clause = this.f60013h;
        return iHashCode + (clause == null ? 0 : clause.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        TextUtils.writeToParcel(this.f60009a, dest, i);
        dest.writeParcelable(this.f60010b, i);
        dest.writeParcelable(this.f60011c, i);
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e);
        dest.writeInt(this.f);
        dest.writeString(this.f60012g.name());
        dest.writeParcelable(this.f60013h, i);
    }

    public /* synthetic */ TextImage(CharSequence charSequence, Color.Solid solid, Color.Solid solid2, Color.Solid solid3, int i, int i2, g gVar, TextLocalisedClause textLocalisedClause, int i3) {
        this(charSequence, solid, solid2, (i3 & 8) != 0 ? new Color.SolidInt(0) : solid3, i, i2, (i3 & 64) != 0 ? g.CIRCLE : gVar, (i3 & 128) != 0 ? null : textLocalisedClause);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TextImage(String text, int i, int i2, int i3, int i5, int i6, int i21) {
        i = (i21 & 2) != 0 ? -1 : i;
        i2 = (i21 & 4) != 0 ? 0 : i2;
        int i22 = (i21 & 8) == 0 ? i3 : 0;
        g backgroundType = g.CIRCLE;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this(text, new Color.SolidInt(i), new Color.SolidInt(i2), new Color.SolidInt(i22), i5, i6, backgroundType, null);
    }
}
