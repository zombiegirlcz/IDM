package s4f;

import com.revolut.feature.trading.api.navigation.CollectionDestination;
import com.revolut.feature.trading.impl.ui.collections.CollectionScreen;
import com.revolut.feature_web_view.WebViewFeatureConfig;
import com.revolut.retail.feature.stockdetails.api.navigation.AssetDetailsDestination;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import skm.a2;
import zh9.u0;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ CollectionScreen f259848w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(CollectionScreen collectionScreen, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f259848w = collectionScreen;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                e eVar = new e(this.f259848w, continuation, 0);
                eVar.v = obj2;
                return eVar;
            case 1:
                e eVar2 = new e(this.f259848w, continuation, 1);
                eVar2.v = obj2;
                return eVar2;
            case 2:
                e eVar3 = new e(this.f259848w, continuation, 2);
                eVar3.v = obj2;
                return eVar3;
            case 3:
                e eVar4 = new e(this.f259848w, continuation, 3);
                eVar4.v = obj2;
                return eVar4;
            default:
                e eVar5 = new e(this.f259848w, continuation, 4);
                eVar5.v = obj2;
                return eVar5;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((e) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 1:
                return ((e) create((h) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 2:
                return ((e) create((g) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            case 3:
                return ((e) create((i) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((e) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
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
        nel.n nVar;
        int i = this.u;
        Object[] objArr = 0;
        CollectionScreen collectionScreen = this.f259848w;
        switch (i) {
            case 0:
                String input = (String) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE3 = collectionScreen.d();
                xVarE3.getClass();
                Intrinsics.checkNotNullParameter(input, "input");
                xVarE3.f259875w.setValue(d0.W(input) ? null : input);
                break;
            case 1:
                h parcel = (h) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE32 = collectionScreen.d();
                Intrinsics.h(parcel);
                xVarE32.getClass();
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                xVarE32.C1(new AssetDetailsDestination(parcel.f259853a.f214596b, null, false, null, null, null, 62));
                break;
            case 2:
                g parcel2 = (g) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE33 = collectionScreen.d();
                Intrinsics.h(parcel2);
                xVarE33.getClass();
                Intrinsics.checkNotNullParameter(parcel2, "parcel");
                l4f.a aVar4 = xVarE33.f259872r;
                String collection = parcel2.f259852a;
                aVar4.getClass();
                Intrinsics.checkNotNullParameter(collection, "collection");
                xVarE33.C1(u0.b(u0.f(new CollectionDestination(collection))));
                break;
            case 3:
                i parcel3 = (i) this.v;
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE34 = collectionScreen.d();
                Intrinsics.h(parcel3);
                xVarE34.getClass();
                Intrinsics.checkNotNullParameter(parcel3, "parcel");
                xVarE34.C1(u0.c(new WebViewFeatureConfig(parcel3.f259856a, null, 0, false, false, false, 114574)));
                break;
            default:
                List<koi.j> items = (List) this.v;
                fim.a aVar6 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                x xVarE35 = collectionScreen.d();
                Intrinsics.h(items);
                xVarE35.getClass();
                Intrinsics.checkNotNullParameter(items, "items");
                ArrayList arrayList = new ArrayList();
                for (koi.j jVar : items) {
                    qv0.p pVar = jVar instanceof qv0.p ? (qv0.p) jVar : null;
                    Object e = pVar != null ? pVar.getF55256g() : null;
                    h hVar = e instanceof h ? (h) e : null;
                    String str = (hVar == null || (nVar = hVar.f259853a) == null) ? null : nVar.f214596b;
                    if (str != null) {
                        arrayList.add(str);
                    }
                }
                Set setI1 = zhm.d0.i1(arrayList);
                a2 a2Var = xVarE35.f259877y;
                if (a2Var == null || !a2Var.d() || !Intrinsics.f(xVarE35.f259876x, setI1)) {
                    xVarE35.f259876x = setI1;
                    a2 a2Var2 = xVarE35.f259877y;
                    if (a2Var2 != null) {
                        a2Var2.f(null);
                    }
                    xVarE35.f259877y = xVarE35.n2(new s09.c(xVarE35, setI1, objArr == true ? 1 : 0, 9), new whi.b(6));
                }
                break;
        }
        return Unit.f186387a;
    }
}
