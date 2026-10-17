package androidx.glance.session;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;
import kotlin.time.b;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Long;)Ljava/lang/Long;"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class TimerScopeKt$withTimer$2$1$blockScope$1$addTime$1 extends u implements Function1<Long, Long> {
    final /* synthetic */ long $time;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TimerScopeKt$withTimer$2$1$blockScope$1$addTime$1(long j2) {
        super(1);
        this.$time = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Long invoke(Long l2) {
        if (l2 == null) {
            throw new IllegalStateException("Start the timer with startTimer before calling addTime");
        }
        long j2 = this.$time;
        b.Companion companion = b.INSTANCE;
        if (j2 <= 0) {
            throw new IllegalArgumentException("Cannot call addTime with a negative duration");
        }
        return Long.valueOf(b.f(this.$time) + l2.longValue());
    }
}
