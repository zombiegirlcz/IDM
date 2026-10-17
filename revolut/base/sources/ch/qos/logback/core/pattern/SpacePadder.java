package ch.qos.logback.core.pattern;

/* JADX INFO: loaded from: classes16.dex */
public class SpacePadder {
    static final String[] SPACES = {" ", "  ", "    ", "        ", "                ", "                                "};

    public static final void leftPad(StringBuilder sb6, String str, int i) {
        int length = str != null ? str.length() : 0;
        if (length < i) {
            spacePad(sb6, i - length);
        }
        if (str != null) {
            sb6.append(str);
        }
    }

    public static final void rightPad(StringBuilder sb6, String str, int i) {
        int length = str != null ? str.length() : 0;
        if (str != null) {
            sb6.append(str);
        }
        if (length < i) {
            spacePad(sb6, i - length);
        }
    }

    public static final void spacePad(StringBuilder sb6, int i) {
        while (i >= 32) {
            sb6.append(SPACES[5]);
            i -= 32;
        }
        for (int i2 = 4; i2 >= 0; i2--) {
            if (((1 << i2) & i) != 0) {
                sb6.append(SPACES[i2]);
            }
        }
    }
}
