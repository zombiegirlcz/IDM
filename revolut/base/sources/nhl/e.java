package nhl;

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
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lnhl/e;", "Lnhl/g;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_discovery_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e implements g {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f215515a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f215516b;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f215517a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f215517a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.models.MetricValueDto.Money", aVar, 2);
            pluginGeneratedSerialDescriptor.j("amount", false);
            pluginGeneratedSerialDescriptor.j("currency", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{qlm.t0.f247706a, v1.f247718a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            long jDecodeLongElement = 0;
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e(i, jDecodeLongElement, strDecodeStringElement);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            e value = (e) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeLongElement(serialDescriptor, 0, value.f215515a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f215516b);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: nhl.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f215517a;
        }
    }

    public /* synthetic */ e(int i, long j2, String str) {
        if (3 != (i & 3)) {
            j1.f(a.f215517a.getDescriptor(), i, 3);
            throw null;
        }
        this.f215515a = j2;
        this.f215516b = str;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return this.f215515a == eVar.f215515a && Intrinsics.f(this.f215516b, eVar.f215516b);
    }

    public final int hashCode() {
        return this.f215516b.hashCode() + (Long.hashCode(this.f215515a) * 31);
    }

    public e(long j2, String currency) {
        Intrinsics.checkNotNullParameter(currency, "currency");
        this.f215515a = j2;
        this.f215516b = currency;
    }
}
