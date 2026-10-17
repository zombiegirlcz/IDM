package yhf;

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
import qlm.j1;
import qlm.t0;
import qlm.v1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u000f\u001a\u0004\b\u000b\u0010\u0010R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u000f\u001a\u0004\b\b\u0010\u0010¨\u0006\u0014"}, d2 = {"Lyhf/o;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "invoiceId", "b", "e", "subscriptionId", "c", "d", "serviceProviderName", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "nextSubscriptionPeriodStartDate", "nextInvoiceDueDate", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("invoiceId")
    @NotNull
    private final String invoiceId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("subscriptionId")
    @NotNull
    private final String subscriptionId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("serviceProviderName")
    @NotNull
    private final String serviceProviderName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("nextSubscriptionPeriodStartDate")
    private final Long nextSubscriptionPeriodStartDate;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("nextInvoiceDueDate")
    private final Long nextInvoiceDueDate;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f314051a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f314051a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.TelecomIndustryDataDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("invoiceId", false);
            pluginGeneratedSerialDescriptor.j("subscriptionId", false);
            pluginGeneratedSerialDescriptor.j("serviceProviderName", false);
            pluginGeneratedSerialDescriptor.j("nextSubscriptionPeriodStartDate", false);
            pluginGeneratedSerialDescriptor.j("nextInvoiceDueDate", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            t0 t0Var = t0.f247706a;
            KSerializer kSerializerC = nlm.a.c(t0Var);
            KSerializer kSerializerC2 = nlm.a.c(t0Var);
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, kSerializerC, kSerializerC2};
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
            Long l2 = null;
            Long l3 = null;
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
                    strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                    i |= 4;
                } else if (iD == 3) {
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, t0.f247706a, l2);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, t0.f247706a, l3);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new o(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, l2, l3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            o value = (o) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            o.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yhf.o$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f314051a;
        }
    }

    public /* synthetic */ o(int i, String str, String str2, String str3, Long l2, Long l3) {
        if (31 != (i & 31)) {
            j1.f(a.f314051a.getDescriptor(), i, 31);
            throw null;
        }
        this.invoiceId = str;
        this.subscriptionId = str2;
        this.serviceProviderName = str3;
        this.nextSubscriptionPeriodStartDate = l2;
        this.nextInvoiceDueDate = l3;
    }

    public static final /* synthetic */ void f(o oVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, oVar.invoiceId);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, oVar.subscriptionId);
        compositeEncoder.encodeStringElement(serialDescriptor, 2, oVar.serviceProviderName);
        t0 t0Var = t0.f247706a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, t0Var, oVar.nextSubscriptionPeriodStartDate);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, t0Var, oVar.nextInvoiceDueDate);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getInvoiceId() {
        return this.invoiceId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getNextInvoiceDueDate() {
        return this.nextInvoiceDueDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Long getNextSubscriptionPeriodStartDate() {
        return this.nextSubscriptionPeriodStartDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getServiceProviderName() {
        return this.serviceProviderName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof o)) {
            return false;
        }
        o oVar = (o) obj2;
        return Intrinsics.f(this.invoiceId, oVar.invoiceId) && Intrinsics.f(this.subscriptionId, oVar.subscriptionId) && Intrinsics.f(this.serviceProviderName, oVar.serviceProviderName) && Intrinsics.f(this.nextSubscriptionPeriodStartDate, oVar.nextSubscriptionPeriodStartDate) && Intrinsics.f(this.nextInvoiceDueDate, oVar.nextInvoiceDueDate);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.invoiceId.hashCode() * 31, 31, this.subscriptionId), 31, this.serviceProviderName);
        Long l2 = this.nextSubscriptionPeriodStartDate;
        int iHashCode = (iC + (l2 == null ? 0 : l2.hashCode())) * 31;
        Long l3 = this.nextInvoiceDueDate;
        return iHashCode + (l3 != null ? l3.hashCode() : 0);
    }
}
