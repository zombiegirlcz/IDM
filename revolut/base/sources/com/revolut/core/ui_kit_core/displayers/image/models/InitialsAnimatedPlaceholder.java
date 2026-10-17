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
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002J\u0010\u0010\u0004\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/InitialsAnimatedPlaceholder;", "Lcom/revolut/core/ui_kit_core/displayers/image/Image;", "Lyy0/p;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InitialsAnimatedPlaceholder implements Image, p {

    @NotNull
    public static final Parcelable.Creator<InitialsAnimatedPlaceholder> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f59934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f59935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f59936c;
    public final StylableContactImage$ContactStyle d;
    public final Clause e;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new InitialsAnimatedPlaceholder(parcel.readString(), parcel.readFloat(), parcel.readFloat(), (StylableContactImage$ContactStyle) parcel.readParcelable(InitialsAnimatedPlaceholder.class.getClassLoader()), (Clause) parcel.readParcelable(InitialsAnimatedPlaceholder.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InitialsAnimatedPlaceholder[i];
        }
    }

    public InitialsAnimatedPlaceholder(String initials, float f, float f4, StylableContactImage$ContactStyle stylableContactImage$ContactStyle, Clause clause) {
        Intrinsics.checkNotNullParameter(initials, "initials");
        this.f59934a = initials;
        this.f59935b = f;
        this.f59936c = f4;
        this.d = stylableContactImage$ContactStyle;
        this.e = clause;
    }

    @Override // yy0.p
    public final Image a(StylableContactImage$ContactStyle stylableContactImage$ContactStyle) {
        String initials = this.f59934a;
        Intrinsics.checkNotNullParameter(initials, "initials");
        return new InitialsAnimatedPlaceholder(initials, this.f59935b, this.f59936c, stylableContactImage$ContactStyle, this.e);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof InitialsAnimatedPlaceholder)) {
            return false;
        }
        InitialsAnimatedPlaceholder initialsAnimatedPlaceholder = (InitialsAnimatedPlaceholder) obj2;
        return Intrinsics.f(this.f59934a, initialsAnimatedPlaceholder.f59934a) && Float.compare(this.f59935b, initialsAnimatedPlaceholder.f59935b) == 0 && Float.compare(this.f59936c, initialsAnimatedPlaceholder.f59936c) == 0 && Intrinsics.f(this.d, initialsAnimatedPlaceholder.d) && Intrinsics.f(this.e, initialsAnimatedPlaceholder.e);
    }

    @Override // oy0.b
    /* JADX INFO: renamed from: getContentDescription, reason: from getter */
    public final Clause getF59810c() {
        return this.e;
    }

    @Override // yy0.p
    /* JADX INFO: renamed from: h, reason: from getter */
    public final StylableContactImage$ContactStyle getD() {
        return this.d;
    }

    public final int hashCode() {
        int iB = m72.b.b(this.f59936c, m72.b.b(this.f59935b, this.f59934a.hashCode() * 31, 31), 31);
        StylableContactImage$ContactStyle stylableContactImage$ContactStyle = this.d;
        int iHashCode = (iB + (stylableContactImage$ContactStyle == null ? 0 : stylableContactImage$ContactStyle.hashCode())) * 31;
        Clause clause = this.e;
        return iHashCode + (clause != null ? clause.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f59934a);
        dest.writeFloat(this.f59935b);
        dest.writeFloat(this.f59936c);
        dest.writeParcelable(this.d, i);
        dest.writeParcelable(this.e, i);
    }
}
