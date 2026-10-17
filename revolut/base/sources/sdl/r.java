package sdl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
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
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\r\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u0012\u0013\u0014\u0015\u0016\u0017\u0018¨\u0006\u0019"}, d2 = {"Lsdl/r;", "", "<init>", "()V", "Companion", "b", "f", "c", "g", "d", "e", "h", "sdl/m", "sdl/j0", "sdl/x", "sdl/q", "sdl/o", "a", "Lsdl/r$b;", "Lsdl/r$c;", "Lsdl/r$d;", "Lsdl/r$e;", "Lsdl/r$f;", "Lsdl/r$g;", "Lsdl/r$h;", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@rlm.g(discriminator = "accountType")
@mlm.g
public abstract class r {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f261996a = yhm.j.c(yhm.k.PUBLICATION, new s8f.h(15));

    /* JADX INFO: renamed from: sdl.r$a, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) r.f261996a.getValue();
        }
    }

    private r() {
    }

    /* JADX INFO: renamed from: a */
    public abstract List getF262044g();

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/r$h;", "Lsdl/r;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class h extends r {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final Lazy[] f262051h;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f262052b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f262053c;
        public final String d;
        public final m e;
        public final l0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final sdl.c f262054g;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f262055a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f262055a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingAccountDto.Unknown", aVar, 6);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("accountHolderId", false);
                pluginGeneratedSerialDescriptor.j("globalAccountId", false);
                pluginGeneratedSerialDescriptor.j("state", false);
                pluginGeneratedSerialDescriptor.j("accountHolderType", false);
                pluginGeneratedSerialDescriptor.j("beneficiary", false);
                pluginGeneratedSerialDescriptor.l(new s());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = h.f262051h;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{ie0.s.f160620a, v1Var, v1Var, lazyArr[3].getValue(), lazyArr[4].getValue(), sdl.a.f261937a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = h.f262051h;
                dVarBeginStructure.getClass();
                int i = 0;
                UUID uuid = null;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                m mVar = null;
                l0 l0Var = null;
                sdl.c cVar = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            break;
                        case 0:
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                            break;
                        case 1:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                            break;
                        case 2:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            break;
                        case 3:
                            mVar = (m) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), mVar);
                            i |= 8;
                            break;
                        case 4:
                            l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), l0Var);
                            i |= 16;
                            break;
                        case 5:
                            cVar = (sdl.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, sdl.a.f261937a, cVar);
                            i |= 32;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new h(i, uuid, strDecodeStringElement, strDecodeStringElement2, mVar, l0Var, cVar);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                h value = (h) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = h.f262051h;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, value.f262052b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f262053c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.e);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.f);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, sdl.a.f261937a, value.f262054g);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: sdl.r$h$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f262055a;
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            f262051h = new Lazy[]{null, null, null, yhm.j.c(kVar, new y(3)), yhm.j.c(kVar, new y(4)), null};
        }

        public /* synthetic */ h(int i, UUID uuid, String str, String str2, m mVar, l0 l0Var, sdl.c cVar) {
            if (63 != (i & 63)) {
                qlm.j1.f(a.f262055a.getDescriptor(), i, 63);
                throw null;
            }
            this.f262052b = uuid;
            this.f262053c = str;
            this.d = str2;
            this.e = mVar;
            this.f = l0Var;
            this.f262054g = cVar;
        }

        @Override // sdl.r
        /* JADX INFO: renamed from: a */
        public final List getF262044g() {
            return zhm.f0.f322471a;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof h)) {
                return false;
            }
            h hVar = (h) obj2;
            return Intrinsics.f(this.f262052b, hVar.f262052b) && Intrinsics.f(this.f262053c, hVar.f262053c) && Intrinsics.f(this.d, hVar.d) && this.e == hVar.e && this.f == hVar.f && Intrinsics.f(this.f262054g, hVar.f262054g);
        }

        public final int hashCode() {
            return this.f262054g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(this.f262052b.hashCode() * 31, 31, this.f262053c), 31, this.d)) * 31)) * 31);
        }

        public h(UUID id10, String accountHolderId, String globalPersonalAccountId, m state, l0 accountHolderType, sdl.c beneficiary) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f262052b = id10;
            this.f262053c = accountHolderId;
            this.d = globalPersonalAccountId;
            this.e = state;
            this.f = accountHolderType;
            this.f262054g = beneficiary;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/r$b;", "Lsdl/r;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b extends r {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] o;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f261997b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f261998c;
        public final String d;
        public final m e;
        public final l0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f261999g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f262000h;
        public final q i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final o f262001j;
        public final List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List f262002l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final sdl.c f262003m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final k f262004n;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f262005a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f262005a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("GIA", aVar, 13);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("accountHolderId", false);
                pluginGeneratedSerialDescriptor.j("globalAccountId", false);
                pluginGeneratedSerialDescriptor.j("state", false);
                pluginGeneratedSerialDescriptor.j("accountHolderType", false);
                pluginGeneratedSerialDescriptor.j("tradingProducts", false);
                pluginGeneratedSerialDescriptor.j("portfolios", false);
                pluginGeneratedSerialDescriptor.j("allowedTrades", true);
                pluginGeneratedSerialDescriptor.j("allowedCashOperations", true);
                pluginGeneratedSerialDescriptor.j("holdingCurrencies", false);
                pluginGeneratedSerialDescriptor.j("permittedActions", true);
                pluginGeneratedSerialDescriptor.j("beneficiary", false);
                pluginGeneratedSerialDescriptor.j("settings", false);
                pluginGeneratedSerialDescriptor.l(new s());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = b.o;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{ie0.s.f160620a, v1Var, v1Var, lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), lazyArr[7].getValue(), lazyArr[8].getValue(), lazyArr[9].getValue(), tdl.b.f270005a, sdl.a.f261937a, sdl.f.f261965a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                String str;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = b.o;
                dVarBeginStructure.getClass();
                o oVar = null;
                k kVar = null;
                sdl.c cVar = null;
                List list = null;
                List list2 = null;
                UUID uuid = null;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                m mVar = null;
                l0 l0Var = null;
                List list3 = null;
                List list4 = null;
                q qVar = null;
                int i = 0;
                boolean z = true;
                while (true) {
                    String str2 = strDecodeStringElement;
                    if (!z) {
                        dVarBeginStructure.endStructure(serialDescriptor);
                        return new b(i, uuid, strDecodeStringElement, strDecodeStringElement2, mVar, l0Var, list3, list4, qVar, oVar, list, list2, cVar, kVar);
                    }
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            strDecodeStringElement = str2;
                            break;
                        case 0:
                            str = strDecodeStringElement2;
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 1:
                            str = strDecodeStringElement2;
                            i |= 2;
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            strDecodeStringElement2 = str;
                            break;
                        case 2:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            strDecodeStringElement = str2;
                            break;
                        case 3:
                            str = strDecodeStringElement2;
                            mVar = (m) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), mVar);
                            i |= 8;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 4:
                            str = strDecodeStringElement2;
                            l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), l0Var);
                            i |= 16;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 5:
                            str = strDecodeStringElement2;
                            list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list3);
                            i |= 32;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 6:
                            str = strDecodeStringElement2;
                            list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list4);
                            i |= 64;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 7:
                            str = strDecodeStringElement2;
                            qVar = (q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), qVar);
                            i |= 128;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 8:
                            str = strDecodeStringElement2;
                            oVar = (o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), oVar);
                            i |= 256;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 9:
                            str = strDecodeStringElement2;
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list);
                            i |= 512;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 10:
                            str = strDecodeStringElement2;
                            list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, tdl.b.f270005a, list2);
                            i |= 1024;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 11:
                            str = strDecodeStringElement2;
                            cVar = (sdl.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, sdl.a.f261937a, cVar);
                            i |= 2048;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 12:
                            str = strDecodeStringElement2;
                            kVar = (k) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 12, sdl.f.f261965a, kVar);
                            i |= 4096;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
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
                Lazy[] lazyArr = b.o;
                ie0.s sVar = ie0.s.f160620a;
                UUID uuid = value.f261997b;
                List list = value.f262002l;
                o oVar = value.f262001j;
                q qVar = value.i;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uuid);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f261998c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.e);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.f);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f261999g);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f262000h);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || qVar != q.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), qVar);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || oVar != o.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), oVar);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.k);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, tdl.b.f270005a, list);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, sdl.a.f261937a, value.f262003m);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, sdl.f.f261965a, value.f262004n);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: sdl.r$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f262005a;
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            o = new Lazy[]{null, null, null, yhm.j.c(kVar, new s8f.h(18)), yhm.j.c(kVar, new s8f.h(19)), yhm.j.c(kVar, new s8f.h(20)), yhm.j.c(kVar, new s8f.h(21)), yhm.j.c(kVar, new s8f.h(22)), yhm.j.c(kVar, new s8f.h(23)), yhm.j.c(kVar, new s8f.h(24)), null, null, null};
        }

        public b(int i, UUID uuid, String str, String str2, m mVar, l0 l0Var, List list, List list2, q qVar, o oVar, List list3, List list4, sdl.c cVar, k kVar) {
            if (6783 != (i & 6783)) {
                qlm.j1.f(a.f262005a.getDescriptor(), i, 6783);
                throw null;
            }
            this.f261997b = uuid;
            this.f261998c = str;
            this.d = str2;
            this.e = mVar;
            this.f = l0Var;
            this.f261999g = list;
            this.f262000h = list2;
            if ((i & 128) == 0) {
                this.i = q.NONE;
            } else {
                this.i = qVar;
            }
            if ((i & 256) == 0) {
                this.f262001j = o.NONE;
            } else {
                this.f262001j = oVar;
            }
            this.k = list3;
            if ((i & 1024) == 0) {
                this.f262002l = zhm.f0.f322471a;
            } else {
                this.f262002l = list4;
            }
            this.f262003m = cVar;
            this.f262004n = kVar;
        }

        @Override // sdl.r
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF262044g() {
            return this.f261999g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.f261997b, bVar.f261997b) && Intrinsics.f(this.f261998c, bVar.f261998c) && Intrinsics.f(this.d, bVar.d) && this.e == bVar.e && this.f == bVar.f && Intrinsics.f(this.f261999g, bVar.f261999g) && Intrinsics.f(this.f262000h, bVar.f262000h) && this.i == bVar.i && this.f262001j == bVar.f262001j && Intrinsics.f(this.k, bVar.k) && Intrinsics.f(this.f262002l, bVar.f262002l) && Intrinsics.f(this.f262003m, bVar.f262003m) && Intrinsics.f(this.f262004n, bVar.f262004n);
        }

        public final int hashCode() {
            return this.f262004n.f261977a.hashCode() + ((this.f262003m.hashCode() + p.a.d(p.a.d((this.f262001j.hashCode() + ((this.i.hashCode() + p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(this.f261997b.hashCode() * 31, 31, this.f261998c), 31, this.d)) * 31)) * 31, 31, this.f261999g), 31, this.f262000h)) * 31)) * 31, 31, this.k), 31, this.f262002l)) * 31);
        }

        public b(UUID id10, String accountHolderId, String globalPersonalAccountId, m state, l0 accountHolderType, ArrayList tradingProducts, ArrayList portfolios, q allowedTrades, o allowedCashOperations, ArrayList holdingCurrencies, ArrayList permittedActions, sdl.c beneficiary, k settings) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
            Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
            Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
            Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.f261997b = id10;
            this.f261998c = accountHolderId;
            this.d = globalPersonalAccountId;
            this.e = state;
            this.f = accountHolderType;
            this.f261999g = tradingProducts;
            this.f262000h = portfolios;
            this.i = allowedTrades;
            this.f262001j = allowedCashOperations;
            this.k = holdingCurrencies;
            this.f262002l = permittedActions;
            this.f262003m = beneficiary;
            this.f262004n = settings;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/r$c;", "Lsdl/r;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c extends r {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Lazy[] f262006n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f262007b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f262008c;
        public final String d;
        public final m e;
        public final l0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f262009g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f262010h;
        public final q i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final o f262011j;
        public final List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List f262012l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final sdl.c f262013m;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f262014a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f262014a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("MARGIN", aVar, 12);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("accountHolderId", false);
                pluginGeneratedSerialDescriptor.j("globalAccountId", false);
                pluginGeneratedSerialDescriptor.j("state", false);
                pluginGeneratedSerialDescriptor.j("accountHolderType", false);
                pluginGeneratedSerialDescriptor.j("tradingProducts", false);
                pluginGeneratedSerialDescriptor.j("portfolios", false);
                pluginGeneratedSerialDescriptor.j("allowedTrades", true);
                pluginGeneratedSerialDescriptor.j("allowedCashOperations", true);
                pluginGeneratedSerialDescriptor.j("holdingCurrencies", false);
                pluginGeneratedSerialDescriptor.j("permittedActions", true);
                pluginGeneratedSerialDescriptor.j("beneficiary", false);
                pluginGeneratedSerialDescriptor.l(new s());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = c.f262006n;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{ie0.s.f160620a, v1Var, v1Var, lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), lazyArr[7].getValue(), lazyArr[8].getValue(), lazyArr[9].getValue(), tdl.b.f270005a, sdl.a.f261937a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                String str;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = c.f262006n;
                dVarBeginStructure.getClass();
                o oVar = null;
                sdl.c cVar = null;
                List list = null;
                List list2 = null;
                UUID uuid = null;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                m mVar = null;
                l0 l0Var = null;
                List list3 = null;
                List list4 = null;
                q qVar = null;
                int i = 0;
                boolean z = true;
                while (z) {
                    Lazy[] lazyArr2 = lazyArr;
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            lazyArr = lazyArr2;
                            break;
                        case 0:
                            str = strDecodeStringElement;
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 1:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                            lazyArr = lazyArr2;
                            break;
                        case 2:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            lazyArr = lazyArr2;
                            break;
                        case 3:
                            str = strDecodeStringElement;
                            mVar = (m) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr2[3].getValue(), mVar);
                            i |= 8;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 4:
                            str = strDecodeStringElement;
                            l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr2[4].getValue(), l0Var);
                            i |= 16;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 5:
                            str = strDecodeStringElement;
                            list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr2[5].getValue(), list3);
                            i |= 32;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 6:
                            str = strDecodeStringElement;
                            list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr2[6].getValue(), list4);
                            i |= 64;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 7:
                            str = strDecodeStringElement;
                            qVar = (q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr2[7].getValue(), qVar);
                            i |= 128;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 8:
                            str = strDecodeStringElement;
                            oVar = (o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr2[8].getValue(), oVar);
                            i |= 256;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 9:
                            str = strDecodeStringElement;
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), list);
                            i |= 512;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 10:
                            str = strDecodeStringElement;
                            list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, tdl.b.f270005a, list2);
                            i |= 1024;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 11:
                            str = strDecodeStringElement;
                            cVar = (sdl.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, sdl.a.f261937a, cVar);
                            i |= 2048;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, uuid, strDecodeStringElement, strDecodeStringElement2, mVar, l0Var, list3, list4, qVar, oVar, list, list2, cVar);
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
                Lazy[] lazyArr = c.f262006n;
                ie0.s sVar = ie0.s.f160620a;
                UUID uuid = value.f262007b;
                List list = value.f262012l;
                o oVar = value.f262011j;
                q qVar = value.i;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uuid);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f262008c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.e);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.f);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f262009g);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f262010h);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || qVar != q.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), qVar);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || oVar != o.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), oVar);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.k);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, tdl.b.f270005a, list);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, sdl.a.f261937a, value.f262013m);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: sdl.r$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f262014a;
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            f262006n = new Lazy[]{null, null, null, yhm.j.c(kVar, new s8f.h(25)), yhm.j.c(kVar, new s8f.h(26)), yhm.j.c(kVar, new s8f.h(27)), yhm.j.c(kVar, new s8f.h(28)), yhm.j.c(kVar, new s8f.h(29)), yhm.j.c(kVar, new t(0)), yhm.j.c(kVar, new t(1)), null, null};
        }

        public c(int i, UUID uuid, String str, String str2, m mVar, l0 l0Var, List list, List list2, q qVar, o oVar, List list3, List list4, sdl.c cVar) {
            if (2687 != (i & 2687)) {
                qlm.j1.f(a.f262014a.getDescriptor(), i, 2687);
                throw null;
            }
            this.f262007b = uuid;
            this.f262008c = str;
            this.d = str2;
            this.e = mVar;
            this.f = l0Var;
            this.f262009g = list;
            this.f262010h = list2;
            if ((i & 128) == 0) {
                this.i = q.NONE;
            } else {
                this.i = qVar;
            }
            if ((i & 256) == 0) {
                this.f262011j = o.NONE;
            } else {
                this.f262011j = oVar;
            }
            this.k = list3;
            if ((i & 1024) == 0) {
                this.f262012l = zhm.f0.f322471a;
            } else {
                this.f262012l = list4;
            }
            this.f262013m = cVar;
        }

        @Override // sdl.r
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF262044g() {
            return this.f262009g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.f262007b, cVar.f262007b) && Intrinsics.f(this.f262008c, cVar.f262008c) && Intrinsics.f(this.d, cVar.d) && this.e == cVar.e && this.f == cVar.f && Intrinsics.f(this.f262009g, cVar.f262009g) && Intrinsics.f(this.f262010h, cVar.f262010h) && this.i == cVar.i && this.f262011j == cVar.f262011j && Intrinsics.f(this.k, cVar.k) && Intrinsics.f(this.f262012l, cVar.f262012l) && Intrinsics.f(this.f262013m, cVar.f262013m);
        }

        public final int hashCode() {
            return this.f262013m.hashCode() + p.a.d(p.a.d((this.f262011j.hashCode() + ((this.i.hashCode() + p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(this.f262007b.hashCode() * 31, 31, this.f262008c), 31, this.d)) * 31)) * 31, 31, this.f262009g), 31, this.f262010h)) * 31)) * 31, 31, this.k), 31, this.f262012l);
        }

        public c(UUID id10, String accountHolderId, String globalPersonalAccountId, m state, l0 accountHolderType, ArrayList tradingProducts, ArrayList portfolios, q allowedTrades, o allowedCashOperations, ArrayList holdingCurrencies, ArrayList permittedActions, sdl.c beneficiary) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
            Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
            Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
            Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f262007b = id10;
            this.f262008c = accountHolderId;
            this.d = globalPersonalAccountId;
            this.e = state;
            this.f = accountHolderType;
            this.f262009g = tradingProducts;
            this.f262010h = portfolios;
            this.i = allowedTrades;
            this.f262011j = allowedCashOperations;
            this.k = holdingCurrencies;
            this.f262012l = permittedActions;
            this.f262013m = beneficiary;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/r$d;", "Lsdl/r;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d extends r {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Lazy[] f262015n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f262016b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f262017c;
        public final String d;
        public final m e;
        public final l0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f262018g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f262019h;
        public final q i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final o f262020j;
        public final List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List f262021l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final sdl.c f262022m;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f262023a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f262023a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("MMF", aVar, 12);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("accountHolderId", false);
                pluginGeneratedSerialDescriptor.j("globalAccountId", false);
                pluginGeneratedSerialDescriptor.j("state", false);
                pluginGeneratedSerialDescriptor.j("accountHolderType", false);
                pluginGeneratedSerialDescriptor.j("tradingProducts", false);
                pluginGeneratedSerialDescriptor.j("portfolios", false);
                pluginGeneratedSerialDescriptor.j("allowedTrades", true);
                pluginGeneratedSerialDescriptor.j("allowedCashOperations", true);
                pluginGeneratedSerialDescriptor.j("holdingCurrencies", false);
                pluginGeneratedSerialDescriptor.j("permittedActions", true);
                pluginGeneratedSerialDescriptor.j("beneficiary", false);
                pluginGeneratedSerialDescriptor.l(new s());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = d.f262015n;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{ie0.s.f160620a, v1Var, v1Var, lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), lazyArr[7].getValue(), lazyArr[8].getValue(), lazyArr[9].getValue(), tdl.b.f270005a, sdl.a.f261937a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                String str;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = d.f262015n;
                dVarBeginStructure.getClass();
                o oVar = null;
                sdl.c cVar = null;
                List list = null;
                List list2 = null;
                UUID uuid = null;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                m mVar = null;
                l0 l0Var = null;
                List list3 = null;
                List list4 = null;
                q qVar = null;
                int i = 0;
                boolean z = true;
                while (z) {
                    Lazy[] lazyArr2 = lazyArr;
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            lazyArr = lazyArr2;
                            break;
                        case 0:
                            str = strDecodeStringElement;
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 1:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                            lazyArr = lazyArr2;
                            break;
                        case 2:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            lazyArr = lazyArr2;
                            break;
                        case 3:
                            str = strDecodeStringElement;
                            mVar = (m) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr2[3].getValue(), mVar);
                            i |= 8;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 4:
                            str = strDecodeStringElement;
                            l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr2[4].getValue(), l0Var);
                            i |= 16;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 5:
                            str = strDecodeStringElement;
                            list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr2[5].getValue(), list3);
                            i |= 32;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 6:
                            str = strDecodeStringElement;
                            list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr2[6].getValue(), list4);
                            i |= 64;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 7:
                            str = strDecodeStringElement;
                            qVar = (q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr2[7].getValue(), qVar);
                            i |= 128;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 8:
                            str = strDecodeStringElement;
                            oVar = (o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr2[8].getValue(), oVar);
                            i |= 256;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 9:
                            str = strDecodeStringElement;
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), list);
                            i |= 512;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 10:
                            str = strDecodeStringElement;
                            list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, tdl.b.f270005a, list2);
                            i |= 1024;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 11:
                            str = strDecodeStringElement;
                            cVar = (sdl.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, sdl.a.f261937a, cVar);
                            i |= 2048;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, uuid, strDecodeStringElement, strDecodeStringElement2, mVar, l0Var, list3, list4, qVar, oVar, list, list2, cVar);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                d value = (d) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = d.f262015n;
                ie0.s sVar = ie0.s.f160620a;
                UUID uuid = value.f262016b;
                List list = value.f262021l;
                o oVar = value.f262020j;
                q qVar = value.i;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uuid);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f262017c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.e);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.f);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f262018g);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f262019h);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || qVar != q.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), qVar);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || oVar != o.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), oVar);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.k);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, tdl.b.f270005a, list);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, sdl.a.f261937a, value.f262022m);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: sdl.r$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f262023a;
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            f262015n = new Lazy[]{null, null, null, yhm.j.c(kVar, new t(2)), yhm.j.c(kVar, new t(3)), yhm.j.c(kVar, new t(4)), yhm.j.c(kVar, new t(5)), yhm.j.c(kVar, new t(6)), yhm.j.c(kVar, new t(7)), yhm.j.c(kVar, new t(8)), null, null};
        }

        public d(int i, UUID uuid, String str, String str2, m mVar, l0 l0Var, List list, List list2, q qVar, o oVar, List list3, List list4, sdl.c cVar) {
            if (2687 != (i & 2687)) {
                qlm.j1.f(a.f262023a.getDescriptor(), i, 2687);
                throw null;
            }
            this.f262016b = uuid;
            this.f262017c = str;
            this.d = str2;
            this.e = mVar;
            this.f = l0Var;
            this.f262018g = list;
            this.f262019h = list2;
            if ((i & 128) == 0) {
                this.i = q.NONE;
            } else {
                this.i = qVar;
            }
            if ((i & 256) == 0) {
                this.f262020j = o.NONE;
            } else {
                this.f262020j = oVar;
            }
            this.k = list3;
            if ((i & 1024) == 0) {
                this.f262021l = zhm.f0.f322471a;
            } else {
                this.f262021l = list4;
            }
            this.f262022m = cVar;
        }

        @Override // sdl.r
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF262044g() {
            return this.f262018g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.f262016b, dVar.f262016b) && Intrinsics.f(this.f262017c, dVar.f262017c) && Intrinsics.f(this.d, dVar.d) && this.e == dVar.e && this.f == dVar.f && Intrinsics.f(this.f262018g, dVar.f262018g) && Intrinsics.f(this.f262019h, dVar.f262019h) && this.i == dVar.i && this.f262020j == dVar.f262020j && Intrinsics.f(this.k, dVar.k) && Intrinsics.f(this.f262021l, dVar.f262021l) && Intrinsics.f(this.f262022m, dVar.f262022m);
        }

        public final int hashCode() {
            return this.f262022m.hashCode() + p.a.d(p.a.d((this.f262020j.hashCode() + ((this.i.hashCode() + p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(this.f262016b.hashCode() * 31, 31, this.f262017c), 31, this.d)) * 31)) * 31, 31, this.f262018g), 31, this.f262019h)) * 31)) * 31, 31, this.k), 31, this.f262021l);
        }

        public d(UUID id10, String accountHolderId, String globalPersonalAccountId, m state, l0 accountHolderType, ArrayList tradingProducts, ArrayList portfolios, q allowedTrades, o allowedCashOperations, ArrayList holdingCurrencies, ArrayList permittedActions, sdl.c beneficiary) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
            Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
            Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
            Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f262016b = id10;
            this.f262017c = accountHolderId;
            this.d = globalPersonalAccountId;
            this.e = state;
            this.f = accountHolderType;
            this.f262018g = tradingProducts;
            this.f262019h = portfolios;
            this.i = allowedTrades;
            this.f262020j = allowedCashOperations;
            this.k = holdingCurrencies;
            this.f262021l = permittedActions;
            this.f262022m = beneficiary;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/r$e;", "Lsdl/r;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class e extends r {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Lazy[] f262024n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f262025b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f262026c;
        public final String d;
        public final m e;
        public final l0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f262027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f262028h;
        public final q i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final o f262029j;
        public final List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List f262030l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final sdl.c f262031m;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f262032a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f262032a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("PAPER_TRADING", aVar, 12);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("accountHolderId", false);
                pluginGeneratedSerialDescriptor.j("globalAccountId", false);
                pluginGeneratedSerialDescriptor.j("state", false);
                pluginGeneratedSerialDescriptor.j("accountHolderType", false);
                pluginGeneratedSerialDescriptor.j("tradingProducts", false);
                pluginGeneratedSerialDescriptor.j("portfolios", false);
                pluginGeneratedSerialDescriptor.j("allowedTrades", true);
                pluginGeneratedSerialDescriptor.j("allowedCashOperations", true);
                pluginGeneratedSerialDescriptor.j("holdingCurrencies", false);
                pluginGeneratedSerialDescriptor.j("permittedActions", true);
                pluginGeneratedSerialDescriptor.j("beneficiary", false);
                pluginGeneratedSerialDescriptor.l(new s());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = e.f262024n;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{ie0.s.f160620a, v1Var, v1Var, lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), lazyArr[7].getValue(), lazyArr[8].getValue(), lazyArr[9].getValue(), tdl.b.f270005a, sdl.a.f261937a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                String str;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = e.f262024n;
                dVarBeginStructure.getClass();
                o oVar = null;
                sdl.c cVar = null;
                List list = null;
                List list2 = null;
                UUID uuid = null;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                m mVar = null;
                l0 l0Var = null;
                List list3 = null;
                List list4 = null;
                q qVar = null;
                int i = 0;
                boolean z = true;
                while (z) {
                    Lazy[] lazyArr2 = lazyArr;
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            lazyArr = lazyArr2;
                            break;
                        case 0:
                            str = strDecodeStringElement;
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 1:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                            lazyArr = lazyArr2;
                            break;
                        case 2:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            lazyArr = lazyArr2;
                            break;
                        case 3:
                            str = strDecodeStringElement;
                            mVar = (m) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr2[3].getValue(), mVar);
                            i |= 8;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 4:
                            str = strDecodeStringElement;
                            l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr2[4].getValue(), l0Var);
                            i |= 16;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 5:
                            str = strDecodeStringElement;
                            list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr2[5].getValue(), list3);
                            i |= 32;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 6:
                            str = strDecodeStringElement;
                            list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr2[6].getValue(), list4);
                            i |= 64;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 7:
                            str = strDecodeStringElement;
                            qVar = (q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr2[7].getValue(), qVar);
                            i |= 128;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 8:
                            str = strDecodeStringElement;
                            oVar = (o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr2[8].getValue(), oVar);
                            i |= 256;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 9:
                            str = strDecodeStringElement;
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), list);
                            i |= 512;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 10:
                            str = strDecodeStringElement;
                            list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, tdl.b.f270005a, list2);
                            i |= 1024;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 11:
                            str = strDecodeStringElement;
                            cVar = (sdl.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, sdl.a.f261937a, cVar);
                            i |= 2048;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(i, uuid, strDecodeStringElement, strDecodeStringElement2, mVar, l0Var, list3, list4, qVar, oVar, list, list2, cVar);
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
                Lazy[] lazyArr = e.f262024n;
                ie0.s sVar = ie0.s.f160620a;
                UUID uuid = value.f262025b;
                List list = value.f262030l;
                o oVar = value.f262029j;
                q qVar = value.i;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uuid);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f262026c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.e);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.f);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f262027g);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f262028h);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || qVar != q.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), qVar);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || oVar != o.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), oVar);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.k);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, tdl.b.f270005a, list);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, sdl.a.f261937a, value.f262031m);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: sdl.r$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f262032a;
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            f262024n = new Lazy[]{null, null, null, yhm.j.c(kVar, new t(9)), yhm.j.c(kVar, new t(10)), yhm.j.c(kVar, new t(11)), yhm.j.c(kVar, new t(12)), yhm.j.c(kVar, new t(13)), yhm.j.c(kVar, new t(14)), yhm.j.c(kVar, new t(15)), null, null};
        }

        public e(int i, UUID uuid, String str, String str2, m mVar, l0 l0Var, List list, List list2, q qVar, o oVar, List list3, List list4, sdl.c cVar) {
            if (2687 != (i & 2687)) {
                qlm.j1.f(a.f262032a.getDescriptor(), i, 2687);
                throw null;
            }
            this.f262025b = uuid;
            this.f262026c = str;
            this.d = str2;
            this.e = mVar;
            this.f = l0Var;
            this.f262027g = list;
            this.f262028h = list2;
            if ((i & 128) == 0) {
                this.i = q.NONE;
            } else {
                this.i = qVar;
            }
            if ((i & 256) == 0) {
                this.f262029j = o.NONE;
            } else {
                this.f262029j = oVar;
            }
            this.k = list3;
            if ((i & 1024) == 0) {
                this.f262030l = zhm.f0.f322471a;
            } else {
                this.f262030l = list4;
            }
            this.f262031m = cVar;
        }

        @Override // sdl.r
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF262044g() {
            return this.f262027g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.f262025b, eVar.f262025b) && Intrinsics.f(this.f262026c, eVar.f262026c) && Intrinsics.f(this.d, eVar.d) && this.e == eVar.e && this.f == eVar.f && Intrinsics.f(this.f262027g, eVar.f262027g) && Intrinsics.f(this.f262028h, eVar.f262028h) && this.i == eVar.i && this.f262029j == eVar.f262029j && Intrinsics.f(this.k, eVar.k) && Intrinsics.f(this.f262030l, eVar.f262030l) && Intrinsics.f(this.f262031m, eVar.f262031m);
        }

        public final int hashCode() {
            return this.f262031m.hashCode() + p.a.d(p.a.d((this.f262029j.hashCode() + ((this.i.hashCode() + p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(this.f262025b.hashCode() * 31, 31, this.f262026c), 31, this.d)) * 31)) * 31, 31, this.f262027g), 31, this.f262028h)) * 31)) * 31, 31, this.k), 31, this.f262030l);
        }

        public e(UUID id10, String accountHolderId, String globalPersonalAccountId, m state, l0 accountHolderType, ArrayList tradingProducts, ArrayList portfolios, q allowedTrades, o allowedCashOperations, ArrayList holdingCurrencies, ArrayList permittedActions, sdl.c beneficiary) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
            Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
            Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
            Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f262025b = id10;
            this.f262026c = accountHolderId;
            this.d = globalPersonalAccountId;
            this.e = state;
            this.f = accountHolderType;
            this.f262027g = tradingProducts;
            this.f262028h = portfolios;
            this.i = allowedTrades;
            this.f262029j = allowedCashOperations;
            this.k = holdingCurrencies;
            this.f262030l = permittedActions;
            this.f262031m = beneficiary;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/r$f;", "Lsdl/r;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class f extends r {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static final Lazy[] f262033n;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f262034b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f262035c;
        public final String d;
        public final m e;
        public final l0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f262036g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f262037h;
        public final q i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final o f262038j;
        public final List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final List f262039l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final sdl.c f262040m;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f262041a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f262041a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ROBO", aVar, 12);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("accountHolderId", false);
                pluginGeneratedSerialDescriptor.j("globalAccountId", false);
                pluginGeneratedSerialDescriptor.j("state", false);
                pluginGeneratedSerialDescriptor.j("accountHolderType", false);
                pluginGeneratedSerialDescriptor.j("tradingProducts", false);
                pluginGeneratedSerialDescriptor.j("portfolios", false);
                pluginGeneratedSerialDescriptor.j("allowedTrades", true);
                pluginGeneratedSerialDescriptor.j("allowedCashOperations", true);
                pluginGeneratedSerialDescriptor.j("holdingCurrencies", false);
                pluginGeneratedSerialDescriptor.j("permittedActions", true);
                pluginGeneratedSerialDescriptor.j("beneficiary", false);
                pluginGeneratedSerialDescriptor.l(new s());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = f.f262033n;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{ie0.s.f160620a, v1Var, v1Var, lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), lazyArr[7].getValue(), lazyArr[8].getValue(), lazyArr[9].getValue(), tdl.b.f270005a, sdl.a.f261937a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                String str;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = f.f262033n;
                dVarBeginStructure.getClass();
                o oVar = null;
                sdl.c cVar = null;
                List list = null;
                List list2 = null;
                UUID uuid = null;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                m mVar = null;
                l0 l0Var = null;
                List list3 = null;
                List list4 = null;
                q qVar = null;
                int i = 0;
                boolean z = true;
                while (z) {
                    Lazy[] lazyArr2 = lazyArr;
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            lazyArr = lazyArr2;
                            break;
                        case 0:
                            str = strDecodeStringElement;
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 1:
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            i |= 2;
                            lazyArr = lazyArr2;
                            break;
                        case 2:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            lazyArr = lazyArr2;
                            break;
                        case 3:
                            str = strDecodeStringElement;
                            mVar = (m) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr2[3].getValue(), mVar);
                            i |= 8;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 4:
                            str = strDecodeStringElement;
                            l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr2[4].getValue(), l0Var);
                            i |= 16;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 5:
                            str = strDecodeStringElement;
                            list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr2[5].getValue(), list3);
                            i |= 32;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 6:
                            str = strDecodeStringElement;
                            list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr2[6].getValue(), list4);
                            i |= 64;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 7:
                            str = strDecodeStringElement;
                            qVar = (q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr2[7].getValue(), qVar);
                            i |= 128;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 8:
                            str = strDecodeStringElement;
                            oVar = (o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr2[8].getValue(), oVar);
                            i |= 256;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 9:
                            str = strDecodeStringElement;
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr2[9].getValue(), list);
                            i |= 512;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 10:
                            str = strDecodeStringElement;
                            list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 10, tdl.b.f270005a, list2);
                            i |= 1024;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        case 11:
                            str = strDecodeStringElement;
                            cVar = (sdl.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, sdl.a.f261937a, cVar);
                            i |= 2048;
                            lazyArr = lazyArr2;
                            strDecodeStringElement = str;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new f(i, uuid, strDecodeStringElement, strDecodeStringElement2, mVar, l0Var, list3, list4, qVar, oVar, list, list2, cVar);
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                f value = (f) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = f.f262033n;
                ie0.s sVar = ie0.s.f160620a;
                UUID uuid = value.f262034b;
                List list = value.f262039l;
                o oVar = value.f262038j;
                q qVar = value.i;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uuid);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f262035c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.e);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.f);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f262036g);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f262037h);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || qVar != q.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), qVar);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || oVar != o.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), oVar);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.k);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 10, tdl.b.f270005a, list);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, sdl.a.f261937a, value.f262040m);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: sdl.r$f$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f262041a;
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            f262033n = new Lazy[]{null, null, null, yhm.j.c(kVar, new t(17)), yhm.j.c(kVar, new t(18)), yhm.j.c(kVar, new t(19)), yhm.j.c(kVar, new t(20)), yhm.j.c(kVar, new t(21)), yhm.j.c(kVar, new t(22)), yhm.j.c(kVar, new t(23)), null, null};
        }

        public f(int i, UUID uuid, String str, String str2, m mVar, l0 l0Var, List list, List list2, q qVar, o oVar, List list3, List list4, sdl.c cVar) {
            if (2687 != (i & 2687)) {
                qlm.j1.f(a.f262041a.getDescriptor(), i, 2687);
                throw null;
            }
            this.f262034b = uuid;
            this.f262035c = str;
            this.d = str2;
            this.e = mVar;
            this.f = l0Var;
            this.f262036g = list;
            this.f262037h = list2;
            if ((i & 128) == 0) {
                this.i = q.NONE;
            } else {
                this.i = qVar;
            }
            if ((i & 256) == 0) {
                this.f262038j = o.NONE;
            } else {
                this.f262038j = oVar;
            }
            this.k = list3;
            if ((i & 1024) == 0) {
                this.f262039l = zhm.f0.f322471a;
            } else {
                this.f262039l = list4;
            }
            this.f262040m = cVar;
        }

        @Override // sdl.r
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF262044g() {
            return this.f262036g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.f262034b, fVar.f262034b) && Intrinsics.f(this.f262035c, fVar.f262035c) && Intrinsics.f(this.d, fVar.d) && this.e == fVar.e && this.f == fVar.f && Intrinsics.f(this.f262036g, fVar.f262036g) && Intrinsics.f(this.f262037h, fVar.f262037h) && this.i == fVar.i && this.f262038j == fVar.f262038j && Intrinsics.f(this.k, fVar.k) && Intrinsics.f(this.f262039l, fVar.f262039l) && Intrinsics.f(this.f262040m, fVar.f262040m);
        }

        public final int hashCode() {
            return this.f262040m.hashCode() + p.a.d(p.a.d((this.f262038j.hashCode() + ((this.i.hashCode() + p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(this.f262034b.hashCode() * 31, 31, this.f262035c), 31, this.d)) * 31)) * 31, 31, this.f262036g), 31, this.f262037h)) * 31)) * 31, 31, this.k), 31, this.f262039l);
        }

        public f(UUID id10, String accountHolderId, String globalPersonalAccountId, m state, l0 accountHolderType, ArrayList tradingProducts, ArrayList portfolios, q allowedTrades, o allowedCashOperations, ArrayList holdingCurrencies, ArrayList permittedActions, sdl.c beneficiary) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
            Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
            Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
            Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f262034b = id10;
            this.f262035c = accountHolderId;
            this.d = globalPersonalAccountId;
            this.e = state;
            this.f = accountHolderType;
            this.f262036g = tradingProducts;
            this.f262037h = portfolios;
            this.i = allowedTrades;
            this.f262038j = allowedCashOperations;
            this.k = holdingCurrencies;
            this.f262039l = permittedActions;
            this.f262040m = beneficiary;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0003\u0006\u0007\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\t"}, d2 = {"Lsdl/r$g;", "Lsdl/r;", "", "toString", "()Ljava/lang/String;", "Companion", "sdl/e0", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class g extends r {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();
        public static final Lazy[] o;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f262042b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f262043c;
        public final String d;
        public final m e;
        public final l0 f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final List f262044g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f262045h;
        public final q i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final o f262046j;
        public final List k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final e0 f262047l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final List f262048m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final sdl.c f262049n;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f262050a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f262050a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("TAX_ADVANTAGED", aVar, 13);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("accountHolderId", false);
                pluginGeneratedSerialDescriptor.j("globalAccountId", false);
                pluginGeneratedSerialDescriptor.j("state", false);
                pluginGeneratedSerialDescriptor.j("accountHolderType", false);
                pluginGeneratedSerialDescriptor.j("tradingProducts", false);
                pluginGeneratedSerialDescriptor.j("portfolios", false);
                pluginGeneratedSerialDescriptor.j("allowedTrades", true);
                pluginGeneratedSerialDescriptor.j("allowedCashOperations", true);
                pluginGeneratedSerialDescriptor.j("holdingCurrencies", false);
                pluginGeneratedSerialDescriptor.j("limit", false);
                pluginGeneratedSerialDescriptor.j("permittedActions", true);
                pluginGeneratedSerialDescriptor.j("beneficiary", false);
                pluginGeneratedSerialDescriptor.l(new s());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = g.o;
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{ie0.s.f160620a, v1Var, v1Var, lazyArr[3].getValue(), lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), lazyArr[7].getValue(), lazyArr[8].getValue(), lazyArr[9].getValue(), nlm.a.c(z.f262075a), tdl.b.f270005a, sdl.a.f261937a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                String str;
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = g.o;
                dVarBeginStructure.getClass();
                o oVar = null;
                sdl.c cVar = null;
                List list = null;
                List list2 = null;
                e0 e0Var = null;
                UUID uuid = null;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                m mVar = null;
                l0 l0Var = null;
                List list3 = null;
                List list4 = null;
                q qVar = null;
                int i = 0;
                boolean z = true;
                while (true) {
                    String str2 = strDecodeStringElement;
                    if (!z) {
                        dVarBeginStructure.endStructure(serialDescriptor);
                        return new g(i, uuid, strDecodeStringElement, strDecodeStringElement2, mVar, l0Var, list3, list4, qVar, oVar, list2, e0Var, list, cVar);
                    }
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    switch (iD) {
                        case -1:
                            z = false;
                            strDecodeStringElement = str2;
                            break;
                        case 0:
                            str = strDecodeStringElement2;
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 1:
                            str = strDecodeStringElement2;
                            i |= 2;
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                            strDecodeStringElement2 = str;
                            break;
                        case 2:
                            strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                            strDecodeStringElement = str2;
                            break;
                        case 3:
                            str = strDecodeStringElement2;
                            mVar = (m) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), mVar);
                            i |= 8;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 4:
                            str = strDecodeStringElement2;
                            l0Var = (l0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), l0Var);
                            i |= 16;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 5:
                            str = strDecodeStringElement2;
                            list3 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), list3);
                            i |= 32;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 6:
                            str = strDecodeStringElement2;
                            list4 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), list4);
                            i |= 64;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 7:
                            str = strDecodeStringElement2;
                            qVar = (q) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, (mlm.b) lazyArr[7].getValue(), qVar);
                            i |= 128;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 8:
                            str = strDecodeStringElement2;
                            oVar = (o) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), oVar);
                            i |= 256;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 9:
                            str = strDecodeStringElement2;
                            list2 = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 9, (mlm.b) lazyArr[9].getValue(), list2);
                            i |= 512;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 10:
                            str = strDecodeStringElement2;
                            e0Var = (e0) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 10, z.f262075a, e0Var);
                            i |= 1024;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 11:
                            str = strDecodeStringElement2;
                            list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 11, tdl.b.f270005a, list);
                            i |= 2048;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        case 12:
                            str = strDecodeStringElement2;
                            cVar = (sdl.c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 12, sdl.a.f261937a, cVar);
                            i |= 4096;
                            strDecodeStringElement = str2;
                            strDecodeStringElement2 = str;
                            break;
                        default:
                            throw new UnknownFieldException(iD);
                    }
                }
            }

            @Override // mlm.h, mlm.b
            public final SerialDescriptor getDescriptor() {
                return descriptor;
            }

            @Override // mlm.h
            public final void serialize(Encoder encoder, Object obj2) {
                g value = (g) obj2;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = g.o;
                ie0.s sVar = ie0.s.f160620a;
                UUID uuid = value.f262042b;
                List list = value.f262048m;
                o oVar = value.f262046j;
                q qVar = value.i;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uuid);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f262043c);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 2, value.d);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, (mlm.h) lazyArr[3].getValue(), value.e);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 4, (mlm.h) lazyArr[4].getValue(), value.f);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 5, (mlm.h) lazyArr[5].getValue(), value.f262044g);
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 6, (mlm.h) lazyArr[6].getValue(), value.f262045h);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || qVar != q.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 7, (mlm.h) lazyArr[7].getValue(), qVar);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || oVar != o.NONE) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 8, (mlm.h) lazyArr[8].getValue(), oVar);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 9, (mlm.h) lazyArr[9].getValue(), value.k);
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 10, z.f262075a, value.f262047l);
                if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(list, zhm.f0.f322471a)) {
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 11, tdl.b.f270005a, list);
                }
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 12, sdl.a.f261937a, value.f262049n);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: sdl.r$g$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f262050a;
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            o = new Lazy[]{null, null, null, yhm.j.c(kVar, new t(24)), yhm.j.c(kVar, new t(25)), yhm.j.c(kVar, new t(26)), yhm.j.c(kVar, new t(27)), yhm.j.c(kVar, new t(28)), yhm.j.c(kVar, new t(29)), yhm.j.c(kVar, new y(0)), null, null, null};
        }

        public g(int i, UUID uuid, String str, String str2, m mVar, l0 l0Var, List list, List list2, q qVar, o oVar, List list3, e0 e0Var, List list4, sdl.c cVar) {
            if (5759 != (i & 5759)) {
                qlm.j1.f(a.f262050a.getDescriptor(), i, 5759);
                throw null;
            }
            this.f262042b = uuid;
            this.f262043c = str;
            this.d = str2;
            this.e = mVar;
            this.f = l0Var;
            this.f262044g = list;
            this.f262045h = list2;
            if ((i & 128) == 0) {
                this.i = q.NONE;
            } else {
                this.i = qVar;
            }
            if ((i & 256) == 0) {
                this.f262046j = o.NONE;
            } else {
                this.f262046j = oVar;
            }
            this.k = list3;
            this.f262047l = e0Var;
            if ((i & 2048) == 0) {
                this.f262048m = zhm.f0.f322471a;
            } else {
                this.f262048m = list4;
            }
            this.f262049n = cVar;
        }

        @Override // sdl.r
        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getF262044g() {
            return this.f262044g;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.f262042b, gVar.f262042b) && Intrinsics.f(this.f262043c, gVar.f262043c) && Intrinsics.f(this.d, gVar.d) && this.e == gVar.e && this.f == gVar.f && Intrinsics.f(this.f262044g, gVar.f262044g) && Intrinsics.f(this.f262045h, gVar.f262045h) && this.i == gVar.i && this.f262046j == gVar.f262046j && Intrinsics.f(this.k, gVar.k) && Intrinsics.f(this.f262047l, gVar.f262047l) && Intrinsics.f(this.f262048m, gVar.f262048m) && Intrinsics.f(this.f262049n, gVar.f262049n);
        }

        public final int hashCode() {
            int iD = p.a.d((this.f262046j.hashCode() + ((this.i.hashCode() + p.a.d(p.a.d((this.f.hashCode() + ((this.e.hashCode() + p.a.c(p.a.c(this.f262042b.hashCode() * 31, 31, this.f262043c), 31, this.d)) * 31)) * 31, 31, this.f262044g), 31, this.f262045h)) * 31)) * 31, 31, this.k);
            e0 e0Var = this.f262047l;
            return this.f262049n.hashCode() + p.a.d((iD + (e0Var == null ? 0 : e0Var.hashCode())) * 31, 31, this.f262048m);
        }

        public g(UUID id10, String accountHolderId, String globalPersonalAccountId, m state, l0 accountHolderType, ArrayList tradingProducts, ArrayList portfolios, q allowedTrades, o allowedCashOperations, ArrayList holdingCurrencies, e0 e0Var, ArrayList permittedActions, sdl.c beneficiary) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(accountHolderId, "accountHolderId");
            Intrinsics.checkNotNullParameter(globalPersonalAccountId, "globalPersonalAccountId");
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(accountHolderType, "accountHolderType");
            Intrinsics.checkNotNullParameter(tradingProducts, "tradingProducts");
            Intrinsics.checkNotNullParameter(portfolios, "portfolios");
            Intrinsics.checkNotNullParameter(allowedTrades, "allowedTrades");
            Intrinsics.checkNotNullParameter(allowedCashOperations, "allowedCashOperations");
            Intrinsics.checkNotNullParameter(holdingCurrencies, "holdingCurrencies");
            Intrinsics.checkNotNullParameter(permittedActions, "permittedActions");
            Intrinsics.checkNotNullParameter(beneficiary, "beneficiary");
            this.f262042b = id10;
            this.f262043c = accountHolderId;
            this.d = globalPersonalAccountId;
            this.e = state;
            this.f = accountHolderType;
            this.f262044g = tradingProducts;
            this.f262045h = portfolios;
            this.i = allowedTrades;
            this.f262046j = allowedCashOperations;
            this.k = holdingCurrencies;
            this.f262047l = e0Var;
            this.f262048m = permittedActions;
            this.f262049n = beneficiary;
        }
    }
}
