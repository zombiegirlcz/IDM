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
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0010\u0006\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000b\u001a\u0004\b\f\u0010\u0004R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0007\u001a\u0004\b\u000e\u0010\tR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000b\u001a\u0004\b\u0010\u0010\u0004R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0013\u001a\u0004\b\u0006\u0010\u0014¨\u0006\u0017"}, d2 = {"Lxhf/c;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "b", "()Ljava/lang/Long;", "originalAmount", "Ljava/lang/String;", "c", "originalCurrency", "d", "surchargeAmount", "e", "surchargeCurrency", "", "Ljava/lang/Double;", "()Ljava/lang/Double;", "exchangeRate", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("originalAmount")
    private final Long originalAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("originalCurrency")
    private final String originalCurrency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("surchargeAmount")
    private final Long surchargeAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("surchargeCurrency")
    private final String surchargeCurrency;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("dccRate")
    private final Double exchangeRate;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f305893a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f305893a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.AmountBreakdownDto", aVar, 5);
            pluginGeneratedSerialDescriptor.j("originalAmount", false);
            pluginGeneratedSerialDescriptor.j("originalCurrency", false);
            pluginGeneratedSerialDescriptor.j("surchargeAmount", false);
            pluginGeneratedSerialDescriptor.j("surchargeCurrency", false);
            pluginGeneratedSerialDescriptor.j("exchangeRate", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.t0 t0Var = qlm.t0.f247706a;
            KSerializer kSerializerC = nlm.a.c(t0Var);
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{kSerializerC, nlm.a.c(v1Var), nlm.a.c(t0Var), nlm.a.c(v1Var), nlm.a.c(qlm.x.f247723a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            Long l2 = null;
            String str = null;
            Long l3 = null;
            String str2 = null;
            Double d = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.t0.f247706a, l2);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str);
                    i |= 2;
                } else if (iD == 2) {
                    l3 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.t0.f247706a, l3);
                    i |= 4;
                } else if (iD == 3) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, qlm.v1.f247718a, str2);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.x.f247723a, d);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c(i, l2, str, l3, str2, d);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            c value = (c) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            c.f(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f305893a;
        }
    }

    public /* synthetic */ c(int i, Long l2, String str, Long l3, String str2, Double d) {
        if (31 != (i & 31)) {
            qlm.j1.f(a.f305893a.getDescriptor(), i, 31);
            throw null;
        }
        this.originalAmount = l2;
        this.originalCurrency = str;
        this.surchargeAmount = l3;
        this.surchargeCurrency = str2;
        this.exchangeRate = d;
    }

    public static final /* synthetic */ void f(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        qlm.t0 t0Var = qlm.t0.f247706a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, t0Var, cVar.originalAmount);
        qlm.v1 v1Var = qlm.v1.f247718a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1Var, cVar.originalCurrency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, t0Var, cVar.surchargeAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, v1Var, cVar.surchargeCurrency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, qlm.x.f247723a, cVar.exchangeRate);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Double getExchangeRate() {
        return this.exchangeRate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Long getOriginalAmount() {
        return this.originalAmount;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOriginalCurrency() {
        return this.originalCurrency;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Long getSurchargeAmount() {
        return this.surchargeAmount;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSurchargeCurrency() {
        return this.surchargeCurrency;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.originalAmount, cVar.originalAmount) && Intrinsics.f(this.originalCurrency, cVar.originalCurrency) && Intrinsics.f(this.surchargeAmount, cVar.surchargeAmount) && Intrinsics.f(this.surchargeCurrency, cVar.surchargeCurrency) && Intrinsics.f(this.exchangeRate, cVar.exchangeRate);
    }

    public final int hashCode() {
        Long l2 = this.originalAmount;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.originalCurrency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Long l3 = this.surchargeAmount;
        int iHashCode3 = (iHashCode2 + (l3 == null ? 0 : l3.hashCode())) * 31;
        String str2 = this.surchargeCurrency;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Double d = this.exchangeRate;
        return iHashCode4 + (d != null ? d.hashCode() : 0);
    }
}
