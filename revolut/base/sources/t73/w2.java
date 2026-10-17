package t73;

import com.revolut.core.ui_kit_resources.R$attr;
import ip0.pb0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes21.dex */
public final class w2 implements cli.n {

    @NotNull
    public static final v2 Companion = new v2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y63.f f268562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y63.j f268563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vi9.n f268564c;
    public final j63.a d;
    public final zjh.j e;
    public final a f;

    public w2(y63.f cardDetailsListMapper, y63.j cardScreenItemsDataProvider, vi9.n payLaterModeItemMapper, vi9.i payLaterCardNotificationsMapper, j63.a selectedCardUiConfigProvider, zjh.j legalEntityDisclaimerMapper, a blurredImageBackgroundConfigProvider, l80.e dateProvider) {
        Intrinsics.checkNotNullParameter(cardDetailsListMapper, "cardDetailsListMapper");
        Intrinsics.checkNotNullParameter(cardScreenItemsDataProvider, "cardScreenItemsDataProvider");
        Intrinsics.checkNotNullParameter(payLaterModeItemMapper, "payLaterModeItemMapper");
        Intrinsics.checkNotNullParameter(payLaterCardNotificationsMapper, "payLaterCardNotificationsMapper");
        Intrinsics.checkNotNullParameter(selectedCardUiConfigProvider, "selectedCardUiConfigProvider");
        Intrinsics.checkNotNullParameter(legalEntityDisclaimerMapper, "legalEntityDisclaimerMapper");
        Intrinsics.checkNotNullParameter(blurredImageBackgroundConfigProvider, "blurredImageBackgroundConfigProvider");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        this.f268562a = cardDetailsListMapper;
        this.f268563b = cardScreenItemsDataProvider;
        this.f268564c = payLaterModeItemMapper;
        this.d = selectedCardUiConfigProvider;
        this.e = legalEntityDisclaimerMapper;
        this.f = blurredImageBackgroundConfigProvider;
    }

    public final i1 a() {
        int i = R$attr.uikit_dp16;
        u63.c cVar = (u63.c) this.f268562a.f311124a;
        cVar.getClass();
        Intrinsics.checkNotNullParameter("cards", "id");
        List listC = zhm.u.c(((ia3.c) cVar.f277471b).b("cards", i, null));
        zhm.f0 f0Var = zhm.f0.f322471a;
        List listK = zhm.v.k(new pb0("loading_1"), new pb0("loading_2"), new pb0("loading_3"), new pb0("loading_4"));
        yp0.b.k(listK, 0, 0, 0, 0, 31);
        return new i1(listC, f0Var, listK, false, false, null, null, null, null);
    }

    @Override // cli.n
    public final cli.o c(cli.j jVar) {
        q0 domainState = (q0) jVar;
        Intrinsics.checkNotNullParameter(domainState, "domainState");
        return (i1) iii.c.f(domainState.f268506a, new t5e.m(this, 8), new suf.a(this, 22), new si5.c(this, domainState, 14));
    }
}
