package org.ejbca.cvc;

import java.io.IOException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PublicKey;
import java.security.SignatureException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;

/* JADX INFO: loaded from: classes14.dex */
public class CardVerifiableCertificate extends Certificate {

    /* JADX INFO: renamed from: cvc, reason: collision with root package name */
    private CVCertificate f228962cvc;

    public CardVerifiableCertificate(CVCertificate cVCertificate) {
        super("CVC");
        this.f228962cvc = cVCertificate;
    }

    public CVCertificate getCVCertificate() {
        return this.f228962cvc;
    }

    @Override // java.security.cert.Certificate
    public byte[] getEncoded() throws CertificateEncodingException {
        try {
            return this.f228962cvc.getDEREncoded();
        } catch (IOException e) {
            throw new CertificateEncodingException(e);
        }
    }

    @Override // java.security.cert.Certificate
    public PublicKey getPublicKey() {
        try {
            return this.f228962cvc.getCertificateBody().getPublicKey();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // java.security.cert.Certificate
    public String toString() {
        return this.f228962cvc.toString();
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        verify(publicKey, "BC");
    }

    @Override // java.security.cert.Certificate
    public void verify(PublicKey publicKey, String str) throws NoSuchAlgorithmException, SignatureException, InvalidKeyException, CertificateException, NoSuchProviderException {
        this.f228962cvc.verify(publicKey, str);
    }
}
