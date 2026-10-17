package b48;

import java.util.Map;
import kotlin.Pair;
import n38.q;
import n38.s;
import n38.t;
import n38.w;
import zhm.r0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f12201a = r0.k(new Pair("ACCEPTED", w.ACCEPTED), new Pair("PENDING", w.PENDING), new Pair("REJECTED", w.REJECTED), new Pair("CANCELED", w.CANCELLED));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object f12202b = r0.k(new Pair("ACTIVE", q.ACTIVE), new Pair("TERMINATED", q.TERMINATED), new Pair("OFFBOARDING", q.OFFBOARDING), new Pair("PENDING", q.PENDING));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f12203c = r0.k(new Pair("ACCEPTED", t.ACCEPTED), new Pair("PENDING", t.PENDING), new Pair("REJECTED", t.REJECTED), new Pair("EXPIRED", t.EXPIRED), new Pair("ACCOUNT_CREATED", t.ACCOUNT_CREATED), new Pair("CANCELED", t.CANCELLED));
    public static final Object d = r0.k(new Pair("MIGRATION_REQUIRED", s.MIGRATION_REQUIRED), new Pair("INELIGIBLE", s.INELIGIBLE), new Pair("COMPANIES_NOT_MATCH", s.COMPANIES_NOT_MATCH), new Pair("INVITEE_INELIGIBLE_COUNTRY", s.INVITEE_INELIGIBLE_COUNTRY), new Pair("ACCOUNTS_LIMIT_REACHED", s.ACCOUNTS_LIMIT_REACHED), new Pair("INVITEE_MIGRATION_REQUIRED", s.INVITEE_MIGRATION_REQUIRED), new Pair("ELIGIBLE", s.ELIGIBLE));

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Map a() {
        return f12202b;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Map b() {
        return d;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Map c() {
        return f12203c;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public static final Map d() {
        return f12201a;
    }
}
