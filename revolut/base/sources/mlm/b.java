package mlm;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;

/* JADX INFO: loaded from: classes13.dex */
public interface b {
    Object deserialize(Decoder decoder);

    SerialDescriptor getDescriptor();
}
