package androidx.datastore.core;

import androidx.datastore.core.Message;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import org.jetbrains.annotations.NotNull;
import skm.q;
import skm.r;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "msg", "Landroidx/datastore/core/Message$Update;", "ex", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
public final class DataStoreImpl$writeActor$2<T> extends u implements Function2<Message.Update<T>, Throwable, Unit> {
    public static final DataStoreImpl$writeActor$2 INSTANCE = new DataStoreImpl$writeActor$2();

    public DataStoreImpl$writeActor$2() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj2, Object obj3) {
        invoke((Message.Update) obj2, (Throwable) obj3);
        return Unit.f186387a;
    }

    public final void invoke(@NotNull Message.Update<T> msg, Throwable th10) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        q ack2 = msg.getAck();
        if (th10 == null) {
            th10 = new CancellationException("DataStore scope was cancelled before updateData could complete");
        }
        ((r) ack2).h0(th10);
    }
}
