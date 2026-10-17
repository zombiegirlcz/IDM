package org.bouncycastle.pqc.crypto.mlkem;

import org.bouncycastle.pqc.crypto.KEMParameters;

/* JADX INFO: loaded from: classes14.dex */
@Deprecated
public class MLKEMParameters implements KEMParameters {
    private final MLKEMEngine engine;
    private final String name;
    public static final MLKEMParameters ml_kem_512 = new MLKEMParameters("ML-KEM-512", 2);
    public static final MLKEMParameters ml_kem_768 = new MLKEMParameters("ML-KEM-768", 3);
    public static final MLKEMParameters ml_kem_1024 = new MLKEMParameters("ML-KEM-1024", 4);

    private MLKEMParameters(String str, int i) {
        if (str == null) {
            throw new NullPointerException("'name' cannot be null");
        }
        this.name = str;
        this.engine = new MLKEMEngine(i);
    }

    public int getEncapsulationLength() {
        return this.engine.getCipherTextBytes();
    }

    public MLKEMEngine getEngine() {
        return this.engine;
    }

    public String getName() {
        return this.name;
    }

    public int getSessionKeySize() {
        return 256;
    }
}
