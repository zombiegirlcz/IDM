package com.fourthline.orca.internal;

import com.fourthline.orca.internal.a81;
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
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\b\u0081\b\u0018\u0000 (2\u00020\u0001:\u0003&\u0014\"B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bB9\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lcom/fourthline/orca/internal/o41;", "", "Lcom/fourthline/orca/internal/a81;", "message", "Lcom/fourthline/orca/internal/o41$c;", "default", "disabled", "<init>", "(Lcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/o41$c;Lcom/fourthline/orca/internal/o41$c;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILcom/fourthline/orca/internal/a81;Lcom/fourthline/orca/internal/o41$c;Lcom/fourthline/orca/internal/o41$c;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/o41;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/fourthline/orca/internal/a81;", "f", "()Lcom/fourthline/orca/internal/a81;", "b", "Lcom/fourthline/orca/internal/o41$c;", "d", "()Lcom/fourthline/orca/internal/o41$c;", "c", "e", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class o41 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final Lazy[] d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a81 message;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c default;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c disabled;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31574a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f31575b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f31574a = aVar;
            f31575b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.styling.common.StatefulLinkButtonElement", aVar, 3);
            pluginGeneratedSerialDescriptor.j("message", false);
            pluginGeneratedSerialDescriptor.j("default", false);
            pluginGeneratedSerialDescriptor.j("disabled", false);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o41 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = o41.d;
            dVarBeginStructure.getClass();
            int i = 0;
            a81 a81Var = null;
            c cVar = null;
            c cVar2 = null;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    a81Var = (a81) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, a81.a.f26728a, a81Var);
                    i |= 1;
                } else if (iD == 1) {
                    cVar = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), cVar);
                    i |= 2;
                } else {
                    if (iD != 2) {
                        throw new UnknownFieldException(iD);
                    }
                    cVar2 = (c) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 2, (mlm.b) lazyArr[2].getValue(), cVar2);
                    i |= 4;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new o41(i, a81Var, cVar, cVar2, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = o41.d;
            return new KSerializer[]{a81.a.f26728a, lazyArr[1].getValue(), lazyArr[2].getValue()};
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
        public final void serialize(Encoder encoder, o41 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            o41.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.o41$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f31574a;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/fourthline/orca/internal/o41$c;", "", "Lcom/fourthline/orca/internal/w50;", "link", "<init>", "(Lcom/fourthline/orca/internal/w50;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/fourthline/orca/internal/w50;", "()Lcom/fourthline/orca/internal/w50;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    @mlm.g(with = v50.class)
    public static final /* data */ class c {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final w50 link;

        /* JADX INFO: renamed from: com.fourthline.orca.internal.o41$c$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final KSerializer serializer() {
                return new v50();
            }

            private Companion() {
            }
        }

        public c(w50 link) {
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final w50 getLink() {
            return this.link;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof c) && Intrinsics.f(this.link, ((c) other).link);
        }

        public int hashCode() {
            return this.link.hashCode();
        }

        public String toString() {
            return "LinkElement(link=" + this.link + ")";
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        d = new Lazy[]{null, yhm.j.c(kVar, new wp1(11)), yhm.j.c(kVar, new wp1(12))};
    }

    public /* synthetic */ o41(int i, a81 a81Var, c cVar, c cVar2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            qlm.j1.f(a.f31574a.getDescriptor(), i, 7);
            throw null;
        }
        this.message = a81Var;
        this.default = cVar;
        this.disabled = cVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return c.INSTANCE.serializer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return c.INSTANCE.serializer();
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getDefault() {
        return this.default;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final c getDisabled() {
        return this.disabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof o41)) {
            return false;
        }
        o41 o41Var = (o41) other;
        return Intrinsics.f(this.message, o41Var.message) && Intrinsics.f(this.default, o41Var.default) && Intrinsics.f(this.disabled, o41Var.disabled);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final a81 getMessage() {
        return this.message;
    }

    public int hashCode() {
        return (((this.message.hashCode() * 31) + this.default.hashCode()) * 31) + this.disabled.hashCode();
    }

    public String toString() {
        return "StatefulLinkButtonElement(message=" + this.message + ", default=" + this.default + ", disabled=" + this.disabled + ")";
    }

    public o41(a81 message, c cVar, c disabled) {
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(cVar, "default");
        Intrinsics.checkNotNullParameter(disabled, "disabled");
        this.message = message;
        this.default = cVar;
        this.disabled = disabled;
    }

    public static final /* synthetic */ void a(o41 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = d;
        output.encodeSerializableElement(serialDesc, 0, a81.a.f26728a, self.message);
        output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.default);
        output.encodeSerializableElement(serialDesc, 2, (mlm.h) lazyArr[2].getValue(), self.disabled);
    }
}
