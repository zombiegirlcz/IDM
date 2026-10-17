package qm4;

import mb5.u;
import mb5.v;

/* JADX INFO: loaded from: classes22.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f247773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f247774b;

    static {
        int[] iArr = new int[fl4.a.values().length];
        try {
            iArr[fl4.a.SCHEDULED.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[fl4.a.BACKUP_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[fl4.a.DIRECT_DEBIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[fl4.a.ACH.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        f247773a = iArr;
        int[] iArr2 = new int[fl4.b.values().length];
        try {
            iArr2[fl4.b.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[fl4.b.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused6) {
        }
        f247774b = iArr2;
        int[] iArr3 = new int[u.values().length];
        try {
            iArr3[u.SCHEDULED.ordinal()] = 1;
        } catch (NoSuchFieldError unused7) {
        }
        try {
            iArr3[u.BACKUP_CARD.ordinal()] = 2;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr3[u.DIRECT_DEBIT.ordinal()] = 3;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr3[u.ACH.ordinal()] = 4;
        } catch (NoSuchFieldError unused10) {
        }
        int[] iArr4 = new int[v.values().length];
        try {
            iArr4[v.ACTIVE.ordinal()] = 1;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[v.INACTIVE.ordinal()] = 2;
        } catch (NoSuchFieldError unused12) {
        }
    }
}
