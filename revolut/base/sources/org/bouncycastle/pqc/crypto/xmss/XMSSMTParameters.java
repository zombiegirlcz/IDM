package org.bouncycastle.pqc.crypto.xmss;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.asn1.nist.NISTObjectIdentifiers;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.jcajce.provider.digest.a;
import org.bouncycastle.util.Integers;

/* JADX INFO: loaded from: classes14.dex */
public final class XMSSMTParameters {
    private static final Map<Integer, XMSSMTParameters> paramsLookupTable;
    private final int height;
    private final int layers;

    /* JADX INFO: renamed from: oid, reason: collision with root package name */
    private final XMSSOid f228893oid;
    private final XMSSParameters xmssParams;

    static {
        HashMap map = new HashMap();
        Integer numValueOf = Integers.valueOf(1);
        ASN1ObjectIdentifier aSN1ObjectIdentifier = NISTObjectIdentifiers.id_sha256;
        map.put(numValueOf, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier));
        a.t(20, 4, aSN1ObjectIdentifier, map, Integers.valueOf(2));
        a.t(40, 2, aSN1ObjectIdentifier, map, Integers.valueOf(3));
        a.t(40, 4, aSN1ObjectIdentifier, map, Integers.valueOf(4));
        a.t(40, 8, aSN1ObjectIdentifier, map, Integers.valueOf(5));
        a.t(60, 3, aSN1ObjectIdentifier, map, Integers.valueOf(6));
        a.t(60, 6, aSN1ObjectIdentifier, map, Integers.valueOf(7));
        a.t(60, 12, aSN1ObjectIdentifier, map, Integers.valueOf(8));
        Integer numValueOf2 = Integers.valueOf(9);
        ASN1ObjectIdentifier aSN1ObjectIdentifier2 = NISTObjectIdentifiers.id_sha512;
        map.put(numValueOf2, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier2));
        a.t(20, 4, aSN1ObjectIdentifier2, map, Integers.valueOf(10));
        a.t(40, 2, aSN1ObjectIdentifier2, map, Integers.valueOf(11));
        a.t(40, 4, aSN1ObjectIdentifier2, map, Integers.valueOf(12));
        a.t(40, 8, aSN1ObjectIdentifier2, map, Integers.valueOf(13));
        a.t(60, 3, aSN1ObjectIdentifier2, map, Integers.valueOf(14));
        a.t(60, 6, aSN1ObjectIdentifier2, map, Integers.valueOf(15));
        a.t(60, 12, aSN1ObjectIdentifier2, map, Integers.valueOf(16));
        Integer numValueOf3 = Integers.valueOf(17);
        ASN1ObjectIdentifier aSN1ObjectIdentifier3 = NISTObjectIdentifiers.id_shake128;
        map.put(numValueOf3, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier3));
        a.t(20, 4, aSN1ObjectIdentifier3, map, Integers.valueOf(18));
        a.t(40, 2, aSN1ObjectIdentifier3, map, Integers.valueOf(19));
        a.t(40, 4, aSN1ObjectIdentifier3, map, Integers.valueOf(20));
        a.t(40, 8, aSN1ObjectIdentifier3, map, Integers.valueOf(21));
        a.t(60, 3, aSN1ObjectIdentifier3, map, Integers.valueOf(22));
        a.t(60, 6, aSN1ObjectIdentifier3, map, Integers.valueOf(23));
        a.t(60, 12, aSN1ObjectIdentifier3, map, Integers.valueOf(24));
        Integer numValueOf4 = Integers.valueOf(25);
        ASN1ObjectIdentifier aSN1ObjectIdentifier4 = NISTObjectIdentifiers.id_shake256;
        map.put(numValueOf4, new XMSSMTParameters(20, 2, aSN1ObjectIdentifier4));
        a.t(20, 4, aSN1ObjectIdentifier4, map, Integers.valueOf(26));
        a.t(40, 2, aSN1ObjectIdentifier4, map, Integers.valueOf(27));
        a.t(40, 4, aSN1ObjectIdentifier4, map, Integers.valueOf(28));
        a.t(40, 8, aSN1ObjectIdentifier4, map, Integers.valueOf(29));
        a.t(60, 3, aSN1ObjectIdentifier4, map, Integers.valueOf(30));
        a.t(60, 6, aSN1ObjectIdentifier4, map, Integers.valueOf(31));
        a.t(60, 12, aSN1ObjectIdentifier4, map, Integers.valueOf(32));
        paramsLookupTable = Collections.unmodifiableMap(map);
    }

    public XMSSMTParameters(int i, int i2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        this.height = i;
        this.layers = i2;
        this.xmssParams = new XMSSParameters(xmssTreeHeight(i, i2), aSN1ObjectIdentifier);
        this.f228893oid = DefaultXMSSMTOid.lookup(getTreeDigest(), getTreeDigestSize(), getWinternitzParameter(), getLen(), getHeight(), i2);
    }

    public static XMSSMTParameters lookupByOID(int i) {
        return paramsLookupTable.get(Integers.valueOf(i));
    }

    private static int xmssTreeHeight(int i, int i2) throws IllegalArgumentException {
        if (i < 2) {
            throw new IllegalArgumentException("totalHeight must be > 1");
        }
        if (i % i2 != 0) {
            throw new IllegalArgumentException("layers must divide totalHeight without remainder");
        }
        int i3 = i / i2;
        if (i3 != 1) {
            return i3;
        }
        throw new IllegalArgumentException("height / layers must be greater than 1");
    }

    public int getHeight() {
        return this.height;
    }

    public int getLayers() {
        return this.layers;
    }

    public int getLen() {
        return this.xmssParams.getLen();
    }

    public XMSSOid getOid() {
        return this.f228893oid;
    }

    public String getTreeDigest() {
        return this.xmssParams.getTreeDigest();
    }

    public ASN1ObjectIdentifier getTreeDigestOID() {
        return this.xmssParams.getTreeDigestOID();
    }

    public int getTreeDigestSize() {
        return this.xmssParams.getTreeDigestSize();
    }

    public WOTSPlus getWOTSPlus() {
        return this.xmssParams.getWOTSPlus();
    }

    public int getWinternitzParameter() {
        return this.xmssParams.getWinternitzParameter();
    }

    public XMSSParameters getXMSSParameters() {
        return this.xmssParams;
    }

    public XMSSMTParameters(int i, int i2, Digest digest) {
        this(i, i2, DigestUtil.getDigestOID(digest.getAlgorithmName()));
    }
}
