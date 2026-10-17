package com.fourthline.orca.internal;

import com.fourthline.orca.internal.kj0;
import com.fourthline.orca.internal.sh0;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0081\b\u0018\u0000 12\u00020\u0001:\u0002\u001c)B]\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005\u0012\u0016\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\nj\u0002`\u000b0\u0002j\u0002`\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011Bg\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\n\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R'\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b'\u0010(R'\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002j\u0002`\b8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u00060\nj\u0002`\u000b0\u0002j\u0002`\f8\u0006¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b,\u0010(R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/fourthline/orca/internal/xi0;", "", "", "", "Lcom/fourthline/orca/internal/di0;", "Lcom/fourthline/orca/core/internal/styling/OrcaColorDefaults;", "colors", "Lcom/fourthline/orca/internal/kj0;", "Lcom/fourthline/orca/core/internal/styling/OrcaTypographyDefaults;", "typography", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lcom/fourthline/orca/core/internal/styling/OrcaRadiusDefaults;", "radius", "Lcom/fourthline/orca/internal/sh0;", "internal", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/fourthline/orca/internal/sh0;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/Map;Ljava/util/Map;Ljava/util/Map;Lcom/fourthline/orca/internal/sh0;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/xi0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "b", "g", "c", "f", "d", "Lcom/fourthline/orca/internal/sh0;", "getInternal", "()Lcom/fourthline/orca/internal/sh0;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class xi0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 8;
    private static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map colors;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map typography;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map radius;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final sh0 internal;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35005a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35006b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f35005a = aVar;
            f35006b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaStylingDefaults", aVar, 4);
            pluginGeneratedSerialDescriptor.j("colors", false);
            pluginGeneratedSerialDescriptor.j("typography", false);
            pluginGeneratedSerialDescriptor.j("radius", false);
            pluginGeneratedSerialDescriptor.j("internal", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xi0 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = xi0.f;
            dVarBeginStructure.getClass();
            int i = 0;
            Map map = null;
            Map map2 = null;
            Map map3 = null;
            sh0 sh0Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), map);
                    i |= 1;
                } else if (iD == 1) {
                    map2 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), map2);
                    i |= 2;
                } else if (iD == 2) {
                    map3 = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), map3);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    sh0Var = (sh0) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, sh0.a.f33012a, sh0Var);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new xi0(i, map, map2, map3, sh0Var, (SerializationConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = xi0.f;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue(), sh0.a.f33012a};
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
        public final void serialize(Encoder encoder, xi0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            xi0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.xi0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f35005a;
        }

        private Companion() {
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{yhm.j.c(kVar, new it1(1)), yhm.j.c(kVar, new it1(2)), yhm.j.c(kVar, new it1(3)), null};
    }

    public /* synthetic */ xi0(int i, Map map, Map map2, Map map3, sh0 sh0Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f35005a.getDescriptor(), i, 7);
            throw null;
        }
        this.colors = map;
        this.typography = map2;
        this.radius = map3;
        if ((i & 8) != 0) {
            this.internal = sh0Var;
            return;
        }
        this.internal = new sh0(0, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return new qlm.h0(qlm.v1.f247718a, di0.INSTANCE.serializer(), 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new qlm.h0(qlm.v1.f247718a, kj0.a.f30292a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer c() {
        return new qlm.h0(qlm.v1.f247718a, qlm.n0.f247680a, 1);
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Map getColors() {
        return this.colors;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof xi0)) {
            return false;
        }
        xi0 xi0Var = (xi0) other;
        return Intrinsics.f(this.colors, xi0Var.colors) && Intrinsics.f(this.typography, xi0Var.typography) && Intrinsics.f(this.radius, xi0Var.radius) && Intrinsics.f(this.internal, xi0Var.internal);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Map getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Map getTypography() {
        return this.typography;
    }

    public int hashCode() {
        return (((((this.colors.hashCode() * 31) + this.typography.hashCode()) * 31) + this.radius.hashCode()) * 31) + this.internal.hashCode();
    }

    public String toString() {
        return "OrcaStylingDefaults(colors=" + this.colors + ", typography=" + this.typography + ", radius=" + this.radius + ", internal=" + this.internal + ")";
    }

    public static final /* synthetic */ void a(xi0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f;
        output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.colors);
        output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.typography);
        output.encodeSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), self.radius);
        if (!output.d(serialDesc)) {
            if (Intrinsics.f(self.internal, new sh0(0, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null))) {
                return;
            }
        }
        output.encodeSerializableElement(serialDesc, 3, sh0.a.f33012a, self.internal);
    }

    public xi0(Map colors, Map typography, Map radius, sh0 internal) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        Intrinsics.checkNotNullParameter(typography, "typography");
        Intrinsics.checkNotNullParameter(radius, "radius");
        Intrinsics.checkNotNullParameter(internal, "internal");
        this.colors = colors;
        this.typography = typography;
        this.radius = radius;
        this.internal = internal;
    }

    public /* synthetic */ xi0(Map map, Map map2, Map map3, sh0 sh0Var, int i, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i & 8) != 0) {
            sh0Var = new sh0(0, 0, 0, 0, 0, 31, (DefaultConstructorMarker) null);
        }
        this(map, map2, map3, sh0Var);
    }
}
