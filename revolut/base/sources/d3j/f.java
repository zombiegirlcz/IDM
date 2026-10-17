package d3j;

import f5j.k;
import f5j.n;
import f5j.p;
import f5j.q;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class f {
    public static String a(k suggestionData) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(suggestionData, "suggestionData");
        q qVar = suggestionData.f132354b;
        f5j.i iVar = suggestionData.f132353a;
        if (qVar instanceof n) {
            str = ((n) qVar).f132355a;
        } else {
            if (!(qVar instanceof p)) {
                throw new NoWhenBranchMatchedException();
            }
            str = ((p) qVar).d;
        }
        f5j.h hVar = iVar.f132350a;
        int i = e.f111215a[qVar.getContext().ordinal()];
        if (i == 1 || i == 2) {
            str2 = "CREATION";
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            str2 = "CHAT";
        }
        return str2 + "_" + hVar + "_" + str;
    }
}
