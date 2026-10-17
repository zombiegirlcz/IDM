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
import org.bouncycastle.asn1.eac.CertificateBody;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0081\b\u0018\u0000 <2\u00020\u0001:\u0002\u001d+Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012(\u0010\u000e\u001a$0\tj\u0011`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B_\b\u0010\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0011\u0010\u0016J'\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010(\u001a\u0004\b4\u0010*R9\u0010\u000e\u001a$0\tj\u0011`\n¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r¢\u0006\f\b\u000b\u0012\b\b\f\u0012\u0004\b\t0\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010#R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006="}, d2 = {"Lcom/fourthline/orca/internal/c;", "", "Lcom/fourthline/orca/internal/ea;", "background", "separator", "Lcom/fourthline/orca/internal/a81;", "title", "message", "icon", "", "Lcom/fourthline/orca/core/internal/styling/common/RadiusElement;", "Lmlm/g;", "with", "Lcom/fourthline/orca/internal/ny0;", "radius", "Lcom/fourthline/orca/internal/i8;", "border", "<init>", "(Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;ILcom/fourthline/orca/internal/i8;)V", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/ea;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/ea;ILcom/fourthline/orca/internal/i8;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/c;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/ea;", "getBackground", "()Lcom/fourthline/orca/internal/ea;", "b", "getSeparator", "c", "Lcom/fourthline/orca/internal/a81;", "getTitle", "()Lcom/fourthline/orca/internal/a81;", "d", "getMessage", "e", "getIcon", "f", "I", "getRadius", "g", "Lcom/fourthline/orca/internal/i8;", "getBorder", "()Lcom/fourthline/orca/internal/i8;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Lazy[] f27289h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ea background;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ea separator;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a81 title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final a81 message;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ea icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final int radius;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final i8 border;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f27294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f27295b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f27294a = aVar;
            f27295b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.AccordionElement", aVar, 7);
            pluginGeneratedSerialDescriptor.j("background", false);
            pluginGeneratedSerialDescriptor.j("separator", false);
            pluginGeneratedSerialDescriptor.j("title", false);
            pluginGeneratedSerialDescriptor.j("message", false);
            pluginGeneratedSerialDescriptor.j("icon", false);
            pluginGeneratedSerialDescriptor.j("radius", false);
            pluginGeneratedSerialDescriptor.j("border", false);
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
            Lazy[] lazyArr = c.f27289h;
            dVarBeginStructure.getClass();
            int i = 0;
            int iIntValue = 0;
            ea eaVar = null;
            ea eaVar2 = null;
            a81 a81Var = null;
            a81 a81Var2 = null;
            ea eaVar3 = null;
            i8 i8Var = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                switch (iD) {
                    case -1:
                        z = false;
                        break;
                    case 0:
                        eaVar = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), eaVar);
                        i |= 1;
                        break;
                    case 1:
                        eaVar2 = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), eaVar2);
                        i |= 2;
                        break;
                    case 2:
                        a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, a81.a.f26728a, a81Var);
                        i |= 4;
                        break;
                    case 3:
                        a81Var2 = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, a81.a.f26728a, a81Var2);
                        i |= 8;
                        break;
                    case 4:
                        eaVar3 = (ea) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 4, (mlm.b) lazyArr[4].getValue(), eaVar3);
                        i |= 16;
                        break;
                    case 5:
                        iIntValue = ((Number) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 5, (mlm.b) lazyArr[5].getValue(), Integer.valueOf(iIntValue))).intValue();
                        i |= 32;
                        break;
                    case 6:
                        i8Var = (i8) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 6, i8.a.f29525a, i8Var);
                        i |= 64;
                        break;
                    default:
                        throw new UnknownFieldException(iD);
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new c(i, eaVar, eaVar2, a81Var, a81Var2, eaVar3, iIntValue, i8Var, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = c.f27289h;
            a81.a aVar = a81.a.f26728a;
            return new KSerializer[]{lazyArr[0].getValue(), lazyArr[1].getValue(), aVar, aVar, lazyArr[4].getValue(), lazyArr[5].getValue(), i8.a.f29525a};
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

    /* JADX INFO: renamed from: com.fourthline.orca.internal.c$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f27294a;
        }

        private Companion() {
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f27289h = new Lazy[]{yhm.j.c(kVar, new pj1(2)), yhm.j.c(kVar, new pj1(3)), null, null, yhm.j.c(kVar, new pj1(4)), yhm.j.c(kVar, new pj1(5)), null};
    }

    public /* synthetic */ c(int i, ea eaVar, ea eaVar2, a81 a81Var, a81 a81Var2, ea eaVar3, int i2, i8 i8Var, SerializationConstructorMarker serializationConstructorMarker) {
        if (127 != (i & CertificateBody.profileType)) {
            qlm.j1.f(a.f27294a.getDescriptor(), i, CertificateBody.profileType);
            throw null;
        }
        this.background = eaVar;
        this.separator = eaVar2;
        this.title = a81Var;
        this.message = a81Var2;
        this.icon = eaVar3;
        this.radius = i2;
        this.border = i8Var;
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
        if (!(other instanceof c)) {
            return false;
        }
        c cVar = (c) other;
        return Intrinsics.f(this.background, cVar.background) && Intrinsics.f(this.separator, cVar.separator) && Intrinsics.f(this.title, cVar.title) && Intrinsics.f(this.message, cVar.message) && Intrinsics.f(this.icon, cVar.icon) && this.radius == cVar.radius && Intrinsics.f(this.border, cVar.border);
    }

    public int hashCode() {
        return (((((((((((this.background.hashCode() * 31) + this.separator.hashCode()) * 31) + this.title.hashCode()) * 31) + this.message.hashCode()) * 31) + this.icon.hashCode()) * 31) + Integer.hashCode(this.radius)) * 31) + this.border.hashCode();
    }

    public String toString() {
        return "AccordionElement(background=" + this.background + ", separator=" + this.separator + ", title=" + this.title + ", message=" + this.message + ", icon=" + this.icon + ", radius=" + this.radius + ", border=" + this.border + ")";
    }

    public c(ea background, ea separator, a81 title, a81 message, ea icon, int i, i8 border) {
        Intrinsics.checkNotNullParameter(background, "background");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(border, "border");
        this.background = background;
        this.separator = separator;
        this.title = title;
        this.message = message;
        this.icon = icon;
        this.radius = i;
        this.border = border;
    }

    public static final /* synthetic */ void a(c self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f27289h;
        output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.background);
        output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.separator);
        a81.a aVar = a81.a.f26728a;
        output.encodeSerializableElement(serialDesc, 2, aVar, self.title);
        output.encodeSerializableElement(serialDesc, 3, aVar, self.message);
        output.encodeSerializableElement(serialDesc, 4, (mlm.h) lazyArr[4].getValue(), self.icon);
        output.encodeSerializableElement(serialDesc, 5, (mlm.h) lazyArr[5].getValue(), Integer.valueOf(self.radius));
        output.encodeSerializableElement(serialDesc, 6, i8.a.f29525a, self.border);
    }
}
