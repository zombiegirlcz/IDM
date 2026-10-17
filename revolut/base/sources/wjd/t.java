package wjd;

import com.revolut.sso.api.signin_social.LinkSocialAccountControllerModelExtension$SocialAccount;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes7.dex */
public final class t implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        int i;
        hjl.c cVar = ((LinkSocialAccountControllerModelExtension$SocialAccount) obj2).f106023a;
        int[] iArr = s.f298064b;
        int i2 = iArr[cVar.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            i = 0;
        } else if (i2 == 2) {
            i = 1;
        } else if (i2 == 3) {
            i = 2;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = 3;
        }
        Integer numValueOf = Integer.valueOf(i);
        int i5 = iArr[((LinkSocialAccountControllerModelExtension$SocialAccount) obj3).f106023a.ordinal()];
        if (i5 != 1) {
            if (i5 == 2) {
                i3 = 1;
            } else if (i5 == 3) {
                i3 = 2;
            } else {
                if (i5 != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i3 = 3;
            }
        }
        return cim.b.b(numValueOf, Integer.valueOf(i3));
    }
}
