package mmm;

import java.io.OutputStream;
import java.nio.channels.WritableByteChannel;

/* JADX INFO: loaded from: classes13.dex */
public interface j extends q0, WritableByteChannel {
    j I8(m mVar);

    j L5(int i);

    j N9(int i, int i2, byte[] bArr);

    long R8(s0 s0Var);

    OutputStream W9();

    @Override // mmm.q0, java.io.Flushable
    void flush();

    h getBuffer();

    j l3(long j2);

    j m9(int i, int i2, String str);

    j p0(String str);

    j write(byte[] bArr);

    j writeByte(int i);

    j writeInt(int i);

    j writeShort(int i);
}
