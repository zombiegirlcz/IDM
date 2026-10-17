package org.jmrtd.cbeff;

import com.google.common.primitives.UnsignedBytes;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import net.sf.scuba.util.Hex;

/* JADX INFO: loaded from: classes14.dex */
public class StandardBiometricHeader implements Serializable {
    public static final int ISO_19794_FACE_IMAGE_FORMAT_TYPE_VALUE = 8;
    public static final int ISO_19794_FINGER_IMAGE_FORMAT_TYPE_VALUE = 7;
    public static final int ISO_19794_IRIS_IMAGE_FORMAT_TYPE_VALUE = 9;
    public static final int ISO_39794_FACE_IMAGE_FORMAT_TYPE_VALUE = 42;
    public static final int ISO_39794_FINGER_IMAGE_FORMAT_TYPE_VALUE = 40;
    public static final int ISO_39794_IRIS_IMAGE_FORMAT_TYPE_VALUE = 44;
    public static final int JTC1_SC37_FORMAT_OWNER_VALUE = 257;
    private static final long serialVersionUID = 4113147521594478513L;
    private SortedMap<Integer, byte[]> elements;

    public StandardBiometricHeader(Map<Integer, byte[]> map) {
        this.elements = new TreeMap(map);
    }

    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 != null && getClass() == obj2.getClass()) {
            return equals(this.elements, ((StandardBiometricHeader) obj2).elements);
        }
        return false;
    }

    public SortedMap<Integer, byte[]> getElements() {
        return new TreeMap((SortedMap) this.elements);
    }

    public boolean hasFormatType(int i) {
        byte[] bArr = this.elements.get(136);
        if (bArr != null && bArr.length == 2) {
            return ((bArr[1] & UnsignedBytes.MAX_VALUE) | ((bArr[0] & UnsignedBytes.MAX_VALUE) << 8)) == i;
        }
        return false;
    }

    public int hashCode() {
        SortedMap<Integer, byte[]> sortedMap = this.elements;
        return 31 + (sortedMap == null ? 0 : sortedMap.hashCode());
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("StandardBiometricHeader [");
        boolean z = true;
        for (Map.Entry<Integer, byte[]> entry : this.elements.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb6.append(", ");
            }
            sb6.append(Integer.toHexString(entry.getKey().intValue()));
            sb6.append(" -> ");
            sb6.append(Hex.bytesToHexString(entry.getValue()));
        }
        sb6.append("]");
        return sb6.toString();
    }

    private static boolean equals(Map<Integer, byte[]> map, Map<Integer, byte[]> map2) {
        if (map == null && map2 != null) {
            return false;
        }
        if (map != null && map2 == null) {
            return false;
        }
        if (map == map2) {
            return true;
        }
        if (!map.keySet().equals(map2.keySet())) {
            return false;
        }
        for (Map.Entry<Integer, byte[]> entry : map.entrySet()) {
            Integer key = entry.getKey();
            key.intValue();
            if (!Arrays.equals(entry.getValue(), map2.get(key))) {
                return false;
            }
        }
        return true;
    }
}
