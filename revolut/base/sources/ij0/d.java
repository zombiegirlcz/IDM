package ij0;

import com.revolut.core.account.region.domain.model.AccountRegion;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yhm.j;
import yhm.m;
import yhm.n;
import yhm.o;

/* JADX INFO: loaded from: classes19.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x60.a f161667a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Lazy f161668b;

    public d(String baseUrl, List revolutHosts, x60.a accountRegionProvider) {
        Intrinsics.checkNotNullParameter(baseUrl, "baseUrl");
        Intrinsics.checkNotNullParameter(revolutHosts, "revolutHosts");
        Intrinsics.checkNotNullParameter(accountRegionProvider, "accountRegionProvider");
        this.f161667a = accountRegionProvider;
        this.f161668b = j.b(new i1d.b(baseUrl, revolutHosts, this));
    }

    public final boolean a(String url2) {
        Object objA;
        Intrinsics.checkNotNullParameter(url2, "url");
        try {
            m.Companion companion = m.INSTANCE;
            objA = URI.create(url2).getHost();
        } catch (Throwable th10) {
            m.Companion companion2 = m.INSTANCE;
            objA = o.a(th10);
        }
        if (objA instanceof n) {
            objA = null;
        }
        String str = (String) objA;
        if (str == null) {
            return false;
        }
        od0.a aVar = od0.a.f224253a;
        if (od0.a.e() && a0.y(str, "failover.revolut.codes", false)) {
            return true;
        }
        String strA = ((x60.c) this.f161667a).a();
        List<String> list = (List) this.f161668b.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (String str2 : list) {
            if (!str.equals(str2)) {
                AccountRegion.INSTANCE.getClass();
                if (!strA.equals("undefined")) {
                    int i = 0;
                    for (int i2 = 0; i2 < str2.length(); i2++) {
                        if (str2.charAt(i2) == '.') {
                            i++;
                        }
                    }
                    if (i >= 2) {
                        if (Intrinsics.f(strA + "-" + str2, str)) {
                        }
                    } else {
                        continue;
                    }
                }
            }
            return true;
        }
        return false;
    }
}
