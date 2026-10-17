package mlm;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import ml3.y;
import qgf.o;
import qlm.h1;
import qlm.j1;
import yhm.r;
import zhm.p;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements KSerializer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207086a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KSerializer f207087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f207088c;
    public final Object d;
    public final SerialDescriptor e;

    public a(KClass context, KSerializer kSerializer, KSerializer[] typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(context, "serializableClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        this.f207088c = context;
        this.f207087b = kSerializer;
        this.d = p.c(typeArgumentsSerializers);
        y yVar = new y(this, 6);
        olm.g gVarE = com.bumptech.glide.c.e("kotlinx.serialization.ContextualSerializer", olm.i.f226485b, new SerialDescriptor[0], yVar);
        Intrinsics.checkNotNullParameter(gVarE, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        this.e = new olm.b(gVarE, context);
    }

    @Override // mlm.b
    public final Object deserialize(Decoder decoder) {
        switch (this.f207086a) {
            case 0:
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                tlm.e serializersModule = decoder.getSerializersModule();
                KClass kClass = (KClass) this.f207088c;
                KSerializer kSerializerB = serializersModule.b(kClass, (List) this.d);
                if (kSerializerB != null || (kSerializerB = this.f207087b) != null) {
                    return decoder.b(kSerializerB);
                }
                Intrinsics.checkNotNullParameter(kClass, "<this>");
                throw new SerializationException(h1.e(kClass));
            default:
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                olm.g gVar = (olm.g) this.e;
                plm.d dVarBeginStructure = decoder.beginStructure(gVar);
                dVarBeginStructure.getClass();
                Object obj2 = j1.f247667b;
                Object objDecodeSerializableElement = obj2;
                Object objDecodeSerializableElement2 = objDecodeSerializableElement;
                Object objDecodeSerializableElement3 = objDecodeSerializableElement2;
                while (true) {
                    int iD = dVarBeginStructure.d(gVar);
                    if (iD == -1) {
                        dVarBeginStructure.endStructure(gVar);
                        if (objDecodeSerializableElement == obj2) {
                            throw new SerializationException("Element 'first' is missing");
                        }
                        if (objDecodeSerializableElement2 == obj2) {
                            throw new SerializationException("Element 'second' is missing");
                        }
                        if (objDecodeSerializableElement3 != obj2) {
                            return new r(objDecodeSerializableElement, objDecodeSerializableElement2, objDecodeSerializableElement3);
                        }
                        throw new SerializationException("Element 'third' is missing");
                    }
                    if (iD == 0) {
                        objDecodeSerializableElement = dVarBeginStructure.decodeSerializableElement(gVar, 0, this.f207087b, null);
                    } else if (iD == 1) {
                        objDecodeSerializableElement2 = dVarBeginStructure.decodeSerializableElement(gVar, 1, (KSerializer) this.f207088c, null);
                    } else {
                        if (iD != 2) {
                            throw new SerializationException(a0.d.n("Unexpected index ", iD));
                        }
                        objDecodeSerializableElement3 = dVarBeginStructure.decodeSerializableElement(gVar, 2, (KSerializer) this.d, null);
                    }
                }
                break;
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        switch (this.f207086a) {
            case 0:
                return (olm.b) this.e;
            default:
                return (olm.g) this.e;
        }
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object value) {
        switch (this.f207086a) {
            case 0:
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                tlm.e serializersModule = encoder.getSerializersModule();
                KClass kClass = (KClass) this.f207088c;
                KSerializer kSerializerB = serializersModule.b(kClass, (List) this.d);
                if (kSerializerB == null && (kSerializerB = this.f207087b) == null) {
                    Intrinsics.checkNotNullParameter(kClass, "<this>");
                    throw new SerializationException(h1.e(kClass));
                }
                encoder.encodeSerializableValue(kSerializerB, value);
                return;
            default:
                r value2 = (r) value;
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value2, "value");
                olm.g gVar = (olm.g) this.e;
                CompositeEncoder compositeEncoderBeginStructure = encoder.beginStructure(gVar);
                compositeEncoderBeginStructure.encodeSerializableElement(gVar, 0, this.f207087b, value2.f314201a);
                compositeEncoderBeginStructure.encodeSerializableElement(gVar, 1, (KSerializer) this.f207088c, value2.f314202b);
                compositeEncoderBeginStructure.encodeSerializableElement(gVar, 2, (KSerializer) this.d, value2.f314203c);
                compositeEncoderBeginStructure.endStructure(gVar);
                return;
        }
    }

    public a(KSerializer aSerializer, KSerializer bSerializer, KSerializer cSerializer) {
        Intrinsics.checkNotNullParameter(aSerializer, "aSerializer");
        Intrinsics.checkNotNullParameter(bSerializer, "bSerializer");
        Intrinsics.checkNotNullParameter(cSerializer, "cSerializer");
        this.f207087b = aSerializer;
        this.f207088c = bSerializer;
        this.d = cSerializer;
        this.e = com.bumptech.glide.c.d("kotlin.Triple", new SerialDescriptor[0], new o(this, 12));
    }
}
