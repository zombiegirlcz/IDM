package o07;

import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.freelancer.impl.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import java.util.List;
import jki.m;
import jki.p;
import kotlin.jvm.internal.Intrinsics;
import njj.c1;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements p {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f221170a;

    public j(k freelancerProcessingFeeItemMapper) {
        Intrinsics.checkNotNullParameter(freelancerProcessingFeeItemMapper, "freelancerProcessingFeeItemMapper");
        this.f221170a = freelancerProcessingFeeItemMapper;
    }

    @Override // jki.p
    public final m a(jki.i iVar) {
        b domainState = (b) iVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        List list = (List) iii.c.f(domainState.f221159a, new nyb.m(this, 28), new nz7.g(this, 7), new c1(this, domainState, 11));
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.freelancer_processing_fees_header_title, null, null, 14);
        TextLocalisedClause textLocalisedClause2 = new TextLocalisedClause(R.string.common_action_got_it, null, null, 14);
        boolean z = false;
        if (((List) domainState.f221159a.getContent()) != null && (!r9.isEmpty())) {
            z = true;
        }
        return new c(textLocalisedClause, list, new a(textLocalisedClause2, z));
    }
}
