package org.jmrtd.cbeff;

import java.util.ArrayList;
import java.util.List;
import org.jmrtd.cbeff.BiometricDataBlock;

/* JADX INFO: loaded from: classes14.dex */
public class ComplexCBEFFInfo<R extends BiometricDataBlock> implements CBEFFInfo<R> {
    private List<CBEFFInfo<R>> subRecords = new ArrayList();

    public void add(CBEFFInfo<R> cBEFFInfo) {
        this.subRecords.add(cBEFFInfo);
    }

    public void addAll(List<CBEFFInfo<R>> list) {
        this.subRecords.addAll(list);
    }

    public boolean equals(Object obj2) {
        if (obj2 == null) {
            return false;
        }
        if (obj2 == this) {
            return true;
        }
        if (obj2.getClass().equals(ComplexCBEFFInfo.class)) {
            return this.subRecords.equals(((ComplexCBEFFInfo) obj2).getSubRecords());
        }
        return false;
    }

    public List<CBEFFInfo<R>> getSubRecords() {
        return new ArrayList(this.subRecords);
    }

    public int hashCode() {
        return (this.subRecords.hashCode() * 7) + 11;
    }

    public void remove(int i) {
        this.subRecords.remove(i);
    }
}
