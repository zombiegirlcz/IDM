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
import xhf.u;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0006\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000b\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000b\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0014"}, d2 = {"Lxhf/p;", "", "", "toString", "()Ljava/lang/String;", "Lxhf/u;", "a", "Lxhf/u;", "b", "()Lxhf/u;", "distributionInfo", "Ljava/lang/String;", "d", "insuranceType", "c", "creditProduct", "facilityId", "e", "policyId", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class p {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("distributionInfo")
    @NotNull
    private final u distributionInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("insuranceType")
    @NotNull
    private final String insuranceType;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("creditProduct")
    @NotNull
    private final String creditProduct;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("facilityId")
    @NotNull
    private final String facilityId;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("policyId")
    @NotNull
    private final String policyId;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306130a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306130a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.CreditInsuranceDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("distributionInfo", false);
            pluginGeneratedSerialDescriptor.j("insuranceType", false);
            pluginGeneratedSerialDescriptor.j("creditProduct", false);
            pluginGeneratedSerialDescriptor.j("facilityId", false);
            pluginGeneratedSerialDescriptor.j("policyId", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{u.a.f306181a, v1Var, v1Var, v1Var, v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            u uVar = null;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    uVar = (u) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, u.a.f306181a, uVar);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                } else if (iD == 3) {
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new p(i, uVar, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            p value = (p) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            p.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.p$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306130a;
        }
    }

    public /* synthetic */ p(int i, u uVar, String str, String str2, String str3, String str4) {
        if (31 != (i & 31)) {
            qlm.j1.f(a.f306130a.getDescriptor(), i, 31);
            throw null;
        }
        this.distributionInfo = uVar;
        this.insuranceType = str;
        this.creditProduct = str2;
        this.facilityId = str3;
        this.policyId = str4;
    }

    public static final /* synthetic */ void f(p pVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, u.a.f306181a, pVar.distributionInfo);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, pVar.insuranceType);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, pVar.creditProduct);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, pVar.facilityId);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, pVar.policyId);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCreditProduct() {
        return this.creditProduct;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final u getDistributionInfo() {
        return this.distributionInfo;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getFacilityId() {
        return this.facilityId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getInsuranceType() {
        return this.insuranceType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getPolicyId() {
        return this.policyId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.distributionInfo, pVar.distributionInfo) && Intrinsics.f(this.insuranceType, pVar.insuranceType) && Intrinsics.f(this.creditProduct, pVar.creditProduct) && Intrinsics.f(this.facilityId, pVar.facilityId) && Intrinsics.f(this.policyId, pVar.policyId);
    }

    public final int hashCode() {
        return this.policyId.hashCode() + p.a.c(p.a.c(p.a.c(this.distributionInfo.hashCode() * 31, 31, this.insuranceType), 31, this.creditProduct), 31, this.facilityId);
    }
}
