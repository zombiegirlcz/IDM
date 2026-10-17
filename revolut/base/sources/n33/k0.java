package n33;

import com.revolut.feature.card_design.api.CardDesignFeatureConfig;
import com.revolut.feature.card_screen.api.activity.CardsScreenFeatureConfig;
import com.revolut.feature.card_screen.api.models.CardScreenAction;
import com.revolut.retail.core.navigation.FeatureCommand;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes21.dex */
public final /* synthetic */ class k0 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f211750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h93.l0 f211751b;

    public /* synthetic */ k0(h93.l0 l0Var, int i) {
        this.f211750a = i;
        this.f211751b = l0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        Object next;
        h93.l0 l0Var;
        Object next2;
        Object next3;
        switch (this.f211750a) {
            case 0:
                List cards = (List) obj2;
                Intrinsics.checkNotNullParameter(cards, "cards");
                od0.h hVar = od0.i.Companion;
                Iterator it8 = cards.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        h93.f0 f0Var = (h93.f0) next;
                        if (f0Var.X() || f0Var.V()) {
                            if (f0Var.G == this.f211751b) {
                            }
                        }
                    } else {
                        next = null;
                    }
                }
                hVar.getClass();
                return od0.h.a(next);
            case 1:
                List cards2 = (List) obj2;
                Intrinsics.checkNotNullParameter(cards2, "cards");
                List list = cards2;
                Iterator it9 = list.iterator();
                while (true) {
                    boolean zHasNext = it9.hasNext();
                    l0Var = this.f211751b;
                    if (zHasNext) {
                        next2 = it9.next();
                        h93.f0 f0Var2 = (h93.f0) next2;
                        if (!f0Var2.f150112c || f0Var2.d || f0Var2.G != l0Var) {
                        }
                    } else {
                        next2 = null;
                    }
                }
                h93.f0 f0Var3 = (h93.f0) next2;
                String str = f0Var3 != null ? f0Var3.f150110a : null;
                Iterator it10 = list.iterator();
                while (true) {
                    if (it10.hasNext()) {
                        next3 = it10.next();
                        h93.f0 f0Var4 = (h93.f0) next3;
                        if (f0Var4.f150112c || f0Var4.d || f0Var4.G != l0Var) {
                        }
                    } else {
                        next3 = null;
                    }
                }
                h93.f0 f0Var5 = (h93.f0) next3;
                String str2 = f0Var5 != null ? f0Var5.f150110a : null;
                if (str == null) {
                    str = str2;
                }
                return new FeatureCommand(str != null ? new CardsScreenFeatureConfig(null, null, null, null, new CardScreenAction.Select(str, 6, false, false), 15) : new CardDesignFeatureConfig(b93.e.VIRTUAL, null, null, null, null, false, null, false, false, null, null, null, null, null, null, null, null, null, l0Var, null, null, false, false, null, 528482302));
            default:
                List cards3 = (List) obj2;
                Intrinsics.checkNotNullParameter(cards3, "cards");
                List list2 = cards3;
                int i = 0;
                if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                    Iterator it11 = list2.iterator();
                    while (it11.hasNext()) {
                        if (((h93.f0) it11.next()).G == this.f211751b && (i = i + 1) < 0) {
                            zhm.v.r();
                            throw null;
                        }
                    }
                }
                return Integer.valueOf(i);
        }
    }
}
