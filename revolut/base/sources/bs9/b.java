package bs9;

import com.revolut.feature.payments.messaging.data.api.model.MessageItem;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r10.f f18087b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MessageItem f18088c;
    public final /* synthetic */ String d;

    public /* synthetic */ b(r10.f fVar, MessageItem messageItem, String str, int i) {
        this.f18086a = i;
        this.f18087b = fVar;
        this.f18088c = messageItem;
        this.d = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        do3.n user = (do3.n) obj2;
        switch (this.f18086a) {
            case 0:
                Intrinsics.checkNotNullParameter(user, "user");
                return ((mv9.k) this.f18087b.b).h(this.f18088c, new dv9.k(r10.f.v0(user), this.d));
            default:
                Intrinsics.checkNotNullParameter(user, "user");
                return ((mv9.k) this.f18087b.b).a(this.f18088c.f79531a, new dv9.k(r10.f.v0(user), this.d));
        }
    }
}
