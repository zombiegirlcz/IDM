package t80;

import android.content.Intent;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes19.dex */
public final class t extends gim.i implements Function2 {
    public final /* synthetic */ v A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int C;
    public final /* synthetic */ Intent D;
    public Intent u;
    public Iterator v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f268776w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f268777x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f268778y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(v vVar, int i, int i2, Intent intent, Continuation continuation) {
        super(2, continuation);
        this.A = vVar;
        this.B = i;
        this.C = i2;
        this.D = intent;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new t(this.A, this.B, this.C, this.D, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((t) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        int i2;
        int i3;
        Intent intent;
        Iterator it8;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i5 = this.z;
        if (i5 == 0) {
            yhm.o.b(obj2);
            Iterator it9 = this.A.f268789n.iterator();
            i = 0;
            int i6 = this.B;
            i2 = i6;
            i3 = this.C;
            intent = this.D;
            it8 = it9;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f268778y;
            i3 = this.f268777x;
            i2 = this.f268776w;
            it8 = this.v;
            intent = this.u;
            yhm.o.b(obj2);
        }
        while (it8.hasNext()) {
            oli.l lVar = (oli.l) it8.next();
            this.u = intent;
            this.v = it8;
            this.f268776w = i2;
            this.f268777x = i3;
            this.f268778y = i;
            this.z = 1;
            if (lVar.h(i2, i3, this) == aVar) {
                return aVar;
            }
        }
        return Unit.f186387a;
    }
}
