package r6b;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.feature.hyper_text.model.ParameterisedHyperText;
import kotlin.jvm.internal.Intrinsics;
import nd7.d;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final d f251651a;

    public a(d hyperTextClauseMapper) {
        Intrinsics.checkNotNullParameter(hyperTextClauseMapper, "hyperTextClauseMapper");
        this.f251651a = hyperTextClauseMapper;
    }

    public final Clause a(ParameterisedHyperText terms) {
        Intrinsics.checkNotNullParameter(terms, "terms");
        return d.a(this.f251651a, terms.f74758a);
    }
}
