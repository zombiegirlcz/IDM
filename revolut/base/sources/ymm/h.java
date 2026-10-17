package ymm;

/* JADX INFO: loaded from: classes14.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f315067a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f315068b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f315069c;
    public static final String d;

    /* JADX WARN: Removed duplicated region for block: B:46:0x0091 A[PHI: r4
      0x0091: PHI (r4v29 java.lang.String) = (r4v0 java.lang.String), (r4v17 java.lang.String) binds: [B:45:0x008f, B:94:0x0115] A[DONT_GENERATE, DONT_INLINE]] */
    static {
        /*
            Method dump skipped, instruction units count: 769
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ymm.h.<clinit>():void");
    }

    public static void a(String str) {
        String str2 = f315067a;
        if (str2 == null) {
            return;
        }
        str2.startsWith(str);
    }

    public static void b(String str) {
        String str2;
        String str3 = f315069c;
        if (str3 == null || (str2 = d) == null || !str3.startsWith("Mac OS X") || g.d(str2)) {
            return;
        }
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = str2.split("\\.");
        for (int i = 0; i < Math.min(strArrSplit.length, strArrSplit2.length) && strArrSplit[i].equals(strArrSplit2[i]); i++) {
        }
    }

    public static void c(String str) {
        d(f315069c, str);
    }

    public static boolean d(String str, String str2) {
        if (str == null) {
            return false;
        }
        return str.startsWith(str2);
    }
}
