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
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0081\b\u0018\u0000 72\u00020\u0001:\u0003*\u001c.BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012(\u0010\r\u001a$0\bj\u0011`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011BK\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\r\u001a\u00020\b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0010\u0010\u0015J'\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R9\u0010\r\u001a$0\bj\u0011`\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\t0\f8\u0006¢\u0006\f\n\u0004\b(\u00102\u001a\u0004\b3\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b4\u00106¨\u00068"}, d2 = {"Lcom/fourthline/orca/internal/e1;", "", "Lcom/fourthline/orca/internal/ea;", "background", "Lcom/fourthline/orca/internal/a81;", "label", "Lcom/fourthline/orca/internal/e1$b;", "button", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/ny0;", "radius", "Lcom/fourthline/orca/internal/i8;", "border", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/e1$b;ILcom/fourthline/orca/internal/i8;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/e1$b;ILcom/fourthline/orca/internal/i8;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/e1;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "d", "()Lcom/fourthline/orca/internal/ea;", "b", "Lcom/fourthline/orca/internal/a81;", "g", "()Lcom/fourthline/orca/internal/a81;", "c", "Lcom/fourthline/orca/internal/e1$b;", "f", "()Lcom/fourthline/orca/internal/e1$b;", "I", "h", "e", "Lcom/fourthline/orca/internal/i8;", "()Lcom/fourthline/orca/internal/i8;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class e1 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ea background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a81 label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b button;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int radius;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final i8 border;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27967b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f27966a = aVar;
            f27967b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.AgreementsElement", aVar, 5);
            pluginGeneratedSerialDescriptor.j("background", false);
            pluginGeneratedSerialDescriptor.j("label", false);
            pluginGeneratedSerialDescriptor.j("button", false);
            pluginGeneratedSerialDescriptor.j("radius", false);
            pluginGeneratedSerialDescriptor.j("border", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e1 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = e1.f;
            dVarBeginStructure.getClass();
            int i = 0;
            int iIntValue = 0;
            ea eaVar = null;
            a81 a81Var = null;
            b bVar = null;
            i8 i8Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar);
                    i |= 1;
                } else if (iD == 1) {
                    a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a81.a.f26728a, a81Var);
                    i |= 2;
                } else if (iD == 2) {
                    bVar = (b) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, b.a.f27971a, bVar);
                    i |= 4;
                } else if (iD == 3) {
                    iIntValue = ((Number) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), Integer.valueOf(iIntValue))).intValue();
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    i8Var = (i8) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, i8.a.f29525a, i8Var);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new e1(i, eaVar, a81Var, bVar, iIntValue, i8Var, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = e1.f;
            return new KSerializer[]{lazyArr[0].getValue(), a81.a.f26728a, b.a.f27971a, lazyArr[3].getValue(), i8.a.f29525a};
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
        public final void serialize(Encoder encoder, e1 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            e1.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u0000 52\u00020\u0001:\u0002\u001b)BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012(\u0010\u000e\u001a$0\tj\u0011`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\u0004\b\u000f\u0010\u0010BK\b\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u000f\u0010\u0014J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010&\u001a\u0004\b2\u0010(R9\u0010\u000e\u001a$0\tj\u0011`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b'\u00103\u001a\u0004\b4\u0010!¨\u00066"}, d2 = {"Lcom/fourthline/orca/internal/e1$b;", "", "Lcom/fourthline/orca/internal/ea;", "background", "Lcom/fourthline/orca/internal/a81;", "text", "Lcom/fourthline/orca/internal/i8;", "border", "icon", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/ny0;", "radius", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/i8;Lcom/fourthline/orca/internal/ea;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/i8;Lcom/fourthline/orca/internal/ea;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/e1$b;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "e", "()Lcom/fourthline/orca/internal/ea;", "b", "Lcom/fourthline/orca/internal/a81;", "i", "()Lcom/fourthline/orca/internal/a81;", "c", "Lcom/fourthline/orca/internal/i8;", "f", "()Lcom/fourthline/orca/internal/i8;", "d", "g", "I", "h", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class b {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy[] f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ea background;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final a81 text;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final i8 border;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        private final ea icon;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        private final int radius;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27971a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27972b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f27971a = aVar;
                f27972b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.AgreementsElement.AgreementsButtonElement", aVar, 5);
                pluginGeneratedSerialDescriptor.j("background", false);
                pluginGeneratedSerialDescriptor.j("text", false);
                pluginGeneratedSerialDescriptor.j("border", false);
                pluginGeneratedSerialDescriptor.j("icon", false);
                pluginGeneratedSerialDescriptor.j("radius", false);
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
                Lazy[] lazyArr = b.f;
                dVarBeginStructure.getClass();
                int i = 0;
                int iIntValue = 0;
                ea eaVar = null;
                a81 a81Var = null;
                i8 i8Var = null;
                ea eaVar2 = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar);
                        i |= 1;
                    } else if (iD == 1) {
                        a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a81.a.f26728a, a81Var);
                        i |= 2;
                    } else if (iD == 2) {
                        i8Var = (i8) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, i8.a.f29525a, i8Var);
                        i |= 4;
                    } else if (iD == 3) {
                        eaVar2 = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), eaVar2);
                        i |= 8;
                    } else {
                        if (iD != 4) {
                            throw new UnknownFieldException(iD);
                        }
                        iIntValue = ((Number) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), Integer.valueOf(iIntValue))).intValue();
                        i |= 16;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new b(i, eaVar, a81Var, i8Var, eaVar2, iIntValue, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = b.f;
                return new KSerializer[]{lazyArr[0].getValue(), a81.a.f26728a, i8.a.f29525a, lazyArr[3].getValue(), lazyArr[4].getValue()};
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.e1$b$b, reason: collision with other inner class name and from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f27971a;
            }

            private Companion() {
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            f = new Lazy[]{yhm.j.c(kVar, new dl1(0)), null, null, yhm.j.c(kVar, new dl1(1)), yhm.j.c(kVar, new dl1(2))};
        }

        public /* synthetic */ b(int i, ea eaVar, a81 a81Var, i8 i8Var, ea eaVar2, int i2, SerializationConstructorMarker serializationConstructorMarker) {
            if (31 != (i & 31)) {
                qlm.j1.f(a.f27971a.getDescriptor(), i, 31);
                throw null;
            }
            this.background = eaVar;
            this.text = a81Var;
            this.border = i8Var;
            this.icon = eaVar2;
            this.radius = i2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer c() {
            return new ny0();
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ea getBackground() {
            return this.background;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return Intrinsics.f(this.background, bVar.background) && Intrinsics.f(this.text, bVar.text) && Intrinsics.f(this.border, bVar.border) && Intrinsics.f(this.icon, bVar.icon) && this.radius == bVar.radius;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final i8 getBorder() {
            return this.border;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ea getIcon() {
            return this.icon;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final int getRadius() {
            return this.radius;
        }

        public int hashCode() {
            return (((((((this.background.hashCode() * 31) + this.text.hashCode()) * 31) + this.border.hashCode()) * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.radius);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final a81 getText() {
            return this.text;
        }

        public String toString() {
            return "AgreementsButtonElement(background=" + this.background + ", text=" + this.text + ", border=" + this.border + ", icon=" + this.icon + ", radius=" + this.radius + ")";
        }

        public b(ea background, a81 text, i8 border, ea icon, int i) {
            Intrinsics.checkNotNullParameter(background, "background");
            Intrinsics.checkNotNullParameter(text, "text");
            Intrinsics.checkNotNullParameter(border, "border");
            Intrinsics.checkNotNullParameter(icon, "icon");
            this.background = background;
            this.text = text;
            this.border = border;
            this.icon = icon;
            this.radius = i;
        }

        public static final /* synthetic */ void a(b self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = f;
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.background);
            output.encodeSerializableElement(serialDesc, 1, a81.a.f26728a, self.text);
            output.encodeSerializableElement(serialDesc, 2, i8.a.f29525a, self.border);
            output.encodeSerializableElement(serialDesc, 3, (mlm.h) lazyArr[3].getValue(), self.icon);
            output.encodeSerializableElement(serialDesc, 4, (mlm.h) lazyArr[4].getValue(), Integer.valueOf(self.radius));
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.e1$c, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f27966a;
        }

        private Companion() {
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{yhm.j.c(kVar, new pj1(28)), null, null, yhm.j.c(kVar, new pj1(29)), null};
    }

    public /* synthetic */ e1(int i, ea eaVar, a81 a81Var, b bVar, int i2, i8 i8Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (31 != (i & 31)) {
            qlm.j1.f(a.f27966a.getDescriptor(), i, 31);
            throw null;
        }
        this.background = eaVar;
        this.label = a81Var;
        this.button = bVar;
        this.radius = i2;
        this.border = i8Var;
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
        if (!(other instanceof e1)) {
            return false;
        }
        e1 e1Var = (e1) other;
        return Intrinsics.f(this.background, e1Var.background) && Intrinsics.f(this.label, e1Var.label) && Intrinsics.f(this.button, e1Var.button) && this.radius == e1Var.radius && Intrinsics.f(this.border, e1Var.border);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getButton() {
        return this.button;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final a81 getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    public int hashCode() {
        return (((((((this.background.hashCode() * 31) + this.label.hashCode()) * 31) + this.button.hashCode()) * 31) + Integer.hashCode(this.radius)) * 31) + this.border.hashCode();
    }

    public String toString() {
        return "AgreementsElement(background=" + this.background + ", label=" + this.label + ", button=" + this.button + ", radius=" + this.radius + ", border=" + this.border + ")";
    }

    public e1(ea background, a81 label, b button, int i, i8 border) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(border, "border");
        this.background = background;
        this.label = label;
        this.button = button;
        this.radius = i;
        this.border = border;
    }

    public static final /* synthetic */ void a(e1 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f;
        output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.background);
        output.encodeSerializableElement(serialDesc, 1, a81.a.f26728a, self.label);
        output.encodeSerializableElement(serialDesc, 2, b.a.f27971a, self.button);
        output.encodeSerializableElement(serialDesc, 3, (mlm.h) lazyArr[3].getValue(), Integer.valueOf(self.radius));
        output.encodeSerializableElement(serialDesc, 4, i8.a.f29525a, self.border);
    }
}
