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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u0000 \f2\u00020\u0001:\u0002\u0006\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001a\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\n\u0010\b¨\u0006\r"}, d2 = {"Lxhf/u1;", "", "", "toString", "()Ljava/lang/String;", "Lxhf/r1;", "a", "Lxhf/r1;", "()Lxhf/r1;", "grossAmount", "b", "tax", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class u1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("grossAmount")
    @NotNull
    private final r1 grossAmount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("tax")
    @NotNull
    private final r1 tax;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306186a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306186a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionReferralRewardTaxDetailsDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("grossAmount", false);
            pluginGeneratedSerialDescriptor.j("tax", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            r1.a aVar = r1.a.f306154a;
            return new KSerializer[]{aVar, aVar};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            r1 r1Var = null;
            boolean z = true;
            int i = 0;
            r1 r1Var2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    r1Var = (r1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, r1.a.f306154a, r1Var);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    r1Var2 = (r1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, r1.a.f306154a, r1Var2);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new u1(i, r1Var, r1Var2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            u1 value = (u1) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            u1.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.u1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306186a;
        }
    }

    public /* synthetic */ u1(int i, r1 r1Var, r1 r1Var2) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f306186a.getDescriptor(), i, 3);
            throw null;
        }
        this.grossAmount = r1Var;
        this.tax = r1Var2;
    }

    public static final /* synthetic */ void c(u1 u1Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        r1.a aVar = r1.a.f306154a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, aVar, u1Var.grossAmount);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, aVar, u1Var.tax);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final r1 getGrossAmount() {
        return this.grossAmount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final r1 getTax() {
        return this.tax;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof u1)) {
            return false;
        }
        u1 u1Var = (u1) obj2;
        return Intrinsics.f(this.grossAmount, u1Var.grossAmount) && Intrinsics.f(this.tax, u1Var.tax);
    }

    public final int hashCode() {
        return this.tax.hashCode() + (this.grossAmount.hashCode() * 31);
    }
}
