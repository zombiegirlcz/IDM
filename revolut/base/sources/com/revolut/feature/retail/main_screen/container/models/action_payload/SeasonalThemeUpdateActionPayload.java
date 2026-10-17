package com.revolut.feature.retail.main_screen.container.models.action_payload;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0001\u0006J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/revolut/feature/retail/main_screen/container/models/action_payload/SeasonalThemeUpdateActionPayload;", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "feature_retail_main_screen_container_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SeasonalThemeUpdateActionPayload implements Parcelable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f82759a;

    @NotNull
    public static final Parcelable.Creator<SeasonalThemeUpdateActionPayload> CREATOR = new b();

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new SeasonalThemeUpdateActionPayload(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new SeasonalThemeUpdateActionPayload[i];
        }
    }

    public SeasonalThemeUpdateActionPayload(String themeId) {
        Intrinsics.checkNotNullParameter(themeId, "themeId");
        this.f82759a = themeId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof SeasonalThemeUpdateActionPayload) && Intrinsics.f(this.f82759a, ((SeasonalThemeUpdateActionPayload) obj2).f82759a);
    }

    public final int hashCode() {
        return this.f82759a.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.f82759a);
    }
}
