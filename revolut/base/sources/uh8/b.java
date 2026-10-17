package uh8;

import java.util.ArrayList;
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
import no3.b;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Luh8/b;", "Luh8/f;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b implements f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f280131g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new u9a.b(16)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280132a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280133b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f280134c;
    public final List d;
    public final String e;
    public final no3.b f;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f280135a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f280135a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior_onboarding.impl.model.dto.JuniorAccountRequestDto.AccountConversionRequestDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("individualId", false);
            pluginGeneratedSerialDescriptor.j("firstName", false);
            pluginGeneratedSerialDescriptor.j("lastName", false);
            pluginGeneratedSerialDescriptor.j("consents", false);
            pluginGeneratedSerialDescriptor.j("serviceType", false);
            pluginGeneratedSerialDescriptor.j("address", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            KSerializer kSerializerC = nlm.a.c((KSerializer) b.f280131g[3].getValue());
            KSerializer kSerializerC2 = nlm.a.c(b.a.f217911a);
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, kSerializerC, v1Var, kSerializerC2};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b.f280131g;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            List list = null;
            String strDecodeStringElement4 = null;
            no3.b bVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                        break;
                    case 1:
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                        break;
                    case 3:
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                        i |= 8;
                        break;
                    case 4:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        bVar = (no3.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, b.a.f217911a, bVar);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, list, strDecodeStringElement4, bVar);
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
            Lazy[] lazyArr = b.f280131g;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f280132a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f280133b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f280134c);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, b.a.f217911a, value.f);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: uh8.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f280135a;
        }
    }

    public /* synthetic */ b(int i, String str, String str2, String str3, List list, String str4, no3.b bVar) {
        if (63 != (i & 63)) {
            j1.f(a.f280135a.getDescriptor(), i, 63);
            throw null;
        }
        this.f280132a = str;
        this.f280133b = str2;
        this.f280134c = str3;
        this.d = list;
        this.e = str4;
        this.f = bVar;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f280132a, bVar.f280132a) && Intrinsics.f(this.f280133b, bVar.f280133b) && Intrinsics.f(this.f280134c, bVar.f280134c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && Intrinsics.f(this.f, bVar.f);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(this.f280132a.hashCode() * 31, 31, this.f280133b), 31, this.f280134c);
        List list = this.d;
        int iC2 = p.a.c((iC + (list == null ? 0 : list.hashCode())) * 31, 31, this.e);
        no3.b bVar = this.f;
        return iC2 + (bVar != null ? bVar.hashCode() : 0);
    }

    public b(String individualId, String firstName, String lastName, ArrayList arrayList, String serviceType, no3.b bVar) {
        Intrinsics.checkNotNullParameter(individualId, "individualId");
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f280132a = individualId;
        this.f280133b = firstName;
        this.f280134c = lastName;
        this.d = arrayList;
        this.e = serviceType;
        this.f = bVar;
    }
}
