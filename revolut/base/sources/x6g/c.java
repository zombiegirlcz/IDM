package x6g;

import m7g.j;
import o7g.d;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f303096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f303097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f303098c;

    static {
        int[] iArr = new int[j.values().length];
        try {
            iArr[j.ADULT.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[j.CHILD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[j.INFANT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[j.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f303096a = iArr;
        int[] iArr2 = new int[o7g.b.values().length];
        try {
            iArr2[o7g.b.BAGGAGE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[o7g.b.SEAT.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[o7g.b.UNKNOWN.ordinal()] = 3;
        } catch (NoSuchFieldError unused7) {
        }
        f303097b = iArr2;
        int[] iArr3 = new int[d.values().length];
        try {
            iArr3[d.PERSONAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[d.CABIN.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[d.CHECKED.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr3[d.UNKNOWN.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        f303098c = iArr3;
    }
}
