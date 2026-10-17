package j3c;

import j3c.a0;
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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u0006\rJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R$\u0010\u000b\u001a\u00060\u0002j\u0002`\u00058\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\t\u0010\n\u001a\u0004\b\b\u0010\u0004R \u0010\u0012\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\n\u001a\u0004\b\u000f\u0010\u0010R \u0010\u0019\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\n\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lj3c/a;", "", "", "toString", "()Ljava/lang/String;", "Lcom/revolut/feature/revolut_shop/api/domain/model/Sku;", "a", "Ljava/lang/String;", "getSku", "getSku$annotations", "()V", "sku", "", "b", "J", "getCount", "()J", "getCount$annotations", "count", "Lj3c/a0;", "c", "Lj3c/a0;", "getMetadata", "()Lj3c/a0;", "getMetadata$annotations", "metadata", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("sku")
    @NotNull
    private final String sku;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("count")
    private final long count;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("metadata")
    @NotNull
    private final a0 metadata;

    /* JADX INFO: renamed from: j3c.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0968a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0968a f171017a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0968a c0968a = new C0968a();
            f171017a = c0968a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.AddCartItemRequestDto", c0968a, 3);
            pluginGeneratedSerialDescriptor.j("sku", false);
            pluginGeneratedSerialDescriptor.j("count", false);
            pluginGeneratedSerialDescriptor.j("metadata", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0968a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, t0.f247706a, a0.a.f171019a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            a0 a0Var = null;
            long jDecodeLongElement = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    a0Var = (a0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a0.a.f171019a, a0Var);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, jDecodeLongElement, a0Var);
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

    /* JADX INFO: renamed from: j3c.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0968a.f171017a;
        }
    }

    public /* synthetic */ a(int i, String str, long j2, a0 a0Var) {
        if (7 != (i & 7)) {
            j1.f(C0968a.f171017a.getDescriptor(), i, 7);
            throw null;
        }
        this.sku = str;
        this.count = j2;
        this.metadata = a0Var;
    }

    public static final /* synthetic */ void a(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.sku);
        compositeEncoder.encodeLongElement(serialDescriptor, 1, aVar.count);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, a0.a.f171019a, aVar.metadata);
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.sku, aVar.sku) && this.count == aVar.count && Intrinsics.f(this.metadata, aVar.metadata);
    }

    public final int hashCode() {
        return this.metadata.hashCode() + a0.d.c(this.sku.hashCode() * 31, 31, this.count);
    }

    public a(String sku, long j2, a0 metadata) {
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(metadata, "metadata");
        this.sku = sku;
        this.count = j2;
        this.metadata = metadata;
    }
}
