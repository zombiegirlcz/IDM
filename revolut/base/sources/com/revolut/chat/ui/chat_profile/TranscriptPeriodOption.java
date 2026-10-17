package com.revolut.chat.ui.chat_profile;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/revolut/chat/ui/chat_profile/TranscriptPeriodOption;", "Landroid/os/Parcelable;", "", "ALL_TIME", "CUSTOM", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TranscriptPeriodOption implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TranscriptPeriodOption[] $VALUES;
    public static final TranscriptPeriodOption ALL_TIME;

    @NotNull
    public static final Parcelable.Creator<TranscriptPeriodOption> CREATOR;
    public static final TranscriptPeriodOption CUSTOM;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return TranscriptPeriodOption.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new TranscriptPeriodOption[i];
        }
    }

    static {
        TranscriptPeriodOption transcriptPeriodOption = new TranscriptPeriodOption("ALL_TIME", 0);
        ALL_TIME = transcriptPeriodOption;
        TranscriptPeriodOption transcriptPeriodOption2 = new TranscriptPeriodOption("CUSTOM", 1);
        CUSTOM = transcriptPeriodOption2;
        TranscriptPeriodOption[] transcriptPeriodOptionArr = {transcriptPeriodOption, transcriptPeriodOption2};
        $VALUES = transcriptPeriodOptionArr;
        $ENTRIES = s.n(transcriptPeriodOptionArr);
        CREATOR = new a();
    }

    public static TranscriptPeriodOption valueOf(String str) {
        return (TranscriptPeriodOption) Enum.valueOf(TranscriptPeriodOption.class, str);
    }

    public static TranscriptPeriodOption[] values() {
        return (TranscriptPeriodOption[]) $VALUES.clone();
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
