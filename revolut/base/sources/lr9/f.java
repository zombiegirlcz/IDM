package lr9;

import efm.d0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f199445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f199446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f199447c;

    public /* synthetic */ f(j jVar, long j2, int i) {
        this.f199445a = i;
        this.f199446b = jVar;
        this.f199447c = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f199445a) {
            case 0:
                mq9.e cached = (mq9.e) obj2;
                Intrinsics.checkNotNullParameter(cached, "cached");
                mq9.a aVar = mq9.a.REMOTE_SINGLE_FETCH;
                j jVar = this.f199446b;
                d0 d0VarFirstOrError = jVar.b(aVar).firstOrError();
                b bVar = new b(19, new f(jVar, this.f199447c, 2));
                d0VarFirstOrError.getClass();
                return new sfm.b(d0VarFirstOrError, bVar, 2).map(new b(20, new loc.a(15))).startWith(zi0.c.P(cached, true, null, 2));
            case 1:
                do3.n user = (do3.n) obj2;
                Intrinsics.checkNotNullParameter(user, "user");
                mv9.k kVar = this.f199446b.f199453c;
                String userCode = user.f116414l;
                if (userCode == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
                Intrinsics.checkNotNullParameter(userCode, "userCode");
                return kVar.e(this.f199447c, userCode).map(new b(14, new loc.a(13)));
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f199446b.c(this.f199447c);
        }
    }
}
