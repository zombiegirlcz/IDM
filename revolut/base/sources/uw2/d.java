package uw2;

import cli.y;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import h93.f0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import sw2.k;
import ua2.r;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f283524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f283525b;

    public /* synthetic */ d(g gVar, int i) {
        this.f283524a = i;
        this.f283525b = gVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f283524a) {
            case 0:
                sw2.k result = (sw2.k) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof sw2.l;
                g gVar = this.f283525b;
                Object obj3 = null;
                if (z) {
                    String str = ((sw2.l) result).f266083a.f150110a;
                    y yVar = gVar.f283531s;
                    ArrayList arrayListF1 = d0.f1((Collection) zi0.c.I(((j) ((j2) yVar.f22677a).getValue()).f283535a));
                    Iterator it8 = arrayListF1.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next2 = it8.next();
                            if (Intrinsics.f(((h) next2).f283533b.f65544a, str)) {
                                obj3 = next2;
                            }
                        }
                    }
                    h hVar = (h) obj3;
                    if (hVar != null) {
                        RevolutCardOtp cardOtp = hVar.f283533b;
                        f0 card = hVar.f283532a;
                        Intrinsics.checkNotNullParameter(card, "card");
                        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
                        h hVar2 = new h(card, cardOtp, true);
                        ListIterator listIterator = arrayListF1.listIterator();
                        while (listIterator.hasNext()) {
                            Object next3 = listIterator.next();
                            if (Intrinsics.f(((h) next3).f283533b.f65544a, str)) {
                                next3 = hVar2;
                            }
                            listIterator.set(next3);
                        }
                        gVar.H2(yVar, new r(4, arrayListF1));
                        gVar.J2(cardOtp.f65546c);
                    }
                } else if (!(result instanceof k.b)) {
                    if (!(result instanceof k.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    gVar.n2(new u83.f(gVar, null, 27), new whi.b(6));
                }
                return Unit.f186387a;
            default:
                ArrayList<f0> arrayList = new ArrayList();
                for (Object obj4 : (List) obj2) {
                    if (((f0) obj4).w()) {
                        arrayList.add(obj4);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (f0 f0Var : arrayList) {
                    Iterator it9 = this.f283525b.o.f64503a.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((RevolutCardOtp) next).f65544a, f0Var.f150110a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    RevolutCardOtp revolutCardOtp = (RevolutCardOtp) next;
                    h hVar3 = revolutCardOtp != null ? new h(f0Var, revolutCardOtp, revolutCardOtp.d == null) : null;
                    if (hVar3 != null) {
                        arrayList2.add(hVar3);
                    }
                }
                return arrayList2;
        }
    }
}
