package com.onfido.api.client.data;

import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import mlm.g;
import org.jetbrains.annotations.NotNull;
import qlm.f0;
import qlm.j1;
import qlm.v1;
import vc.s;
import yhm.j;
import yhm.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0087\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\t\nB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u000b"}, d2 = {"Lcom/onfido/api/client/data/InternalDocSide;", "", "id", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getId", "()Ljava/lang/String;", "FRONT", "BACK", "$serializer", "Companion", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
@g
public final class InternalDocSide {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InternalDocSide[] $VALUES;

    @NotNull
    private static final Lazy $cachedSerializer$delegate;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private final String id;
    public static final InternalDocSide FRONT = new InternalDocSide("FRONT", 0, "front");
    public static final InternalDocSide BACK = new InternalDocSide("BACK", 1, "back");

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lcom/onfido/api/client/data/InternalDocSide$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/onfido/api/client/data/InternalDocSide;", "onfido-api-client"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: com.onfido.api.client.data.InternalDocSide$Companion$1, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class AnonymousClass1 extends u implements Function0<KSerializer> {
            public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

            public AnonymousClass1() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final KSerializer invoke() {
                return new f0() { // from class: com.onfido.api.client.data.InternalDocSide$$serializer
                    private static final /* synthetic */ EnumDescriptor descriptor;

                    static {
                        EnumDescriptor enumDescriptor = new EnumDescriptor("com.onfido.api.client.data.InternalDocSide", 2);
                        enumDescriptor.j("front", false);
                        enumDescriptor.j("back", false);
                        descriptor = enumDescriptor;
                    }

                    @Override // qlm.f0
                    @NotNull
                    public KSerializer[] childSerializers() {
                        return new KSerializer[]{v1.f247718a};
                    }

                    @Override // mlm.b
                    @NotNull
                    public InternalDocSide deserialize(@NotNull Decoder decoder) {
                        Intrinsics.checkNotNullParameter(decoder, "decoder");
                        return InternalDocSide.values()[decoder.decodeEnum(getDescriptor())];
                    }

                    @Override // mlm.h, mlm.b
                    @NotNull
                    public SerialDescriptor getDescriptor() {
                        return descriptor;
                    }

                    @Override // mlm.h
                    public void serialize(@NotNull Encoder encoder, @NotNull InternalDocSide value) {
                        Intrinsics.checkNotNullParameter(encoder, "encoder");
                        Intrinsics.checkNotNullParameter(value, "value");
                        encoder.encodeEnum(getDescriptor(), value.ordinal());
                    }

                    @Override // qlm.f0
                    @NotNull
                    public KSerializer[] typeParametersSerializers() {
                        return j1.f247666a;
                    }
                };
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) InternalDocSide.$cachedSerializer$delegate.getValue();
        }

        @NotNull
        public final KSerializer serializer() {
            return get$cachedSerializer();
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ InternalDocSide[] $values() {
        return new InternalDocSide[]{FRONT, BACK};
    }

    static {
        InternalDocSide[] internalDocSideArr$values = $values();
        $VALUES = internalDocSideArr$values;
        $ENTRIES = s.n(internalDocSideArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = j.c(k.PUBLICATION, Companion.AnonymousClass1.INSTANCE);
    }

    private InternalDocSide(String str, int i, String str2) {
        this.id = str2;
    }

    @NotNull
    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static InternalDocSide valueOf(String str) {
        return (InternalDocSide) Enum.valueOf(InternalDocSide.class, str);
    }

    public static InternalDocSide[] values() {
        return (InternalDocSide[]) $VALUES.clone();
    }

    @NotNull
    public final String getId() {
        return this.id;
    }
}
