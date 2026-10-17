package com.fourthline.orca.internal;

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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u0000 $2\u00020\u0001:\u0002!\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B-\b\u0010\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u0006\u0010\u000bJ'\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0019¨\u0006%"}, d2 = {"Lcom/fourthline/orca/internal/i8;", "", "Lcom/fourthline/orca/internal/ea;", "color", "", "width", "<init>", "(Lcom/fourthline/orca/internal/ea;I)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;ILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/i8;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "(Lcom/fourthline/orca/internal/ea;I)Lcom/fourthline/orca/internal/i8;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "d", "()Lcom/fourthline/orca/internal/ea;", "b", "I", "e", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class i8 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy[] f29522c = {yhm.j.c(yhm.k.PUBLICATION, new dl1(28)), null};
    private static final i8 d = new i8(ea.INSTANCE.b(), 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ea color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int width;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29526b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f29525a = aVar;
            f29526b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.BorderElement", aVar, 2);
            pluginGeneratedSerialDescriptor.j("color", false);
            pluginGeneratedSerialDescriptor.j("width", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i8 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = i8.f29522c;
            dVarBeginStructure.getClass();
            SerializationConstructorMarker serializationConstructorMarker = null;
            boolean z = true;
            int i = 0;
            int iDecodeIntElement = 0;
            ea eaVar = null;
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
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new i8(i, eaVar, iDecodeIntElement, serializationConstructorMarker);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{i8.f29522c[0].getValue(), qlm.n0.f247680a};
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
        public final void serialize(Encoder encoder, i8 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            i8.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.i8$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i8 a() {
            return i8.d;
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f29525a;
        }

        private Companion() {
        }
    }

    public /* synthetic */ i8(int i, ea eaVar, int i2, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            qlm.j1.f(a.f29525a.getDescriptor(), i, 3);
            throw null;
        }
        this.color = eaVar;
        this.width = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return ea.INSTANCE.serializer();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final ea getColor() {
        return this.color;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof i8)) {
            return false;
        }
        i8 i8Var = (i8) other;
        return Intrinsics.f(this.color, i8Var.color) && this.width == i8Var.width;
    }

    public int hashCode() {
        return (this.color.hashCode() * 31) + Integer.hashCode(this.width);
    }

    public String toString() {
        return "BorderElement(color=" + this.color + ", width=" + this.width + ")";
    }

    public i8(ea color, int i) {
        Intrinsics.checkNotNullParameter(color, "color");
        this.color = color;
        this.width = i;
    }

    public final i8 a(ea color, int width) {
        Intrinsics.checkNotNullParameter(color, "color");
        return new i8(color, width);
    }

    public static /* synthetic */ i8 a(i8 i8Var, ea eaVar, int i, int i2, Object obj2) {
        if ((i2 & 1) != 0) {
            eaVar = i8Var.color;
        }
        if ((i2 & 2) != 0) {
            i = i8Var.width;
        }
        return i8Var.a(eaVar, i);
    }

    public static final /* synthetic */ void a(i8 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeSerializableElement(serialDesc, 0, (mlm.h) f29522c[0].getValue(), self.color);
        output.encodeIntElement(serialDesc, 1, self.width);
    }
}
