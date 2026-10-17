package org.bouncycastle.crypto.agreement.ecjpake;

import java.math.BigInteger;
import java.security.SecureRandom;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.CryptoServicesRegistrar;
import org.bouncycastle.crypto.Digest;
import org.bouncycastle.crypto.digests.SHA256Digest;
import org.bouncycastle.math.ec.ECCurve;
import org.bouncycastle.math.ec.ECPoint;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Exceptions;

/* JADX INFO: loaded from: classes14.dex */
public class ECJPAKEParticipant {
    public static final int STATE_INITIALIZED = 0;
    public static final int STATE_KEY_CALCULATED = 50;
    public static final int STATE_ROUND_1_CREATED = 10;
    public static final int STATE_ROUND_1_VALIDATED = 20;
    public static final int STATE_ROUND_2_CREATED = 30;
    public static final int STATE_ROUND_2_VALIDATED = 40;
    public static final int STATE_ROUND_3_CREATED = 60;
    public static final int STATE_ROUND_3_VALIDATED = 70;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ECPoint f228259b;
    private final Digest digest;
    private ECCurve.AbstractFp ecCurve;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ECPoint f228260g;

    /* JADX INFO: renamed from: gx1, reason: collision with root package name */
    private ECPoint f228261gx1;

    /* JADX INFO: renamed from: gx2, reason: collision with root package name */
    private ECPoint f228262gx2;

    /* JADX INFO: renamed from: gx3, reason: collision with root package name */
    private ECPoint f228263gx3;

    /* JADX INFO: renamed from: gx4, reason: collision with root package name */
    private ECPoint f228264gx4;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private BigInteger f228265h;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private BigInteger f228266n;
    private final String participantId;
    private String partnerParticipantId;
    private char[] password;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private BigInteger f228267q;
    private final SecureRandom random;
    private int state;

    /* JADX INFO: renamed from: x1, reason: collision with root package name */
    private BigInteger f228268x1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private BigInteger f228269x2;

    public ECJPAKEParticipant(String str, char[] cArr) {
        this(str, cArr, ECJPAKECurves.NIST_P256);
    }

    private BigInteger calculateS() {
        try {
            return ECJPAKEUtil.calculateS(this.f228266n, this.password);
        } catch (CryptoException e) {
            throw Exceptions.illegalStateException(e.getMessage(), e);
        }
    }

    public BigInteger calculateKeyingMaterial() {
        int i = this.state;
        if (i >= 50) {
            throw new IllegalStateException("Key already calculated for " + this.participantId);
        }
        if (i < 40) {
            throw new IllegalStateException("Round2 payload must be validated prior to creating key for " + this.participantId);
        }
        BigInteger bigIntegerCalculateS = calculateS();
        Arrays.fill(this.password, (char) 0);
        this.password = null;
        BigInteger bigIntegerCalculateKeyingMaterial = ECJPAKEUtil.calculateKeyingMaterial(this.f228266n, this.f228264gx4, this.f228269x2, bigIntegerCalculateS, this.f228259b);
        this.f228268x1 = null;
        this.f228269x2 = null;
        this.f228259b = null;
        this.state = 50;
        return bigIntegerCalculateKeyingMaterial;
    }

    public ECJPAKERound1Payload createRound1PayloadToSend() {
        if (this.state >= 10) {
            throw new IllegalStateException("Round1 payload already created for " + this.participantId);
        }
        this.f228268x1 = ECJPAKEUtil.generateX1(this.f228266n, this.random);
        this.f228269x2 = ECJPAKEUtil.generateX1(this.f228266n, this.random);
        this.f228261gx1 = ECJPAKEUtil.calculateGx(this.f228260g, this.f228268x1);
        this.f228262gx2 = ECJPAKEUtil.calculateGx(this.f228260g, this.f228269x2);
        ECSchnorrZKP eCSchnorrZKPCalculateZeroKnowledgeProof = ECJPAKEUtil.calculateZeroKnowledgeProof(this.f228260g, this.f228266n, this.f228268x1, this.f228261gx1, this.digest, this.participantId, this.random);
        ECSchnorrZKP eCSchnorrZKPCalculateZeroKnowledgeProof2 = ECJPAKEUtil.calculateZeroKnowledgeProof(this.f228260g, this.f228266n, this.f228269x2, this.f228262gx2, this.digest, this.participantId, this.random);
        this.state = 10;
        return new ECJPAKERound1Payload(this.participantId, this.f228261gx1, this.f228262gx2, eCSchnorrZKPCalculateZeroKnowledgeProof, eCSchnorrZKPCalculateZeroKnowledgeProof2);
    }

