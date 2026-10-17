package pq9;

import do3.n;
import do3.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.p;
import oq9.r;
import oq9.s;

/* JADX INFO: loaded from: classes5.dex */
public abstract class a {
    public static final String a(r rVar) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        if (rVar instanceof p) {
            return ((p) rVar).f227848a;
        }
        return null;
    }

    public static final boolean b(r rVar, n user) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        if (rVar instanceof p) {
            return !Intrinsics.f(((p) rVar).f227848a, q.k(user));
        }
        if (rVar instanceof s) {
            return !Intrinsics.f(((s) rVar).f227852a, user.i);
        }
        if (rVar instanceof oq9.q) {
            return !Intrinsics.f(((oq9.q) rVar).f227850a, user.f116411g);
        }
        if (rVar instanceof r.a) {
            return true;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final boolean c(r rVar, n user) {
        Intrinsics.checkNotNullParameter(rVar, "<this>");
        Intrinsics.checkNotNullParameter(user, "user");
        if (rVar instanceof p) {
            return Intrinsics.f(((p) rVar).f227848a, q.k(user));
        }
        if (rVar instanceof s) {
            return Intrinsics.f(((s) rVar).f227852a, user.i);
        }
        if (rVar instanceof oq9.q) {
            return Intrinsics.f(((oq9.q) rVar).f227850a, user.f116411g);
        }
        if (rVar instanceof r.a) {
            return false;
        }
        throw new NoWhenBranchMatchedException();
    }
}
