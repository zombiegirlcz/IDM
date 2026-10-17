package org.bouncycastle.jcajce.spec;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.AlgorithmParameterSpec;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class SM2KeyExchangeSpec implements AlgorithmParameterSpec {
    private final PrivateKey ephemeralPrivateKey;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final byte[] f228636id;
    private final boolean initiator;
    private final PublicKey otherPartyEphemeralKey;
    private final byte[] otherPartyId;

    public SM2KeyExchangeSpec(boolean z, PrivateKey privateKey, PublicKey publicKey, byte[] bArr, byte[] bArr2) {
        this.initiator = z;
        this.ephemeralPrivateKey = privateKey;
        this.otherPartyEphemeralKey = publicKey;
        this.f228636id = Arrays.clone(bArr);
        this.otherPartyId = Arrays.clone(bArr2);
    }

    public PrivateKey getEphemeralPrivateKey() {
        return this.ephemeralPrivateKey;
    }

    public byte[] getId() {
        return Arrays.clone(this.f228636id);
    }

    public PublicKey getOtherPartyEphemeralKey() {
        return this.otherPartyEphemeralKey;
    }

    public byte[] getOtherPartyId() {
        return Arrays.clone(this.otherPartyId);
    }

    public boolean isInitiator() {
        return this.initiator;
    }
}
