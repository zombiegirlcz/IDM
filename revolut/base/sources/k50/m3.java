package k50;

import java.util.UUID;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class m3 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ j4 f181185w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public UUID f181186x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m3(j4 j4Var, UUID uuid, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f181185w = j4Var;
        this.f181186x = uuid;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new m3(this.f181185w, continuation);
            case 1:
                return new m3(this.f181185w, this.f181186x, continuation, 1);
            case 2:
                return new m3(this.f181185w, this.f181186x, continuation, 2);
            case 3:
                return new m3(this.f181185w, this.f181186x, continuation, 3);
            case 4:
                return new m3(this.f181185w, this.f181186x, continuation, 4);
            case 5:
                return new m3(this.f181185w, this.f181186x, continuation, 5);
            default:
                return new m3(this.f181185w, this.f181186x, continuation, 6);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((m3) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01d3  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 496
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.m3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(j4 j4Var, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f181185w = j4Var;
    }
}
