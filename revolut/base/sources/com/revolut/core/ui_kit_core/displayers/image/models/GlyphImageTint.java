package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.core.ui_kit_resources.R$attr;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000eÀ\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint;", "Landroid/os/Parcelable;", "ENVIRONMENTAL_GREEN", "STANDARD", "DANGER", "SUCCESS", "WARNING", "Custom", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$Custom;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$DANGER;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$ENVIRONMENTAL_GREEN;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$STANDARD;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$SUCCESS;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$WARNING;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface GlyphImageTint extends Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$Custom;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint;", "ConfirmationOfPayeeWarning", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$Custom$ConfirmationOfPayeeWarning;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface Custom extends GlyphImageTint {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$Custom$ConfirmationOfPayeeWarning;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$Custom;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class ConfirmationOfPayeeWarning implements Custom {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final ConfirmationOfPayeeWarning f59928a = new ConfirmationOfPayeeWarning();

            @NotNull
            public static final Parcelable.Creator<ConfirmationOfPayeeWarning> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return ConfirmationOfPayeeWarning.f59928a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new ConfirmationOfPayeeWarning[i];
                }
            }

            private ConfirmationOfPayeeWarning() {
            }

            public final int a() {
                return R$attr.uikit_colorBlue;
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
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$DANGER;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class DANGER implements GlyphImageTint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final DANGER f59929a = new DANGER();

        @NotNull
        public static final Parcelable.Creator<DANGER> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return DANGER.f59929a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new DANGER[i];
            }
        }

        private DANGER() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$ENVIRONMENTAL_GREEN;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class ENVIRONMENTAL_GREEN implements GlyphImageTint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final ENVIRONMENTAL_GREEN f59930a = new ENVIRONMENTAL_GREEN();

        @NotNull
        public static final Parcelable.Creator<ENVIRONMENTAL_GREEN> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ENVIRONMENTAL_GREEN.f59930a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ENVIRONMENTAL_GREEN[i];
            }
        }

        private ENVIRONMENTAL_GREEN() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$STANDARD;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class STANDARD implements GlyphImageTint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final STANDARD f59931a = new STANDARD();

        @NotNull
        public static final Parcelable.Creator<STANDARD> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return STANDARD.f59931a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new STANDARD[i];
            }
        }

        private STANDARD() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$SUCCESS;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class SUCCESS implements GlyphImageTint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final SUCCESS f59932a = new SUCCESS();

        @NotNull
        public static final Parcelable.Creator<SUCCESS> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return SUCCESS.f59932a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new SUCCESS[i];
            }
        }

        private SUCCESS() {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint$WARNING;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/GlyphImageTint;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class WARNING implements GlyphImageTint {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final WARNING f59933a = new WARNING();

        @NotNull
        public static final Parcelable.Creator<WARNING> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return WARNING.f59933a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WARNING[i];
            }
        }

        private WARNING() {
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
}
