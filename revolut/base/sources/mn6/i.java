package mn6;

import com.revolut.domain.models.openbanking.TopupUrlData;
import com.revolut.feature.core.model.domain.wallet.openbanking.ExternalInstitution;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import yhm.o;
import yji.n;

/* JADX INFO: loaded from: classes3.dex */
public final class i extends gim.i implements Function1 {
    public final /* synthetic */ Function0 A;
    public final /* synthetic */ Function0 B;
    public final /* synthetic */ Function0 C;
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j f207380w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ExternalInstitution f207381x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ ho3.a f207382y;
    public final /* synthetic */ String z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(j jVar, ExternalInstitution externalInstitution, ho3.a aVar, String str, Function0 function0, Function0 function02, Function0 function03, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f207380w = jVar;
        this.f207381x = externalInstitution;
        this.f207382y = aVar;
        this.z = str;
        this.A = function0;
        this.B = function02;
        this.C = function03;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new i(this.f207380w, this.f207381x, this.f207382y, this.z, this.A, this.B, this.C, continuation, 0);
            default:
                return new i(this.f207380w, this.f207381x, this.f207382y, this.z, this.A, this.B, this.C, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((i) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                j jVar = this.f207380w;
                ExternalInstitution externalInstitution = this.f207381x;
                if (i == 0) {
                    o.b(obj2);
                    this.v = 1;
                    obj2 = j.e3(jVar, externalInstitution, this.f207382y, this.z, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return n.l2(jVar, jVar.L2(jVar.f207384m.b(externalInstitution.f66108b)), null, new h(this.f207380w, this.f207381x, this.A, (TopupUrlData) obj2, this.B, this.C, null), 3);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                j jVar2 = this.f207380w;
                i iVar = new i(jVar2, this.f207381x, this.f207382y, this.z, this.A, this.B, this.C, null, 0);
                this.v = 1;
                Object objB = pu7.a.B(jVar2.e, "requestAuthorisationLink", iVar, this);
                return objB == aVar2 ? aVar2 : objB;
        }
    }
}
