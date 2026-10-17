package org.jmrtd.cbeff;

import java.io.IOException;
import java.io.OutputStream;
import org.jmrtd.cbeff.BiometricDataBlock;

/* JADX INFO: loaded from: classes14.dex */
public interface BiometricDataBlockEncoder<B extends BiometricDataBlock> {
    void encode(B b4, OutputStream outputStream) throws IOException;

    BiometricEncodingType getEncodingType();
}
