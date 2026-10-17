package mlm;

import ch.qos.logback.core.CoreConstants;
import java.lang.annotation.Annotation;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import yhm.k;
import zhm.f0;
import zhm.p;
import zhm.q0;
import zhm.r0;

/* JADX INFO: loaded from: classes14.dex */
public final class f extends qlm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final KClass f207094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f207095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f207096c;
    public final Map d;
    public final LinkedHashMap e;

    public f(String serialName, KClass baseClass, KClass[] subclasses, KSerializer[] subclassSerializers, Annotation[] classAnnotations) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        Intrinsics.checkNotNullParameter(classAnnotations, "classAnnotations");
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(subclasses, "subclasses");
        Intrinsics.checkNotNullParameter(subclassSerializers, "subclassSerializers");
        this.f207094a = baseClass;
        this.f207095b = f0.f322471a;
        this.f207096c = yhm.j.c(k.PUBLICATION, new mhd.b(serialName, this, 5));
        if (subclasses.length != subclassSerializers.length) {
            throw new IllegalArgumentException("All subclasses of sealed class " + baseClass.m() + " should be marked @Serializable");
        }
        Map mapT = r0.t(kotlin.collections.d.A0(subclasses, subclassSerializers));
        this.d = mapT;
        Set<Map.Entry> setEntrySet = mapT.entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : setEntrySet) {
            String strE = ((KSerializer) entry.getValue()).getDescriptor().e();
            Object obj2 = linkedHashMap.get(strE);
            if (obj2 == null) {
                linkedHashMap.containsKey(strE);
            }
            Map.Entry entry2 = (Map.Entry) obj2;
            if (entry2 != null) {
                throw new IllegalStateException(("Multiple sealed subclasses of '" + this.f207094a + "' have the same serial name '" + strE + "': '" + entry2.getKey() + "', '" + entry.getKey() + CoreConstants.SINGLE_QUOTE_CHAR).toString());
            }
            linkedHashMap.put(strE, entry);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(q0.b(linkedHashMap.size()));
        for (Map.Entry entry3 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry3.getKey(), (KSerializer) ((Map.Entry) entry3.getValue()).getValue());
        }
        this.e = linkedHashMap2;
        this.f207095b = p.c(classAnnotations);
    }

    @Override // qlm.b
    public final b a(plm.d decoder, String str) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        KSerializer kSerializer = (KSerializer) this.e.get(str);
        return kSerializer != null ? kSerializer : super.a(decoder, str);
    }

    @Override // qlm.b
    public final h b(Encoder encoder, Object value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        KSerializer kSerializer = (KSerializer) this.d.get(o0.f186429a.b(value.getClass()));
        KSerializer kSerializerB = kSerializer != null ? kSerializer : super.b(encoder, value);
        if (kSerializerB != null) {
            return kSerializerB;
        }
        return null;
    }

    @Override // qlm.b
    public final KClass c() {
        return this.f207094a;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // mlm.h, mlm.b
    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.f207096c.getValue();
    }
}
