package w21;

import com.revolut.domain.models.openbanking.instructions.InstructionsDomain;

/* JADX INFO: loaded from: classes20.dex */
public abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int[] f293937a;

    static {
        int[] iArr = new int[InstructionsDomain.values().length];
        try {
            iArr[InstructionsDomain.AddMoneyLinked.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            iArr[InstructionsDomain.AddMoneyOneOff.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        f293937a = iArr;
    }
}
