package com.revolut.core.ui_kit.keyboard.api.style;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000 \u00022\u00020\u0001:\u0003\u0003\u0004\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/keyboard/api/style/UIKitKeyboardStyle;", "Landroid/os/Parcelable;", "Companion", "Gradient", "Transparent", "a", "Lcom/revolut/core/ui_kit/keyboard/api/style/UIKitKeyboardStyle$Gradient;", "Lcom/revolut/core/ui_kit/keyboard/api/style/UIKitKeyboardStyle$Transparent;", "ui_kit_keyboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface UIKitKeyboardStyle extends Parcelable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.f57723a;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/keyboard/api/style/UIKitKeyboardStyle$Gradient;", "Lcom/revolut/core/ui_kit/keyboard/api/style/UIKitKeyboardStyle;", "<init>", "()V", "ui_kit_keyboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Gradient implements UIKitKeyboardStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Gradient f57721a = new Gradient();

        @NotNull
        public static final Parcelable.Creator<Gradient> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Gradient.f57721a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Gradient[i];
            }
        }

        private Gradient() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/keyboard/api/style/UIKitKeyboardStyle$Transparent;", "Lcom/revolut/core/ui_kit/keyboard/api/style/UIKitKeyboardStyle;", "<init>", "()V", "ui_kit_keyboard_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Transparent implements UIKitKeyboardStyle {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Transparent f57722a = new Transparent();

        @NotNull
        public static final Parcelable.Creator<Transparent> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Transparent.f57722a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Transparent[i];
            }
        }

        private Transparent() {
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }
    }

    /* JADX INFO: renamed from: com.revolut.core.ui_kit.keyboard.api.style.UIKitKeyboardStyle$a, reason: from kotlin metadata */
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ Companion f57723a = new Companion();

        private Companion() {
        }
    }
}
