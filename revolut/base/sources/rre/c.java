package rre;

import a68.f;
import com.revolut.feature.terms.api.model.TermsScope;
import efm.d0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import rnb.u;
import rpi.e;
import sri.m;
import ufm.i;
import wp5.y;

/* JADX INFO: loaded from: classes8.dex */
public final class c implements mre.b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final mre.c f256825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f256826b;

    public c(mre.c termsNavigationFactory, m navigator) {
        Intrinsics.checkNotNullParameter(termsNavigationFactory, "termsNavigationFactory");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        this.f256825a = termsNavigationFactory;
        this.f256826b = navigator;
    }

    @Override // jf0.d, q06.k
    public final boolean a(jf0.c cVar) {
        return y.D(cVar, "deeplink", 1, "terms");
    }

    public final d0 b(jf0.c cVar) {
        String strE = cVar.e(2);
        boolean zF = Intrinsics.f(strE, "document");
        mre.c cVar2 = this.f256825a;
        if (!zF) {
            if (strE.length() > 0) {
                return ((d) cVar2).c(new TermsScope(strE), null);
            }
            ufm.c cVar3 = new ufm.c(new f(16), 2);
            Intrinsics.checkNotNullExpressionValue(cVar3, "fromCallable(...)");
            return cVar3;
        }
        String documentId = cVar.e(3);
        if (documentId.length() == 0) {
            ufm.c cVarL = d0.l(new IllegalArgumentException("Can't open terms preview with empty document Id"));
            Intrinsics.checkNotNullExpressionValue(cVarL, "error(...)");
            return cVarL;
        }
        String str = (String) cVar.d.get("locale");
        d dVar = (d) cVar2;
        dVar.getClass();
        Intrinsics.checkNotNullParameter(documentId, "documentId");
        d0 d0VarI = dVar.f256827a.i(documentId, str);
        rpi.d dVar2 = new rpi.d(new rgf.m(dVar, "Cannot navigate to terms. Couldn't be retrieved terms of id: ".concat(documentId), 27), 11);
        d0VarI.getClass();
        i iVar = new i(d0VarI, dVar2, 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // q06.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(jf0.c r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof rre.b
            if (r0 == 0) goto L13
            r0 = r7
            rre.b r0 = (rre.b) r0
            int r1 = r0.f256824w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f256824w = r1
            goto L1a
        L13:
            rre.b r0 = new rre.b
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f256824w
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            yhm.o.b(r7)
            goto L5b
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            yhm.o.b(r7)
            r7 = 2
            java.lang.String r7 = r6.e(r7)
            java.lang.String r2 = "document"
            boolean r7 = kotlin.jvm.internal.Intrinsics.f(r7, r2)
            if (r7 == 0) goto L4e
            r7 = 3
            java.lang.String r7 = r6.e(r7)
            int r7 = r7.length()
            if (r7 != 0) goto L4e
            goto L65
        L4e:
            efm.d0 r6 = r5.b(r6)
            r0.f256824w = r3
            java.lang.Object r7 = nim.a.b(r6, r0)
            if (r7 != r1) goto L5b
            return r1
        L5b:
            com.revolut.retail.core.navigation.NaviCommand r7 = (com.revolut.retail.core.navigation.NaviCommand) r7
            com.revolut.retail.core.navigation.DummyCommand r6 = com.revolut.retail.core.navigation.DummyCommand.f98635a
            boolean r6 = kotlin.jvm.internal.Intrinsics.f(r7, r6)
            if (r6 == 0) goto L66
        L65:
            return r4
        L66:
            q06.h r6 = new q06.h
            com.revolut.kompot.bridge.navigation.BridgeDestination r0 = new com.revolut.kompot.bridge.navigation.BridgeDestination
            kotlin.jvm.internal.Intrinsics.h(r7)
            r0.<init>(r7)
            r6.<init>(r0, r4)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: rre.c.e(jf0.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // jf0.d
    public final d0 f(jf0.c deeplink, boolean z) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        i iVar = new i(new ufm.f(b(deeplink), new rpi.d(new u(1, this.f256826b, m.class, "navigate", "navigate(Lcom/revolut/retail/core/navigation/NaviCommand;)V", 0, 8), 9), 3), new rpi.d(new e(13), 10), 1);
        Intrinsics.checkNotNullExpressionValue(iVar, "map(...)");
        return iVar;
    }
}
