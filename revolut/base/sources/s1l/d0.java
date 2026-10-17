package s1l;

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
import org.jetbrains.annotations.NotNull;
import qlm.v1;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Ls1l/d0;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_travel_status_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class d0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f259168g = {null, null, null, yhm.j.c(yhm.k.PUBLICATION, new s1g.a(4)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f259169a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f259170b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f259171c;
    public final List d;
    public final c0 e;
    public final c0 f;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f259172a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f259172a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.retail.feature.travel_status.impl.data.dto.partner.TravelStatusPartnerLayoutDto.LinkAccountDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("title", true);
            pluginGeneratedSerialDescriptor.j("subtitle", true);
            pluginGeneratedSerialDescriptor.j("avatarUrl", true);
            pluginGeneratedSerialDescriptor.j("inputFields", true);
            pluginGeneratedSerialDescriptor.j("primaryButton", true);
            pluginGeneratedSerialDescriptor.j("secondaryButton", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = d0.f259168g;
            v1 v1Var = v1.f247718a;
            KSerializer kSerializerC = nlm.a.c(v1Var);
            KSerializer kSerializerC2 = nlm.a.c(v1Var);
            KSerializer kSerializerC3 = nlm.a.c(v1Var);
            KSerializer kSerializerC4 = nlm.a.c((KSerializer) lazyArr[3].getValue());
            a0 a0Var = a0.f259158a;
            return new KSerializer[]{kSerializerC, kSerializerC2, kSerializerC3, kSerializerC4, nlm.a.c(a0Var), nlm.a.c(a0Var)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = d0.f259168g;
            dVarBeginStructure.getClass();
            int i = 0;
            String str = null;
            String str2 = null;
            String str3 = null;
            List list = null;
            c0 c0Var = null;
            c0 c0Var2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, str);
                        i |= 1;
                        break;
                    case 1:
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str2);
                        i |= 2;
                        break;
                    case 2:
                        str3 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str3);
                        i |= 4;
                        break;
                    case 3:
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                        i |= 8;
                        break;
                    case 4:
                        c0Var = (c0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, a0.f259158a, c0Var);
                        i |= 16;
                        break;
                    case 5:
                        c0Var2 = (c0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, a0.f259158a, c0Var2);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new d0(i, str, str2, str3, list, c0Var, c0Var2);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            d0 value = (d0) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = d0.f259168g;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f259169a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, v1.f247718a, value.f259169a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f259170b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, value.f259170b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f259171c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, value.f259171c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.e != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, a0.f259158a, value.e);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, a0.f259158a, value.f);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: s1l.d0$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f259172a;
        }
    }

    public /* synthetic */ d0(int i, String str, String str2, String str3, List list, c0 c0Var, c0 c0Var2) {
        if ((i & 1) == 0) {
            this.f259169a = null;
        } else {
            this.f259169a = str;
        }
        if ((i & 2) == 0) {
            this.f259170b = null;
        } else {
            this.f259170b = str2;
        }
        if ((i & 4) == 0) {
            this.f259171c = null;
        } else {
            this.f259171c = str3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = c0Var;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = c0Var2;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj2;
        return Intrinsics.f(this.f259169a, d0Var.f259169a) && Intrinsics.f(this.f259170b, d0Var.f259170b) && Intrinsics.f(this.f259171c, d0Var.f259171c) && Intrinsics.f(this.d, d0Var.d) && Intrinsics.f(this.e, d0Var.e) && Intrinsics.f(this.f, d0Var.f);
    }

    public final int hashCode() {
        String str = this.f259169a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f259170b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f259171c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List list = this.d;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        c0 c0Var = this.e;
        int iHashCode5 = (iHashCode4 + (c0Var == null ? 0 : c0Var.hashCode())) * 31;
        c0 c0Var2 = this.f;
        return iHashCode5 + (c0Var2 != null ? c0Var2.hashCode() : 0);
    }

    public d0(String str, String str2, String str3, ArrayList arrayList, c0 c0Var, c0 c0Var2) {
        this.f259169a = str;
        this.f259170b = str2;
        this.f259171c = str3;
        this.d = arrayList;
        this.e = c0Var;
        this.f = c0Var2;
    }

    public d0() {
        this(null, null, null, null, null, null);
    }
}
