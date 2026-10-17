package fo;

import java.util.function.Predicate;
import kotlin.jvm.functions.Function1;
import qza.q;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class b implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f136722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Function1 f136723b;

    public /* synthetic */ b(int i, Function1 function1) {
        this.f136722a = i;
        this.f136723b = function1;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj2) {
        switch (this.f136722a) {
        }
        return ((Boolean) ((q) this.f136723b).invoke(obj2)).booleanValue();
    }
}
