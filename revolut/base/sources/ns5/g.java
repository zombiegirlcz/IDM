package ns5;

import a5g.i;
import ard.c0;
import com.revolut.core.ui_kit.delegates.widgets.BaseDraggableWidgetDelegate;
import com.revolut.core.ui_kit.delegates.widgets.RowsWidgetDelegate;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.feature.crypto_feed.impl.R$string;
import com.revolut.feature.crypto_feed.models.CryptoWidgetContext;
import com.revolut.feature.cryptocommodity_invest.models.SortingType;
import com.revolut.feature.widgets.api.dependencies.WidgetContext;
import dsh.j;
import dsh.r;
import java.util.List;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import njj.n;
import ny5.g;
import org.jetbrains.annotations.NotNull;
import tv5.a;
import zhm.f0;
import zhm.u;
import zi0.c;

/* JADX INFO: loaded from: classes3.dex */
public final class g implements csh.e {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ay5.b f218756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ny5.e f218757c;
    public final dsh.e d;

    public g(ay5.b allCryptoInteractor, ny5.e mapper) {
        Intrinsics.checkNotNullParameter(allCryptoInteractor, "allCryptoInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        this.f218756b = allCryptoInteractor;
        this.f218757c = mapper;
        dsh.f fVar = new dsh.f();
        r.Companion.getClass();
        fVar.a("itemsCountLimit", "5");
        this.d = new dsh.e(fVar);
    }

    @Override // csh.e
    public final List a(String widgetType, dsh.e inputConfig) {
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(inputConfig, "inputConfig");
        return Intrinsics.f(widgetType, "AllCryptoDynamic") ? u.c(r.a.a(r.Companion, inputConfig, null, "5", 6)) : super.a(widgetType, inputConfig);
    }

    @Override // csh.e
    public final Object b(String str, gim.c cVar) {
        return this.d;
    }

    @Override // csh.e
    public final Object c(String str, Continuation continuation) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final BaseDraggableWidgetDelegate.Model d(String id10, String widgetType, dsh.e eVar) {
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        RowsWidgetDelegate.Model.Companion companion = RowsWidgetDelegate.Model.INSTANCE;
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.crypto_home_widget_all_crypto_title, null, null, 14);
        r.Companion.getClass();
        return RowsWidgetDelegate.Model.Companion.b(companion, id10, textLocalisedClause, r.a.b(eVar, 5), null, 24);
    }

    @Override // csh.e
    public final /* bridge */ /* synthetic */ Object e(WidgetContext widgetContext, String str, ish.e eVar) {
        return Boolean.TRUE;
    }

    @Override // csh.e
    public final /* bridge */ j h(WidgetContext widgetContext, String str, dsh.e eVar) {
        super.h((CryptoWidgetContext) widgetContext, str, eVar);
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // csh.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext r5, java.lang.String r6, java.lang.String r7, dsh.e r8, kotlin.coroutines.Continuation r9) {
        /*
            r4 = this;
            boolean r8 = r9 instanceof ns5.b
            if (r8 == 0) goto L13
            r8 = r9
            ns5.b r8 = (ns5.b) r8
            int r0 = r8.A
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r8.A = r0
            goto L1a
        L13:
            ns5.b r8 = new ns5.b
            gim.c r9 = (gim.c) r9
            r8.<init>(r4, r9)
        L1a:
            java.lang.Object r9 = r8.f218749y
            fim.a r0 = fim.a.COROUTINE_SUSPENDED
            int r1 = r8.A
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L40
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2c
            yhm.o.b(r9)
            return r9
        L2c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L34:
            java.lang.String r7 = r8.f218748x
            java.lang.String r6 = r8.f218747w
            com.revolut.feature.crypto_feed.models.CryptoWidgetContext r5 = r8.v
            ns5.g r1 = r8.u
            yhm.o.b(r9)
            goto L53
        L40:
            yhm.o.b(r9)
            r8.u = r4
            r8.v = r5
            r8.f218747w = r6
            r8.f218748x = r7
            r8.A = r3
            dsh.e r9 = r4.d
            if (r9 != r0) goto L52
            goto L6a
        L52:
            r1 = r4
        L53:
            dsh.e r9 = (dsh.e) r9
            kotlinx.coroutines.flow.Flow r5 = r1.g(r5, r6, r7, r9)
            r6 = 0
            r8.u = r6
            r8.v = r6
            r8.f218747w = r6
            r8.f218748x = r6
            r8.A = r2
            java.lang.Object r5 = vkm.q.x(r5, r8)
            if (r5 != r0) goto L6b
        L6a:
            return r0
        L6b:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ns5.g.f(com.revolut.feature.crypto_feed.models.CryptoWidgetContext, java.lang.String, java.lang.String, dsh.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // csh.e
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public final Flow g(CryptoWidgetContext widgetContext, String id10, String widgetType, dsh.e config) {
        Intrinsics.checkNotNullParameter(widgetContext, "widgetContext");
        Intrinsics.checkNotNullParameter(id10, "id");
        Intrinsics.checkNotNullParameter(widgetType, "widgetType");
        Intrinsics.checkNotNullParameter(config, "config");
        r.Companion.getClass();
        int iB = r.a.b(config, 5) + 1;
        final ay5.b bVar = this.f218756b;
        final int i = 1;
        final int i2 = 0;
        return new c0(new n(rd0.e.b(pd.b.r(nim.a.w(nim.a.w(kli.a.h(zi0.c.o(((xv5.h) bVar.f11071a).a(a.b.f274717a)), zi0.c.o(bVar.d.a(false))), new Function1() { // from class: ay5.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i;
                b bVar2 = bVar;
                switch (i3) {
                    case 0:
                        List sortedCurrencies = (List) obj2;
                        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
                        g gVar = bVar2.f11072b;
                        return nim.a.w(kli.a.h(c.o(gVar.a(sortedCurrencies)), c.o(gVar.b(sortedCurrencies, tzg.j.ONE_DAY))), new a26.j(sortedCurrencies, 22));
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        List list = (List) pair.f186385a;
                        List list2 = (List) pair.f186386b;
                        if (!list2.isEmpty()) {
                            return ny5.u.b(ny5.u.a(new SortingType.MarketCap(ty5.a.DESCENDING), list2), list);
                        }
                        ny5.c cVar = bVar2.f11073c;
                        ny5.a aVar = ny5.c.Companion;
                        return cVar.a(list, f0.f322471a);
                }
            }
        }), new i(iB, 7)), new Function1() { // from class: ay5.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                int i3 = i2;
                b bVar2 = bVar;
                switch (i3) {
                    case 0:
                        List sortedCurrencies = (List) obj2;
                        Intrinsics.checkNotNullParameter(sortedCurrencies, "sortedCurrencies");
                        g gVar = bVar2.f11072b;
                        return nim.a.w(kli.a.h(c.o(gVar.a(sortedCurrencies)), c.o(gVar.b(sortedCurrencies, tzg.j.ONE_DAY))), new a26.j(sortedCurrencies, 22));
                    default:
                        Pair pair = (Pair) obj2;
                        Intrinsics.checkNotNullParameter(pair, "<destruct>");
                        List list = (List) pair.f186385a;
                        List list2 = (List) pair.f186386b;
                        if (!list2.isEmpty()) {
                            return ny5.u.b(ny5.u.a(new SortingType.MarketCap(ty5.a.DESCENDING), list2), list);
                        }
                        ny5.c cVar = bVar2.f11073c;
                        ny5.a aVar = ny5.c.Companion;
                        return cVar.a(list, f0.f322471a);
                }
            }
        })), 9), this, id10, config, 15);
    }
}
