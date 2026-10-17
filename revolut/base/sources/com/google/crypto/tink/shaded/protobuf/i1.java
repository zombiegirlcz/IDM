package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: loaded from: classes17.dex */
public abstract class i1 {
    public abstract j1 a(Object obj2);

    public final boolean b(Object obj2, m mVar) throws InvalidProtocolBufferException {
        int i = mVar.f49386b;
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            mVar.v(0);
            ((j1) obj2).d(i2 << 3, Long.valueOf(mVar.f49385a.v()));
            return true;
        }
        if (i3 == 1) {
            mVar.v(1);
            ((j1) obj2).d((i2 << 3) | 1, Long.valueOf(mVar.f49385a.s()));
            return true;
        }
        if (i3 == 2) {
            ((j1) obj2).d((i2 << 3) | 2, mVar.e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw InvalidProtocolBufferException.c();
            }
            mVar.v(5);
            ((j1) obj2).d((i2 << 3) | 5, Integer.valueOf(mVar.f49385a.r()));
            return true;
        }
        j1 j1VarC = j1.c();
        int i5 = i2 << 3;
        int i6 = i5 | 4;
        while (mVar.a() != Integer.MAX_VALUE && b(j1VarC, mVar)) {
        }
        if (i6 != mVar.f49386b) {
            throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
        }
        j1VarC.e = false;
        ((j1) obj2).d(i5 | 3, j1VarC);
        return true;
    }
}
