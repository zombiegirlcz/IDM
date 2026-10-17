package ie0;

import java.time.DateTimeException;
import java.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.z;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.internal.JsonDecodingException;
import qlm.j0;
import qlm.n1;

/* JADX INFO: loaded from: classes19.dex */
public final class j implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final j f160602a = new j();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n1 f160603b = com.bumptech.glide.c.a("Instant", olm.e.f226473h);

    private j() {
    }

    public static Instant a(long j2) {
        try {
            Instant instantOfEpochMilli = Instant.ofEpochMilli(j2);
            Intrinsics.h(instantOfEpochMilli);
            return instantOfEpochMilli;
        } catch (DateTimeException e) {
            throw new SerializationException(p.a.m(j2, "Invalid epoch millis: "), e);
        }
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Long lValueOf = null;
        rlm.i iVar = decoder instanceof rlm.i ? (rlm.i) decoder : null;
        if (iVar == null) {
            throw new SerializationException("InstantSerializer supports only JSON");
        }
        JsonElement jsonElementC = iVar.c();
        kotlinx.serialization.json.b bVar = jsonElementC instanceof kotlinx.serialization.json.b ? (kotlinx.serialization.json.b) jsonElementC : null;
        if (bVar == null) {
            throw new SerializationException("Expected JsonPrimitive for Instant but got: '" + jsonElementC + "'");
        }
        if (bVar.b()) {
            String strA = ((kotlinx.serialization.json.b) jsonElementC).a();
            Long lN = z.n(strA);
            if (lN != null) {
                return a(lN.longValue());
            }
            try {
                Instant instant = Instant.parse(strA);
                Intrinsics.h(instant);
                return instant;
            } catch (DateTimeException e) {
                throw new SerializationException(p.a.p("Invalid ISO format: '", strA, "'"), e);
            }
        }
        j0 j0Var = rlm.j.f255110a;
        Intrinsics.checkNotNullParameter(bVar, "<this>");
        try {
            lValueOf = Long.valueOf(rlm.j.m(bVar));
        } catch (JsonDecodingException unused) {
        }
        if (lValueOf == null) {
            throw new SerializationException("Cannot parse Instant from JsonPrimitive: '" + bVar + "'");
        }
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) jsonElementC;
        Intrinsics.checkNotNullParameter(bVar2, "<this>");
        try {
            return a(rlm.j.m(bVar2));
        } catch (JsonDecodingException e2) {
            throw new NumberFormatException(e2.getMessage());
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return f160603b;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Instant value = (Instant) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.encodeLong(value.toEpochMilli());
    }
}
