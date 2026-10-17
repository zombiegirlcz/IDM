package vvh;

import android.content.Intent;
import android.util.SparseIntArray;
import bn2.p;
import com.revolut.core.ui_kit.models.Clause;
import com.revolut.core.ui_kit.models.Custom;
import com.revolut.core.ui_kit.models.MoneyClause;
import com.revolut.core.ui_kit.models.NavBarWithContainerBackground;
import com.revolut.core.ui_kit.models.TextLocalisedClause;
import com.revolut.core.ui_kit_core.displayers.image.Image;
import com.revolut.core.ui_kit_resources.R$attr;
import com.revolut.core.ui_kit_resources.R$drawable;
import com.revolut.feature.backgroundpicker.models.EntityInfo;
import com.revolut.feature.backgroundpicker.models.RetailBackgroundKey;
import com.revolut.feature_account_widget.impl.R$string;
import com.revolut.feature_account_widget.impl.configuration.AccountWidgetConfigActivity;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p01.a0;
import p01.u;
import p01.w;
import vkm.q;
import vrl.i0;
import wsg.n;
import zhm.r0;

/* JADX INFO: loaded from: classes10.dex */
public final class l {

    @NotNull
    public static final c Companion = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n f292555a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zd0.a f292556b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kq.h f292557c;
    public final a d;
    public final p e;

    public l(n walletInteractor, zd0.a currencyInitializationHelper, kq.h appWidgetsRepository, a intentFactory, p backgroundsInteractor) {
        Intrinsics.checkNotNullParameter(walletInteractor, "walletInteractor");
        Intrinsics.checkNotNullParameter(currencyInitializationHelper, "currencyInitializationHelper");
        Intrinsics.checkNotNullParameter(appWidgetsRepository, "appWidgetsRepository");
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        Intrinsics.checkNotNullParameter(backgroundsInteractor, "backgroundsInteractor");
        this.f292555a = walletInteractor;
        this.f292556b = currencyInitializationHelper;
        this.f292557c = appWidgetsRepository;
        this.d = intentFactory;
        this.e = backgroundsInteractor;
    }

    public static final p01.d a(l lVar, Image image, NavBarWithContainerBackground navBarWithContainerBackground, Clause clause, MoneyClause moneyClause, TextLocalisedClause textLocalisedClause, String str, boolean z) {
        Image image2;
        Image image3;
        a aVar = lVar.d;
        a0 a0Var = new a0(clause, image, moneyClause, textLocalisedClause != null ? new w(textLocalisedClause) : null, z);
        if (navBarWithContainerBackground instanceof NavBarWithContainerBackground.ImageBackground) {
            NavBarWithContainerBackground.ImageBackground imageBackground = (NavBarWithContainerBackground.ImageBackground) navBarWithContainerBackground;
            image3 = imageBackground.f57881c;
            if (image3 == null) {
                image3 = imageBackground.f57879a;
            }
        } else {
            if (!(navBarWithContainerBackground instanceof NavBarWithContainerBackground.VideoBackground)) {
                if (!(navBarWithContainerBackground instanceof NavBarWithContainerBackground.TransparentBackground)) {
                    throw new NoWhenBranchMatchedException();
                }
                image2 = null;
                SparseIntArray sparseIntArray = vw0.a.f292608a;
                return new p01.d(a0Var, image2, new p01.l(vw0.a.a(R$drawable.uikit_icn_24_plus), new k01.c(aVar.a(str, "add_money"))), new p01.l(vw0.a.a(R$drawable.uikit_icn_24_arrow_exchange), new k01.c(aVar.a(str, "exchange"))), new k01.c(aVar.a(str, null)));
            }
            image3 = ((NavBarWithContainerBackground.VideoBackground) navBarWithContainerBackground).f57884b;
        }
        image2 = image3;
        SparseIntArray sparseIntArray2 = vw0.a.f292608a;
        return new p01.d(a0Var, image2, new p01.l(vw0.a.a(R$drawable.uikit_icn_24_plus), new k01.c(aVar.a(str, "add_money"))), new p01.l(vw0.a.a(R$drawable.uikit_icn_24_arrow_exchange), new k01.c(aVar.a(str, "exchange"))), new k01.c(aVar.a(str, null)));
    }

    public static final jhi.b b(l lVar, String str, xi0.b bVar) {
        RetailBackgroundKey.PersonalCurrency personalCurrency;
        if (str.equals("PocketsSummary")) {
            uy5.e.Companion.getClass();
            personalCurrency = new RetailBackgroundKey.PersonalCurrency(uy5.d.f284077b, bVar, new EntityInfo(md6.e.CURRENCY, md6.f.AGGREGATED, null, 4));
        } else {
            personalCurrency = new RetailBackgroundKey.PersonalCurrency(str, bVar, new EntityInfo(md6.e.CURRENCY, md6.f.SIMPLE, null, 4));
        }
        return mo3.a.g(nim.a.v(lVar.e.g(personalCurrency), new i0(27)), null, new vv7.l(1), 1);
    }

    public static final u c(l lVar, int i) {
        TextLocalisedClause textLocalisedClause = new TextLocalisedClause(R$string.account_widget_get_started, null, new Custom(Integer.valueOf(R$attr.uikit_colorAccent), false, null, false, null, 254), 10);
        Intent intentPutExtra = new Intent(lVar.d.f292542a, (Class<?>) AccountWidgetConfigActivity.class).putExtra("appWidgetId", i);
        Intrinsics.checkNotNullExpressionValue(intentPutExtra, "putExtra(...)");
        return new u(textLocalisedClause, new k01.c(intentPutExtra));
    }

    public static final boolean d(l lVar, io3.d dVar) {
        if (dVar.f163149h != io3.i.INTERNAL || dVar.e != io3.l.CURRENT) {
            return false;
        }
        io3.k kVar = dVar.f;
        return (kVar == io3.k.ACTIVE || kVar == io3.k.INACTIVE) && h30.l.D(xi0.b.Companion, dVar.f163147c);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(gim.c r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof vvh.h
            if (r0 == 0) goto L13
            r0 = r5
            vvh.h r0 = (vvh.h) r0
            int r1 = r0.f292549w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f292549w = r1
            goto L18
        L13:
            vvh.h r0 = new vvh.h
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.u
            fim.a r1 = fim.a.COROUTINE_SUSPENDED
            int r2 = r0.f292549w
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            yhm.o.b(r5)
            goto L4a
        L27:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2f:
            yhm.o.b(r5)
            l10.m r5 = new l10.m
            r2 = 0
            r5.<init>(r4, r3, r2)
            vkm.v1 r2 = new vkm.v1
            r2.<init>(r5)
            vkm.v1 r5 = c8g.a.D(r2)
            r0.f292549w = r3
            java.lang.Object r5 = vkm.q.E(r5, r0)
            if (r5 != r1) goto L4a
            return r1
        L4a:
            com.revolut.data.model.Data r5 = (com.revolut.data.model.Data) r5
            java.lang.Throwable r5 = r5.getError()
            if (r5 != 0) goto L55
            kotlin.Unit r5 = kotlin.Unit.f186387a
            return r5
        L55:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vvh.l.e(gim.c):java.lang.Object");
    }

    public final wkm.l f(int i) {
        kq.h hVar = this.f292557c;
        return q.Q(hVar.f() ? q.q(new kq.g(ue0.e.R(hVar.c(), "widgets", kq.i[].class), i, 0)) : new go.g(r0.g(), 2), new l27.g(i, 2, this, null));
    }
}
