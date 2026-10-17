package z20;

import com.revolut.chat.data.repository.messages.upload.BulkUploadWorker;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes19.dex */
public final class b extends gim.c {
    public int A;
    public q u;
    public ConcurrentHashMap.KeySetView v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Iterator f318900w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f318901x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public /* synthetic */ Object f318902y;
    public final /* synthetic */ BulkUploadWorker z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(BulkUploadWorker bulkUploadWorker, Continuation continuation) {
        super(continuation);
        this.z = bulkUploadWorker;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f318902y = obj2;
        this.A |= Integer.MIN_VALUE;
        return this.z.doWork(this);
    }
}
