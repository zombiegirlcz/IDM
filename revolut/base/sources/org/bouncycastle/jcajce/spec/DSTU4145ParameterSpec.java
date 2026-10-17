package org.bouncycastle.jcajce.spec;

import java.security.spec.ECParameterSpec;
import org.bouncycastle.asn1.ua.DSTU4145Params;
import org.bouncycastle.crypto.params.ECDomainParameters;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
import org.bouncycastle.util.Arrays;

/* JADX INFO: loaded from: classes14.dex */
public class DSTU4145ParameterSpec extends ECParameterSpec {

    /* JADX INFO: renamed from: dke, reason: collision with root package name */
    private final byte[] f228631dke;
    private final ECDomainParameters parameters;

    public DSTU4145ParameterSpec(ECDomainParameters eCDomainParameters) {
        this(eCDomainParameters, EC5Util.convertToSpec(eCDomainParameters), DSTU4145Params.getDefaultDKE());
    }

    public boolean equals(Object obj2) {
        if (obj2 instanceof DSTU4145ParameterSpec) {
            return this.parameters.equals(((DSTU4145ParameterSpec) obj2).parameters);
        }
        return false;
    }

    public byte[] getDKE() {
        return Arrays.clone(this.f228631dke);
    }

    public int hashCode() {
        return this.parameters.hashCode();
    }

    private DSTU4145ParameterSpec(ECDomainParameters eCDomainParameters, ECParameterSpec eCParameterSpec, byte[] bArr) {
        super(eCParameterSpec.getCurve(), eCParameterSpec.getGenerator(), eCParameterSpec.getOrder(), eCParameterSpec.getCofactor());
        this.parameters = eCDomainParameters;
        this.f228631dke = Arrays.clone(bArr);
    }
}
