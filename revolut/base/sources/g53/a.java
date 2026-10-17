package g53;

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
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes21.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0081\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0005\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0006\u001a\u0004\b\t\u0010\u0004R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\r\u001a\u0004\b\b\u0010\u000e¨\u0006\u0011"}, d2 = {"Lg53/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "id", "b", "c", "state", "", "Lg53/b;", "Ljava/util/List;", "()Ljava/util/List;", "images", "Companion", "feature_shared_card_personalisation_generation_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] d = {null, null, j.c(k.PUBLICATION, new fyh.k(29))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("id")
    @NotNull
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("state")
    @NotNull
    private final String state;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("images")
    @NotNull
    private final List<b> images;

    /* JADX INFO: renamed from: g53.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C0817a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0817a f140611a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C0817a c0817a = new C0817a();
            f140611a = c0817a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.card_personalisation.generation.impl.network.models.GenerateImageResponseDto", c0817a, 3);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("state", false);
            pluginGeneratedSerialDescriptor.j("images", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C0817a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = a.d;
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, lazyArr[2].getValue()};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = a.d;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            String strDecodeStringElement2 = null;
            List list = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, strDecodeStringElement2, list);
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

    /* JADX INFO: renamed from: g53.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C0817a.f140611a;
        }
    }

    public /* synthetic */ a(int i, String str, String str2, List list) {
        if (7 != (i & 7)) {
            j1.f(C0817a.f140611a.getDescriptor(), i, 7);
            throw null;
        }
        this.id = str;
        this.state = str2;
        this.images = list;
    }

    public static final /* synthetic */ void d(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.id);
        compositeEncoder.encodeStringElement(serialDescriptor, 1, aVar.state);
        compositeEncoder.encodeSerializableElement(serialDescriptor, 2, (h) d[2].getValue(), aVar.images);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final List getImages() {
        return this.images;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getState() {
        return this.state;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.id, aVar.id) && Intrinsics.f(this.state, aVar.state) && Intrinsics.f(this.images, aVar.images);
    }

    public final int hashCode() {
        return this.images.hashCode() + p.a.c(this.id.hashCode() * 31, 31, this.state);
    }
}
