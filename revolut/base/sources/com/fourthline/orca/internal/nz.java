package com.fourthline.orca.internal;

import androidx.compose.ui.unit.TextUnitKt;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes23.dex */
public final class nz implements KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f31516b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f31517c = 8;
    private static Map d = zhm.r0.g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SerialDescriptor f31518a = com.bumptech.glide.c.d("FontName", new SerialDescriptor[0], new okk.d(12));

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void a(Map map) {
            Intrinsics.checkNotNullParameter(map, "<set-?>");
            nz.d = map;
        }

        private a() {
        }
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return this.f31518a;
    }

    @Override // mlm.b
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public mz deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        kj0 kj0Var = (kj0) d.get(strDecodeString);
        if (kj0Var != null) {
            return new mz(kj0Var.getFamily(), TextUnitKt.getSp(kj0Var.getSize()), 0L, 4, null);
        }
        throw new IllegalStateException(("FL Developer Error. Failed to deserialize font ('" + strDecodeString + "').").toString());
    }

    @Override // mlm.h
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void serialize(Encoder encoder, mz value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        throw new NotImplementedError(null, 1, null);
    }
}
