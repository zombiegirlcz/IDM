package i1m;

import java.util.HashMap;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import y0m.g;

/* JADX INFO: loaded from: classes23.dex */
public final class f implements g {

    @NotNull
    public static final e Companion = new e();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f157655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f157656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f157657c;
    public String d;
    public int e;
    public final String f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f157658g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Integer f157659h;
    public Long i;

    public f(String firstEventId, String firstEventTimestamp, String sessionId, String str, int i, String userId, String storage, Integer num, Long l2) {
        Intrinsics.checkNotNullParameter(firstEventId, "firstEventId");
        Intrinsics.checkNotNullParameter(firstEventTimestamp, "firstEventTimestamp");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(storage, "storage");
        this.f157655a = firstEventId;
        this.f157656b = firstEventTimestamp;
        this.f157657c = sessionId;
        this.d = str;
        this.e = i;
        this.f = userId;
        this.f157658g = storage;
        this.f157659h = num;
        this.i = l2;
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        map.put("firstEventId", this.f157655a);
        map.put("firstEventTimestamp", this.f157656b);
        map.put("sessionId", this.f157657c);
        map.put("previousSessionId", this.d);
        map.put("sessionIndex", Integer.valueOf(this.e));
        map.put("userId", this.f);
        map.put("storageMechanism", this.f157658g);
        Integer num = this.f157659h;
        if (num != null) {
            map.put("eventIndex", Integer.valueOf(num.intValue()));
        }
        return map;
    }

    public final void b(long j2, String eventId) {
        Intrinsics.checkNotNullParameter(eventId, "eventId");
        this.d = this.f157657c;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        this.f157657c = string;
        this.e++;
        this.f157659h = 0;
        this.f157655a = eventId;
        this.f157656b = a1m.e.u(j2);
        this.i = Long.valueOf(System.currentTimeMillis());
    }
}
