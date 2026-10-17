package com.revolut.retail.core.ui.activity;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit.R$style;
import com.revolut.core.ui_kit.background.AnimatedBackgroundType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/retail/core/ui/activity/CustomTheme;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "retail_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CustomTheme implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f98691a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AnimatedBackgroundType f98692b;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(0);

    @NotNull
    public static final Parcelable.Creator<CustomTheme> CREATOR = new b();

    /* JADX INFO: renamed from: com.revolut.retail.core.ui.activity.CustomTheme$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    public static final class Companion {
        private Companion() {
        }

        public static CustomTheme a(AnimatedBackgroundType backgroundType) {
            Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
            return new CustomTheme(R$style.UiKitTheme_TransparentNight, backgroundType);
        }

        public Companion(int i) {
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new CustomTheme(parcel.readInt(), (AnimatedBackgroundType) parcel.readParcelable(CustomTheme.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new CustomTheme[i];
        }
    }

    public CustomTheme(int i, AnimatedBackgroundType backgroundType) {
        Intrinsics.checkNotNullParameter(backgroundType, "backgroundType");
        this.f98691a = i;
        this.f98692b = backgroundType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof CustomTheme)) {
            return false;
        }
        CustomTheme customTheme = (CustomTheme) obj2;
        return this.f98691a == customTheme.f98691a && Intrinsics.f(this.f98692b, customTheme.f98692b);
    }

    public final int hashCode() {
        return this.f98692b.hashCode() + (Integer.hashCode(this.f98691a) * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f98691a);
        dest.writeParcelable(this.f98692b, i);
    }
}
