package z10;

import com.revolut.chat.data.network.OkHttpChatWsApiV2$WsClosingUnexpectedlyException;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.channels.ProducerScope;
import okhttp3.Response;
import org.joda.time.Instant;
import p20.b;
import r20.f;
import ulm.y1;
import ulm.z1;
import v30.e1;

/* JADX INFO: loaded from: classes19.dex */
public final class d extends z1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f318707a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ProducerScope f318708b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f318709c;

    public d(Ref$ObjectRef ref$ObjectRef, ProducerScope producerScope, e eVar) {
        this.f318707a = eVar;
        this.f318708b = producerScope;
        this.f318709c = ref$ObjectRef;
    }

    @Override // ulm.z1
    public final void a(y1 webSocket, int i, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        super.a(webSocket, i, reason);
        com.bumptech.glide.c.E(this.f318708b, new r20.c(i, reason));
    }

    @Override // ulm.z1
    public final void b(y1 webSocket, int i, String reason) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(reason, "reason");
        super.b(webSocket, i, reason);
        ProducerScope producerScope = this.f318708b;
        if (i != 1000 || !reason.equals("REASON_FINISH")) {
            OkHttpChatWsApiV2$WsClosingUnexpectedlyException okHttpChatWsApiV2$WsClosingUnexpectedlyException = new OkHttpChatWsApiV2$WsClosingUnexpectedlyException(0);
            com.bumptech.glide.c.E(producerScope, new r20.e(okHttpChatWsApiV2$WsClosingUnexpectedlyException));
            producerScope.close(okHttpChatWsApiV2$WsClosingUnexpectedlyException);
        }
        com.bumptech.glide.c.E(producerScope, r20.d.f251020a);
    }

    @Override // ulm.z1
    public final void c(y1 webSocket, Exception t2, Response response) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(t2, "t");
        super.c(webSocket, t2, response);
        r20.e eVar = new r20.e(t2);
        ProducerScope producerScope = this.f318708b;
        com.bumptech.glide.c.E(producerScope, eVar);
        producerScope.close(t2);
    }

    @Override // ulm.z1
    public final void d(y1 webSocket, String text) {
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(text, "text");
        super.d(webSocket, text);
        ProducerScope producerScope = this.f318708b;
        Ref$ObjectRef ref$ObjectRef = this.f318709c;
        e eVar = this.f318707a;
        afe.a.b(ref$ObjectRef, producerScope, eVar);
        Intrinsics.checkNotNullParameter(text, "text");
        CopyOnWriteArrayList copyOnWriteArrayList = rd0.d.f253311a;
        rd0.d.b(rd0.c.VERBOSE, "OkHttpChatWsApiV2", "new message: ".concat(text), null, null, 16);
        p20.b bVar = (p20.b) eVar.f318711b.c(text, p20.b.class);
        vkm.z1 z1Var = eVar.i;
        Intrinsics.h(bVar);
        z1Var.k(bVar);
        eVar.f318715j.k(bVar);
        UUID id10 = bVar.getId();
        if (id10 != null) {
            Instant instantNow = Instant.now();
            Intrinsics.checkNotNullExpressionValue(instantNow, "now(...)");
            eVar.b(new b.a(id10, new b.a.C1280b(instantNow)));
        }
    }

    @Override // ulm.z1
    public final void e(y1 webSocket, Response response) {
        e1.a openConnectionBackoff;
        Intrinsics.checkNotNullParameter(webSocket, "webSocket");
        Intrinsics.checkNotNullParameter(response, "response");
        super.e(webSocket, response);
        java.time.Instant instantNow = java.time.Instant.now();
        e eVar = this.f318707a;
        e1 e1Var = eVar.e;
        java.time.Instant instantPlusMillis = instantNow.plusMillis((e1Var == null || (openConnectionBackoff = e1Var.getOpenConnectionBackoff()) == null) ? 0L : openConnectionBackoff.getAutoResetMillis());
        Intrinsics.checkNotNullExpressionValue(instantPlusMillis, "plusMillis(...)");
        eVar.f = instantPlusMillis;
        Ref$ObjectRef ref$ObjectRef = this.f318709c;
        ProducerScope producerScope = this.f318708b;
        afe.a.b(ref$ObjectRef, producerScope, eVar);
        com.bumptech.glide.c.E(producerScope, f.f251022a);
    }
}
