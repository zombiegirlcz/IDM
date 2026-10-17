package xhf;

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
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0006\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u0007\u001a\u0004\b\u000e\u0010\b¨\u0006\u0011"}, d2 = {"Lxhf/c0;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "()Ljo3/a;", "fee", "b", "getGoodsAndServiceTax", "goodsAndServiceTax", "c", "getTaxesCollectedAtSource", "taxesCollectedAtSource", "Companion", "feature_transactions_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("fee")
    private final jo3.a fee;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("gst")
    private final jo3.a goodsAndServiceTax;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("tcs")
    private final jo3.a taxesCollectedAtSource;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f305897a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f305897a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.transactions.dto.IndiaChargesDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("fee", false);
            pluginGeneratedSerialDescriptor.j("goodsAndServiceTax", false);
            pluginGeneratedSerialDescriptor.j("taxesCollectedAtSource", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            a.C1001a c1001a = a.C1001a.f176860a;
            return new KSerializer[]{nlm.a.c(c1001a), nlm.a.c(c1001a), nlm.a.c(c1001a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            jo3.a aVar = null;
            boolean z = true;
            int i = 0;
            jo3.a aVar2 = null;
            jo3.a aVar3 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    aVar = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                    i |= 1;
                } else if (iD == 1) {
                    aVar2 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar2);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    aVar3 = (jo3.a) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, a.C1001a.f176860a, aVar3);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c0(i, aVar, aVar2, aVar3);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            c0 value = (c0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            c0.b(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xhf.c0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f305897a;
        }
    }

    public /* synthetic */ c0(int i, jo3.a aVar, jo3.a aVar2, jo3.a aVar3) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f305897a.getDescriptor(), i, 7);
            throw null;
        }
        this.fee = aVar;
        this.goodsAndServiceTax = aVar2;
        this.taxesCollectedAtSource = aVar3;
    }

    public static final /* synthetic */ void b(c0 c0Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        a.C1001a c1001a = a.C1001a.f176860a;
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 0, c1001a, c0Var.fee);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, c1001a, c0Var.goodsAndServiceTax);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, c1001a, c0Var.taxesCollectedAtSource);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final jo3.a getFee() {
        return this.fee;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.fee, c0Var.fee) && Intrinsics.f(this.goodsAndServiceTax, c0Var.goodsAndServiceTax) && Intrinsics.f(this.taxesCollectedAtSource, c0Var.taxesCollectedAtSource);
    }

    public final int hashCode() {
        jo3.a aVar = this.fee;
        int iHashCode = (aVar == null ? 0 : aVar.hashCode()) * 31;
        jo3.a aVar2 = this.goodsAndServiceTax;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        jo3.a aVar3 = this.taxesCollectedAtSource;
        return iHashCode2 + (aVar3 != null ? aVar3.hashCode() : 0);
    }
}
