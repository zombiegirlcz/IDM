package ba4;

import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreenContract$InputData;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class z extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a f13920w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ ry3.a f13921x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a aVar, ry3.a aVar2, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f13920w = aVar;
        this.f13921x = aVar2;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new z(this.f13920w, this.f13921x, continuation, 0);
            default:
                return new z(this.f13920w, this.f13921x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((z) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a aVar = this.f13920w;
        switch (i) {
            case 0:
                Object obj3 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    jw3.a aVar2 = aVar.f67580p;
                    UploadScreenContract$InputData uploadScreenContract$InputData = aVar.o;
                    String str = uploadScreenContract$InputData.f67576a;
                    String str2 = uploadScreenContract$InputData.f67577b.f220629a;
                    this.v = 1;
                    n24.c cVar = aVar2.f178924a;
                    cVar.getClass();
                    n24.a aVar3 = new n24.a(cVar, str, str2, this.f13921x, null, 1);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, aVar3, this);
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ != obj3) {
                        objJ = Unit.f186387a;
                    }
                    if (objJ == obj3) {
                        return obj3;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar4 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    z zVar = new z(aVar, this.f13921x, null, 0);
                    this.v = 1;
                    if (aVar.p2(this, zVar) == aVar4) {
                        return aVar4;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
