package qlm;

import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes13.dex */
public abstract class b implements KSerializer {
    public mlm.b a(plm.d decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        tlm.e serializersModule = decoder.getSerializersModule();
        KClass baseClass = c();
        tlm.d dVar = (tlm.d) serializersModule;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Map map = (Map) dVar.d.get(baseClass);
        KSerializer kSerializer = map != null ? (KSerializer) map.get(str) : null;
        if (!(kSerializer instanceof KSerializer)) {
            kSerializer = null;
        }
        if (kSerializer != null) {
            return kSerializer;
        }
        Object obj2 = dVar.e.get(baseClass);
        Function1 function1 = kotlin.jvm.internal.u0.g(1, obj2) ? (Function1) obj2 : null;
        if (function1 != null) {
            return (mlm.b) function1.invoke(str);
        }
        return null;
    }

    public mlm.h b(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.getSerializersModule().c(c(), value);
    }

    public abstract KClass c();

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor = getDescriptor();
        plm.d dVarBeginStructure = decoder.beginStructure(descriptor);
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        dVarBeginStructure.getClass();
        Object objDecodeSerializableElement = null;
        while (true) {
            int iD = dVarBeginStructure.d(getDescriptor());
            if (iD == -1) {
                if (objDecodeSerializableElement != null) {
                    dVarBeginStructure.endStructure(descriptor);
                    return objDecodeSerializableElement;
                }
                throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) ref$ObjectRef.f186409a)).toString());
            }
            if (iD == 0) {
                ref$ObjectRef.f186409a = dVarBeginStructure.decodeStringElement(getDescriptor(), iD);
            } else {
                if (iD != 1) {
                    StringBuilder sb6 = new StringBuilder("Invalid index in polymorphic deserialization of ");
                    String str = (String) ref$ObjectRef.f186409a;
                    if (str == null) {
                        str = "unknown class";
                    }
                    sb6.append(str);
                    sb6.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                    sb6.append(iD);
                    throw new SerializationException(sb6.toString());
                }
                Object obj2 = ref$ObjectRef.f186409a;
                if (obj2 == null) {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
                ref$ObjectRef.f186409a = obj2;
                objDecodeSerializableElement = dVarBeginStructure.decodeSerializableElement(getDescriptor(), iD, com.bumptech.glide.d.f(this, dVarBeginStructure, (String) obj2), null);
            }
        }
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        mlm.h hVarG = com.bumptech.glide.d.g(this, encoder, value);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(descriptor);
        compositeEncoderBeginStructure.encodeStringElement(getDescriptor(), 0, hVarG.getDescriptor().e());
        compositeEncoderBeginStructure.encodeSerializableElement(getDescriptor(), 1, hVarG, value);
        compositeEncoderBeginStructure.endStructure(descriptor);
    }
}
