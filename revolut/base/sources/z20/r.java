package z20;

import com.revolut.chat.data.network.MessagesApi;
import kotlin.jvm.internal.Intrinsics;
import vkm.j2;
import zhm.r0;

/* JADX INFO: loaded from: classes19.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MessagesApi f318934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f318935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final y10.h f318936c;
    public final uvl.c d;
    public final i90.b e;
    public final j2 f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ihm.f f318937g;

    public r(MessagesApi messagesApi, t imageFileConverter, h mimeTypeProvider, y10.h mapper, uvl.c messagesPersister, i90.b uuidUtils) {
        Intrinsics.checkNotNullParameter(messagesApi, "messagesApi");
        Intrinsics.checkNotNullParameter(imageFileConverter, "imageFileConverter");
        Intrinsics.checkNotNullParameter(mimeTypeProvider, "mimeTypeProvider");
        Intrinsics.checkNotNullParameter(mapper, "mapper");
        Intrinsics.checkNotNullParameter(messagesPersister, "messagesPersister");
        Intrinsics.checkNotNullParameter(uuidUtils, "uuidUtils");
        this.f318934a = messagesApi;
        this.f318935b = imageFileConverter;
        this.f318936c = mapper;
        this.d = messagesPersister;
        this.e = uuidUtils;
        this.f = vkm.q.c(r0.g());
        this.f318937g = v0.a.d("create(...)");
    }
}
