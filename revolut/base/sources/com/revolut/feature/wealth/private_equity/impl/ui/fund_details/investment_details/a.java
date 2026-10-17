package com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details;

import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import kotlin.jvm.internal.Intrinsics;
import yy0.j;
import yy0.l;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a {

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f95816a = new b();

        private b() {
        }
    }

    private a() {
    }

    /* JADX INFO: renamed from: com.revolut.feature.wealth.private_equity.impl.ui.fund_details.investment_details.a$a, reason: collision with other inner class name */
    public static final class C0590a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Clause f95813a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Clause f95814b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final l f95815c;

        public C0590a(MoneyClause moneyClause, TextLocalisedClause textLocalisedClause, j jVar) {
            this.f95813a = moneyClause;
            this.f95814b = textLocalisedClause;
            this.f95815c = jVar;
        }

        public final boolean equals(Object obj2) {
            if (this == obj2) {
                return true;
            }
            if (!(obj2 instanceof C0590a)) {
                return false;
            }
            C0590a c0590a = (C0590a) obj2;
            return Intrinsics.f(this.f95813a, c0590a.f95813a) && Intrinsics.f(this.f95814b, c0590a.f95814b) && Intrinsics.f(this.f95815c, c0590a.f95815c);
        }

        public final int hashCode() {
            Clause clause = this.f95813a;
            int iHashCode = (clause == null ? 0 : clause.hashCode()) * 31;
            Clause clause2 = this.f95814b;
            int iHashCode2 = (iHashCode + (clause2 == null ? 0 : clause2.hashCode())) * 31;
            l lVar = this.f95815c;
            return iHashCode2 + (lVar != null ? lVar.hashCode() : 0);
        }

        public C0590a() {
            this(null, null, null);
        }
    }
}
