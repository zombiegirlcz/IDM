package com.onfido.api.client.token.sdk.model;

import j6.a;
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
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B1\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB\u001d\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\nJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, d2 = {"Lcom/onfido/api/client/token/sdk/model/InternalSDKTokenUrl;", "Ljava/io/Serializable;", "seen1", "", "baseUrl", "", "authUrl", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "getAuthUrl$annotations", "()V", "getAuthUrl", "()Ljava/lang/String;", "getBaseUrl$annotations", "getBaseUrl", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class InternalSDKTokenUrl implements Serializable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String authUrl;
    private final String baseUrl;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/token/sdk/model/InternalSDKTokenUrl$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/token/sdk/model/InternalSDKTokenUrl;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return InternalSDKTokenUrl$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public InternalSDKTokenUrl() {
        this((String) null, (String) (0 == true ? 1 : 0), 3, (DefaultConstructorMarker) (0 == true ? 1 : 0));
    }

    public static /* synthetic */ InternalSDKTokenUrl copy$default(InternalSDKTokenUrl internalSDKTokenUrl, String str, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = internalSDKTokenUrl.baseUrl;
        }
        if ((i & 2) != 0) {
            str2 = internalSDKTokenUrl.authUrl;
        }
        return internalSDKTokenUrl.copy(str, str2);
    }

    public static /* synthetic */ void getAuthUrl$annotations() {
    }

    public static /* synthetic */ void getBaseUrl$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(InternalSDKTokenUrl self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.d(serialDesc) || self.baseUrl != null) {
            output.encodeNullableSerializableElement(serialDesc, 0, v1.f247718a, self.baseUrl);
        }
        if (!output.d(serialDesc) && self.authUrl == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, v1.f247718a, self.authUrl);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBaseUrl() {
        return this.baseUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAuthUrl() {
        return this.authUrl;
    }

    @NotNull
    public final InternalSDKTokenUrl copy(String baseUrl, String authUrl) {
        return new InternalSDKTokenUrl(baseUrl, authUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InternalSDKTokenUrl)) {
            return false;
        }
        InternalSDKTokenUrl internalSDKTokenUrl = (InternalSDKTokenUrl) other;
        return Intrinsics.f(this.baseUrl, internalSDKTokenUrl.baseUrl) && Intrinsics.f(this.authUrl, internalSDKTokenUrl.authUrl);
    }

    public final String getAuthUrl() {
        return this.authUrl;
    }

    public final String getBaseUrl() {
        return this.baseUrl;
    }

    public int hashCode() {
        String str = this.baseUrl;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.authUrl;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return a.s("InternalSDKTokenUrl(baseUrl=", this.baseUrl, ", authUrl=", this.authUrl, ")");
    }

    @d
    public /* synthetic */ InternalSDKTokenUrl(int i, String str, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if ((i & 1) == 0) {
            this.baseUrl = null;
        } else {
            this.baseUrl = str;
        }
        if ((i & 2) == 0) {
            this.authUrl = null;
        } else {
            this.authUrl = str2;
        }
    }

    public InternalSDKTokenUrl(String str, String str2) {
        this.baseUrl = str;
        this.authUrl = str2;
    }

    public /* synthetic */ InternalSDKTokenUrl(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2);
    }
}
