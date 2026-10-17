package gnl;

import com.revolut.sso.impl.domain.models.Identifier;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class p implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Identifier.Phone f145045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ s f145046c;
    public final /* synthetic */ wi0.b d;

    public /* synthetic */ p(Identifier.Phone phone, s sVar, wi0.b bVar, int i) {
        this.f145044a = i;
        this.f145045b = phone;
        this.f145046c = sVar;
        this.d = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f145044a) {
            case 0:
                h updateState = (h) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                s sVar = this.f145046c;
                wi0.b bVar = this.d;
                return h.a(updateState, Identifier.Phone.a(this.f145045b, null, sVar.z2(bVar), bVar, 1), null, 14);
            default:
                h updateState2 = (h) obj2;
                Intrinsics.checkNotNullParameter(updateState2, "$this$updateState");
                s sVar2 = this.f145046c;
                wi0.b bVar2 = this.d;
                return h.a(updateState2, Identifier.Phone.a(this.f145045b, null, sVar2.z2(bVar2), bVar2, 1), null, 14);
        }
    }
}
