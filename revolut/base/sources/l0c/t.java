package l0c;

import com.revolut.core.model.FileExtension;
import com.revolut.feature.terms.api.model.Terms;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zh9.u0;

/* JADX INFO: loaded from: classes6.dex */
public final class t extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ u v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f191224w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Terms f191225x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(u uVar, String str, Terms terms, Continuation continuation) {
        super(1, continuation);
        this.v = uVar;
        this.f191224w = str;
        this.f191225x = terms;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new t(this.v, this.f191224w, this.f191225x, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((t) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i = this.u;
        u uVar = this.v;
        if (i == 0) {
            yhm.o.b(obj2);
            ufm.n nVarB = uVar.f191227q.b(this.f191224w, true, FileExtension.Pdf.f51406b);
            this.u = 1;
            obj2 = nim.a.b(nVarB, this);
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            yhm.o.b(obj2);
        }
        File file = (File) obj2;
        tqi.g gVar = uVar.f191228r;
        String str = this.f191225x.f90359h;
        Intrinsics.h(file);
        return uVar.C1(u0.b(tqi.g.d(gVar, str, file, "application/pdf", 8)));
    }
}
