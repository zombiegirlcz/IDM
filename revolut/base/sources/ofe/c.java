package ofe;

import jq9.a0;
import jq9.b0;
import jq9.t;
import jq9.u;
import jq9.v;
import jq9.w;
import jq9.x;
import jq9.y;
import jq9.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.d0;
import tof.i7;
import tof.j8;
import tof.l8;
import tof.n8;
import tof.oa;
import tof.q7;
import tof.qb;
import tof.t7;
import tof.u7;
import tof.v6;
import tof.v7;
import tof.w9;
import tof.ya;
import tof.za;
import zm3.e;
import zm3.f;
import zm3.i;
import zm3.j;
import zm3.n;
import zm3.o;

/* JADX INFO: loaded from: classes8.dex */
public final class c {
    public static oa a(String str) {
        i7.c cVar = i7.Companion;
        i7[] i7VarArr = {new l8(str), new v7(str)};
        cVar.getClass();
        return i7.c.b(i7VarArr);
    }

    public static q7 b(t recipient) {
        String str;
        i7 i7VarA;
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        boolean z = recipient instanceof v;
        if (z) {
            str = ((v) recipient).f177523a.f132329a;
        } else if (recipient instanceof w) {
            str = ((w) recipient).f177524a.f81495a.f81490a;
        } else if (recipient instanceof y) {
            zm3.a aVar = ((y) recipient).f177526a;
            if (aVar instanceof e) {
                str = ((e) aVar).f323340a;
            } else if (aVar instanceof f) {
                str = ((f) aVar).f323345a;
            } else if (aVar instanceof i) {
                str = ((i) aVar).f323353g;
            } else if (aVar instanceof j) {
                str = ((j) aVar).f;
            } else if (aVar instanceof n) {
                str = ((n) aVar).f323373a;
            } else {
                if (!(aVar instanceof o)) {
                    throw new NoWhenBranchMatchedException();
                }
                str = ((o) aVar).f323376a;
            }
        } else if ((recipient instanceof a0) || (recipient instanceof u) || (recipient instanceof b0) || (recipient instanceof x)) {
            str = "";
        } else {
            if (!(recipient instanceof z)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((z) recipient).f177527a.f79060a;
        }
        if (!d0.W(str)) {
            if (z) {
                i7VarA = new u7(((v) recipient).f177523a.f132329a);
            } else if (recipient instanceof w) {
                i7VarA = new ya(((w) recipient).f177524a.f81495a.f81490a);
            } else if (recipient instanceof y) {
                zm3.a aVar2 = ((y) recipient).f177526a;
                if (aVar2 instanceof i) {
                    i7.c cVar = i7.Companion;
                    i iVar = (i) aVar2;
                    String str2 = iVar.f323353g;
                    i7[] i7VarArr = {a(iVar.f323351b), new j8(str2), new w9(str2), new n8(iVar.f323354h)};
                    cVar.getClass();
                    i7VarA = i7.c.b(i7VarArr);
                } else if (aVar2 instanceof j) {
                    i7.c cVar2 = i7.Companion;
                    j jVar = (j) aVar2;
                    String str3 = jVar.f;
                    i7[] i7VarArr2 = {new j8(str3), new w9(str3), new n8(jVar.f323362g)};
                    cVar2.getClass();
                    i7VarA = i7.c.b(i7VarArr2);
                } else if (aVar2 instanceof e) {
                    i7VarA = new t7(((e) aVar2).f323340a);
                } else if (aVar2 instanceof f) {
                    i7VarA = a(((f) aVar2).f323345a);
                } else if (aVar2 instanceof n) {
                    i7VarA = new t7(((n) aVar2).f323373a);
                } else {
                    if (!(aVar2 instanceof o)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i7VarA = a(((o) aVar2).f323376a);
                }
            } else {
                if (!(recipient instanceof a0) && !(recipient instanceof x) && !(recipient instanceof u) && !(recipient instanceof b0) && !(recipient instanceof z)) {
                    throw new NoWhenBranchMatchedException();
                }
                i7VarA = null;
            }
            if (i7VarA != null) {
                i7.c cVar3 = i7.Companion;
                i7[] i7VarArr3 = {new za("suspicious_transaction_user_action_required"), new za("suspicious_transaction_counterparty_action_required"), new za("suspicious_transaction_pending_confirmation"), new za("suspicious_transaction_pending_review"), new za("suspicious_transaction_no_user_action_required")};
                cVar3.getClass();
                return i7.c.a(i7VarA, i7.c.b(i7VarArr3), new qb(zhm.u.c(v6.PENDING)));
            }
        }
        return null;
    }
}
