package com.fourthline.orca.internal;

import com.fourthline.orca.internal.uc;
import java.util.List;
import java.util.Map;
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
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u0000 12\u00020\u0001:\u0002\u0018$B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fBU\b\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u000b\u0010\u0011J'\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\"\u001a\u0004\b#\u0010\u001bR.\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010)\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b&\u0010.\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Lcom/fourthline/orca/internal/x70;", "", "", "event", "", "attributes", "", "timestamp", "", "Lcom/fourthline/orca/internal/uc;", "context", "<init>", "(Ljava/lang/String;Ljava/util/Map;JLjava/util/List;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/util/Map;JLjava/util/List;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/x70;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "b", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "getAttributes$annotations", "()V", "c", "J", "getTimestamp", "()J", "Ljava/util/List;", "e", "()Ljava/util/List;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class x70 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int e = 8;
    private static final Lazy[] f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String event;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map attributes;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long timestamp;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final List context;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f34912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f34913b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f34912a = aVar;
            f34913b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.analytics.MockEvent", aVar, 4);
            pluginGeneratedSerialDescriptor.j("event", false);
            pluginGeneratedSerialDescriptor.j("attributes", true);
            pluginGeneratedSerialDescriptor.j("timestamp", false);
            pluginGeneratedSerialDescriptor.j("context", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final x70 deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = x70.f;
            dVarBeginStructure.getClass();
            int i = 0;
            String strDecodeStringElement = null;
            Map map = null;
            List list = null;
            long jDecodeLongElement = 0;
            boolean z = true;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    strDecodeStringElement = dVarBeginStructure.decodeStringElement(serialDescriptor, 0);
                    i |= 1;
                } else if (iD == 1) {
                    map = (Map) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 1, (mlm.b) lazyArr[1].getValue(), map);
                    i |= 2;
                } else if (iD == 2) {
                    jDecodeLongElement = dVarBeginStructure.decodeLongElement(serialDescriptor, 2);
                    i |= 4;
                } else {
                    if (iD != 3) {
                        throw new UnknownFieldException(iD);
                    }
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 3, (mlm.b) lazyArr[3].getValue(), list);
                    i |= 8;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new x70(i, strDecodeStringElement, map, jDecodeLongElement, list, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            Lazy[] lazyArr = x70.f;
            return new KSerializer[]{qlm.v1.f247718a, lazyArr[1].getValue(), qlm.t0.f247706a, lazyArr[3].getValue()};
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
        public final void serialize(Encoder encoder, x70 value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            x70.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.x70$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f34912a;
        }

        private Companion() {
        }
    }

    static {
        yhm.k kVar = yhm.k.PUBLICATION;
        f = new Lazy[]{null, yhm.j.c(kVar, new nr1(28)), null, yhm.j.c(kVar, new nr1(29))};
    }

    public x70(int i, String str, Map map, long j2, List list, SerializationConstructorMarker serializationConstructorMarker) {
        if (5 != (i & 5)) {
            qlm.j1.f(a.f34912a.getDescriptor(), i, 5);
            throw null;
        }
        this.event = str;
        if ((i & 2) == 0) {
            this.attributes = zhm.r0.g();
        } else {
            this.attributes = map;
        }
        this.timestamp = j2;
        if ((i & 8) == 0) {
            this.context = zhm.f0.f322471a;
        } else {
            this.context = list;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return new xz();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer b() {
        return new qlm.e(uc.a.f33998a);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Map getAttributes() {
        return this.attributes;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final List getContext() {
        return this.context;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof x70)) {
            return false;
        }
        x70 x70Var = (x70) other;
        return Intrinsics.f(this.event, x70Var.event) && Intrinsics.f(this.attributes, x70Var.attributes) && this.timestamp == x70Var.timestamp && Intrinsics.f(this.context, x70Var.context);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    public int hashCode() {
        return (((((this.event.hashCode() * 31) + this.attributes.hashCode()) * 31) + Long.hashCode(this.timestamp)) * 31) + this.context.hashCode();
    }

    public String toString() {
        return "MockEvent(event=" + this.event + ", attributes=" + this.attributes + ", timestamp=" + this.timestamp + ", context=" + this.context + ")";
    }

    public static final void a(x70 self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = f;
        output.encodeStringElement(serialDesc, 0, self.event);
        if (output.d(serialDesc) || !Intrinsics.f(self.attributes, zhm.r0.g())) {
            output.encodeSerializableElement(serialDesc, 1, (mlm.h) lazyArr[1].getValue(), self.attributes);
        }
        output.encodeLongElement(serialDesc, 2, self.timestamp);
        if (!output.d(serialDesc) && Intrinsics.f(self.context, zhm.f0.f322471a)) {
            return;
        }
        output.encodeSerializableElement(serialDesc, 3, (mlm.h) lazyArr[3].getValue(), self.context);
    }

    public x70(String event, Map attributes, long j2, List context) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(attributes, "attributes");
        Intrinsics.checkNotNullParameter(context, "context");
        this.event = event;
        this.attributes = attributes;
        this.timestamp = j2;
        this.context = context;
    }
}
