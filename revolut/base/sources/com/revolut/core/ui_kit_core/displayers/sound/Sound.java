package com.revolut.core.ui_kit_core.displayers.sound;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/sound/Sound;", "Landroid/os/Parcelable;", "<init>", "()V", "ResourceSound", "UrlSound", "Lcom/revolut/core/ui_kit_core/displayers/sound/Sound$ResourceSound;", "Lcom/revolut/core/ui_kit_core/displayers/sound/Sound$UrlSound;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class Sound implements Parcelable {

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/sound/Sound$ResourceSound;", "Lcom/revolut/core/ui_kit_core/displayers/sound/Sound;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ResourceSound extends Sound {

        @NotNull
        public static final Parcelable.Creator<ResourceSound> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f60076a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new ResourceSound(parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new ResourceSound[i];
            }
        }

        public ResourceSound(int i) {
            this.f60076a = i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof ResourceSound) && this.f60076a == ((ResourceSound) obj2).f60076a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f60076a);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeInt(this.f60076a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/core/ui_kit_core/displayers/sound/Sound$UrlSound;", "Lcom/revolut/core/ui_kit_core/displayers/sound/Sound;", "", "toString", "()Ljava/lang/String;", "ui_kit_core_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UrlSound extends Sound {

        @NotNull
        public static final Parcelable.Creator<UrlSound> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f60077a;

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new UrlSound(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new UrlSound[i];
            }
        }

        public UrlSound(String url2) {
            Intrinsics.checkNotNullParameter(url2, "url");
            this.f60077a = url2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof UrlSound) && Intrinsics.f(this.f60077a, ((UrlSound) obj2).f60077a);
        }

        public final int hashCode() {
            return this.f60077a.hashCode();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int i) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.f60077a);
        }
    }

    private Sound() {
    }
}
