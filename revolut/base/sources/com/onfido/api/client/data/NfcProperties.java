package com.onfido.api.client.data;

import j6.a;
import java.util.Arrays;
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
import qlm.m0;
import qlm.v1;
import yhm.d;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002+,BG\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rB+\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\t\u0010\"\u001a\u00020\u0007HÖ\u0001J&\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00002\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)HÁ\u0001¢\u0006\u0002\b*R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0010\u001a\u0004\b\u0004\u0010\u0017R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0015¨\u0006-"}, d2 = {"Lcom/onfido/api/client/data/NfcProperties;", "", "seen1", "", "isNfcSupported", "", "nfcKey", "", "aaChallenge", "", "can", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(IZLjava/lang/String;[ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(ZLjava/lang/String;[ILjava/lang/String;)V", "getAaChallenge$annotations", "()V", "getAaChallenge", "()[I", "getCan$annotations", "getCan", "()Ljava/lang/String;", "isNfcSupported$annotations", "()Z", "getNfcKey$annotations", "getNfcKey", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$onfido_api_client", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final /* data */ class NfcProperties {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final int[] aaChallenge;
    private final String can;
    private final boolean isNfcSupported;
    private final String nfcKey;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/NfcProperties$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/NfcProperties;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return NfcProperties$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    @d
    public /* synthetic */ NfcProperties(int i, boolean z, String str, int[] iArr, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            j1.f(NfcProperties$$serializer.INSTANCE.getDescriptor(), i, 15);
            throw null;
        }
        this.isNfcSupported = z;
        this.nfcKey = str;
        this.aaChallenge = iArr;
        this.can = str2;
    }

    public static /* synthetic */ NfcProperties copy$default(NfcProperties nfcProperties, boolean z, String str, int[] iArr, String str2, int i, Object obj2) {
        if ((i & 1) != 0) {
            z = nfcProperties.isNfcSupported;
        }
        if ((i & 2) != 0) {
            str = nfcProperties.nfcKey;
        }
        if ((i & 4) != 0) {
            iArr = nfcProperties.aaChallenge;
        }
        if ((i & 8) != 0) {
            str2 = nfcProperties.can;
        }
        return nfcProperties.copy(z, str, iArr, str2);
    }

    public static /* synthetic */ void getAaChallenge$annotations() {
    }

    public static /* synthetic */ void getCan$annotations() {
    }

    public static /* synthetic */ void getNfcKey$annotations() {
    }

    public static /* synthetic */ void isNfcSupported$annotations() {
    }

    public static final /* synthetic */ void write$Self$onfido_api_client(NfcProperties self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeBooleanElement(serialDesc, 0, self.isNfcSupported);
        v1 v1Var = v1.f247718a;
        output.encodeNullableSerializableElement(serialDesc, 1, v1Var, self.nfcKey);
        output.encodeNullableSerializableElement(serialDesc, 2, m0.f247677c, self.aaChallenge);
        output.encodeNullableSerializableElement(serialDesc, 3, v1Var, self.can);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsNfcSupported() {
        return this.isNfcSupported;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getNfcKey() {
        return this.nfcKey;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int[] getAaChallenge() {
        return this.aaChallenge;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCan() {
        return this.can;
    }

    @NotNull
    public final NfcProperties copy(boolean isNfcSupported, String nfcKey, int[] aaChallenge, String can) {
        return new NfcProperties(isNfcSupported, nfcKey, aaChallenge, can);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NfcProperties)) {
            return false;
        }
        NfcProperties nfcProperties = (NfcProperties) other;
        return this.isNfcSupported == nfcProperties.isNfcSupported && Intrinsics.f(this.nfcKey, nfcProperties.nfcKey) && Intrinsics.f(this.aaChallenge, nfcProperties.aaChallenge) && Intrinsics.f(this.can, nfcProperties.can);
    }

    public final int[] getAaChallenge() {
        return this.aaChallenge;
    }

    public final String getCan() {
        return this.can;
    }

    public final String getNfcKey() {
        return this.nfcKey;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isNfcSupported) * 31;
        String str = this.nfcKey;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        int[] iArr = this.aaChallenge;
        int iHashCode3 = (iHashCode2 + (iArr == null ? 0 : Arrays.hashCode(iArr))) * 31;
        String str2 = this.can;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean isNfcSupported() {
        return this.isNfcSupported;
    }

    @NotNull
    public String toString() {
        boolean z = this.isNfcSupported;
        String str = this.nfcKey;
        String string = Arrays.toString(this.aaChallenge);
        String str2 = this.can;
        StringBuilder sb6 = new StringBuilder("NfcProperties(isNfcSupported=");
        sb6.append(z);
        sb6.append(", nfcKey=");
        sb6.append(str);
        sb6.append(", aaChallenge=");
        return a.w(sb6, string, ", can=", str2, ")");
    }

    public NfcProperties(boolean z, String str, int[] iArr, String str2) {
        this.isNfcSupported = z;
        this.nfcKey = str;
        this.aaChallenge = iArr;
        this.can = str2;
    }
}
