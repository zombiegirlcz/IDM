package c35;

import ft3.a1;
import ft3.g1;
import ft3.s0;
import ft3.x0;
import ft3.z0;
import grl.r2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import l9.l;
import qf1.h;
import qf1.j;
import qf1.k;

/* JADX INFO: loaded from: classes22.dex */
public final class a implements pf1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f20875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b35.a f20876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final gz3.a f20877c;

    public a(b35.a creditApplicationAccountIconProvider, gz3.a startCreditApplicationNavigationDestinationProvider) {
        this.f20875a = 0;
        Intrinsics.checkNotNullParameter(creditApplicationAccountIconProvider, "creditApplicationAccountIconProvider");
        Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
        this.f20876b = creditApplicationAccountIconProvider;
        this.f20877c = startCreditApplicationNavigationDestinationProvider;
    }

    @Override // pf1.a
    public final k a(qf1.d dVar) {
        switch (this.f20875a) {
            case 0:
                mp3.d item = (mp3.d) dVar;
                Intrinsics.checkNotNullParameter(item, "item");
                return this.f20876b.a(item);
            case 1:
                mp3.d item2 = (mp3.d) dVar;
                Intrinsics.checkNotNullParameter(item2, "item");
                return this.f20876b.a(item2);
            default:
                mp3.d item3 = (mp3.d) dVar;
                Intrinsics.checkNotNullParameter(item3, "item");
                return this.f20876b.a(item3);
        }
    }

    @Override // pf1.a
    public final List b(qf1.d dVar) {
        switch (this.f20875a) {
            case 0:
                mp3.d item = (mp3.d) dVar;
                Intrinsics.checkNotNullParameter(item, "item");
                return this.f20876b.b(item);
            case 1:
                mp3.d item2 = (mp3.d) dVar;
                Intrinsics.checkNotNullParameter(item2, "item");
                return b35.g.c(item2.f207724b);
            default:
                mp3.d item3 = (mp3.d) dVar;
                Intrinsics.checkNotNullParameter(item3, "item");
                return b35.g.c(item3.f207724b);
        }
    }

    @Override // pf1.a
    public final j c(qf1.d dVar) {
        switch (this.f20875a) {
            case 0:
                mp3.d item = (mp3.d) dVar;
                Intrinsics.checkNotNullParameter(item, "item");
                return new h(this.f20877c.c(g1.d(l.J(fs3.b.Companion, item.f207724b), null, null, 3), new a1(r2.ADD_NEW_PRODUCT, null, z0.BALANCE_TRANSFER, null, null, 26), wp3.a.OPEN_EXISTING_APPLICATION, yp3.d.DEFAULT, (1916 & 16) != 0 ? null : null, (1916 & 32) != 0 ? yp3.f.SHOW_ALL : null, yp3.c.DEFAULT, (1916 & 128) != 0 ? yp3.e.SKIP_ON_TOGGLE_DISABLED : null, yp3.b.DEFAULT, (1916 & 512) != 0 ? null : null, null));
            case 1:
                mp3.d item2 = (mp3.d) dVar;
                Intrinsics.checkNotNullParameter(item2, "item");
                return new h(this.f20877c.c(g1.d(l.J(fs3.b.Companion, item2.f207724b), null, null, 3), new a1(r2.ADD_NEW_PRODUCT, null, null, s0.f137872a, null, 22), wp3.a.OPEN_EXISTING_APPLICATION, yp3.d.DEFAULT, (1916 & 16) != 0 ? null : null, (1916 & 32) != 0 ? yp3.f.SHOW_ALL : yp3.f.SKIP_ALL, yp3.c.DEFAULT, (1916 & 128) != 0 ? yp3.e.SKIP_ON_TOGGLE_DISABLED : null, yp3.b.DEFAULT, (1916 & 512) != 0 ? null : null, null));
            default:
                mp3.d item3 = (mp3.d) dVar;
                Intrinsics.checkNotNullParameter(item3, "item");
                return new h(this.f20877c.c(g1.d(l.J(fs3.b.Companion, item3.f207724b), null, null, 3), new a1(r2.ADD_NEW_PRODUCT, null, null, x0.f137890a, null, 22), wp3.a.OPEN_EXISTING_APPLICATION, yp3.d.DEFAULT, (1916 & 16) != 0 ? null : null, (1916 & 32) != 0 ? yp3.f.SHOW_ALL : yp3.f.SKIP_ALL, yp3.c.DEFAULT, (1916 & 128) != 0 ? yp3.e.SKIP_ON_TOGGLE_DISABLED : null, yp3.b.DEFAULT, (1916 & 512) != 0 ? null : null, null));
        }
    }

    public a(b35.a creditApplicationAccountIconProvider, b35.g creditSearchKeywordsMapper, gz3.a startCreditApplicationNavigationDestinationProvider, int i) {
        this.f20875a = i;
        switch (i) {
            case 2:
                Intrinsics.checkNotNullParameter(creditApplicationAccountIconProvider, "creditApplicationAccountIconProvider");
                Intrinsics.checkNotNullParameter(creditSearchKeywordsMapper, "creditSearchKeywordsMapper");
                Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
                this.f20876b = creditApplicationAccountIconProvider;
                this.f20877c = startCreditApplicationNavigationDestinationProvider;
                break;
            default:
                Intrinsics.checkNotNullParameter(creditApplicationAccountIconProvider, "creditApplicationAccountIconProvider");
                Intrinsics.checkNotNullParameter(creditSearchKeywordsMapper, "creditSearchKeywordsMapper");
                Intrinsics.checkNotNullParameter(startCreditApplicationNavigationDestinationProvider, "startCreditApplicationNavigationDestinationProvider");
                this.f20876b = creditApplicationAccountIconProvider;
                this.f20877c = startCreditApplicationNavigationDestinationProvider;
                break;
        }
    }
}
