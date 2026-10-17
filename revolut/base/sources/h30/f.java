package h30;

import com.revolut.chat.data.network.MessagesApi;
import com.revolut.chat.data.network.TicketsInfoApi;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import y20.b1;

/* JADX INFO: loaded from: classes19.dex */
public abstract class f implements e4m.e {
    public static b1 a(MessagesApi messagesApi, TicketsInfoApi ticketInfoApi, d30.c fileUrlDataSource, d4m.a chatDatabase, e30.b webSocketDelegate, f30.b messageSearchEngine, i90.b uuidGenerator, j30.c chatFeatureToggles, kg.o gson, CoroutineScope scope, ne0.j memoryCache, r10.q messageSearchIndexWriter, s20.d agentDataSource, uvl.c messagesPersister, v10.b messagesSettingsStorage, xe0.e storage, y10.h mapper, y10.l structuredMessageMapper, y20.f eagerHistoryLoader, z20.j pendingUploadRepository, z20.q sendFileOrchestrator) {
        c.Companion.getClass();
        Intrinsics.checkNotNullParameter(agentDataSource, "agentDataSource");
        Intrinsics.checkNotNullParameter(chatDatabase, "chatDatabase");
        Intrinsics.checkNotNullParameter(eagerHistoryLoader, "eagerHistoryLoader");
        Intrinsics.checkNotNullParameter(fileUrlDataSource, "fileUrlDataSource");
        Intrinsics.checkNotNullParameter(gson, "gson");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(memoryCache, "memoryCache");
        Intrinsics.checkNotNullParameter(messageSearchEngine, "messageSearchEngine");
        Intrinsics.checkNotNullParameter(messageSearchIndexWriter, "messageSearchIndexWriter");
        Intrinsics.checkNotNullParameter(messagesApi, "messagesApi");
        Intrinsics.checkNotNullParameter(messagesPersister, "messagesPersister");
        Intrinsics.checkNotNullParameter(messagesSettingsStorage, "messagesSettingsStorage");
        Intrinsics.checkNotNullParameter(pendingUploadRepository, "pendingUploadRepository");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(sendFileOrchestrator, "sendFileOrchestrator");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(structuredMessageMapper, "structuredMessageMapper");
        Intrinsics.checkNotNullParameter(ticketInfoApi, "ticketInfoApi");
        Intrinsics.checkNotNullParameter(uuidGenerator, "uuidGenerator");
        Intrinsics.checkNotNullParameter(webSocketDelegate, "webSocketDelegate");
        Intrinsics.checkNotNullParameter(chatFeatureToggles, "chatFeatureToggles");
        return new b1(messagesApi, ticketInfoApi, fileUrlDataSource, chatDatabase, webSocketDelegate, messageSearchEngine, uuidGenerator, chatFeatureToggles, gson, scope, memoryCache, messageSearchIndexWriter, agentDataSource, messagesPersister, messagesSettingsStorage, storage, mapper, structuredMessageMapper, eagerHistoryLoader, pendingUploadRepository, sendFileOrchestrator);
    }
}
