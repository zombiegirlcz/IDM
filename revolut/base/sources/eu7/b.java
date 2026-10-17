package eu7;

import com.revolut.data.model.Data;
import et6.u1;
import go.g;
import ha3.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import l93.f;
import vkm.q;
import zhm.d0;
import zhm.f0;
import zhm.w;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f f129527a;

    public b(f revolutCardsInteractor) {
        Intrinsics.checkNotNullParameter(revolutCardsInteractor, "revolutCardsInteractor");
        this.f129527a = revolutCardsInteractor;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(h93.f0 r5, gim.c r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof eu7.a
            if (r0 == 0) goto L13
            r0 = r6
            eu7.a r0 = (eu7.a) r0
            int r1 = r0.f129526w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f129526w = r1
            goto L18
        L13:
            eu7.a r0 = new eu7.a
            r0.<init>(r4, r6)
        L18:
            java.lang.Object r6 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f129526w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r6)
            goto L45
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L2f:
            yhm.o.b(r6)
            java.lang.String r5 = r5.f150110a
            l93.f r6 = r4.f129527a
            ha3.x r6 = (ha3.x) r6
            ufm.b r5 = r6.p(r5)
            r0.f129526w = r3
            java.lang.Object r6 = nim.a.b(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r5 = "await(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r6, r5)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: eu7.b.a(h93.f0, gim.c):java.lang.Object");
    }

    public final Flow b(List cardIds) {
        Intrinsics.checkNotNullParameter(cardIds, "cardIds");
        if (cardIds.isEmpty()) {
            return new g(new Data(f0.f322471a, null, false, 6, null), 2);
        }
        List list = cardIds;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            arrayList.add(rd0.e.b(((x) this.f129527a).v((String) it8.next())));
        }
        return q.q(new u1((Flow[]) d0.d1(arrayList).toArray(new Flow[0]), this, 2));
    }
}
