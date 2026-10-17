package sbb;

import com.revolut.core.model.FileExtension;
import com.revolut.data.model.Data;
import java.io.File;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ a0 f261567w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z(a0 a0Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f261567w = a0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                z zVar = new z(this.f261567w, continuation, 0);
                zVar.v = obj2;
                return zVar;
            default:
                z zVar2 = new z(this.f261567w, continuation, 1);
                zVar2.v = obj2;
                return zVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((z) create((File) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((z) create((Data) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, java.util.Map] */
    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        String absolutePath;
        int i = this.u;
        a0 a0Var = this.f261567w;
        switch (i) {
            case 0:
                File file = (File) this.v;
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                ?? r56 = a0Var.f261532r;
                f80.a aVar2 = a0Var.f261531q;
                String absolutePath2 = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath2, "getAbsolutePath(...)");
                Function1 function1 = (Function1) r56.get(((f80.b) aVar2).c(absolutePath2));
                if (function1 != null) {
                    function1.invoke(file);
                }
                return Unit.f186387a;
            default:
                ?? r06 = a0Var.f261532r;
                Data data = (Data) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                yhm.o.b(obj2);
                File file2 = (File) data.getContent();
                FileExtension fileExtensionC = (file2 == null || (absolutePath = file2.getAbsolutePath()) == null) ? null : ((f80.b) a0Var.f261531q).c(absolutePath);
                if (fileExtensionC == null || r06.keySet().contains(fileExtensionC)) {
                    return Unit.f186387a;
                }
                throw new IllegalStateException("Supported extensions: " + r06.keySet() + ", got " + fileExtensionC);
        }
    }
}
