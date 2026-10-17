package oc3;

import ip0.yy;

/* JADX INFO: loaded from: classes21.dex */
public abstract /* synthetic */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f224056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int[] f224057b;

    static {
        int[] iArr = new int[q.values().length];
        try {
            iArr[q.LOADING.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[q.SEARCH_PLACEHOLDER_BUTTON.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[q.SEARCH_THIS_AREA_BUTTON.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f224056a = iArr;
        int[] iArr2 = new int[yy.values().length];
        try {
            iArr2[yy.ITEM_CLICK.ordinal()] = 1;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr2[yy.PRIMARY_ACTION_CLICK.ordinal()] = 2;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr2[yy.SECONDARY_ACTION_CLICK.ordinal()] = 3;
        } catch (NoSuchFieldError unused6) {
        }
        f224057b = iArr2;
    }
}
