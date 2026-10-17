package nv5;

import dcl.q;
import kotlin.jvm.internal.Intrinsics;
import mu5.p;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class h implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f219492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f219493b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kv5.l f219494c;
    public final q d;
    public final ut5.h e;
    public final ut5.d f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final xv5.c f219495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j2 f219496h;
    public final j2 i;

    public h(p widgetCustomizationInteractor, m itemsProvider, kv5.l sectionHeaderMapper, q sectionHeaderSubtitleMapper, ut5.h pocketsDataProvider, ut5.d fiatItemsDataProvider, xv5.c cryptoCommodityBaseCurrencyInteractor) {
        Intrinsics.checkNotNullParameter(widgetCustomizationInteractor, "widgetCustomizationInteractor");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(sectionHeaderMapper, "sectionHeaderMapper");
        Intrinsics.checkNotNullParameter(sectionHeaderSubtitleMapper, "sectionHeaderSubtitleMapper");
        Intrinsics.checkNotNullParameter(pocketsDataProvider, "pocketsDataProvider");
        Intrinsics.checkNotNullParameter(fiatItemsDataProvider, "fiatItemsDataProvider");
        Intrinsics.checkNotNullParameter(cryptoCommodityBaseCurrencyInteractor, "cryptoCommodityBaseCurrencyInteractor");
        this.f219492a = widgetCustomizationInteractor;
        this.f219493b = itemsProvider;
        this.f219494c = sectionHeaderMapper;
        this.d = sectionHeaderSubtitleMapper;
        this.e = pocketsDataProvider;
        this.f = fiatItemsDataProvider;
        this.f219495g = cryptoCommodityBaseCurrencyInteractor;
        Boolean bool = Boolean.TRUE;
        this.f219496h = vkm.q.c(bool);
        this.i = vkm.q.c(bool);
    }
}
