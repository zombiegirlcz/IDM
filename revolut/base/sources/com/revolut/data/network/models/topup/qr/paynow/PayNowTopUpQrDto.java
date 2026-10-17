package com.revolut.data.network.models.topup.qr.paynow;

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

/* JADX INFO: loaded from: classes20.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 &2\u00020\u0001:\u0002%&B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bBC\b\u0010\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u0007\u0010\rJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\nHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J%\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00002\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0001¢\u0006\u0002\b$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006'"}, d2 = {"Lcom/revolut/data/network/models/topup/qr/paynow/PayNowTopUpQrDto;", "", "encodedValue", "", "reference", "vpa", "companyName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEncodedValue", "()Ljava/lang/String;", "getReference", "getVpa", "getCompanyName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$feature_topup_screen_impl_release", "$serializer", "Companion", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class PayNowTopUpQrDto {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String companyName;

    @NotNull
    private final String encodedValue;

    @NotNull
    private final String reference;

    @NotNull
    private final String vpa;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/revolut/data/network/models/topup/qr/paynow/PayNowTopUpQrDto$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/revolut/data/network/models/topup/qr/paynow/PayNowTopUpQrDto;", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return PayNowTopUpQrDto$$serializer.INSTANCE;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PayNowTopUpQrDto(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            j1.f(PayNowTopUpQrDto$$serializer.INSTANCE.getDescriptor(), i, 15);
            throw null;
        }
        this.encodedValue = str;
        this.reference = str2;
        this.vpa = str3;
        this.companyName = str4;
    }

    public static /* synthetic */ PayNowTopUpQrDto copy$default(PayNowTopUpQrDto payNowTopUpQrDto, String str, String str2, String str3, String str4, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = payNowTopUpQrDto.encodedValue;
        }
        if ((i & 2) != 0) {
            str2 = payNowTopUpQrDto.reference;
        }
        if ((i & 4) != 0) {
            str3 = payNowTopUpQrDto.vpa;
        }
        if ((i & 8) != 0) {
            str4 = payNowTopUpQrDto.companyName;
        }
        return payNowTopUpQrDto.copy(str, str2, str3, str4);
    }

    public static final /* synthetic */ void write$Self$feature_topup_screen_impl_release(PayNowTopUpQrDto self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.encodedValue);
        output.encodeStringElement(serialDesc, 1, self.reference);
        output.encodeStringElement(serialDesc, 2, self.vpa);
        output.encodeStringElement(serialDesc, 3, self.companyName);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getEncodedValue() {
        return this.encodedValue;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getReference() {
        return this.reference;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVpa() {
        return this.vpa;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCompanyName() {
        return this.companyName;
    }

    @NotNull
    public final PayNowTopUpQrDto copy(@NotNull String encodedValue, @NotNull String reference, @NotNull String vpa2, @NotNull String companyName) {
        Intrinsics.checkNotNullParameter(encodedValue, "encodedValue");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(vpa2, "vpa");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        return new PayNowTopUpQrDto(encodedValue, reference, vpa2, companyName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PayNowTopUpQrDto)) {
            return false;
        }
        PayNowTopUpQrDto payNowTopUpQrDto = (PayNowTopUpQrDto) other;
        return Intrinsics.f(this.encodedValue, payNowTopUpQrDto.encodedValue) && Intrinsics.f(this.reference, payNowTopUpQrDto.reference) && Intrinsics.f(this.vpa, payNowTopUpQrDto.vpa) && Intrinsics.f(this.companyName, payNowTopUpQrDto.companyName);
    }

    @NotNull
    public final String getCompanyName() {
        return this.companyName;
    }

    @NotNull
    public final String getEncodedValue() {
        return this.encodedValue;
    }

    @NotNull
    public final String getReference() {
        return this.reference;
    }

    @NotNull
    public final String getVpa() {
        return this.vpa;
    }

    public int hashCode() {
        return this.companyName.hashCode() + a.c(a.c(this.encodedValue.hashCode() * 31, 31, this.reference), 31, this.vpa);
    }

    public PayNowTopUpQrDto(@NotNull String encodedValue, @NotNull String reference, @NotNull String vpa2, @NotNull String companyName) {
        Intrinsics.checkNotNullParameter(encodedValue, "encodedValue");
        Intrinsics.checkNotNullParameter(reference, "reference");
        Intrinsics.checkNotNullParameter(vpa2, "vpa");
        Intrinsics.checkNotNullParameter(companyName, "companyName");
        this.encodedValue = encodedValue;
        this.reference = reference;
        this.vpa = vpa2;
        this.companyName = companyName;
    }
}
