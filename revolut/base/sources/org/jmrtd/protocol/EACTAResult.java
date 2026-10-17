package org.jmrtd.protocol;

import ehe.n;
import java.io.Serializable;
import java.security.PrivateKey;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.scuba.util.Hex;
import org.jmrtd.Util;
import org.jmrtd.cert.CVCPrincipal;
import org.jmrtd.cert.CardVerifiableCertificate;

/* JADX INFO: loaded from: classes14.dex */
public class EACTAResult implements Serializable {
    private static final Logger LOGGER = Logger.getLogger("org.jmrtd");
    private static final long serialVersionUID = -2926063872890928748L;
    private CVCPrincipal caReference;
    private byte[] cardChallenge;
    private EACCAResult chipAuthenticationResult;
    private String documentNumber;
    private List<CardVerifiableCertificate> terminalCertificates = new ArrayList();
    private PrivateKey terminalKey;

    public EACTAResult(EACCAResult eACCAResult, CVCPrincipal cVCPrincipal, List<CardVerifiableCertificate> list, PrivateKey privateKey, String str, byte[] bArr) {
        this.chipAuthenticationResult = eACCAResult;
        this.caReference = cVCPrincipal;
        Iterator<CardVerifiableCertificate> it8 = list.iterator();
        while (it8.hasNext()) {
            this.terminalCertificates.add(it8.next());
        }
        this.terminalKey = privateKey;
        this.documentNumber = str;
        this.cardChallenge = bArr;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        EACTAResult eACTAResult = (EACTAResult) obj2;
        CVCPrincipal cVCPrincipal = this.caReference;
        if (cVCPrincipal == null) {
            if (eACTAResult.caReference != null) {
                return false;
            }
        } else if (!cVCPrincipal.equals(eACTAResult.caReference)) {
            return false;
        }
        if (!Arrays.equals(this.cardChallenge, eACTAResult.cardChallenge)) {
            return false;
        }
        EACCAResult eACCAResult = this.chipAuthenticationResult;
        if (eACCAResult == null) {
            if (eACTAResult.chipAuthenticationResult != null) {
                return false;
            }
        } else if (!eACCAResult.equals(eACTAResult.chipAuthenticationResult)) {
            return false;
        }
        String str = this.documentNumber;
        if (str == null) {
            if (eACTAResult.documentNumber != null) {
                return false;
            }
        } else if (!str.equals(eACTAResult.documentNumber)) {
            return false;
        }
        List<CardVerifiableCertificate> list = this.terminalCertificates;
        if (list == null) {
            if (eACTAResult.terminalCertificates != null) {
                return false;
            }
        } else if (!list.equals(eACTAResult.terminalCertificates)) {
            return false;
        }
        PrivateKey privateKey = this.terminalKey;
        return privateKey == null ? eACTAResult.terminalKey == null : privateKey.equals(eACTAResult.terminalKey);
    }

    public CVCPrincipal getCAReference() {
        return this.caReference;
    }

    public List<CardVerifiableCertificate> getCVCertificates() {
        return this.terminalCertificates;
    }

    public byte[] getCardChallenge() {
        return this.cardChallenge;
    }

    public EACCAResult getChipAuthenticationResult() {
        return this.chipAuthenticationResult;
    }

    public String getDocumentNumber() {
        return this.documentNumber;
    }

    public PrivateKey getTerminalKey() {
        return this.terminalKey;
    }

    public int hashCode() {
        CVCPrincipal cVCPrincipal = this.caReference;
        int iB = n.b(((cVCPrincipal == null ? 0 : cVCPrincipal.hashCode()) + 31) * 31, 31, this.cardChallenge);
        EACCAResult eACCAResult = this.chipAuthenticationResult;
        int iHashCode = (iB + (eACCAResult == null ? 0 : eACCAResult.hashCode())) * 31;
        String str = this.documentNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        List<CardVerifiableCertificate> list = this.terminalCertificates;
        int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        PrivateKey privateKey = this.terminalKey;
        return iHashCode3 + (privateKey != null ? privateKey.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder();
        sb6.append("TAResult [chipAuthenticationResult: " + this.chipAuthenticationResult);
        sb6.append(", ");
        sb6.append("caReference: " + this.caReference);
        sb6.append(", terminalCertificates: [");
        boolean z = true;
        for (CardVerifiableCertificate cardVerifiableCertificate : this.terminalCertificates) {
            if (z) {
                z = false;
            } else {
                sb6.append(", ");
            }
            sb6.append(toString(cardVerifiableCertificate));
        }
        sb6.append("terminalKey = ");
        sb6.append(Util.getDetailedPrivateKeyAlgorithm(this.terminalKey));
        sb6.append(", documentNumber = ");
        sb6.append(this.documentNumber);
        sb6.append(", cardChallenge = ");
        sb6.append(Hex.bytesToHexString(this.cardChallenge));
        sb6.append(", ]");
        return sb6.toString();
    }

    private Object toString(CardVerifiableCertificate cardVerifiableCertificate) {
        StringBuilder sb6 = new StringBuilder("CardVerifiableCertificate [");
        try {
            CVCPrincipal holderReference = cardVerifiableCertificate.getHolderReference();
            if (!this.caReference.equals(holderReference)) {
                sb6.append("holderReference: " + holderReference);
            }
        } catch (CertificateException e) {
            sb6.append("holderReference = ???");
            LOGGER.log(Level.WARNING, "Exception", (Throwable) e);
        }
        sb6.append("]");
        return sb6.toString();
    }
}
