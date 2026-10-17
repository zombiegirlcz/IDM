package k7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.retail.savings.api.R$string;
import com.revolut.feature.subaccount.api.models.SubaccountType;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import s6e.z;
import vkm.q;
import wsg.n;
import zhm.h0;

/* JADX INFO: loaded from: classes8.dex */
public final class f implements csh.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final n f182047b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g6e.d f182048c;
    public final mt8.d d;
    public final j e;
    public final ang.f f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final al4.b f182049g;

    public f(n walletInteractor, g6e.d subaccountInteractor, mt8.d kycInteractor, j linkedCardWidgetMapper, ang.f userInteractor, al4.b comboCardInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(kycInteractor, "kycInteractor");
        Intrinsics.checkNotNullParameter(linkedCardWidgetMapper, "linkedCardWidgetMapper");
        Intrinsics.checkNotNullParameter(userInteractor, "userInteractor");
        Intrinsics.checkNotNullParameter(comboCardInteractor, "comboCardInteractor");
        this.f182047b = walletInteractor;
        this.f182048c = subaccountInteractor;
        this.d = kycInteractor;
        this.e = linkedCardWidgetMapper;
        this.f = userInteractor;
        this.f182049g = comboCardInteractor;
    }

    public static SubaccountType j(VaultWidgetContext.Type type) {
        if (type instanceof VaultWidgetContext.Type.JointPockets) {
            return SubaccountType.Joint.f88961a;
        }
        if (type instanceof VaultWidgetContext.Type.JuniorPockets) {
            return SubaccountType.Junior.f88962a;
        }
        if (type instanceof VaultWidgetContext.Type.Pockets) {
            return SubaccountType.Personal.f88963a;
        }
        if (type instanceof VaultWidgetContext.Type.ProRegularPockets) {
            return SubaccountType.Pro.f88964a;
        }
        if (type instanceof VaultWidgetContext.Type.ProTaxPockets) {
            return SubaccountType.ProTax.f88965a;
        }
        if ((type instanceof VaultWidgetContext.Type.TeenPockets) || (type instanceof VaultWidgetContext.Type.Savings) || (type instanceof VaultWidgetContext.Type.JointSavings) || (type instanceof VaultWidgetContext.Type.JuniorSavings)) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.valueOf(!((z) this.f182048c).k().f5338a.isEmpty());
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(id10, "id");
        return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.savings_home_widgets_payments_linked_card_title, null, null, 14), 1, null, 24);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return i((VaultWidgetContext) widgetContext, eVar);
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        throw new IllegalStateException(a0.d.r(str2, " doesn't support the catalogue preview mode"));
    }

    @Override // csh.e
    public final Flow g(WidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        VaultWidgetContext widgetContext2 = (VaultWidgetContext) widgetContext;
        Intrinsics.checkNotNullParameter(widgetContext2, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        SubaccountType subaccountTypeJ = j(widgetContext2.f74721b);
        if (subaccountTypeJ != null) {
            g6e.d dVar = this.f182048c;
            if (((z) dVar).k().f5338a.containsKey(subaccountTypeJ)) {
                return rd0.e.e(q.Q(mo3.a.g(((z) dVar).v(widgetContext2.f74721b.getF74730a(), subaccountTypeJ), null, new k1f.n(27), 1), new b(id10, this, null)), h0.f322473a, new e(id10, this, null));
            }
        }
        return org.bouncycastle.jcajce.provider.digest.a.s(3, null);
    }

    @Override // csh.e
    public final /* bridge */ dsh.j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((VaultWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object i(com.revolut.feature.home_feed.api.widget.VaultWidgetContext r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof k7e.a
            if (r0 == 0) goto L13
            r0 = r7
            k7e.a r0 = (k7e.a) r0
            int r1 = r0.f182037w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f182037w = r1
            goto L1a
        L13:
            k7e.a r0 = new k7e.a
            gim.c r7 = (gim.c) r7
            r0.<init>(r5, r7)
        L1a:
            java.lang.Object r7 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f182037w
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            yhm.o.b(r7)
            goto L5e
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            yhm.o.b(r7)
            com.revolut.feature.home_feed.api.widget.VaultWidgetContext$Type r7 = r6.f74721b
            com.revolut.feature.subaccount.api.models.SubaccountType r7 = j(r7)
            if (r7 == 0) goto L6d
            g6e.d r2 = r5.f182048c
            r4 = r2
            s6e.z r4 = (s6e.z) r4
            aim.o r4 = r4.k()
            aim.f r4 = r4.f5338a
            boolean r4 = r4.containsKey(r7)
            if (r4 == 0) goto L6d
            com.revolut.feature.home_feed.api.widget.VaultWidgetContext$Type r6 = r6.f74721b
            java.lang.String r6 = r6.getF74730a()
            r0.f182037w = r3
            s6e.z r2 = (s6e.z) r2
            java.lang.Object r7 = r2.j(r6, r7, r0)
            if (r7 != r1) goto L5e
            return r1
        L5e:
            com.revolut.feature.subaccount.api.models.Subaccount r7 = (com.revolut.feature.subaccount.api.models.Subaccount) r7
            if (r7 == 0) goto L6d
            xi0.b r6 = r7.getCurrency()
            boolean r6 = cp5.d.A(r6)
            if (r6 != r3) goto L6d
            goto L6e
        L6d:
            r3 = 0
        L6e:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r3)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: k7e.f.i(com.revolut.feature.home_feed.api.widget.VaultWidgetContext, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
