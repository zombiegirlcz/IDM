package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeImageDrawable;", "Landroid/os/Parcelable;", "<init>", "()V", "Shimmering", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeImageDrawable$Shimmering;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class QrCodeImageDrawable implements Parcelable {

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeImageDrawable$Shimmering;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeImageDrawable;", "<init>", "()V", "Companion", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeImageDrawable$Shimmering$Companion;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class Shimmering extends QrCodeImageDrawable {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeImageDrawable$Shimmering$Companion;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/QrCodeImageDrawable$Shimmering;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion extends Shimmering {

            @NotNull
            public static final Parcelable.Creator<Companion> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Shimmering.INSTANCE;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Companion[i];
                }
            }

            private Companion() {
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

        private Shimmering() {
        }
    }

    private QrCodeImageDrawable() {
    }
}
