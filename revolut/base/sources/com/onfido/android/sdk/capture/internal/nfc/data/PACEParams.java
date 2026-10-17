package com.onfido.android.sdk.capture.internal.nfc.data;

import java.math.BigInteger;
import java.security.spec.AlgorithmParameterSpec;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jmrtd.AccessKeySpec;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/onfido/android/sdk/capture/internal/nfc/data/PACEParams;", "", "keySpec", "Lorg/jmrtd/AccessKeySpec;", "oid", "", "params", "Ljava/security/spec/AlgorithmParameterSpec;", "parameterId", "Ljava/math/BigInteger;", "(Lorg/jmrtd/AccessKeySpec;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljava/math/BigInteger;)V", "getKeySpec", "()Lorg/jmrtd/AccessKeySpec;", "getOid", "()Ljava/lang/String;", "getParameterId", "()Ljava/math/BigInteger;", "getParams", "()Ljava/security/spec/AlgorithmParameterSpec;", "onfido-capture-sdk-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class PACEParams {

    @NotNull
    private final AccessKeySpec keySpec;

    @NotNull
    private final String oid;

    @NotNull
    private final BigInteger parameterId;

    @NotNull
    private final AlgorithmParameterSpec params;

    public PACEParams(@NotNull AccessKeySpec keySpec, @NotNull String oid2, @NotNull AlgorithmParameterSpec params, @NotNull BigInteger parameterId) {
        Intrinsics.checkNotNullParameter(keySpec, "keySpec");
        Intrinsics.checkNotNullParameter(oid2, "oid");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(parameterId, "parameterId");
        this.keySpec = keySpec;
        this.oid = oid2;
        this.params = params;
        this.parameterId = parameterId;
    }

    @NotNull
    public final AccessKeySpec getKeySpec() {
        return this.keySpec;
    }

    @NotNull
    public final String getOid() {
        return this.oid;
    }

    @NotNull
    public final BigInteger getParameterId() {
        return this.parameterId;
    }

    @NotNull
    public final AlgorithmParameterSpec getParams() {
        return this.params;
    }
}
