package uh8;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import no3.b;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Luh8/c;", "Luh8/f;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c implements f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final no3.b f280138c;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f280139a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f280139a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior_onboarding.impl.model.dto.JuniorAccountRequestDto.AdditionalAccountRequestDto", aVar, 3);
            pluginGeneratedSerialDescriptor.j("individualId", false);
            pluginGeneratedSerialDescriptor.j("serviceType", false);
            pluginGeneratedSerialDescriptor.j("address", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c(b.a.f217911a);
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, kSerializerC};
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
            String strDecodeStringElement2 = null;
            no3.b bVar = null;
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
                    bVar = (no3.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b.a.f217911a, bVar);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c(i, strDecodeStringElement, strDecodeStringElement2, bVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            c value = (c) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f280136a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f280137b);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, b.a.f217911a, value.f280138c);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: uh8.c$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f280139a;
        }
    }

    public /* synthetic */ c(int i, String str, String str2, no3.b bVar) {
        if (7 != (i & 7)) {
            j1.f(a.f280139a.getDescriptor(), i, 7);
            throw null;
        }
        this.f280136a = str;
        this.f280137b = str2;
        this.f280138c = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof c)) {
            return false;
        }
        c cVar = (c) obj2;
        return Intrinsics.f(this.f280136a, cVar.f280136a) && Intrinsics.f(this.f280137b, cVar.f280137b) && Intrinsics.f(this.f280138c, cVar.f280138c);
    }

    public final int hashCode() {
        int iC = p.a.c(this.f280136a.hashCode() * 31, 31, this.f280137b);
        no3.b bVar = this.f280138c;
        return iC + (bVar == null ? 0 : bVar.hashCode());
    }

    public c(String individualId, String serviceType, no3.b bVar) {
        Intrinsics.checkNotNullParameter(individualId, "individualId");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f280136a = individualId;
        this.f280137b = serviceType;
        this.f280138c = bVar;
    }
}
