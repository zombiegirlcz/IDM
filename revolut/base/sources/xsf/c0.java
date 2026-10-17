package xsf;

import com.revolut.feature.transfer_reasons.models.additional_info.AdditionalInfoField;
import java.util.Comparator;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes9.dex */
public final class c0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        int i;
        stf.b bVar = ((AdditionalInfoField) obj2).d;
        int[] iArr = b0.f308464a;
        int i2 = iArr[bVar.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            i = 2;
        } else if (i2 == 2) {
            i = 1;
        } else {
            if (i2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = 0;
        }
        Integer numValueOf = Integer.valueOf(i);
        int i5 = iArr[((AdditionalInfoField) obj3).d.ordinal()];
        if (i5 == 1) {
            i3 = 2;
        } else if (i5 == 2) {
            i3 = 1;
        } else if (i5 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return cim.b.b(numValueOf, Integer.valueOf(i3));
    }
}
