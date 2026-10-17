package lr9;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class r {

    @NotNull
    public static final q Companion = new q();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ue0.c f199470a;

    public r(ue0.c storage) {
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f199470a = storage;
    }

    public static long a(r rVar, String groupId) {
        rVar.getClass();
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        return ((Number) rVar.f199470a.v0(0L, j6.a.q("GROUP_CHAT_UPDATE_TS_ID_", groupId), Long.TYPE)).longValue();
    }
}
