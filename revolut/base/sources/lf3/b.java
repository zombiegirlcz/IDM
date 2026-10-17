package lf3;

import com.revolut.chat.domain.model.ChatFeed;
import com.revolut.chat.domain.model.ChatTarget;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import v30.a0;
import v30.c0;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes21.dex */
public abstract class b {
    public static final ChatTarget.Messages a(String str, String str2, UUID uuid) {
        Object objA;
        UUID uuid2;
        c0 c0VarA;
        ChatFeed support;
        if (str != null) {
            try {
                m.Companion companion = m.INSTANCE;
                objA = UUID.fromString(str);
            } catch (Throwable th10) {
                m.Companion companion2 = m.INSTANCE;
                objA = o.a(th10);
            }
            if (objA instanceof n) {
                objA = null;
            }
            uuid2 = (UUID) objA;
        } else {
            uuid2 = null;
        }
        if (str2 != null) {
            c0.Companion.getClass();
            c0VarA = a0.a(str2);
        } else {
            c0VarA = null;
        }
        if (uuid2 == null || c0VarA == null) {
            return new ChatTarget.Messages(new ChatFeed.Support(uuid, null, null, 6), null, null, 6);
        }
        int i = a.f194632a[c0VarA.ordinal()];
        if (i == 1) {
            support = new ChatFeed.Support(uuid, uuid2, null, 4);
        } else if (i == 2) {
            support = new ChatFeed.Assistant(uuid2, null, false, 6);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            support = new ChatFeed.PrivateBanking(uuid2);
        }
        return new ChatTarget.Messages(support, null, null, 6);
    }
}
