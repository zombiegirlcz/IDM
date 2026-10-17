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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Luh8/e;", "Luh8/f;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_junior_onboarding_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e implements f {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();
    public static final Lazy[] i = {null, null, null, null, null, null, null, yhm.j.c(yhm.k.PUBLICATION, new u9a.b(17))};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f280141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f280142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f280143c;
    public final String d;
    public final String e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final no3.b f280144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f280145h;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f280146a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f280146a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.junior_onboarding.impl.model.dto.JuniorAccountRequestDto.MainAccountRequestDto", aVar, 8);
            pluginGeneratedSerialDescriptor.j("firstName", false);
            pluginGeneratedSerialDescriptor.j("lastName", false);
            pluginGeneratedSerialDescriptor.j("birthDate", false);
            pluginGeneratedSerialDescriptor.j("relationship", false);
            pluginGeneratedSerialDescriptor.j("gender", false);
            pluginGeneratedSerialDescriptor.j("serviceType", false);
            pluginGeneratedSerialDescriptor.j("address", false);
            pluginGeneratedSerialDescriptor.j("consents", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = e.i;
            KSerializer kSerializerC = nlm.a.c(b.a.f217911a);
            KSerializer kSerializerC2 = nlm.a.c((KSerializer) lazyArr[7].getValue());
            v1 v1Var = v1.f247718a;
            return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, v1Var, v1Var, kSerializerC, kSerializerC2};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = e.i;
            dVarBeginStructure.getClass();
            String strDecodeStringElement = null;
            String strDecodeStringElement2 = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            String strDecodeStringElement5 = null;
            String strDecodeStringElement6 = null;
            no3.b bVar = null;
            List list = null;
            int i = 0;
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
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        strDecodeStringElement6 = dVarBeginStructure.decodeStringElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    case 6:
                        bVar = (no3.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, b.a.f217911a, bVar);
                        i |= 64;
                        break;
                    case 7:
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), list);
                        i |= 128;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, strDecodeStringElement5, strDecodeStringElement6, bVar, list);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            e value = (e) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = e.i;
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 0, value.f280141a);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f280142b);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.f280143c);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.d);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, value.e);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 5, value.f);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, b.a.f217911a, value.f280144g);
            compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), value.f280145h);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: uh8.e$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f280146a;
        }
    }

    public /* synthetic */ e(int i2, String str, String str2, String str3, String str4, String str5, String str6, no3.b bVar, List list) {
        if (255 != (i2 & 255)) {
            j1.f(a.f280146a.getDescriptor(), i2, 255);
            throw null;
        }
        this.f280141a = str;
        this.f280142b = str2;
        this.f280143c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.f280144g = bVar;
        this.f280145h = list;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof e)) {
            return false;
        }
        e eVar = (e) obj2;
        return Intrinsics.f(this.f280141a, eVar.f280141a) && Intrinsics.f(this.f280142b, eVar.f280142b) && Intrinsics.f(this.f280143c, eVar.f280143c) && Intrinsics.f(this.d, eVar.d) && Intrinsics.f(this.e, eVar.e) && Intrinsics.f(this.f, eVar.f) && Intrinsics.f(this.f280144g, eVar.f280144g) && Intrinsics.f(this.f280145h, eVar.f280145h);
    }

    public final int hashCode() {
        int iC = p.a.c(p.a.c(p.a.c(p.a.c(p.a.c(this.f280141a.hashCode() * 31, 31, this.f280142b), 31, this.f280143c), 31, this.d), 31, this.e), 31, this.f);
        no3.b bVar = this.f280144g;
        int iHashCode = (iC + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.f280145h;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public e(String firstName, String lastName, String birthDate, String gender, String serviceType, no3.b bVar, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        Intrinsics.checkNotNullParameter(birthDate, "birthDate");
        Intrinsics.checkNotNullParameter("PARENT", "relationship");
        Intrinsics.checkNotNullParameter(gender, "gender");
        Intrinsics.checkNotNullParameter(serviceType, "serviceType");
        this.f280141a = firstName;
        this.f280142b = lastName;
        this.f280143c = birthDate;
        this.d = "PARENT";
        this.e = gender;
        this.f = serviceType;
        this.f280144g = bVar;
        this.f280145h = arrayList;
    }
}
