package androidx.media3.common.util;

/* JADX INFO: loaded from: classes15.dex */
public abstract class RepeatModeUtil {
    public static int getNextRepeatMode(int i, int i2) {
        for (int i3 = 1; i3 <= 2; i3++) {
            int i5 = (i + i3) % 3;
            if (isRepeatModeEnabled(i5, i2)) {
                return i5;
            }
        }
        return i;
    }

    public static boolean isRepeatModeEnabled(int i, int i2) {
        if (i != 0) {
            return i != 1 ? i == 2 && (i2 & 2) != 0 : (i2 & 1) != 0;
        }
        return true;
    }
}
