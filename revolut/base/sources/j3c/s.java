package j3c;

import j1f.q0;
import java.util.List;
import java.util.Map;
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
import qlm.j1;
import qlm.v1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0081\b\u0018\u0000 \u001c2\u00020\u0001:\u0006\u001d\u001e\u0012\r\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R\"\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0015\u0010\t\u001a\u0004\b\u0005\u0010\u0014R\"\u0010\u001b\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0018\u0012\u0004\b\u001a\u0010\t\u001a\u0004\b\u0012\u0010\u0019¨\u0006\u001f"}, d2 = {"Lj3c/s;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "getProductDescription$annotations", "()V", "productDescription", "Lj3c/s$e;", "Lj3c/s$e;", "d", "()Lj3c/s$e;", "getStylePicker$annotations", "stylePicker", "Lj3c/s$c;", "c", "Lj3c/s$c;", "()Lj3c/s$c;", "getDetails$annotations", "details", "Lj3c/s$d;", "Lj3c/s$d;", "()Lj3c/s$d;", "getSpecs$annotations", "specs", "Companion", "e", "f", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class s {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("productDescription")
    @NotNull
    private final String productDescription;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("stylePicker")
    private final e stylePicker;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @lg.b("details")
    private final c details;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @lg.b("specs")
    private final d specs;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f171115a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f171115a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppProductPageDefinitionDto", aVar, 4);
            pluginGeneratedSerialDescriptor.j("productDescription", false);
            pluginGeneratedSerialDescriptor.j("stylePicker", false);
            pluginGeneratedSerialDescriptor.j("details", false);
            pluginGeneratedSerialDescriptor.j("specs", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{v1.f247718a, nlm.a.c(e.a.f171135a), nlm.a.c(c.a.f171119a), nlm.a.c(d.a.f171127a)};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            e eVar = null;
            c cVar = null;
            d dVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    eVar = (e) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, e.a.f171135a, eVar);
                    i |= 2;
                } else if (iD == 2) {
                    cVar = (c) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 2, c.a.f171119a, cVar);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    dVar = (d) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 3, d.a.f171127a, dVar);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new s(i, strDecodeStringElement, eVar, cVar, dVar);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            s value = (s) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            s.e(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: j3c.s$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f171115a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, d2 = {"Lj3c/s$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "getTitle$annotations", "()V", "title", "", "Lj3c/s$c$c;", "Ljava/util/List;", "()Ljava/util/List;", "getSubsections$annotations", "subsections", "Companion", "c", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f171116c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(20))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("subsections")
        @NotNull
        private final List<C0972c> subsections;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f171119a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f171119a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppProductPageDefinitionDto.DetailsDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subsections", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, c.f171116c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = c.f171116c;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                List list = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
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
                return new c(i, strDecodeStringElement, list);
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
                c.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: j3c.s$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f171119a;
            }
        }

        /* JADX INFO: renamed from: j3c.s$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0081\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0004R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0011"}, d2 = {"Lj3c/s$c$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "getIcon$annotations", "()V", "icon", "c", "getTitle$annotations", "title", "getDescription$annotations", "description", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class C0972c {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("icon")
            @NotNull
            private final String icon;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
            @lg.b("description")
            @NotNull
            private final String description;

            /* JADX INFO: renamed from: j3c.s$c$c$a */
            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f171123a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f171123a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppProductPageDefinitionDto.DetailsDto.SubSectionDto", aVar, 3);
                    pluginGeneratedSerialDescriptor.j("icon", false);
                    pluginGeneratedSerialDescriptor.j("title", false);
                    pluginGeneratedSerialDescriptor.j("description", false);
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    v1 v1Var = v1.f247718a;
                    return new KSerializer[]{v1Var, v1Var, v1Var};
                }

                @Override // mlm.b
                public final Object deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    dVarBeginStructure.getClass();
                    String strDecodeStringElement = null;
                    boolean z = true;
                    int i = 0;
                    String strDecodeStringElement2 = null;
                    String strDecodeStringElement3 = null;
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
                        } else {
                            if (iD != 2) {
                                throw new UnknownFieldException(iD);
                            }
                            strDecodeStringElement3 = dVarBeginStructure.decodeStringElement(serialDescriptor, 2);
                            i |= 4;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new C0972c(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3);
                }

                @Override // mlm.h, mlm.b
                public final SerialDescriptor getDescriptor() {
                    return descriptor;
                }

                @Override // mlm.h
                public final void serialize(Encoder encoder, Object obj2) {
                    C0972c value = (C0972c) obj2;
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    C0972c.d(value, compositeEncoderBeginStructure, serialDescriptor);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: j3c.s$c$c$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f171123a;
                }
            }

            public /* synthetic */ C0972c(int i, String str, String str2, String str3) {
                if (7 != (i & 7)) {
                    j1.f(a.f171123a.getDescriptor(), i, 7);
                    throw null;
                }
                this.icon = str;
                this.title = str2;
                this.description = str3;
            }

            public static final /* synthetic */ void d(C0972c c0972c, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, c0972c.icon);
                compositeEncoder.encodeStringElement(serialDescriptor, 1, c0972c.title);
                compositeEncoder.encodeStringElement(serialDescriptor, 2, c0972c.description);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof C0972c)) {
                    return false;
                }
                C0972c c0972c = (C0972c) obj2;
                return Intrinsics.f(this.icon, c0972c.icon) && Intrinsics.f(this.title, c0972c.title) && Intrinsics.f(this.description, c0972c.description);
            }

            public final int hashCode() {
                return this.description.hashCode() + p.a.c(this.icon.hashCode() * 31, 31, this.title);
            }
        }

        public /* synthetic */ c(int i, String str, List list) {
            if (3 != (i & 3)) {
                j1.f(a.f171119a.getDescriptor(), i, 3);
                throw null;
            }
            this.title = str;
            this.subsections = list;
        }

        public static final /* synthetic */ void c(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cVar.title);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, (mlm.h) f171116c[1].getValue(), cVar.subsections);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getSubsections() {
            return this.subsections;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.subsections, cVar.subsections);
        }

        public final int hashCode() {
            return this.subsections.hashCode() + (this.title.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, d2 = {"Lj3c/s$d;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "getTitle$annotations", "()V", "title", "", "Lj3c/s$d$c;", "Ljava/util/List;", "()Ljava/util/List;", "getSubsections$annotations", "subsections", "Companion", "c", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f171124c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(21))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("subsections")
        @NotNull
        private final List<c> subsections;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f171127a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f171127a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppProductPageDefinitionDto.SpecsDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("subsections", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, d.f171124c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = d.f171124c;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                List list = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
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
                return new d(i, strDecodeStringElement, list);
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
                d.c(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: j3c.s$d$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f171127a;
            }
        }

        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\f\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u0005\u0010\r¨\u0006\u0011"}, d2 = {"Lj3c/s$d$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "getTitle$annotations", "()V", "title", "", "Ljava/util/List;", "()Ljava/util/List;", "getBulletPoints$annotations", "bulletPoints", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class c {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion();

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final Lazy[] f171128c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(22))};

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            @lg.b("title")
            @NotNull
            private final String title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            @lg.b("bulletPoints")
            @NotNull
            private final List<String> bulletPoints;

            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f171131a;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f171131a = aVar;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppProductPageDefinitionDto.SpecsDto.SubSectionDto", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("title", false);
                    pluginGeneratedSerialDescriptor.j("bulletPoints", false);
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    return new KSerializer[]{v1.f247718a, c.f171128c[1].getValue()};
                }

                @Override // mlm.b
                public final Object deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    Lazy[] lazyArr = c.f171128c;
                    dVarBeginStructure.getClass();
                    String strDecodeStringElement = null;
                    boolean z = true;
                    int i = 0;
                    List list = null;
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else if (iD == 0) {
                            strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
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
                    return new c(i, strDecodeStringElement, list);
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
                    c.c(value, compositeEncoderBeginStructure, serialDescriptor);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: j3c.s$d$c$b, reason: from kotlin metadata */
            public static final class Companion {
                private Companion() {
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f171131a;
                }
            }

            public /* synthetic */ c(int i, String str, List list) {
                if (3 != (i & 3)) {
                    j1.f(a.f171131a.getDescriptor(), i, 3);
                    throw null;
                }
                this.title = str;
                this.bulletPoints = list;
            }

            public static final /* synthetic */ void c(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
                compositeEncoder.encodeStringElement(serialDescriptor, 0, cVar.title);
                compositeEncoder.encodeSerializableElement(serialDescriptor, 1, (mlm.h) f171128c[1].getValue(), cVar.bulletPoints);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final List getBulletPoints() {
                return this.bulletPoints;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            public final boolean equals(Object obj2) {
                if (this == obj2) {
                    return true;
                }
                if (!(obj2 instanceof c)) {
                    return false;
                }
                c cVar = (c) obj2;
                return Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.bulletPoints, cVar.bulletPoints);
            }

            public final int hashCode() {
                return this.bulletPoints.hashCode() + (this.title.hashCode() * 31);
            }
        }

        public /* synthetic */ d(int i, String str, List list) {
            if (3 != (i & 3)) {
                j1.f(a.f171127a.getDescriptor(), i, 3);
                throw null;
            }
            this.title = str;
            this.subsections = list;
        }

        public static final /* synthetic */ void c(d dVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, dVar.title);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, (mlm.h) f171124c[1].getValue(), dVar.subsections);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final List getSubsections() {
            return this.subsections;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof d)) {
                return false;
            }
            d dVar = (d) obj2;
            return Intrinsics.f(this.title, dVar.title) && Intrinsics.f(this.subsections, dVar.subsections);
        }

        public final int hashCode() {
            return this.subsections.hashCode() + (this.title.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000 \u00112\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R,\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0012"}, d2 = {"Lj3c/s$e;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "getTitle$annotations", "()V", "title", "", "Lj3c/s$f;", "Ljava/util/Map;", "()Ljava/util/Map;", "getItems$annotations", "items", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Lazy[] f171132c = {null, yhm.j.c(yhm.k.PUBLICATION, new q0(23))};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("title")
        @NotNull
        private final String title;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("items")
        @NotNull
        private final Map<String, f> items;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f171135a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f171135a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppProductPageDefinitionDto.StylePickerDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("items", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{v1.f247718a, e.f171132c[1].getValue()};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = e.f171132c;
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                Map map = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), map);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(map, strDecodeStringElement, i);
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

        /* JADX INFO: renamed from: j3c.s$e$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f171135a;
            }
        }

        public /* synthetic */ e(Map map, String str, int i) {
            if (3 != (i & 3)) {
                j1.f(a.f171135a.getDescriptor(), i, 3);
                throw null;
            }
            this.title = str;
            this.items = map;
        }

        public static final /* synthetic */ void c(e eVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, eVar.title);
            compositeEncoder.encodeSerializableElement(serialDescriptor, 1, (mlm.h) f171132c[1].getValue(), eVar.items);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Map getItems() {
            return this.items;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof e)) {
                return false;
            }
            e eVar = (e) obj2;
            return Intrinsics.f(this.title, eVar.title) && Intrinsics.f(this.items, eVar.items);
        }

        public final int hashCode() {
            return this.items.hashCode() + (this.title.hashCode() * 31);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0081\b\u0018\u0000 \u000e2\u00020\u0001:\u0002\u0005\u000bJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u000f"}, d2 = {"Lj3c/s$f;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getName", "getName$annotations", "()V", "name", "b", "getColour$annotations", "colour", "Companion", "feature_revolut_shop_impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class f {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("name")
        @NotNull
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("colour")
        @NotNull
        private final String colour;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f171138a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f171138a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.revolut_shop.data.model.IppProductPageDefinitionDto.StylePickerItemDto", aVar, 2);
                pluginGeneratedSerialDescriptor.j("name", false);
                pluginGeneratedSerialDescriptor.j("colour", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                v1 v1Var = v1.f247718a;
                return new KSerializer[]{v1Var, v1Var};
            }

            @Override // mlm.b
            public final Object deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                String strDecodeStringElement = null;
                boolean z = true;
                int i = 0;
                String strDecodeStringElement2 = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                        i |= 1;
                    } else {
                        if (iD != 1) {
                            throw new UnknownFieldException(iD);
                        }
                        strDecodeStringElement2 = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                        i |= 2;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new f(i, strDecodeStringElement, strDecodeStringElement2);
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
                f.b(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: j3c.s$f$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f171138a;
            }
        }

        public /* synthetic */ f(int i, String str, String str2) {
            if (3 != (i & 3)) {
                j1.f(a.f171138a.getDescriptor(), i, 3);
                throw null;
            }
            this.name = str;
            this.colour = str2;
        }

        public static final /* synthetic */ void b(f fVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, fVar.name);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, fVar.colour);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getColour() {
            return this.colour;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof f)) {
                return false;
            }
            f fVar = (f) obj2;
            return Intrinsics.f(this.name, fVar.name) && Intrinsics.f(this.colour, fVar.colour);
        }

        public final int hashCode() {
            return this.colour.hashCode() + (this.name.hashCode() * 31);
        }
    }

    public /* synthetic */ s(int i, String str, e eVar, c cVar, d dVar) {
        if (15 != (i & 15)) {
            j1.f(a.f171115a.getDescriptor(), i, 15);
            throw null;
        }
        this.productDescription = str;
        this.stylePicker = eVar;
        this.details = cVar;
        this.specs = dVar;
    }

    public static final /* synthetic */ void e(s sVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, sVar.productDescription);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, e.a.f171135a, sVar.stylePicker);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 2, c.a.f171119a, sVar.details);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 3, d.a.f171127a, sVar.specs);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final c getDetails() {
        return this.details;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getProductDescription() {
        return this.productDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final d getSpecs() {
        return this.specs;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final e getStylePicker() {
        return this.stylePicker;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof s)) {
            return false;
        }
        s sVar = (s) obj2;
        return Intrinsics.f(this.productDescription, sVar.productDescription) && Intrinsics.f(this.stylePicker, sVar.stylePicker) && Intrinsics.f(this.details, sVar.details) && Intrinsics.f(this.specs, sVar.specs);
    }

    public final int hashCode() {
        int iHashCode = this.productDescription.hashCode() * 31;
        e eVar = this.stylePicker;
        int iHashCode2 = (iHashCode + (eVar == null ? 0 : eVar.hashCode())) * 31;
        c cVar = this.details;
        int iHashCode3 = (iHashCode2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
        d dVar = this.specs;
        return iHashCode3 + (dVar != null ? dVar.hashCode() : 0);
    }
}
