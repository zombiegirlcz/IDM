package k61;

import com.revolut.core.model.account.AccountId;
import efm.d0;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.w;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f181593b;

    public /* synthetic */ c(i iVar, int i) {
        this.f181592a = i;
        this.f181593b = iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f181592a) {
            case 0:
                c7l.d it8 = (c7l.d) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                this.f181593b.getClass();
                ArrayList<c7l.b> arrayList = it8.f22060a;
                ArrayList arrayList2 = new ArrayList(w.t(arrayList, 10));
                for (c7l.b bVar : arrayList) {
                    if (!(bVar instanceof c7l.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    c7l.c cVar = (c7l.c) bVar;
                    arrayList2.add(new krf.e(cVar.f22058a, cVar.f22059b, null));
                }
                return new krf.f(it8.f22062c, arrayList2, it8.f22061b);
            case 1:
                y71.b result = (y71.b) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                return this.f181593b.f181612b.k0(AccountId.Personal.f51414a).f(d0.m(result));
            default:
                y71.b result2 = (y71.b) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                return this.f181593b.f181612b.k0(AccountId.Personal.f51414a).f(d0.m(result2));
        }
    }
}
