package vbk;

import ip0.v7;
import jo3.a;
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
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0006\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0006\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0019"}, d2 = {"Lvbk/h;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getReceiverUsername", "receiverUsername", "b", "getPricingPlanId", "pricingPlanId", "Ljo3/a;", "c", "Ljo3/a;", "getAmount", "()Ljo3/a;", "amount", "d", "getBillingPeriod", "billingPeriod", "e", "getSource", "source", "Companion", "feature_retail_plan_gifting_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class h {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("receiverUsername")
    @NotNull
    private final String receiverUsername;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("pricingPlanId")
    @NotNull
    private final String pricingPlanId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    @NotNull
    private final jo3.a amount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("billingPeriod")
    @NotNull
    private final String billingPeriod;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("source")
    @NotNull
    private final String source;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f287567a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f287567a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.plan_gifting.impl.network.dto.PlanGiftingSendRequestBodyDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("receiverUsername", false);
            pluginGeneratedSerialDescriptor.j("pricingPlanId", false);
            pluginGeneratedSerialDescriptor.j("amount", false);
            pluginGeneratedSerialDescriptor.j("billingPeriod", false);
            pluginGeneratedSerialDescriptor.j("source", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, a.C1001a.f176860a, v1Var, v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            jo3.a aVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar);
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
            return new h(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, aVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            h value = (h) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            h.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: vbk.h$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f287567a;
        }
    }

    public /* synthetic */ h(int i, String str, String str2, String str3, String str4, jo3.a aVar) {
        if (31 != (i & 31)) {
            j1.f(a.f287567a.getDescriptor(), i, 31);
            throw null;
        }
        this.receiverUsername = str;
        this.pricingPlanId = str2;
        this.amount = aVar;
        this.billingPeriod = str3;
        this.source = str4;
    }

    public static final /* synthetic */ void a(h hVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, hVar.receiverUsername);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, hVar.pricingPlanId);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, hVar.amount);
        compositeEncoder.encodeStringElement(serialDescriptor, 3, hVar.billingPeriod);
        compositeEncoder.encodeStringElement(serialDescriptor, 4, hVar.source);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof h)) {
            return false;
        }
        h hVar = (h) obj2;
        return Intrinsics.f(this.receiverUsername, hVar.receiverUsername) && Intrinsics.f(this.pricingPlanId, hVar.pricingPlanId) && Intrinsics.f(this.amount, hVar.amount) && Intrinsics.f(this.billingPeriod, hVar.billingPeriod) && Intrinsics.f(this.source, hVar.source);
    }

    public final int hashCode() {
        return this.source.hashCode() + p.a.c(v7.j(this.amount, p.a.c(this.receiverUsername.hashCode() * 31, 31, this.pricingPlanId), 31), 31, this.billingPeriod);
    }

    public h(String receiverUsername, String pricingPlanId, String billingPeriod, String source, jo3.a amount) {
        Intrinsics.checkNotNullParameter(receiverUsername, "receiverUsername");
        Intrinsics.checkNotNullParameter(pricingPlanId, "pricingPlanId");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(billingPeriod, "billingPeriod");
        Intrinsics.checkNotNullParameter(source, "source");
        this.receiverUsername = receiverUsername;
        this.pricingPlanId = pricingPlanId;
        this.amount = amount;
        this.billingPeriod = billingPeriod;
        this.source = source;
    }
}
