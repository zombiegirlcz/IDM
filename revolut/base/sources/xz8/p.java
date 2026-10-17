package xz8;

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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lxz8/p;", "Lxz8/o;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class p extends o {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g f309906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final uz8.n f309907c;
    public final j d;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f309908a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f309908a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("WRONG", aVar, 3);
            pluginGeneratedSerialDescriptor.j("answers", false);
            pluginGeneratedSerialDescriptor.j("lessonProgress", false);
            pluginGeneratedSerialDescriptor.j("shareReward", true);
            pluginGeneratedSerialDescriptor.l(new n());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{e.f309895a, uz8.l.f284639a, nlm.a.c(h.f309898a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            g gVar = null;
            boolean z = true;
            int i = 0;
            uz8.n nVar = null;
            j jVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    gVar = (g) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, e.f309895a, gVar);
                    i |= 1;
                } else if (iD == 1) {
                    nVar = (uz8.n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, uz8.l.f284639a, nVar);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    jVar = (j) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, h.f309898a, jVar);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new p(i, gVar, nVar, jVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            p value = (p) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Companion companion = p.INSTANCE;
            e eVar = e.f309895a;
            g gVar = value.f309906b;
            j jVar = value.d;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, eVar, gVar);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, uz8.l.f284639a, value.f309907c);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || jVar != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, h.f309898a, jVar);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: xz8.p$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f309908a;
        }
    }

    public /* synthetic */ p(int i, g gVar, uz8.n nVar, j jVar) {
        if (3 != (i & 3)) {
            j1.f(a.f309908a.getDescriptor(), i, 3);
            throw null;
        }
        this.f309906b = gVar;
        this.f309907c = nVar;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = jVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof p)) {
            return false;
        }
        p pVar = (p) obj2;
        return Intrinsics.f(this.f309906b, pVar.f309906b) && Intrinsics.f(this.f309907c, pVar.f309907c) && Intrinsics.f(this.d, pVar.d);
    }

    public final int hashCode() {
        int iHashCode = (this.f309907c.hashCode() + (this.f309906b.hashCode() * 31)) * 31;
        j jVar = this.d;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }
}
