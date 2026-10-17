package ov5;

import kotlin.jvm.internal.Intrinsics;
import mu5.p;
import nv5.m;
import vkm.j2;
import vkm.q;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p f229966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m f229967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ut5.d f229968c;
    public final j2 d;

    public e(p widgetCustomizationInteractor, m itemsProvider, ut5.d fiatItemsDataProvider) {
        Intrinsics.checkNotNullParameter(widgetCustomizationInteractor, "widgetCustomizationInteractor");
        Intrinsics.checkNotNullParameter(itemsProvider, "itemsProvider");
        Intrinsics.checkNotNullParameter(fiatItemsDataProvider, "fiatItemsDataProvider");
        this.f229966a = widgetCustomizationInteractor;
        this.f229967b = itemsProvider;
        this.f229968c = fiatItemsDataProvider;
        this.d = q.c(Boolean.TRUE);
    }
}
