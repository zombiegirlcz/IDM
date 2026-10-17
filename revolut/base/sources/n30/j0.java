package n30;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes.dex */
public final class j0 extends gim.i implements Function2 {
    public final /* synthetic */ String A;
    public hlm.a u;
    public p0 v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f211637w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f211638x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f211639y;
    public final /* synthetic */ p0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(p0 p0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.z = p0Var;
        this.A = str;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new j0(this.z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((j0) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) throws Throwable {
        p0 p0Var;
        hlm.a aVar;
        String str;
        int i;
        hlm.a aVar2;
        Throwable th10;
        fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.f211639y;
        try {
            if (i2 == 0) {
                yhm.o.b(obj2);
                p0Var = this.z;
                aVar = p0Var.k;
                this.u = aVar;
                this.v = p0Var;
                String str2 = this.A;
                this.f211637w = str2;
                this.f211638x = 0;
                this.f211639y = 1;
                if (aVar.lock(null, this) != aVar3) {
                    str = str2;
                    i = 0;
                }
                return aVar3;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = this.u;
                try {
                    yhm.o.b(obj2);
                    ((yhm.m) obj2).getClass();
                    Unit unit = Unit.f186387a;
                    aVar2.unlock(null);
                    return Unit.f186387a;
                } catch (Throwable th11) {
                    th10 = th11;
                    aVar2.unlock(null);
                    throw th10;
                }
            }
            i = this.f211638x;
            str = this.f211637w;
            p0Var = this.v;
            hlm.a aVar4 = this.u;
            yhm.o.b(obj2);
            aVar = aVar4;
            this.u = aVar;
            this.v = null;
            this.f211637w = null;
            this.f211638x = i;
            this.f211639y = 2;
            c0 c0Var = p0.Companion;
            if (p0Var.d(this, str, false) != aVar3) {
                aVar2 = aVar;
                Unit unit2 = Unit.f186387a;
                aVar2.unlock(null);
                return Unit.f186387a;
            }
            return aVar3;
        } catch (Throwable th12) {
            aVar2 = aVar;
            th10 = th12;
            aVar2.unlock(null);
            throw th10;
        }
    }
}
