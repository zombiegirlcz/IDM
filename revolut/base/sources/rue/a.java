package rue;

import ip0.v7;
import java.util.List;
import jo3.a;
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
import mlm.g;
import mlm.h;
import org.jetbrains.annotations.NotNull;
import plm.d;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import yhm.j;
import yhm.k;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0081\b\u0018\u0000 \r2\u00020\u0001:\u0005\u000e\u000f\n\u0006\u0010J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\u0004¨\u0006\u0011"}, d2 = {"Lrue/a;", "", "", "toString", "()Ljava/lang/String;", "Lrue/a$c;", "a", "Lrue/a$c;", "()Lrue/a$c;", "charges", "b", "Ljava/lang/String;", "message", "Companion", "c", "e", "d", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@g
public final /* data */ class a {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("charges")
    @NotNull
    private final c charges;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("message")
    private final String message;

    /* JADX INFO: renamed from: rue.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1421a implements f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1421a f257532a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            C1421a c1421a = new C1421a();
            f257532a = c1421a;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.topup_screen.impl.data.network.model.fees.BeDrivenTopUpFeeDto", c1421a, 2);
            pluginGeneratedSerialDescriptor.j("charges", false);
            pluginGeneratedSerialDescriptor.j("message", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private C1421a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{c.C1424a.f257540a, nlm.a.c(v1.f247718a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            c cVar = null;
            boolean z = true;
            int i = 0;
            String str = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c.C1424a.f257540a, cVar);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    str = (String) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, str);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a(i, cVar, str);
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
            a.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0002\u0005\tJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\t\u0010\u0004R\u001a\u0010\f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\u000b\u0010\u0004R\u001a\u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\u0005\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0014"}, d2 = {"Lrue/a$b;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "d", "type", "b", "shortDescription", "c", "title", "description", "Ljo3/a;", "e", "Ljo3/a;", "()Ljo3/a;", "value", "Companion", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("type")
        @NotNull
        private final String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("shortDescription")
        @NotNull
        private final String shortDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("description")
        @NotNull
        private final String description;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final jo3.a value;

        /* JADX INFO: renamed from: rue.a$b$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1422a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1422a f257536a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C1422a c1422a = new C1422a();
                f257536a = c1422a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.topup_screen.impl.data.network.model.fees.BeDrivenTopUpFeeDto.BreakdownItemDto", c1422a, 5);
                pluginGeneratedSerialDescriptor.j("type", false);
                pluginGeneratedSerialDescriptor.j("shortDescription", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("description", false);
                pluginGeneratedSerialDescriptor.j("value", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C1422a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var, v1Var, v1Var, a.C1001a.f176860a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                String strDecodeStringElement = null;
                String strDecodeStringElement2 = null;
                String strDecodeStringElement3 = null;
                String strDecodeStringElement4 = null;
                jo3.a aVar = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    } else if (iD == 2) {
                        strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                        i |= 4;
                    } else if (iD == 3) {
                        strDecodeStringElement4 = dVarBeginStructure.decodeStringElement(serialDescriptor, 3);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, aVar);
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3, strDecodeStringElement4, aVar);
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
                b.f(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: rue.a$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C1422a.f257536a;
            }
        }

        public /* synthetic */ b(int i, String str, String str2, String str3, String str4, jo3.a aVar) {
            if (31 != (i & 31)) {
                j1.f(C1422a.f257536a.getDescriptor(), i, 31);
                throw null;
            }
            this.type = str;
            this.shortDescription = str2;
            this.title = str3;
            this.description = str4;
            this.value = aVar;
        }

        public static final /* synthetic */ void f(b bVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, bVar.type);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, bVar.shortDescription);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, bVar.title);
            compositeEncoder.encodeStringElement(serialDescriptor, 3, bVar.description);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 4, a.C1001a.f176860a, bVar.value);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getShortDescription() {
            return this.shortDescription;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getType() {
            return this.type;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final jo3.a getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof b)) {
                return false;
            }
            b bVar = (b) obj2;
            return Intrinsics.f(this.type, bVar.type) && Intrinsics.f(this.shortDescription, bVar.shortDescription) && Intrinsics.f(this.title, bVar.title) && Intrinsics.f(this.description, bVar.description) && Intrinsics.f(this.value, bVar.value);
        }

        public final int hashCode() {
            return this.value.hashCode() + p.a.c(p.a.c(p.a.c(this.type.hashCode() * 31, 31, this.shortDescription), 31, this.title), 31, this.description);
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0002\u0005\nJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\u0004R\u001a\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0012\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0005\u0010\u0011R\u001a\u0010\u0013\u001a\u00020\u000f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\n\u0010\u0011¨\u0006\u0015"}, d2 = {"Lrue/a$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "c", "title", "Ljo3/a;", "b", "Ljo3/a;", "d", "()Ljo3/a;", "total", "Lrue/a$e;", "Lrue/a$e;", "()Lrue/a$e;", "fees", "taxes", "Companion", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("total")
        @NotNull
        private final jo3.a total;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fees")
        @NotNull
        private final e fees;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        @lg.b("taxes")
        @NotNull
        private final e taxes;

        /* JADX INFO: renamed from: rue.a$c$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1424a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1424a f257540a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C1424a c1424a = new C1424a();
                f257540a = c1424a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.topup_screen.impl.data.network.model.fees.BeDrivenTopUpFeeDto.ChargesDto", c1424a, 4);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("total", false);
                pluginGeneratedSerialDescriptor.j("fees", false);
                pluginGeneratedSerialDescriptor.j("taxes", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C1424a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                e.C1425a c1425a = e.C1425a.f257544a;
                return new KSerializer[]{v1.f247718a, a.C1001a.f176860a, c1425a, c1425a};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                String strDecodeStringElement = null;
                jo3.a aVar = null;
                e eVar = null;
                e eVar2 = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else if (iD == 1) {
                        aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, aVar);
                        i |= 2;
                    } else if (iD == 2) {
                        eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, e.C1425a.f257544a, eVar);
                        i |= 4;
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        eVar2 = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, e.C1425a.f257544a, eVar2);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, strDecodeStringElement, aVar, eVar, eVar2);
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
                c.e(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: rue.a$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C1424a.f257540a;
            }
        }

        public /* synthetic */ c(int i, String str, jo3.a aVar, e eVar, e eVar2) {
            if (15 != (i & 15)) {
                j1.f(C1424a.f257540a.getDescriptor(), i, 15);
                throw null;
            }
            this.title = str;
            this.total = aVar;
            this.fees = eVar;
            this.taxes = eVar2;
        }

        public static final /* synthetic */ void e(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cVar.title);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, a.C1001a.f176860a, cVar.total);
            e.C1425a c1425a = e.C1425a.f257544a;
            compositeEncoder.encodeSerializableElement(serialDescriptor, 2, c1425a, cVar.fees);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 3, c1425a, cVar.taxes);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e getFees() {
            return this.fees;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final e getTaxes() {
            return this.taxes;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final jo3.a getTotal() {
            return this.total;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.total, cVar.total) && Intrinsics.f(this.fees, cVar.fees) && Intrinsics.f(this.taxes, cVar.taxes);
        }

        public final int hashCode() {
            return this.taxes.hashCode() + ((this.fees.hashCode() + v7.j(this.total, this.title.hashCode() * 31, 31)) * 31);
        }
    }

    /* JADX INFO: renamed from: rue.a$d, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return C1421a.f257532a;
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0006\bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\r\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0011"}, d2 = {"Lrue/a$e;", "", "", "toString", "()Ljava/lang/String;", "Ljo3/a;", "a", "Ljo3/a;", "b", "()Ljo3/a;", "total", "", "Lrue/a$b;", "Ljava/util/List;", "()Ljava/util/List;", "breakdown", "Companion", "feature_topup_screen_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @g
    public static final /* data */ class e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f257541c = {null, j.c(k.PUBLICATION, new rr4.a(18))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("total")
        @NotNull
        private final jo3.a total;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("breakdown")
        @NotNull
        private final List<b> breakdown;

        /* JADX INFO: renamed from: rue.a$e$a, reason: collision with other inner class name */
        public static final /* synthetic */ class C1425a implements f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1425a f257544a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                C1425a c1425a = new C1425a();
                f257544a = c1425a;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.topup_screen.impl.data.network.model.fees.BeDrivenTopUpFeeDto.FeesSectionDto", c1425a, 2);
                pluginGeneratedSerialDescriptor.j("total", false);
                pluginGeneratedSerialDescriptor.j("breakdown", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private C1425a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{a.C1001a.f176860a, e.f257541c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = e.f257541c;
                dVarBeginStructure.getClass();
                jo3.a aVar = null;
                boolean z = true;
                int i = 0;
                List list = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        aVar = (jo3.a) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, aVar);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), list);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(i, list, aVar);
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
                e.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: rue.a$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return C1425a.f257544a;
            }
        }

        public /* synthetic */ e(int i, List list, jo3.a aVar) {
            if (3 != (i & 3)) {
                j1.f(C1425a.f257544a.getDescriptor(), i, 3);
                throw null;
            }
            this.total = aVar;
            this.breakdown = list;
        }

        public static final /* synthetic */ void c(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeSerializableElement(serialDescriptor, 0, a.C1001a.f176860a, eVar.total);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, (h) f257541c[1].getValue(), eVar.breakdown);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getBreakdown() {
            return this.breakdown;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final jo3.a getTotal() {
            return this.total;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.total, eVar.total) && Intrinsics.f(this.breakdown, eVar.breakdown);
        }

        public final int hashCode() {
            return this.breakdown.hashCode() + (this.total.hashCode() * 31);
        }
    }

    public /* synthetic */ a(int i, c cVar, String str) {
        if (1 != (i & 1)) {
            j1.f(C1421a.f257532a.getDescriptor(), i, 1);
            throw null;
        }
        this.charges = cVar;
        if ((i & 2) == 0) {
            this.message = null;
        } else {
            this.message = str;
        }
    }

    public static final /* synthetic */ void c(a aVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeSerializableElement(serialDescriptor, 0, c.C1424a.f257540a, aVar.charges);
        if (!compositeEncoder.d(serialDescriptor) && aVar.message == null) {
            return;
        }
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, v1.f247718a, aVar.message);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getCharges() {
        return this.charges;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof a)) {
            return false;
        }
        a aVar = (a) obj2;
        return Intrinsics.f(this.charges, aVar.charges) && Intrinsics.f(this.message, aVar.message);
    }

    public final int hashCode() {
        int iHashCode = this.charges.hashCode() * 31;
        String str = this.message;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }
}
