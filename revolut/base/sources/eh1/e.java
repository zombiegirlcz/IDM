package eh1;

import a83.c0;
import cli.y;
import com.revolut.feature.add_card_to_google_pay.integration.api.model.SharedRevolutCardWrapper;
import com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.c;
import com.revolut.feature.card_add_to_googlepay.api.models.RetailCardWrapper;
import com.revolut.feature.cards.models.revolutcard.RevolutCardOtp;
import com.revolut.shared.cards.model.SharedRevolutCard;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class e implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f125682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f125683b;

    public /* synthetic */ e(i iVar, int i) {
        this.f125682a = i;
        this.f125683b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        switch (this.f125682a) {
            case 0:
                com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.c result = (com.revolut.feature.add_card_to_google_pay_shared.impl.verification.otp.location_mismatch.c) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                boolean z = result instanceof ch1.j;
                i iVar = this.f125683b;
                Object obj3 = null;
                if (z) {
                    SharedRevolutCard sharedRevolutCard = ((ch1.j) result).f24109a;
                    y yVar = iVar.f125691s;
                    ArrayList arrayListF1 = d0.f1((Collection) zi0.c.I(((l) ((j2) yVar.f22677a).getValue()).f125695a));
                    Iterator it8 = arrayListF1.iterator();
                    while (true) {
                        if (it8.hasNext()) {
                            Object next2 = it8.next();
                            if (Intrinsics.f(((j) next2).f125693b.f65544a, sharedRevolutCard.f104693a)) {
                                obj3 = next2;
                            }
                        }
                    }
                    j jVar = (j) obj3;
                    if (jVar != null) {
                        RevolutCardOtp cardOtp = jVar.f125693b;
                        SharedRevolutCardWrapper cardWrapper = jVar.f125692a;
                        Intrinsics.checkNotNullParameter(cardWrapper, "cardWrapper");
                        Intrinsics.checkNotNullParameter(cardOtp, "cardOtp");
                        j jVar2 = new j(cardWrapper, cardOtp, true);
                        ListIterator listIterator = arrayListF1.listIterator();
                        while (listIterator.hasNext()) {
                            Object next3 = listIterator.next();
                            if (Intrinsics.f(((j) next3).f125693b.f65544a, sharedRevolutCard.f104693a)) {
                                next3 = jVar2;
                            }
                            listIterator.set(next3);
                        }
                        iVar.H2(yVar, new c0(19, arrayListF1));
                        iVar.J2(cardOtp.f65546c);
                    }
                } else if (!(result instanceof c.b)) {
                    if (!(result instanceof c.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iVar.n2(new ebg.o(iVar, null, 7), new whi.b(6));
                }
                return Unit.f186387a;
            default:
                ArrayList arrayList = new ArrayList();
                for (SharedRevolutCardWrapper sharedRevolutCardWrapper : (List) obj2) {
                    Iterator it9 = this.f125683b.o.f60912a.iterator();
                    while (true) {
                        if (it9.hasNext()) {
                            next = it9.next();
                            if (Intrinsics.f(((RevolutCardOtp) next).f65544a, ((RetailCardWrapper) sharedRevolutCardWrapper).f64443a.f104693a)) {
                            }
                        } else {
                            next = null;
                        }
                    }
                    RevolutCardOtp revolutCardOtp = (RevolutCardOtp) next;
                    j jVar3 = revolutCardOtp != null ? new j(sharedRevolutCardWrapper, revolutCardOtp, revolutCardOtp.d == null) : null;
                    if (jVar3 != null) {
                        arrayList.add(jVar3);
                    }
                }
                return arrayList;
        }
    }
}
