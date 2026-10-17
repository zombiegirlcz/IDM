package l1a;

import com.revolut.domain.models.moneyrequest.SplitPayerType;
import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import do3.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import oq9.l;
import oq9.m;
import oq9.n;
import oq9.o;
import oq9.p;
import oq9.r;
import oq9.s;

/* JADX INFO: loaded from: classes5.dex */
public final class d {
    public static v61.f a(SplitMemberType member) {
        Intrinsics.checkNotNullParameter(member, "member");
        if (member instanceof SplitMemberType.SplitMember.UserMember) {
            String strK = q.k(((SplitMemberType.SplitMember.UserMember) member).f79219a);
            if (strK != null) {
                return new v61.f(SplitPayerType.CODE, strK);
            }
            return null;
        }
        if (!(member instanceof SplitMemberType.SplitMember.ContactMember)) {
            if (!(member instanceof SplitMemberType.GroupMember)) {
                throw new NoWhenBranchMatchedException();
            }
            o oVar = ((SplitMemberType.GroupMember) member).f79216a;
            if (oVar instanceof l) {
                return b(((l) oVar).d);
            }
            if (oVar instanceof m) {
                return b(((m) oVar).d);
            }
            if (oVar instanceof n) {
                return null;
            }
            throw new NoWhenBranchMatchedException();
        }
        zm3.a aVar = ((SplitMemberType.SplitMember.ContactMember) member).f79217a;
        if (aVar instanceof zm3.l) {
            return new v61.f(SplitPayerType.CODE, ((zm3.l) aVar).getCode());
        }
        if (aVar instanceof zm3.f) {
            return new v61.f(SplitPayerType.PHONE, ((zm3.f) aVar).f323345a);
        }
        if (aVar instanceof zm3.e) {
            return new v61.f(SplitPayerType.EMAIL, ((zm3.e) aVar).f323340a);
        }
        if (aVar instanceof zm3.o) {
            return new v61.f(SplitPayerType.PHONE, ((zm3.o) aVar).f323376a);
        }
        if (aVar instanceof zm3.n) {
            return new v61.f(SplitPayerType.EMAIL, ((zm3.n) aVar).f323373a);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static v61.f b(r rVar) {
        if (rVar instanceof p) {
            return new v61.f(SplitPayerType.CODE, ((p) rVar).f227848a);
        }
        if (rVar instanceof s) {
            return new v61.f(SplitPayerType.PHONE, ((s) rVar).f227852a);
        }
        if (rVar instanceof oq9.q) {
            return new v61.f(SplitPayerType.EMAIL, ((oq9.q) rVar).f227850a);
        }
        if (rVar instanceof r.a) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
