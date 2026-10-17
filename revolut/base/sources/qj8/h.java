package qj8;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.o0;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.coroutines.CoroutineScope;
import wim.z;
import yhm.o;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class h extends gim.i implements Function2 {
    public final /* synthetic */ com.revolut.feature.junior_profile.api.models.a A;
    public final /* synthetic */ int u;
    public hlm.a v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f246782w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ hlm.a f246783x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ j f246784y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(hlm.a aVar, Continuation continuation, j jVar, String str, com.revolut.feature.junior_profile.api.models.a aVar2, int i) {
        super(2, continuation);
        this.u = i;
        this.f246783x = aVar;
        this.f246784y = jVar;
        this.z = str;
        this.A = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new h(this.f246783x, continuation, this.f246784y, this.z, this.A, 0);
            default:
                return new h(this.f246783x, continuation, this.f246784y, this.z, this.A, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object objC;
        Object objC2;
        int i = this.u;
        hlm.a aVar = this.f246783x;
        j jVar = this.f246784y;
        com.revolut.feature.junior_profile.api.models.a aVar2 = this.A;
        String str = this.z;
        switch (i) {
            case 0:
                ue0.c cVar = jVar.f246790c;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.f246782w;
                if (i2 == 0) {
                    o.b(obj2);
                    this.v = aVar;
                    this.f246782w = 1;
                    if (aVar.lock(null, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.v;
                    o.b(obj2);
                }
                try {
                    KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
                    KType kTypeB = o0.b(com.revolut.feature.junior_profile.api.models.a.class);
                    companion.getClass();
                    List list = (List) cVar.T2(str, z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB))));
                    if (list != null) {
                        List<com.revolut.feature.junior_profile.api.models.a> list2 = list;
                        objC = new ArrayList(w.t(list2, 10));
                        for (com.revolut.feature.junior_profile.api.models.a aVar4 : list2) {
                            if (Intrinsics.f(aVar4.getF77098a(), aVar2.getF77098a())) {
                                aVar4 = aVar2;
                            }
                            objC.add(aVar4);
                        }
                    } else {
                        objC = u.c(aVar2);
                    }
                    KTypeProjection.Companion companion2 = KTypeProjection.INSTANCE;
                    KType kTypeB2 = o0.b(com.revolut.feature.junior_profile.api.models.a.class);
                    companion2.getClass();
                    cVar.G(objC, str, z.d(o0.c(List.class, KTypeProjection.Companion.a(kTypeB2))));
                    Unit unit = Unit.f186387a;
                    aVar.unlock(null);
                    return Unit.f186387a;
                } catch (Throwable th10) {
                    aVar.unlock(null);
                    throw th10;
                }
            default:
                ne0.j jVar2 = jVar.f246789b;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.f246782w;
                if (i3 == 0) {
                    o.b(obj2);
                    this.v = aVar;
                    this.f246782w = 1;
                    if (aVar.lock(null, this) == aVar5) {
                        return aVar5;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = this.v;
                    o.b(obj2);
                }
                try {
                    List list3 = (List) jVar2.get(str);
                    if (list3 != null) {
                        List<com.revolut.feature.junior_profile.api.models.a> list4 = list3;
                        objC2 = new ArrayList(w.t(list4, 10));
                        for (com.revolut.feature.junior_profile.api.models.a aVar6 : list4) {
                            if (Intrinsics.f(aVar6.getF77098a(), aVar2.getF77098a())) {
                                aVar6 = aVar2;
                            }
                            objC2.add(aVar6);
                        }
                    } else {
                        objC2 = u.c(aVar2);
                    }
                    jVar2.f(str, objC2);
                    x4l.c.a(jVar.f246792h, g.f246781a);
                    Unit unit2 = Unit.f186387a;
                    aVar.unlock(null);
                    return Unit.f186387a;
                } catch (Throwable th11) {
                    aVar.unlock(null);
                    throw th11;
                }
        }
    }
}
