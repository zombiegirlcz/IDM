package p0l;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes12.dex */
public final class q extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ LargeActionButtonDelegate.Model v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ v f231567w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(LargeActionButtonDelegate.Model model, v vVar, Continuation continuation) {
        super(1, continuation);
        this.v = model;
        this.f231567w = vVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new q(this.v, this.f231567w, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((q) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0120  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r30) {
        /*
            Method dump skipped, instruction units count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p0l.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
