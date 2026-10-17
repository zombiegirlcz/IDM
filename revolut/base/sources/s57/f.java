package s57;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends gim.i implements Function2 {
    public boolean u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public /* synthetic */ Object f260017w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ m f260018x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f260019y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(m mVar, String str, Continuation continuation) {
        super(2, continuation);
        this.f260018x = mVar;
        this.f260019y = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        f fVar = new f(this.f260018x, this.f260019y, continuation);
        fVar.f260017w = obj2;
        return fVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((f) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009f  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            Method dump skipped, instruction units count: 363
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s57.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
