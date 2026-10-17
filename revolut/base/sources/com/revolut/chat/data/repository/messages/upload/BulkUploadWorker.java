package com.revolut.chat.data.repository.messages.upload;

import a0.d;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import h30.n;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import phm.a;
import ue0.e;
import z20.q;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/chat/data/repository/messages/upload/BulkUploadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class BulkUploadWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BulkUploadWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public final q a() {
        Context applicationContext = getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        a aVar = (a) e.j(applicationContext).a().get(h30.a.class);
        b60.a aVar2 = aVar != null ? (b60.a) aVar.get() : null;
        if (aVar2 == null) {
            throw new IllegalStateException(d.q("Api ", h30.a.class, " is not found"));
        }
        Object objB = aVar2.b();
        Intrinsics.i(objB, "null cannot be cast to non-null type com.revolut.chat.di.ChatApiComponent");
        return (q) ((n) ((h30.a) objB)).i0.get();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0 A[Catch: CancellationException -> 0x003d, Exception -> 0x0116, TryCatch #2 {CancellationException -> 0x003d, Exception -> 0x0116, blocks: (B:14:0x0038, B:41:0x00b7, B:43:0x00bd, B:49:0x00ff, B:46:0x00fa, B:52:0x0104, B:21:0x004c, B:34:0x009a, B:36:0x00a0, B:38:0x00a6, B:40:0x00b0, B:54:0x010e, B:24:0x0052, B:30:0x006a, B:27:0x005a), top: B:63:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bd A[Catch: CancellationException -> 0x003d, Exception -> 0x0116, TryCatch #2 {CancellationException -> 0x003d, Exception -> 0x0116, blocks: (B:14:0x0038, B:41:0x00b7, B:43:0x00bd, B:49:0x00ff, B:46:0x00fa, B:52:0x0104, B:21:0x004c, B:34:0x009a, B:36:0x00a0, B:38:0x00a6, B:40:0x00b0, B:54:0x010e, B:24:0x0052, B:30:0x006a, B:27:0x005a), top: B:63:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x010e A[Catch: CancellationException -> 0x003d, Exception -> 0x0116, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x003d, Exception -> 0x0116, blocks: (B:14:0x0038, B:41:0x00b7, B:43:0x00bd, B:49:0x00ff, B:46:0x00fa, B:52:0x0104, B:21:0x004c, B:34:0x009a, B:36:0x00a0, B:38:0x00a6, B:40:0x00b0, B:54:0x010e, B:24:0x0052, B:30:0x006a, B:27:0x005a), top: B:63:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.chat.data.repository.messages.upload.BulkUploadWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
