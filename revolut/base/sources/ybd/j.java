package ybd;

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
import qlm.v1;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lybd/j;", "Lybd/z;", "", "toString", "()Ljava/lang/String;", "Companion", "ybd/m", "a", "b", "feature_shared_savings_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class j implements z {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f312242a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f312243b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f312244c;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f312245a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f312245a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("CELL_DETAILS", aVar, 3);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("value", false);
            pluginGeneratedSerialDescriptor.j("deeplink", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, k.f312247a, nlm.a.c(v1Var)};
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
            m mVar = null;
            String str = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    mVar = (m) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, k.f312247a, mVar);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new j(i, strDecodeStringElement, mVar, str);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            j value = (j) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f312242a);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, k.f312247a, value.f312243b);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.f312244c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: ybd.j$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f312245a;
        }
    }

    public /* synthetic */ j(int i, String str, m mVar, String str2) {
        if (7 != (i & 7)) {
            j1.f(a.f312245a.getDescriptor(), i, 7);
            throw null;
        }
        this.f312242a = str;
        this.f312243b = mVar;
        this.f312244c = str2;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof j)) {
            return false;
        }
        j jVar = (j) obj2;
        return Intrinsics.f(this.f312242a, jVar.f312242a) && Intrinsics.f(this.f312243b, jVar.f312243b) && Intrinsics.f(this.f312244c, jVar.f312244c);
    }

    public final int hashCode() {
        int iHashCode = (this.f312243b.hashCode() + (this.f312242a.hashCode() * 31)) * 31;
        String str = this.f312244c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public j(String title, m value, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f312242a = title;
        this.f312243b = value;
        this.f312244c = str;
    }
}
