package com.fourthline.orca.internal;

import com.fourthline.orca.internal.fa;
import com.fourthline.orca.internal.xi0;
import com.fourthline.orca.internal.yi0;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\u001f\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\u0013\u0010\"¨\u0006$"}, d2 = {"Lcom/fourthline/orca/internal/wi0;", "", "Lcom/fourthline/orca/internal/xi0;", "palettes", "Lcom/fourthline/orca/internal/yi0;", "elements", "<init>", "(Lcom/fourthline/orca/internal/xi0;Lcom/fourthline/orca/internal/yi0;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/xi0;Lcom/fourthline/orca/internal/yi0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/wi0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/xi0;", "b", "()Lcom/fourthline/orca/internal/xi0;", "Lcom/fourthline/orca/internal/yi0;", "()Lcom/fourthline/orca/internal/yi0;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class wi0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f34702c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final xi0 palettes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final yi0 elements;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34706b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f34705a = aVar;
            f34706b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaStyling", aVar, 2);
            pluginGeneratedSerialDescriptor.j("palettes", false);
            pluginGeneratedSerialDescriptor.j("elements", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wi0 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            SerializationConstructorMarker serializationConstructorMarker = null;
            boolean z = true;
            int i = 0;
            xi0 xi0Var = null;
            yi0 yi0Var = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    xi0Var = (xi0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, xi0.a.f35005a, xi0Var);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    yi0Var = (yi0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, yi0.a.f35317a, yi0Var);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new wi0(i, xi0Var, yi0Var, serializationConstructorMarker);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{xi0.a.f35005a, yi0.a.f35317a};
        }

        @Override // mlm.h, mlm.b
        public final SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // qlm.f0
        public /* bridge */ KSerializer[] typeParametersSerializers() {
            return qlm.j1.f247666a;
        }

        @Override // mlm.h
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void serialize(Encoder encoder, wi0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            wi0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.wi0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final String b(String str) throws IOException {
            File file = new File(str);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), Charsets.UTF_8), 8192);
            try {
                String strS = jh.d.s(bufferedReader);
                bufferedReader.close();
                return strS;
            } finally {
            }
        }

        private final void c(String str) {
            ib.h hVar = hb.a.f150532a;
            ib.b bVarB = hVar != null ? hVar.b(ib.b.Session) : null;
            if (bVarB != null) {
                bVarB.set("theme_version", str);
            }
        }

        public final Map a(String path) throws IOException {
            Intrinsics.checkNotNullParameter(path, "path");
            String strB = b(path);
            Json jsonA = s40.a();
            jsonA.getClass();
            JsonObject jsonObjectK = rlm.j.k(s40.a(rlm.j.k(s40.a((JsonObject) jsonA.b(JsonObject.INSTANCE.serializer(), strB), "palettes")), "fonts"));
            Json jsonA2 = s40.a();
            jsonA2.getClass();
            return (Map) jsonA2.a(new qlm.h0(qlm.v1.f247718a, nh0.INSTANCE.serializer(), 1), jsonObjectK);
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f34705a;
        }

        private Companion() {
        }

        public final wi0 a(String path, Map fontDefaults, String fontPath) throws IOException {
            Intrinsics.checkNotNullParameter(path, "path");
            Intrinsics.checkNotNullParameter(fontDefaults, "fontDefaults");
            Intrinsics.checkNotNullParameter(fontPath, "fontPath");
            String strB = b(path);
            Json jsonA = s40.a();
            jsonA.getClass();
            JsonObject jsonObject = (JsonObject) jsonA.b(JsonObject.INSTANCE.serializer(), strB);
            c(rlm.j.l(s40.a(jsonObject, "version")).a());
            aj0 aj0Var = (aj0) s40.a().a(aj0.INSTANCE.serializer(), s40.a(jsonObject, "theme_strategy"));
            JsonObject jsonObjectK = rlm.j.k(s40.a(jsonObject, "palettes"));
            JsonObject jsonObjectK2 = rlm.j.k(s40.a(jsonObject, "elements"));
            fa.a aVar = fa.f28387b;
            aVar.a(aj0Var);
            ei0.f28149b.a(aj0Var);
            Json jsonA2 = s40.a();
            JsonElement jsonElementA = s40.a(jsonObjectK, "colors");
            jsonA2.getClass();
            qlm.v1 v1Var = qlm.v1.f247718a;
            Map map = (Map) jsonA2.a(new qlm.h0(v1Var, di0.INSTANCE.serializer(), 1), jsonElementA);
            Map map2 = (Map) s40.a().a(new jj0(fontDefaults, fontPath), s40.a(jsonObjectK, "typography"));
            Json jsonA3 = s40.a();
            JsonElement jsonElementA2 = s40.a(jsonObjectK, "radius");
            jsonA3.getClass();
            xi0 xi0Var = new xi0(map, map2, (Map) jsonA3.a(new qlm.h0(v1Var, qlm.n0.f247680a, 1), jsonElementA2), (sh0) null, 8, (DefaultConstructorMarker) null);
            aVar.a(xi0Var.getColors());
            nz.f31516b.a(xi0Var.getTypography());
            ny0.f31513b.a(xi0Var.getRadius());
            Json jsonA4 = s40.a();
            jsonA4.getClass();
            return new wi0(xi0Var, (yi0) jsonA4.a(yi0.INSTANCE.serializer(), jsonObjectK2));
        }
    }

    public /* synthetic */ wi0(int i, xi0 xi0Var, yi0 yi0Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f34705a.getDescriptor(), i, 3);
            throw null;
        }
        this.palettes = xi0Var;
        this.elements = yi0Var;
    }

    public static final /* synthetic */ void a(wi0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, xi0.a.f35005a, self.palettes);
        output.encodeSerializableElement(serialDesc, 1, yi0.a.f35317a, self.elements);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final xi0 getPalettes() {
        return this.palettes;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof wi0)) {
            return false;
        }
        wi0 wi0Var = (wi0) other;
        return Intrinsics.f(this.palettes, wi0Var.palettes) && Intrinsics.f(this.elements, wi0Var.elements);
    }

    public int hashCode() {
        return (this.palettes.hashCode() * 31) + this.elements.hashCode();
    }

    public String toString() {
        return "OrcaStyling(palettes=" + this.palettes + ", elements=" + this.elements + ")";
    }

    public wi0(xi0 palettes, yi0 elements) {
        Intrinsics.checkNotNullParameter(palettes, "palettes");
        Intrinsics.checkNotNullParameter(elements, "elements");
        this.palettes = palettes;
        this.elements = elements;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final yi0 getElements() {
        return this.elements;
    }
}
