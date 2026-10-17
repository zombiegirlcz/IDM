package kf8;

import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import qlm.n1;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f183314a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f183315b = com.bumptech.glide.c.a("JuniorAccountOwnerRelationship", olm.e.f226474j);

    private c() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        b.Companion.getClass();
        b bVar = (b) b.mapping.get(strDecodeString);
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException(j6.a.q("Unknown relationship type: ", strDecodeString));
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f183315b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Object next;
        String strName;
        b value = (b) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        b.Companion.getClass();
        Iterator it8 = b.mapping.entrySet().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((Map.Entry) next).getValue() == value) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (strName = (String) entry.getKey()) == null) {
            strName = value.name();
        }
        encoder.encodeString(strName);
    }
}
