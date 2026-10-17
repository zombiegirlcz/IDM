package sg6;

import jo3.a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import lg.b;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0081\b\u0018\u0000 \u00152\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u000b\u001a\u0004\b\u0010\u0010\rR\u001c\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u000b\u001a\u0004\b\u0013\u0010\r¨\u0006\u0016"}, d2 = {"Lsg6/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getLimitName", "limitName", "Ljo3/a;", "b", "Ljo3/a;", "getMinAmount", "()Ljo3/a;", "minAmount", "c", "getMaxAmount", "maxAmount", "d", "getCurrentAmount", "currentAmount", "Companion", "feature_external_accounts_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("limitName")
    @NotNull
    private final String limitName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("minAmount")
    private final jo3.a minAmount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @b("maxAmount")
    private final jo3.a maxAmount;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @b("currentAmount")
    private final jo3.a currentAmount;

    /* JADX INFO: renamed from: sg6.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1459a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1459a f262598a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1459a c1459a = new C1459a();
            f262598a = c1459a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.impl.domain.pse.limits.LimitDto", c1459a, 4);
            pluginGeneratedSerialDescriptor.j("limitName", false);
            pluginGeneratedSerialDescriptor.j("minAmount", true);
            pluginGeneratedSerialDescriptor.j("maxAmount", true);
            pluginGeneratedSerialDescriptor.j("currentAmount", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1459a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            a.C1001a c1001a = a.C1001a.f176860a;
            return new KSerializer[]{v1.f247718a, nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(c1001a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            jo3.a aVar = null;
            jo3.a aVar2 = null;
            jo3.a aVar3 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                    i |= 2;
                } else if (iD == 2) {
                    aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    aVar3 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar3);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, aVar, aVar2, aVar3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            a value = (a) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            a.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: sg6.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1459a.f262598a;
        }
    }

    public /* synthetic */ a(int i, String str, jo3.a aVar, jo3.a aVar2, jo3.a aVar3) {
        if (1 != (i & 1)) {
            j1.f(C1459a.f262598a.getDescriptor(), i, 1);
            throw null;
        }
        this.limitName = str;
        if ((i & 2) == 0) {
            this.minAmount = null;
        } else {
            this.minAmount = aVar;
        }
        if ((i & 4) == 0) {
            this.maxAmount = null;
        } else {
            this.maxAmount = aVar2;
        }
        if ((i & 8) == 0) {
            this.currentAmount = null;
        } else {
            this.currentAmount = aVar3;
        }
    }

    public static final /* synthetic */ void a(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.limitName);
        if (compositeEncoder.d(serialDescriptor) || aVar.minAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar.minAmount);
        }
        if (compositeEncoder.d(serialDescriptor) || aVar.maxAmount != null) {
            compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar.maxAmount);
        }
        if (!compositeEncoder.d(serialDescriptor) && aVar.currentAmount == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, a.C1001a.f176860a, aVar.currentAmount);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.limitName, aVar.limitName) && Intrinsics.f(this.minAmount, aVar.minAmount) && Intrinsics.f(this.maxAmount, aVar.maxAmount) && Intrinsics.f(this.currentAmount, aVar.currentAmount);
    }

    public final int hashCode() {
        int iHashCode = this.limitName.hashCode() * 31;
        jo3.a aVar = this.minAmount;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        jo3.a aVar2 = this.maxAmount;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.currentAmount;
        return iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0);
    }
}
