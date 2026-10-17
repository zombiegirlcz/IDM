package zp9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final thf.d f324197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final thf.m f324198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nq9.c f324199c;
    public final a9e.h d;

    public b(thf.d transactionIconResourcesMapper, thf.m transactionTextResourcesMapper, nq9.c groupMemberMapper, a9e.h subscriptionsItemMapper) {
        Intrinsics.checkNotNullParameter(transactionIconResourcesMapper, "transactionIconResourcesMapper");
        Intrinsics.checkNotNullParameter(transactionTextResourcesMapper, "transactionTextResourcesMapper");
        Intrinsics.checkNotNullParameter(groupMemberMapper, "groupMemberMapper");
        Intrinsics.checkNotNullParameter(subscriptionsItemMapper, "subscriptionsItemMapper");
        this.f324197a = transactionIconResourcesMapper;
        this.f324198b = transactionTextResourcesMapper;
        this.f324199c = groupMemberMapper;
        this.d = subscriptionsItemMapper;
    }
}
