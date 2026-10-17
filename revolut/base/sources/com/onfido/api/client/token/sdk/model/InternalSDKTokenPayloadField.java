package com.onfido.api.client.token.sdk.model;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import p.a;
import qlm.j1;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002&'B=\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J&\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u00002\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$HÁ\u0001¢\u0006\u0002\b%R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0010\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f¨\u0006("}, d2 = {"Lcom/onfido/api/client/token/sdk/model/InternalSDKTokenPayloadField;", "Ljava/io/Serializable;", "seen1", "", "applicantId", "", "clientUuid", "customerUserHash", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApplicantId$annotations", "()V", "getApplicantId", "()Ljava/lang/String;", "getClientUuid$annotations", "getClientUuid", "getCustomerUserHash$annotations", "getCustomerUserHash", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class InternalSDKTokenPayloadField implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String applicantId;

    @NotNull
    private final String clientUuid;
    private final String customerUserHash;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/token/sdk/model/InternalSDKTokenPayloadField$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/token/sdk/model/InternalSDKTokenPayloadField;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return InternalSDKTokenPayloadField$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ InternalSDKTokenPayloadField(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            j1.f(InternalSDKTokenPayloadField$$serializer.INSTANCE.getDescriptor(), i, 7);
            throw null;
        }
        this.applicantId = str;
        this.clientUuid = str2;
        this.customerUserHash = str3;
    }

    public static /* synthetic */ InternalSDKTokenPayloadField copy$default(InternalSDKTokenPayloadField internalSDKTokenPayloadField, String str, String str2, String str3, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = internalSDKTokenPayloadField.applicantId;
        }
        if ((i & 2) != 0) {
            str2 = internalSDKTokenPayloadField.clientUuid;
        }
        if ((i & 4) != 0) {
            str3 = internalSDKTokenPayloadField.customerUserHash;
        }
        return internalSDKTokenPayloadField.copy(str, str2, str3);
    }

    public static /* synthetic */ void getApplicantId$annotations() {
    }

    public static /* synthetic */ void getClientUuid$annotations() {
    }

    public static /* synthetic */ void getCustomerUserHash$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(InternalSDKTokenPayloadField self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.applicantId);
        output.encodeStringElement(serialDesc, 1, self.clientUuid);
        output.encodeNullableSerializableElement(serialDesc, 2, v1.f247718a, self.customerUserHash);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getApplicantId() {
        return this.applicantId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClientUuid() {
        return this.clientUuid;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCustomerUserHash() {
        return this.customerUserHash;
    }

    @NotNull
    public final InternalSDKTokenPayloadField copy(@NotNull String applicantId, @NotNull String clientUuid, String customerUserHash) {
        Intrinsics.checkNotNullParameter(applicantId, "applicantId");
        Intrinsics.checkNotNullParameter(clientUuid, "clientUuid");
        return new InternalSDKTokenPayloadField(applicantId, clientUuid, customerUserHash);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalSDKTokenPayloadField)) {
            return false;
        }
        InternalSDKTokenPayloadField internalSDKTokenPayloadField = (InternalSDKTokenPayloadField) other;
        return Intrinsics.f(this.applicantId, internalSDKTokenPayloadField.applicantId) && Intrinsics.f(this.clientUuid, internalSDKTokenPayloadField.clientUuid) && Intrinsics.f(this.customerUserHash, internalSDKTokenPayloadField.customerUserHash);
    }

    @NotNull
    public final String getApplicantId() {
        return this.applicantId;
    }

    @NotNull
    public final String getClientUuid() {
        return this.clientUuid;
    }

    public final String getCustomerUserHash() {
        return this.customerUserHash;
    }

    public int hashCode() {
        int iC = a.c(this.applicantId.hashCode() * 31, 31, this.clientUuid);
        String str = this.customerUserHash;
        return iC + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.applicantId;
        String str2 = this.clientUuid;
        return v0.a.i(v0.a.m("InternalSDKTokenPayloadField(applicantId=", str, ", clientUuid=", str2, ", customerUserHash="), this.customerUserHash, ")");
    }

    public InternalSDKTokenPayloadField(@NotNull String applicantId, @NotNull String clientUuid, String str) {
        Intrinsics.checkNotNullParameter(applicantId, "applicantId");
        Intrinsics.checkNotNullParameter(clientUuid, "clientUuid");
        this.applicantId = applicantId;
        this.clientUuid = clientUuid;
        this.customerUserHash = str;
    }
}
