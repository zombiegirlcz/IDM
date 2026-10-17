package iuh;

import aw0.o9;
import com.revolut.core.ui_kit.models.CompositeClause;
import com.revolut.core.ui_kit.models.Style;
import com.revolut.core.ui_kit.models.TextClause;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f168614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f168615b;

    public j(l buttonClauseFactory, m questionSubtitleMapper) {
        Intrinsics.checkNotNullParameter(buttonClauseFactory, "buttonClauseFactory");
        Intrinsics.checkNotNullParameter(questionSubtitleMapper, "questionSubtitleMapper");
        this.f168614a = buttonClauseFactory;
        this.f168615b = questionSubtitleMapper;
    }

    public abstract List a(e eVar);

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        e domainState = (e) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        TextClause textClause = new TextClause(domainState.f168606a.getF105637b(), (Style) null, (Integer) null, false, (o9) null, (List) null, 126);
        CompositeClause compositeClauseA = ((n) this.f168615b).a(domainState.f168606a);
        boolean z = domainState.d;
        boolean z3 = domainState.f168608c;
        this.f168614a.getClass();
        return new i(textClause, compositeClauseA, z, l.a(z3), a(domainState));
    }
}
