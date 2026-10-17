package mv5;

import dcl.q;
import hd.r;
import kotlin.jvm.internal.Intrinsics;
import kv5.l;
import mu5.p;
import org.jetbrains.annotations.NotNull;
import vkm.j2;

/* JADX INFO: loaded from: classes3.dex */
public final class f implements a {

    @NotNull
    public static final b Companion = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f209145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ut5.h f209146b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l f209147c;
    public final q d;
    public final p e;
    public final gte.a f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final j2 f209148g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final j2 f209149h;

    public f(r itemsProvider, ut5.h pocketsDataProvider, l sectionHeaderMapper, q sectionHeaderSubtitleMapper, p widgetCustomizationInteractor, gte.a featureToggleInteractor) {
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(pocketsDataProvider, "pocketsDataProvider");
        Intrinsics.checkNotNullParameter(sectionHeaderMapper, "sectionHeaderMapper");
        Intrinsics.checkNotNullParameter(sectionHeaderSubtitleMapper, "sectionHeaderSubtitleMapper");
        Intrinsics.checkNotNullParameter(widgetCustomizationInteractor, "widgetCustomizationInteractor");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        this.f209145a = itemsProvider;
        this.f209146b = pocketsDataProvider;
        this.f209147c = sectionHeaderMapper;
        this.d = sectionHeaderSubtitleMapper;
        this.e = widgetCustomizationInteractor;
        this.f = featureToggleInteractor;
        Boolean bool = Boolean.TRUE;
        this.f209148g = vkm.q.c(bool);
        this.f209149h = vkm.q.c(bool);
    }
}
