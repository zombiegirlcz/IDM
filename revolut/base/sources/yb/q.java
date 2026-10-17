package yb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes16.dex */
public final class q extends c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f312127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f312128b;

    public q(byte[] bArr, byte[] bArr2) {
        this.f312127a = bArr;
        this.f312128b = bArr2;
    }

    public final boolean equals(Object obj2) {
        if (obj2 == this) {
            return true;
        }
        if (obj2 instanceof c0) {
            c0 c0Var = (c0) obj2;
            boolean z = c0Var instanceof q;
            q qVar = (q) c0Var;
            if (Arrays.equals(this.f312127a, z ? qVar.f312127a : qVar.f312127a)) {
                q qVar2 = (q) c0Var;
                if (Arrays.equals(this.f312128b, z ? qVar2.f312128b : qVar2.f312128b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((Arrays.hashCode(this.f312127a) ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f312128b);
    }

    public final String toString() {
        return "ExperimentIds{clearBlob=" + Arrays.toString(this.f312127a) + ", encryptedBlob=" + Arrays.toString(this.f312128b) + "}";
    }
}
