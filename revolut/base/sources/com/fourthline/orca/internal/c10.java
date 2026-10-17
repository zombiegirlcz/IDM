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
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0081\b\u0018\u0000 \u00162\u00020\u0001:\u0002\u0014\u0011B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/fourthline/orca/internal/c10;", "", "Lcom/fourthline/orca/internal/c10$b;", "default", "warning", "<init>", "(Lcom/fourthline/orca/internal/c10$b;Lcom/fourthline/orca/internal/c10$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/internal/c10$b;", "()Lcom/fourthline/orca/internal/c10$b;", "b", "getWarning", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g(with = d10.class)
public final /* data */ class c10 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b warning;

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c10$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return new d10();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0002\u001a(BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012*\b\u0002\u0010\r\u001a$0\bj\u0011`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\u0004\b\u000e\u0010\u000fBA\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u000e\u0010\u0013J'\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R9\u0010\r\u001a$0\bj\u0011`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u0010 ¨\u00063"}, d2 = {"Lcom/fourthline/orca/internal/c10$b;", "", "Lcom/fourthline/orca/internal/a81;", "text", "Lcom/fourthline/orca/internal/ea;", "background", "Lcom/fourthline/orca/internal/i8;", "border", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/ny0;", "radius", "<init>", "(Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/i8;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/i8;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/c10$b;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/a81;", "g", "()Lcom/fourthline/orca/internal/a81;", "b", "Lcom/fourthline/orca/internal/ea;", "d", "()Lcom/fourthline/orca/internal/ea;", "c", "Lcom/fourthline/orca/internal/i8;", "e", "()Lcom/fourthline/orca/internal/i8;", "I", "f", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy[] e;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a81 text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ea background;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final i8 border;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final int radius;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27308a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27309b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f27308a = aVar;
                f27309b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.HintElementVariants.HintElement", aVar, 4);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("background", true);
                pluginGeneratedSerialDescriptor.j("border", true);
                pluginGeneratedSerialDescriptor.j("radius", true);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final b deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = b.e;
                dVarBeginStructure.getClass();
                int i = 0;
                int iIntValue = 0;
                a81 a81Var = null;
                ea eaVar = null;
                i8 i8Var = null;
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
                        iIntValue = ((Number) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), Integer.valueOf(iIntValue))).intValue();
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, a81Var, eaVar, i8Var, iIntValue, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = b.e;
                return new KSerializer[]{a81.a.f26728a, lazyArr[1].getValue(), i8.a.f29525a, lazyArr[3].getValue()};
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
            public final void serialize(Encoder encoder, b value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                b.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.c10$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f27308a;
            }

            private Companion() {
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            e = new Lazy[]{null, yhm.j.c(kVar, new pj1(6)), null, yhm.j.c(kVar, new pj1(7))};
        }

        public /* synthetic */ b(int i, a81 a81Var, ea eaVar, i8 i8Var, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 != (i & 1)) {
                qlm.j1.f(a.f27308a.getDescriptor(), i, 1);
                throw null;
            }
            this.text = a81Var;
            if ((i & 2) == 0) {
                this.background = ea.INSTANCE.a();
            } else {
                this.background = eaVar;
            }
            if ((i & 4) == 0) {
                this.border = i8.INSTANCE.a();
            } else {
                this.border = i8Var;
            }
            if ((i & 8) == 0) {
                this.radius = 0;
            } else {
                this.radius = i2;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return new ny0();
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ea getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final i8 getBorder() {
            return this.border;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.f(this.text, bVar.text) && Intrinsics.f(this.background, bVar.background) && Intrinsics.f(this.border, bVar.border) && this.radius == bVar.radius;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getRadius() {
            return this.radius;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final a81 getText() {
            return this.text;
        }

        public int hashCode() {
            return (((((this.text.hashCode() * 31) + this.background.hashCode()) * 31) + this.border.hashCode()) * 31) + Integer.hashCode(this.radius);
        }

        public String toString() {
            return "HintElement(text=" + this.text + ", background=" + this.background + ", border=" + this.border + ", radius=" + this.radius + ")";
        }

        public static final /* synthetic */ void a(b self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = e;
            output.encodeSerializableElement(serialDesc, 0, a81.a.f26728a, self.text);
            if (output.d(serialDesc) || !Intrinsics.f(self.background, ea.INSTANCE.a())) {
                output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.background);
            }
            if (output.d(serialDesc) || !Intrinsics.f(self.border, i8.INSTANCE.a())) {
                output.encodeSerializableElement(serialDesc, 2, i8.a.f29525a, self.border);
            }
            if (!output.d(serialDesc) && self.radius == 0) {
                return;
            }
            output.encodeSerializableElement(serialDesc, 3, (mlm.h) lazyArr[3].getValue(), Integer.valueOf(self.radius));
        }

        public b(a81 text, ea background, i8 border, int i) {
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(border, "border");
            this.text = text;
            this.background = background;
            this.border = border;
            this.radius = i;
        }
    }

    public c10(b bVar, b warning) {
        Intrinsics.checkNotNullParameter(bVar, "default");
        Intrinsics.checkNotNullParameter(warning, "warning");
        this.default = bVar;
        this.warning = warning;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getDefault() {
        return this.default;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof c10)) {
            return false;
        }
        c10 c10Var = (c10) other;
        return Intrinsics.f(this.default, c10Var.default) && Intrinsics.f(this.warning, c10Var.warning);
    }

    public int hashCode() {
        return (this.default.hashCode() * 31) + this.warning.hashCode();
    }

    public String toString() {
        return "HintElementVariants(default=" + this.default + ", warning=" + this.warning + ")";
    }
}
