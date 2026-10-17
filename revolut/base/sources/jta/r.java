package jta;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f178456a;

    static {
        int[] iArr = new int[bta.k.values().length];
        try {
            iArr[bta.k.UNREGISTERED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[bta.k.ACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[bta.k.DRAW_WINNER.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[bta.k.DRAW_LOSER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[bta.k.MISSED_DRAW.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[bta.k.REWARD_CLAIMED.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[bta.k.IN_DRAW.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[bta.k.UNKNOWN.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[bta.k.SUBSCRIBED.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[bta.k.NOT_AVAILABLE.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        f178456a = iArr;
    }
}
