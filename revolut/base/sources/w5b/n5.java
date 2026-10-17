package w5b;

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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0081\b\u0018\u0000 \u00052\u00020\u0001:\b\u0006\u0007\b\t\n\u000b\f\rJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, d2 = {"Lw5b/n5;", "", "", "toString", "()Ljava/lang/String;", "Companion", "d", "g", "w5b/r5", "e", "b", "f", "a", "c", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class n5 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f294938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f294939b;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f294940a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f294940a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsUpsellBannerDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("content", true);
            pluginGeneratedSerialDescriptor.j("offer", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{nlm.a.c(d.a.f294946a), nlm.a.c(f.a.f294951a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            d dVar = null;
            boolean z = true;
            int i = 0;
            f fVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, d.a.f294946a, dVar);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    fVar = (f) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, f.a.f294951a, fVar);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new n5(i, dVar, fVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            n5 value = (n5) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294938a != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, d.a.f294946a, value.f294938a);
            }
            if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294939b != null) {
                compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, f.a.f294951a, value.f294939b);
            }
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lw5b/n5$b;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f294941a;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f294942a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f294942a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsUpsellBannerDto.ActionDto", aVar, 1);
                pluginGeneratedSerialDescriptor.j("deeplink", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c(qlm.v1.f247718a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, str);
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
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294941a != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f294941a);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: w5b.n5$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f294942a;
            }
        }

        public /* synthetic */ b(int i, String str) {
            if ((i & 1) == 0) {
                this.f294941a = null;
            } else {
                this.f294941a = str;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof b) && Intrinsics.f(this.f294941a, ((b) obj2).f294941a);
        }

        public final int hashCode() {
            String str = this.f294941a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public b(String str) {
            this.f294941a = str;
        }

        public b() {
            this(null);
        }
    }

    /* JADX INFO: renamed from: w5b.n5$c, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f294940a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lw5b/n5$d;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final g f294943a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f294944b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f294945c;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f294946a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f294946a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsUpsellBannerDto.ContentDto", aVar, 3);
                pluginGeneratedSerialDescriptor.j("title", true);
                pluginGeneratedSerialDescriptor.j("icon", true);
                pluginGeneratedSerialDescriptor.j("action", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c(g.a.f294955a), nlm.a.c(e.a.f294949a), nlm.a.c(b.a.f294942a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                g gVar = null;
                boolean z = true;
                int i = 0;
                e eVar = null;
                b bVar = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        gVar = (g) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, g.a.f294955a, gVar);
                        i |= 1;
                    } else if (iD == 1) {
                        eVar = (e) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, e.a.f294949a, eVar);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        bVar = (b) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, b.a.f294942a, bVar);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, gVar, eVar, bVar);
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
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294943a != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, g.a.f294955a, value.f294943a);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294944b != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, e.a.f294949a, value.f294944b);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294945c != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 2, b.a.f294942a, value.f294945c);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: w5b.n5$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f294946a;
            }
        }

        public /* synthetic */ d(int i, g gVar, e eVar, b bVar) {
            if ((i & 1) == 0) {
                this.f294943a = null;
            } else {
                this.f294943a = gVar;
            }
            if ((i & 2) == 0) {
                this.f294944b = null;
            } else {
                this.f294944b = eVar;
            }
            if ((i & 4) == 0) {
                this.f294945c = null;
            } else {
                this.f294945c = bVar;
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
            return Intrinsics.f(this.f294943a, dVar.f294943a) && Intrinsics.f(this.f294944b, dVar.f294944b) && Intrinsics.f(this.f294945c, dVar.f294945c);
        }

        public final int hashCode() {
            g gVar = this.f294943a;
            int iHashCode = (gVar == null ? 0 : gVar.hashCode()) * 31;
            e eVar = this.f294944b;
            int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
            b bVar = this.f294945c;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public d(g gVar, e eVar, b bVar) {
            this.f294943a = gVar;
            this.f294944b = eVar;
            this.f294945c = bVar;
        }

        public d() {
            this(null, null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lw5b/n5$e;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f294947a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f294948b;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f294949a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f294949a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsUpsellBannerDto.IconDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("type", true);
                pluginGeneratedSerialDescriptor.j("asset", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                qlm.v1 v1Var = qlm.v1.f247718a;
                return new KSerializer[]{nlm.a.c(v1Var), nlm.a.c(v1Var)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                String str2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        str2 = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, str2);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(i, str, str2);
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
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294947a != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f294947a);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294948b != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, qlm.v1.f247718a, value.f294948b);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: w5b.n5$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f294949a;
            }
        }

        public /* synthetic */ e(int i, String str, String str2) {
            if ((i & 1) == 0) {
                this.f294947a = null;
            } else {
                this.f294947a = str;
            }
            if ((i & 2) == 0) {
                this.f294948b = null;
            } else {
                this.f294948b = str2;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.f294947a, eVar.f294947a) && Intrinsics.f(this.f294948b, eVar.f294948b);
        }

        public final int hashCode() {
            String str = this.f294947a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f294948b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public e(String str, String str2) {
            this.f294947a = str;
            this.f294948b = str2;
        }

        public e() {
            this(null, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lw5b/n5$f;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class f {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f294950a;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f294951a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f294951a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsUpsellBannerDto.OfferDto", aVar, 1);
                pluginGeneratedSerialDescriptor.j("planTier", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c(qlm.v1.f247718a)};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new f(i, str);
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
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294950a != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f294950a);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: w5b.n5$f$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f294951a;
            }
        }

        public /* synthetic */ f(int i, String str) {
            if ((i & 1) == 0) {
                this.f294950a = null;
            } else {
                this.f294950a = str;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            return (obj2 instanceof f) && Intrinsics.f(this.f294950a, ((f) obj2).f294950a);
        }

        public final int hashCode() {
            String str = this.f294950a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public f(String str) {
            this.f294950a = str;
        }

        public f() {
            this(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00052\u00020\u0001:\u0002\u0006\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lw5b/n5$g;", "", "", "toString", "()Ljava/lang/String;", "Companion", "a", "b", "feature_retail_cobranded_cards_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class g {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f294952c = {null, yhm.j.c(yhm.k.PUBLICATION, new w56.a(27))};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f294953a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f294954b;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f294955a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f294955a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.retail.cobranded_cards.impl.data.dto.CobrandedCardsUpsellBannerDto.ParametrizedTextDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("text", true);
                pluginGeneratedSerialDescriptor.j("params", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{nlm.a.c(qlm.v1.f247718a), nlm.a.c((KSerializer) g.f294952c[1].getValue())};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = g.f294952c;
                dVarBeginStructure.getClass();
                String str = null;
                boolean z = true;
                int i = 0;
                List list = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, str);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        list = (List) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new g(i, str, list);
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
                Lazy[] lazyArr = g.f294952c;
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294953a != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 0, qlm.v1.f247718a, value.f294953a);
                }
                if (compositeEncoderBeginStructure.d(serialDescriptor) || value.f294954b != null) {
                    compositeEncoderBeginStructure.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) lazyArr[1].getValue(), value.f294954b);
                }
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: w5b.n5$g$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f294955a;
            }
        }

        public /* synthetic */ g(int i, String str, List list) {
            if ((i & 1) == 0) {
                this.f294953a = null;
            } else {
                this.f294953a = str;
            }
            if ((i & 2) == 0) {
                this.f294954b = null;
            } else {
                this.f294954b = list;
            }
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof g)) {
                return false;
            }
            g gVar = (g) obj2;
            return Intrinsics.f(this.f294953a, gVar.f294953a) && Intrinsics.f(this.f294954b, gVar.f294954b);
        }

        public final int hashCode() {
            String str = this.f294953a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            List list = this.f294954b;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public g(String str, ArrayList arrayList) {
            this.f294953a = str;
            this.f294954b = arrayList;
        }

        public g() {
            this(null, null);
        }
    }

    public /* synthetic */ n5(int i, d dVar, f fVar) {
        if ((i & 1) == 0) {
            this.f294938a = null;
        } else {
            this.f294938a = dVar;
        }
        if ((i & 2) == 0) {
            this.f294939b = null;
        } else {
            this.f294939b = fVar;
        }
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof n5)) {
            return false;
        }
        n5 n5Var = (n5) obj2;
        return Intrinsics.f(this.f294938a, n5Var.f294938a) && Intrinsics.f(this.f294939b, n5Var.f294939b);
    }

    public final int hashCode() {
        d dVar = this.f294938a;
        int iHashCode = (dVar == null ? 0 : dVar.hashCode()) * 31;
        f fVar = this.f294939b;
        return iHashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public n5(d dVar, f fVar) {
        this.f294938a = dVar;
        this.f294939b = fVar;
    }

    public n5() {
        this(null, null);
    }
}
