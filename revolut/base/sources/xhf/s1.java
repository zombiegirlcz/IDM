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
import xhf.r1;
import xhf.t1;
import xhf.u1;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015¨\u0006\u0018"}, d2 = {"Lxhf/s1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "rate", "Lxhf/r1;", "Lxhf/r1;", "()Lxhf/r1;", "promisedAmount", "Lxhf/u1;", "c", "Lxhf/u1;", "d", "()Lxhf/u1;", "taxDetails", "Lxhf/t1;", "Lxhf/t1;", "()Lxhf/t1;", "taxBreakdown", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class s1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("rate")
    private final String rate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("promisedAmount")
    @NotNull
    private final r1 promisedAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxDetails")
    private final u1 taxDetails;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("taxBreakdown")
    private final t1 taxBreakdown;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306166a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306166a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionReferralRewardDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("rate", false);
            pluginGeneratedSerialDescriptor.j("promisedAmount", false);
            pluginGeneratedSerialDescriptor.j("taxDetails", false);
            pluginGeneratedSerialDescriptor.j("taxBreakdown", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(qlm.v1.f247718a), r1.a.f306154a, nlm.a.c(u1.a.f306186a), nlm.a.c(t1.a.f306177a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            r1 r1Var = null;
            u1 u1Var = null;
            t1 t1Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    r1Var = (r1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, r1.a.f306154a, r1Var);
                    i |= 2;
                } else if (iD == 2) {
                    u1Var = (u1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, u1.a.f306186a, u1Var);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    t1Var = (t1) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, t1.a.f306177a, t1Var);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new s1(i, str, r1Var, u1Var, t1Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            s1 value = (s1) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            s1.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.s1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306166a;
        }
    }

    public /* synthetic */ s1(int i, String str, r1 r1Var, u1 u1Var, t1 t1Var) {
        if (15 != (i & 15)) {
            qlm.j1.f(a.f306166a.getDescriptor(), i, 15);
            throw null;
        }
        this.rate = str;
        this.promisedAmount = r1Var;
        this.taxDetails = u1Var;
        this.taxBreakdown = t1Var;
    }

    public static final /* synthetic */ void e(s1 s1Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, s1Var.rate);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, r1.a.f306154a, s1Var.promisedAmount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, u1.a.f306186a, s1Var.taxDetails);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, t1.a.f306177a, s1Var.taxBreakdown);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r1 getPromisedAmount() {
        return this.promisedAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getRate() {
        return this.rate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final t1 getTaxBreakdown() {
        return this.taxBreakdown;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final u1 getTaxDetails() {
        return this.taxDetails;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj2;
        return Intrinsics.f(this.rate, s1Var.rate) && Intrinsics.f(this.promisedAmount, s1Var.promisedAmount) && Intrinsics.f(this.taxDetails, s1Var.taxDetails) && Intrinsics.f(this.taxBreakdown, s1Var.taxBreakdown);
    }

    public final int hashCode() {
        String str = this.rate;
        int iHashCode = (this.promisedAmount.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        u1 u1Var = this.taxDetails;
        int iHashCode2 = (iHashCode + (u1Var == null ? 0 : u1Var.hashCode())) * 31;
        t1 t1Var = this.taxBreakdown;
        return iHashCode2 + (t1Var != null ? t1Var.hashCode() : 0);
    }
}
