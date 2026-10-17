package com.revolut.core.ui_kit_core.displayers.image.transformation;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui.models.Color;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/transformation/CustomColors;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomColors implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<CustomColors> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Color f60060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Color f60061b;

    /* JADX INFO: loaded from: classes20.dex */
    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomColors((Color) parcel.readParcelable(CustomColors.class.getClassLoader()), (Color) parcel.readParcelable(CustomColors.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomColors[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CustomColors() {
        Color.Solid solid = null;
        this(3, solid, solid);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomColors)) {
            return false;
        }
        CustomColors customColors = (CustomColors) obj2;
        return Intrinsics.f(this.f60060a, customColors.f60060a) && Intrinsics.f(this.f60061b, customColors.f60061b);
    }

    public final int hashCode() {
        Color color = this.f60060a;
        int iHashCode = (color == null ? 0 : color.hashCode()) * 31;
        Color color2 = this.f60061b;
        return iHashCode + (color2 != null ? color2.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f60060a, i);
        dest.writeParcelable(this.f60061b, i);
    }

    public CustomColors(Color color, Color color2) {
        this.f60060a = color;
        this.f60061b = color2;
    }

    public /* synthetic */ CustomColors(int i, Color.Solid solid, Color color) {
        this((i & 1) != 0 ? null : solid, (i & 2) != 0 ? null : color);
    }
}
