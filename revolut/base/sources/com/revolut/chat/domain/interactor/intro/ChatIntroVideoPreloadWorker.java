package com.revolut.chat.domain.interactor.intro;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\tB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/revolut/chat/domain/interactor/intro/ChatIntroVideoPreloadWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Companion", "a", "chat_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ChatIntroVideoPreloadWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChatIntroVideoPreloadWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(context, params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x0174, code lost:
    
        if (nim.a.a(r0, r2) == r3) goto L74;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fa A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:12:0x002d, B:75:0x0177, B:19:0x0045, B:70:0x015a, B:72:0x0162, B:22:0x004d, B:24:0x0066, B:27:0x0070, B:29:0x00aa, B:30:0x00b2, B:32:0x00b8, B:36:0x00cb, B:39:0x00d1, B:41:0x00d9, B:43:0x00e4, B:45:0x00ee, B:51:0x00fa, B:53:0x0102, B:55:0x0110, B:58:0x0118, B:60:0x0120, B:62:0x0132, B:64:0x013b, B:77:0x017f, B:78:0x0195), top: B:87:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0102 A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:12:0x002d, B:75:0x0177, B:19:0x0045, B:70:0x015a, B:72:0x0162, B:22:0x004d, B:24:0x0066, B:27:0x0070, B:29:0x00aa, B:30:0x00b2, B:32:0x00b8, B:36:0x00cb, B:39:0x00d1, B:41:0x00d9, B:43:0x00e4, B:45:0x00ee, B:51:0x00fa, B:53:0x0102, B:55:0x0110, B:58:0x0118, B:60:0x0120, B:62:0x0132, B:64:0x013b, B:77:0x017f, B:78:0x0195), top: B:87:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015a A[Catch: Exception -> 0x0032, TryCatch #0 {Exception -> 0x0032, blocks: (B:12:0x002d, B:75:0x0177, B:19:0x0045, B:70:0x015a, B:72:0x0162, B:22:0x004d, B:24:0x0066, B:27:0x0070, B:29:0x00aa, B:30:0x00b2, B:32:0x00b8, B:36:0x00cb, B:39:0x00d1, B:41:0x00d9, B:43:0x00e4, B:45:0x00ee, B:51:0x00fa, B:53:0x0102, B:55:0x0110, B:58:0x0118, B:60:0x0120, B:62:0x0132, B:64:0x013b, B:77:0x017f, B:78:0x0195), top: B:87:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Type inference failed for: r4v16, types: [int] */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v22 */
    /* JADX WARN: Type inference failed for: r4v23 */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object doWork(kotlin.coroutines.Continuation r13) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.revolut.chat.domain.interactor.intro.ChatIntroVideoPreloadWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
