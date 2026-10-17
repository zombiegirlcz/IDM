package com.revolut.shared.cards.model.card_config.domain;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/shared/cards/model/card_config/domain/VideoBackground;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "cards_shared_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoBackground implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<VideoBackground> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104710a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104711b;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new VideoBackground(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VideoBackground[i];
        }
    }

    public VideoBackground(String light, String dark) {
        Intrinsics.checkNotNullParameter(light, "light");
        Intrinsics.checkNotNullParameter(dark, "dark");
        this.f104710a = light;
        this.f104711b = dark;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof VideoBackground)) {
            return false;
        }
        VideoBackground videoBackground = (VideoBackground) obj2;
        return Intrinsics.f(this.f104710a, videoBackground.f104710a) && Intrinsics.f(this.f104711b, videoBackground.f104711b);
    }

    public final int hashCode() {
        return this.f104711b.hashCode() + (this.f104710a.hashCode() * 31);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f104710a);
        dest.writeString(this.f104711b);
    }
}
