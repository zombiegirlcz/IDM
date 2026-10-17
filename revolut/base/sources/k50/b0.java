package k50;

import com.revolut.chat.data.repository.chat.User;
import w30.e;

/* JADX INFO: loaded from: classes19.dex */
public final class b0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static boolean a(v20.n nVar) {
        if (nVar == 0) {
            return false;
        }
        if (nVar.getAuthor() instanceof User) {
            return true;
        }
        if (nVar instanceof v20.j) {
            v20.h initializedBy = ((v20.j) nVar).getInitializedBy();
            if (initializedBy == null) {
                initializedBy = v20.h.AGENT;
            }
            if (initializedBy == v20.h.CLIENT) {
                return true;
            }
        }
        if (!(nVar instanceof v20.e)) {
            return false;
        }
        e.Companion companion = w30.e.INSTANCE;
        String callDirection = ((v20.e) nVar).getCallDirection();
        companion.getClass();
        return e.Companion.a(callDirection) != w30.e.AGENT_TO_CLIENT;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:4:0x001d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(v20.n r17, v20.n r18, org.joda.time.DateTimeZone r19) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k50.b0.b(v20.n, v20.n, org.joda.time.DateTimeZone):boolean");
    }
}
