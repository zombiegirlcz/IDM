package a67;

import ft6.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class f {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f1556a;

    public f(ct6.w freelancerClauseFactory, w taxCalendarEventMapper) {
        Intrinsics.checkNotNullParameter(freelancerClauseFactory, "freelancerClauseFactory");
        Intrinsics.checkNotNullParameter(taxCalendarEventMapper, "taxCalendarEventMapper");
        this.f1556a = taxCalendarEventMapper;
    }
}
