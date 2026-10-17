package ci;

/* JADX INFO: loaded from: classes17.dex */
public abstract class f extends i {
    public static final int[] f = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[][] f24333g = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    public static String V(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb6 = new StringBuilder(12);
        sb6.append(str.charAt(0));
        char c2 = cArr[5];
        switch (c2) {
            case '0':
            case '1':
            case '2':
                sb6.append(cArr, 0, 2);
                sb6.append(c2);
                sb6.append("0000");
                sb6.append(cArr, 2, 3);
                break;
            case '3':
                sb6.append(cArr, 0, 3);
                sb6.append("00000");
                sb6.append(cArr, 3, 2);
                break;
            case '4':
                sb6.append(cArr, 0, 4);
                sb6.append("00000");
                sb6.append(cArr[4]);
                break;
            default:
                sb6.append(cArr, 0, 5);
                sb6.append("0000");
                sb6.append(c2);
                break;
        }
        if (str.length() >= 8) {
            sb6.append(str.charAt(7));
        }
        return sb6.toString();
    }
}
