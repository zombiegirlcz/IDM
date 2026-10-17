package org.bouncycastle.crypto.params;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
public class ECCSIPrivateKeyParameters extends AsymmetricKeyParameter {
    private final ECCSIPublicKeyParameters pub;

    /* JADX INFO: renamed from: ssk, reason: collision with root package name */
    private final BigInteger f228501ssk;

    public ECCSIPrivateKeyParameters(BigInteger bigInteger, ECCSIPublicKeyParameters eCCSIPublicKeyParameters) {
        super(true);
        this.f228501ssk = bigInteger;
        this.pub = eCCSIPublicKeyParameters;
    }

    public ECCSIPublicKeyParameters getPublicKeyParameters() {
        return this.pub;
    }

    public BigInteger getSSK() {
        return this.f228501ssk;
    }
}
