package fed;

import java.time.LocalDate;
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
import qlm.v1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lfed/c0;", "Lfed/f;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_data_core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c0 extends f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new a0(1)), null};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f134511b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final iel.j f134512c;
    public final LocalDate d;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f134513a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f134513a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("UNKNOWN", aVar, 3);
            pluginGeneratedSerialDescriptor.j("eventId", false);
            pluginGeneratedSerialDescriptor.j("type", false);
            pluginGeneratedSerialDescriptor.j("effectiveDate", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, c0.e[1].getValue(), ie0.m.f160609a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = c0.e;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            iel.j jVar = null;
            LocalDate localDate = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    jVar = (iel.j) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), jVar);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    localDate = (LocalDate) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, ie0.m.f160609a, localDate);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c0(i, strDecodeStringElement, jVar, localDate);
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
            Lazy[] lazyArr = c0.e;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f134511b);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f134512c);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, ie0.m.f160609a, value.d);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: fed.c0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f134513a;
        }
    }

    public /* synthetic */ c0(int i, String str, iel.j jVar, LocalDate localDate) {
        if (7 != (i & 7)) {
            j1.f(a.f134513a.getDescriptor(), i, 7);
            throw null;
        }
        this.f134511b = str;
        this.f134512c = jVar;
        this.d = localDate;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj2;
        return Intrinsics.f(this.f134511b, c0Var.f134511b) && this.f134512c == c0Var.f134512c && Intrinsics.f(this.d, c0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.f134512c.hashCode() + (this.f134511b.hashCode() * 31)) * 31);
    }
}
