package com.revolut.feature.uipersonalisation.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.models.Clause;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vjg.b;
import xjg.j;
import xjg.k;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/uipersonalisation/api/models/ColorThemeOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "xjg/k", "feature_shared_ui_personalisation_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ColorThemeOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<ColorThemeOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final j f94564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Clause f94565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final k f94566c;
    public final b d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ColorThemeOption(j.valueOf(parcel.readString()), (Clause) parcel.readParcelable(ColorThemeOption.class.getClassLoader()), k.valueOf(parcel.readString()), b.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ColorThemeOption[i];
        }
    }

    public ColorThemeOption(j colorTheme, Clause name, k visibilityMode, b confettiTinting) {
        Intrinsics.checkNotNullParameter(colorTheme, "colorTheme");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(visibilityMode, "visibilityMode");
        Intrinsics.checkNotNullParameter(confettiTinting, "confettiTinting");
        this.f94564a = colorTheme;
        this.f94565b = name;
        this.f94566c = visibilityMode;
        this.d = confettiTinting;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof ColorThemeOption)) {
            return false;
        }
        ColorThemeOption colorThemeOption = (ColorThemeOption) obj2;
        return this.f94564a == colorThemeOption.f94564a && Intrinsics.f(this.f94565b, colorThemeOption.f94565b) && this.f94566c == colorThemeOption.f94566c && this.d == colorThemeOption.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f94566c.hashCode() + p.a.a(this.f94564a.hashCode() * 31, 31, this.f94565b)) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f94564a.name());
        dest.writeParcelable(this.f94565b, i);
        dest.writeString(this.f94566c.name());
        dest.writeString(this.d.name());
    }

    public /* synthetic */ ColorThemeOption(j jVar, Clause clause, k kVar) {
        this(jVar, clause, kVar, b.ACCENT);
    }
}
