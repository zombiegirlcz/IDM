package x5b;

import r5b.p;
import r5b.q;

/* JADX INFO: loaded from: classes6.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f302929a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f302930b;

    static {
        int[] iArr = new int[p.values().length];
        try {
            iArr[p.NONE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[p.FREEZE_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[p.TERMINATE_CARD.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[p.SCHEDULE_CARD_TERMINATION.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[p.DOWNGRADE_PLAN.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        f302929a = iArr;
        int[] iArr2 = new int[q.values().length];
        try {
            iArr2[q.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr2[q.DANGER.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f302930b = iArr2;
    }
}
