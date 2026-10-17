package com.revolut.core.ui_kit_core.displayers.haptic;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/haptic/Haptic;", "Landroid/os/Parcelable;", "<init>", "()V", "OneShot", "Effect", "Lcom/revolut/core/ui_kit_core/displayers/haptic/Haptic$Effect;", "Lcom/revolut/core/ui_kit_core/displayers/haptic/Haptic$OneShot;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Haptic implements Parcelable {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/haptic/Haptic$OneShot;", "Lcom/revolut/core/ui_kit_core/displayers/haptic/Haptic;", "<init>", "()V", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class OneShot extends Haptic {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final OneShot f59779a = new OneShot();

        @NotNull
        public static final Parcelable.Creator<OneShot> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return OneShot.f59779a;
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new OneShot[i];
            }
        }

        private OneShot() {
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

    private Haptic() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0005J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/haptic/Haptic$Effect;", "Lcom/revolut/core/ui_kit_core/displayers/haptic/Haptic;", "", "toString", "()Ljava/lang/String;", "com/revolut/core/ui_kit_core/displayers/haptic/c", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Effect extends Haptic {

        @NotNull
        public static final Parcelable.Creator<Effect> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c f59777a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f59778b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Effect(c.valueOf(parcel.readString()), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Effect[i];
            }
        }

        public Effect(c type, boolean z) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.f59777a = type;
            this.f59778b = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Effect)) {
                return false;
            }
            Effect effect = (Effect) obj2;
            return this.f59777a == effect.f59777a && this.f59778b == effect.f59778b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f59778b) + (this.f59777a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f59777a.name());
            dest.writeInt(this.f59778b ? 1 : 0);
        }

        public /* synthetic */ Effect(c cVar) {
            this(cVar, true);
        }
    }
}
