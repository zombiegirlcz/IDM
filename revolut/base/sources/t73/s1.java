package t73;

import android.os.Parcelable;
import aw0.o9;
import com.revolut.analytics.tracking.v3.AnalyticsContext;
import com.revolut.analytics.tracking.v3.AnalyticsProduct;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.views.status.StatusViewContract$Duration;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.kompot.common.dialog.status.StatusDialogDescriptionProgress;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes21.dex */
public final class s1 extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g f268535w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ h93.f0 f268536x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ String f268537y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, h93.f0 f0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.u = 0;
        this.f268535w = gVar;
        this.f268537y = str;
        this.f268536x = f0Var;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                String str = this.f268537y;
                return new s1(this.f268535w, this.f268536x, str, continuation);
            case 1:
                return new s1(this.f268535w, this.f268536x, this.f268537y, continuation, 1);
            default:
                return new s1(this.f268535w, this.f268536x, this.f268537y, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((s1) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                Continuation continuation = null;
                com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar = this.f268535w;
                if (i == 0) {
                    yhm.o.b(obj2);
                    q1 q1Var = new q1(gVar, this.f268536x, continuation, 1);
                    this.v = 1;
                    if (gVar.p2(this, q1Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                String str = this.f268537y;
                if (str != null) {
                    yji.l.a1(gVar, gVar.X1(new nii.y0(null, new nii.j0((Clause) new TextClause(str, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), (Clause) null, (StatusDialogDescriptionProgress) null, (Parcelable) null, (nii.u1) null, false, (AnalyticsProduct) null, (AnalyticsContext) null, (StatusViewContract$Duration) null, (nii.h0) null, (ResourceImage) null, 4094), false, 5)), null, null, null, 7);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 == 0) {
                    yhm.o.b(obj2);
                    String str2 = this.f268537y;
                    com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar2 = this.f268535w;
                    s2 s2Var = new s2(gVar2, this.f268536x, str2, null);
                    this.v = 1;
                    if (gVar2.p2(this, s2Var) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    yhm.o.b(obj2);
                    h93.f0 f0Var = this.f268536x;
                    com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar3 = this.f268535w;
                    s15.j jVar = new s15.j(f0Var, gVar3, this.f268537y, (Continuation) null, 10);
                    this.v = 1;
                    if (gVar3.p2(this, jVar) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s1(com.revolut.feature.card_screen.impl.kompot.cards_carousel.screen.g gVar, h93.f0 f0Var, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f268535w = gVar;
        this.f268536x = f0Var;
        this.f268537y = str;
    }
}
