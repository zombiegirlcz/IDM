package j2g;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes9.dex */
public final class w extends gim.i implements Function1 {
    public int u;
    public final /* synthetic */ y v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(y yVar, Continuation continuation) {
        super(1, continuation);
        this.v = yVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new w(this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((w) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            j2g.y r0 = r6.v
            cli.y r1 = r0.f170892x
            fim.a r2 = fim.a.COROUTINE_SUSPENDED
            int r3 = r6.u
            r4 = 1
            if (r3 == 0) goto L1a
            if (r3 != r4) goto L12
            yhm.o.b(r7)
            goto L8b
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            yhm.o.b(r7)
            java.lang.Object r7 = r1.f22677a
            vkm.j2 r7 = (vkm.j2) r7
            java.lang.Object r7 = r7.getValue()
            j2g.h r7 = (j2g.h) r7
            com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation r7 = r7.f170867b
            if (r7 == 0) goto L6a
            com.revolut.feature.travel.experiences.api.models.search.TravelSearchLocationType r3 = r7.f92777c
            boolean r5 = r3 instanceof com.revolut.feature.travel.experiences.api.models.search.TravelSearchLocationType.Destination
            if (r5 == 0) goto L6a
            lyf.d r5 = lyf.e.Companion
            r5.getClass()
            java.util.Set r5 = lyf.e.i
            com.revolut.feature.travel.experiences.api.models.search.TravelSearchLocationType$Destination r3 = (com.revolut.feature.travel.experiences.api.models.search.TravelSearchLocationType.Destination) r3
            qyf.a r3 = r3.f92897a
            boolean r3 = r5.contains(r3)
            if (r3 == 0) goto L6a
            java.lang.String r1 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            java.lang.String r7 = r7.f92775a
            java.lang.String r1 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)
            com.revolut.feature.travel.experiences.api.models.search.LocationId$DestinationId r1 = new com.revolut.feature.travel.experiences.api.models.search.LocationId$DestinationId
            r1.<init>(r7)
            j2g.v r7 = new j2g.v
            java.lang.String r1 = r1.f92881a
            r3 = 0
            r7.<init>(r0, r1, r3)
            r6.u = r4
            tji.f r0 = r0.X()
            java.lang.String r1 = "SEARCH_BUTTON_LOADING_TAG"
            java.lang.Object r7 = zh9.u0.b0(r0, r1, r7, r6)
            if (r7 != r2) goto L8b
            return r2
        L6a:
            j2g.k$a r7 = new j2g.k$a
            java.lang.Object r2 = r1.f22677a
            vkm.j2 r2 = (vkm.j2) r2
            java.lang.Object r2 = r2.getValue()
            j2g.h r2 = (j2g.h) r2
            com.revolut.feature.travel.experiences.api.models.selection.TravelExperienceDatesSelection r2 = r2.f170866a
            java.lang.Object r1 = r1.f22677a
            vkm.j2 r1 = (vkm.j2) r1
            java.lang.Object r1 = r1.getValue()
            j2g.h r1 = (j2g.h) r1
            com.revolut.feature.travel.experiences.api.models.config.TravelExperiencesSelectedLocation r1 = r1.f170867b
            r3 = 4
            r7.<init>(r2, r1, r3)
            r0.C2(r7)
        L8b:
            kotlin.Unit r7 = kotlin.Unit.f186387a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j2g.w.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
