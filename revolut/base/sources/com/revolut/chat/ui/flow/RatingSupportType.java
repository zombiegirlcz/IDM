package com.revolut.chat.ui.flow;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/chat/ui/flow/RatingSupportType;", "Landroid/os/Parcelable;", "", "CHAT", "CALL", "CALL_AND_CHAT", "chat_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RatingSupportType implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RatingSupportType[] $VALUES;
    public static final RatingSupportType CALL;
    public static final RatingSupportType CALL_AND_CHAT;
    public static final RatingSupportType CHAT;

    @NotNull
    public static final Parcelable.Creator<RatingSupportType> CREATOR;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return RatingSupportType.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new RatingSupportType[i];
        }
    }

    static {
        RatingSupportType ratingSupportType = new RatingSupportType("CHAT", 0);
        CHAT = ratingSupportType;
        RatingSupportType ratingSupportType2 = new RatingSupportType("CALL", 1);
        CALL = ratingSupportType2;
        RatingSupportType ratingSupportType3 = new RatingSupportType("CALL_AND_CHAT", 2);
        CALL_AND_CHAT = ratingSupportType3;
        RatingSupportType[] ratingSupportTypeArr = {ratingSupportType, ratingSupportType2, ratingSupportType3};
        $VALUES = ratingSupportTypeArr;
        $ENTRIES = s.n(ratingSupportTypeArr);
        CREATOR = new a();
    }

    public static RatingSupportType valueOf(String str) {
        return (RatingSupportType) Enum.valueOf(RatingSupportType.class, str);
    }

    public static RatingSupportType[] values() {
        return (RatingSupportType[]) $VALUES.clone();
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
