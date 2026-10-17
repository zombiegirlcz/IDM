package com.fourthline.orca.internal;

import java.util.List;
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
import kotlinx.serialization.json.JsonObject;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u0000 '2\u00020\u0001:\u0002\u0014#B#\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\rJ'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0014\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0003¢\u0006\u0004\b\u0014\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, d2 = {"Lcom/fourthline/orca/internal/iz;", "", "", "", "values", "Lkotlinx/serialization/json/JsonObject;", "config", "<init>", "(Ljava/util/List;Lkotlinx/serialization/json/JsonObject;)V", "", "seen0", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "serializationConstructorMarker", "(ILjava/util/List;Lkotlinx/serialization/json/JsonObject;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "self", "Lkotlinx/serialization/encoding/CompositeEncoder;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "", "a", "(Lcom/fourthline/orca/internal/iz;Lkotlinx/serialization/encoding/CompositeEncoder;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "strategy", "", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "d", "()Ljava/util/List;", "b", "Lkotlinx/serialization/json/JsonObject;", "c", "()Lkotlinx/serialization/json/JsonObject;", "Companion", "fourthline-sdk_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mlm.g
public final /* data */ class iz {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f29757c = 8;
    private static final Lazy[] d = {yhm.j.c(yhm.k.PUBLICATION, new wn1(0)), null};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List values;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final JsonObject config;

    public static final /* synthetic */ class a implements qlm.f0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29760a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f29761b;

        @NotNull
        private static final SerialDescriptor descriptor;

        static {
            a aVar = new a();
            f29760a = aVar;
            f29761b = 8;
            PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.fourthline.orca.core.internal.flow.model.FlowStrategyConfig", aVar, 2);
            pluginGeneratedSerialDescriptor.j("values", true);
            pluginGeneratedSerialDescriptor.j("config", true);
            descriptor = pluginGeneratedSerialDescriptor;
        }

        private a() {
        }

        @Override // mlm.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final iz deserialize(Decoder decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            SerialDescriptor serialDescriptor = descriptor;
            plm.d dVarBeginStructure = decoder.beginStructure(serialDescriptor);
            Lazy[] lazyArr = iz.d;
            dVarBeginStructure.getClass();
            boolean z = true;
            int i = 0;
            List list = null;
            JsonObject jsonObject = null;
            while (z) {
                int iD = dVarBeginStructure.d(serialDescriptor);
                if (iD == -1) {
                    z = false;
                } else if (iD == 0) {
                    list = (List) dVarBeginStructure.decodeSerializableElement(serialDescriptor, 0, (mlm.b) lazyArr[0].getValue(), list);
                    i |= 1;
                } else {
                    if (iD != 1) {
                        throw new UnknownFieldException(iD);
                    }
                    jsonObject = (JsonObject) dVarBeginStructure.decodeNullableSerializableElement(serialDescriptor, 1, rlm.v.f255125a, jsonObject);
                    i |= 2;
                }
            }
            dVarBeginStructure.endStructure(serialDescriptor);
            return new iz(i, list, jsonObject, (SerializationConstructorMarker) null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // qlm.f0
        public final KSerializer[] childSerializers() {
            return new KSerializer[]{iz.d[0].getValue(), nlm.a.c(rlm.v.f255125a)};
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
        public final void serialize(Encoder encoder, iz value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            SerialDescriptor serialDescriptor = descriptor;
            CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(serialDescriptor);
            iz.a(value, compositeEncoderBeginStructure, serialDescriptor);
            compositeEncoderBeginStructure.endStructure(serialDescriptor);
        }
    }

    /* JADX INFO: renamed from: com.fourthline.orca.internal.iz$b, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final KSerializer serializer() {
            return a.f29760a;
        }

        private Companion() {
        }
    }

    public iz(int i, List list, JsonObject jsonObject, SerializationConstructorMarker serializationConstructorMarker) {
        this.values = (i & 1) == 0 ? zhm.f0.f322471a : list;
        if ((i & 2) == 0) {
            this.config = null;
        } else {
            this.config = jsonObject;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ KSerializer a() {
        return new qlm.e(qlm.v1.f247718a);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final JsonObject getConfig() {
        return this.config;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final List getValues() {
        return this.values;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof iz)) {
            return false;
        }
        iz izVar = (iz) other;
        return Intrinsics.f(this.values, izVar.values) && Intrinsics.f(this.config, izVar.config);
    }

    public int hashCode() {
        int iHashCode = this.values.hashCode() * 31;
        JsonObject jsonObject = this.config;
        return iHashCode + (jsonObject == null ? 0 : jsonObject.f187951a.hashCode());
    }

    public String toString() {
        return "FlowStrategyConfig(values=" + this.values + ", config=" + this.config + ")";
    }

    public static final void a(iz self, CompositeEncoder output, SerialDescriptor serialDesc) {
        Lazy[] lazyArr = d;
        if (output.d(serialDesc) || !Intrinsics.f(self.values, zhm.f0.f322471a)) {
            output.encodeSerializableElement(serialDesc, 0, (mlm.h) lazyArr[0].getValue(), self.values);
        }
        if (!output.d(serialDesc) && self.config == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 1, rlm.v.f255125a, self.config);
    }

    public iz(List values, JsonObject jsonObject) {
        Intrinsics.checkNotNullParameter(values, "values");
        this.values = values;
        this.config = jsonObject;
    }

    public final boolean a(String strategy) {
        Intrinsics.checkNotNullParameter(strategy, "strategy");
        return this.values.contains(strategy);
    }

    public iz(List list, JsonObject jsonObject, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? zhm.f0.f322471a : list, (i & 2) != 0 ? null : jsonObject);
    }
}
