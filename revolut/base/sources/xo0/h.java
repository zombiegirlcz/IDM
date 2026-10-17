package xo0;

/* JADX INFO: loaded from: classes19.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307544a;

    static {
        int[] iArr = new int[g.values().length];
        try {
            iArr[g.INCOMING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[g.INCOMING_TAIL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[g.INCOMING_FIRST.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[g.INCOMING_MIDDLE.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[g.INCOMING_LAST.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[g.OUTGOING.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr[g.OUTGOING_TAIL.ordinal()] = 7;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr[g.OUTGOING_FIRST.ordinal()] = 8;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr[g.OUTGOING_MIDDLE.ordinal()] = 9;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr[g.OUTGOING_LAST.ordinal()] = 10;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr[g.INCOMING_UNCONTAINED.ordinal()] = 11;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr[g.OUTGOING_UNCONTAINED.ordinal()] = 12;
        } catch (NoSuchFieldError unused12) {
        }
        f307544a = iArr;
    }
}
