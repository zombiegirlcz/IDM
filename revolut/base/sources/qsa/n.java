package qsa;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p5k.x;

/* JADX INFO: loaded from: classes5.dex */
public final class n implements cli.n {

    @NotNull
    public static final m Companion = new m();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yof.k f248776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f248777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vrf.h f248778c;
    public final fsf.b d;

    public n(yof.k transferReviewMapper, x breakdownMapper, vrf.h sectionFactory, fsf.b transferReasonsCommonUiMapper) {
        Intrinsics.checkNotNullParameter(transferReviewMapper, "transferReviewMapper");
        Intrinsics.checkNotNullParameter(breakdownMapper, "breakdownMapper");
        Intrinsics.checkNotNullParameter(sectionFactory, "sectionFactory");
        Intrinsics.checkNotNullParameter(transferReasonsCommonUiMapper, "transferReasonsCommonUiMapper");
        this.f248776a = transferReviewMapper;
        this.f248777b = breakdownMapper;
        this.f248778c = sectionFactory;
        this.d = transferReasonsCommonUiMapper;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    @Override // cli.n
    public final cli.o c(cli.j r56) {
        /*
            Method dump skipped, instruction units count: 594
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: qsa.n.c(cli.j):cli.o");
    }
}
