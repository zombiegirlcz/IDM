package pza;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q;

/* JADX INFO: loaded from: classes13.dex */
public final /* synthetic */ class f extends q implements Function1 {
    public static final f f = new f();

    public f() {
        super(1, lza.b.class, "toDomain", "toDomain(Lcom/revolut/feature/remote_stories/impl/network/RemoteStoryDto;)Lcom/revolut/feature/remote_stories/impl/model/RemoteStory;", 1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        oza.d p0 = (oza.d) obj2;
        Intrinsics.checkNotNullParameter(p0, "p0");
        return lza.b.a(p0);
    }
}
