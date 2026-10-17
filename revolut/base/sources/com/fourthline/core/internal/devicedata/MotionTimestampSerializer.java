package com.fourthline.core.internal.devicedata;

import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import olm.e;
import org.jetbrains.annotations.NotNull;
import rlm.j;
import rlm.m;

/* JADX INFO: loaded from: classes23.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0014\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/fourthline/core/internal/devicedata/MotionTimestampSerializer;", "Lkotlinx/serialization/KSerializer;", "", "<init>", "()V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Long;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;J)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "a", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "fourthline-core_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MotionTimestampSerializer implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SerialDescriptor descriptor = com.bumptech.glide.c.a("timestamp", e.e);

    @Override // mlm.h, mlm.b
    @NotNull
    public SerialDescriptor getDescriptor() {
        return this.descriptor;
    }

    @Override // mlm.h
    public /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj2) {
        serialize(encoder, ((Number) obj2).longValue());
    }

    @Override // mlm.b
    @NotNull
    public Long deserialize(@NotNull Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return Long.valueOf((long) (decoder.decodeDouble() * ((double) 1000)));
    }

    public void serialize(@NotNull Encoder encoder, long value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        long j2 = 1000;
        String str = String.format(Locale.ROOT, "%d.%03d", Arrays.copyOf(new Object[]{Long.valueOf(value / j2), Long.valueOf(value % j2)}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        m mVar = encoder instanceof m ? (m) encoder : null;
        if (mVar != null) {
            mVar.b(j.d(str));
        }
    }
}
