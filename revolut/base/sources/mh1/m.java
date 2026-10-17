package mh1;

import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import skm.g0;
import skm.h0;

/* JADX INFO: loaded from: classes20.dex */
public final class m extends gim.i implements Function2 {
    public Set A;
    public int B;
    public /* synthetic */ Object C;
    public final /* synthetic */ n D;
    public h0 u;
    public g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Set f205366w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Set f205367x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Set f205368y;
    public Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(n nVar, Continuation continuation) {
        super(2, continuation);
        this.D = nVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        m mVar = new m(this.D, continuation);
        mVar.C = obj2;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((m) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0166  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 366
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mh1.m.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
