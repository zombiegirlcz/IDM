package com.revolut.feature.apm.core.impl.crypto;

import android.security.keystore.KeyGenParameterSpec;
import com.revolut.feature.apm.core.impl.crypto.ApmKeyGenerator;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.util.Objects;
import javax.security.auth.x500.X500Principal;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes20.dex */
public final class g extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ ApmKeyGenerator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f61863w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(ApmKeyGenerator apmKeyGenerator, String str, Continuation continuation) {
        super(2, continuation);
        this.v = apmKeyGenerator;
        this.f61863w = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new g(this.v, this.f61863w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((g) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        String str = this.f61863w;
        ApmKeyGenerator apmKeyGenerator = this.v;
        try {
            if (i == 0) {
                yhm.o.b(obj2);
                KeyStore keyStore = (KeyStore) apmKeyGenerator.f61851b.invoke();
                Continuation continuation = null;
                keyStore.load(null);
                if (keyStore.containsAlias(str)) {
                    KeyPair keyPairA = ApmKeyGenerator.a(apmKeyGenerator, str);
                    Objects.toString(keyPairA);
                    if (keyPairA != null) {
                        return keyPairA;
                    }
                    this.u = 1;
                    ck7.j jVar = new ck7.j(apmKeyGenerator, str, continuation, 8);
                    p0 p0Var = p0.f264001a;
                    obj2 = e0.J(elm.f.f127540b, jVar, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                }
                KeyGenParameterSpec.Builder signaturePaddings = new KeyGenParameterSpec.Builder(str, 4).setKeySize(apmKeyGenerator.f61850a).setCertificateSubject(new X500Principal("CN=".concat(str))).setCertificateSerialNumber(BigInteger.valueOf(Math.abs(str.hashCode() * 31))).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setSignaturePaddings("PKCS1");
                Intrinsics.checkNotNullExpressionValue(signaturePaddings, "setSignaturePaddings(...)");
                KeyGenParameterSpec keyGenParameterSpecBuild = signaturePaddings.build();
                Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild, "build(...)");
                Function2 function2 = apmKeyGenerator.f61852c;
                ApmKeyGenerator.Companion.getClass();
                KeyPairGenerator keyPairGenerator = (KeyPairGenerator) function2.invoke(ApmKeyGenerator.d, "AndroidKeyStore");
                keyPairGenerator.initialize(keyGenParameterSpecBuild);
                KeyPair keyPairGenerateKeyPair = keyPairGenerator.generateKeyPair();
                Intrinsics.h(keyPairGenerateKeyPair);
                return keyPairGenerateKeyPair;
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
            ((Boolean) obj2).getClass();
            KeyGenParameterSpec.Builder signaturePaddings2 = new KeyGenParameterSpec.Builder(str, 4).setKeySize(apmKeyGenerator.f61850a).setCertificateSubject(new X500Principal("CN=".concat(str))).setCertificateSerialNumber(BigInteger.valueOf(Math.abs(str.hashCode() * 31))).setDigests("SHA-256", "SHA-512").setEncryptionPaddings("OAEPPadding").setSignaturePaddings("PKCS1");
            Intrinsics.checkNotNullExpressionValue(signaturePaddings2, "setSignaturePaddings(...)");
            KeyGenParameterSpec keyGenParameterSpecBuild2 = signaturePaddings2.build();
            Intrinsics.checkNotNullExpressionValue(keyGenParameterSpecBuild2, "build(...)");
            Function2 function22 = apmKeyGenerator.f61852c;
            ApmKeyGenerator.Companion.getClass();
            KeyPairGenerator keyPairGenerator2 = (KeyPairGenerator) function22.invoke(ApmKeyGenerator.d, "AndroidKeyStore");
            keyPairGenerator2.initialize(keyGenParameterSpecBuild2);
            KeyPair keyPairGenerateKeyPair2 = keyPairGenerator2.generateKeyPair();
            Intrinsics.h(keyPairGenerateKeyPair2);
            return keyPairGenerateKeyPair2;
        } catch (Exception e) {
            String str2 = "Error generating KeyPair: " + e.getMessage();
            ApmKeyGenerator.b(str2, e);
            throw new ApmKeyGenerator.ApmKeyGenerationError(str2, e);
        }
    }
}
