package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui.models.Color;
import ehe.n;
import ez0.f;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/LottieColorOverride;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LottieColorOverride implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<LottieColorOverride> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f59952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color f59953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f59954c;
    public final Float d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new LottieColorOverride(parcel.createStringArrayList(), (Color) parcel.readParcelable(LottieColorOverride.class.getClassLoader()), f.valueOf(parcel.readString()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LottieColorOverride[i];
        }
    }

    public LottieColorOverride(List keyPath, Color color, f colorMode, Float f) {
        Intrinsics.checkNotNullParameter(keyPath, "keyPath");
        Intrinsics.checkNotNullParameter(color, "color");
        Intrinsics.checkNotNullParameter(colorMode, "colorMode");
        this.f59952a = keyPath;
        this.f59953b = color;
        this.f59954c = colorMode;
        this.d = f;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof LottieColorOverride)) {
            return false;
        }
        LottieColorOverride lottieColorOverride = (LottieColorOverride) obj2;
        return Intrinsics.f(this.f59952a, lottieColorOverride.f59952a) && Intrinsics.f(this.f59953b, lottieColorOverride.f59953b) && this.f59954c == lottieColorOverride.f59954c && Intrinsics.f(this.d, lottieColorOverride.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f59954c.hashCode() + n.d(this.f59953b, this.f59952a.hashCode() * 31, 31)) * 31;
        Float f = this.d;
        return iHashCode + (f == null ? 0 : f.hashCode());
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeStringList(this.f59952a);
        dest.writeParcelable(this.f59953b, i);
        dest.writeString(this.f59954c.name());
        Float f = this.d;
        if (f == null) {
            dest.writeInt(0);
        } else {
            r6.b.p(dest, 1, f);
        }
    }

    public /* synthetic */ LottieColorOverride(List list, Color color, f fVar, Float f, int i) {
        this(list, color, (i & 4) != 0 ? f.SIMPLE : fVar, (i & 8) != 0 ? null : f);
    }
}
