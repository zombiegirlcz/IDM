package f2e;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lf2e/x4;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_store_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class x4 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Lazy[] f131765g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f131766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f131767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f131768c;
    public final List d;
    public final List e;
    public final boolean f;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f131769a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f131769a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.store.impl.data.network.model.SearchMegaOffersResponseDto", aVar, 6);
            pluginGeneratedSerialDescriptor.j("brands", true);
            pluginGeneratedSerialDescriptor.j("popularBrands", true);
            pluginGeneratedSerialDescriptor.j("products", true);
            pluginGeneratedSerialDescriptor.j("productPurchases", true);
            pluginGeneratedSerialDescriptor.j("voucherPurchases", true);
            pluginGeneratedSerialDescriptor.j("noMatches", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = x4.f131765g;
            return new KSerializer[]{nlm.a.c((KSerializer) lazyArr[0].getValue()), nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c((KSerializer) lazyArr[4].getValue()), qlm.h.f247648a};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = x4.f131765g;
            dVarBeginStructure.getClass();
            int i = 0;
            boolean zDecodeBooleanElement = false;
            List list = null;
            List list2 = null;
            List list3 = null;
            List list4 = null;
            List list5 = null;
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
                        list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list2);
                        i |= 2;
                        break;
                    case 2:
                        list3 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), list3);
                        i |= 4;
                        break;
                    case 3:
                        list4 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list4);
                        i |= 8;
                        break;
                    case 4:
                        list5 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), list5);
                        i |= 16;
                        break;
                    case 5:
                        zDecodeBooleanElement = dVarBeginStructure.decodeBooleanElement(serialDescriptor, 5);
                        i |= 32;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new x4(list, list2, list3, i, list4, zDecodeBooleanElement, list5);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            x4 value = (x4) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = x4.f131765g;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f131766a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f131766a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f131767b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f131767b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f131768c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f131768c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.e != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f) {
                compositeEncoderBeginStructure.encodeBooleanElement(serialDescriptor, 5, value.f);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: f2e.x4$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f131769a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f131765g = new Lazy[]{yhm.j.c(kVar, new i(25)), yhm.j.c(kVar, new i(26)), yhm.j.c(kVar, new i(27)), yhm.j.c(kVar, new i(28)), yhm.j.c(kVar, new i(29)), null};
    }

    public x4() {
        this.f131766a = null;
        this.f131767b = null;
        this.f131768c = null;
        this.d = null;
        this.e = null;
        this.f = false;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof x4)) {
            return false;
        }
        x4 x4Var = (x4) obj2;
        return Intrinsics.f(this.f131766a, x4Var.f131766a) && Intrinsics.f(this.f131767b, x4Var.f131767b) && Intrinsics.f(this.f131768c, x4Var.f131768c) && Intrinsics.f(this.d, x4Var.d) && Intrinsics.f(this.e, x4Var.e) && this.f == x4Var.f;
    }

    public final int hashCode() {
        List list = this.f131766a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f131767b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f131768c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode4 + (list5 != null ? list5.hashCode() : 0)) * 31);
    }

    public /* synthetic */ x4(List list, List list2, List list3, int i, List list4, boolean z, List list5) {
        if ((i & 1) == 0) {
            this.f131766a = null;
        } else {
            this.f131766a = list;
        }
        if ((i & 2) == 0) {
            this.f131767b = null;
        } else {
            this.f131767b = list2;
        }
        if ((i & 4) == 0) {
            this.f131768c = null;
        } else {
            this.f131768c = list3;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = list5;
        }
        if ((i & 32) == 0) {
            this.f = false;
        } else {
            this.f = z;
        }
    }
}
