package org.bouncycastle.pqc.jcajce.spec;

import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;
import org.bouncycastle.pqc.crypto.ntruplus.NTRUPlusParameters;
import org.bouncycastle.util.Strings;

/* JADX INFO: loaded from: classes14.dex */
public class NTRUPlusParameterSpec implements AlgorithmParameterSpec {
    public static final NTRUPlusParameterSpec ntruplus_1152;
    public static final NTRUPlusParameterSpec ntruplus_768;
    public static final NTRUPlusParameterSpec ntruplus_864;
    private static Map parameters;
    private final String name;

    static {
        NTRUPlusParameterSpec nTRUPlusParameterSpec = new NTRUPlusParameterSpec(NTRUPlusParameters.ntruplus_kem_768);
        ntruplus_768 = nTRUPlusParameterSpec;
        NTRUPlusParameterSpec nTRUPlusParameterSpec2 = new NTRUPlusParameterSpec(NTRUPlusParameters.ntruplus_kem_864);
        ntruplus_864 = nTRUPlusParameterSpec2;
        ntruplus_1152 = new NTRUPlusParameterSpec(NTRUPlusParameters.ntruplus_kem_1152);
        HashMap map = new HashMap();
        parameters = map;
        map.put("ntruplus-768", nTRUPlusParameterSpec);
        parameters.put("ntruplus-864", nTRUPlusParameterSpec2);
        parameters.put("ntruplus-864", nTRUPlusParameterSpec2);
    }

    private NTRUPlusParameterSpec(NTRUPlusParameters nTRUPlusParameters) {
        this.name = Strings.toUpperCase(nTRUPlusParameters.getName());
    }

    public static NTRUPlusParameterSpec fromName(String str) {
        return (NTRUPlusParameterSpec) parameters.get(Strings.toLowerCase(str));
    }

    public String getName() {
        return this.name;
    }
}
