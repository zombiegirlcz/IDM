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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\r\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u000e\u0010\u0004R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0005\u0010\u0012R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0015\u0010\f¨\u0006\u001c"}, d2 = {"Lyhf/e0;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "id", "", "b", "Ljava/lang/Double;", "()Ljava/lang/Double;", "apr", "d", "source", "", "Ljava/lang/Long;", "()Ljava/lang/Long;", "amount", "", "e", "Ljava/lang/Integer;", "f", "()Ljava/lang/Integer;", "term", "taxPercentage", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("apr")
    private final Double apr;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("source")
    private final String source;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("amount")
    private final Long amount;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @lg.b("term")
    private final Integer term;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @lg.b("taxPercentage")
    private final Double taxPercentage;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f313960a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f313960a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.TransactionDetailsLoanDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("apr", false);
            pluginGeneratedSerialDescriptor.j("source", false);
            pluginGeneratedSerialDescriptor.j("amount", false);
            pluginGeneratedSerialDescriptor.j("term", false);
            pluginGeneratedSerialDescriptor.j("taxPercentage", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            qlm.x xVar = qlm.x.f247723a;
            return new KSerializer[]{v1Var, nlm.a.c(xVar), nlm.a.c(v1Var), nlm.a.c(t0.f247706a), nlm.a.c(qlm.n0.f247680a), nlm.a.c(xVar)};
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
            String str = null;
            Long l2 = null;
            Integer num = null;
            Double d5 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        d = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.x.f247723a, d);
                        i |= 2;
                        break;
                    case 2:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                        i |= 4;
                        break;
                    case 3:
                        l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, t0.f247706a, l2);
                        i |= 8;
                        break;
                    case 4:
                        num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, num);
                        i |= 16;
                        break;
                    case 5:
                        d5 = (Double) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, qlm.x.f247723a, d5);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e0(i, strDecodeStringElement, d, str, l2, num, d5);
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
            e0.g(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yhf.e0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f313960a;
        }
    }

    public /* synthetic */ e0(int i, String str, Double d, String str2, Long l2, Integer num, Double d5) {
        if (63 != (i & 63)) {
            j1.f(a.f313960a.getDescriptor(), i, 63);
            throw null;
        }
        this.id = str;
        this.apr = d;
        this.source = str2;
        this.amount = l2;
        this.term = num;
        this.taxPercentage = d5;
    }

    public static final /* synthetic */ void g(e0 e0Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, e0Var.id);
        qlm.x xVar = qlm.x.f247723a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, xVar, e0Var.apr);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, e0Var.source);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, t0.f247706a, e0Var.amount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 4, qlm.n0.f247680a, e0Var.term);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 5, xVar, e0Var.taxPercentage);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Double getApr() {
        return this.apr;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Double getTaxPercentage() {
        return this.taxPercentage;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) obj2;
        return Intrinsics.f(this.id, e0Var.id) && Intrinsics.f(this.apr, e0Var.apr) && Intrinsics.f(this.source, e0Var.source) && Intrinsics.f(this.amount, e0Var.amount) && Intrinsics.f(this.term, e0Var.term) && Intrinsics.f(this.taxPercentage, e0Var.taxPercentage);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Integer getTerm() {
        return this.term;
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        Double d = this.apr;
        int iHashCode2 = (iHashCode + (d == null ? 0 : d.hashCode())) * 31;
        String str = this.source;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Long l2 = this.amount;
        int iHashCode4 = (iHashCode3 + (l2 == null ? 0 : l2.hashCode())) * 31;
        Integer num = this.term;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Double d5 = this.taxPercentage;
        return iHashCode5 + (d5 != null ? d5.hashCode() : 0);
    }
}
