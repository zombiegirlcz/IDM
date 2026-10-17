package jv9;

import com.google.gson.reflect.TypeToken;
import com.revolut.feature.payments.api.PaymentsToggles$P2pChatPagination;
import com.revolut.feature.payments.messaging.data.impl.data.database.network.service.SocialPaymentsService;
import dv9.l;
import dv9.m;
import iv9.k;
import java.lang.reflect.Type;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class b {

    @NotNull
    public static final a Companion = new a();
    public static final Type f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SocialPaymentsService f178790a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f178791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ue0.c f178792c;
    public final fkg.a d;
    public final boolean e;

    static {
        Type type = new TypeToken<Long>() { // from class: com.revolut.feature.payments.messaging.data.impl.data.database.network.mapper.ConversationToApiMapper$Companion$LONG_TYPE$1
        }.getType();
        Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
        f = type;
    }

    public b(SocialPaymentsService service, k chatMessageMapper, ue0.c storage, gte.a featureToggleInteractor, fkg.a paginationFetcher) {
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(chatMessageMapper, "chatMessageMapper");
        Intrinsics.checkNotNullParameter(storage, "storage");
        Intrinsics.checkNotNullParameter(featureToggleInteractor, "featureToggleInteractor");
        Intrinsics.checkNotNullParameter(paginationFetcher, "paginationFetcher");
        this.f178790a = service;
        this.f178791b = chatMessageMapper;
        this.f178792c = storage;
        this.d = paginationFetcher;
        this.e = ((jte.d) featureToggleInteractor).c(PaymentsToggles$P2pChatPagination.f79155c);
    }

    public final long a(m mVar) {
        boolean z = mVar instanceof dv9.k;
        Type type = f;
        ue0.c cVar = this.f178792c;
        if (z) {
            return ((Number) cVar.v0(0L, "GROUP_CHAT_LATEST_UPDATED_TIME_" + ((dv9.k) mVar).f118076a, type)).longValue();
        }
        if ((mVar instanceof l) || mVar == null) {
            return ((Number) cVar.v0(0L, "MESSAGES_LATEST_UPDATED_TIME", type)).longValue();
        }
        throw new NoWhenBranchMatchedException();
    }
}
