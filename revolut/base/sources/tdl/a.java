package tdl;

import com.bumptech.glide.c;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import olm.e;
import qlm.n1;
import sdl.q0;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f270003a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f270004b = c.a("TradingAccountPermittedActionDto", e.f226474j);

    private a() {
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Object next;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        String strDecodeString = decoder.decodeString();
        Iterator<E> it8 = q0.b().iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            }
            next = it8.next();
            if (Intrinsics.f(((q0) next).getLabel(), strDecodeString)) {
                break;
            }
        }
        return (q0) next;
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f270004b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        q0 q0Var = (q0) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        if (q0Var != null) {
            encoder.encodeString(q0Var.getLabel());
        }
    }
}
