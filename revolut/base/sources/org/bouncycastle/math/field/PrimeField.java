package org.bouncycastle.math.field;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes14.dex */
class PrimeField implements FiniteField {
    protected final BigInteger characteristic;

    public PrimeField(BigInteger bigInteger) {
        this.characteristic = bigInteger;
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 instanceof PrimeField) {
            return this.characteristic.equals(((PrimeField) obj2).characteristic);
        }
        return false;
    }

    @Override // org.bouncycastle.math.field.FiniteField
    public BigInteger getCharacteristic() {
        return this.characteristic;
    }

    @Override // org.bouncycastle.math.field.FiniteField
    public int getDimension() {
        return 1;
    }

    public int hashCode() {
        return this.characteristic.hashCode();
    }
}
