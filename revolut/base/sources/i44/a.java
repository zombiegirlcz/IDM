package i44;

import android.content.Context;
import com.revolut.feature.retail.cfd.api.domain.models.MarginQuote;
import com.revolut.feature.shops.impl.flow.session.ShopsSessionFlowContract$Step;
import eel.c;
import ft3.h1;
import gc4.h;
import gim.i;
import h1j.d;
import hd.r;
import i4b.g0;
import i4b.j;
import i4h.p0;
import i6f.u0;
import i79.k;
import ia0.f;
import igf.g;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes22.dex */
public final class a extends i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Object f158279w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f158280x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158279w = obj2;
        this.f158280x = obj3;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new a((b) this.f158279w, (h1) this.f158280x, continuation, 0);
            case 1:
                return new a((g0) this.f158279w, (j) this.f158280x, continuation, 1);
            case 2:
                return new a((g0) this.f158279w, (MarginQuote) this.f158280x, continuation, 2);
            case 3:
                a aVar = new a((p0) this.f158280x, continuation, 3);
                aVar.f158279w = obj2;
                return aVar;
            case 4:
                return new a((p0) this.f158279w, (c) this.f158280x, continuation, 4);
            case 5:
                return new a((com.revolut.feature.masav.impl.ui.review.a) this.f158279w, (d) this.f158280x, continuation, 5);
            case 6:
                a aVar2 = new a((u0) this.f158280x, continuation, 6);
                aVar2.f158279w = obj2;
                return aVar2;
            case 7:
                return new a((k) this.f158279w, (s69.d) this.f158280x, continuation, 7);
            case 8:
                return new a((k) this.f158279w, (ArrayList) this.f158280x, continuation, 8);
            case 9:
                return new a((i97.d) this.f158279w, (i97.c) this.f158280x, continuation, 9);
            case 10:
                return new a((i9d.k) this.f158279w, (String) this.f158280x, continuation, 10);
            case 11:
                return new a((f) this.f158280x, continuation, 11);
            case 12:
                return new a((com.revolut.feature_retail_user_declarations.employer.flow.a) this.f158279w, (com.revolut.feature_retail_user_declarations.employer.screen.a) this.f158280x, continuation, 12);
            case 13:
                return new a((ic4.a) this.f158279w, (h) this.f158280x, continuation, 13);
            case 14:
                return new a((com.revolut.feature.wealth.impl.ui.screens.instruments_collection.a) this.f158279w, (List) this.f158280x, continuation, 14);
            case 15:
                return new a((com.revolut.feature_retail_user_declarations.risk_assessment.flow.a) this.f158279w, (jci.f) this.f158280x, continuation, 15);
            case 16:
                return new a((id3.c) this.f158279w, (String) this.f158280x, continuation, 16);
            case 17:
                a aVar3 = new a((com.revolut.feature.apm.swish.impl.domain.a) this.f158280x, continuation, 17);
                aVar3.f158279w = obj2;
                return aVar3;
            case 18:
                return new a((r) this.f158279w, (Context) this.f158280x, continuation, 18);
            case 19:
                a aVar4 = new a((r) this.f158280x, continuation, 19);
                aVar4.f158279w = obj2;
                return aVar4;
            case 20:
                a aVar5 = new a((com.revolut.feature.retail.restaurants.impl.ui.reservationcreation.a) this.f158280x, continuation, 20);
                aVar5.f158279w = obj2;
                return aVar5;
            case 21:
                a aVar6 = new a((ig2.d) this.f158280x, continuation, 21);
                aVar6.f158279w = obj2;
                return aVar6;
            case 22:
                a aVar7 = new a((iga.j) this.f158280x, continuation, 22);
                aVar7.f158279w = obj2;
                return aVar7;
            case 23:
                return new a((iga.j) this.f158279w, (String) this.f158280x, continuation, 23);
            case 24:
                a aVar8 = new a((g) this.f158280x, continuation, 24);
                aVar8.f158279w = obj2;
                return aVar8;
            case 25:
                return new a((ih2.c) this.f158279w, (String) this.f158280x, continuation, 25);
            case 26:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.spinner.a) this.f158279w, (it3.d) this.f158280x, continuation, 26);
            case 27:
                return new a((com.revolut.feature.credit.application.plugins.impl.ui.spinner.b) this.f158279w, (it3.d) this.f158280x, continuation, 27);
            case 28:
                return new a((com.revolut.feature.shops.impl.flow.session.c) this.f158279w, (ShopsSessionFlowContract$Step.CarouselDetails) this.f158280x, continuation, 28);
            default:
                return new a((com.revolut.retail.feature.esim.impl.ui.screens.mobile_plan_cancellation.b) this.f158279w, this.f158280x, continuation, 29);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        switch (this.u) {
        }
        return ((a) create((CoroutineScope) obj2, (Continuation) obj3)).invokeSuspend(Unit.f186387a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:69:0x013e A[PHI: r3
      0x013e: PHI (r3v68 java.lang.String) = (r3v66 java.lang.String), (r3v77 java.lang.String) binds: [B:74:0x0150, B:67:0x013b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r13v0, types: [dz3.b] */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // gim.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: i44.a.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f158280x = obj2;
    }
}
