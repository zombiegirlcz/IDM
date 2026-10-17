package tb0;

import com.revolut.feature.backend_flow.domain.models.Action;
import com.revolut.feature.backend_flow.domain.models.BackendScreen;
import kotlin.jvm.internal.Intrinsics;
import yc0.p;
import yc0.q;

/* JADX INFO: loaded from: classes19.dex */
public final class h implements ad0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final q f269429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ad0.a f269430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc0.g f269431c;
    public final p d;

    public h(q imageItemMapper, ad0.a actionsMapper, yc0.g analyticsMapper, p htmlStringItemMapper) {
        Intrinsics.checkNotNullParameter(imageItemMapper, "imageItemMapper");
        Intrinsics.checkNotNullParameter(actionsMapper, "actionsMapper");
        Intrinsics.checkNotNullParameter(analyticsMapper, "analyticsMapper");
        Intrinsics.checkNotNullParameter(htmlStringItemMapper, "htmlStringItemMapper");
        this.f269429a = imageItemMapper;
        this.f269430b = actionsMapper;
        this.f269431c = analyticsMapper;
        this.d = htmlStringItemMapper;
    }

    @Override // ad0.a
    public final BackendScreen j(BackendScreen screen, Action.Submit submit) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        return this.f269430b.j(screen, submit);
    }
}
