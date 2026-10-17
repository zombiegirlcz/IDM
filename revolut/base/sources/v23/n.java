package v23;

import cli.y;
import com.revolut.feature.card_order_new.impl.kompot.screen.card_holder_name.CardHolderNameControllerContract$InputData;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import v23.j;
import vkm.j2;
import wli.x;

/* JADX INFO: loaded from: classes21.dex */
public final class n extends oki.h implements e {

    @NotNull
    public static final m Companion = new m();
    public final x o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final y f285639p;

    public n(cli.n stateMapper, CardHolderNameControllerContract$InputData inputData, x deeplinkHandler) {
        Object next;
        Intrinsics.checkNotNullParameter(stateMapper, "stateMapper");
        Intrinsics.checkNotNullParameter(inputData, "inputData");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.o = deeplinkHandler;
        List list = inputData.f65157a;
        Iterator it8 = list.iterator();
        while (true) {
            if (!it8.hasNext()) {
                next = null;
                break;
            } else {
                next = it8.next();
                if (Intrinsics.f((String) next, inputData.f65158b)) {
                    break;
                }
            }
        }
        this.f285639p = mra.d.b(this, new f(list, (String) next), stateMapper, null, false, 12);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void I2(j event) {
        Intrinsics.checkNotNullParameter(event, "event");
        boolean z = event instanceof j.a;
        y yVar = this.f285639p;
        if (z) {
            String str = ((f) ((j2) yVar.f22677a).getValue()).f285631b;
            if (str == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            C2(new g(str));
            return;
        }
        Object[] objArr = 0;
        if (!(event instanceof k)) {
            if (!(event instanceof i)) {
                throw new NoWhenBranchMatchedException();
            }
            l2(new uxe.l(this, objArr == true ? 1 : 0, 4), new yi5.b(26));
        } else {
            Object obj2 = ((k) event).f285637a.i;
            String str2 = obj2 instanceof String ? (String) obj2 : null;
            if (str2 == null) {
                return;
            }
            H2(yVar, new uo7.k(str2, 17));
        }
    }

    @Override // cli.z
    public final cli.g getState() {
        return this.f285639p;
    }
}
