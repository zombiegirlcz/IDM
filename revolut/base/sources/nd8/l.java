package nd8;

import com.google.protobuf.f3;
import com.revolut.core.model.account.AccountId;
import com.revolut.data.model.Data;
import io.grpc.StatusRuntimeException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.cbeff.ISO781611;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f214340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f214341b;

    public /* synthetic */ l(Throwable th10, int i) {
        this.f214340a = i;
        this.f214341b = th10;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f214340a) {
            case 0:
                Data juniorName = new Data(null, this.f214341b, false, 5, null);
                ((f) obj2).getClass();
                Intrinsics.checkNotNullParameter(juniorName, "juniorName");
                return new f(juniorName);
            case 1:
                ni1.f update = (ni1.f) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                Data dataO = zi0.c.O(this.f214341b);
                String postalCode = update.f215623a;
                Intrinsics.checkNotNullParameter(postalCode, "postalCode");
                return new ni1.f(dataO, postalCode);
            case 2:
                f3 buildStruct = (f3) obj2;
                Intrinsics.checkNotNullParameter(buildStruct, "$this$buildStruct");
                Throwable th10 = this.f214341b;
                if (th10 instanceof StatusRuntimeException) {
                    com.bumptech.glide.c.w(buildStruct, String.valueOf(((StatusRuntimeException) th10).f162992a.f124809a.c()), 1L);
                } else {
                    com.bumptech.glide.c.x(buildStruct, "unknown", th10.getClass().getSimpleName() + ":" + th10.getMessage());
                }
                return Unit.f186387a;
            case 3:
                ny4.d updateState = (ny4.d) obj2;
                Intrinsics.checkNotNullParameter(updateState, "$this$updateState");
                return new ny4.d(new Data(null, this.f214341b, false, 5, null));
            case 4:
                owf.h update2 = (owf.h) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                Data content = new Data(null, this.f214341b, false, 5, null);
                update2.getClass();
                Intrinsics.checkNotNullParameter(content, "content");
                return new owf.h(content);
            case 5:
                oyi.b update3 = (oyi.b) obj2;
                Intrinsics.checkNotNullParameter(update3, "$this$update");
                return oyi.b.a(update3, new Data(null, this.f214341b, false, 5, null));
            case 6:
                p40.i iVar = (p40.i) obj2;
                List list = (List) iVar.f232779g.getContent();
                Throwable th11 = this.f214341b;
                return p40.i.a(iVar, null, null, new Data(list, th11, false), new Data((List) iVar.f232780h.getContent(), th11, false), false, 319);
            case 7:
                qhb.a update4 = (qhb.a) obj2;
                Intrinsics.checkNotNullParameter(update4, "$this$update");
                return qhb.a.a(update4, new Data(null, this.f214341b, false, 5, null));
            case 8:
                s6d.j jVar = (s6d.j) obj2;
                return s6d.j.a(jVar, Data.copy$default(jVar.f260240a, null, this.f214341b, false, 1, null), false, null, null, null, null, ISO781611.SMT_TAG);
            case 9:
                tpl.j update5 = (tpl.j) obj2;
                Intrinsics.checkNotNullParameter(update5, "$this$update");
                return tpl.j.a(update5, new Data(null, this.f214341b, false, 5, null), null, 2);
            case 10:
                return tpl.j.a((tpl.j) obj2, new Data(null, this.f214341b, false, 5, null), null, 2);
            case 11:
                udk.d update6 = (udk.d) obj2;
                Intrinsics.checkNotNullParameter(update6, "$this$update");
                return udk.d.a(update6, new Data(null, this.f214341b, false, 5, null), null, null, 2);
            case 12:
                up2.e update7 = (up2.e) obj2;
                Intrinsics.checkNotNullParameter(update7, "$this$update");
                return up2.e.a(update7, new Data(null, this.f214341b, false, 5, null));
            case 13:
                urj.a aVar = (urj.a) obj2;
                Data goal = zi0.c.O(this.f214341b);
                ie3.a aVar2 = aVar.f282314b;
                AccountId accountId = aVar.f282315c;
                Intrinsics.checkNotNullParameter(goal, "goal");
                return new urj.a(goal, aVar2, accountId);
            case 14:
                Intrinsics.checkNotNullParameter((v94.g) obj2, "$this$update");
                return new v94.g(new Data(null, this.f214341b, false, 5, null));
            case 15:
                Intrinsics.checkNotNullParameter((v94.g) obj2, "$this$update");
                return new v94.g(new Data(null, this.f214341b, false, 5, null));
            case 16:
                Data data = (Data) obj2;
                Intrinsics.checkNotNullParameter(data, "data");
                return new Data(data.getContent(), this.f214341b, data.getLoading());
            case 17:
                yb0.d update8 = (yb0.d) obj2;
                Intrinsics.checkNotNullParameter(update8, "$this$update");
                return yb0.d.a(update8, null, null, new Data(null, this.f214341b, false, 5, null), null, 11);
            default:
                return zs2.k.a((zs2.k) obj2, false, null, new Data(null, this.f214341b, false, 5, null), null, 11);
        }
    }
}
