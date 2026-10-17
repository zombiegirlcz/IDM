package com.revolut.core.ui_kit_core.displayers.image.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder;", "Landroid/os/Parcelable;", "Default", "Animated", "PlaceholderSize", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$Animated;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$Default;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class UserNamePlaceholder implements Parcelable {

    /* JADX INFO: loaded from: classes20.dex */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$PlaceholderSize;", "Landroid/os/Parcelable;", "<init>", "()V", "Default", "OnLargePlaceholder", "Custom", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$PlaceholderSize$Custom;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$PlaceholderSize$Default;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$PlaceholderSize$OnLargePlaceholder;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class PlaceholderSize implements Parcelable {

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$PlaceholderSize$Custom;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$PlaceholderSize;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Custom extends PlaceholderSize {

            @NotNull
            public static final Parcelable.Creator<Custom> CREATOR = new a();

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final float f60051a;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Custom(parcel.readFloat());
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Custom[i];
                }
            }

            public Custom(float f) {
                this.f60051a = f;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final float getF60051a() {
                return this.f60051a;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                return (obj2 instanceof Custom) && Float.compare(this.f60051a, ((Custom) obj2).f60051a) == 0;
            }

            public final int hashCode() {
                return Float.hashCode(this.f60051a);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeFloat(this.f60051a);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$PlaceholderSize$Default;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$PlaceholderSize;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Default extends PlaceholderSize {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Default f60052a = new Default();

            @NotNull
            public static final Parcelable.Creator<Default> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return Default.f60052a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new Default[i];
                }
            }

            private Default() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof Default);
            }

            public final int hashCode() {
                return 1169877089;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$PlaceholderSize$OnLargePlaceholder;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$PlaceholderSize;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OnLargePlaceholder extends PlaceholderSize {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final OnLargePlaceholder f60053a = new OnLargePlaceholder();

            @NotNull
            public static final Parcelable.Creator<OnLargePlaceholder> CREATOR = new a();

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                public final Object createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    parcel.readInt();
                    return OnLargePlaceholder.f60053a;
                }

                @Override // android.os.Parcelable.Creator
                public final Object[] newArray(int i) {
                    return new OnLargePlaceholder[i];
                }
            }

            private OnLargePlaceholder() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj2) {
                return this == obj2 || (obj2 instanceof OnLargePlaceholder);
            }

            public final int hashCode() {
                return -819872489;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel dest, int i) {
                Intrinsics.checkNotNullParameter(dest, "dest");
                dest.writeInt(1);
            }
        }

        private PlaceholderSize() {
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$Animated;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Animated extends UserNamePlaceholder {

        @NotNull
        public static final Parcelable.Creator<Animated> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60047a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlaceholderSize f60048b;

        /* JADX INFO: loaded from: classes20.dex */
        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Animated(parcel.readString(), (PlaceholderSize) parcel.readParcelable(Animated.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Animated[i];
            }
        }

        public Animated(String userName, PlaceholderSize placeholderSize) {
            Intrinsics.checkNotNullParameter(userName, "userName");
            Intrinsics.checkNotNullParameter(placeholderSize, "placeholderSize");
            this.f60047a = userName;
            this.f60048b = placeholderSize;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Animated)) {
                return false;
            }
            Animated animated = (Animated) obj2;
            return Intrinsics.f(this.f60047a, animated.f60047a) && Intrinsics.f(this.f60048b, animated.f60048b);
        }

        public final int hashCode() {
            return this.f60048b.hashCode() + (this.f60047a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60047a);
            dest.writeParcelable(this.f60048b, i);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Animated(String userName) {
            this(userName, PlaceholderSize.Default.f60052a);
            Intrinsics.checkNotNullParameter(userName, "userName");
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder$Default;", "Lcom/revolut/core/ui_kit_core/displayers/image/models/UserNamePlaceholder;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default extends UserNamePlaceholder {

        @NotNull
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60049a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final PlaceholderSize f60050b;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Default(parcel.readString(), (PlaceholderSize) parcel.readParcelable(Default.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new Default[i];
            }
        }

        public Default(String userName, PlaceholderSize placeholderSize) {
            Intrinsics.checkNotNullParameter(userName, "userName");
            Intrinsics.checkNotNullParameter(placeholderSize, "placeholderSize");
            this.f60049a = userName;
            this.f60050b = placeholderSize;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof Default)) {
                return false;
            }
            Default r56 = (Default) obj2;
            return Intrinsics.f(this.f60049a, r56.f60049a) && Intrinsics.f(this.f60050b, r56.f60050b);
        }

        public final int hashCode() {
            return this.f60050b.hashCode() + (this.f60049a.hashCode() * 31);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60049a);
            dest.writeParcelable(this.f60050b, i);
        }

        public /* synthetic */ Default(String str) {
            this(str, PlaceholderSize.Default.f60052a);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public Default(String userName, int i) {
            this(userName, PlaceholderSize.Default.f60052a);
            Intrinsics.checkNotNullParameter(userName, "userName");
        }
    }
}
