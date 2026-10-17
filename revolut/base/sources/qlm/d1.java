package qlm;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public final class d1 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f247629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f247630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f247631c;

    public d1(String serialName, Object objectInstance) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        this.f247629a = objectInstance;
        this.f247630b = zhm.f0.f322471a;
        this.f247631c = yhm.j.c(yhm.k.PUBLICATION, new bmm.t(serialName, this, 12));
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor);
        dVarBeginStructure.getClass();
        int iD = dVarBeginStructure.d(getDescriptor());
        if (iD != -1) {
            throw new SerializationException(a0.d.n("Unexpected index ", iD));
        }
        Unit unit = Unit.f186387a;
        dVarBeginStructure.endStructure(descriptor);
        return this.f247629a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f247631c.getValue();
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.beginStructure(getDescriptor()).endStructure(getDescriptor());
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d1(String serialName, Object objectInstance, Annotation[] classAnnotations) {
        this(serialName, objectInstance);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(objectInstance, "objectInstance");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        this.f247630b = zhm.p.c(classAnnotations);
    }
}
