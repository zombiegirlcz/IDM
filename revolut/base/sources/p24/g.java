package p24;

import ft3.h1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class g extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ p f232047w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h1 f232048x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(p pVar, h1 h1Var, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f232047w = pVar;
        this.f232048x = h1Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new g(this.f232047w, this.f232048x, continuation, 0);
            case 1:
                return new g(this.f232047w, this.f232048x, continuation, 1);
            case 2:
                return new g(this.f232047w, this.f232048x, continuation, 2);
            case 3:
                return new g(this.f232047w, this.f232048x, continuation, 3);
            case 4:
                return new g(this.f232047w, this.f232048x, continuation, 4);
            case 5:
                return new g(this.f232047w, this.f232048x, continuation, 5);
            case 6:
                return new g(this.f232047w, this.f232048x, continuation, 6);
            case 7:
                return new g(this.f232047w, this.f232048x, continuation, 7);
            default:
                return new g(this.f232047w, this.f232048x, continuation, 8);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // gim.a
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            Method dump skipped, instruction units count: 908
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p24.g.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
