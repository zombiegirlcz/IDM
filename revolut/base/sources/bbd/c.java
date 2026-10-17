package bbd;

import c6b.k;
import dwi.c0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import r5b.n;
import svi.y0;
import svi.z0;
import tzl.l;
import vad.h;

/* JADX INFO: loaded from: classes7.dex */
public final class c extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f14255g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Object f14256h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c0 passActivityInteractor) {
        super(0);
        Intrinsics.checkNotNullParameter(passActivityInteractor, "passActivityInteractor");
        this.f14256h = passActivityInteractor;
    }

    @Override // tzl.l
    public final boolean b(Object obj2, Object obj3, Object obj4) {
        Boolean boolValueOf;
        switch (this.f14255g) {
            case 0:
                vad.b key = (vad.b) obj2;
                h hVar = (h) obj3;
                Intrinsics.checkNotNullParameter(key, "key");
                if (hVar != null) {
                    boolValueOf = Boolean.valueOf(hVar.f287279c != null);
                } else {
                    boolValueOf = null;
                }
                return pd.b.j(boolValueOf);
            case 1:
                q7b.l key2 = (q7b.l) obj2;
                n nVar = (n) obj3;
                Intrinsics.checkNotNullParameter(key2, "key");
                return (nVar != null ? nVar.f251577b : null) != null;
            default:
                y0 key3 = (y0) obj2;
                z0 z0Var = (z0) obj3;
                Intrinsics.checkNotNullParameter(key3, "key");
                return (z0Var != null ? z0Var.f266021b : null) != null;
        }
    }

    @Override // tzl.l
    public final Object c(Object obj2) {
        switch (this.f14255g) {
            case 0:
                vad.b.Companion.getClass();
                return vad.b.f287264c;
            case 1:
                q7b.l lVar = (q7b.l) obj2;
                return lVar == null ? new q7b.l(null) : lVar;
            default:
                y0 y0Var = (y0) obj2;
                return y0Var == null ? new y0(2) : y0Var;
        }
    }

    @Override // tzl.l
    public final Object e(Object obj2, Object obj3) {
        vad.b bVar;
        switch (this.f14255g) {
            case 0:
                vad.b currentKey = (vad.b) obj2;
                h hVar = (h) obj3;
                Intrinsics.checkNotNullParameter(currentKey, "currentKey");
                return (hVar == null || (bVar = hVar.f287279c) == null) ? currentKey : bVar;
            case 1:
                n nVar = (n) obj3;
                Intrinsics.checkNotNullParameter((q7b.l) obj2, "currentKey");
                return new q7b.l(nVar != null ? nVar.f251577b : null);
            default:
                y0 currentKey2 = (y0) obj2;
                z0 z0Var = (z0) obj3;
                Intrinsics.checkNotNullParameter(currentKey2, "currentKey");
                String str = z0Var != null ? z0Var.f266021b : null;
                Map filters = currentKey2.f266016b;
                Intrinsics.checkNotNullParameter(filters, "filters");
                return new y0(str, filters);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0083 A[PHI: r6
      0x0083: PHI (r6v2 java.time.LocalDateTime) = (r6v0 java.time.LocalDateTime), (r6v3 java.time.LocalDateTime) binds: [B:19:0x008d, B:15:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0098 A[PHI: r2
      0x0098: PHI (r2v10 java.time.LocalDateTime) = (r2v4 java.time.LocalDateTime), (r2v11 java.time.LocalDateTime) binds: [B:28:0x00a2, B:24:0x0095] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // tzl.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow g(java.lang.Object r18, java.lang.Object r19, java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 232
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bbd.c.g(java.lang.Object, java.lang.Object, java.lang.Object):kotlinx.coroutines.flow.Flow");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(b interactor) {
        super(0);
        Intrinsics.checkNotNullParameter(interactor, "interactor");
        this.f14256h = interactor;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k cobrandedCardsTransactionsInteractor) {
        super(0);
        Intrinsics.checkNotNullParameter(cobrandedCardsTransactionsInteractor, "cobrandedCardsTransactionsInteractor");
        this.f14256h = cobrandedCardsTransactionsInteractor;
    }
}
