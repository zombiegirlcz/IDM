package org.jmrtd.lds.iso39794;

import ehe.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.sf.scuba.util.Hex;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.jmrtd.ASN1Util;
import t61.a;

/* JADX INFO: loaded from: classes14.dex */
public class FaceImageReferenceColourMappingBlock extends Block {
    private static final long serialVersionUID = -347556999620185601L;
    private List<ReferenceColourDefinitionAndValueBlock> referenceColourDefinitionAndValueBlocks;
    private byte[] referenceColourSchema;

    public FaceImageReferenceColourMappingBlock(byte[] bArr, List<ReferenceColourDefinitionAndValueBlock> list) {
        this.referenceColourSchema = bArr;
        this.referenceColourDefinitionAndValueBlocks = list;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (obj2 == null || getClass() != obj2.getClass()) {
            return false;
        }
        FaceImageReferenceColourMappingBlock faceImageReferenceColourMappingBlock = (FaceImageReferenceColourMappingBlock) obj2;
        return Objects.equals(this.referenceColourDefinitionAndValueBlocks, faceImageReferenceColourMappingBlock.referenceColourDefinitionAndValueBlocks) && Arrays.equals(this.referenceColourSchema, faceImageReferenceColourMappingBlock.referenceColourSchema);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        if (this.referenceColourSchema != null) {
            map.put(0, new DEROctetString(this.referenceColourSchema));
        }
        if (this.referenceColourDefinitionAndValueBlocks != null) {
            map.put(1, ISO39794Util.encodeBlocks(this.referenceColourDefinitionAndValueBlocks));
        }
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public List<ReferenceColourDefinitionAndValueBlock> getReferenceColourDefinitionAndValueBlocks() {
        return this.referenceColourDefinitionAndValueBlocks;
    }

    public byte[] getReferenceColourSchema() {
        return this.referenceColourSchema;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.referenceColourDefinitionAndValueBlocks) + n.b(31, 31, this.referenceColourSchema);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("FaceImageReferenceColourMappingBlock [referenceColourSchema: ");
        sb6.append(Hex.bytesToHexString(this.referenceColourSchema));
        sb6.append(", referenceColourDefinitionAndValueBlocks: ");
        return a.q("]", this.referenceColourDefinitionAndValueBlocks, sb6);
    }

    public static class ReferenceColourDefinitionAndValueBlock extends Block {
        private static final long serialVersionUID = -7927429988191532374L;
        private byte[] referenceColourDefinition;
        private byte[] referenceColourValue;

        public ReferenceColourDefinitionAndValueBlock(byte[] bArr, byte[] bArr2) {
            this.referenceColourDefinition = bArr;
            this.referenceColourValue = bArr2;
        }

        public static List<ReferenceColourDefinitionAndValueBlock> decodeReferenceColourDefinitionAndValueBlocks(ASN1Encodable aSN1Encodable) {
            if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
                return Collections.singletonList(new ReferenceColourDefinitionAndValueBlock(aSN1Encodable));
            }
            List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<ASN1Encodable> it8 = list.iterator();
            while (it8.hasNext()) {
                arrayList.add(new ReferenceColourDefinitionAndValueBlock(it8.next()));
            }
            return arrayList;
        }

        @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
        public boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (obj2 == null || getClass() != obj2.getClass()) {
                return false;
            }
            ReferenceColourDefinitionAndValueBlock referenceColourDefinitionAndValueBlock = (ReferenceColourDefinitionAndValueBlock) obj2;
            return Arrays.equals(this.referenceColourDefinition, referenceColourDefinitionAndValueBlock.referenceColourDefinition) && Arrays.equals(this.referenceColourValue, referenceColourDefinitionAndValueBlock.referenceColourValue);
        }

        @Override // org.jmrtd.lds.iso39794.Block
        public ASN1Encodable getASN1Object() {
            HashMap map = new HashMap();
            if (this.referenceColourDefinition != null) {
                map.put(0, new DEROctetString(this.referenceColourDefinition));
            }
            if (this.referenceColourValue != null) {
                map.put(1, new DEROctetString(this.referenceColourValue));
            }
            return ASN1Util.encodeTaggedObjects(map);
        }

        @Override // org.jmrtd.lds.iso39794.Block
        public /* bridge */ /* synthetic */ byte[] getEncoded() {
            return super.getEncoded();
        }

        public byte[] getReferenceColourDefinition() {
            return this.referenceColourDefinition;
        }

        public byte[] getReferenceColourValue() {
            return this.referenceColourValue;
        }

        @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
        public int hashCode() {
            return Arrays.hashCode(this.referenceColourValue) + n.b(31, 31, this.referenceColourDefinition);
        }

        public String toString() {
            return "ReferenceColourDefinitionAndValueBlock [referenceColourDefinition: " + Hex.bytesToHexString(this.referenceColourDefinition) + ", referenceColourValue: " + Hex.bytesToHexString(this.referenceColourValue) + "]";
        }

        public ReferenceColourDefinitionAndValueBlock(ASN1Encodable aSN1Encodable) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
            if (mapDecodeTaggedObjects.containsKey(0)) {
                this.referenceColourDefinition = ASN1OctetString.getInstance(mapDecodeTaggedObjects.get(0)).getOctets();
            }
            if (mapDecodeTaggedObjects.containsKey(1)) {
                this.referenceColourValue = ASN1OctetString.getInstance(mapDecodeTaggedObjects.get(1)).getOctets();
            }
        }
    }

    public FaceImageReferenceColourMappingBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        if (mapDecodeTaggedObjects.containsKey(0)) {
            this.referenceColourSchema = ASN1OctetString.getInstance(mapDecodeTaggedObjects.get(0)).getOctets();
        }
        if (mapDecodeTaggedObjects.containsKey(1)) {
            this.referenceColourDefinitionAndValueBlocks = ReferenceColourDefinitionAndValueBlock.decodeReferenceColourDefinitionAndValueBlocks(mapDecodeTaggedObjects.get(1));
        }
    }
}
