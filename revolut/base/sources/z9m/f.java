package z9m;

import com.revolut.revolut.feature_fourthline_impl.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;

/* JADX INFO: loaded from: classes19.dex */
public final class f extends u implements Function0 {
    public final /* synthetic */ int f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ k f320525h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(k kVar, int i) {
        super(0);
        this.f = i;
        this.f320525h = kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f) {
            case 0:
                k kVar = this.f320525h;
                return new e(kVar.f320536a, kVar, kVar.a());
            case 1:
                k kVar2 = this.f320525h;
                return kVar2.f320537b.a(new bam.a(kVar2.f320536a));
            default:
                String[] stringArray = this.f320525h.f320536a.f112589b.getResources().getStringArray(R.array.host_allow_list);
                Intrinsics.checkNotNullExpressionValue(stringArray, "transact.context.resourc…(R.array.host_allow_list)");
                return kotlin.collections.d.v0(stringArray);
        }
    }
}
