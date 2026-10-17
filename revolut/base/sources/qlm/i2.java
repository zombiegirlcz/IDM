package qlm;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class i2 implements KSerializer {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i2 f247662b = new i2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d1 f247663a = new d1("kotlin.Unit", Unit.f186387a);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.f247663a.deserialize(decoder);
        return Unit.f186387a;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return this.f247663a.getDescriptor();
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Unit value = (Unit) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        this.f247663a.serialize(encoder, value);
    }
}
