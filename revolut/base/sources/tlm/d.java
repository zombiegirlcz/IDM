package tlm;

import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes13.dex */
public final class d extends e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f272127a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f272128b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f272129c;
    public final Map d;
    public final Map e;
    public final boolean f;

    public d(Map class2ContextualFactory, Map polyBase2Serializers, Map polyBase2DefaultSerializerProvider, Map polyBase2NamedSerializers, Map polyBase2DefaultDeserializerProvider, boolean z) {
        Intrinsics.checkNotNullParameter(class2ContextualFactory, "class2ContextualFactory");
        Intrinsics.checkNotNullParameter(polyBase2Serializers, "polyBase2Serializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultSerializerProvider, "polyBase2DefaultSerializerProvider");
        Intrinsics.checkNotNullParameter(polyBase2NamedSerializers, "polyBase2NamedSerializers");
        Intrinsics.checkNotNullParameter(polyBase2DefaultDeserializerProvider, "polyBase2DefaultDeserializerProvider");
        this.f272127a = class2ContextualFactory;
        this.f272128b = polyBase2Serializers;
        this.f272129c = polyBase2DefaultSerializerProvider;
        this.d = polyBase2NamedSerializers;
        this.e = polyBase2DefaultDeserializerProvider;
        this.f = z;
    }

    @Override // tlm.e
    public final void a(g collector) {
        Intrinsics.checkNotNullParameter(collector, "collector");
        for (Map.Entry entry : this.f272127a.entrySet()) {
            KClass kClass = (KClass) entry.getKey();
            c cVar = (c) entry.getValue();
            if (cVar instanceof a) {
                Intrinsics.i(kClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer kSerializerB = ((a) cVar).b();
                Intrinsics.i(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
                collector.f(kClass, kSerializerB);
            } else {
                if (!(cVar instanceof b)) {
                    throw new NoWhenBranchMatchedException();
                }
                collector.i(kClass, ((b) cVar).b());
            }
        }
        for (Map.Entry entry2 : this.f272128b.entrySet()) {
            KClass kClass2 = (KClass) entry2.getKey();
            for (Map.Entry entry3 : ((Map) entry2.getValue()).entrySet()) {
                KClass kClass3 = (KClass) entry3.getKey();
                KSerializer kSerializer = (KSerializer) entry3.getValue();
                Intrinsics.i(kClass2, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.i(kClass3, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                Intrinsics.i(kSerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
                collector.d(kClass2, kClass3, kSerializer);
            }
        }
        for (Map.Entry entry4 : this.f272129c.entrySet()) {
            KClass kClass4 = (KClass) entry4.getKey();
            Function1 function1 = (Function1) entry4.getValue();
            Intrinsics.i(kClass4, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.i(function1, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"value\")] kotlin.Any, kotlinx.serialization.SerializationStrategy<kotlin.Any>?>");
            u0.f(1, function1);
            collector.c(kClass4, function1);
        }
        for (Map.Entry entry5 : this.e.entrySet()) {
            KClass kClass5 = (KClass) entry5.getKey();
            Function1 function12 = (Function1) entry5.getValue();
            Intrinsics.i(kClass5, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
            Intrinsics.i(function12, "null cannot be cast to non-null type kotlin.Function1<@[ParameterName(name = \"className\")] kotlin.String?, kotlinx.serialization.DeserializationStrategy<kotlin.Any>?>");
            u0.f(1, function12);
            collector.b(kClass5, function12);
        }
    }

    @Override // tlm.e
    public final KSerializer b(KClass kClass, List typeArgumentsSerializers) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        c cVar = (c) this.f272127a.get(kClass);
        KSerializer kSerializerA = cVar != null ? cVar.a(typeArgumentsSerializers) : null;
        if (kSerializerA instanceof KSerializer) {
            return kSerializerA;
        }
        return null;
    }

    @Override // tlm.e
    public final mlm.h c(KClass baseClass, Object value) {
        Intrinsics.checkNotNullParameter(baseClass, "baseClass");
        Intrinsics.checkNotNullParameter(value, "value");
        if (baseClass.l(value)) {
            Map map = (Map) this.f272128b.get(baseClass);
            KSerializer kSerializer = map != null ? (KSerializer) map.get(o0.f186429a.b(value.getClass())) : null;
            KSerializer kSerializer2 = kSerializer instanceof mlm.h ? kSerializer : null;
            if (kSerializer2 != null) {
                return kSerializer2;
            }
            Object obj2 = this.f272129c.get(baseClass);
            Function1 function1 = u0.g(1, obj2) ? (Function1) obj2 : null;
            if (function1 != null) {
                return (mlm.h) function1.invoke(value);
            }
        }
        return null;
    }
}
