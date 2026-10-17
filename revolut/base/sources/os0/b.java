package os0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f229214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f229215b;

    static {
        int[] iArr = new int[a.values().length];
        try {
            iArr[a.SMALL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[a.MEDIUM.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[a.PROFILE_AVATAR.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f229214a = iArr;
        int[] iArr2 = new int[dw0.a.values().length];
        try {
            iArr2[dw0.a.Alert.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[dw0.a.Awaiting.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[dw0.a.Bank.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[dw0.a.Boost.ordinal()] = 4;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr2[dw0.a.CalendarDate.ordinal()] = 5;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr2[dw0.a.Camera.ordinal()] = 6;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr2[dw0.a.Cancelled.ordinal()] = 7;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr2[dw0.a.Card.ordinal()] = 8;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr2[dw0.a.Checked.ordinal()] = 9;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr2[dw0.a.Cleaning.ordinal()] = 10;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr2[dw0.a.Contrast.ordinal()] = 11;
        } catch (NoSuchFieldError unused14) {
        }
        try {
            iArr2[dw0.a.Dislike.ordinal()] = 12;
        } catch (NoSuchFieldError unused15) {
        }
        try {
            iArr2[dw0.a.Edit.ordinal()] = 13;
        } catch (NoSuchFieldError unused16) {
        }
        try {
            iArr2[dw0.a.Error.ordinal()] = 14;
        } catch (NoSuchFieldError unused17) {
        }
        try {
            iArr2[dw0.a.Favourites.ordinal()] = 15;
        } catch (NoSuchFieldError unused18) {
        }
        try {
            iArr2[dw0.a.Frozen.ordinal()] = 16;
        } catch (NoSuchFieldError unused19) {
        }
        try {
            iArr2[dw0.a.Image.ordinal()] = 17;
        } catch (NoSuchFieldError unused20) {
        }
        try {
            iArr2[dw0.a.Income.ordinal()] = 18;
        } catch (NoSuchFieldError unused21) {
        }
        try {
            iArr2[dw0.a.Info.ordinal()] = 19;
        } catch (NoSuchFieldError unused22) {
        }
        try {
            iArr2[dw0.a.Like.ordinal()] = 20;
        } catch (NoSuchFieldError unused23) {
        }
        try {
            iArr2[dw0.a.Lightning.ordinal()] = 21;
        } catch (NoSuchFieldError unused24) {
        }
        try {
            iArr2[dw0.a.Link.ordinal()] = 22;
        } catch (NoSuchFieldError unused25) {
        }
        try {
            iArr2[dw0.a.Locked.ordinal()] = 23;
        } catch (NoSuchFieldError unused26) {
        }
        try {
            iArr2[dw0.a.Unlocked.ordinal()] = 24;
        } catch (NoSuchFieldError unused27) {
        }
        try {
            iArr2[dw0.a.NoBoost.ordinal()] = 25;
        } catch (NoSuchFieldError unused28) {
        }
        try {
            iArr2[dw0.a.OrderDownwards.ordinal()] = 26;
        } catch (NoSuchFieldError unused29) {
        }
        try {
            iArr2[dw0.a.OrderUpwards.ordinal()] = 27;
        } catch (NoSuchFieldError unused30) {
        }
        try {
            iArr2[dw0.a.Outgoing.ordinal()] = 28;
        } catch (NoSuchFieldError unused31) {
        }
        try {
            iArr2[dw0.a.Paused.ordinal()] = 29;
        } catch (NoSuchFieldError unused32) {
        }
        try {
            iArr2[dw0.a.Pending.ordinal()] = 30;
        } catch (NoSuchFieldError unused33) {
        }
        try {
            iArr2[dw0.a.Phone.ordinal()] = 31;
        } catch (NoSuchFieldError unused34) {
        }
        try {
            iArr2[dw0.a.Premium.ordinal()] = 32;
        } catch (NoSuchFieldError unused35) {
        }
        try {
            iArr2[dw0.a.Question.ordinal()] = 33;
        } catch (NoSuchFieldError unused36) {
        }
        try {
            iArr2[dw0.a.Recurring.ordinal()] = 34;
        } catch (NoSuchFieldError unused37) {
        }
        try {
            iArr2[dw0.a.Refund.ordinal()] = 35;
        } catch (NoSuchFieldError unused38) {
        }
        try {
            iArr2[dw0.a.Revert.ordinal()] = 36;
        } catch (NoSuchFieldError unused39) {
        }
        try {
            iArr2[dw0.a.Sending.ordinal()] = 37;
        } catch (NoSuchFieldError unused40) {
        }
        try {
            iArr2[dw0.a.Shield.ordinal()] = 38;
        } catch (NoSuchFieldError unused41) {
        }
        try {
            iArr2[dw0.a.SpareChange.ordinal()] = 39;
        } catch (NoSuchFieldError unused42) {
        }
        try {
            iArr2[dw0.a.Suspicious.ordinal()] = 40;
        } catch (NoSuchFieldError unused43) {
        }
        try {
            iArr2[dw0.a.TopUp.ordinal()] = 41;
        } catch (NoSuchFieldError unused44) {
        }
        try {
            iArr2[dw0.a.Wealth.ordinal()] = 42;
        } catch (NoSuchFieldError unused45) {
        }
        try {
            iArr2[dw0.a.Travel.ordinal()] = 43;
        } catch (NoSuchFieldError unused46) {
        }
        try {
            iArr2[dw0.a.Cashback.ordinal()] = 44;
        } catch (NoSuchFieldError unused47) {
        }
        try {
            iArr2[dw0.a.PriceTag.ordinal()] = 45;
        } catch (NoSuchFieldError unused48) {
        }
        try {
            iArr2[dw0.a.RevPoints.ordinal()] = 46;
        } catch (NoSuchFieldError unused49) {
        }
        try {
            iArr2[dw0.a.ArrowExchange.ordinal()] = 47;
        } catch (NoSuchFieldError unused50) {
        }
        try {
            iArr2[dw0.a.ArrowSplit.ordinal()] = 48;
        } catch (NoSuchFieldError unused51) {
        }
        try {
            iArr2[dw0.a.Fees.ordinal()] = 49;
        } catch (NoSuchFieldError unused52) {
        }
        try {
            iArr2[dw0.a.Merge.ordinal()] = 50;
        } catch (NoSuchFieldError unused53) {
        }
        try {
            iArr2[dw0.a.SymbolChange.ordinal()] = 51;
        } catch (NoSuchFieldError unused54) {
        }
        try {
            iArr2[dw0.a.Megaphone.ordinal()] = 52;
        } catch (NoSuchFieldError unused55) {
        }
        try {
            iArr2[dw0.a.Moon.ordinal()] = 53;
        } catch (NoSuchFieldError unused56) {
        }
        try {
            iArr2[dw0.a.More.ordinal()] = 54;
        } catch (NoSuchFieldError unused57) {
        }
        try {
            iArr2[dw0.a.Titan.ordinal()] = 55;
        } catch (NoSuchFieldError unused58) {
        }
        f229215b = iArr2;
    }
}
