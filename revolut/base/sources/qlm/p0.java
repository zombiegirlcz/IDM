package qlm;

import ch.qos.logback.core.CoreConstants;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonElement;

/* JADX INFO: loaded from: classes14.dex */
public abstract class p0 implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f247689a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f247690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f247691c;

    public p0(KSerializer kSerializer, KSerializer kSerializer2) {
        this.f247690b = kSerializer;
        this.f247691c = kSerializer2;
    }

    public abstract Object a(Object obj2);

    public abstract Object b(Object obj2);

    public abstract mlm.b c(JsonElement jsonElement);

    public abstract Object d(Object obj2, Object obj3);

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        switch (this.f247689a) {
            case 0:
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                SerialDescriptor descriptor = getDescriptor();
                plm.d dVarBeginStructure = decoder.beginStructure(descriptor);
                dVarBeginStructure.getClass();
                Object obj2 = j1.f247667b;
                Object objDecodeSerializableElement = obj2;
                Object objDecodeSerializableElement2 = objDecodeSerializableElement;
                while (true) {
                    int iD = dVarBeginStructure.d(getDescriptor());
                    if (iD == -1) {
                        if (objDecodeSerializableElement == obj2) {
                            throw new SerializationException("Element 'key' is missing");
                        }
                        if (objDecodeSerializableElement2 == obj2) {
                            throw new SerializationException("Element 'value' is missing");
                        }
                        Object objD = d(objDecodeSerializableElement, objDecodeSerializableElement2);
                        dVarBeginStructure.endStructure(descriptor);
                        return objD;
                    }
                    if (iD == 0) {
                        objDecodeSerializableElement = dVarBeginStructure.decodeSerializableElement(getDescriptor(), 0, (KSerializer) this.f247690b, null);
                    } else {
                        if (iD != 1) {
                            throw new SerializationException(a0.d.n("Invalid index: ", iD));
                        }
                        objDecodeSerializableElement2 = dVarBeginStructure.decodeSerializableElement(getDescriptor(), 1, (KSerializer) this.f247691c, null);
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                rlm.i iVarB = i26.l.b(decoder);
                JsonElement jsonElementC = iVarB.c();
                mlm.b bVarC = c(jsonElementC);
                Intrinsics.i(bVarC, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.json.JsonContentPolymorphicSerializer>");
                return iVarB.a().a((KSerializer) bVarC, jsonElementC);
        }
    }

    @Override // mlm.h, mlm.b
    public SerialDescriptor getDescriptor() {
        return (olm.g) this.f247691c;
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object value) {
        switch (this.f247689a) {
            case 0:
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(getDescriptor());
                compositeEncoderBeginStructure.encodeSerializableElement(getDescriptor(), 0, (KSerializer) this.f247690b, a(value));
                compositeEncoderBeginStructure.encodeSerializableElement(getDescriptor(), 1, (KSerializer) this.f247691c, b(value));
                compositeEncoderBeginStructure.endStructure(getDescriptor());
                return;
            default:
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                tlm.e serializersModule = encoder.getSerializersModule();
                KClass kClass = (KClass) this.f247690b;
                KSerializer kSerializerC = serializersModule.c(kClass, value);
                if (kSerializerC == null) {
                    Class<?> cls = value.getClass();
                    kotlin.jvm.internal.p0 p0Var = kotlin.jvm.internal.o0.f186429a;
                    KSerializer kSerializerW = jh.d.w(p0Var.b(cls));
                    if (kSerializerW == null) {
                        KClass kClassB = p0Var.b(value.getClass());
                        String strM = kClassB.m();
                        if (strM == null) {
                            strM = String.valueOf(kClassB);
                        }
                        throw new SerializationException(j6.a.s("Class '", strM, "' is not registered for polymorphic serialization ", "in the scope of '" + kClass.m() + CoreConstants.SINGLE_QUOTE_CHAR, ".\nMark the base class as 'sealed' or register the serializer explicitly."));
                    }
                    kSerializerC = kSerializerW;
                }
                ((KSerializer) kSerializerC).serialize(encoder, value);
                return;
        }
    }

    public p0(KClass baseClass) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        this.f247690b = baseClass;
        this.f247691c = com.bumptech.glide.c.e("JsonContentPolymorphicSerializer<" + baseClass.m() + '>', olm.c.f226469c, new SerialDescriptor[0], new okk.d(13));
    }
}
