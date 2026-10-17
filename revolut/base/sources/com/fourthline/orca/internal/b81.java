package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import com.fourthline.orca.internal.a81;
import com.fourthline.orca.internal.i8;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
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
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0081\b\u0018\u0000 B2\u00020\u0001:\u00033 /Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u0012\u0006\u0010\r\u001a\u00020\f\u0012(\u0010\u0013\u001a$0\u000ej\u0011`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\u0004\b\u0014\u0010\u0015Bs\b\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u0013\u001a\u00020\u000e\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J'\u0010 \u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0001¢\u0006\u0004\b \u0010!J\u008c\u0001\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\f2*\b\u0002\u0010\u0013\u001a$0\u000ej\u0011`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012HÆ\u0001¢\u0006\u0004\b \u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u00102R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00102R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u0010:R\u0017\u0010\u000b\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b=\u00108\u001a\u0004\b;\u0010:R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b9\u0010>\u001a\u0004\b=\u0010?R9\u0010\u0013\u001a$0\u000ej\u0011`\u000f¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u0012¢\u0006\f\b\u0010\u0012\b\b\u0011\u0012\u0004\b\t0\u00128\u0006¢\u0006\f\n\u0004\b4\u0010@\u001a\u0004\bA\u0010'¨\u0006C"}, d2 = {"Lcom/fourthline/orca/internal/b81;", "", "Lcom/fourthline/orca/internal/b81$c;", "value", "Lcom/fourthline/orca/internal/a81;", "placeholder", "label", "status", "Lcom/fourthline/orca/internal/ea;", "icon", "shadow", "background", "Lcom/fourthline/orca/internal/i8;", "border", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/ny0;", "radius", "<init>", "(Lcom/fourthline/orca/internal/b81$c;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/i8;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/b81$c;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/i8;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/b81;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "(Lcom/fourthline/orca/internal/b81$c;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/i8;I)Lcom/fourthline/orca/internal/b81;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/b81$c;", "n", "()Lcom/fourthline/orca/internal/b81$c;", "b", "Lcom/fourthline/orca/internal/a81;", "j", "()Lcom/fourthline/orca/internal/a81;", "c", "i", "d", "m", "e", "Lcom/fourthline/orca/internal/ea;", "h", "()Lcom/fourthline/orca/internal/ea;", "f", "l", "g", "Lcom/fourthline/orca/internal/i8;", "()Lcom/fourthline/orca/internal/i8;", "I", "k", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class b81 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Lazy[] f27036j;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c value;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a81 placeholder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a81 label;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final a81 status;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ea icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final ea shadow;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ea background;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final i8 border;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final int radius;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27042a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27043b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f27042a = aVar;
            f27043b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.TextInputElement", aVar, 9);
            pluginGeneratedSerialDescriptor.j("value", false);
            pluginGeneratedSerialDescriptor.j("placeholder", false);
            pluginGeneratedSerialDescriptor.j("label", false);
            pluginGeneratedSerialDescriptor.j("status", false);
            pluginGeneratedSerialDescriptor.j("icon", false);
            pluginGeneratedSerialDescriptor.j("shadow", false);
            pluginGeneratedSerialDescriptor.j("background", false);
            pluginGeneratedSerialDescriptor.j("border", false);
            pluginGeneratedSerialDescriptor.j("radius", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final b81 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = b81.f27036j;
            dVarBeginStructure.getClass();
            c cVar = null;
            a81 a81Var = null;
            a81 a81Var2 = null;
            a81 a81Var3 = null;
            ea eaVar = null;
            ea eaVar2 = null;
            ea eaVar3 = null;
            i8 i8Var = null;
            boolean z = true;
            int i = 0;
            int iIntValue = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, c.a.f27047a, cVar);
                        i |= 1;
                        break;
                    case 1:
                        a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, a81.a.f26728a, a81Var);
                        i |= 2;
                        break;
                    case 2:
                        a81Var2 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a81.a.f26728a, a81Var2);
                        i |= 4;
                        break;
                    case 3:
                        a81Var3 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, a81.a.f26728a, a81Var3);
                        i |= 8;
                        break;
                    case 4:
                        eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), eaVar);
                        i |= 16;
                        break;
                    case 5:
                        eaVar2 = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), eaVar2);
                        i |= 32;
                        break;
                    case 6:
                        eaVar3 = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, (mlm.b) lazyArr[6].getValue(), eaVar3);
                        i |= 64;
                        break;
                    case 7:
                        i8Var = (i8) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 7, i8.a.f29525a, i8Var);
                        i |= 128;
                        break;
                    case 8:
                        iIntValue = ((Number) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 8, (mlm.b) lazyArr[8].getValue(), Integer.valueOf(iIntValue))).intValue();
                        i |= 256;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new b81(i, cVar, a81Var, a81Var2, a81Var3, eaVar, eaVar2, eaVar3, i8Var, iIntValue, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = b81.f27036j;
            a81.a aVar = a81.a.f26728a;
            return new KSerializer[]{c.a.f27047a, aVar, aVar, aVar, lazyArr[4].getValue(), lazyArr[5].getValue(), lazyArr[6].getValue(), i8.a.f29525a, lazyArr[8].getValue()};
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
        public final void serialize(Encoder encoder, b81 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            b81.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.b81$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f27042a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\b\u0081\b\u0018\u0000 /2\u00020\u0001:\u0002\u0014)B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0014\u001a\u00020\u001a2\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u0014\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u00162\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010$\u0012\u0004\b'\u0010(\u001a\u0004\b%\u0010&R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"Lcom/fourthline/orca/internal/b81$c;", "", "Lcom/fourthline/orca/internal/mz;", "typographyMonospace", "typography", "Lcom/fourthline/orca/internal/ea;", "color", "<init>", "(Lcom/fourthline/orca/internal/mz;Lcom/fourthline/orca/internal/mz;Lcom/fourthline/orca/internal/ea;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/mz;Lcom/fourthline/orca/internal/mz;Lcom/fourthline/orca/internal/ea;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/b81$c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "isDigitInput", "Landroidx/compose/ui/unit/TextUnit;", "maxSize", "Landroidx/compose/ui/text/TextStyle;", "(ZLandroidx/compose/ui/unit/TextUnit;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/mz;", "e", "()Lcom/fourthline/orca/internal/mz;", "getTypographyMonospace$annotations", "()V", "b", "getTypography", "c", "Lcom/fourthline/orca/internal/ea;", "getColor", "()Lcom/fourthline/orca/internal/ea;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);
        private static final Lazy[] d;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final mz typographyMonospace;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final mz typography;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final ea color;

        public static final /* synthetic */ class a implements qlm.f0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f27047a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final int f27048b;

            @NotNull
            private static final SerialDescriptor descriptor;

            static {
                a aVar = new a();
                f27047a = aVar;
                f27048b = 8;
                PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.TextInputElement.ValueElement", aVar, 3);
                pluginGeneratedSerialDescriptor.j("typography_monospace", false);
                pluginGeneratedSerialDescriptor.j("typography", false);
                pluginGeneratedSerialDescriptor.j("color", false);
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
                Lazy[] lazyArr = c.d;
                dVarBeginStructure.getClass();
                int i = 0;
                mz mzVar = null;
                mz mzVar2 = null;
                ea eaVar = null;
                boolean z = true;
                while (z) {
                    int iD = dVarBeginStructure.d(serialDescriptor);
                    if (iD == -1) {
                        z = false;
                    } else if (iD == 0) {
                        mzVar = (mz) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), mzVar);
                        i |= 1;
                    } else if (iD == 1) {
                        mzVar2 = (mz) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), mzVar2);
                        i |= 2;
                    } else {
                        if (iD != 2) {
                            throw new UnknownFieldException(iD);
                        }
                        eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), eaVar);
                        i |= 4;
                    }
                }
                dVarBeginStructure.endStructure(serialDescriptor);
                return new c(i, mzVar, mzVar2, eaVar, null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // qlm.f0
            public final KSerializer[] childSerializers() {
                Lazy[] lazyArr = c.d;
                return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), lazyArr[2].getValue()};
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

        /* JADX INFO: renamed from: com.fourthline.orca.internal.b81$c$b, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return a.f27047a;
            }

            private Companion() {
            }
        }

        static {
            yhm.k kVar = yhm.k.PUBLICATION;
            d = new Lazy[]{yhm.j.c(kVar, new vk1(23)), yhm.j.c(kVar, new vk1(24)), yhm.j.c(kVar, new vk1(25))};
        }

        public /* synthetic */ c(int i, mz mzVar, mz mzVar2, ea eaVar, SerializationConstructorMarker serializationConstructorMarker) {
            if (7 != (i & 7)) {
                qlm.j1.f(a.f27047a.getDescriptor(), i, 7);
                throw null;
            }
            this.typographyMonospace = mzVar;
            this.typography = mzVar2;
            this.color = eaVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer a() {
            return mz.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer b() {
            return mz.INSTANCE.serializer();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ KSerializer c() {
            return ea.INSTANCE.serializer();
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final mz getTypographyMonospace() {
            return this.typographyMonospace;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof c)) {
                return false;
            }
            c cVar = (c) other;
            return Intrinsics.f(this.typographyMonospace, cVar.typographyMonospace) && Intrinsics.f(this.typography, cVar.typography) && Intrinsics.f(this.color, cVar.color);
        }

        public int hashCode() {
            return (((this.typographyMonospace.hashCode() * 31) + this.typography.hashCode()) * 31) + this.color.hashCode();
        }

        public String toString() {
            return "ValueElement(typographyMonospace=" + this.typographyMonospace + ", typography=" + this.typography + ", color=" + this.color + ")";
        }

        public c(mz typographyMonospace, mz typography, ea color) {
            Intrinsics.checkNotNullParameter(typographyMonospace, "typographyMonospace");
            Intrinsics.checkNotNullParameter(typography, "typography");
            Intrinsics.checkNotNullParameter(color, "color");
            this.typographyMonospace = typographyMonospace;
            this.typography = typography;
            this.color = color;
        }

        public static final /* synthetic */ void a(c self, CompositeEncoder output, SerialDescriptor serialDesc) {
            Lazy[] lazyArr = d;
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.typographyMonospace);
            output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.typography);
            output.encodeSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), self.color);
        }

        public final TextStyle a(boolean z, TextUnit textUnit, Composer composer, int i, int i2) {
            mz mzVar;
            boolean z3 = (i2 & 1) != 0 ? false : z;
            TextUnit textUnit2 = (i2 & 2) != 0 ? null : textUnit;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1692179560, i, -1, "com.fourthline.orca.core.internal.styling.common.TextInputElement.ValueElement.getTextStyle (UiElement.kt:277)");
            }
            if (z3) {
                mzVar = this.typographyMonospace;
            } else if (!z3) {
                mzVar = this.typography;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1608057515);
            Pair pairA = mzVar.a(textUnit2, composer, (i >> 3) & 14, 0);
            TextStyle textStyle = new TextStyle(this.color.a(composer, 0), ((TextUnit) pairA.f186385a).getPackedValue(), null, null, null, mzVar.getFamily(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777180, null);
            composer.endReplaceGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            return textStyle;
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f27036j = new Lazy[]{null, null, null, null, yhm.j.c(kVar, new vk1(19)), yhm.j.c(kVar, new vk1(20)), yhm.j.c(kVar, new vk1(21)), null, yhm.j.c(kVar, new vk1(22))};
    }

    public /* synthetic */ b81(int i, c cVar, a81 a81Var, a81 a81Var2, a81 a81Var3, ea eaVar, ea eaVar2, ea eaVar3, i8 i8Var, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (511 != (i & 511)) {
            qlm.j1.f(a.f27042a.getDescriptor(), i, 511);
            throw null;
        }
        this.value = cVar;
        this.placeholder = a81Var;
        this.label = a81Var2;
        this.status = a81Var3;
        this.icon = eaVar;
        this.shadow = eaVar2;
        this.background = eaVar3;
        this.border = i8Var;
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
        return ea.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer d() {
        return new ny0();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof b81)) {
            return false;
        }
        b81 b81Var = (b81) other;
        return Intrinsics.f(this.value, b81Var.value) && Intrinsics.f(this.placeholder, b81Var.placeholder) && Intrinsics.f(this.label, b81Var.label) && Intrinsics.f(this.status, b81Var.status) && Intrinsics.f(this.icon, b81Var.icon) && Intrinsics.f(this.shadow, b81Var.shadow) && Intrinsics.f(this.background, b81Var.background) && Intrinsics.f(this.border, b81Var.border) && this.radius == b81Var.radius;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final ea getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final i8 getBorder() {
        return this.border;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ea getIcon() {
        return this.icon;
    }

    public int hashCode() {
        return (((((((((((((((this.value.hashCode() * 31) + this.placeholder.hashCode()) * 31) + this.label.hashCode()) * 31) + this.status.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.shadow.hashCode()) * 31) + this.background.hashCode()) * 31) + this.border.hashCode()) * 31) + Integer.hashCode(this.radius);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final a81 getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final a81 getPlaceholder() {
        return this.placeholder;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getRadius() {
        return this.radius;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final ea getShadow() {
        return this.shadow;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final a81 getStatus() {
        return this.status;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final c getValue() {
        return this.value;
    }

    public String toString() {
        return "TextInputElement(value=" + this.value + ", placeholder=" + this.placeholder + ", label=" + this.label + ", status=" + this.status + ", icon=" + this.icon + ", shadow=" + this.shadow + ", background=" + this.background + ", border=" + this.border + ", radius=" + this.radius + ")";
    }

    public b81(c value, a81 placeholder, a81 label, a81 status, ea icon, ea shadow, ea background, i8 border, int i) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        this.value = value;
        this.placeholder = placeholder;
        this.label = label;
        this.status = status;
        this.icon = icon;
        this.shadow = shadow;
        this.background = background;
        this.border = border;
        this.radius = i;
    }

    public final b81 a(c value, a81 placeholder, a81 label, a81 status, ea icon, ea shadow, ea background, i8 border, int radius) {
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(shadow, "shadow");
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(border, "border");
        return new b81(value, placeholder, label, status, icon, shadow, background, border, radius);
    }

    public static /* synthetic */ b81 a(b81 b81Var, c cVar, a81 a81Var, a81 a81Var2, a81 a81Var3, ea eaVar, ea eaVar2, ea eaVar3, i8 i8Var, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            cVar = b81Var.value;
        }
        if ((i2 & 2) != 0) {
            a81Var = b81Var.placeholder;
        }
        if ((i2 & 4) != 0) {
            a81Var2 = b81Var.label;
        }
        if ((i2 & 8) != 0) {
            a81Var3 = b81Var.status;
        }
        if ((i2 & 16) != 0) {
            eaVar = b81Var.icon;
        }
        if ((i2 & 32) != 0) {
            eaVar2 = b81Var.shadow;
        }
        if ((i2 & 64) != 0) {
            eaVar3 = b81Var.background;
        }
        if ((i2 & 128) != 0) {
            i8Var = b81Var.border;
        }
        if ((i2 & 256) != 0) {
            i = b81Var.radius;
        }
        i8 i8Var2 = i8Var;
        int i3 = i;
        ea eaVar4 = eaVar2;
        ea eaVar5 = eaVar3;
        ea eaVar6 = eaVar;
        a81 a81Var4 = a81Var2;
        return b81Var.a(cVar, a81Var, a81Var4, a81Var3, eaVar6, eaVar4, eaVar5, i8Var2, i3);
    }

    public static final /* synthetic */ void a(b81 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f27036j;
        output.encodeSerializableElement(serialDesc, 0, c.a.f27047a, self.value);
        a81.a aVar = a81.a.f26728a;
        output.encodeSerializableElement(serialDesc, 1, aVar, self.placeholder);
        output.encodeSerializableElement(serialDesc, 2, aVar, self.label);
        output.encodeSerializableElement(serialDesc, 3, aVar, self.status);
        output.encodeSerializableElement(serialDesc, 4, (mlm.h) lazyArr[4].getValue(), self.icon);
        output.encodeSerializableElement(serialDesc, 5, (mlm.h) lazyArr[5].getValue(), self.shadow);
        output.encodeSerializableElement(serialDesc, 6, (mlm.h) lazyArr[6].getValue(), self.background);
        output.encodeSerializableElement(serialDesc, 7, i8.a.f29525a, self.border);
        output.encodeSerializableElement(serialDesc, 8, (mlm.h) lazyArr[8].getValue(), Integer.valueOf(self.radius));
    }
}
