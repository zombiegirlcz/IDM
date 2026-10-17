package com.revolut.feature.apm.core.models.payments_authorisations;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/revolut/feature/apm/core/models/payments_authorisations/InitiationChannel;", "Landroid/os/Parcelable;", "", "RSM", "QR", "REDIRECTION", "feature_apm_core_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class InitiationChannel implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InitiationChannel[] $VALUES;

    @NotNull
    public static final Parcelable.Creator<InitiationChannel> CREATOR;
    public static final InitiationChannel QR;
    public static final InitiationChannel REDIRECTION;
    public static final InitiationChannel RSM;

    public static final class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return InitiationChannel.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new InitiationChannel[i];
        }
    }

    static {
        InitiationChannel initiationChannel = new InitiationChannel("RSM", 0);
        RSM = initiationChannel;
        InitiationChannel initiationChannel2 = new InitiationChannel("QR", 1);
        QR = initiationChannel2;
        InitiationChannel initiationChannel3 = new InitiationChannel("REDIRECTION", 2);
        REDIRECTION = initiationChannel3;
        InitiationChannel[] initiationChannelArr = {initiationChannel, initiationChannel2, initiationChannel3};
        $VALUES = initiationChannelArr;
        $ENTRIES = s.n(initiationChannelArr);
        CREATOR = new a();
    }

    public static InitiationChannel valueOf(String str) {
        return (InitiationChannel) Enum.valueOf(InitiationChannel.class, str);
    }

    public static InitiationChannel[] values() {
        return (InitiationChannel[]) $VALUES.clone();
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
