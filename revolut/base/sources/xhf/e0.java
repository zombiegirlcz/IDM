package xhf;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\n\u001a\u0004\b\u000e\u0010\fR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\n\u001a\u0004\b\u0005\u0010\f¨\u0006\u0017"}, d2 = {"Lxhf/e0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "facilityId", "", "Ljava/lang/Double;", "c", "()Ljava/lang/Double;", "feeRate", "e", "lateInterestRate", "", "d", "Ljava/lang/Long;", "()Ljava/lang/Long;", "lateInterest", "apr", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditLimitId")
    @NotNull
    private final String facilityId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("feeRate")
    private final Double feeRate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("lateInterestRate")
    private final Double lateInterestRate;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("lateInterest")
    private final Long lateInterest;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("apr")
    private final Double apr;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f305971a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f305971a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.InstalmentPlanDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("facilityId", false);
            pluginGeneratedSerialDescriptor.j("feeRate", false);
            pluginGeneratedSerialDescriptor.j("lateInterestRate", false);
            pluginGeneratedSerialDescriptor.j("lateInterest", false);
            pluginGeneratedSerialDescriptor.j("apr", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.x xVar = qlm.x.f247723a;
            return new KSerializer[]{qlm.v1.f247718a, nlm.a.c(xVar), nlm.a.c(xVar), nlm.a.c(qlm.t0.f247706a), nlm.a.c(xVar)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            Double d = null;
            Double d5 = null;
            Long l2 = null;
            Double d6 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.x.f247723a, d);
                    i |= 2;
                } else if (iD == 2) {
                    d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.x.f247723a, d5);
                    i |= 4;
                } else if (iD == 3) {
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.t0.f247706a, l2);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    d6 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.x.f247723a, d6);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e0(i, strDecodeStringElement, d, d5, l2, d6);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            e0 value = (e0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            e0.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.e0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f305971a;
        }
    }

    public /* synthetic */ e0(int i, String str, Double d, Double d5, Long l2, Double d6) {
        if (31 != (i & 31)) {
            qlm.j1.f(a.f305971a.getDescriptor(), i, 31);
            throw null;
        }
        this.facilityId = str;
        this.feeRate = d;
        this.lateInterestRate = d5;
        this.lateInterest = l2;
        this.apr = d6;
    }

    public static final /* synthetic */ void f(e0 e0Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, e0Var.facilityId);
        qlm.x xVar = qlm.x.f247723a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, xVar, e0Var.feeRate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, xVar, e0Var.lateInterestRate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, qlm.t0.f247706a, e0Var.lateInterest);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, xVar, e0Var.apr);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Double getFeeRate() {
        return this.feeRate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getLateInterest() {
        return this.lateInterest;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getLateInterestRate() {
        return this.lateInterestRate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.facilityId, e0Var.facilityId) && Intrinsics.f(this.feeRate, e0Var.feeRate) && Intrinsics.f(this.lateInterestRate, e0Var.lateInterestRate) && Intrinsics.f(this.lateInterest, e0Var.lateInterest) && Intrinsics.f(this.apr, e0Var.apr);
    }

    public final int hashCode() {
        int iHashCode = this.facilityId.hashCode() * 31;
        Double d = this.feeRate;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        Double d5 = this.lateInterestRate;
        int iHashCode3 = (iHashCode2 + (d5 == null ? 0 : d5.hashCode())) * 31;
        Long l2 = this.lateInterest;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Double d6 = this.apr;
        return iHashCode4 + (d6 != null ? d6.hashCode() : 0);
    }
}
