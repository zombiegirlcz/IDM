package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a81;
import com.fourthline.orca.internal.i8;
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
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 02\u00020\u0001:\u0002\u0017&B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bBA\b\u0010\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\n\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J8\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lcom/fourthline/orca/internal/z8;", "", "Lcom/fourthline/orca/internal/a81;", "text", "Lcom/fourthline/orca/internal/ea;", "background", "Lcom/fourthline/orca/internal/i8;", "border", "", "opacity", "<init>", "(Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/i8;F)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/i8;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/z8;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "(Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/i8;F)Lcom/fourthline/orca/internal/z8;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/a81;", "f", "()Lcom/fourthline/orca/internal/a81;", "b", "Lcom/fourthline/orca/internal/ea;", "c", "()Lcom/fourthline/orca/internal/ea;", "Lcom/fourthline/orca/internal/i8;", "d", "()Lcom/fourthline/orca/internal/i8;", "F", "e", "()F", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class z8 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy[] e = {null, yhm.j.c(yhm.k.PUBLICATION, new vt1(1)), null, null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a81 text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ea background;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i8 border;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final float opacity;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f35546b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f35545a = aVar;
            f35546b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.ButtonElement", aVar, 4);
            pluginGeneratedSerialDescriptor.j("text", false);
            pluginGeneratedSerialDescriptor.j("background", true);
            pluginGeneratedSerialDescriptor.j("border", true);
            pluginGeneratedSerialDescriptor.j("opacity", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z8 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = z8.e;
            dVarBeginStructure.getClass();
            int i = 0;
            a81 a81Var = null;
            ea eaVar = null;
            i8 i8Var = null;
            float fDecodeFloatElement = 0.0f;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a81.a.f26728a, a81Var);
                    i |= 1;
                } else if (iD == 1) {
                    eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), eaVar);
                    i |= 2;
                } else if (iD == 2) {
                    i8Var = (i8) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, i8.a.f29525a, i8Var);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 3);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new z8(i, a81Var, eaVar, i8Var, fDecodeFloatElement, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{a81.a.f26728a, z8.e[1].getValue(), i8.a.f29525a, qlm.e0.f247634a};
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
        public final void serialize(Encoder encoder, z8 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            z8.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.z8$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f35545a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ z8(int i, a81 a81Var, ea eaVar, i8 i8Var, float f, SerializationConstructorMarker serializationConstructorMarker) {
        if (9 != (i & 9)) {
            qlm.j1.f(a.f35545a.getDescriptor(), i, 9);
            throw null;
        }
        this.text = a81Var;
        if ((i & 2) == 0) {
            this.background = ea.INSTANCE.b();
        } else {
            this.background = eaVar;
        }
        if ((i & 4) == 0) {
            this.border = i8.INSTANCE.a();
        } else {
            this.border = i8Var;
        }
        this.opacity = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return ea.INSTANCE.serializer();
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ea getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final i8 getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getOpacity() {
        return this.opacity;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof z8)) {
            return false;
        }
        z8 z8Var = (z8) other;
        return Intrinsics.f(this.text, z8Var.text) && Intrinsics.f(this.background, z8Var.background) && Intrinsics.f(this.border, z8Var.border) && Float.compare(this.opacity, z8Var.opacity) == 0;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a81 getText() {
        return this.text;
    }

    public int hashCode() {
        return (((((this.text.hashCode() * 31) + this.background.hashCode()) * 31) + this.border.hashCode()) * 31) + Float.hashCode(this.opacity);
    }

    public String toString() {
        return "ButtonElement(text=" + this.text + ", background=" + this.background + ", border=" + this.border + ", opacity=" + this.opacity + ")";
    }

    public final z8 a(a81 text, ea background, i8 border, float opacity) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        return new z8(text, background, border, opacity);
    }

    public static /* synthetic */ z8 a(z8 z8Var, a81 a81Var, ea eaVar, i8 i8Var, float f, int i, Object obj2) {
        if ((i & 1) != 0) {
            a81Var = z8Var.text;
        }
        if ((i & 2) != 0) {
            eaVar = z8Var.background;
        }
        if ((i & 4) != 0) {
            i8Var = z8Var.border;
        }
        if ((i & 8) != 0) {
            f = z8Var.opacity;
        }
        return z8Var.a(a81Var, eaVar, i8Var, f);
    }

    public static final /* synthetic */ void a(z8 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = e;
        output.encodeSerializableElement(serialDesc, 0, a81.a.f26728a, self.text);
        if (output.d(serialDesc) || !Intrinsics.f(self.background, ea.INSTANCE.b())) {
            output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.background);
        }
        if (output.d(serialDesc) || !Intrinsics.f(self.border, i8.INSTANCE.a())) {
            output.encodeSerializableElement(serialDesc, 2, i8.a.f29525a, self.border);
        }
        output.encodeFloatElement(serialDesc, 3, self.opacity);
    }

    public z8(a81 text, ea background, i8 border, float f) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        this.text = text;
        this.background = background;
        this.border = border;
        this.opacity = f;
    }
}
