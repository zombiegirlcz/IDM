package e15;

import ish.a0;
import kotlin.jvm.internal.Intrinsics;
import sri.m;

/* JADX INFO: loaded from: classes22.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r05.e f121875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r05.g f121876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f121877c;
    public final m d;
    public final a0 e;

    public a(r05.e creditScoreEntryPointInteractor, r05.g creditScoreInteractor, g mapper, m navigator, a0 widgetsUiInteractor) {
        Intrinsics.checkNotNullParameter(creditScoreEntryPointInteractor, "creditScoreEntryPointInteractor");
        Intrinsics.checkNotNullParameter(creditScoreInteractor, "creditScoreInteractor");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(widgetsUiInteractor, "widgetsUiInteractor");
        this.f121875a = creditScoreEntryPointInteractor;
        this.f121876b = creditScoreInteractor;
        this.f121877c = mapper;
        this.d = navigator;
        this.e = widgetsUiInteractor;
    }
}
