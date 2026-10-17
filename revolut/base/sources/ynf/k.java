package ynf;

import aw0.o9;
import ch.qos.logback.core.net.SyslogConstants;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import com.revolut.core.ui_kit_resources.R$attr;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import thf.m;
import tof.a3;
import wa7.p;

/* JADX INFO: loaded from: classes8.dex */
public final class k implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final m f315472a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f01.a f315473b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wnf.b f315474c;

    public k(m transactionTextResourcesMapper, f01.a uiKitResources, wnf.b commonMapper, p hiddenAccountsTransactionInteractor) {
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
        Intrinsics.checkNotNullParameter(commonMapper, "commonMapper");
        Intrinsics.checkNotNullParameter(hiddenAccountsTransactionInteractor, "hiddenAccountsTransactionInteractor");
        this.f315472a = transactionTextResourcesMapper;
        this.f315473b = uiKitResources;
        this.f315474c = commonMapper;
    }

    public final TextClause b(a3 a3Var, Map map, Map map2, Map map3, String str, Map map4, boolean z, j jVar) {
        Integer numValueOf;
        String strA = m.a(this.f315472a, a3Var, map, map2, map3, null, str, map4, SyslogConstants.LOG_LOCAL2);
        if (jVar.equals(g.f315469a)) {
            numValueOf = Integer.valueOf(R$attr.uikit_colorAccent);
        } else if (jVar.equals(h.f315470a)) {
            numValueOf = Integer.valueOf(R$attr.uikit_colorForeground);
        } else {
            if (!jVar.equals(i.f315471a)) {
                throw new NoWhenBranchMatchedException();
            }
            numValueOf = null;
        }
        return new TextClause(strA, (Style) new Custom(numValueOf, false, null, z, null, 246), (Integer) null, false, (o9) null, (List) null, 124);
    }
}
