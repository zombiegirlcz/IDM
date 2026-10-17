package iog;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f163325a;

    static {
        int[] iArr = new int[m.values().length];
        try {
            iArr[m.RELATIONSHIP_FIELD_ID.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[m.FIRST_NAME_FIELD_ID.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            iArr[m.FIRST_SURNAME_FIELD_ID.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            iArr[m.SECOND_SURNAME_FIELD_ID.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
        try {
            iArr[m.DOCUMENT_TYPE_FIELD_ID.ordinal()] = 5;
        } catch (NoSuchFieldError unused5) {
        }
        try {
            iArr[m.DOCUMENT_NUMBER_FIELD_ID.ordinal()] = 6;
        } catch (NoSuchFieldError unused6) {
        }
        f163325a = iArr;
    }
}
