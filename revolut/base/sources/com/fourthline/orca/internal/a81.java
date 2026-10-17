package com.fourthline.orca.internal;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.TextUnit;
import kotlin.Lazy;
import kotlin.Metadata;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0081\b\u0018\u0000 *2\u00020\u0001:\u0002&\u0013B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B/\b\u0010\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0006\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0013\u001a\u00020\u00172\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0013\u0010\u0018J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lcom/fourthline/orca/internal/a81;", "", "Lcom/fourthline/orca/internal/mz;", "typography", "Lcom/fourthline/orca/internal/ea;", "color", "<init>", "(Lcom/fourthline/orca/internal/mz;Lcom/fourthline/orca/internal/ea;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/mz;Lcom/fourthline/orca/internal/ea;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/a81;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "Landroidx/compose/ui/unit/TextUnit;", "maxSize", "Landroidx/compose/ui/text/TextStyle;", "(Landroidx/compose/ui/unit/TextUnit;Landroidx/compose/runtime/Composer;II)Landroidx/compose/ui/text/TextStyle;", "(Lcom/fourthline/orca/internal/mz;Lcom/fourthline/orca/internal/ea;)Lcom/fourthline/orca/internal/a81;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/mz;", "f", "()Lcom/fourthline/orca/internal/mz;", "b", "Lcom/fourthline/orca/internal/ea;", "e", "()Lcom/fourthline/orca/internal/ea;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class a81 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy[] f26725c;
    private static final a81 d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mz typography;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ea color;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f26728a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f26729b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f26728a = aVar;
            f26729b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.TextElement", aVar, 2);
            pluginGeneratedSerialDescriptor.j("typography", true);
            pluginGeneratedSerialDescriptor.j("color", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a81 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = a81.f26725c;
            dVarBeginStructure.getClass();
            SerializationConstructorMarker serializationConstructorMarker = null;
            boolean z = true;
            int i = 0;
            mz mzVar = null;
            ea eaVar = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    mzVar = (mz) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), mzVar);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), eaVar);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new a81(i, mzVar, eaVar, serializationConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = a81.f26725c;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue()};
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
        public final void serialize(Encoder encoder, a81 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            a81.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.a81$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a81 a() {
            return a81.d;
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f26728a;
        }

        private Companion() {
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f26725c = new Lazy[]{yhm.j.c(kVar, new vk1(4)), yhm.j.c(kVar, new vk1(5))};
        d = new a81(mz.INSTANCE.a(), ea.INSTANCE.a());
    }

    public /* synthetic */ a81(int i, mz mzVar, ea eaVar, SerializationConstructorMarker serializationConstructorMarker) {
        if (2 != (i & 2)) {
            qlm.j1.f(a.f26728a.getDescriptor(), i, 2);
            throw null;
        }
        if ((i & 1) == 0) {
            this.typography = mz.INSTANCE.a();
        } else {
            this.typography = mzVar;
        }
        this.color = eaVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return mz.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return ea.INSTANCE.serializer();
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ea getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof a81)) {
            return false;
        }
        a81 a81Var = (a81) other;
        return Intrinsics.f(this.typography, a81Var.typography) && Intrinsics.f(this.color, a81Var.color);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final mz getTypography() {
        return this.typography;
    }

    public int hashCode() {
        return (this.typography.hashCode() * 31) + this.color.hashCode();
    }

    public String toString() {
        return "TextElement(typography=" + this.typography + ", color=" + this.color + ")";
    }

    public final a81 a(mz typography, ea color) {
        Intrinsics.checkNotNullParameter(typography, "typography");
        Intrinsics.checkNotNullParameter(color, "color");
        return new a81(typography, color);
    }

    public static /* synthetic */ a81 a(a81 a81Var, mz mzVar, ea eaVar, int i, Object obj2) {
        if ((i & 1) != 0) {
            mzVar = a81Var.typography;
        }
        if ((i & 2) != 0) {
            eaVar = a81Var.color;
        }
        return a81Var.a(mzVar, eaVar);
    }

    public static final /* synthetic */ void a(a81 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f26725c;
        if (output.d(serialDesc) || !Intrinsics.f(self.typography, mz.INSTANCE.a())) {
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.typography);
        }
        output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.color);
    }

    public a81(mz typography, ea color) {
        Intrinsics.checkNotNullParameter(typography, "typography");
        Intrinsics.checkNotNullParameter(color, "color");
        this.typography = typography;
        this.color = color;
    }

    public final TextStyle a(TextUnit textUnit, Composer composer, int i, int i2) {
        TextUnit textUnit2 = (i2 & 1) != 0 ? null : textUnit;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2079085939, i, -1, "com.fourthline.orca.core.internal.styling.common.TextElement.getTextStyle (StylingElement.kt:85)");
        }
        composer.startReplaceGroup(841797297);
        Pair pairA = this.typography.a(textUnit2, composer, i & 14, 0);
        TextStyle textStyle = new TextStyle(this.color.a(composer, 0), ((TextUnit) pairA.f186385a).getPackedValue(), null, null, null, this.typography.getFamily(), null, 0L, null, null, null, 0L, null, null, null, 0, 0, ((TextUnit) pairA.f186386b).getPackedValue(), null, null, null, 0, 0, null, 16646108, null);
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textStyle;
    }
}
