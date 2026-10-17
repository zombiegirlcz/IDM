package bi;

import com.youTransactor.uCube.rpc.Constants;

/* JADX INFO: loaded from: classes17.dex */
public final class a extends e {
    @Override // bi.e
    public final int a(int i) {
        if (i <= 8) {
            return Constants.EMVTag.TAG_9C_TRANSACTION_TYPE;
        }
        return 155;
    }

    @Override // bi.e
    public final int c() {
        return 10;
    }
}
