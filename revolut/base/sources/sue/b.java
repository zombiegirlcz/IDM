package sue;

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
import qlm.f0;
import qlm.j1;
import sue.d;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0006\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u0012"}, d2 = {"Lsue/b;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "c", "()Ljo3/a;", "total", "Lsue/d;", "b", "Lsue/d;", "()Lsue/d;", "fees", "taxes", "Companion", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("total")
    @NotNull
    private final jo3.a total;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("fees")
    @NotNull
    private final d fees;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("taxes")
    @NotNull
    private final d taxes;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f265726a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f265726a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.topup_screen.impl.data.network.model.india.IndiaChargesDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("total", false);
            pluginGeneratedSerialDescriptor.j("fees", false);
            pluginGeneratedSerialDescriptor.j("taxes", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            d.a aVar = d.a.f265734a;
            return new KSerializer[]{a.C1001a.f176860a, aVar, aVar};
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
            d dVar = null;
            d dVar2 = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                    i |= 1;
                } else if (iD == 1) {
                    dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, d.a.f265734a, dVar);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    dVar2 = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, d.a.f265734a, dVar2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, aVar, dVar, dVar2);
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
            b.d(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: sue.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f265726a;
        }
    }

    public /* synthetic */ b(int i, jo3.a aVar, d dVar, d dVar2) {
        if (7 != (i & 7)) {
            j1.f(a.f265726a.getDescriptor(), i, 7);
            throw null;
        }
        this.total = aVar;
        this.fees = dVar;
        this.taxes = dVar2;
    }

    public static final /* synthetic */ void d(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, bVar.total);
        d.a aVar = d.a.f265734a;
        compositeEncoder.encodeSerializableElement(serialDescriptor, 1, aVar, bVar.fees);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, aVar, bVar.taxes);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final d getFees() {
        return this.fees;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final d getTaxes() {
        return this.taxes;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final jo3.a getTotal() {
        return this.total;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.total, bVar.total) && Intrinsics.f(this.fees, bVar.fees) && Intrinsics.f(this.taxes, bVar.taxes);
    }

    public final int hashCode() {
        return this.taxes.hashCode() + ((this.fees.hashCode() + (this.total.hashCode() * 31)) * 31);
    }
}
