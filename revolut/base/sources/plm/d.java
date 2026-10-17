package plm;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import org.jetbrains.annotations.NotNull;
import tlm.e;

/* JADX INFO: loaded from: classes13.dex */
public interface d {

    @NotNull
    public static final c Companion = c.f237441a;

    int d(SerialDescriptor serialDescriptor);

    boolean decodeBooleanElement(SerialDescriptor serialDescriptor, int i);

    byte decodeByteElement(SerialDescriptor serialDescriptor, int i);

    char decodeCharElement(SerialDescriptor serialDescriptor, int i);

    double decodeDoubleElement(SerialDescriptor serialDescriptor, int i);

    float decodeFloatElement(SerialDescriptor serialDescriptor, int i);

    Decoder decodeInlineElement(SerialDescriptor serialDescriptor, int i);

    int decodeIntElement(SerialDescriptor serialDescriptor, int i);

    long decodeLongElement(SerialDescriptor serialDescriptor, int i);

    Object decodeNullableSerializableElement(SerialDescriptor serialDescriptor, int i, mlm.b bVar, Object obj2);

    Object decodeSerializableElement(SerialDescriptor serialDescriptor, int i, mlm.b bVar, Object obj2);

    short decodeShortElement(SerialDescriptor serialDescriptor, int i);

    String decodeStringElement(SerialDescriptor serialDescriptor, int i);

    void endStructure(SerialDescriptor serialDescriptor);

    e getSerializersModule();
}
