package org.bouncycastle.oer.its.ieee1609dot2.basetypes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Object;
import org.bouncycastle.asn1.ASN1Primitive;
import org.bouncycastle.asn1.ASN1Sequence;
import org.bouncycastle.oer.its.ItsUtils;

/* JADX INFO: loaded from: classes14.dex */
public class PolygonalRegion extends ASN1Object implements RegionInterface {
    private final List<TwoDLocation> twoDLocations;

    public static class Builder {
        private List<TwoDLocation> locations = new ArrayList();

        public PolygonalRegion createPolygonalRegion() {
            return new PolygonalRegion(this.locations);
        }

        public Builder setLocations(List<TwoDLocation> list) {
            this.locations = list;
            return this;
        }

        public Builder setLocations(TwoDLocation... twoDLocationArr) {
            this.locations.addAll(Arrays.asList(twoDLocationArr));
            return this;
        }
    }

    public PolygonalRegion(List<TwoDLocation> list) {
        this.twoDLocations = Collections.unmodifiableList(list);
    }

    public static PolygonalRegion getInstance(Object obj2) {
        if (obj2 instanceof PolygonalRegion) {
            return (PolygonalRegion) obj2;
        }
        if (obj2 != null) {
            return new PolygonalRegion(ASN1Sequence.getInstance(obj2));
        }
        return null;
    }

    public List<TwoDLocation> getTwoDLocations() {
        return this.twoDLocations;
    }

    @Override // org.bouncycastle.asn1.ASN1Object, org.bouncycastle.asn1.ASN1Encodable
    public ASN1Primitive toASN1Primitive() {
        return ItsUtils.toSequence(this.twoDLocations);
    }

    private PolygonalRegion(ASN1Sequence aSN1Sequence) {
        ArrayList arrayList = new ArrayList();
        Iterator<ASN1Encodable> it8 = aSN1Sequence.iterator();
        while (it8.hasNext()) {
            arrayList.add(TwoDLocation.getInstance(it8.next()));
        }
        this.twoDLocations = Collections.unmodifiableList(arrayList);
    }
}
