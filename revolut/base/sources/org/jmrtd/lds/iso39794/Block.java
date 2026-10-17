package org.jmrtd.lds.iso39794;

import java.io.IOException;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.bouncycastle.asn1.ASN1Encodable;

/* JADX INFO: loaded from: classes14.dex */
abstract class Block implements Serializable {
    protected static final Logger LOGGER = Logger.getLogger("org.jmrtd.lds.iso39794");
    private static final long serialVersionUID = -8585852930916738115L;

    public abstract boolean equals(Object obj2);

    public abstract ASN1Encodable getASN1Object();

    public byte[] getEncoded() {
        try {
            return getASN1Object().toASN1Primitive().getEncoded("DER");
        } catch (IOException e) {
            LOGGER.log(Level.WARNING, "Error decoding", (Throwable) e);
            return null;
        }
    }

    public abstract int hashCode();
}
