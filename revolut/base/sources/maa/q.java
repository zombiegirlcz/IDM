package maa;

import com.revolut.core.ui_kit.delegates.LargeActionButtonDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit.views.LargeActionButton;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.feature.pix.impl.R$string;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import rp0.t;
import rp0.y;
import vkm.j2;
import zhm.d0;
import zhm.w;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends gim.i implements Function2 {
    public final /* synthetic */ int u;
    public int v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ s f203987w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(s sVar, Continuation continuation, int i) {
        super(2, continuation);
        this.u = i;
        this.f203987w = sVar;
    }

    @Override // gim.a
    public final Continuation create(Object obj2, Continuation continuation) {
        switch (this.u) {
            case 0:
                return new q(this.f203987w, continuation, 0);
            default:
                return new q(this.f203987w, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj2, Object obj3) {
        CoroutineScope coroutineScope = (CoroutineScope) obj2;
        Continuation continuation = (Continuation) obj3;
        switch (this.u) {
        }
        return ((q) create(coroutineScope, continuation)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        switch (this.u) {
            case 0:
                fim.a aVar = fim.a.COROUTINE_SUSPENDED;
                int i = this.v;
                if (i == 0) {
                    yhm.o.b(obj2);
                    s sVar = this.f203987w;
                    j60.a aVar2 = sVar.f203990p;
                    oaa.b bVar = sVar.f203991q;
                    Set beneficiaries = ((j) ((j2) sVar.f203994t.f22677a).getValue()).e;
                    bVar.getClass();
                    Intrinsics.checkNotNullParameter(beneficiaries, "beneficiaries");
                    Set set = beneficiaries;
                    ArrayList arrayList = new ArrayList(w.t(set, 10));
                    Iterator it8 = set.iterator();
                    while (it8.hasNext()) {
                        arrayList.add(bVar.f223553a.c((f5j.a) it8.next(), true));
                    }
                    LargeActionButtonDelegate.Model model = new LargeActionButtonDelegate.Model("CONFIRM_ACCOUNTS_DIALOG_BUTTON_ID", LargeActionButton.ButtonStyle.f58725a, null, new TextLocalisedClause(R$string.pix_trusted_add_confirmation_action, null, null, 14), false, null, null, null, null, 1000);
                    int i2 = R$attr.uikit_dp0;
                    int i3 = R$attr.uikit_dp16;
                    yp0.b.p(model, i2, R$attr.uikit_dp24, i3, i3);
                    efm.b bVarG = aVar2.G(new y(d0.F0(model, arrayList), new t(new TextLocalisedClause(R$string.pix_trusted_add_confirmation_title, null, null, 14), new TextLocalisedClause(R$string.pix_trusted_add_confirmation_subtitle, null, null, 14), null, 28), null, null, null, null, 1020));
                    this.v = 1;
                    if (nim.a.a(bVarG, this) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
            default:
                fim.a aVar3 = fim.a.COROUTINE_SUSPENDED;
                int i5 = this.v;
                if (i5 == 0) {
                    yhm.o.b(obj2);
                    s sVar2 = this.f203987w;
                    l40.j jVar = new l40.j(sVar2, null, 24);
                    this.v = 1;
                    if (ue8.c.f0(sVar2, jVar, this) == aVar3) {
                        return aVar3;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    yhm.o.b(obj2);
                }
                return Unit.f186387a;
        }
    }
}
