package v3e;

import com.revolut.retail.core.navigation.FinishCommand;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class o implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f285907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d0 f285908b;

    public /* synthetic */ o(d0 d0Var, int i) {
        this.f285907a = i;
        this.f285908b = d0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Object next;
        switch (this.f285907a) {
            case 0:
                Iterator it8 = this.f285908b.f285885p.iterator();
                while (true) {
                    if (it8.hasNext()) {
                        next = it8.next();
                        if (((d4e.b) next) instanceof d4e.b) {
                        }
                    } else {
                        next = null;
                    }
                }
                return (d4e.b) (next instanceof d4e.b ? next : null);
            default:
                this.f285908b.f285881j.c(new FinishCommand(-1, null, null, 6));
                return Unit.f186387a;
        }
    }
}
