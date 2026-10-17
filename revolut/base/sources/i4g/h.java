package i4g;

import b4g.i0;
import efm.r;
import h4g.k;
import hsa.l;
import kotlin.jvm.internal.Intrinsics;
import od0.i;
import te0.w;

/* JADX INFO: loaded from: classes9.dex */
public final class h implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i0 f158431a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f158432b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f158433c;
    public final ihm.f d;
    public final ihm.f e;
    public final ihm.b f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.b f158434g;

    public h(yk0.d schedulerProvider, i0 repository, k searchSessionInteractor, b searchFiltersSharedState, r7g.b continuationCodec) {
        Intrinsics.checkNotNullParameter(schedulerProvider, "schedulerProvider");
        Intrinsics.checkNotNullParameter(repository, "repository");
        Intrinsics.checkNotNullParameter(searchSessionInteractor, "searchSessionInteractor");
        Intrinsics.checkNotNullParameter(searchFiltersSharedState, "searchFiltersSharedState");
        Intrinsics.checkNotNullParameter(continuationCodec, "continuationCodec");
        this.f158431a = repository;
        this.f158432b = searchSessionInteractor;
        this.f158433c = searchFiltersSharedState;
        this.d = v0.a.d("create(...)");
        this.e = v0.a.d("create(...)");
        this.f = j6.a.h("create(...)");
        i.Companion.getClass();
        ihm.b bVarE = ihm.b.e(i.f224256b);
        Intrinsics.checkNotNullExpressionValue(bVarE, "createDefault(...)");
        this.f158434g = bVarE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0066, code lost:
    
        if (nim.a.a(r6, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery r6, r7g.g r7, ihm.f r8, gim.c r9) {
        /*
            r5 = this;
            boolean r0 = r9 instanceof i4g.f
            if (r0 == 0) goto L13
            r0 = r9
            i4g.f r0 = (i4g.f) r0
            int r1 = r0.z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.z = r1
            goto L18
        L13:
            i4g.f r0 = new i4g.f
            r0.<init>(r5, r9)
        L18:
            java.lang.Object r9 = r0.f158429x
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r9)
            goto L69
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            ihm.f r8 = r0.f158428w
            r7g.g r7 = r0.v
            com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery r6 = r0.u
            yhm.o.b(r9)
            goto L50
        L3c:
            yhm.o.b(r9)
            r0.u = r6
            r0.v = r7
            r0.f158428w = r8
            r0.z = r4
            i4g.b r9 = r5.f158433c
            java.lang.Object r9 = r9.a(r0)
            if (r9 != r1) goto L50
            goto L68
        L50:
            b4g.a r9 = new b4g.a
            r9.<init>(r6, r7)
            pfm.a r6 = r5.b(r9, r8)
            r7 = 0
            r0.u = r7
            r0.v = r7
            r0.f158428w = r7
            r0.z = r3
            java.lang.Object r6 = nim.a.a(r6, r0)
            if (r6 != r1) goto L69
        L68:
            return r1
        L69:
            kotlin.Unit r6 = kotlin.Unit.f186387a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i4g.h.a(com.revolut.feature.travel.flights.models.domain.search.FlightSearchQuery, r7g.g, ihm.f, gim.c):java.lang.Object");
    }

    public final pfm.a b(b4g.c cVar, r rVar) {
        pfm.a aVar = new pfm.a(w.o0(kotlin.coroutines.g.f186406a, new hy2.e(this, null, 8)), new i31.e(19, new l(cVar, 12, this, rVar)), 4);
        Intrinsics.checkNotNullExpressionValue(aVar, "flatMapCompletable(...)");
        return aVar;
    }
}
