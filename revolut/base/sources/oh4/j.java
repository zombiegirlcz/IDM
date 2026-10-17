package oh4;

import aw0.o9;
import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_core.displayers.image.models.ResourceImage;
import com.revolut.core.ui_kit_core.displayers.image.transformation.ImageTransformations;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.credit.core.R$string;
import hs3.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.m;
import rp0.t;
import yhm.o;
import zhm.d0;
import zhm.f0;
import zhm.u;
import zhm.w;

/* JADX INFO: loaded from: classes22.dex */
public final class j extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l f225294w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(l lVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f225294w = lVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new j(this.f225294w, continuation, 0);
            case 1:
                return new j(this.f225294w, continuation, 1);
            default:
                return new j(this.f225294w, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    o.b(obj2);
                    l lVar = this.f225294w;
                    jmc.e eVar = new jmc.e(lVar, null, 11);
                    this.v = 1;
                    if (lVar.p2(this, eVar) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
            case 1:
                fim.a aVar2 = fim.a.COROUTINE_SUSPENDED;
                int i2 = this.v;
                if (i2 != 0) {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                    return obj2;
                }
                o.b(obj2);
                l lVar2 = this.f225294w;
                mtd.e eVar2 = new mtd.e(lVar2, null, 22);
                this.v = 1;
                Object objP2 = lVar2.p2(this, eVar2);
                return objP2 == aVar2 ? aVar2 : objP2;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i3 = this.v;
                if (i3 == 0) {
                    o.b(obj2);
                    l lVar3 = this.f225294w;
                    j60.a aVar4 = lVar3.f225300t;
                    a aVar5 = lVar3.u;
                    Iterable bureaus = lVar3.f225298r.f68299a.e;
                    if (bureaus == null) {
                        bureaus = f0.f322471a;
                    }
                    ((b) aVar5).getClass();
                    Intrinsics.checkNotNullParameter(bureaus, "bureaus");
                    m.b bVar = rp0.m.Companion;
                    rp0.l lVar4 = rp0.l.WINDOW;
                    t tVar = new t(new TextLocalisedClause(R$string.application_rejected_bureaus_title, null, null, 14), null, null, 30);
                    Iterable<n> iterable = bureaus;
                    ArrayList arrayList = new ArrayList(w.t(iterable, 10));
                    for (n nVar : iterable) {
                        arrayList.add(new RowDelegate.Model("bureau_id", new RowDelegate.Model.MainImage.Image40(new ResourceImage(R$drawable.uikit_icn_24_bank, (Integer) null, (Integer) null, Integer.valueOf(R$attr.uikit_colorAccent), (List) null, (ImageTransformations) null, (Clause) null, 246), null, null, false, null, false, 62), new TextLocalisedClause(R$string.application_rejected_bureaus_bureau_title, u.c(new TextClause(nVar.f154914a, (Style) new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), (Integer) null, false, (o9) null, (List) null, 124)), null, 12), null, 0, new TextClause(nVar.f154915b, (Style) null, (Integer) null, false, (o9) null, (List) null, 126), null, null, 0, null, false, null, false, null, null, null, null, null, null, nVar, null, 0, 0, 0, 0, 532676568));
                    }
                    yp0.b.k(arrayList, 0, 0, 0, 0, 31);
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("bureau_got_it_id", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.application_rejected_bureaus_button, null, null, 14), false, null, null, null, null, 1000);
                    int i5 = R$attr.uikit_dp24;
                    yp0.b.r(model, i5, i5, 0, 0, 12);
                    efm.b bVarG = aVar4.G(dy4.b.b(bVar, d0.F0(model, arrayList), tVar, lVar4, null, null, null, 1016));
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i3 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
