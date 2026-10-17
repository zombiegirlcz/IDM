package xz8;

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
import qlm.f0;
import qlm.j1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lxz8/a;", "Lxz8/o;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class a extends o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f309886h;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f309887b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f309888c;
    public final uz8.n d;
    public final yz8.c e;
    public final zz8.c f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j f309889g;

    /* JADX INFO: renamed from: xz8.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1724a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1724a f309890a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1724a c1724a = new C1724a();
            f309890a = c1724a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CORRECT", c1724a, 6);
            pluginGeneratedSerialDescriptor.j("actions", true);
            pluginGeneratedSerialDescriptor.j("answers", false);
            pluginGeneratedSerialDescriptor.j("lessonProgress", false);
            pluginGeneratedSerialDescriptor.j("next", false);
            pluginGeneratedSerialDescriptor.j("reward", false);
            pluginGeneratedSerialDescriptor.j("shareReward", true);
            pluginGeneratedSerialDescriptor.l(new n());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1724a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = a.f309886h;
            return new KSerializer[]{nlm.a.c((KSerializer) lazyArr[0].getValue()), e.f309895a, uz8.l.f284639a, lazyArr[3].getValue(), lazyArr[4].getValue(), nlm.a.c(h.f309898a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = a.f309886h;
            dVarBeginStructure.getClass();
            int i = 0;
            List list = null;
            g gVar = null;
            uz8.n nVar = null;
            yz8.c cVar = null;
            zz8.c cVar2 = null;
            j jVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                        i |= 1;
                        break;
                    case 1:
                        gVar = (g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, e.f309895a, gVar);
                        i |= 2;
                        break;
                    case 2:
                        nVar = (uz8.n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, uz8.l.f284639a, nVar);
                        i |= 4;
                        break;
                    case 3:
                        cVar = (yz8.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), cVar);
                        i |= 8;
                        break;
                    case 4:
                        cVar2 = (zz8.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), cVar2);
                        i |= 16;
                        break;
                    case 5:
                        jVar = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, h.f309898a, jVar);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, list, gVar, nVar, cVar, cVar2, jVar);
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
            Lazy[] lazyArr = a.f309886h;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f309887b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f309887b);
            }
            e eVar = e.f309895a;
            g gVar = value.f309888c;
            j jVar = value.f309889g;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, eVar, gVar);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, uz8.l.f284639a, value.d);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.e);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.f);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || jVar != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, h.f309898a, jVar);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xz8.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1724a.f309890a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f309886h = new Lazy[]{yhm.j.c(kVar, new xsf.c(19)), null, null, yhm.j.c(kVar, new xsf.c(20)), yhm.j.c(kVar, new xsf.c(21)), null};
    }

    public /* synthetic */ a(int i, List list, g gVar, uz8.n nVar, yz8.c cVar, zz8.c cVar2, j jVar) {
        if (30 != (i & 30)) {
            j1.f(C1724a.f309890a.getDescriptor(), i, 30);
            throw null;
        }
        if ((i & 1) == 0) {
            this.f309887b = null;
        } else {
            this.f309887b = list;
        }
        this.f309888c = gVar;
        this.d = nVar;
        this.e = cVar;
        this.f = cVar2;
        if ((i & 32) == 0) {
            this.f309889g = null;
        } else {
            this.f309889g = jVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.f309887b, aVar.f309887b) && Intrinsics.f(this.f309888c, aVar.f309888c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e) && Intrinsics.f(this.f, aVar.f) && Intrinsics.f(this.f309889g, aVar.f309889g);
    }

    public final int hashCode() {
        List list = this.f309887b;
        int iHashCode = (this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.f309888c.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31)) * 31)) * 31)) * 31;
        j jVar = this.f309889g;
        return iHashCode + (jVar != null ? jVar.hashCode() : 0);
    }
}
