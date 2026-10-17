package qlm;

import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public abstract class t extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f247705a;

    public t(KSerializer kSerializer) {
        this.f247705a = kSerializer;
    }

    @Override // qlm.a
    public void f(plm.d decoder, int i, Object obj2) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.f247705a;
        plm.c cVar = plm.d.Companion;
        i(i, obj2, decoder.decodeSerializableElement(descriptor, i, kSerializer, null));
    }

    public abstract void i(int i, Object obj2, Object obj3);

    @Override // mlm.h
    public void serialize(Encoder encoder, Object obj2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int iD = d(obj2);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderC = encoder.c(descriptor);
        Iterator itC = c(obj2);
        for (int i = 0; i < iD; i++) {
            compositeEncoderC.encodeSerializableElement(getDescriptor(), i, this.f247705a, itC.next());
        }
        compositeEncoderC.endStructure(descriptor);
    }
}
