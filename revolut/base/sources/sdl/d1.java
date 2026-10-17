package sdl;

import java.util.UUID;
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
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 \u00042\u00020\u0001:\u0003\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lsdl/d1;", "", "<init>", "()V", "Companion", "c", "a", "b", "Lsdl/d1$a;", "Lsdl/d1$c;", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@rlm.g(discriminator = "code")
@mlm.g
public abstract class d1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f261947a = yhm.j.c(yhm.k.PUBLICATION, new y(11));

    /* JADX INFO: renamed from: sdl.d1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
        @NotNull
        public final KSerializer serializer() {
            return (KSerializer) d1.f261947a.getValue();
        }
    }

    private d1() {
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/d1$a;", "Lsdl/d1;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class a extends d1 {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final UUID f261948b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f261949c;

        /* JADX INFO: renamed from: sdl.d1$a$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1451a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1451a f261950a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C1451a c1451a = new C1451a();
                f261950a = c1451a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.shared.feature.wealth.domain.impl.data.network.trading_accounts.TradingProductDetailsDto.Common", c1451a, 2);
                pluginGeneratedSerialDescriptor.j("id", false);
                pluginGeneratedSerialDescriptor.j("code", false);
                pluginGeneratedSerialDescriptor.l(new h1());
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C1451a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{ie0.s.f160620a, v1.f247718a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                UUID uuid = null;
                boolean z = true;
                int i = 0;
                String strDecodeStringElement = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new a(i, uuid, strDecodeStringElement);
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
                Companion companion = a.INSTANCE;
                compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, value.f261948b);
                compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 1, value.f261949c);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: sdl.d1$a$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C1451a.f261950a;
            }
        }

        public /* synthetic */ a(int i, UUID uuid, String str) {
            if (3 != (i & 3)) {
                qlm.j1.f(C1451a.f261950a.getDescriptor(), i, 3);
                throw null;
            }
            this.f261948b = uuid;
            this.f261949c = str;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof a)) {
                return false;
            }
            a aVar = (a) obj2;
            return Intrinsics.f(this.f261948b, aVar.f261948b) && Intrinsics.f(this.f261949c, aVar.f261949c);
        }

        public final int hashCode() {
            return this.f261949c.hashCode() + (this.f261948b.hashCode() * 31);
        }

        public a(UUID id10, String productCode) {
            Intrinsics.checkNotNullParameter(id10, "id");
            Intrinsics.checkNotNullParameter(productCode, "productCode");
            this.f261948b = id10;
            this.f261949c = productCode;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\u000b\f\r\u000e¨\u0006\u000f"}, d2 = {"Lsdl/d1$c;", "Lsdl/d1;", "<init>", "()V", "a", "b", "d", "c", "sdl/q1", "sdl/g1", "sdl/n1", "Lsdl/d1$c$a;", "Lsdl/d1$c$b;", "Lsdl/d1$c$c;", "Lsdl/d1$c$d;", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class c extends d1 {
        private c() {
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/d1$c$a;", "Lsdl/d1$c;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class a extends c {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UUID f261951b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final q1 f261952c;
            public final g1 d;
            public final n1 e;
            public final String f;

            /* JADX INFO: renamed from: sdl.d1$c$a$a, reason: collision with other inner class name */
            public static final /* synthetic */ class C1452a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C1452a f261953a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    C1452a c1452a = new C1452a();
                    f261953a = c1452a;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ROBO_EU", c1452a, 5);
                    pluginGeneratedSerialDescriptor.j("id", false);
                    pluginGeneratedSerialDescriptor.j("limits", false);
                    pluginGeneratedSerialDescriptor.j("defaults", false);
                    pluginGeneratedSerialDescriptor.j("fees", false);
                    pluginGeneratedSerialDescriptor.j("productCode", true);
                    pluginGeneratedSerialDescriptor.l(new h1());
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private C1452a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    return new KSerializer[]{ie0.s.f160620a, o1.f261992a, e1.f261964a, i1.f261973a, v1.f247718a};
                }

                @Override // mlm.b
                public final Object deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    dVarBeginStructure.getClass();
                    int i = 0;
                    UUID uuid = null;
                    q1 q1Var = null;
                    g1 g1Var = null;
                    n1 n1Var = null;
                    String strDecodeStringElement = null;
                    boolean z = true;
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else if (iD == 0) {
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                        } else if (iD == 1) {
                            q1Var = (q1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, o1.f261992a, q1Var);
                            i |= 2;
                        } else if (iD == 2) {
                            g1Var = (g1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, e1.f261964a, g1Var);
                            i |= 4;
                        } else if (iD == 3) {
                            n1Var = (n1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, i1.f261973a, n1Var);
                            i |= 8;
                        } else {
                            if (iD != 4) {
                                throw new UnknownFieldException(iD);
                            }
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                            i |= 16;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new a(i, uuid, q1Var, g1Var, n1Var, strDecodeStringElement);
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
                    Companion companion = a.INSTANCE;
                    ie0.s sVar = ie0.s.f160620a;
                    UUID uuid = value.f261951b;
                    String str = value.f;
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uuid);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, o1.f261992a, value.f261952c);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, e1.f261964a, value.d);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, i1.f261973a, value.e);
                    if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(str, "ROBO_EU")) {
                        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, str);
                    }
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: sdl.d1$c$a$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return C1452a.f261953a;
                }
            }

            public a(int i, UUID uuid, q1 q1Var, g1 g1Var, n1 n1Var, String str) {
                if (15 != (i & 15)) {
                    qlm.j1.f(C1452a.f261953a.getDescriptor(), i, 15);
                    throw null;
                }
                this.f261951b = uuid;
                this.f261952c = q1Var;
                this.d = g1Var;
                this.e = n1Var;
                if ((i & 16) == 0) {
                    this.f = "ROBO_EU";
                } else {
                    this.f = str;
                }
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof a)) {
                    return false;
                }
                a aVar = (a) obj2;
                return Intrinsics.f(this.f261951b, aVar.f261951b) && Intrinsics.f(this.f261952c, aVar.f261952c) && Intrinsics.f(this.d, aVar.d) && Intrinsics.f(this.e, aVar.e);
            }

            public final int hashCode() {
                return this.e.f261991a.hashCode() + ((this.d.hashCode() + ((this.f261952c.hashCode() + (this.f261951b.hashCode() * 31)) * 31)) * 31);
            }

            public a(UUID id10, q1 limits, g1 defaults, n1 fees) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(limits, "limits");
                Intrinsics.checkNotNullParameter(defaults, "defaults");
                Intrinsics.checkNotNullParameter(fees, "fees");
                this.f261951b = id10;
                this.f261952c = limits;
                this.d = defaults;
                this.e = fees;
                this.f = "ROBO_EU";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/d1$c$b;", "Lsdl/d1$c;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class b extends c {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UUID f261954b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final q1 f261955c;
            public final g1 d;
            public final n1 e;
            public final String f;

            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f261956a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f261956a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ROBO_GB", aVar, 5);
                    pluginGeneratedSerialDescriptor.j("id", false);
                    pluginGeneratedSerialDescriptor.j("limits", false);
                    pluginGeneratedSerialDescriptor.j("defaults", false);
                    pluginGeneratedSerialDescriptor.j("fees", false);
                    pluginGeneratedSerialDescriptor.j("productCode", true);
                    pluginGeneratedSerialDescriptor.l(new h1());
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    return new KSerializer[]{ie0.s.f160620a, o1.f261992a, e1.f261964a, i1.f261973a, v1.f247718a};
                }

                @Override // mlm.b
                public final Object deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    dVarBeginStructure.getClass();
                    int i = 0;
                    UUID uuid = null;
                    q1 q1Var = null;
                    g1 g1Var = null;
                    n1 n1Var = null;
                    String strDecodeStringElement = null;
                    boolean z = true;
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else if (iD == 0) {
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                        } else if (iD == 1) {
                            q1Var = (q1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, o1.f261992a, q1Var);
                            i |= 2;
                        } else if (iD == 2) {
                            g1Var = (g1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, e1.f261964a, g1Var);
                            i |= 4;
                        } else if (iD == 3) {
                            n1Var = (n1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, i1.f261973a, n1Var);
                            i |= 8;
                        } else {
                            if (iD != 4) {
                                throw new UnknownFieldException(iD);
                            }
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                            i |= 16;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new b(i, uuid, q1Var, g1Var, n1Var, strDecodeStringElement);
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
                    Companion companion = b.INSTANCE;
                    ie0.s sVar = ie0.s.f160620a;
                    UUID uuid = value.f261954b;
                    String str = value.f;
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uuid);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, o1.f261992a, value.f261955c);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, e1.f261964a, value.d);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, i1.f261973a, value.e);
                    if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(str, "ROBO_GB")) {
                        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, str);
                    }
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: sdl.d1$c$b$b, reason: collision with other inner class name and from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f261956a;
                }
            }

            public b(int i, UUID uuid, q1 q1Var, g1 g1Var, n1 n1Var, String str) {
                if (15 != (i & 15)) {
                    qlm.j1.f(a.f261956a.getDescriptor(), i, 15);
                    throw null;
                }
                this.f261954b = uuid;
                this.f261955c = q1Var;
                this.d = g1Var;
                this.e = n1Var;
                if ((i & 16) == 0) {
                    this.f = "ROBO_GB";
                } else {
                    this.f = str;
                }
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof b)) {
                    return false;
                }
                b bVar = (b) obj2;
                return Intrinsics.f(this.f261954b, bVar.f261954b) && Intrinsics.f(this.f261955c, bVar.f261955c) && Intrinsics.f(this.d, bVar.d) && Intrinsics.f(this.e, bVar.e);
            }

            public final int hashCode() {
                return this.e.f261991a.hashCode() + ((this.d.hashCode() + ((this.f261955c.hashCode() + (this.f261954b.hashCode() * 31)) * 31)) * 31);
            }

            public b(UUID id10, q1 limits, g1 defaults, n1 fees) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(limits, "limits");
                Intrinsics.checkNotNullParameter(defaults, "defaults");
                Intrinsics.checkNotNullParameter(fees, "fees");
                this.f261954b = id10;
                this.f261955c = limits;
                this.d = defaults;
                this.e = fees;
                this.f = "ROBO_GB";
            }
        }

        /* JADX INFO: renamed from: sdl.d1$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/d1$c$c;", "Lsdl/d1$c;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class C1454c extends c {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UUID f261957b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final q1 f261958c;
            public final g1 d;
            public final n1 e;
            public final String f;

            /* JADX INFO: renamed from: sdl.d1$c$c$a */
            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f261959a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f261959a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ROBO_SG", aVar, 5);
                    pluginGeneratedSerialDescriptor.j("id", false);
                    pluginGeneratedSerialDescriptor.j("limits", false);
                    pluginGeneratedSerialDescriptor.j("defaults", false);
                    pluginGeneratedSerialDescriptor.j("fees", false);
                    pluginGeneratedSerialDescriptor.j("productCode", true);
                    pluginGeneratedSerialDescriptor.l(new h1());
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    return new KSerializer[]{ie0.s.f160620a, o1.f261992a, e1.f261964a, i1.f261973a, v1.f247718a};
                }

                @Override // mlm.b
                public final Object deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    dVarBeginStructure.getClass();
                    int i = 0;
                    UUID uuid = null;
                    q1 q1Var = null;
                    g1 g1Var = null;
                    n1 n1Var = null;
                    String strDecodeStringElement = null;
                    boolean z = true;
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else if (iD == 0) {
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                        } else if (iD == 1) {
                            q1Var = (q1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, o1.f261992a, q1Var);
                            i |= 2;
                        } else if (iD == 2) {
                            g1Var = (g1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, e1.f261964a, g1Var);
                            i |= 4;
                        } else if (iD == 3) {
                            n1Var = (n1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, i1.f261973a, n1Var);
                            i |= 8;
                        } else {
                            if (iD != 4) {
                                throw new UnknownFieldException(iD);
                            }
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                            i |= 16;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new C1454c(i, uuid, q1Var, g1Var, n1Var, strDecodeStringElement);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    C1454c value = (C1454c) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    Companion companion = C1454c.INSTANCE;
                    ie0.s sVar = ie0.s.f160620a;
                    UUID uuid = value.f261957b;
                    String str = value.f;
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uuid);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, o1.f261992a, value.f261958c);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, e1.f261964a, value.d);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, i1.f261973a, value.e);
                    if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(str, "ROBO_SG")) {
                        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, str);
                    }
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: sdl.d1$c$c$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f261959a;
                }
            }

            public C1454c(int i, UUID uuid, q1 q1Var, g1 g1Var, n1 n1Var, String str) {
                if (15 != (i & 15)) {
                    qlm.j1.f(a.f261959a.getDescriptor(), i, 15);
                    throw null;
                }
                this.f261957b = uuid;
                this.f261958c = q1Var;
                this.d = g1Var;
                this.e = n1Var;
                if ((i & 16) == 0) {
                    this.f = "ROBO_SG";
                } else {
                    this.f = str;
                }
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C1454c)) {
                    return false;
                }
                C1454c c1454c = (C1454c) obj2;
                return Intrinsics.f(this.f261957b, c1454c.f261957b) && Intrinsics.f(this.f261958c, c1454c.f261958c) && Intrinsics.f(this.d, c1454c.d) && Intrinsics.f(this.e, c1454c.e);
            }

            public final int hashCode() {
                return this.e.f261991a.hashCode() + ((this.d.hashCode() + ((this.f261958c.hashCode() + (this.f261957b.hashCode() * 31)) * 31)) * 31);
            }

            public C1454c(UUID id10, q1 limits, g1 defaults, n1 fees) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(limits, "limits");
                Intrinsics.checkNotNullParameter(defaults, "defaults");
                Intrinsics.checkNotNullParameter(fees, "fees");
                this.f261957b = id10;
                this.f261958c = limits;
                this.d = defaults;
                this.e = fees;
                this.f = "ROBO_SG";
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lsdl/d1$c$d;", "Lsdl/d1$c;", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_shared_wealth_domain_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class d extends c {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final UUID f261960b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final q1 f261961c;
            public final g1 d;
            public final n1 e;
            public final String f;

            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f261962a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f261962a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ROBO_US", aVar, 5);
                    pluginGeneratedSerialDescriptor.j("id", false);
                    pluginGeneratedSerialDescriptor.j("limits", false);
                    pluginGeneratedSerialDescriptor.j("defaults", false);
                    pluginGeneratedSerialDescriptor.j("fees", false);
                    pluginGeneratedSerialDescriptor.j("productCode", true);
                    pluginGeneratedSerialDescriptor.l(new h1());
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    return new KSerializer[]{ie0.s.f160620a, o1.f261992a, e1.f261964a, i1.f261973a, v1.f247718a};
                }

                @Override // mlm.b
                public final Object deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    dVarBeginStructure.getClass();
                    int i = 0;
                    UUID uuid = null;
                    q1 q1Var = null;
                    g1 g1Var = null;
                    n1 n1Var = null;
                    String strDecodeStringElement = null;
                    boolean z = true;
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else if (iD == 0) {
                            uuid = (UUID) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, ie0.s.f160620a, uuid);
                            i |= 1;
                        } else if (iD == 1) {
                            q1Var = (q1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, o1.f261992a, q1Var);
                            i |= 2;
                        } else if (iD == 2) {
                            g1Var = (g1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, e1.f261964a, g1Var);
                            i |= 4;
                        } else if (iD == 3) {
                            n1Var = (n1) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, i1.f261973a, n1Var);
                            i |= 8;
                        } else {
                            if (iD != 4) {
                                throw new UnknownFieldException(iD);
                            }
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 4);
                            i |= 16;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new d(i, uuid, q1Var, g1Var, n1Var, strDecodeStringElement);
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
                    Companion companion = d.INSTANCE;
                    ie0.s sVar = ie0.s.f160620a;
                    UUID uuid = value.f261960b;
                    String str = value.f;
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 0, sVar, uuid);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 1, o1.f261992a, value.f261961c);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 2, e1.f261964a, value.d);
                    compositeEncoderBeginStructure.encodeSerializableElement(serialDescriptor, 3, i1.f261973a, value.e);
                    if (compositeEncoderBeginStructure.d(serialDescriptor) || !Intrinsics.f(str, "ROBO_US")) {
                        compositeEncoderBeginStructure.encodeStringElement(serialDescriptor, 4, str);
                    }
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: sdl.d1$c$d$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f261962a;
                }
            }

            public d(int i, UUID uuid, q1 q1Var, g1 g1Var, n1 n1Var, String str) {
                if (15 != (i & 15)) {
                    qlm.j1.f(a.f261962a.getDescriptor(), i, 15);
                    throw null;
                }
                this.f261960b = uuid;
                this.f261961c = q1Var;
                this.d = g1Var;
                this.e = n1Var;
                if ((i & 16) == 0) {
                    this.f = "ROBO_US";
                } else {
                    this.f = str;
                }
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof d)) {
                    return false;
                }
                d dVar = (d) obj2;
                return Intrinsics.f(this.f261960b, dVar.f261960b) && Intrinsics.f(this.f261961c, dVar.f261961c) && Intrinsics.f(this.d, dVar.d) && Intrinsics.f(this.e, dVar.e);
            }

            public final int hashCode() {
                return this.e.f261991a.hashCode() + ((this.d.hashCode() + ((this.f261961c.hashCode() + (this.f261960b.hashCode() * 31)) * 31)) * 31);
            }

            public d(UUID id10, q1 limits, g1 defaults, n1 fees) {
                Intrinsics.checkNotNullParameter(id10, "id");
                Intrinsics.checkNotNullParameter(limits, "limits");
                Intrinsics.checkNotNullParameter(defaults, "defaults");
                Intrinsics.checkNotNullParameter(fees, "fees");
                this.f261960b = id10;
                this.f261961c = limits;
                this.d = defaults;
                this.e = fees;
                this.f = "ROBO_US";
            }
        }
    }
}
