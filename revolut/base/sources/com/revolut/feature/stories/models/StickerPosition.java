package com.revolut.feature.stories.models;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/feature/stories/models/StickerPosition;", "Landroid/os/Parcelable;", "", "TOP", "CENTER", "framework_stories_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StickerPosition implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StickerPosition[] $VALUES;
    public static final StickerPosition CENTER;

    @NotNull
    public static final Parcelable.Creator<StickerPosition> CREATOR;
    public static final StickerPosition TOP;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return StickerPosition.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new StickerPosition[i];
        }
    }

    static {
        StickerPosition stickerPosition = new StickerPosition("TOP", 0);
        TOP = stickerPosition;
        StickerPosition stickerPosition2 = new StickerPosition("CENTER", 1);
        CENTER = stickerPosition2;
        StickerPosition[] stickerPositionArr = {stickerPosition, stickerPosition2};
        $VALUES = stickerPositionArr;
        $ENTRIES = s.n(stickerPositionArr);
        CREATOR = new a();
    }

    public static StickerPosition valueOf(String str) {
        return (StickerPosition) Enum.valueOf(StickerPosition.class, str);
    }

    public static StickerPosition[] values() {
        return (StickerPosition[]) $VALUES.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(name());
    }
}
