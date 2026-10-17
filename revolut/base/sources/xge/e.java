package xge;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.tab.accounts.api.model.spaces.SubSpaceContentModel;
import com.revolut.feature.tab.accounts.models.spaces.ProductSpaceIdentifier;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes8.dex */
public final class e extends gim.i implements Function3 {
    public final /* synthetic */ ProductSpaceIdentifier A;
    public pie.v u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ boolean f305701w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ List f305702x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ pie.s f305703y;
    public final /* synthetic */ g z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(pie.s sVar, g gVar, ProductSpaceIdentifier productSpaceIdentifier, Continuation continuation) {
        super(3, continuation);
        this.f305703y = sVar;
        this.z = gVar;
        this.A = productSpaceIdentifier;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        g gVar = this.z;
        ProductSpaceIdentifier productSpaceIdentifier = this.A;
        e eVar = new e(this.f305703y, gVar, productSpaceIdentifier, (Continuation) obj4);
        eVar.f305701w = zBooleanValue;
        eVar.f305702x = (List) obj3;
        return eVar.invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        pie.v vVar;
        boolean z = this.f305701w;
        List list = this.f305702x;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.v;
        pie.s sVar = this.f305703y;
        if (i == 0) {
            yhm.o.b(obj2);
            if (sVar instanceof pie.t) {
                return new SubSpaceContentModel.FlatSubSpaceContentModel(sVar.a(), list);
            }
            if (!(sVar instanceof pie.u)) {
                throw new IllegalArgumentException("Not implemented!");
            }
            pie.v vVarA = sVar.a();
            lge.h hVar = this.z.f305713c;
            pie.v vVarA2 = sVar.a();
            this.f305702x = list;
            this.u = vVarA;
            this.f305701w = z;
            this.v = 1;
            Object objD = hVar.d(this.A, vVarA2, this);
            if (objD == aVar) {
                return aVar;
            }
            vVar = vVarA;
            obj2 = objD;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vVar = this.u;
            yhm.o.b(obj2);
        }
        return new SubSpaceContentModel.GroupedSubSpaceContentModel(z, (Clause) obj2, lge.j.a(sVar.a()), vVar, list);
    }
}
