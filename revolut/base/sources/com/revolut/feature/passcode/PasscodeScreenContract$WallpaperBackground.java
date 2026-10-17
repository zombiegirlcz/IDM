package com.revolut.feature.passcode;

import android.os.Parcel;
import android.os.Parcelable;
import com.revolut.feature.backgroundpicker.api.model.ThemedBackgroundKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"com/revolut/feature/passcode/PasscodeScreenContract$WallpaperBackground", "Landroid/os/Parcelable;", "<init>", "()V", "WithBackground", "Disabled", "Lcom/revolut/feature/passcode/PasscodeScreenContract$WallpaperBackground$Disabled;", "Lcom/revolut/feature/passcode/PasscodeScreenContract$WallpaperBackground$WithBackground;", "feature_passcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class PasscodeScreenContract$WallpaperBackground implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/feature/passcode/PasscodeScreenContract$WallpaperBackground$Disabled;", "Lcom/revolut/feature/passcode/PasscodeScreenContract$WallpaperBackground;", "<init>", "()V", "feature_passcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Disabled extends PasscodeScreenContract$WallpaperBackground {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Disabled f78630a = new Disabled();

        @NotNull
        public static final Parcelable.Creator<Disabled> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Disabled.f78630a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Disabled[i];
            }
        }

        private Disabled() {
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

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/passcode/PasscodeScreenContract$WallpaperBackground$WithBackground;", "Lcom/revolut/feature/passcode/PasscodeScreenContract$WallpaperBackground;", "", "toString", "()Ljava/lang/String;", "feature_passcode_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithBackground extends PasscodeScreenContract$WallpaperBackground {

        @NotNull
        public static final Parcelable.Creator<WithBackground> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ThemedBackgroundKey f78631a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new WithBackground((ThemedBackgroundKey) parcel.readParcelable(WithBackground.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new WithBackground[i];
            }
        }

        public WithBackground(ThemedBackgroundKey backgroundKey) {
            Intrinsics.checkNotNullParameter(backgroundKey, "backgroundKey");
            this.f78631a = backgroundKey;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof WithBackground) && Intrinsics.f(this.f78631a, ((WithBackground) obj2).f78631a);
        }

        public final int hashCode() {
            return this.f78631a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.f78631a, i);
        }
    }

    private PasscodeScreenContract$WallpaperBackground() {
    }
}
