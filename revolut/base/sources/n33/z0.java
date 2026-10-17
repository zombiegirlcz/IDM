package n33;

import com.revolut.feature.card_order_new.api.SelectedTab;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f211857a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f211858b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int[] f211859c;
    public static final /* synthetic */ int[] d;

    static {
        int[] iArr = new int[e13.a.values().length];
        try {
            iArr[e13.a.PHYSICAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e13.a.VIRTUAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e13.a.DISPOSABLE.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f211857a = iArr;
        int[] iArr2 = new int[wf8.b.values().length];
        try {
            iArr2[wf8.b.ADD_ACCOUNT_ITEM.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[wf8.b.ACCOUNT_ITEM.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        f211858b = iArr2;
        int[] iArr3 = new int[h93.l0.values().length];
        try {
            iArr3[h93.l0.INDIA_GLOBAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused6) {
        }
        try {
            iArr3[h93.l0.BRAZIL_GLOBAL.ordinal()] = 2;
        } catch (NoSuchFieldError unused7) {
        }
        f211859c = iArr3;
        int[] iArr4 = new int[SelectedTab.values().length];
        try {
            iArr4[SelectedTab.CREDIT.ordinal()] = 1;
        } catch (NoSuchFieldError unused8) {
        }
        try {
            iArr4[SelectedTab.DEBIT.ordinal()] = 2;
        } catch (NoSuchFieldError unused9) {
        }
        try {
            iArr4[SelectedTab.PAY_LATER.ordinal()] = 3;
        } catch (NoSuchFieldError unused10) {
        }
        try {
            iArr4[SelectedTab.FREELANCER.ordinal()] = 4;
        } catch (NoSuchFieldError unused11) {
        }
        try {
            iArr4[SelectedTab.JOINT.ordinal()] = 5;
        } catch (NoSuchFieldError unused12) {
        }
        try {
            iArr4[SelectedTab.JUNIOR.ordinal()] = 6;
        } catch (NoSuchFieldError unused13) {
        }
        try {
            iArr4[SelectedTab.CRYPTO.ordinal()] = 7;
        } catch (NoSuchFieldError unused14) {
        }
        d = iArr4;
    }
}
