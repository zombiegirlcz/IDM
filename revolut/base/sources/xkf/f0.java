package xkf;

import elf.j2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final klf.h0 f306704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e0 f306705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j2 f306706c;

    public f0(klf.h0 commonDataSource, d0 availabilityChecker, e0 mapper, j2 userCommentClickHandler) {
        Intrinsics.checkNotNullParameter(commonDataSource, "commonDataSource");
        Intrinsics.checkNotNullParameter(availabilityChecker, "availabilityChecker");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(userCommentClickHandler, "userCommentClickHandler");
        this.f306704a = commonDataSource;
        this.f306705b = mapper;
        this.f306706c = userCommentClickHandler;
    }
}
