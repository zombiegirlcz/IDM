package wi6;

import aj6.v;
import android.graphics.BitmapFactory;
import com.revolut.feature.external_accounts.api.model.consent.ConsentExpiration;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public final class s extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ t f297828w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s(t tVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f297828w = tVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new s(this.f297828w, continuation, 0);
            default:
                return new s(this.f297828w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                t tVar = this.f297828w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    ufm.n nVarA = ((mg6.c) tVar.f297831r).a(tVar.o.f297814a);
                    this.v = 1;
                    obj2 = nim.a.b(nVarA, this);
                    if (obj2 == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                x61.f fVar = (x61.f) obj2;
                String str = fVar.f303016a;
                byte[] bArr = fVar.f303017b;
                tVar.H2(tVar.f297833t, new v(new ei6.d(str, bArr != null ? BitmapFactory.decodeByteArray(bArr, 0, bArr.length) : null), 1));
                return Unit.f186387a;
            default:
                t tVar2 = this.f297828w;
                i iVar = tVar2.o;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    xg6.d dVar = tVar2.f297832s;
                    String clientId = iVar.f297814a;
                    Intrinsics.checkNotNullParameter(clientId, "clientId");
                    String request = iVar.f297815b;
                    Intrinsics.checkNotNullParameter(request, "request");
                    this.v = 1;
                    obj2 = dVar.a(clientId, request, this);
                    if (obj2 == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                tVar2.H2(tVar2.f297833t, new wdb.b((ConsentExpiration) ((od0.i) obj2).g(), 24));
                return Unit.f186387a;
        }
    }
}
