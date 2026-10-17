package org.bouncycastle.crypto.params;

import org.bouncycastle.crypto.KEMParameters;
import org.bouncycastle.crypto.kems.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes14.dex */
public class MLKEMParameters implements KEMParameters {
    private final int k;
    private final String name;
    public static final MLKEMParameters ml_kem_512 = new MLKEMParameters("ML-KEM-512", 2);
    public static final MLKEMParameters ml_kem_768 = new MLKEMParameters("ML-KEM-768", 3);
    public static final MLKEMParameters ml_kem_1024 = new MLKEMParameters("ML-KEM-1024", 4);

    private MLKEMParameters(String str, int i) {
        if (str == null) {
            throw new NullPointerException("'name' cannot be null");
        }
        this.name = str;
        this.k = i;
    }

    public int getEncapsulationLength() {
        return MLKEMEngine.getInstance(this).getCipherTextBytes();
    }

    public int getK() {
        return this.k;
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return 256;
    }
}
