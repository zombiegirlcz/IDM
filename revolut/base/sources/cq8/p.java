package cq8;

import aw0.m6;
import aw0.n6;
import cie.l1;
import cnc.t;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.junior_tasks.api.R$string;
import com.revolut.revolut.feature_fourthline_impl.R;
import ip0.dg;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import zhm.u;
import zhm.v;

/* JADX INFO: loaded from: classes4.dex */
public final class p implements cli.n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l80.e f108041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final aw0.g f108042b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f108043c;
    public final List d;

    public p(q taskItemsMapper, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(taskItemsMapper, "taskItemsMapper");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f108041a = dateProvider;
        n6.Companion.getClass();
        this.f108042b = new aw0.g(m6.a(), m6.a(), (Clause) null, (aw0.f) null, 25);
        List listK = v.k(q.b("LIST_ID_LOADING_0"), q.b("LIST_ID_LOADING_1"), q.b("LIST_ID_LOADING_2"), q.b("LIST_ID_LOADING_3"), q.b("LIST_ID_LOADING_4"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        this.f108043c = listK;
        dg dgVar = new dg("LIST_ID_ERROR_STATE", new TextLocalisedClause(R.string.error_generic, null, null, 14), new TextLocalisedClause(R.string.common_action_try_again, null, null, 14));
        yp0.b.l(dgVar, 0, 0, 0, 0, null, false, 63);
        this.d = u.c(dgVar);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        c domainState = (c) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        lw0.a aVar = new lw0.a(new TextLocalisedClause(R$string.junior_challenges_details_header_challenge_details, null, null, 14), null, null, null, false, 30);
        final int i = 0;
        List list = (List) iii.c.f(domainState.f108023a, new Function1(this) { // from class: cq8.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f108039b;

            {
                this.f108039b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Function0 it8 = (Function0) obj2;
                switch (i) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f108039b.f108043c;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f108039b.f108042b;
                }
            }
        }, new t(this, 9), new cab.m(this, domainState, 6));
        final int i2 = 1;
        return new cii.b((aw0.i) iii.c.f(domainState.f108023a, new Function1(this) { // from class: cq8.n

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p f108039b;

            {
                this.f108039b = this;
            }

            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                Function0 it8 = (Function0) obj2;
                switch (i2) {
                    case 0:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f108039b.f108043c;
                    default:
                        Intrinsics.checkNotNullParameter(it8, "it");
                        return this.f108039b.f108042b;
                }
            }
        }, new clk.b(20), new l1(this, 8)), list, aVar);
    }
}
