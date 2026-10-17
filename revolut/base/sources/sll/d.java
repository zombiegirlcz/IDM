package sll;

import com.revolut.sso.api.models.RevolutAccountSession;
import java.util.Comparator;

/* JADX INFO: loaded from: classes12.dex */
public final class d implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj2, Object obj3) {
        return cim.b.b(((RevolutAccountSession) obj3).f105975c, ((RevolutAccountSession) obj2).f105975c);
    }
}
