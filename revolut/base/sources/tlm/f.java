package tlm;

import ch.qos.logback.core.CoreConstants;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import qlm.g1;
import zhm.t0;

/* JADX INFO: loaded from: classes13.dex */
public final class f implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f272130a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f272131b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f272132c = new HashMap();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public boolean f;

    public static void g(f fVar, KClass baseClass, KClass concreteClass, KSerializer concreteSerializer) {
        Object next;
        KClass kClass;
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(concreteClass, "concreteClass");
        Intrinsics.checkNotNullParameter(concreteSerializer, "concreteSerializer");
        String strE = concreteSerializer.getDescriptor().e();
        HashMap map = fVar.f272131b;
        Object map2 = map.get(baseClass);
        if (map2 == null) {
            map2 = new HashMap();
            map.put(baseClass, map2);
        }
        Map map3 = (Map) map2;
        HashMap map4 = fVar.d;
        Object map5 = map4.get(baseClass);
        if (map5 == null) {
            map5 = new HashMap();
            map4.put(baseClass, map5);
        }
        Map map6 = (Map) map5;
        KSerializer kSerializer = (KSerializer) map3.get(concreteClass);
        if (kSerializer != null && !kSerializer.equals(concreteSerializer)) {
            throw new m70.b(baseClass, concreteClass);
        }
        KSerializer kSerializer2 = (KSerializer) map6.get(strE);
        if (kSerializer2 == null || kSerializer2.equals(concreteSerializer)) {
            map3.put(concreteClass, concreteSerializer);
            map6.put(strE, concreteSerializer);
            return;
        }
        Iterator it8 = ((Iterable) t0.B(map3).f195577b).iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (((Map.Entry) next).getValue() == kSerializer2) {
                    break;
                }
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null || (kClass = (KClass) entry.getKey()) == null) {
            throw new IllegalStateException(a10.b.s("Name ", strE, " is registered in the module but no Kotlin class is associated with it."));
        }
        throw new IllegalArgumentException("Multiple polymorphic serializers in a scope of '" + baseClass + "' have the same serial name '" + strE + "': " + concreteSerializer + " for '" + concreteClass + "' and " + kSerializer2 + " for '" + kClass + CoreConstants.SINGLE_QUOTE_CHAR);
    }

    public static void j(f fVar, KClass forClass, c provider) {
        HashMap map = fVar.f272130a;
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        c cVar = (c) map.get(forClass);
        if (cVar != null && !cVar.equals(provider)) {
            throw new m70.b("Contextual serializer or serializer provider for " + forClass + " already registered in this module");
        }
        map.put(forClass, provider);
        if (g1.c(forClass)) {
            fVar.f = true;
        }
    }

    public final d a() {
        return new d(this.f272130a, this.f272131b, this.f272132c, this.d, this.e, this.f);
    }

    @Override // tlm.g
    public final void b(KClass baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        e(baseClass, defaultDeserializerProvider);
    }

    @Override // tlm.g
    public final void c(KClass baseClass, Function1 defaultSerializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultSerializerProvider, "defaultSerializerProvider");
        HashMap map = this.f272132c;
        Function1 function1 = (Function1) map.get(baseClass);
        if (function1 == null || function1.equals(defaultSerializerProvider)) {
            map.put(baseClass, defaultSerializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default serializers provider for " + baseClass + " is already registered: " + function1);
    }

    @Override // tlm.g
    public final void d(KClass baseClass, KClass actualClass, KSerializer actualSerializer) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(actualClass, "actualClass");
        Intrinsics.checkNotNullParameter(actualSerializer, "actualSerializer");
        g(this, baseClass, actualClass, actualSerializer);
    }

    public final void e(KClass baseClass, Function1 defaultDeserializerProvider) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(defaultDeserializerProvider, "defaultDeserializerProvider");
        HashMap map = this.e;
        Function1 function1 = (Function1) map.get(baseClass);
        if (function1 == null || function1.equals(defaultDeserializerProvider)) {
            map.put(baseClass, defaultDeserializerProvider);
            return;
        }
        throw new IllegalArgumentException("Default deserializers provider for " + baseClass + " is already registered: " + function1);
    }

    @Override // tlm.g
    public final void f(KClass kClass, KSerializer serializer) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        j(this, kClass, new a(serializer));
    }

    @Override // tlm.g
    public final void i(KClass kClass, Function1 provider) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(provider, "provider");
        j(this, kClass, new b(provider));
    }
}
