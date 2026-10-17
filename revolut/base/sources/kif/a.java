package kif;

import com.revolut.core.extensions.rx.BreadcrumbException;
import com.revolut.domain.exceptions.TransactionsTimeoutException;
import java.util.concurrent.CopyOnWriteArrayList;
import rd0.c;
import rd0.d;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class a {
    public static void a(long j2, BreadcrumbException breadcrumbException) {
        TransactionsTimeoutException transactionsTimeoutException = new TransactionsTimeoutException(p.a.n(j2, "Transactions have not emitted any data after ", "ms"), breadcrumbException);
        h0 h0Var = h0.f322473a;
        CopyOnWriteArrayList copyOnWriteArrayList = d.f253311a;
        d.a(c.ERROR, null, null, transactionsTimeoutException, h0Var);
    }
}
