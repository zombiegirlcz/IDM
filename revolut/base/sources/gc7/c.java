package gc7;

import com.revolut.core.ui_kit.delegates.widgets.QuickActionWidgetDelegate;
import fy1.q;
import jq9.a0;
import jq9.b0;
import jq9.k;
import jq9.l;
import jq9.m;
import jq9.n;
import jq9.o;
import jq9.p;
import jq9.r;
import jq9.s;
import jq9.t;
import jq9.u;
import jq9.v;
import jq9.w;
import jq9.x;
import jq9.y;
import jq9.z;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import mra.i;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class c {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ex9.a f142367a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ex9.b f142368b;

    public c(ex9.a recentsMapper, ex9.b paymentRecipientMapper, d feedWidgetItemsFactory) {
        Intrinsics.checkNotNullParameter(recentsMapper, "recentsMapper");
        Intrinsics.checkNotNullParameter(paymentRecipientMapper, "paymentRecipientMapper");
        Intrinsics.checkNotNullParameter(feedWidgetItemsFactory, "feedWidgetItemsFactory");
        this.f142367a = recentsMapper;
        this.f142368b = paymentRecipientMapper;
    }

    public final QuickActionWidgetDelegate.Model a(String listId, k recipient, boolean z) {
        QuickActionWidgetDelegate.Model modelE;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        qx9.a aVar = (qx9.a) this.f142367a;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        if (recipient instanceof p) {
            p pVar = (p) recipient;
            modelE = ((xl3.d) aVar.f250046a).n(listId, pVar.f177514b, pVar.d, z);
        } else if (recipient instanceof m) {
            m mVar = (m) recipient;
            modelE = aVar.f250047b.d(listId, mVar.f177508b, mVar.d);
        } else if (recipient instanceof n) {
            n nVar = (n) recipient;
            modelE = ((i) aVar.f250048c).e(listId, nVar.f177510b.f81495a, nVar.d);
        } else if (recipient instanceof s) {
            s sVar = (s) recipient;
            modelE = ((tr9.c) aVar.d).c(listId, sVar.f177520b, sVar.d);
        } else if (recipient instanceof r) {
            r rVar = (r) recipient;
            modelE = ((bp5.b) aVar.e).c(listId, rVar.f177518b, rVar.d);
        } else if (recipient instanceof o) {
            o oVar = (o) recipient;
            modelE = ((db6.a) aVar.f).b(listId, oVar.f177512b, oVar.d);
        } else if (recipient instanceof l) {
            l lVar = (l) recipient;
            modelE = ((q) aVar.f250049g).i(listId, lVar.f177506b, lVar.d);
        } else {
            if (!(recipient instanceof jq9.q)) {
                throw new NoWhenBranchMatchedException();
            }
            jq9.q qVar = (jq9.q) recipient;
            modelE = ((do9.d) aVar.f250050h).e(listId, qVar.f177516b, qVar.d);
        }
        return QuickActionWidgetDelegate.Model.E(modelE, recipient);
    }

    public final QuickActionWidgetDelegate.Model b(String listId, t recipient, int i, boolean z) {
        QuickActionWidgetDelegate.Model modelE;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        qx9.b bVar = (qx9.b) this.f142368b;
        Intrinsics.checkNotNullParameter(listId, "listId");
        Intrinsics.checkNotNullParameter(recipient, "recipient");
        if (recipient instanceof y) {
            modelE = ((xl3.d) bVar.f250054a).n(listId, ((y) recipient).f177526a, i, z);
        } else if (recipient instanceof v) {
            modelE = bVar.f250055b.d(listId, ((v) recipient).f177523a, i);
        } else if (recipient instanceof w) {
            modelE = ((i) bVar.f250056c).e(listId, ((w) recipient).f177524a.f81495a, i);
        } else if (recipient instanceof b0) {
            modelE = ((tr9.c) bVar.d).c(listId, ((b0) recipient).f177496a, i);
        } else if (recipient instanceof a0) {
            modelE = ((bp5.b) bVar.e).c(listId, ((a0) recipient).f177495a, i);
        } else if (recipient instanceof x) {
            modelE = ((db6.a) bVar.f).b(listId, ((x) recipient).f177525a, i);
        } else if (recipient instanceof u) {
            modelE = ((q) bVar.f250057g).i(listId, ((u) recipient).f177522a, i);
        } else {
            if (!(recipient instanceof z)) {
                throw new NoWhenBranchMatchedException();
            }
            modelE = ((do9.d) bVar.f250058h).e(listId, ((z) recipient).f177527a, i);
        }
        return QuickActionWidgetDelegate.Model.E(modelE, recipient);
    }
}
