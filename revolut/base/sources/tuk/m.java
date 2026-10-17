package tuk;

import com.revolut.core.ui_kit.delegates.ListSubheaderDelegate;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryContract$Section;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryScreen;
import com.revolut.retail.feature.stockdetails.impl.ui.screens.glossary.GlossaryScreenContract$InputData;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import uuk.b;

/* JADX INFO: loaded from: classes12.dex */
public final class m extends gim.i implements Function1 {
    public final /* synthetic */ ListSubheaderDelegate.Model u;
    public final /* synthetic */ n v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ListSubheaderDelegate.Model model, n nVar, Continuation continuation) {
        super(1, continuation);
        this.u = model;
        this.v = nVar;
    }

    @Override // gim.a
    public final Continuation create(Continuation continuation) {
        return new m(this.u, this.v, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        return ((m) create((Continuation) obj2)).invokeSuspend(Unit.f186387a);
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        Object next;
        GlossaryContract$Section bondRedemption;
        GlossaryScreenContract$InputData glossaryScreenContract$InputData;
        fim.a aVar = fim.a.COROUTINE_SUSPENDED;
        yhm.o.b(obj2);
        Object obj3 = this.u.f52715m;
        if (obj3 instanceof uuk.b) {
            uuk.b glossaryTerm = (uuk.b) obj3;
            n nVar = this.v;
            Iterator it8 = nVar.f274631r.iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                ((uuk.a) ((h) next)).getClass();
                Intrinsics.checkNotNullParameter(glossaryTerm, "glossaryTerm");
                if (glossaryTerm instanceof b.a) {
                    break;
                }
            }
            if (((h) next) != null) {
                Intrinsics.checkNotNullParameter(glossaryTerm, "glossaryTerm");
                b.a aVar2 = glossaryTerm instanceof b.a ? (b.a) glossaryTerm : null;
                if (aVar2 == null) {
                    glossaryScreenContract$InputData = null;
                } else {
                    if (aVar2.equals(b.a.C1567b.f283242a)) {
                        bondRedemption = GlossaryContract$Section.BondCoupon.f103974a;
                    } else if (aVar2.equals(b.a.C1566a.f283241a)) {
                        bondRedemption = GlossaryContract$Section.BondIssue.f103975a;
                    } else {
                        if (!(aVar2 instanceof uuk.c)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bondRedemption = new GlossaryContract$Section.BondRedemption(((uuk.c) aVar2).f283243a);
                    }
                    glossaryScreenContract$InputData = new GlossaryScreenContract$InputData(bondRedemption);
                }
                if (glossaryScreenContract$InputData != null) {
                    yji.l.g2(nVar, new GlossaryScreen(glossaryScreenContract$InputData), null, null, 3);
                }
            }
        } else {
            CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
            rd0.d.b(rd0.c.DEBUG, null, a0.d.m(obj3, "unsupported parcel="), null, null, 16);
        }
        return Unit.f186387a;
    }
}
