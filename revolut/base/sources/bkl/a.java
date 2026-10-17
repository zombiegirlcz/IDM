package bkl;

import android.accounts.Account;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SerialDescriptor f16417a = d.Companion.serializer().getDescriptor();

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        d dVar = (d) decoder.b(d.Companion.serializer());
        return new Account(dVar.f16419a, dVar.f16420b);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return this.f16417a;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Account value = (Account) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        String name = value.name;
        Intrinsics.checkNotNullExpressionValue(name, "name");
        String type = value.type;
        Intrinsics.checkNotNullExpressionValue(type, "type");
        encoder.encodeSerializableValue(d.Companion.serializer(), new d(name, type));
    }
}
