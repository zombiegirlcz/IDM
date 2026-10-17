package v6l;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Response;

/* JADX INFO: loaded from: classes12.dex */
public final /* synthetic */ class u implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f286504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ u6l.g f286505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f286506c;

    public /* synthetic */ u(u6l.g gVar, b1 b1Var, int i) {
        this.f286504a = i;
        this.f286505b = gVar;
        this.f286506c = b1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) throws g0 {
        String str;
        String str2;
        Response response = (Response) obj2;
        switch (this.f286504a) {
            case 0:
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.code() != 304) {
                    return this.f286506c.d.l(response);
                }
                u6l.g gVar = this.f286505b;
                throw new g0((gVar == null || (str = gVar.f277652a) == null) ? null : new h93.l(str, false));
            default:
                Intrinsics.checkNotNullParameter(response, "response");
                if (response.code() != 304) {
                    return this.f286506c.d.l(response);
                }
                u6l.g gVar2 = this.f286505b;
                throw new g0((gVar2 == null || (str2 = gVar2.f277652a) == null) ? null : new h93.l(str2, false));
        }
    }
}
