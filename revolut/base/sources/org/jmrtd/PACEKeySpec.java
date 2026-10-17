package org.jmrtd;

import ehe.n;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import net.sf.scuba.util.Hex;
import org.jmrtd.protocol.PACEProtocol;
import v0.a;

/* JADX INFO: loaded from: classes14.dex */
public class PACEKeySpec implements AccessKeySpec {
    private static final long serialVersionUID = -7113246293247012560L;
    private byte[] key;
    private byte keyReference;

    public PACEKeySpec(String str, byte b4) {
        this(Util.getBytes(str), b4);
    }

    public static PACEKeySpec createCANKey(String str) {
        return new PACEKeySpec(str, (byte) 2);
    }

    public static PACEKeySpec createMRZKey(BACKeySpec bACKeySpec) throws GeneralSecurityException {
        return new PACEKeySpec(PACEProtocol.computeKeySeedForPACE(bACKeySpec), (byte) 1);
    }

    public static PACEKeySpec createPINKey(String str) {
        return new PACEKeySpec(str, (byte) 3);
    }

    public static PACEKeySpec createPUKKey(String str) {
        return new PACEKeySpec(str, (byte) 4);
    }

    private static String keyReferenceToString(byte b4) {
        return b4 != 0 ? b4 != 1 ? b4 != 2 ? b4 != 3 ? b4 != 4 ? Integer.toString(b4) : "PUK" : "PIN" : "CAN" : "MRZ" : "NO";
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        PACEKeySpec pACEKeySpec = (PACEKeySpec) obj2;
        return Arrays.equals(this.key, pACEKeySpec.key) && this.keyReference == pACEKeySpec.keyReference;
    }

    @Override // org.jmrtd.AccessKeySpec
    public String getAlgorithm() {
        return "PACE";
    }

    @Override // org.jmrtd.AccessKeySpec
    public byte[] getKey() {
        return this.key;
    }

    public byte getKeyReference() {
        return this.keyReference;
    }

    public int hashCode() {
        return n.b(31, 31, this.key) + this.keyReference;
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("PACEKeySpec [key: ");
        sb6.append(Hex.bytesToHexString(this.key));
        sb6.append(", keyReference: ");
        return a.i(sb6, keyReferenceToString(this.keyReference), "]");
    }

    public PACEKeySpec(byte[] bArr, byte b4) {
        this.keyReference = b4;
        this.key = bArr;
    }
}
