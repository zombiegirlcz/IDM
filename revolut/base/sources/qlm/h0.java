package qlm;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

/* JADX INFO: loaded from: classes14.dex */
public final class h0 extends a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KSerializer f247650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final KSerializer f247651b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f247652c;
    public final g0 d;

    public h0(KSerializer kSerializer, KSerializer kSerializer2, byte b4) {
        this.f247650a = kSerializer;
        this.f247651b = kSerializer2;
    }

    @Override // qlm.a
    public final Object a() {
        switch (this.f247652c) {
            case 0:
                return new HashMap();
            default:
                return new LinkedHashMap();
        }
    }

    @Override // qlm.a
    public final int b(Object obj2) {
        int size;
        switch (this.f247652c) {
            case 0:
                HashMap map = (HashMap) obj2;
                Intrinsics.checkNotNullParameter(map, "<this>");
                size = map.size();
                break;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                size = linkedHashMap.size();
                break;
        }
        return size * 2;
    }

    @Override // qlm.a
    public final Iterator c(Object obj2) {
        switch (this.f247652c) {
            case 0:
                Map map = (Map) obj2;
                Intrinsics.checkNotNullParameter(map, "<this>");
                return map.entrySet().iterator();
            default:
                Map map2 = (Map) obj2;
                Intrinsics.checkNotNullParameter(map2, "<this>");
                return map2.entrySet().iterator();
        }
    }

    @Override // qlm.a
    public final int d(Object obj2) {
        switch (this.f247652c) {
            case 0:
                Map map = (Map) obj2;
                Intrinsics.checkNotNullParameter(map, "<this>");
                return map.size();
            default:
                Map map2 = (Map) obj2;
                Intrinsics.checkNotNullParameter(map2, "<this>");
                return map2.size();
        }
    }

    @Override // qlm.a
    public final void f(plm.d decoder, int i, Object obj2) {
        Map builder = (Map) obj2;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        SerialDescriptor descriptor = getDescriptor();
        KSerializer kSerializer = this.f247650a;
        plm.c cVar = plm.d.Companion;
        Object objDecodeSerializableElement = decoder.decodeSerializableElement(descriptor, i, kSerializer, null);
        int iD = decoder.d(getDescriptor());
        if (iD != i + 1) {
            throw new IllegalArgumentException(a0.d.g(i, iD, "Value must follow key in a map, index for key: ", ", returned index for value: ").toString());
        }
        boolean zContainsKey = builder.containsKey(objDecodeSerializableElement);
        KSerializer kSerializer2 = this.f247651b;
        builder.put(objDecodeSerializableElement, (!zContainsKey || (kSerializer2.getDescriptor().getKind() instanceof olm.f)) ? decoder.decodeSerializableElement(getDescriptor(), iD, kSerializer2, null) : decoder.decodeSerializableElement(getDescriptor(), iD, kSerializer2, zhm.r0.h(objDecodeSerializableElement, builder)));
    }

    @Override // qlm.a
    public final Object g(Object obj2) {
        switch (this.f247652c) {
            case 0:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new HashMap((Map) null);
            default:
                Intrinsics.checkNotNullParameter(null, "<this>");
                return new LinkedHashMap((Map) null);
        }
    }

    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        switch (this.f247652c) {
        }
        return this.d;
    }

    @Override // qlm.a
    public final Object h(Object obj2) {
        switch (this.f247652c) {
            case 0:
                HashMap map = (HashMap) obj2;
                Intrinsics.checkNotNullParameter(map, "<this>");
                return map;
            default:
                LinkedHashMap linkedHashMap = (LinkedHashMap) obj2;
                Intrinsics.checkNotNullParameter(linkedHashMap, "<this>");
                return linkedHashMap;
        }
    }

    @Override // mlm.h
    public final void serialize(Encoder encoder, Object obj2) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        d(obj2);
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder compositeEncoderC = encoder.c(descriptor);
        Iterator itC = c(obj2);
        int i = 0;
        while (itC.hasNext()) {
            Map.Entry entry = (Map.Entry) itC.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            compositeEncoderC.encodeSerializableElement(getDescriptor(), i, this.f247650a, key);
            i += 2;
            compositeEncoderC.encodeSerializableElement(getDescriptor(), i2, this.f247651b, value);
        }
        compositeEncoderC.endStructure(descriptor);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public h0(KSerializer kSerializer, KSerializer vSerializer, int i) {
        this(kSerializer, vSerializer, (byte) 0);
        this.f247652c = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
                Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
                this(kSerializer, vSerializer, (byte) 0);
                SerialDescriptor keyDesc = kSerializer.getDescriptor();
                SerialDescriptor valueDesc = vSerializer.getDescriptor();
                Intrinsics.checkNotNullParameter(keyDesc, "keyDesc");
                Intrinsics.checkNotNullParameter(valueDesc, "valueDesc");
                this.d = new g0("kotlin.collections.LinkedHashMap", keyDesc, valueDesc);
                break;
            default:
                Intrinsics.checkNotNullParameter(kSerializer, "kSerializer");
                Intrinsics.checkNotNullParameter(vSerializer, "vSerializer");
                SerialDescriptor keyDesc2 = kSerializer.getDescriptor();
                SerialDescriptor valueDesc2 = vSerializer.getDescriptor();
                Intrinsics.checkNotNullParameter(keyDesc2, "keyDesc");
                Intrinsics.checkNotNullParameter(valueDesc2, "valueDesc");
                this.d = new g0("kotlin.collections.HashMap", keyDesc2, valueDesc2);
                break;
        }
    }
}
