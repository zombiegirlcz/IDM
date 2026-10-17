package m81;

import com.revolut.feature.abexperiments.models.Experiment;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import p81.d;
import r81.c;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q81.a f203417a;

    public a(q81.a skywalkerRepository) {
        Intrinsics.checkNotNullParameter(skywalkerRepository, "skywalkerRepository");
        this.f203417a = skywalkerRepository;
    }

    public final c a(Experiment experiment) {
        Object next;
        Intrinsics.checkNotNullParameter(experiment, "experiment");
        d dVar = (d) ((q81.d) this.f203417a).b().get(experiment.getF60553a());
        if (dVar != null) {
            String value = dVar.f233822b;
            Intrinsics.checkNotNullParameter(value, "value");
            Iterator it8 = experiment.getE().iterator();
            while (true) {
                if (!it8.hasNext()) {
                    next = null;
                    break;
                }
                next = it8.next();
                if (Intrinsics.f(((r81.d) next).f252305a.getValue(), value)) {
                    break;
                }
            }
            r81.d dVar2 = (r81.d) next;
            if (dVar2 != null) {
                return dVar2.f252305a;
            }
        }
        return null;
    }
}
