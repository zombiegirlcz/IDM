package com.onfido.api.client.data;

import j6.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u0019\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0006\u0010\u0018\u001a\u00020\u0015J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, d2 = {"Lcom/onfido/api/client/data/PayloadIntegrity;", "", "seen1", "", "signatureBase64", "", "clientNonce", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getClientNonce$annotations", "()V", "getClientNonce", "()Ljava/lang/String;", "getSignatureBase64$annotations", "getSignatureBase64", "component1", "component2", "copy", "equals", "", "other", "hashCode", "isEmpty", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class PayloadIntegrity {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final PayloadIntegrity EMPTY = new PayloadIntegrity(null, null);
    private final String clientNonce;
    private final String signatureBase64;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\bHÆ\u0001R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/onfido/api/client/data/PayloadIntegrity$Companion;", "", "()V", "EMPTY", "Lcom/onfido/api/client/data/PayloadIntegrity;", "getEMPTY", "()Lcom/onfido/api/client/data/PayloadIntegrity;", "serializer", "Lkotlinx/serialization/KSerializer;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final PayloadIntegrity getEMPTY() {
            return PayloadIntegrity.EMPTY;
        }

        @NotNull
        public final KSerializer serializer() {
            return PayloadIntegrity$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ PayloadIntegrity(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            j1.f(PayloadIntegrity$$serializer.INSTANCE.getDescriptor(), i, 3);
            throw null;
        }
        this.signatureBase64 = str;
        this.clientNonce = str2;
    }

    public static /* synthetic */ PayloadIntegrity copy$default(PayloadIntegrity payloadIntegrity, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = payloadIntegrity.signatureBase64;
        }
        if ((i & 2) != 0) {
            str2 = payloadIntegrity.clientNonce;
        }
        return payloadIntegrity.copy(str, str2);
    }

    public static /* synthetic */ void getClientNonce$annotations() {
    }

    public static /* synthetic */ void getSignatureBase64$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(PayloadIntegrity self, CompositeEncoder output, SerialDescriptor serialDesc) {
        v1 v1Var = v1.f247718a;
        output.encodeNullableSerializableElement(serialDesc, 0, v1Var, self.signatureBase64);
        output.encodeNullableSerializableElement(serialDesc, 1, v1Var, self.clientNonce);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSignatureBase64() {
        return this.signatureBase64;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientNonce() {
        return this.clientNonce;
    }

    @NotNull
    public final PayloadIntegrity copy(String signatureBase64, String clientNonce) {
        return new PayloadIntegrity(signatureBase64, clientNonce);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayloadIntegrity)) {
            return false;
        }
        PayloadIntegrity payloadIntegrity = (PayloadIntegrity) other;
        return Intrinsics.f(this.signatureBase64, payloadIntegrity.signatureBase64) && Intrinsics.f(this.clientNonce, payloadIntegrity.clientNonce);
    }

    public final String getClientNonce() {
        return this.clientNonce;
    }

    public final String getSignatureBase64() {
        return this.signatureBase64;
    }

    public int hashCode() {
        String str = this.signatureBase64;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.clientNonce;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isEmpty() {
        String str;
        String str2 = this.signatureBase64;
        return str2 == null || str2.length() == 0 || (str = this.clientNonce) == null || str.length() == 0;
    }

    @NotNull
    public String toString() {
        return a.s("PayloadIntegrity(signatureBase64=", this.signatureBase64, ", clientNonce=", this.clientNonce, ")");
    }

    public PayloadIntegrity(String str, String str2) {
        this.signatureBase64 = str;
        this.clientNonce = str2;
    }
}
