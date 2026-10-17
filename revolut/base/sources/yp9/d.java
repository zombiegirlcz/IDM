package yp9;

import com.revolut.feature.payments.bills_chooser.api.splits.SplitMemberType;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.t0;

/* JADX INFO: loaded from: classes5.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        String strJ;
        SplitMemberType.SplitMember splitMember = (SplitMemberType.SplitMember) obj2;
        String strJ2 = "";
        if (splitMember instanceof SplitMemberType.SplitMember.UserMember) {
            m70.a.c(t0.f186434a);
            strJ = "";
        } else {
            if (!(splitMember instanceof SplitMemberType.SplitMember.ContactMember)) {
                throw new NoWhenBranchMatchedException();
            }
            strJ = xam.a.j(((SplitMemberType.SplitMember.ContactMember) splitMember).f79217a);
        }
        SplitMemberType.SplitMember splitMember2 = (SplitMemberType.SplitMember) obj3;
        if (splitMember2 instanceof SplitMemberType.SplitMember.UserMember) {
            m70.a.c(t0.f186434a);
        } else {
            if (!(splitMember2 instanceof SplitMemberType.SplitMember.ContactMember)) {
                throw new NoWhenBranchMatchedException();
            }
            strJ2 = xam.a.j(((SplitMemberType.SplitMember.ContactMember) splitMember2).f79217a);
        }
        return cim.b.b(strJ, strJ2);
    }
}
