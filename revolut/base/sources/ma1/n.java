package ma1;

import com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes20.dex */
public final class n extends gim.i implements Function2 {
    public int A;
    public int B;
    public boolean C;
    public int D;
    public /* synthetic */ Object E;
    public final /* synthetic */ o F;
    public CardReaderDevice u;
    public o v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Collection f203891w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Iterator f203892x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CardReaderDevice f203893y;
    public Collection z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Continuation continuation) {
        super(2, continuation);
        this.F = oVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        n nVar = new n(this.F, continuation);
        nVar.E = obj2;
        return nVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((n) create((List) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0095 -> B:21:0x0096). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0099 -> B:23:0x009b). Please report as a decompilation issue!!! */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.E
            java.util.List r0 = (java.util.List) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r13.D
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            boolean r0 = r13.C
            int r2 = r13.B
            int r5 = r13.A
            java.util.Collection r6 = r13.z
            java.util.Collection r6 = (java.util.Collection) r6
            com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice r7 = r13.f203893y
            java.util.Iterator r8 = r13.f203892x
            java.util.Collection r9 = r13.f203891w
            java.util.Collection r9 = (java.util.Collection) r9
            ma1.o r10 = r13.v
            com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice r11 = r13.u
            yhm.o.b(r14)
            goto L96
        L29:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r0)
            throw r14
        L31:
            yhm.o.b(r14)
            ma1.o r14 = r13.F
            da1.d r2 = r14.f203895b
            ma1.t r2 = (ma1.t) r2
            boolean r2 = r2.c()
            if (r2 == 0) goto L49
            ca1.a r2 = r14.f203896c
            ha1.f r2 = (ha1.f) r2
            com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice r2 = r2.b()
            goto L4a
        L49:
            r2 = r4
        L4a:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = zhm.w.t(r0, r6)
            r5.<init>(r6)
            java.util.Iterator r0 = r0.iterator()
            r6 = 0
            r10 = r14
            r8 = r0
            r11 = r2
            r2 = r6
            r6 = r5
            r5 = r2
        L62:
            boolean r14 = r8.hasNext()
            if (r14 == 0) goto La5
            java.lang.Object r14 = r8.next()
            r7 = r14
            com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice r7 = (com.revolut.feature.acquiring.card_reader.data.api.domain.model.CardReaderDevice) r7
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r11, r7)
            if (r0 == 0) goto L99
            r13.E = r4
            r13.u = r11
            r13.v = r10
            r14 = r6
            java.util.Collection r14 = (java.util.Collection) r14
            r13.f203891w = r14
            r13.f203892x = r8
            r13.f203893y = r7
            r13.z = r14
            r13.A = r5
            r13.B = r2
            r13.C = r0
            r13.D = r3
            java.io.Serializable r14 = ma1.o.a(r10, r13)
            if (r14 != r1) goto L95
            return r1
        L95:
            r9 = r6
        L96:
            java.lang.Integer r14 = (java.lang.Integer) r14
            goto L9b
        L99:
            r14 = r4
            r9 = r6
        L9b:
            fa1.p r12 = new fa1.p
            r12.<init>(r7, r0, r14)
            r6.add(r12)
            r6 = r9
            goto L62
        La5:
            java.util.List r6 = (java.util.List) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ma1.n.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
