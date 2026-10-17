package ina;

import com.revolut.feature.profile.api.DocumentsPage;

/* JADX INFO: loaded from: classes5.dex */
public abstract /* synthetic */ class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f162768a;

    static {
        int[] iArr = new int[DocumentsPage.SavingsDocumentsType.values().length];
        try {
            iArr[DocumentsPage.SavingsDocumentsType.Personal.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[DocumentsPage.SavingsDocumentsType.Joint.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f162768a = iArr;
    }
}
