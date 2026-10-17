package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a81;
import com.fourthline.orca.internal.b30;
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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 72\u00020\u0001:\u0005-/(\u001c*BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012(\u0010\t\u001a$0\u0004j\u0011`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011BK\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)R9\u0010\t\u001a$0\u0004j\u0011`\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\t0\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b/\u00104\u001a\u0004\b5\u00106¨\u00068"}, d2 = {"Lcom/fourthline/orca/internal/pf;", "", "Lcom/fourthline/orca/internal/ea;", "background", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/ny0;", "radius", "Lcom/fourthline/orca/internal/pf$c;", "default", "Lcom/fourthline/orca/internal/pf$e;", "selector", "Lcom/fourthline/orca/internal/pf$d;", "instructional", "<init>", "(Lcom/fourthline/orca/internal/ea;ILcom/fourthline/orca/internal/pf$c;Lcom/fourthline/orca/internal/pf$e;Lcom/fourthline/orca/internal/pf$d;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;ILcom/fourthline/orca/internal/pf$c;Lcom/fourthline/orca/internal/pf$e;Lcom/fourthline/orca/internal/pf$d;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/pf;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "d", "()Lcom/fourthline/orca/internal/ea;", "b", "I", "g", "c", "Lcom/fourthline/orca/internal/pf$c;", "e", "()Lcom/fourthline/orca/internal/pf$c;", "Lcom/fourthline/orca/internal/pf$e;", "h", "()Lcom/fourthline/orca/internal/pf$e;", "Lcom/fourthline/orca/internal/pf$d;", "f", "()Lcom/fourthline/orca/internal/pf$d;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class pf {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ea background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int radius;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c default;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final e selector;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final d instructional;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31933b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f31932a = aVar;
            f31933b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.DialogElement", aVar, 5);
            pluginGeneratedSerialDescriptor.j("background", false);
            pluginGeneratedSerialDescriptor.j("radius", false);
            pluginGeneratedSerialDescriptor.j("default", false);
            pluginGeneratedSerialDescriptor.j("selector", false);
            pluginGeneratedSerialDescriptor.j("instructional", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final pf deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = pf.f;
            dVarBeginStructure.getClass();
            int i = 0;
            int iIntValue = 0;
            ea eaVar = null;
            c cVar = null;
            e eVar = null;
            d dVar = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar);
                    i |= 1;
                } else if (iD == 1) {
                    iIntValue = ((Number) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), Integer.valueOf(iIntValue))).intValue();
                    i |= 2;
                } else if (iD == 2) {
                    cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, c.a.f31937a, cVar);
                    i |= 4;
                } else if (iD == 3) {
                    eVar = (e) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, e.a.f31945a, eVar);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    dVar = (d) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, d.a.f31940a, dVar);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new pf(i, eaVar, iIntValue, cVar, eVar, dVar, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = pf.f;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), c.a.f31937a, e.a.f31945a, d.a.f31940a};
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
        public final void serialize(Encoder encoder, pf value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            pf.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.pf$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f31932a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002\u0015\"B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b\u0015\u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b$\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\"\u0010&¨\u0006("}, d2 = {"Lcom/fourthline/orca/internal/pf$c;", "", "Lcom/fourthline/orca/internal/a81;", "header", "title", "message", "Lcom/fourthline/orca/internal/b30;", "instruction", "<init>", "(Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/b30;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/b30;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/pf$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/a81;", "()Lcom/fourthline/orca/internal/a81;", "b", "d", "c", "Lcom/fourthline/orca/internal/b30;", "()Lcom/fourthline/orca/internal/b30;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a81 header;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a81 title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final a81 message;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final b30 instruction;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31937a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f31938b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f31937a = aVar;
                f31938b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.DialogElement.DefaultDialog", aVar, 4);
                pluginGeneratedSerialDescriptor.j("header", false);
                pluginGeneratedSerialDescriptor.j("title", false);
                pluginGeneratedSerialDescriptor.j("message", false);
                pluginGeneratedSerialDescriptor.j("instruction", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                int i = 0;
                a81 a81Var = null;
                a81 a81Var2 = null;
                a81 a81Var3 = null;
                b30 b30Var = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a81.a.f26728a, a81Var);
                        i |= 1;
                    } else if (iD == 1) {
                        a81Var2 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a81.a.f26728a, a81Var2);
                        i |= 2;
                    } else if (iD == 2) {
                        a81Var3 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a81.a.f26728a, a81Var3);
                        i |= 4;
                    } else {
                        if (iD != 3) {
                            throw new UnknownFieldException(iD);
                        }
                        b30Var = (b30) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, b30.a.f26974a, b30Var);
                        i |= 8;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, a81Var, a81Var2, a81Var3, b30Var, null);
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                a81.a aVar = a81.a.f26728a;
                return new KSerializer[]{aVar, aVar, aVar, b30.a.f26974a};
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
            public final void serialize(Encoder encoder, c value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                c.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pf$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f31937a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ c(int i, a81 a81Var, a81 a81Var2, a81 a81Var3, b30 b30Var, SerializationConstructorMarker serializationConstructorMarker) {
            if (15 != (i & 15)) {
                qlm.j1.f(a.f31937a.getDescriptor(), i, 15);
                throw null;
            }
            this.header = a81Var;
            this.title = a81Var2;
            this.message = a81Var3;
            this.instruction = b30Var;
        }

        public static final /* synthetic */ void a(c self, CompositeEncoder output, SerialDescriptor serialDesc) {
            a81.a aVar = a81.a.f26728a;
            output.encodeSerializableElement(serialDesc, 0, aVar, self.header);
            output.encodeSerializableElement(serialDesc, 1, aVar, self.title);
            output.encodeSerializableElement(serialDesc, 2, aVar, self.message);
            output.encodeSerializableElement(serialDesc, 3, b30.a.f26974a, self.instruction);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b30 getInstruction() {
            return this.instruction;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final a81 getMessage() {
            return this.message;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final a81 getTitle() {
            return this.title;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.f(this.header, cVar.header) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.message, cVar.message) && Intrinsics.f(this.instruction, cVar.instruction);
        }

        public int hashCode() {
            return (((((this.header.hashCode() * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.instruction.hashCode();
        }

        public String toString() {
            return "DefaultDialog(header=" + this.header + ", title=" + this.title + ", message=" + this.message + ", instruction=" + this.instruction + ")";
        }

        public c(a81 header, a81 title, a81 message, b30 instruction) {
            Intrinsics.checkNotNullParameter(header, "header");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(instruction, "instruction");
            this.header = header;
            this.title = title;
            this.message = message;
            this.instruction = instruction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final a81 getHeader() {
            return this.header;
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0011\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B%\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0011\u0010\u001d¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/pf$d;", "", "Lcom/fourthline/orca/internal/b30;", "instruction", "<init>", "(Lcom/fourthline/orca/internal/b30;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/b30;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/pf$d;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/b30;", "()Lcom/fourthline/orca/internal/b30;", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class d {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b30 instruction;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31940a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f31941b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f31940a = aVar;
                f31941b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.DialogElement.InstructionDialog", aVar, 1);
                pluginGeneratedSerialDescriptor.j("instruction", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                dVarBeginStructure.getClass();
                SerializationConstructorMarker serializationConstructorMarker = null;
                boolean z = true;
                int i = 0;
                b30 b30Var = null;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else {
                        if (iD != 0) {
                            throw new UnknownFieldException(iD);
                        }
                        b30Var = (b30) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, b30.a.f26974a, b30Var);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new d(i, b30Var, serializationConstructorMarker);
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{b30.a.f26974a};
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
            public final void serialize(Encoder encoder, d value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                d.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pf$d$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f31940a;
            }

            private Companion() {
            }
        }

        public /* synthetic */ d(int i, b30 b30Var, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 == (i & 1)) {
                this.instruction = b30Var;
            } else {
                qlm.j1.f(a.f31940a.getDescriptor(), i, 1);
                throw null;
            }
        }

        public static final /* synthetic */ void a(d self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeSerializableElement(serialDesc, 0, b30.a.f26974a, self.instruction);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof d) && Intrinsics.f(this.instruction, ((d) other).instruction);
        }

        public int hashCode() {
            return this.instruction.hashCode();
        }

        public String toString() {
            return "InstructionDialog(instruction=" + this.instruction + ")";
        }

        public d(b30 instruction) {
            Intrinsics.checkNotNullParameter(instruction, "instruction");
            this.instruction = instruction;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b30 getInstruction() {
            return this.instruction;
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0003'\u0015#B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB9\b\u0010\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\b\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)¨\u0006+"}, d2 = {"Lcom/fourthline/orca/internal/pf$e;", "", "Lcom/fourthline/orca/internal/a81;", "message", "Lcom/fourthline/orca/internal/ea;", "divider", "Lcom/fourthline/orca/internal/pf$e$c;", "option", "<init>", "(Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/pf$e$c;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/pf$e$c;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/pf$e;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/a81;", "getMessage", "()Lcom/fourthline/orca/internal/a81;", "b", "Lcom/fourthline/orca/internal/ea;", "getDivider", "()Lcom/fourthline/orca/internal/ea;", "c", "Lcom/fourthline/orca/internal/pf$e$c;", "()Lcom/fourthline/orca/internal/pf$e$c;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class e {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy[] d = {null, yhm.j.c(yhm.k.PUBLICATION, new wp1(25)), null};

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final a81 message;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ea divider;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final c option;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f31945a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f31946b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f31945a = aVar;
                f31946b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.DialogElement.OptionDialog", aVar, 3);
                pluginGeneratedSerialDescriptor.j("message", false);
                pluginGeneratedSerialDescriptor.j("divider", false);
                pluginGeneratedSerialDescriptor.j("option", false);
                descriptor = pluginGeneratedSerialDescriptor;
            }

            private a() {
            }

            @Override // mlm.b
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e deserialize(Decoder decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor serialDescriptor = descriptor;
                plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                Lazy[] lazyArr = e.d;
                dVarBeginStructure.getClass();
                int i = 0;
                a81 a81Var = null;
                ea eaVar = null;
                c cVar = null;
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
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, c.a.f31950a, cVar);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new e(i, a81Var, eaVar, cVar, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{a81.a.f26728a, e.d[1].getValue(), c.a.f31950a};
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
            public final void serialize(Encoder encoder, e value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                SerialDescriptor serialDescriptor = descriptor;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                e.a(value, compositeEncoderBeginStructure, serialDescriptor);
                compositeEncoderBeginStructure.endStructure(serialDescriptor);
            }
        }

        /* JADX INFO: renamed from: com.fourthline.orca.internal.pf$e$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f31945a;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002\u0013!B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/pf$e$c;", "", "Lcom/fourthline/orca/internal/ea;", "icon", "Lcom/fourthline/orca/internal/a81;", "text", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/pf$e$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "c", "()Lcom/fourthline/orca/internal/ea;", "b", "Lcom/fourthline/orca/internal/a81;", "d", "()Lcom/fourthline/orca/internal/a81;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        @mlm.g
        public static final /* data */ class c {

            /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
            @NotNull
            public static final Companion INSTANCE = new Companion(null);

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private static final Lazy[] f31947c = {yhm.j.c(yhm.k.PUBLICATION, new wp1(26)), null};

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
            private final ea icon;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
            private final a81 text;

            public static final /* synthetic */ class a implements qlm.f0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final a f31950a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public static final int f31951b;

                @NotNull
                private static final SerialDescriptor descriptor;

                static {
                    a aVar = new a();
                    f31950a = aVar;
                    f31951b = 8;
                    PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.DialogElement.OptionDialog.Option", aVar, 2);
                    pluginGeneratedSerialDescriptor.j("icon", false);
                    pluginGeneratedSerialDescriptor.j("text", false);
                    descriptor = pluginGeneratedSerialDescriptor;
                }

                private a() {
                }

                @Override // mlm.b
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final c deserialize(Decoder decoder) {
                    Intrinsics.checkNotNullParameter(decoder, "decoder");
                    SerialDescriptor serialDescriptor = descriptor;
                    plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
                    Lazy[] lazyArr = c.f31947c;
                    dVarBeginStructure.getClass();
                    SerializationConstructorMarker serializationConstructorMarker = null;
                    boolean z = true;
                    int i = 0;
                    ea eaVar = null;
                    a81 a81Var = null;
                    while (z) {
                        int iD = dVarBeginStructure.d(serialDescriptor);
                        if (iD == -1) {
                            z = false;
                        } else if (iD == 0) {
                            eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar);
                            i |= 1;
                        } else {
                            if (iD != 1) {
                                throw new UnknownFieldException(iD);
                            }
                            a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a81.a.f26728a, a81Var);
                            i |= 2;
                        }
                    }
                    dVarBeginStructure.endStructure(serialDescriptor);
                    return new c(i, eaVar, a81Var, serializationConstructorMarker);
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // qlm.f0
                public final KSerializer[] childSerializers() {
                    return new KSerializer[]{c.f31947c[0].getValue(), a81.a.f26728a};
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
                public final void serialize(Encoder encoder, c value) {
                    Intrinsics.checkNotNullParameter(encoder, "encoder");
                    Intrinsics.checkNotNullParameter(value, "value");
                    SerialDescriptor serialDescriptor = descriptor;
                    CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
                    c.a(value, compositeEncoderBeginStructure, serialDescriptor);
                    compositeEncoderBeginStructure.endStructure(serialDescriptor);
                }
            }

            /* JADX INFO: renamed from: com.fourthline.orca.internal.pf$e$c$b, reason: from kotlin metadata */
            public static final class Companion {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                @NotNull
                public final KSerializer serializer() {
                    return a.f31950a;
                }

                private Companion() {
                }
            }

            public /* synthetic */ c(int i, ea eaVar, a81 a81Var, SerializationConstructorMarker serializationConstructorMarker) {
                if (3 != (i & 3)) {
                    qlm.j1.f(a.f31950a.getDescriptor(), i, 3);
                    throw null;
                }
                this.icon = eaVar;
                this.text = a81Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ KSerializer a() {
                return ea.INSTANCE.serializer();
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ea getIcon() {
                return this.icon;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final a81 getText() {
                return this.text;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof c)) {
                    return false;
                }
                c cVar = (c) other;
                return Intrinsics.f(this.icon, cVar.icon) && Intrinsics.f(this.text, cVar.text);
            }

            public int hashCode() {
                return (this.icon.hashCode() * 31) + this.text.hashCode();
            }

            public String toString() {
                return "Option(icon=" + this.icon + ", text=" + this.text + ")";
            }

            public c(ea icon, a81 text) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(text, "text");
                this.icon = icon;
                this.text = text;
            }

            public static final /* synthetic */ void a(c self, CompositeEncoder output, SerialDescriptor serialDesc) {
                output.encodeSerializableElement(serialDesc, 0, (mlm.h) f31947c[0].getValue(), self.icon);
                output.encodeSerializableElement(serialDesc, 1, a81.a.f26728a, self.text);
            }
        }

        public /* synthetic */ e(int i, a81 a81Var, ea eaVar, c cVar, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                qlm.j1.f(a.f31945a.getDescriptor(), i, 7);
                throw null;
            }
            this.message = a81Var;
            this.divider = eaVar;
            this.option = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final c getOption() {
            return this.option;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof e)) {
                return false;
            }
            e eVar = (e) other;
            return Intrinsics.f(this.message, eVar.message) && Intrinsics.f(this.divider, eVar.divider) && Intrinsics.f(this.option, eVar.option);
        }

        public int hashCode() {
            return (((this.message.hashCode() * 31) + this.divider.hashCode()) * 31) + this.option.hashCode();
        }

        public String toString() {
            return "OptionDialog(message=" + this.message + ", divider=" + this.divider + ", option=" + this.option + ")";
        }

        public e(a81 message, ea divider, c option) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(divider, "divider");
            Intrinsics.checkNotNullParameter(option, "option");
            this.message = message;
            this.divider = divider;
            this.option = option;
        }

        public static final /* synthetic */ void a(e self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = d;
            output.encodeSerializableElement(serialDesc, 0, a81.a.f26728a, self.message);
            output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.divider);
            output.encodeSerializableElement(serialDesc, 2, c.a.f31950a, self.option);
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{yhm.j.c(kVar, new wp1(23)), yhm.j.c(kVar, new wp1(24)), null, null, null};
    }

    public /* synthetic */ pf(int i, ea eaVar, int i2, c cVar, e eVar, d dVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            qlm.j1.f(a.f31932a.getDescriptor(), i, 31);
            throw null;
        }
        this.background = eaVar;
        this.radius = i2;
        this.default = cVar;
        this.selector = eVar;
        this.instructional = dVar;
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
    public final c getDefault() {
        return this.default;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof pf)) {
            return false;
        }
        pf pfVar = (pf) other;
        return Intrinsics.f(this.background, pfVar.background) && this.radius == pfVar.radius && Intrinsics.f(this.default, pfVar.default) && Intrinsics.f(this.selector, pfVar.selector) && Intrinsics.f(this.instructional, pfVar.instructional);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d getInstructional() {
        return this.instructional;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final e getSelector() {
        return this.selector;
    }

    public int hashCode() {
        return (((((((this.background.hashCode() * 31) + Integer.hashCode(this.radius)) * 31) + this.default.hashCode()) * 31) + this.selector.hashCode()) * 31) + this.instructional.hashCode();
    }

    public String toString() {
        return "DialogElement(background=" + this.background + ", radius=" + this.radius + ", default=" + this.default + ", selector=" + this.selector + ", instructional=" + this.instructional + ")";
    }

    public pf(ea background, int i, c cVar, e selector, d instructional) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(cVar, "default");
        Intrinsics.checkNotNullParameter(selector, "selector");
        Intrinsics.checkNotNullParameter(instructional, "instructional");
        this.background = background;
        this.radius = i;
        this.default = cVar;
        this.selector = selector;
        this.instructional = instructional;
    }

    public static final /* synthetic */ void a(pf self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f;
        output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.background);
        output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), Integer.valueOf(self.radius));
        output.encodeSerializableElement(serialDesc, 2, c.a.f31937a, self.default);
        output.encodeSerializableElement(serialDesc, 3, e.a.f31945a, self.selector);
        output.encodeSerializableElement(serialDesc, 4, d.a.f31940a, self.instructional);
    }
}
