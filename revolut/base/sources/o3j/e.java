package o3j;

import cli.j;
import cli.n;
import cli.o;
import com.revolut.core.ui_kit.delegates.RowDelegate;
import com.revolut.retail.feature.beneficiary.impl.ui_kompot.beneficiary_creation.account_fields.definition_selector.DefinitionSelectorContract$Choice;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.w;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements n {

    @NotNull
    public static final a Companion = new a();

    public static final class a {
        private a() {
        }
    }

    @Override // cli.n
    public final o c(j jVar) {
        o3j.a domainState = (o3j.a) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List<DefinitionSelectorContract$Choice> list = domainState.f221826b;
        ArrayList arrayList = new ArrayList(w.t(list, 10));
        for (DefinitionSelectorContract$Choice definitionSelectorContract$Choice : list) {
            arrayList.add(new RowDelegate.Model(j6.a.q("definition_", definitionSelectorContract$Choice.f99693a), null, definitionSelectorContract$Choice.f99694b, null, 0, null, null, null, 0, null, false, null, false, null, null, null, null, null, null, definitionSelectorContract$Choice, null, 0, 0, 0, 0, 532676602));
        }
        yp0.b.k(arrayList, 0, 0, 0, 0, 31);
        return new cii.b(null, arrayList, new lw0.a(domainState.f221825a, null, null, null, false, 30));
    }
}
