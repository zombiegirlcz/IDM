package com.revolut.feature.rev_points.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/rev_points/models/RevPointsPersonalisationPreferenceOption;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevPointsPersonalisationPreferenceOption implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<RevPointsPersonalisationPreferenceOption> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f84016a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f84017b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f84018c;
    public final boolean d;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new RevPointsPersonalisationPreferenceOption(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RevPointsPersonalisationPreferenceOption[i];
        }
    }

    public RevPointsPersonalisationPreferenceOption(String key, String title, String emoji, boolean z) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        this.f84016a = key;
        this.f84017b = title;
        this.f84018c = emoji;
        this.d = z;
    }

    public static RevPointsPersonalisationPreferenceOption a(RevPointsPersonalisationPreferenceOption revPointsPersonalisationPreferenceOption, boolean z) {
        String key = revPointsPersonalisationPreferenceOption.f84016a;
        String title = revPointsPersonalisationPreferenceOption.f84017b;
        String emoji = revPointsPersonalisationPreferenceOption.f84018c;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(emoji, "emoji");
        return new RevPointsPersonalisationPreferenceOption(key, title, emoji, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof RevPointsPersonalisationPreferenceOption)) {
            return false;
        }
        RevPointsPersonalisationPreferenceOption revPointsPersonalisationPreferenceOption = (RevPointsPersonalisationPreferenceOption) obj2;
        return Intrinsics.f(this.f84016a, revPointsPersonalisationPreferenceOption.f84016a) && Intrinsics.f(this.f84017b, revPointsPersonalisationPreferenceOption.f84017b) && Intrinsics.f(this.f84018c, revPointsPersonalisationPreferenceOption.f84018c) && this.d == revPointsPersonalisationPreferenceOption.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + p.a.c(p.a.c(this.f84016a.hashCode() * 31, 31, this.f84017b), 31, this.f84018c);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f84016a);
        dest.writeString(this.f84017b);
        dest.writeString(this.f84018c);
        dest.writeInt(this.d ? 1 : 0);
    }
}
