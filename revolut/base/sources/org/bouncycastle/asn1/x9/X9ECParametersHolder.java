package org.bouncycastle.asn1.x9;

import org.bouncycastle.math.ec.ECCurve;

/* JADX INFO: loaded from: classes14.dex */
public abstract class X9ECParametersHolder {
    private ECCurve curve;
    private X9ECParameters params;

    public ECCurve createCurve() {
        return createParameters().getCurve();
    }

    public abstract X9ECParameters createParameters();

    public synchronized ECCurve getCurve() {
        try {
            if (this.curve == null) {
                this.curve = createCurve();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.curve;
    }

    public synchronized X9ECParameters getParameters() {
        try {
            if (this.params == null) {
                this.params = createParameters();
            }
        } catch (Throwable th10) {
            throw th10;
        }
        return this.params;
    }
}
