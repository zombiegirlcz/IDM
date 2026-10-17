package com.revolut.feature.card_screen.impl.kompot.cards_carousel;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import vc.s;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \u00032\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/revolut/feature/card_screen/impl/kompot/cards_carousel/WalletTokenizationState;", "Landroid/os/Parcelable;", "", "Companion", "a", "APPLE_ONLY", "GOOGLE_ONLY", "APPLE_GOOGLE", "APPLE_OTHER", "GOOGLE_OTHER", "APPLE_GOOGLE_OTHER", "NONE", "feature_card_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class WalletTokenizationState implements Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WalletTokenizationState[] $VALUES;
    public static final WalletTokenizationState APPLE_GOOGLE;
    public static final WalletTokenizationState APPLE_GOOGLE_OTHER;
    public static final WalletTokenizationState APPLE_ONLY;
    public static final WalletTokenizationState APPLE_OTHER;

    @NotNull
    public static final Parcelable.Creator<WalletTokenizationState> CREATOR;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final WalletTokenizationState GOOGLE_ONLY;
    public static final WalletTokenizationState GOOGLE_OTHER;
    public static final WalletTokenizationState NONE;

    /* JADX INFO: renamed from: com.revolut.feature.card_screen.impl.kompot.cards_carousel.WalletTokenizationState$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }
    }

    public static final class b implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return WalletTokenizationState.valueOf(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WalletTokenizationState[i];
        }
    }

    static {
        WalletTokenizationState walletTokenizationState = new WalletTokenizationState("APPLE_ONLY", 0);
        APPLE_ONLY = walletTokenizationState;
        WalletTokenizationState walletTokenizationState2 = new WalletTokenizationState("GOOGLE_ONLY", 1);
        GOOGLE_ONLY = walletTokenizationState2;
        WalletTokenizationState walletTokenizationState3 = new WalletTokenizationState("APPLE_GOOGLE", 2);
        APPLE_GOOGLE = walletTokenizationState3;
        WalletTokenizationState walletTokenizationState4 = new WalletTokenizationState("APPLE_OTHER", 3);
        APPLE_OTHER = walletTokenizationState4;
        WalletTokenizationState walletTokenizationState5 = new WalletTokenizationState("GOOGLE_OTHER", 4);
        GOOGLE_OTHER = walletTokenizationState5;
        WalletTokenizationState walletTokenizationState6 = new WalletTokenizationState("APPLE_GOOGLE_OTHER", 5);
        APPLE_GOOGLE_OTHER = walletTokenizationState6;
        WalletTokenizationState walletTokenizationState7 = new WalletTokenizationState("NONE", 6);
        NONE = walletTokenizationState7;
        WalletTokenizationState[] walletTokenizationStateArr = {walletTokenizationState, walletTokenizationState2, walletTokenizationState3, walletTokenizationState4, walletTokenizationState5, walletTokenizationState6, walletTokenizationState7};
        $VALUES = walletTokenizationStateArr;
        $ENTRIES = s.n(walletTokenizationStateArr);
        INSTANCE = new Companion();
        CREATOR = new b();
    }

    public static WalletTokenizationState valueOf(String str) {
        return (WalletTokenizationState) Enum.valueOf(WalletTokenizationState.class, str);
    }

    public static WalletTokenizationState[] values() {
        return (WalletTokenizationState[]) $VALUES.clone();
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
