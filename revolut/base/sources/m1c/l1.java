package m1c;

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

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00112\u00020\u0001:\u0003\u0012\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R.\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\r\u0012\u0004\b\u000f\u0010\t\u001a\u0004\b\u0005\u0010\u000e¨\u0006\u0013"}, d2 = {"Lm1c/l1;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "getText$annotations", "()V", "text", "", "Lm1c/l1$c;", "Ljava/util/Map;", "()Ljava/util/Map;", "getPlaceholders$annotations", "placeholders", "Companion", "c", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class l1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Lazy[] f201397c = {null, yhm.j.c(yhm.k.PUBLICATION, new m05.d(12))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @lg.b("text")
    @NotNull
    private final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @lg.b("placeholders")
    private final Map<String, c> placeholders;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f201400a;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f201400a = aVar;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rev_points.models.RevPointsRichTextDto", aVar, 2);
            pluginGeneratedSerialDescriptor.j("text", false);
            pluginGeneratedSerialDescriptor.j("placeholders", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{qlm.v1.f247718a, nlm.a.c((KSerializer) l1.f201397c[1].getValue())};
        }

        @Override // mlm.b
        public final Object deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = l1.f201397c;
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
                    map = (Map) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), map);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new l1(map, strDecodeStringElement, i);
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // mlm.h
        public final void serialize(Encoder encoder, Object obj2) {
            l1 value = (l1) obj2;
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            l1.c(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: m1c.l1$b, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f201400a;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0087\b\u0018\u0000 \u00102\u00020\u0001:\u0002\u0005\u0007J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004R \u0010\n\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0004R \u0010\r\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0007\u0010\u0006\u0012\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0004R \u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0006\u0012\u0004\b\u000e\u0010\t\u001a\u0004\b\u0005\u0010\u0004¨\u0006\u0011"}, d2 = {"Lm1c/l1$c;", "", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "getFormatting$annotations", "()V", "formatting", "c", "getValue$annotations", "value", "getFallback$annotations", "fallback", "Companion", "feature_rev_points_models_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion();

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @lg.b("formatting")
        @NotNull
        private final String formatting;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @lg.b("value")
        @NotNull
        private final String value;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @lg.b("fallback")
        @NotNull
        private final String fallback;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f201404a;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f201404a = aVar;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.revolut.feature.rev_points.models.RevPointsRichTextDto.PlaceholderDto", aVar, 3);
                pluginGeneratedSerialDescriptor.j("formatting", false);
                pluginGeneratedSerialDescriptor.j("value", false);
                pluginGeneratedSerialDescriptor.j("fallback", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                qlm.v1 v1Var = qlm.v1.f247718a;
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
                return new c(i, strDecodeStringElement, strDecodeStringElement2, strDecodeStringElement3);
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
                c.d(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: m1c.l1$c$b, reason: from kotlin metadata */
        public static final class Companion {
            private Companion() {
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f201404a;
            }
        }

        public /* synthetic */ c(int i, String str, String str2, String str3) {
            if (7 != (i & 7)) {
                qlm.j1.f(a.f201404a.getDescriptor(), i, 7);
                throw null;
            }
            this.formatting = str;
            this.value = str2;
            this.fallback = str3;
        }

        public static final /* synthetic */ void d(c cVar, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
            compositeEncoder.encodeStringElement(serialDescriptor, 0, cVar.formatting);
            compositeEncoder.encodeStringElement(serialDescriptor, 1, cVar.value);
            compositeEncoder.encodeStringElement(serialDescriptor, 2, cVar.fallback);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getFallback() {
            return this.fallback;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFormatting() {
            return this.formatting;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof c)) {
                return false;
            }
            c cVar = (c) obj2;
            return Intrinsics.f(this.formatting, cVar.formatting) && Intrinsics.f(this.value, cVar.value) && Intrinsics.f(this.fallback, cVar.fallback);
        }

        public final int hashCode() {
            return this.fallback.hashCode() + p.a.c(this.formatting.hashCode() * 31, 31, this.value);
        }
    }

    public /* synthetic */ l1(Map map, String str, int i) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f201400a.getDescriptor(), i, 3);
            throw null;
        }
        this.text = str;
        this.placeholders = map;
    }

    public static final /* synthetic */ void c(l1 l1Var, CompositeEncoder compositeEncoder, SerialDescriptor serialDescriptor) {
        compositeEncoder.encodeStringElement(serialDescriptor, 0, l1Var.text);
        compositeEncoder.encodeNullableSerializableElement(serialDescriptor, 1, (mlm.h) f201397c[1].getValue(), l1Var.placeholders);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Map getPlaceholders() {
        return this.placeholders;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean equals(Object obj2) {
        if (this == obj2) {
            return true;
        }
        if (!(obj2 instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj2;
        return Intrinsics.f(this.text, l1Var.text) && Intrinsics.f(this.placeholders, l1Var.placeholders);
    }

    public final int hashCode() {
        int iHashCode = this.text.hashCode() * 31;
        Map<String, c> map = this.placeholders;
        return iHashCode + (map == null ? 0 : map.hashCode());
    }
}
