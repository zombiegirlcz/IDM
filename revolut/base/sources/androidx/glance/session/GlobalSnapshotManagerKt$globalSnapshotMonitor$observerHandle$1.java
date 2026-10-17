package androidx.glance.session;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class GlobalSnapshotManagerKt$globalSnapshotMonitor$observerHandle$1 extends u implements Function1<Object, Unit> {
    final /* synthetic */ ukm.u $channel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GlobalSnapshotManagerKt$globalSnapshotMonitor$observerHandle$1(ukm.u uVar) {
        super(1);
        this.$channel = uVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
        m3573invoke(obj2);
        return Unit.f186387a;
    }

    /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
    public final void m3573invoke(@NotNull Object obj2) {
        this.$channel.mo3647trySendJP2dKIU(Unit.f186387a);
    }
}
