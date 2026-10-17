package te6;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import lg.b;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.h;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \r2\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\n\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u000e"}, d2 = {"Lte6/a;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "system", "", "Z", "()Z", "recurrenceSupported", "Companion", "feature_external_accounts_api_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @b("system")
    @NotNull
    private final String system;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @b("recurrenceSupported")
    private final boolean recurrenceSupported;

    /* JADX INFO: renamed from: te6.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1510a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1510a f270037a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1510a c1510a = new C1510a();
            f270037a = c1510a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.external_accounts.api.model.entity.TopUpSettingsEntity", c1510a, 2);
            pluginGeneratedSerialDescriptor.j("system", false);
            pluginGeneratedSerialDescriptor.j("recurrenceSupported", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1510a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, h.f247648a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            boolean z = true;
            int i = 0;
            boolean zDecodeBooleanElement = false;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 1);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, strDecodeStringElement, zDecodeBooleanElement);
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
            a.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: te6.a$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1510a.f270037a;
        }
    }

    public /* synthetic */ a(int i, String str, boolean z) {
        if (3 != (i & 3)) {
            j1.f(C1510a.f270037a.getDescriptor(), i, 3);
            throw null;
        }
        this.system = str;
        this.recurrenceSupported = z;
    }

    public static final /* synthetic */ void c(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, aVar.system);
        compositeEncoder.encodeBooleanElement(serialDescriptor, 1, aVar.recurrenceSupported);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getRecurrenceSupported() {
        return this.recurrenceSupported;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getSystem() {
        return this.system;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.system, aVar.system) && this.recurrenceSupported == aVar.recurrenceSupported;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.recurrenceSupported) + (this.system.hashCode() * 31);
    }

    public a(String system, boolean z) {
        Intrinsics.checkNotNullParameter(system, "system");
        this.system = system;
        this.recurrenceSupported = z;
    }
}
