package org.jmrtd.lds.iso39794;

import j6.a;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class DateTimeBlock extends Block {
    private static final long serialVersionUID = 2053705457048769663L;
    private int day;
    private int hour;
    private int millisecond;
    private int minute;
    private int month;
    private int second;
    private int year;

    public DateTimeBlock(int i, int i2, int i3, int i5, int i6, int i21, int i22) {
        this.year = i;
        this.month = i2;
        this.day = i3;
        this.hour = i5;
        this.minute = i6;
        this.second = i21;
        this.millisecond = i22;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        DateTimeBlock dateTimeBlock = (DateTimeBlock) obj2;
        return this.year == dateTimeBlock.year && this.month == dateTimeBlock.month && this.day == dateTimeBlock.day && this.hour == dateTimeBlock.hour && this.minute == dateTimeBlock.minute && this.second == dateTimeBlock.second && this.millisecond == dateTimeBlock.millisecond;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ASN1Util.encodeInt(this.year));
        if (this.month >= 0) {
            map.put(1, ASN1Util.encodeInt(this.month));
        }
        if (this.day >= 0) {
            map.put(2, ASN1Util.encodeInt(this.day));
        }
        if (this.hour >= 0) {
            map.put(3, ASN1Util.encodeInt(this.hour));
        }
        if (this.minute >= 0) {
            map.put(4, ASN1Util.encodeInt(this.minute));
        }
        if (this.second >= 0) {
            map.put(5, ASN1Util.encodeInt(this.second));
        }
        if (this.millisecond >= 0) {
            map.put(6, ASN1Util.encodeInt(this.millisecond));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    public int getDay() {
        return this.day;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public int getHour() {
        return this.hour;
    }

    public int getMillisecond() {
        return this.millisecond;
    }

    public int getMinute() {
        return this.minute;
    }

    public int getMonth() {
        return this.month;
    }

    public int getSecond() {
        return this.second;
    }

    public int getYear() {
        return this.year;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.day), Integer.valueOf(this.hour), Integer.valueOf(this.millisecond), Integer.valueOf(this.minute), Integer.valueOf(this.month), Integer.valueOf(this.second), Integer.valueOf(this.year));
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("DateTimeBlock [year: ");
        sb6.append(this.year);
        sb6.append(", month: ");
        sb6.append(this.month);
        sb6.append(", day: ");
        sb6.append(this.day);
        sb6.append(", hour: ");
        sb6.append(this.hour);
        sb6.append(", minute: ");
        sb6.append(this.minute);
        sb6.append(", second: ");
        sb6.append(this.second);
        sb6.append(", millisecond: ");
        return a.v(sb6, "]", this.millisecond);
    }

    public DateTimeBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.year = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
        this.month = mapDecodeTaggedObjects.containsKey(1) ? ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1)) : -1;
        this.day = mapDecodeTaggedObjects.containsKey(2) ? ASN1Util.decodeInt(mapDecodeTaggedObjects.get(2)) : -1;
        this.hour = mapDecodeTaggedObjects.containsKey(3) ? ASN1Util.decodeInt(mapDecodeTaggedObjects.get(3)) : -1;
        this.minute = mapDecodeTaggedObjects.containsKey(4) ? ASN1Util.decodeInt(mapDecodeTaggedObjects.get(4)) : -1;
        this.second = mapDecodeTaggedObjects.containsKey(5) ? ASN1Util.decodeInt(mapDecodeTaggedObjects.get(5)) : -1;
        this.millisecond = mapDecodeTaggedObjects.containsKey(6) ? ASN1Util.decodeInt(mapDecodeTaggedObjects.get(6)) : -1;
    }
}
