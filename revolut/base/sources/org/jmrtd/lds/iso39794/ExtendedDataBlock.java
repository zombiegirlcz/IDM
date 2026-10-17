package org.jmrtd.lds.iso39794;

import ehe.n;
import j6.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1OctetString;
import org.bouncycastle.asn1.DEROctetString;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class ExtendedDataBlock extends Block {
    private static final long serialVersionUID = -1557206933986460059L;
    private byte[] data;
    private RegistryIdBlock dataTypeIdBlock;

    public ExtendedDataBlock(RegistryIdBlock registryIdBlock, byte[] bArr) {
        this.dataTypeIdBlock = registryIdBlock;
        this.data = bArr;
    }

    public static List<ExtendedDataBlock> decodeExtendedDataBlocks(ASN1Encodable aSN1Encodable) {
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            return Collections.singletonList(new ExtendedDataBlock(aSN1Encodable));
        }
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new ExtendedDataBlock(it8.next()));
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
        ExtendedDataBlock extendedDataBlock = (ExtendedDataBlock) obj2;
        return Arrays.equals(this.data, extendedDataBlock.data) && Objects.equals(this.dataTypeIdBlock, extendedDataBlock.dataTypeIdBlock);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, this.dataTypeIdBlock.getASN1Object());
        map.put(1, new DEROctetString(this.data));
        return ASN1Util.encodeTaggedObjects(map);
    }

    public byte[] getData() {
        return this.data;
    }

    public RegistryIdBlock getDataTypeIdBlock() {
        return this.dataTypeIdBlock;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(this.dataTypeIdBlock) + n.b(31, 31, this.data);
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("ExtendedDataBlock [dataTypeIdBlock: ");
        sb6.append(this.dataTypeIdBlock);
        sb6.append(", data: ");
        return a.v(sb6, "]", this.data.length);
    }

    public ExtendedDataBlock(ASN1Encodable aSN1Encodable) {
        Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
        this.dataTypeIdBlock = new RegistryIdBlock(mapDecodeTaggedObjects.get(0));
        this.data = ASN1OctetString.getInstance(mapDecodeTaggedObjects.get(1)).getOctets();
    }
}
