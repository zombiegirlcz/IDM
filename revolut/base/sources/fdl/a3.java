package fdl;

import java.math.BigDecimal;
import java.time.LocalDate;
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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lfdl/a3;", "Lfdl/s2;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class a3 extends s2 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134016b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final LocalDate f134017c;
    public final BigDecimal d;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f134018a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f134018a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("STOCK_DIVIDEND", aVar, 3);
            pluginGeneratedSerialDescriptor.j("ref", false);
            pluginGeneratedSerialDescriptor.j("payDate", false);
            pluginGeneratedSerialDescriptor.j("quantity", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{qlm.v1.f247718a, ie0.m.f160609a, ie0.a.f160587a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            LocalDate localDate = null;
            BigDecimal bigDecimal = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    localDate = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, ie0.m.f160609a, localDate);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    bigDecimal = (BigDecimal) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.a.f160587a, bigDecimal);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a3(i, strDecodeStringElement, localDate, bigDecimal);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            a3 value = (a3) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f134016b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, ie0.m.f160609a, value.f134017c);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.a.f160587a, value.d);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: fdl.a3$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f134018a;
        }
    }

    public /* synthetic */ a3(int i, String str, LocalDate localDate, BigDecimal bigDecimal) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f134018a.getDescriptor(), i, 7);
            throw null;
        }
        this.f134016b = str;
        this.f134017c = localDate;
        this.d = bigDecimal;
    }

    @Override // fdl.s2
    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getF134089c() {
        return this.f134017c;
    }

    @Override // fdl.s2
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF134088b() {
        return this.f134016b;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a3)) {
            return false;
        }
        a3 a3Var = (a3) obj2;
        return Intrinsics.f(this.f134016b, a3Var.f134016b) && Intrinsics.f(this.f134017c, a3Var.f134017c) && Intrinsics.f(this.d, a3Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + wp5.y.a(this.f134016b.hashCode() * 31, 31, this.f134017c);
    }

    public a3(String ref2, LocalDate payDate, BigDecimal quantity) {
        Intrinsics.checkNotNullParameter(ref2, "ref");
        Intrinsics.checkNotNullParameter(payDate, "payDate");
        Intrinsics.checkNotNullParameter(quantity, "quantity");
        this.f134016b = ref2;
        this.f134017c = payDate;
        this.d = quantity;
    }
}
