package v5b;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.n0;
import v5b.c;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0083\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lv5b/b;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Integer f286183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f286184b;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f286185a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f286185a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.CobrandedCardsDowngradeNotEnoughFundsChecker.ServerErrorDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("code", true);
            pluginGeneratedSerialDescriptor.j("params", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(n0.f247680a), nlm.a.c(c.a.f286187a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            Integer num = null;
            boolean z = true;
            int i = 0;
            c cVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    num = (Integer) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, n0.f247680a, num);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, c.a.f286187a, cVar);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, num, cVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            b value = (b) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f286183a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, n0.f247680a, value.f286183a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f286184b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, c.a.f286187a, value.f286184b);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: v5b.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f286185a;
        }
    }

    public b() {
        this.f286183a = null;
        this.f286184b = null;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f286183a, bVar.f286183a) && Intrinsics.f(this.f286184b, bVar.f286184b);
    }

    public final int hashCode() {
        Integer num = this.f286183a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        c cVar = this.f286184b;
        return iHashCode + (cVar != null ? cVar.hashCode() : 0);
    }

    public /* synthetic */ b(int i, Integer num, c cVar) {
        if ((i & 1) == 0) {
            this.f286183a = null;
        } else {
            this.f286183a = num;
        }
        if ((i & 2) == 0) {
            this.f286184b = null;
        } else {
            this.f286184b = cVar;
        }
    }
}
