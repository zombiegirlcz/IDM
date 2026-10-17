package mjf;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xif.i f206034a;

    public u(xif.i recallableRepository) {
        Intrinsics.checkNotNullParameter(recallableRepository, "recallableRepository");
        this.f206034a = recallableRepository;
    }

    public final pfm.r a(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return te0.w.g0(this.f206034a.f306357a.recallTransactionById(groupId));
    }
}
