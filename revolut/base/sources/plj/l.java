package plj;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jmrtd.lds.LDSFile;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class l implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f237429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ glj.e f237430b;

    public /* synthetic */ l(glj.e eVar, int i) {
        this.f237429a = i;
        this.f237430b = eVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f237429a) {
            case 0:
                e update = (e) obj2;
                Intrinsics.checkNotNullParameter(update, "$this$update");
                return e.a(update, null, null, null, null, this.f237430b.f144711a, 15);
            default:
                xkj.g update2 = (xkj.g) obj2;
                Intrinsics.checkNotNullParameter(update2, "$this$update");
                return xkj.g.a(update2, null, null, null, null, this.f237430b.f144711a, null, null, LDSFile.EF_DG15_TAG);
        }
    }
}
