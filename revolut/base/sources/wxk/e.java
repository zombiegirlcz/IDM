package wxk;

import com.revolut.retail.core.navigation.NaviCommand;
import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends i implements Function2 {
    public int u;
    public final /* synthetic */ f v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ NaviCommand f301006w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, NaviCommand naviCommand, Continuation continuation) {
        super(2, continuation);
        this.v = fVar;
        this.f301006w = naviCommand;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new e(this.v, this.f301006w, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((e) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0070, code lost:
    
        if (r10 == r0) goto L22;
     */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wxk.e.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
