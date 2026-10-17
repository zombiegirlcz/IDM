package byc;

import kotlin.jvm.internal.Intrinsics;
import wli.x;

/* JADX INFO: loaded from: classes7.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final bal.a f19812a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f80.a f19813b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final z9l.d f19814c;
    public final x d;

    public k(bal.a entityConfigRepository, f80.a uriHelper, z9l.d entityConfigActionDialogUiMapper, x deeplinkHandler) {
        Intrinsics.checkNotNullParameter(entityConfigRepository, "entityConfigRepository");
        Intrinsics.checkNotNullParameter(uriHelper, "uriHelper");
        Intrinsics.checkNotNullParameter(entityConfigActionDialogUiMapper, "entityConfigActionDialogUiMapper");
        Intrinsics.checkNotNullParameter(deeplinkHandler, "deeplinkHandler");
        this.f19812a = entityConfigRepository;
        this.f19813b = uriHelper;
        this.f19814c = entityConfigActionDialogUiMapper;
        this.d = deeplinkHandler;
    }

    public final j a() {
        return new j(this.f19812a, this.f19813b, this.f19814c, this.d);
    }
}
