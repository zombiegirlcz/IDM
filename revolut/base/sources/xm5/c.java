package xm5;

import km5.f;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f307092a;

    static {
        int[] iArr = new int[f.values().length];
        try {
            iArr[f.MESH.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[f.DATE_PLACE_OF_BIRTH.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[f.LEGAL_ENTITY_ID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        f307092a = iArr;
    }
}
