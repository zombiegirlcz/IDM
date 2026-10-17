package k09;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u09.q;
import u09.v;

/* JADX INFO: loaded from: classes4.dex */
public final class m extends yji.n implements n {

    @NotNull
    public static final h Companion = new h();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final g09.i f180003l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final l09.g f180004m;

    public m(g09.i lessonsInteractor, l09.g statusDialogMapper) {
        Intrinsics.checkNotNullParameter(lessonsInteractor, "lessonsInteractor");
        Intrinsics.checkNotNullParameter(statusDialogMapper, "statusDialogMapper");
        this.f180003l = lessonsInteractor;
        this.f180004m = statusDialogMapper;
    }

    @Override // k09.n
    public final void K1(v domain, q lesson) {
        Intrinsics.checkNotNullParameter(domain, "domain");
        Intrinsics.checkNotNullParameter(lesson, "lesson");
        V2(new l(this, domain, lesson, null), new yi5.b(29));
    }
}
