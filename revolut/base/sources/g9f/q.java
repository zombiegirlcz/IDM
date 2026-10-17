package g9f;

import kotlin.Lazy;
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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lg9f/q;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_trading_transfer_investments_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class q {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f141570b = {yhm.j.c(yhm.k.PUBLICATION, new g53.e(18))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n0 f141571a;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f141572a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f141572a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.trading.transfer.investments.impl.data.network.model.TransferOutCreateDto", aVar, 1);
            pluginGeneratedSerialDescriptor.j("transferType", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{q.f141570b[0].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = q.f141570b;
            dVarBeginStructure.getClass();
            n0 n0Var = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else {
                    if (iD != 0) {
                        throw new UnknownFieldException(iD);
                    }
                    n0Var = (n0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), n0Var);
                    i = 1;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new q(i, n0Var);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            q value = (q) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = q.f141570b;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f141571a != n0.UNKNOWN) {
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f141571a);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: g9f.q$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f141572a;
        }
    }

    public /* synthetic */ q(int i, n0 n0Var) {
        if ((i & 1) == 0) {
            this.f141571a = n0.UNKNOWN;
        } else {
            this.f141571a = n0Var;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof q) && this.f141571a == ((q) obj2).f141571a;
    }

    public final int hashCode() {
        return this.f141571a.hashCode();
    }

    public q() {
        n0 transferType = n0.UNKNOWN;
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        this.f141571a = transferType;
    }
}
