package mv9;

import com.revolut.data.model.Data;
import efm.d0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class f implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209178a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f209179b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f209180c;
    public final /* synthetic */ long d;

    public /* synthetic */ f(k kVar, String str, long j2, int i) {
        this.f209178a = i;
        this.f209179b = kVar;
        this.f209180c = str;
        this.d = j2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f209178a) {
            case 0:
                List cachedMessages = (List) obj2;
                Intrinsics.checkNotNullParameter(cachedMessages, "cachedMessages");
                k kVar = this.f209179b;
                d0 d0VarFirstOrError = kVar.i.firstOrError();
                msb.e eVar = new msb.e(16, new f(kVar, this.f209180c, this.d, 1));
                d0VarFirstOrError.getClass();
                return new sfm.b(d0VarFirstOrError, eVar, 2).startWith(new Data(cachedMessages, null, true, 2, null));
            default:
                Unit it8 = (Unit) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return this.f209179b.e(this.d, this.f209180c).map(new msb.e(18, new mul.k(5)));
        }
    }
}
