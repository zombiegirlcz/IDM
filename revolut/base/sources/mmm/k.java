package mmm;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes13.dex */
public interface k extends s0, ReadableByteChannel {
    h C5();

    int G2(f0 f0Var);

    byte[] H3();

    boolean J();

    long K9(h hVar);

    long M7(m mVar);

    short S2();

    void T7(h hVar, long j2);

    long W3(m mVar);

    InputStream Z9();

    boolean a(long j2);

    void b(long j2);

    m c(long j2);

    String e(long j2);

    h getBuffer();

    String m4(Charset charset);

    l0 peek();

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    void skip(long j2);

    int t9();

    m x4();

    boolean y3(long j2, m mVar);
}
