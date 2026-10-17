package com.revolut.core.ui_kit.internal.views;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/RingShape;", "Landroid/os/Parcelable;", "Full", "Timer", "Lcom/revolut/core/ui_kit/internal/views/RingShape$Full;", "Lcom/revolut/core/ui_kit/internal/views/RingShape$Timer;", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface RingShape extends Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/RingShape$Full;", "Lcom/revolut/core/ui_kit/internal/views/RingShape;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Full implements RingShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Full f56369a = new Full();

        @NotNull
        public static final Parcelable.Creator<Full> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Full.f56369a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Full[i];
            }
        }

        private Full() {
        }

        @Override // com.revolut.core.ui_kit.internal.views.RingShape
        public final float a8() {
            return 360.0f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.core.ui_kit.internal.views.RingShape
        public final float j3(int i) {
            return -90.0f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        @Override // com.revolut.core.ui_kit.internal.views.RingShape
        public final boolean x6() {
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit/internal/views/RingShape$Timer;", "Lcom/revolut/core/ui_kit/internal/views/RingShape;", "<init>", "()V", "ui_kit_components_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Timer implements RingShape {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Timer f56370a = new Timer();

        @NotNull
        public static final Parcelable.Creator<Timer> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Timer.f56370a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Timer[i];
            }
        }

        private Timer() {
        }

        @Override // com.revolut.core.ui_kit.internal.views.RingShape
        public final float a8() {
            return 280.0f;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.revolut.core.ui_kit.internal.views.RingShape
        public final float j3(int i) {
            return i == 1 ? 50.0f : 130.0f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(1);
        }

        @Override // com.revolut.core.ui_kit.internal.views.RingShape
        public final boolean x6() {
            return true;
        }
    }

    float a8();

    float j3(int i);

    boolean x6();
}
