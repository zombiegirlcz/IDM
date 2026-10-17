package lbm;

import java.util.function.IntUnaryOperator;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class h implements IntUnaryOperator {
    @Override // java.util.function.IntUnaryOperator
    public final int applyAsInt(int i) {
        return i == 0 ? i : i - 1;
    }
}
