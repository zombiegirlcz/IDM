package qlm;

import java.util.Arrays;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;

/* JADX INFO: loaded from: classes14.dex */
public final class b0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Enum[] f247614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public EnumDescriptor f247615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Lazy f247616c;

    public b0(String serialName, Enum[] values) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values, "values");
        this.f247614a = values;
        this.f247616c = yhm.j.b(new qba.b(this, serialName, 14));
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int iDecodeEnum = decoder.decodeEnum(getDescriptor());
        Enum[] enumArr = this.f247614a;
        if (iDecodeEnum >= 0 && iDecodeEnum < enumArr.length) {
            return enumArr[iDecodeEnum];
        }
        throw new SerializationException(iDecodeEnum + " is not among valid " + getDescriptor().e() + " enum values, values size is " + enumArr.length);
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f247616c.getValue();
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Enum value = (Enum) obj2;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        Enum[] enumArr = this.f247614a;
        int iY = kotlin.collections.d.Y(enumArr, value);
        if (iY != -1) {
            encoder.encodeEnum(getDescriptor(), iY);
            return;
        }
        StringBuilder sb6 = new StringBuilder();
        sb6.append(value);
        sb6.append(" is not a valid enum ");
        sb6.append(getDescriptor().e());
        sb6.append(", must be one of ");
        String string = Arrays.toString(enumArr);
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        sb6.append(string);
        throw new SerializationException(sb6.toString());
    }

    public final String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().e() + '>';
    }
}