    public ECJPAKERound2Payload createRound2PayloadToSend() {
        int i = this.state;
        if (i >= 30) {
            throw new IllegalStateException("Round2 payload already created for " + this.participantId);
        }
        if (i < 20) {
            throw new IllegalStateException("Round1 payload must be validated prior to creating Round2 payload for " + this.participantId);
        }
        ECPoint eCPointCalculateGA = ECJPAKEUtil.calculateGA(this.f228261gx1, this.f228263gx3, this.f228264gx4);
        BigInteger bigIntegerCalculateX2s = ECJPAKEUtil.calculateX2s(this.f228266n, this.f228269x2, calculateS());
        ECPoint eCPointCalculateA = ECJPAKEUtil.calculateA(eCPointCalculateGA, bigIntegerCalculateX2s);
        ECSchnorrZKP eCSchnorrZKPCalculateZeroKnowledgeProof = ECJPAKEUtil.calculateZeroKnowledgeProof(eCPointCalculateGA, this.f228266n, bigIntegerCalculateX2s, eCPointCalculateA, this.digest, this.participantId, this.random);
        this.state = 30;
        return new ECJPAKERound2Payload(this.participantId, eCPointCalculateA, eCSchnorrZKPCalculateZeroKnowledgeProof);
    }

    public ECJPAKERound3Payload createRound3PayloadToSend(BigInteger bigInteger) {
        int i = this.state;
        if (i >= 60) {
            throw new IllegalStateException("Round3 payload already created for " + this.participantId);
        }
        if (i >= 50) {
            BigInteger bigIntegerCalculateMacTag = ECJPAKEUtil.calculateMacTag(this.participantId, this.partnerParticipantId, this.f228261gx1, this.f228262gx2, this.f228263gx3, this.f228264gx4, bigInteger, this.digest);
            this.state = 60;
            return new ECJPAKERound3Payload(this.participantId, bigIntegerCalculateMacTag);
        }
        throw new IllegalStateException("Keying material must be calculated prior to creating Round3 payload for " + this.participantId);
    }

    public int getState() {
        return this.state;
    }

    public void validateRound1PayloadReceived(ECJPAKERound1Payload eCJPAKERound1Payload) throws CryptoException {
        if (this.state >= 20) {
            throw new IllegalStateException("Validation already attempted for round1 payload for" + this.participantId);
        }
        this.partnerParticipantId = eCJPAKERound1Payload.getParticipantId();
        this.f228263gx3 = eCJPAKERound1Payload.getGx1();
        this.f228264gx4 = eCJPAKERound1Payload.getGx2();
        ECSchnorrZKP knowledgeProofForX1 = eCJPAKERound1Payload.getKnowledgeProofForX1();
        ECSchnorrZKP knowledgeProofForX2 = eCJPAKERound1Payload.getKnowledgeProofForX2();
        ECJPAKEUtil.validateParticipantIdsDiffer(this.participantId, eCJPAKERound1Payload.getParticipantId());
        ECJPAKEUtil.validateZeroKnowledgeProof(this.f228260g, this.f228263gx3, knowledgeProofForX1, this.f228267q, this.f228266n, this.ecCurve, this.f228265h, eCJPAKERound1Payload.getParticipantId(), this.digest);
        ECJPAKEUtil.validateZeroKnowledgeProof(this.f228260g, this.f228264gx4, knowledgeProofForX2, this.f228267q, this.f228266n, this.ecCurve, this.f228265h, eCJPAKERound1Payload.getParticipantId(), this.digest);
        this.state = 20;
    }

