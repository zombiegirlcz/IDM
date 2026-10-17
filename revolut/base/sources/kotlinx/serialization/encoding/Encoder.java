package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mlm.h;
import tlm.e;

/* JADX INFO: loaded from: classes14.dex */
public interface Encoder {
    CompositeEncoder beginStructure(SerialDescriptor serialDescriptor);

    default CompositeEncoder c(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return beginStructure(descriptor);
    }

    default void e(h serializer, Object obj2) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (serializer.getDescriptor().f()) {
            encodeSerializableValue(serializer, obj2);
        } else if (obj2 == null) {
            encodeNull();
        } else {
            encodeSerializableValue(serializer, obj2);
        }
    }

    void encodeBoolean(boolean z);

    void encodeByte(byte b4);

    void encodeChar(char c2);

    void encodeDouble(double d);

    void encodeEnum(SerialDescriptor serialDescriptor, int i);

    void encodeFloat(float f);

    Encoder encodeInline(SerialDescriptor serialDescriptor);

    void encodeInt(int i);

    void encodeLong(long j2);

    void encodeNull();

    default void encodeSerializableValue(h serializer, Object obj2) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        serializer.serialize(this, obj2);
    }

    void encodeShort(short s2);

    void encodeString(String str);

    e getSerializersModule();
}
