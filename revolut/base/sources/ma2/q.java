package ma2;

import com.revolut.data.model.Data;
import com.revolut.feature.apm.core.models.alias.Alias;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.d0;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class q implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f203934a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Alias f203935b;

    public /* synthetic */ q(Alias alias) {
        this.f203935b = alias;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f203934a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, new Data(this.f203935b, null, false, 6, null));
            default:
                qw1.d update2 = (qw1.d) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Set setH1 = d0.h1(update2.f249735b);
                Alias alias = this.f203935b;
                if (!setH1.remove(alias)) {
                    setH1.add(alias);
                }
                Set selectedAliases = d0.i1(setH1);
                List availableAliases = update2.f249734a;
                Intrinsics.checkNotNullParameter(availableAliases, "availableAliases");
                Intrinsics.checkNotNullParameter(selectedAliases, "selectedAliases");
                return new qw1.d(availableAliases, selectedAliases);
        }
    }

    public /* synthetic */ q(qw1.g gVar, Alias alias) {
        this.f203935b = alias;
    }
}
