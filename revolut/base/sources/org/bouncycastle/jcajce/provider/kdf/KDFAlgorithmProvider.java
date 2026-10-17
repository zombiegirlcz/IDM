package org.bouncycastle.jcajce.provider.kdf;

import okl.m;
import org.bouncycastle.asn1.ASN1ObjectIdentifier;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.bouncycastle.jcajce.provider.util.AlgorithmProvider;

/* JADX INFO: loaded from: classes14.dex */
abstract class KDFAlgorithmProvider extends AlgorithmProvider {
    public void addKDFAlgorithm(ConfigurableProvider configurableProvider, String str, String str2) {
        addKDFAlgorithm(configurableProvider, str, str2, null);
    }

    public void registerKDFAlias(ConfigurableProvider configurableProvider, String str, String str2) {
        configurableProvider.addAlgorithm("Alg.Alias.KDF." + str, str2);
    }

    public void registerKDFAliasOid(ConfigurableProvider configurableProvider, ASN1ObjectIdentifier aSN1ObjectIdentifier, String str) {
        configurableProvider.addAlgorithm("Alg.Alias.KDF." + aSN1ObjectIdentifier, str);
        m.A(new StringBuilder("Alg.Alias.KDF.OID."), aSN1ObjectIdentifier, configurableProvider, str);
    }

    public void addKDFAlgorithm(ConfigurableProvider configurableProvider, String str, String str2, ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        configurableProvider.addAlgorithm("KDF." + str, str2);
        if (aSN1ObjectIdentifier != null) {
            registerKDFAliasOid(configurableProvider, aSN1ObjectIdentifier, str);
        }
    }
}
