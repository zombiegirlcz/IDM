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
import yhf.b;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0002\u0006\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0013"}, d2 = {"Lyhf/a;", "", "", "toString", "()Ljava/lang/String;", "", "a", "Ljava/lang/Long;", "()Ljava/lang/Long;", "amount", "b", "Ljava/lang/String;", "currency", "Lyhf/b;", "c", "Lyhf/b;", "()Lyhf/b;", "payout", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("amount")
    private final Long amount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("currency")
    private final String currency;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("payout")
    private final b payout;

    /* JADX INFO: renamed from: yhf.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1749a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1749a f313929a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1749a c1749a = new C1749a();
            f313929a = c1749a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.details.AcquiringCashbackDto", c1749a, 3);
            pluginGeneratedSerialDescriptor.j("amount", false);
            pluginGeneratedSerialDescriptor.j("currency", false);
            pluginGeneratedSerialDescriptor.j("payout", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1749a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(t0.f247706a), nlm.a.c(v1.f247718a), nlm.a.c(b.a.f313937a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            Long l2 = null;
            boolean z = true;
            int i = 0;
            String str = null;
            b bVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    l2 = (Long) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, t0.f247706a, l2);
                    i |= 1;
                } else if (iD == 1) {
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b.a.f313937a, bVar);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, l2, str, bVar);
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
            a.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: yhf.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1749a.f313929a;
        }
    }

    public /* synthetic */ a(int i, Long l2, String str, b bVar) {
        if (7 != (i & 7)) {
            j1.f(C1749a.f313929a.getDescriptor(), i, 7);
            throw null;
        }
        this.amount = l2;
        this.currency = str;
        this.payout = bVar;
    }

    public static final /* synthetic */ void d(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, t0.f247706a, aVar.amount);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, aVar.currency);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, b.a.f313937a, aVar.payout);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Long getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCurrency() {
        return this.currency;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b getPayout() {
        return this.payout;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.amount, aVar.amount) && Intrinsics.f(this.currency, aVar.currency) && Intrinsics.f(this.payout, aVar.payout);
    }

    public final int hashCode() {
        Long l2 = this.amount;
        int iHashCode = (l2 == null ? 0 : l2.hashCode()) * 31;
        String str = this.currency;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        b bVar = this.payout;
        return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }
}
