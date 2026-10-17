package pkm;

/* JADX INFO: loaded from: classes14.dex */
public final class g {
    public static kotlin.time.d a(int i, long j2) {
        long j3 = i;
        long j5 = j3 / 1000000000;
        if ((j3 ^ 1000000000) < 0 && j5 * 1000000000 != j3) {
            j5--;
        }
        long j16 = j2 + j5;
        if ((j2 ^ j16) < 0 && (j5 ^ j2) >= 0) {
            if (j2 > 0) {
                kotlin.time.d.Companion.getClass();
                return kotlin.time.d.d;
            }
            kotlin.time.d.Companion.getClass();
            return kotlin.time.d.f187925c;
        }
        if (j16 < -31557014167219200L) {
            return kotlin.time.d.f187925c;
        }
        if (j16 > 31556889864403199L) {
            return kotlin.time.d.d;
        }
        long j22 = j3 % 1000000000;
        return new kotlin.time.d(j16, (int) (j22 + ((((j22 ^ 1000000000) & ((-j22) | j22)) >> 63) & 1000000000)));
    }
}
