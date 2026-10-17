package be9;

import com.revolut.core.ui_kit.models.Clause;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import yd9.n;
import zsc.k;
import zsc.m;
import zsc.r;

/* JADX INFO: loaded from: classes5.dex */
public final class h extends zsc.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f14729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zsc.d f14730c;

    public h(k recurringOrderFilter, k exchangeOrderFilter) {
        this.f14728a = 3;
        Intrinsics.checkNotNullParameter(recurringOrderFilter, "recurringOrderFilter");
        Intrinsics.checkNotNullParameter(exchangeOrderFilter, "exchangeOrderFilter");
        this.f14729b = recurringOrderFilter;
        this.f14730c = exchangeOrderFilter;
    }

    @Override // zsc.d
    public final boolean a(Object obj2) {
        switch (this.f14728a) {
            case 0:
                wd9.b value = (wd9.b) obj2;
                Intrinsics.checkNotNullParameter(value, "value");
                return this.f14730c.a(((f01.c) this.f14729b).b(n.a(value.f296467a)).toString());
            case 1:
                wd9.b value2 = (wd9.b) obj2;
                Intrinsics.checkNotNullParameter(value2, "value");
                return this.f14730c.a(((f01.c) this.f14729b).b(n.b(value2.f296467a)).toString());
            case 2:
                return b((List) obj2);
            default:
                wd9.c value3 = (wd9.c) obj2;
                Intrinsics.checkNotNullParameter(value3, "value");
                if (value3 instanceof wd9.b) {
                    return ((k) this.f14729b).a(value3);
                }
                if (value3 instanceof wd9.a) {
                    return ((k) this.f14730c).a(value3);
                }
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean b(List value) {
        Intrinsics.checkNotNullParameter(value, "value");
        List list = value;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it8 = list.iterator();
        while (it8.hasNext()) {
            if (this.f14730c.a(((f01.c) this.f14729b).b((Clause) it8.next()).toString())) {
                return true;
            }
        }
        return false;
    }

    public h(m query, f01.c uiKitResources, int i) {
        this.f14728a = i;
        switch (i) {
            case 1:
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                r stringFilterFactory = r.f324883a;
                Intrinsics.checkNotNullParameter(stringFilterFactory, "stringFilterFactory");
                this.f14729b = uiKitResources;
                this.f14730c = stringFilterFactory.a(query);
                break;
            case 2:
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                r stringFilterFactory2 = r.f324883a;
                Intrinsics.checkNotNullParameter(stringFilterFactory2, "stringFilterFactory");
                this.f14729b = uiKitResources;
                this.f14730c = stringFilterFactory2.a(query);
                break;
            default:
                Intrinsics.checkNotNullParameter(query, "query");
                Intrinsics.checkNotNullParameter(uiKitResources, "uiKitResources");
                r stringFilterFactory3 = r.f324883a;
                Intrinsics.checkNotNullParameter(stringFilterFactory3, "stringFilterFactory");
                this.f14729b = uiKitResources;
                this.f14730c = stringFilterFactory3.a(query);
                break;
        }
    }
}
