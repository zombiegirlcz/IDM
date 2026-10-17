package v30;

import com.revolut.chat.data.repository.chat.ChatRating;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
public abstract class r {
    public static final boolean a(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return zhm.v.k(s0.RESOLVED, s0.CLOSED).contains(jVar.e) && zhm.v.k(ChatRating.NotRated.f51018a, ChatRating.Postponed.f51019a).contains(jVar.i);
    }

    public static final boolean b(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        return jVar.e.a();
    }

    public static final boolean c(j jVar) {
        Intrinsics.checkNotNullParameter(jVar, "<this>");
        switch (q.f285815a[jVar.e.ordinal()]) {
            case 1:
            case 2:
            case 3:
                return true;
            case 4:
            case 5:
            case 6:
            case 7:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
