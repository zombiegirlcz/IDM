package com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2;

import gim.i;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ocg.r;
import rp0.e1;

/* JADX INFO: loaded from: classes9.dex */
public final class b extends i implements Function2 {
    public /* synthetic */ Object u;
    public final /* synthetic */ r v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(r rVar, Continuation continuation) {
        super(2, continuation);
        this.v = rVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        b bVar = new b(this.v, continuation);
        bVar.u = obj2;
        return bVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        return ((b) create((e1) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002c  */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r4) {
        /*
            r3 = this;
            java.lang.Object r0 = r3.u
            rp0.e1 r0 = (rp0.e1) r0
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            yhm.o.b(r4)
            kotlin.jvm.internal.Intrinsics.h(r0)
            boolean r4 = r0 instanceof rp0.b1
            r1 = 0
            if (r4 == 0) goto L14
            rp0.b1 r0 = (rp0.b1) r0
            goto L15
        L14:
            r0 = r1
        L15:
            if (r0 == 0) goto L2c
            com.revolut.core.ui_kit.dialogs.ShotDialogDisplayer$Configuration r4 = r0.f256049a
            if (r4 == 0) goto L2c
            java.lang.String r0 = r4.f55716a
            java.lang.String r2 = "FAVORITE_V2_DIALOG"
            boolean r0 = kotlin.jvm.internal.Intrinsics.f(r0, r2)
            if (r0 == 0) goto L26
            goto L27
        L26:
            r4 = r1
        L27:
            if (r4 == 0) goto L2c
            android.os.Parcelable r4 = r4.f55719g
            goto L2d
        L2c:
            r4 = r1
        L2d:
            boolean r0 = r4 instanceof com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.UndoRemoveFavoriteParcel
            if (r0 == 0) goto L34
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.UndoRemoveFavoriteParcel r4 = (com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.UndoRemoveFavoriteParcel) r4
            goto L35
        L34:
            r4 = r1
        L35:
            if (r4 == 0) goto L47
            com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.a r0 = new com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.a
            ocg.r r2 = r3.v
            r0.<init>(r2, r4, r1)
            whi.b r4 = new whi.b
            r1 = 6
            r4.<init>(r1)
            r2.n2(r0, r4)
        L47:
            kotlin.Unit r4 = kotlin.Unit.f186387a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.feature.travel.hotels.impl.ui_kompot.screen.favoritesV2.b.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
