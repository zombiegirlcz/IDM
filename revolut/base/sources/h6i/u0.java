package h6i;

import com.revolut.feature_move_money.api.model.AccountWrapper;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class u0 extends gim.i implements Function2 {
    public Set A;
    public Set B;
    public int C;
    public /* synthetic */ Object D;
    public final /* synthetic */ b9k.f E;
    public final /* synthetic */ AccountWrapper F;
    public final /* synthetic */ x5i.d G;
    public skm.h0 u;
    public skm.g0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public skm.g0 f149725w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public skm.g0 f149726x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Set f149727y;
    public Set z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(b9k.f fVar, AccountWrapper accountWrapper, x5i.d dVar, Continuation continuation) {
        super(2, continuation);
        this.E = fVar;
        this.F = accountWrapper;
        this.G = dVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        u0 u0Var = new u0(this.E, this.F, this.G, continuation);
        u0Var.D = obj2;
        return u0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((u0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0198  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h6i.u0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
