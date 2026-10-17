package q50;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import skm.w1;

/* JADX INFO: loaded from: classes19.dex */
public final class r extends gim.i implements Function2 {
    public int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ ArrayList f242270w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ boolean f242271x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ArrayList arrayList, boolean z, Continuation continuation) {
        super(2, continuation);
        this.f242270w = arrayList;
        this.f242271x = z;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        return new r(this.f242270w, this.f242271x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((r) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i;
        y50.d dVar;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        int i2 = this.v;
        ArrayList arrayList = this.f242270w;
        if (i2 == 0) {
            yhm.o.b(obj2);
            int size = arrayList.size();
            int iMax = Math.max(0, size - 3);
            Iterator it8 = arrayList.iterator();
            int i3 = 0;
            while (true) {
                boolean zHasNext = it8.hasNext();
                boolean z = this.f242271x;
                if (zHasNext) {
                    Object next = it8.next();
                    int i5 = i3 + 1;
                    if (i3 < 0) {
                        zhm.v.s();
                        throw null;
                    }
                    q qVar = (q) next;
                    boolean z3 = z && i3 >= iMax;
                    boolean z4 = !z3;
                    if (!qVar.i && (dVar = qVar.f242260a) != null && !Intrinsics.f(qVar.d.get(), w1.f264016b)) {
                        qVar.f242264h = z3;
                        if (dVar.f314526g != z4) {
                            dVar.f314526g = z4;
                            if (dVar.d != null) {
                                dVar.y2();
                            }
                        }
                        qVar.f242265j.w2(dVar, new q03.h(qVar, 27));
                    }
                    i3 = i5;
                } else if (z && size > 0) {
                    this.u = iMax;
                    this.v = 1;
                    if (skm.k0.b(1000L, this) == aVar) {
                        return aVar;
                    }
                    i = iMax;
                }
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.u;
            yhm.o.b(obj2);
        }
        int i6 = 0;
        for (Object obj3 : arrayList) {
            int i21 = i6 + 1;
            if (i6 < 0) {
                zhm.v.s();
                throw null;
            }
            q qVar2 = (q) obj3;
            if (i6 >= i && qVar2.f242264h) {
                qVar2.f242264h = false;
                boolean z6 = !qVar2.f242263g;
                y50.d dVar2 = qVar2.f242260a;
                if (dVar2 != null && !qVar2.i) {
                    if (dVar2.f314526g != z6) {
                        dVar2.f314526g = z6;
                        if (dVar2.d != null) {
                            dVar2.y2();
                        }
                    }
                    qVar2.c();
                }
            }
            i6 = i21;
        }
        return Unit.f186387a;
    }
}
