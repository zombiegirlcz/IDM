package nb5;

import mb5.j;
import mb5.v;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f213985a;

    static {
        int[] iArr = new int[e.values().length];
        try {
            iArr[e.BACKUP_CARD.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e.DIRECT_DEBIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e.REVOLUT_POCKET.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f213985a = iArr;
        int[] iArr2 = new int[d.values().length];
        try {
            iArr2[d.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[d.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        int[] iArr3 = new int[v.values().length];
        try {
            iArr3[v.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[v.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        int[] iArr4 = new int[j.values().length];
        try {
            iArr4[j.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[j.FAILED.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[j.PENDING.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[j.CANCELED.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[j.DISABLED.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
