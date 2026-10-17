package g3b;

import com.google.crypto.tink.shaded.protobuf.t1;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import yhm.o;

/* JADX INFO: loaded from: classes6.dex */
public final class f extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public /* synthetic */ Object v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ g f140252w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f140252w = gVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                f fVar = new f(this.f140252w, continuation, 0);
                fVar.v = obj2;
                return fVar;
            default:
                f fVar2 = new f(this.f140252w, continuation, 1);
                fVar2.v = obj2;
                return fVar2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
            case 0:
                return ((f) create((a) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
            default:
                return ((f) create((String) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
        }
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        int i = this.u;
        g gVar = this.f140252w;
        switch (i) {
            case 0:
                a aVar = (a) this.v;
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                e4l.b bVar = (e4l.b) j6.a.k(e4l.b.class, gVar.f140256c, t1.X(aVar));
                if (bVar != null) {
                    return f4l.b.a(bVar);
                }
                return null;
            default:
                String str = (String) this.v;
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                o.b(obj2);
                ue0.c cVar = gVar.f140256c;
                String strA = g.a(str);
                Type type = g.f140253g;
                Intrinsics.checkNotNullExpressionValue(type, "access$getPORTFOLIO_PERFORMANCE_TYPE$cp(...)");
                d3b.g gVar2 = (d3b.g) cVar.T2(strA, type);
                if (gVar2 != null) {
                    return e3b.a.a(gVar2);
                }
                return null;
        }
    }
}
