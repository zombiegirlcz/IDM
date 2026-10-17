package kz7;

import zw7.e0;

/* JADX INFO: loaded from: classes4.dex */
public abstract /* synthetic */ class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f191066a;

    static {
        int[] iArr = new int[e0.values().length];
        try {
            iArr[e0.PAYMENT_OVERDUE.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[e0.ADDRESS_CHANGE.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[e0.ADDRESS_NOT_SUPPORTED.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[e0.PURCHASE_REMINDER.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[e0.PET_PLAN_RENEWAL.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[e0.PET_PLAN_RENEWAL_OPTED_OUT.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f191066a = iArr;
    }
}