    public void validateRound2PayloadReceived(ECJPAKERound2Payload eCJPAKERound2Payload) throws CryptoException {
        int i = this.state;
        if (i >= 40) {
            throw new IllegalStateException("Validation already attempted for round2 payload for" + this.participantId);
        }
        if (i < 20) {
            throw new IllegalStateException("Round1 payload must be validated prior to validating Round2 payload for " + this.participantId);
        }
        ECPoint eCPointCalculateGA = ECJPAKEUtil.calculateGA(this.f228263gx3, this.f228261gx1, this.f228262gx2);
        this.f228259b = eCJPAKERound2Payload.getA();
        ECSchnorrZKP knowledgeProofForX2s = eCJPAKERound2Payload.getKnowledgeProofForX2s();
        ECJPAKEUtil.validateParticipantIdsDiffer(this.participantId, eCJPAKERound2Payload.getParticipantId());
        ECJPAKEUtil.validateParticipantIdsEqual(this.partnerParticipantId, eCJPAKERound2Payload.getParticipantId());
        ECJPAKEUtil.validateZeroKnowledgeProof(eCPointCalculateGA, this.f228259b, knowledgeProofForX2s, this.f228267q, this.f228266n, this.ecCurve, this.f228265h, eCJPAKERound2Payload.getParticipantId(), this.digest);
        this.state = 40;
    }

    public void validateRound3PayloadReceived(ECJPAKERound3Payload eCJPAKERound3Payload, BigInteger bigInteger) throws CryptoException {
        int i = this.state;
        if (i >= 70) {
            throw new IllegalStateException("Validation already attempted for round3 payload for" + this.participantId);
        }
        if (i < 50) {
            throw new IllegalStateException("Keying material must be calculated validated prior to validating Round3 payload for " + this.participantId);
        }
        ECJPAKEUtil.validateParticipantIdsDiffer(this.participantId, eCJPAKERound3Payload.getParticipantId());
        ECJPAKEUtil.validateParticipantIdsEqual(this.partnerParticipantId, eCJPAKERound3Payload.getParticipantId());
        ECJPAKEUtil.validateMacTag(this.participantId, this.partnerParticipantId, this.f228261gx1, this.f228262gx2, this.f228263gx3, this.f228264gx4, bigInteger, this.digest, eCJPAKERound3Payload.getMacTag());
        this.f228261gx1 = null;
        this.f228262gx2 = null;
        this.f228263gx3 = null;
        this.f228264gx4 = null;
        this.state = 70;
    }

    public ECJPAKEParticipant(String str, char[] cArr, ECJPAKECurve eCJPAKECurve) {
        this(str, cArr, eCJPAKECurve, SHA256Digest.newInstance(), CryptoServicesRegistrar.getSecureRandom());
    }

    public ECJPAKEParticipant(String str, char[] cArr, ECJPAKECurve eCJPAKECurve, Digest digest, SecureRandom secureRandom) {
        ECJPAKEUtil.validateNotNull(str, "participantId");
        ECJPAKEUtil.validateNotNull(cArr, "password");
        ECJPAKEUtil.validateNotNull(eCJPAKECurve, "curve params");
        ECJPAKEUtil.validateNotNull(digest, "digest");
        ECJPAKEUtil.validateNotNull(secureRandom, "random");
        if (cArr.length == 0) {
            throw new IllegalArgumentException("Password must not be empty.");
        }
        this.participantId = str;
        this.password = Arrays.copyOf(cArr, cArr.length);
        this.ecCurve = eCJPAKECurve.getCurve();
        this.f228260g = eCJPAKECurve.getG();
        this.f228265h = eCJPAKECurve.getH();
        this.f228266n = eCJPAKECurve.getN();
        this.f228267q = eCJPAKECurve.getQ();
        this.digest = digest;
        this.random = secureRandom;
        this.state = 0;
    }
}
