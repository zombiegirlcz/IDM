package xhf;

import a4l.b;
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
import xhf.c0;
import xhf.z;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0011\u001a\u0004\b\u0006\u0010\u0012¨\u0006\u0015"}, d2 = {"Lxhf/x0;", "", "", "toString", "()Ljava/lang/String;", "Lxhf/c0;", "a", "Lxhf/c0;", "b", "()Lxhf/c0;", "indiaCharges", "La4l/b;", "La4l/b;", "c", "()La4l/b;", "taxes", "Lxhf/z;", "Lxhf/z;", "()Lxhf/z;", "fees", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class x0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("india")
    private final c0 indiaCharges;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxes")
    private final a4l.b taxes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    private final z fees;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f306212a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f306212a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.TransactionChargesDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("indiaCharges", false);
            pluginGeneratedSerialDescriptor.j("taxes", false);
            pluginGeneratedSerialDescriptor.j("fees", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(c0.a.f305897a), nlm.a.c(b.a.f1295a), nlm.a.c(z.a.f306231a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            c0 c0Var = null;
            boolean z = true;
            int i = 0;
            a4l.b bVar = null;
            z zVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    c0Var = (c0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, c0.a.f305897a, c0Var);
                    i |= 1;
                } else if (iD == 1) {
                    bVar = (a4l.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, b.a.f1295a, bVar);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    zVar = (z) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, z.a.f306231a, zVar);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new x0(i, c0Var, bVar, zVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            x0 value = (x0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            x0.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.x0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f306212a;
        }
    }

    public /* synthetic */ x0(int i, c0 c0Var, a4l.b bVar, z zVar) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f306212a.getDescriptor(), i, 7);
            throw null;
        }
        this.indiaCharges = c0Var;
        this.taxes = bVar;
        this.fees = zVar;
    }

    public static final /* synthetic */ void d(x0 x0Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, c0.a.f305897a, x0Var.indiaCharges);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, b.a.f1295a, x0Var.taxes);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, z.a.f306231a, x0Var.fees);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final z getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c0 getIndiaCharges() {
        return this.indiaCharges;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a4l.b getTaxes() {
        return this.taxes;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x0)) {
            return false;
        }
        x0 x0Var = (x0) obj2;
        return Intrinsics.f(this.indiaCharges, x0Var.indiaCharges) && Intrinsics.f(this.taxes, x0Var.taxes) && Intrinsics.f(this.fees, x0Var.fees);
    }

    public final int hashCode() {
        c0 c0Var = this.indiaCharges;
        int iHashCode = (c0Var == null ? 0 : c0Var.hashCode()) * 31;
        a4l.b bVar = this.taxes;
        int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
        z zVar = this.fees;
        return iHashCode2 + (zVar != null ? zVar.hashCode() : 0);
    }
}
