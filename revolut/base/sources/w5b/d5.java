package w5b;

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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lw5b/d5;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f294813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f294814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f294815c;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f294816a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f294816a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsTransactionBadgeDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("icon", true);
            pluginGeneratedSerialDescriptor.j("text", true);
            pluginGeneratedSerialDescriptor.j("planTier", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.v1 v1Var = qlm.v1.f247718a;
            return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var), nlm.a.c(v1Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String str = null;
            boolean z = true;
            int i = 0;
            String str2 = null;
            String str3 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                    i |= 1;
                } else if (iD == 1) {
                    str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str2);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, str3);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d5(i, str, str2, str3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            d5 value = (d5) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294813a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f294813a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294814b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, value.f294814b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294815c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, qlm.v1.f247718a, value.f294815c);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: w5b.d5$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f294816a;
        }
    }

    public /* synthetic */ d5(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.f294813a = null;
        } else {
            this.f294813a = str;
        }
        if ((i & 2) == 0) {
            this.f294814b = null;
        } else {
            this.f294814b = str2;
        }
        if ((i & 4) == 0) {
            this.f294815c = null;
        } else {
            this.f294815c = str3;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d5)) {
            return false;
        }
        d5 d5Var = (d5) obj2;
        return Intrinsics.f(this.f294813a, d5Var.f294813a) && Intrinsics.f(this.f294814b, d5Var.f294814b) && Intrinsics.f(this.f294815c, d5Var.f294815c);
    }

    public final int hashCode() {
        String str = this.f294813a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f294814b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f294815c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public d5(String str, String str2, String str3) {
        this.f294813a = str;
        this.f294814b = str2;
        this.f294815c = str3;
    }

    public d5() {
        this(null, null, null);
    }
}
