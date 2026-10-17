package ymm;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f315055a = new byte[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f315056b = new Object[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String[] f315057c = new String[0];

    public static boolean a(Object[] objArr, Object obj2) {
        int i;
        if (objArr == null) {
            i = -1;
        } else if (obj2 == null) {
            i = 0;
            while (i < objArr.length) {
                if (objArr[i] == null) {
                    break;
                }
                i++;
            }
            i = -1;
        } else {
            for (int i2 = 0; i2 < objArr.length; i2++) {
                if (obj2.equals(objArr[i2])) {
                    i = i2;
                    break;
                }
            }
            i = -1;
        }
        return i != -1;
    }
}
