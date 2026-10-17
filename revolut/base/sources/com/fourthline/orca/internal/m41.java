package com.fourthline.orca.internal;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0004 $\u0013%B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001e\u001a\u0004\b\u0013\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006&"}, d2 = {"Lcom/fourthline/orca/internal/m41;", "", "Lcom/fourthline/orca/internal/m41$b;", "default", "Lcom/fourthline/orca/internal/m41$c;", "disabled", "<init>", "(Lcom/fourthline/orca/internal/m41$b;Lcom/fourthline/orca/internal/m41$c;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/m41$b;Lcom/fourthline/orca/internal/m41$c;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/m41;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/m41$b;", "()Lcom/fourthline/orca/internal/m41$b;", "b", "Lcom/fourthline/orca/internal/m41$c;", "()Lcom/fourthline/orca/internal/m41$c;", "Companion", "c", "d", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class m41 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b default;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c disabled;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f30983b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f30982a = aVar;
            f30983b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.StatefulCheckboxElement", aVar, 2);
            pluginGeneratedSerialDescriptor.j("default", false);
            pluginGeneratedSerialDescriptor.j("disabled", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m41 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            SerializationConstructorMarker serializationConstructorMarker = null;
            boolean z = true;
            int i = 0;
            b bVar = null;
            c cVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    bVar = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, b.a.f30987a, bVar);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, c.a.f30990a, cVar);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new m41(i, bVar, cVar, serializationConstructorMarker);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{b.a.f30987a, c.a.f30990a};
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
        public final void serialize(Encoder encoder, m41 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            m41.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002\u0014\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB7\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/fourthline/orca/internal/m41$b;", "", "Lcom/fourthline/orca/internal/ea;", "highlight", "background", "", "opacity", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;F)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;FLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/m41$b;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "e", "()Lcom/fourthline/orca/internal/ea;", "b", "d", "c", "F", "getOpacity", "()F", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy[] d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ea highlight;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ea background;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final float opacity;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30987a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f30988b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f30987a = aVar;
                f30988b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.StatefulCheckboxElement.CheckboxElement", aVar, 3);
                pluginGeneratedSerialDescriptor.j("highlight", false);
                pluginGeneratedSerialDescriptor.j("background", false);
                pluginGeneratedSerialDescriptor.j("opacity", false);
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
                Lazy[] lazyArr = b.d;
                dVarBeginStructure.getClass();
                int i = 0;
                ea eaVar = null;
                ea eaVar2 = null;
                float fDecodeFloatElement = 0.0f;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar);
                        i |= 1;
                    } else if (iD == 1) {
                        eaVar2 = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), eaVar2);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 2);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, eaVar, eaVar2, fDecodeFloatElement, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = b.d;
                return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), qlm.e0.f247634a};
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.m41$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f30987a;
            }

            private Companion() {
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            d = new Lazy[]{yhm.j.c(kVar, new wn1(28)), yhm.j.c(kVar, new wn1(29)), null};
        }

        public /* synthetic */ b(int i, ea eaVar, ea eaVar2, float f, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                qlm.j1.f(a.f30987a.getDescriptor(), i, 7);
                throw null;
            }
            this.highlight = eaVar;
            this.background = eaVar2;
            this.opacity = f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ea getBackground() {
            return this.background;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ea getHighlight() {
            return this.highlight;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.f(this.highlight, bVar.highlight) && Intrinsics.f(this.background, bVar.background) && Float.compare(this.opacity, bVar.opacity) == 0;
        }

        public int hashCode() {
            return (((this.highlight.hashCode() * 31) + this.background.hashCode()) * 31) + Float.hashCode(this.opacity);
        }

        public String toString() {
            return "CheckboxElement(highlight=" + this.highlight + ", background=" + this.background + ", opacity=" + this.opacity + ")";
        }

        public b(ea highlight, ea background, float f) {
            Intrinsics.checkNotNullParameter(highlight, "highlight");
            Intrinsics.checkNotNullParameter(background, "background");
            this.highlight = highlight;
            this.background = background;
            this.opacity = f;
        }

        public static final /* synthetic */ void a(b self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = d;
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.highlight);
            output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.background);
            output.encodeFloatElement(serialDesc, 2, self.opacity);
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u0011\u001fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0004\u0010\nJ'\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u0011\u0010\u001d¨\u0006 "}, d2 = {"Lcom/fourthline/orca/internal/m41$c;", "", "", "opacity", "<init>", "(F)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IFLkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/m41$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "F", "()F", "Companion", "b", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final float opacity;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f30990a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f30991b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f30990a = aVar;
                f30991b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.StatefulCheckboxElement.CheckboxElementButReallyOnlyOpacity", aVar, 1);
                pluginGeneratedSerialDescriptor.j("opacity", false);
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
                float fDecodeFloatElement = BitmapDescriptorFactory.HUE_RED;
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
                        fDecodeFloatElement = dVarBeginStructure.decodeFloatElement(serialDescriptor, 0);
                        i = 1;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, fDecodeFloatElement, null);
            }

            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                return new KSerializer[]{qlm.e0.f247634a};
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.m41$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f30990a;
            }

            private Companion() {
            }
        }

        public c(float f) {
            this.opacity = f;
        }

        public static final /* synthetic */ void a(c self, CompositeEncoder output, SerialDescriptor serialDesc) {
            output.encodeFloatElement(serialDesc, 0, self.opacity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && Float.compare(this.opacity, ((c) other).opacity) == 0;
        }

        public int hashCode() {
            return Float.hashCode(this.opacity);
        }

        public String toString() {
            return "CheckboxElementButReallyOnlyOpacity(opacity=" + this.opacity + ")";
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final float getOpacity() {
            return this.opacity;
        }

        public /* synthetic */ c(int i, float f, SerializationConstructorMarker serializationConstructorMarker) {
            if (1 == (i & 1)) {
                this.opacity = f;
            } else {
                qlm.j1.f(a.f30990a.getDescriptor(), i, 1);
                throw null;
            }
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.m41$d, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f30982a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ m41(int i, b bVar, c cVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f30982a.getDescriptor(), i, 3);
            throw null;
        }
        this.default = bVar;
        this.disabled = cVar;
    }

    public static final /* synthetic */ void a(m41 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, b.a.f30987a, self.default);
        output.encodeSerializableElement(serialDesc, 1, c.a.f30990a, self.disabled);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getDisabled() {
        return this.disabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof m41)) {
            return false;
        }
        m41 m41Var = (m41) other;
        return Intrinsics.f(this.default, m41Var.default) && Intrinsics.f(this.disabled, m41Var.disabled);
    }

    public int hashCode() {
        return (this.default.hashCode() * 31) + this.disabled.hashCode();
    }

    public String toString() {
        return "StatefulCheckboxElement(default=" + this.default + ", disabled=" + this.disabled + ")";
    }

    public m41(b bVar, c disabled) {
        Intrinsics.checkNotNullParameter(bVar, "default");
        Intrinsics.checkNotNullParameter(disabled, "disabled");
        this.default = bVar;
        this.disabled = disabled;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getDefault() {
        return this.default;
    }
}
