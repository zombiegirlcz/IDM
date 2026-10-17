package nhl;

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

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lnhl/r;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_discovery_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class r {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Lazy[] f215557h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f215558a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f215559b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f215560c;
    public final List d;
    public final List e;
    public final List f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f215561g;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f215562a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f215562a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth_discovery.domain.impl.data.network.screener.models.ScreenerConfigDto", aVar, 7);
            pluginGeneratedSerialDescriptor.j("assetCountries", true);
            pluginGeneratedSerialDescriptor.j("supportedMetricsFilter", true);
            pluginGeneratedSerialDescriptor.j("currencies", true);
            pluginGeneratedSerialDescriptor.j("geoExposures", true);
            pluginGeneratedSerialDescriptor.j("brands", true);
            pluginGeneratedSerialDescriptor.j("underlyingAssetTypes", true);
            pluginGeneratedSerialDescriptor.j("issuerCountries", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = r.f215557h;
            return new KSerializer[]{nlm.a.c((KSerializer) lazyArr[0].getValue()), nlm.a.c((KSerializer) lazyArr[1].getValue()), nlm.a.c((KSerializer) lazyArr[2].getValue()), nlm.a.c((KSerializer) lazyArr[3].getValue()), nlm.a.c((KSerializer) lazyArr[4].getValue()), nlm.a.c((KSerializer) lazyArr[5].getValue()), nlm.a.c((KSerializer) lazyArr[6].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = r.f215557h;
            dVarBeginStructure.getClass();
            int i = 0;
            List list = null;
            List list2 = null;
            List list3 = null;
            List list4 = null;
            List list5 = null;
            List list6 = null;
            List list7 = null;
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
                        list6 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list6);
                        i |= 32;
                        break;
                    case 6:
                        list7 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list7);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new r(i, list, list2, list3, list4, list5, list6, list7);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            r value = (r) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = r.f215557h;
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f215558a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, (mlm.h) lazyArr[0].getValue(), value.f215558a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f215559b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f215559b);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f215560c != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, (mlm.h) lazyArr[2].getValue(), value.f215560c);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.d != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.d);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.e != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.e);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f215561g != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f215561g);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: nhl.r$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f215562a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f215557h = new Lazy[]{yhm.j.c(kVar, new n85.b(22)), yhm.j.c(kVar, new n85.b(23)), yhm.j.c(kVar, new n85.b(24)), yhm.j.c(kVar, new n85.b(25)), yhm.j.c(kVar, new n85.b(26)), yhm.j.c(kVar, new n85.b(27)), yhm.j.c(kVar, new n85.b(28))};
    }

    public /* synthetic */ r(int i, List list, List list2, List list3, List list4, List list5, List list6, List list7) {
        if ((i & 1) == 0) {
            this.f215558a = null;
        } else {
            this.f215558a = list;
        }
        if ((i & 2) == 0) {
            this.f215559b = null;
        } else {
            this.f215559b = list2;
        }
        if ((i & 4) == 0) {
            this.f215560c = null;
        } else {
            this.f215560c = list3;
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
            this.f = null;
        } else {
            this.f = list6;
        }
        if ((i & 64) == 0) {
            this.f215561g = null;
        } else {
            this.f215561g = list7;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof r)) {
            return false;
        }
        r rVar = (r) obj2;
        return Intrinsics.f(this.f215558a, rVar.f215558a) && Intrinsics.f(this.f215559b, rVar.f215559b) && Intrinsics.f(this.f215560c, rVar.f215560c) && Intrinsics.f(this.d, rVar.d) && Intrinsics.f(this.e, rVar.e) && Intrinsics.f(this.f, rVar.f) && Intrinsics.f(this.f215561g, rVar.f215561g);
    }

    public final int hashCode() {
        List list = this.f215558a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List list2 = this.f215559b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        List list3 = this.f215560c;
        int iHashCode3 = (iHashCode2 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List list4 = this.d;
        int iHashCode4 = (iHashCode3 + (list4 == null ? 0 : list4.hashCode())) * 31;
        List list5 = this.e;
        int iHashCode5 = (iHashCode4 + (list5 == null ? 0 : list5.hashCode())) * 31;
        List list6 = this.f;
        int iHashCode6 = (iHashCode5 + (list6 == null ? 0 : list6.hashCode())) * 31;
        List list7 = this.f215561g;
        return iHashCode6 + (list7 != null ? list7.hashCode() : 0);
    }

    public r(ArrayList arrayList, ArrayList arrayList2, List list, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6) {
        this.f215558a = arrayList;
        this.f215559b = arrayList2;
        this.f215560c = list;
        this.d = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
        this.f215561g = arrayList6;
    }

    public r() {
        this(null, null, null, null, null, null, null);
    }
}
