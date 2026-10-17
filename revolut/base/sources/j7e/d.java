package j7e;

import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.home_feed.api.widget.VaultWidgetContext;
import com.revolut.feature.subaccount.impl.R$string;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import dsh.r;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import zhm.u;

/* JADX INFO: loaded from: classes8.dex */
public final class d implements csh.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final g6e.d f171909b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f171910c;
    public final y91.b d;
    public final p38.a e;
    public final nhf.a f;

    public d(g6e.d subaccountInteractor, h linkedBillsWidgetMapper, y91.b accountsProductFeatureChecker, p38.a jointAccountsProductFeatureChecker, nhf.a unitedWalletInteractor) {
        Intrinsics.checkNotNullParameter(subaccountInteractor, "subaccountInteractor");
        Intrinsics.checkNotNullParameter(linkedBillsWidgetMapper, "linkedBillsWidgetMapper");
        Intrinsics.checkNotNullParameter(accountsProductFeatureChecker, "accountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(jointAccountsProductFeatureChecker, "jointAccountsProductFeatureChecker");
        Intrinsics.checkNotNullParameter(unitedWalletInteractor, "unitedWalletInteractor");
        this.f171909b = subaccountInteractor;
        this.f171910c = linkedBillsWidgetMapper;
        this.d = accountsProductFeatureChecker;
        this.e = jointAccountsProductFeatureChecker;
        this.f = unitedWalletInteractor;
    }

    public static int i(String str, dsh.e eVar) {
        if (!Intrinsics.f(str, "BillsList")) {
            throw new IllegalArgumentException(j6.a.q("Unsupported widget type:", str));
        }
        r.Companion.getClass();
        return r.a.b(eVar, 2);
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return u.c(r.a.a(r.Companion, inputConfig, null, String.valueOf(i(widgetType, inputConfig)), 6));
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        if (!Intrinsics.f(str, "BillsList")) {
            throw new IllegalArgumentException(j6.a.q("Unsupported widget type:", str));
        }
        dsh.e.Companion.getClass();
        return dsh.d.a();
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(id10, "id");
        return RowsWidgetDelegate.Model.Companion.b(RowsWidgetDelegate.Model.INSTANCE, id10, new TextLocalisedClause(R$string.bills_widget_header_title, null, null, 14), 1, null, 24);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final Object f(WidgetContext widgetContext, String str, String str2, dsh.e eVar, ish.f fVar) {
        throw new IllegalStateException(a0.d.r(str2, " doesn't support the catalogue preview mode"));
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x002c A[PHI: r11
      0x002c: PHI (r11v16 java.lang.String) = (r11v6 java.lang.String), (r11v18 java.lang.String) binds: [B:19:0x0063, B:5:0x002a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // csh.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.Flow g(com.revolut.feature.widgets.api.dependencies.WidgetContext r11, java.lang.String r12, java.lang.String r13, dsh.e r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j7e.d.g(com.revolut.feature.widgets.api.dependencies.WidgetContext, java.lang.String, java.lang.String, dsh.e):kotlinx.coroutines.flow.Flow");
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((VaultWidgetContext) widgetContext, str, eVar);
        return null;
    }
}
