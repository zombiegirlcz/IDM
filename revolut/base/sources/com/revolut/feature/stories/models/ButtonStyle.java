package com.revolut.feature.stories.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.feature.stories.models.ButtonAction;
import com.revolut.retail.core.navigation.NaviCommand;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/ButtonStyle;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ButtonStyle implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ButtonStyle> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Clause f88755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ButtonAction f88756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a4e.a f88757c;
    public final Image d;
    public final boolean e;
    public final Parcelable f;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ButtonStyle((Clause) parcel.readParcelable(ButtonStyle.class.getClassLoader()), (ButtonAction) parcel.readParcelable(ButtonStyle.class.getClassLoader()), a4e.a.valueOf(parcel.readString()), (Image) parcel.readParcelable(ButtonStyle.class.getClassLoader()), parcel.readInt() != 0, parcel.readParcelable(ButtonStyle.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ButtonStyle[i];
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonStyle(TextLocalisedClause text, NaviCommand naviCommand, a4e.a viewStyle, AnalyticsContext analyticsContext) {
        this(text, naviCommand != null ? new ButtonAction.NavigationCommand(naviCommand) : ButtonAction.NoAction.f88754a, viewStyle, null, false, analyticsContext);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(viewStyle, "viewStyle");
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ButtonStyle)) {
            return false;
        }
        ButtonStyle buttonStyle = (ButtonStyle) obj2;
        return Intrinsics.f(this.f88755a, buttonStyle.f88755a) && Intrinsics.f(this.f88756b, buttonStyle.f88756b) && this.f88757c == buttonStyle.f88757c && Intrinsics.f(this.d, buttonStyle.d) && this.e == buttonStyle.e && Intrinsics.f(this.f, buttonStyle.f);
    }

    public final int hashCode() {
        int iHashCode = (this.f88757c.hashCode() + ((this.f88756b.hashCode() + (this.f88755a.hashCode() * 31)) * 31)) * 31;
        Image image = this.d;
        int iC = j6.a.c((iHashCode + (image == null ? 0 : image.hashCode())) * 31, 31, this.e);
        Parcelable parcelable = this.f;
        return iC + (parcelable != null ? parcelable.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f88755a, i);
        dest.writeParcelable(this.f88756b, i);
        dest.writeString(this.f88757c.name());
        dest.writeParcelable(this.d, i);
        dest.writeInt(this.e ? 1 : 0);
        dest.writeParcelable(this.f, i);
    }

    public ButtonStyle(Clause text, ButtonAction action, a4e.a viewStyle, Image image, boolean z, Parcelable parcelable) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(viewStyle, "viewStyle");
        this.f88755a = text;
        this.f88756b = action;
        this.f88757c = viewStyle;
        this.d = image;
        this.e = z;
        this.f = parcelable;
    }
}
