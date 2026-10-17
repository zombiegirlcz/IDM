package com.fourthline.orca.internal;

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
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0081\b\u0018\u0000 )2\u00020\u0001:\u0002\u0014!B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tBC\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\b\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b$\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010\u001a¨\u0006*"}, d2 = {"Lcom/fourthline/orca/internal/sh0;", "", "", "thinOutlineThickness", "boldOutlineThickness", "viewMargins", "popupCornerRadius", "borderWidth", "<init>", "(IIIII)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(IIIIIILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/sh0;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getThinOutlineThickness", "b", "getBoldOutlineThickness", "c", "getViewMargins", "d", "getPopupCornerRadius", "e", "getBorderWidth", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class sh0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int thinOutlineThickness;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int boldOutlineThickness;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int viewMargins;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final int popupCornerRadius;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final int borderWidth;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f33012a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f33013b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f33012a = aVar;
            f33013b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.OrcaInternalDefaults", aVar, 5);
            pluginGeneratedSerialDescriptor.j("thinOutlineThickness", true);
            pluginGeneratedSerialDescriptor.j("boldOutlineThickness", true);
            pluginGeneratedSerialDescriptor.j("viewMargins", true);
            pluginGeneratedSerialDescriptor.j("popupCornerRadius", true);
            pluginGeneratedSerialDescriptor.j("borderWidth", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sh0 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            dVarBeginStructure.getClass();
            boolean z = true;
            int i = 0;
            int iDecodeIntElement = 0;
            int iDecodeIntElement2 = 0;
            int iDecodeIntElement3 = 0;
            int iDecodeIntElement4 = 0;
            int iDecodeIntElement5 = 0;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    iDecodeIntElement = dVarBeginStructure.decodeIntElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    iDecodeIntElement2 = dVarBeginStructure.decodeIntElement(serialDescriptor, 1);
                    i |= 2;
                } else if (iD == 2) {
                    iDecodeIntElement3 = dVarBeginStructure.decodeIntElement(serialDescriptor, 2);
                    i |= 4;
                } else if (iD == 3) {
                    iDecodeIntElement4 = dVarBeginStructure.decodeIntElement(serialDescriptor, 3);
                    i |= 8;
                } else {
                    if (iD != 4) {
                        throw new UnknownFieldException(iD);
                    }
                    iDecodeIntElement5 = dVarBeginStructure.decodeIntElement(serialDescriptor, 4);
                    i |= 16;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new sh0(i, iDecodeIntElement, iDecodeIntElement2, iDecodeIntElement3, iDecodeIntElement4, iDecodeIntElement5, (SerializationConstructorMarker) null);
        }

        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            qlm.n0 n0Var = qlm.n0.f247680a;
            return new KSerializer[]{n0Var, n0Var, n0Var, n0Var, n0Var};
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
        public final void serialize(Encoder encoder, sh0 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            sh0.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.sh0$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f33012a;
        }

        private Companion() {
        }
    }

    public sh0(int i, int i2, int i3, int i5, int i6) {
        this.thinOutlineThickness = i;
        this.boldOutlineThickness = i2;
        this.viewMargins = i3;
        this.popupCornerRadius = i5;
        this.borderWidth = i6;
    }

    public static final /* synthetic */ void a(sh0 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.d(serialDesc) || self.thinOutlineThickness != 1) {
            output.encodeIntElement(serialDesc, 0, self.thinOutlineThickness);
        }
        if (output.d(serialDesc) || self.boldOutlineThickness != 2) {
            output.encodeIntElement(serialDesc, 1, self.boldOutlineThickness);
        }
        if (output.d(serialDesc) || self.viewMargins != 32) {
            output.encodeIntElement(serialDesc, 2, self.viewMargins);
        }
        if (output.d(serialDesc) || self.popupCornerRadius != 20) {
            output.encodeIntElement(serialDesc, 3, self.popupCornerRadius);
        }
        if (!output.d(serialDesc) && self.borderWidth == 2) {
            return;
        }
        output.encodeIntElement(serialDesc, 4, self.borderWidth);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof sh0)) {
            return false;
        }
        sh0 sh0Var = (sh0) other;
        return this.thinOutlineThickness == sh0Var.thinOutlineThickness && this.boldOutlineThickness == sh0Var.boldOutlineThickness && this.viewMargins == sh0Var.viewMargins && this.popupCornerRadius == sh0Var.popupCornerRadius && this.borderWidth == sh0Var.borderWidth;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.thinOutlineThickness) * 31) + Integer.hashCode(this.boldOutlineThickness)) * 31) + Integer.hashCode(this.viewMargins)) * 31) + Integer.hashCode(this.popupCornerRadius)) * 31) + Integer.hashCode(this.borderWidth);
    }

    public String toString() {
        return "OrcaInternalDefaults(thinOutlineThickness=" + this.thinOutlineThickness + ", boldOutlineThickness=" + this.boldOutlineThickness + ", viewMargins=" + this.viewMargins + ", popupCornerRadius=" + this.popupCornerRadius + ", borderWidth=" + this.borderWidth + ")";
    }

    public /* synthetic */ sh0(int i, int i2, int i3, int i5, int i6, int i21, SerializationConstructorMarker serializationConstructorMarker) {
        this.thinOutlineThickness = (i & 1) == 0 ? 1 : i2;
        if ((i & 2) == 0) {
            this.boldOutlineThickness = 2;
        } else {
            this.boldOutlineThickness = i3;
        }
        if ((i & 4) == 0) {
            this.viewMargins = 32;
        } else {
            this.viewMargins = i5;
        }
        if ((i & 8) == 0) {
            this.popupCornerRadius = 20;
        } else {
            this.popupCornerRadius = i6;
        }
        if ((i & 16) == 0) {
            this.borderWidth = 2;
        } else {
            this.borderWidth = i21;
        }
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ sh0(int r2, int r3, int r4, int r5, int r6, int r7, kotlin.jvm.internal.DefaultConstructorMarker r8) {
        /*
            r1 = this;
            r8 = r7 & 1
            if (r8 == 0) goto L5
            r2 = 1
        L5:
            r8 = r7 & 2
            r0 = 2
            if (r8 == 0) goto Lb
            r3 = r0
        Lb:
            r8 = r7 & 4
            if (r8 == 0) goto L11
            r4 = 32
        L11:
            r8 = r7 & 8
            if (r8 == 0) goto L17
            r5 = 20
        L17:
            r7 = r7 & 16
            if (r7 == 0) goto L22
            r8 = r0
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
            goto L28
        L22:
            r8 = r6
            r7 = r5
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
        L28:
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fourthline.orca.internal.sh0.<init>(int, int, int, int, int, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
