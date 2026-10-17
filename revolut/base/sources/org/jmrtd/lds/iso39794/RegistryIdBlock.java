package org.jmrtd.lds.iso39794;

import j6.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.bouncycastle.asn1.ASN1Encodable;
import org.bouncycastle.asn1.ASN1Sequence;
import org.jmrtd.ASN1Util;

/* JADX INFO: loaded from: classes14.dex */
public class RegistryIdBlock extends Block {
    private static final long serialVersionUID = -5942649140248216405L;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f228985id;
    private int organization;

    public RegistryIdBlock(int i, int i2) {
        this.organization = i;
        this.f228985id = i2;
    }

    public static List<RegistryIdBlock> decodeRegistryIdBlocks(ASN1Encodable aSN1Encodable) {
        if (!ASN1Util.isSequenceOfSequences(aSN1Encodable)) {
            return Collections.singletonList(new RegistryIdBlock(aSN1Encodable));
        }
        List<ASN1Encodable> list = ASN1Util.list(aSN1Encodable);
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<ASN1Encodable> it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(new RegistryIdBlock(it8.next()));
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
        RegistryIdBlock registryIdBlock = (RegistryIdBlock) obj2;
        return this.f228985id == registryIdBlock.f228985id && this.organization == registryIdBlock.organization;
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public ASN1Encodable getASN1Object() {
        HashMap map = new HashMap();
        map.put(0, ASN1Util.encodeInt(this.organization));
        map.put(1, ASN1Util.encodeInt(this.f228985id));
        return ASN1Util.encodeTaggedObjects(map);
    }

    @Override // org.jmrtd.lds.iso39794.Block
    public /* bridge */ /* synthetic */ byte[] getEncoded() {
        return super.getEncoded();
    }

    public int getId() {
        return this.f228985id;
    }

    public int getOrganization() {
        return this.organization;
    }

    @Override // org.jmrtd.lds.iso39794.Block, org.jmrtd.lds.iso39794.FaceImageLandmarkCoordinates
    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.f228985id), Integer.valueOf(this.organization));
    }

    public String toString() {
        StringBuilder sb6 = new StringBuilder("RegistryIdBlock[organization: ");
        sb6.append(this.organization);
        sb6.append(", id: ");
        return a.v(sb6, "]", this.f228985id);
    }

    public RegistryIdBlock(ASN1Encodable aSN1Encodable) {
        if (aSN1Encodable instanceof ASN1Sequence) {
            Map<Integer, ASN1Encodable> mapDecodeTaggedObjects = ASN1Util.decodeTaggedObjects(aSN1Encodable);
            this.organization = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(0));
            this.f228985id = ASN1Util.decodeInt(mapDecodeTaggedObjects.get(1));
            return;
        }
        throw new IllegalArgumentException("Cannot decode!");
    }
}
