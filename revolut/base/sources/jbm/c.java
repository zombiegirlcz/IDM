package jbm;

import java.util.function.Predicate;
import kotlin.text.d0;
import retrofit2.Response;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class c implements Predicate {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f172654a;

    public /* synthetic */ c(int i) {
        this.f172654a = i;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj2) {
        switch (this.f172654a) {
            case 0:
                g gVar = h.f172668p;
                return true;
            case 1:
                g gVar2 = h.f172668p;
                return false;
            case 2:
                g gVar3 = h.f172668p;
                return false;
            case 3:
                String message = ((Throwable) obj2).getMessage();
                if (message != null) {
                    return d0.J(message, "Response error: HTTP", false);
                }
                return false;
            default:
                return ((Response) obj2).code() < 500;
        }
    }
}
