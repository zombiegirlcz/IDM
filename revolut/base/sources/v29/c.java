package v29;

import com.revolut.feature.terms.api.model.TermsScope;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class c implements u19.a {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f285684b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final pre.c f285685a;

    static {
        TermsScope.Companion companion = TermsScope.INSTANCE;
        companion.getClass();
        TermsScope termsScope = TermsScope.f90361b;
        companion.getClass();
        TermsScope termsScope2 = TermsScope.f90378r;
        companion.getClass();
        TermsScope termsScope3 = TermsScope.f90382t;
        companion.getClass();
        TermsScope termsScope4 = TermsScope.v;
        companion.getClass();
        TermsScope termsScope5 = TermsScope.X;
        companion.getClass();
        TermsScope termsScope6 = TermsScope.i0;
        companion.getClass();
        f285684b = v.k(termsScope, termsScope2, termsScope3, termsScope4, termsScope5, termsScope6, TermsScope.f90370k0);
    }

    public c(pre.c termsInteractor) {
        Intrinsics.checkNotNullParameter(termsInteractor, "termsInteractor");
        this.f285685a = termsInteractor;
    }
}
