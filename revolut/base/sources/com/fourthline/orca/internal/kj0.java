package com.fourthline.orca.internal;

import androidx.compose.ui.text.font.FontFamily;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u0000 +2\u00020\u0001:\u0002\u0015$B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nB?\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\t\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010'\u001a\u0004\b(\u0010\u001aR \u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b(\u0010'\u0012\u0004\b*\u0010#\u001a\u0004\b)\u0010\u001a¨\u0006,"}, d2 = {"Lcom/fourthline/orca/internal/kj0;", "", "Landroidx/compose/ui/text/font/FontFamily;", "family", "", "weight", "", "size", "lineHeight", "<init>", "(Landroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;II)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILandroidx/compose/ui/text/font/FontFamily;Ljava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/kj0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroidx/compose/ui/text/font/FontFamily;", "c", "()Landroidx/compose/ui/text/font/FontFamily;", "getFamily$annotations", "()V", "b", "Ljava/lang/String;", "getWeight", "I", "d", "getLineHeight", "getLineHeight$annotations", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class kj0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy[] e = {yhm.j.c(yhm.k.PUBLICATION, new wn1(20)), null, null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final FontFamily family;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String weight;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int size;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int lineHeight;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30292a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30293b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f30292a = aVar;
            f30293b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaTypographyDefinition", aVar, 4);
            pluginGeneratedSerialDescriptor.j("family", false);
            pluginGeneratedSerialDescriptor.j("weight", false);
            pluginGeneratedSerialDescriptor.j("size", false);
            pluginGeneratedSerialDescriptor.j("line_height", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kj0 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = kj0.e;
            dVarBeginStructure.getClass();
            int i = 0;
            int iDecodeIntElement = 0;
            int iDecodeIntElement2 = 0;
            FontFamily fontFamily = null;
            String strDecodeStringElement = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    fontFamily = (FontFamily) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), fontFamily);
                    i |= 1;
                } else if (iD == 1) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new kj0(i, fontFamily, strDecodeStringElement, iDecodeIntElement, iDecodeIntElement2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.n0 n0Var = qlm.n0.f247680a;
            return new KSerializer[]{kj0.e[0].getValue(), qlm.v1.f247718a, n0Var, n0Var};
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
        public final void serialize(Encoder encoder, kj0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            kj0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.kj0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f30292a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ kj0(int i, FontFamily fontFamily, String str, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        if (15 != (i & 15)) {
            qlm.j1.f(a.f30292a.getDescriptor(), i, 15);
            throw null;
        }
        this.family = fontFamily;
        this.weight = str;
        this.size = i2;
        this.lineHeight = i3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final KSerializer a() {
        return new mlm.a(kotlin.jvm.internal.o0.f186429a.b(FontFamily.class), (KSerializer) null, new KSerializer[0]);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final FontFamily getFamily() {
        return this.family;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getSize() {
        return this.size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof kj0)) {
            return false;
        }
        kj0 kj0Var = (kj0) other;
        return Intrinsics.f(this.family, kj0Var.family) && Intrinsics.f(this.weight, kj0Var.weight) && this.size == kj0Var.size && this.lineHeight == kj0Var.lineHeight;
    }

    public int hashCode() {
        return (((((this.family.hashCode() * 31) + this.weight.hashCode()) * 31) + Integer.hashCode(this.size)) * 31) + Integer.hashCode(this.lineHeight);
    }

    public String toString() {
        return "OrcaTypographyDefinition(family=" + this.family + ", weight=" + this.weight + ", size=" + this.size + ", lineHeight=" + this.lineHeight + ")";
    }

    public kj0(FontFamily family, String weight, int i, int i2) {
        Intrinsics.checkNotNullParameter(family, "family");
        Intrinsics.checkNotNullParameter(weight, "weight");
        this.family = family;
        this.weight = weight;
        this.size = i;
        this.lineHeight = i2;
    }

    public static final /* synthetic */ void a(kj0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (mlm.h) e[0].getValue(), self.family);
        output.encodeStringElement(serialDesc, 1, self.weight);
        output.encodeIntElement(serialDesc, 2, self.size);
        output.encodeIntElement(serialDesc, 3, self.lineHeight);
    }
}
