package mlm;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public interface h {
    SerialDescriptor getDescriptor();

    void serialize(Encoder encoder, Object obj2);
}
