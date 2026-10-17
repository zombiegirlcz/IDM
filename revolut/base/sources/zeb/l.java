package zeb;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f321663a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final qlm.e f321664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final SerialDescriptor f321665c;

    static {
        qlm.e eVarA = nlm.a.a(n.f321669a);
        f321664b = eVarA;
        f321665c = eVarA.f247633b;
    }

    private l() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return (List) f321664b.deserialize(decoder);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f321665c;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        List value = (List) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        f321664b.serialize(encoder, value);
    }
}
