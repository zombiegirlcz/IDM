package nhl;

import java.util.List;
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
import qlm.j1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lnhl/x;", "Lnhl/a0;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_discovery_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class x implements a0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Lazy[] f215577b = {yhm.j.c(yhm.k.PUBLICATION, new s(1))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215578a;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f215579a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f215579a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.models.ScreenerFilterDto.OptionsFilterDto", aVar, 1);
            pluginGeneratedSerialDescriptor.j("values", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{x.f215577b[0].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = x.f215577b;
            dVarBeginStructure.getClass();
            List list = null;
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
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i = 1;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new x(i, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            x value = (x) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, (mlm.h) x.f215577b[0].getValue(), value.f215578a);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: nhl.x$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f215579a;
        }
    }

    public /* synthetic */ x(int i, List list) {
        if (1 == (i & 1)) {
            this.f215578a = list;
        } else {
            j1.f(a.f215579a.getDescriptor(), i, 1);
            throw null;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        return (obj2 instanceof x) && Intrinsics.f(this.f215578a, ((x) obj2).f215578a);
    }

    public final int hashCode() {
        return this.f215578a.hashCode();
    }

    public x(List values) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.f215578a = values;
    }
}
