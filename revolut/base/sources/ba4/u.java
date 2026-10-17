package ba4;

import com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.UploadScreenContract$InputData;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import skm.e0;
import skm.p0;

/* JADX INFO: loaded from: classes22.dex */
public final class u extends gim.i implements Function1 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a f13912w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ File f13913x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a aVar, File file, Continuation continuation, int i) {
        super(1, continuation);
        this.u = i;
        this.f13912w = aVar;
        this.f13913x = file;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        switch (this.u) {
            case 0:
                return new u(this.f13912w, this.f13913x, continuation, 0);
            default:
                return new u(this.f13912w, this.f13913x, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Continuation continuation = (Continuation) obj2;
        switch (this.u) {
        }
        return ((u) create(continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        int i = this.u;
        File file = this.f13913x;
        com.revolut.feature.credit.application.plugins.impl.ui.documents_upload.document.a aVar = this.f13912w;
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
                    ry3.a aVar3 = new ry3.a(file);
                    this.v = 1;
                    n24.c cVar = aVar2.f178924a;
                    cVar.getClass();
                    n24.a aVar4 = new n24.a(cVar, str, str2, aVar3, null, 0);
                    p0 p0Var = p0.f264001a;
                    Object objJ = e0.J(elm.f.f127540b, aVar4, this);
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
                fim.a aVar5 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    u uVar = new u(aVar, file, null, 0);
                    this.v = 1;
                    if (aVar.p2(this, uVar) == aVar5) {
                        return aVar5;
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
