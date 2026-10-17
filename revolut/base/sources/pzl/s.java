package pzl;

import com.revolut.utils.job.workers.ProductAccountMigrationWorker;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class s extends gim.i implements Function2 {
    public int u;
    public final /* synthetic */ ProductAccountMigrationWorker v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f241039w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ String f241040x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(ProductAccountMigrationWorker productAccountMigrationWorker, String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.v = productAccountMigrationWorker;
        this.f241039w = str;
        this.f241040x = str2;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new s(this.v, this.f241039w, this.f241040x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((s) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x010b, code lost:
    
        if (r13 != r0) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0109  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: pzl.s.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
