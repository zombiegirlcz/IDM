package web;

import com.revolut.feature.terms.api.model.TermsScope;
import h19.c;
import java.util.List;
import java.util.Set;
import kotlin.collections.d;
import kotlin.jvm.internal.Intrinsics;
import zhm.v;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ a f296707a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f296708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f296709c;

    static {
        TermsScope.Companion companion = TermsScope.INSTANCE;
        companion.getClass();
        TermsScope termsScope = TermsScope.f90363c;
        companion.getClass();
        TermsScope termsScope2 = TermsScope.f90361b;
        companion.getClass();
        TermsScope termsScope3 = TermsScope.f90382t;
        companion.getClass();
        f296708b = v.k(termsScope, termsScope2, termsScope3, TermsScope.u);
        c[] elements = {c.AIRPORT_TRANSFERS, c.FLIGHTS, c.LUGGAGE_STORAGE, c.STATIONS};
        Intrinsics.checkNotNullParameter(elements, "elements");
        f296709c = d.y0(elements);
    }

    private a() {
    }
}
