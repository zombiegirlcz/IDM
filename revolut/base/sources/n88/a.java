package n88;

import ia3.r;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f213274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final m93.g f213275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f213276c;

    public a(r cardsContentMapper, m93.g cardsSimplifiedItemMapper, i juniorCardWidgetUiDataProvider) {
        Intrinsics.checkNotNullParameter(cardsContentMapper, "cardsContentMapper");
        Intrinsics.checkNotNullParameter(cardsSimplifiedItemMapper, "cardsSimplifiedItemMapper");
        Intrinsics.checkNotNullParameter(juniorCardWidgetUiDataProvider, "juniorCardWidgetUiDataProvider");
        this.f213274a = cardsContentMapper;
        this.f213275b = cardsSimplifiedItemMapper;
        this.f213276c = juniorCardWidgetUiDataProvider;
    }
}
