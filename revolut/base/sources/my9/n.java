package my9;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.payments.R$string;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import o97.d0;
import o97.e0;
import o97.f0;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class n implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f210425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q f210426b;

    public /* synthetic */ n(q qVar, int i) {
        this.f210425a = i;
        this.f210426b = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f210425a;
        q qVar = this.f210426b;
        switch (i) {
            case 0:
                List items = (List) obj2;
                Intrinsics.checkNotNullParameter(items, "items");
                f0 f0Var = new f0(new TextLocalisedClause(R$string.global_search_widgets_recents_title, null, null, 14), "PAYMENTS_SEARCH_LIST_ID.RecentRecipients");
                ArrayList arrayListA = qVar.f210429b.a(items, qVar.f210430c, new n(qVar, 1));
                yp0.b.k(arrayListA, 0, 0, 0, 0, 31);
                d0[] elements = {f0Var, new e0(arrayListA)};
                Intrinsics.checkNotNullParameter(elements, "elements");
                return kotlin.collections.d.L(elements);
            default:
                ly9.j item = (ly9.j) obj2;
                Intrinsics.checkNotNullParameter(item, "item");
                return new o97.y(qVar.f210430c, item, null, 60);
        }
    }
}
