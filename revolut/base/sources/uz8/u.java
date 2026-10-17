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
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Luz8/u;", "Luz8/i;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_learn_shared_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class u extends i {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final Lazy[] f284644q;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f284645b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f284646c;
    public final String d;
    public final String e;
    public final int f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final pz8.b f284647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f284648h;
    public final n i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wz8.h f284649j;
    public final zz8.c k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final r f284650l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f284651m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f284652n;
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f284653p;

    public static final /* synthetic */ class a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f284654a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f284654a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("VIDEO", aVar, 15);
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
            pluginGeneratedSerialDescriptor.j("videoLink", false);
            Intrinsics.checkNotNullParameter("type", "discriminator");
            pluginGeneratedSerialDescriptor.l(new t());
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = u.f284644q;
            v1 v1Var = v1.f247718a;
            n0 n0Var = n0.f247680a;
            return new KSerializer[]{lazyArr[0].getValue(), v1Var, nlm.a.c(v1Var), v1Var, n0Var, nlm.a.c((KSerializer) lazyArr[5].getValue()), nlm.a.c((KSerializer) lazyArr[6].getValue()), l.f284639a, nlm.a.c(wz8.f.f301384a), lazyArr[9].getValue(), lazyArr[10].getValue(), v1Var, v1Var, n0Var, v1Var};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Lazy[] lazyArr;
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr2 = u.f284644q;
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
            String strDecodeStringElement5 = null;
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
                    case 14:
                        strDecodeStringElement5 = dVarBeginStructure.decodeStringElement(serialDescriptor, 14);
                        i |= 16384;
                        continue;
                    default:
                        throw new UnknownFieldException(iD);
                }
                lazyArr2 = lazyArr;
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new u(i, list, strDecodeStringElement, str, strDecodeStringElement2, iDecodeIntElement, bVar, list2, nVar, hVar, cVar, rVar, strDecodeStringElement3, strDecodeStringElement4, iDecodeIntElement2, strDecodeStringElement5);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            u value = (u) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = u.f284644q;
            mlm.h hVar = (mlm.h) lazyArr[0].getValue();
            List list = value.f284645b;
            wz8.h hVar2 = value.f284649j;
            List list2 = value.f284648h;
            pz8.b bVar = value.f284647g;
            String str = value.d;
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, hVar, list);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f284646c);
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
            compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, (mlm.h) lazyArr[10].getValue(), value.f284650l);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 11, value.f284651m);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 12, value.f284652n);
            compositeEncoderBeginStructure.encodeIntElement(serialDescriptor, 13, value.o);
            compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 14, value.f284653p);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: uz8.u$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f284654a;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f284644q = new Lazy[]{yhm.j.c(kVar, new ux7.g(28)), null, null, null, null, yhm.j.c(kVar, new ux7.g(29)), yhm.j.c(kVar, new s(0)), null, null, yhm.j.c(kVar, new s(1)), yhm.j.c(kVar, new s(2)), null, null, null, null};
    }

    public /* synthetic */ u(int i, List list, String str, String str2, String str3, int i2, pz8.b bVar, List list2, n nVar, wz8.h hVar, zz8.c cVar, r rVar, String str4, String str5, int i3, String str6) {
        if (32411 != (i & 32411)) {
            j1.f(a.f284654a.getDescriptor(), i, 32411);
            throw null;
        }
        this.f284645b = list;
        this.f284646c = str;
        if ((i & 4) == 0) {
            this.d = null;
        } else {
            this.d = str2;
        }
        this.e = str3;
        this.f = i2;
        if ((i & 32) == 0) {
            this.f284647g = null;
        } else {
            this.f284647g = bVar;
        }
        if ((i & 64) == 0) {
            this.f284648h = null;
        } else {
            this.f284648h = list2;
        }
        this.i = nVar;
        if ((i & 256) == 0) {
            this.f284649j = null;
        } else {
            this.f284649j = hVar;
        }
        this.k = cVar;
        this.f284650l = rVar;
        this.f284651m = str4;
        this.f284652n = str5;
        this.o = i3;
        this.f284653p = str6;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: a, reason: from getter */
    public final List getF284645b() {
        return this.f284645b;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getF284646c() {
        return this.f284646c;
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
        if (!(obj2 instanceof u)) {
            return false;
        }
        u uVar = (u) obj2;
        return Intrinsics.f(this.f284645b, uVar.f284645b) && Intrinsics.f(this.f284646c, uVar.f284646c) && Intrinsics.f(this.d, uVar.d) && Intrinsics.f(this.e, uVar.e) && this.f == uVar.f && this.f284647g == uVar.f284647g && Intrinsics.f(this.f284648h, uVar.f284648h) && Intrinsics.f(this.i, uVar.i) && Intrinsics.f(this.f284649j, uVar.f284649j) && Intrinsics.f(this.k, uVar.k) && this.f284650l == uVar.f284650l && Intrinsics.f(this.f284651m, uVar.f284651m) && Intrinsics.f(this.f284652n, uVar.f284652n) && this.o == uVar.o && Intrinsics.f(this.f284653p, uVar.f284653p);
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: f, reason: from getter */
    public final List getF284648h() {
        return this.f284648h;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: g, reason: from getter */
    public final n getI() {
        return this.i;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: h, reason: from getter */
    public final wz8.h getF284649j() {
        return this.f284649j;
    }

    public final int hashCode() {
        int iC = p.a.c(this.f284645b.hashCode() * 31, 31, this.f284646c);
        String str = this.d;
        int iB = j6.a.b(this.f, p.a.c((iC + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31);
        pz8.b bVar = this.f284647g;
        int iHashCode = (iB + (bVar == null ? 0 : bVar.hashCode())) * 31;
        List list = this.f284648h;
        int iHashCode2 = (this.i.hashCode() + ((iHashCode + (list == null ? 0 : list.hashCode())) * 31)) * 31;
        wz8.h hVar = this.f284649j;
        return this.f284653p.hashCode() + j6.a.b(this.o, p.a.c(p.a.c((this.f284650l.hashCode() + ((this.k.hashCode() + ((iHashCode2 + (hVar != null ? hVar.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f284651m), 31, this.f284652n), 31);
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: i, reason: from getter */
    public final zz8.c getK() {
        return this.k;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: j, reason: from getter */
    public final r getF284650l() {
        return this.f284650l;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getF284651m() {
        return this.f284651m;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getF284652n() {
        return this.f284652n;
    }

    @Override // uz8.i
    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getO() {
        return this.o;
    }
}
