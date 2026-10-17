package com.fourthline.orca.internal;

import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes23.dex */
public final class ny0 implements KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31513b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f31514c = 8;
    private static Map d = zhm.r0.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f31515a = com.bumptech.glide.c.d("RadiusElement", new SerialDescriptor[0], new okk.d(12));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Map map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            ny0.d = map;
        }

        private a() {
        }
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f31515a;
    }

    @Override // mlm.h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj2) {
        a(encoder, ((Number) obj2).intValue());
    }

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        Integer num = (Integer) d.get(strDecodeString);
        if (num != null) {
            return num;
        }
        throw new IllegalStateException(("FL Developer Error. Failed to deserialize radius ('" + strDecodeString + "').").toString());
    }

    public void a(Encoder encoder, int i) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        throw new NotImplementedError(null, 1, null);
    }
}
