package ia7;

import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final class k extends gim.i implements Function3 {
    public final /* synthetic */ int u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(n nVar, Continuation continuation, int i) {
        super(3, continuation);
        this.u = i;
        this.v = nVar;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj2, Object obj3, Object obj4) {
        Continuation continuation = (Continuation) obj4;
        switch (this.u) {
            case 0:
                return new k(this.v, continuation, 0).invokeSuspend(Unit.f186387a);
            default:
                return new k(this.v, continuation, 1).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws IOException {
        int i = this.u;
        n nVar = this.v;
        switch (i) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVar = d.Companion;
                i iVarA = nVar.a(nVar.b().e(), nVar.b().c(), nVar.b().d());
                return new j(iVarA.f159959a, iVarA.f159960b);
            default:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                c cVar2 = d.Companion;
                i iVarA2 = nVar.a(nVar.b().v5(), nVar.b().f(), nVar.b().i());
                String absolutePath = iVarA2.f159959a;
                long j2 = iVarA2.f159960b;
                boolean z = iVarA2.f159961c;
                if (absolutePath == null) {
                    absolutePath = null;
                } else if (z) {
                    File file = new File(nVar.d.getContext().getFilesDir(), nVar.b().h());
                    com.google.gson.internal.d writable = new com.google.gson.internal.d(absolutePath, 8);
                    Intrinsics.checkNotNullParameter(file, "file");
                    Intrinsics.checkNotNullParameter(writable, "writable");
                    a80.h.s(file, writable);
                    absolutePath = file.getAbsolutePath();
                }
                return new j(absolutePath, j2);
        }
    }
}
