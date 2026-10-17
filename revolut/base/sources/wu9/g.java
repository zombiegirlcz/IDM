package wu9;

import com.revolut.feature.payments.messaging.data.api.model.ChatItem;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class g extends gim.c {
    public ChatItem u;
    public List v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public dv9.h f300087w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public /* synthetic */ Object f300088x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ h f300089y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, gim.c cVar) {
        super(cVar);
        this.f300089y = hVar;
    }

    @Override // gim.a
    public final Object invokeSuspend(Object obj2) {
        this.f300088x = obj2;
        this.z |= Integer.MIN_VALUE;
        return this.f300089y.a(null, null, null, this);
    }
}
