package uz8;

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
import qlm.f0;
import qlm.j1;
import qlm.n0;
import qlm.v1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Luz8/b;", "Luz8/i;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b extends i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Lazy[] f284624p;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f284625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284626c;
    public final String d;
    public final String e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pz8.b f284627g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f284628h;
    public final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wz8.h f284629j;
    public final zz8.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f284630l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f284631m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f284632n;
    public final int o;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f284633a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f284633a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ARTICLE", aVar, 14);
            pluginGeneratedSerialDescriptor.j("contentCards", false);
            pluginGeneratedSerialDescriptor.j("courseId", false);
            pluginGeneratedSerialDescriptor.j("coverImage", true);
            pluginGeneratedSerialDescriptor.j("id", false);
            pluginGeneratedSerialDescriptor.j("index", false);
            pluginGeneratedSerialDescriptor.j("mode", true);
            pluginGeneratedSerialDescriptor.j("preconditions", true);
            pluginGeneratedSerialDescriptor.j("progress", false);
            pluginGeneratedSerialDescriptor.j("quiz", true);
            pluginGeneratedSerialDescriptor.j("reward", false);
            pluginGeneratedSerialDescriptor.j("rewardStatus", false);
            pluginGeneratedSerialDescriptor.j("thumbnail", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("totalLessons", false);
            Intrinsics.checkNotNullParameter("type", "discriminator");
            pluginGeneratedSerialDescriptor.l(new uz8.a());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = b.f284624p;
            v1 v1Var = v1.f247718a;
            n0 n0Var = n0.f247680a;
            return new KSerializer[]{lazyArr[0].getValue(), v1Var, nlm.a.c(v1Var), v1Var, n0Var, nlm.a.c((KSerializer) lazyArr[5].getValue()), nlm.a.c((KSerializer) lazyArr[6].getValue()), l.f284639a, nlm.a.c(wz8.f.f301384a), lazyArr[9].getValue(), lazyArr[10].getValue(), v1Var, v1Var, n0Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Lazy[] lazyArr;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr2 = b.f284624p;
            dVarBeginStructure.getClass();
            wz8.h hVar = null;
            zz8.c cVar = null;
            r rVar = null;
            List list = null;
            String strDecodeStringElement = null;
            String str = null;
            String strDecodeStringElement2 = null;
            pz8.b bVar = null;
            List list2 = null;
            n nVar = null;
            String strDecodeStringElement3 = null;
            String strDecodeStringElement4 = null;
            int i = 0;
            boolean z = true;
            int iDecodeIntElement = 0;
            int iDecodeIntElement2 = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        lazyArr = lazyArr2;
                        z = false;
                        break;
                    case 0:
                        lazyArr = lazyArr2;
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                        i |= 1;
                        break;
                    case 1:
                        lazyArr = lazyArr2;
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                        break;
                    case 2:
                        lazyArr = lazyArr2;
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
                        i |= 4;
                        break;
                    case 3:
                        lazyArr = lazyArr2;
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                        break;
                    case 4:
                        lazyArr = lazyArr2;
                        iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                        i |= 16;
                        break;
                    case 5:
                        lazyArr = lazyArr2;
                        bVar = (pz8.b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), bVar);
                        i |= 32;
                        break;
                    case 6:
                        lazyArr = lazyArr2;
                        list2 = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list2);
                        i |= 64;
                        break;
                    case 7:
                        lazyArr = lazyArr2;
                        nVar = (n) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, l.f284639a, nVar);
                        i |= 128;
                        break;
                    case 8:
                        lazyArr = lazyArr2;
                        hVar = (wz8.h) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 8, wz8.f.f301384a, hVar);
                        i |= 256;
                        break;
                    case 9:
                        lazyArr = lazyArr2;
                        cVar = (zz8.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), cVar);
                        i |= 512;
                        break;
                    case 10:
                        lazyArr = lazyArr2;
                        rVar = (r) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, (mlm.b) lazyArr2[10].getValue(), rVar);
                        i |= 1024;
                        break;
                    case 11:
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 11);
                        i |= 2048;
                        continue;
                    case 12:
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 12);
                        i |= 4096;
                        continue;
                    case 13:
                        iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 13);
                        i |= 8192;
                        continue;
                    default:
                        throw new UnknownFieldException(iD);
                }
                lazyArr2 = lazyArr;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b(i, list, strDecodeStringElement, str, strDecodeStringElement2, iDecodeIntElement, bVar, list2, nVar, hVar, cVar, rVar, strDecodeStringElement3, strDecodeStringElement4, iDecodeIntElement2);
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
            Lazy[] lazyArr = b.f284624p;
            mlm.h hVar = (mlm.h) lazyArr[0].getValue();
            List list = value.f284625b;
            wz8.h hVar2 = value.f284629j;
            List list2 = value.f284628h;
            pz8.b bVar = value.f284627g;
            String str = value.d;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, list);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f284626c);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || str != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, v1.f247718a, str);
            }
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 3, value.e);
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 4, value.f);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || bVar != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), bVar);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || list2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), list2);
            }
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, l.f284639a, value.i);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || hVar2 != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 8, wz8.f.f301384a, hVar2);
            }
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.k);
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.f284630l);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 11, value.f284631m);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 12, value.f284632n);
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 13, value.o);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: uz8.b$b, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f284633a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f284624p = new Lazy[]{yhm.j.c(kVar, new ux7.g(16)), null, null, null, null, yhm.j.c(kVar, new ux7.g(17)), yhm.j.c(kVar, new ux7.g(18)), null, null, yhm.j.c(kVar, new ux7.g(19)), yhm.j.c(kVar, new ux7.g(20)), null, null, null};
    }

    public /* synthetic */ b(int i, List list, String str, String str2, String str3, int i2, pz8.b bVar, List list2, n nVar, wz8.h hVar, zz8.c cVar, r rVar, String str4, String str5, int i3) {
        if (16027 != (i & 16027)) {
            j1.f(a.f284633a.getDescriptor(), i, 16027);
            throw null;
        }
        this.f284625b = list;
        this.f284626c = str;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        this.e = str3;
        this.f = i2;
        if ((i & 32) == 0) {
            this.f284627g = null;
        } else {
            this.f284627g = bVar;
        }
        if ((i & 64) == 0) {
            this.f284628h = null;
        } else {
            this.f284628h = list2;
        }
        this.i = nVar;
        if ((i & 256) == 0) {
            this.f284629j = null;
        } else {
            this.f284629j = hVar;
        }
        this.k = cVar;
        this.f284630l = rVar;
        this.f284631m = str4;
        this.f284632n = str5;
        this.o = i3;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getF284645b() {
        return this.f284625b;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF284646c() {
        return this.f284626c;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getD() {
        return this.d;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getE() {
        return this.e;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getF() {
        return this.f;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof b)) {
            return false;
        }
        b bVar = (b) obj2;
        return Intrinsics.f(this.f284625b, bVar.f284625b) && Intrinsics.f(this.f284626c, bVar.f284626c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e) && this.f == bVar.f && this.f284627g == bVar.f284627g && Intrinsics.f(this.f284628h, bVar.f284628h) && Intrinsics.f(this.i, bVar.i) && Intrinsics.f(this.f284629j, bVar.f284629j) && Intrinsics.f(this.k, bVar.k) && this.f284630l == bVar.f284630l && Intrinsics.f(this.f284631m, bVar.f284631m) && Intrinsics.f(this.f284632n, bVar.f284632n) && this.o == bVar.o;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getF284648h() {
        return this.f284628h;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: g, reason: from getter */
    public final n getI() {
        return this.i;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: h, reason: from getter */
    public final wz8.h getF284649j() {
        return this.f284629j;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f284625b.hashCode() * 31, 31, this.f284626c);
        String str = this.d;
        int iB = j6.a.b(this.f, p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31);
        pz8.b bVar = this.f284627g;
        int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.f284628h;
        int iHashCode2 = (this.i.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        wz8.h hVar = this.f284629j;
        return Integer.hashCode(this.o) + p.a.c(p.a.c((this.f284630l.hashCode() + ((this.k.hashCode() + ((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f284631m), 31, this.f284632n);
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: i, reason: from getter */
    public final zz8.c getK() {
        return this.k;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: j, reason: from getter */
    public final r getF284650l() {
        return this.f284630l;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getF284651m() {
        return this.f284631m;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getF284652n() {
        return this.f284632n;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getO() {
        return this.o;
    }
}
