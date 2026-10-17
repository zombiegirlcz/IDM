package kotlinx.serialization.encoding;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import mlm.h;

/* JADX INFO: loaded from: classes14.dex */
public interface CompositeEncoder {
    default boolean d(SerialDescriptor descriptor) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return true;
    }

    void encodeBooleanElement(SerialDescriptor serialDescriptor, int i, boolean z);

    void encodeByteElement(SerialDescriptor serialDescriptor, int i, byte b4);

    void encodeCharElement(SerialDescriptor serialDescriptor, int i, char c2);

    void encodeDoubleElement(SerialDescriptor serialDescriptor, int i, double d);

    void encodeFloatElement(SerialDescriptor serialDescriptor, int i, float f);

    Encoder encodeInlineElement(SerialDescriptor serialDescriptor, int i);

    void encodeIntElement(SerialDescriptor serialDescriptor, int i, int i2);

    void encodeLongElement(SerialDescriptor serialDescriptor, int i, long j2);

    void encodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i, h hVar, Object obj2);

    void encodeSerializableElement(SerialDescriptor serialDescriptor, int i, h hVar, Object obj2);

    void encodeShortElement(SerialDescriptor serialDescriptor, int i, short s2);

    void encodeStringElement(SerialDescriptor serialDescriptor, int i, String str);

    void endStructure(SerialDescriptor serialDescriptor);
}
