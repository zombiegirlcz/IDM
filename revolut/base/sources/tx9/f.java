package tx9;

import androidx.room.RxRoom;
import e06.g;
import kotlin.jvm.internal.Intrinsics;
import org.joda.time.DateTime;
import pfm.r;
import te0.v;
import te0.w;

/* JADX INFO: loaded from: classes13.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f275378a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final yx9.a f275379b;

    public f(e timestampDelegate, yx9.a unreadRepository) {
        Intrinsics.checkNotNullParameter(timestampDelegate, "timestampDelegate");
        Intrinsics.checkNotNullParameter(unreadRepository, "unreadRepository");
        this.f275378a = timestampDelegate;
        this.f275379b = unreadRepository;
    }

    public final long a() {
        return ((Number) w.M((v) this.f275378a.f275377c.getValue(), 0L)).longValue();
    }

    public final r b(String recipientId) {
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        yx9.a aVar = this.f275379b;
        aVar.getClass();
        Intrinsics.checkNotNullParameter(recipientId, "recipientId");
        return w.g0(RxRoom.createCompletable(aVar.f317601a.f190507a, false, true, new g(System.currentTimeMillis(), recipientId, 2)));
    }

    public final void c(String groupId) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        com.google.android.gms.internal.mlkit_vision_face.a.B(Long.TYPE, this.f275378a.f275375a, j6.a.q("REFACTORED_RECENTS_RECIPIENT_GROUP_TIMESTAMP_V2_", groupId), Long.valueOf(DateTime.now().getMillis()));
    }
}
