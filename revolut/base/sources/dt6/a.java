package dt6;

import com.revolut.data.model.Data;
import efm.r;
import go.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import zi0.c;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f117389a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f117390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function0 f117391c;

    public /* synthetic */ a(Object obj2, Function0 function0) {
        this.f117390b = obj2;
        this.f117391c = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        int i = this.f117389a;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        switch (i) {
            case 0:
                return zBooleanValue ? (Flow) this.f117391c.invoke() : new g(c.P(this.f117390b, false, null, 3), 2);
            default:
                if (zBooleanValue) {
                    return (r) this.f117391c.invoke();
                }
                r rVarJust = r.just(new Data(this.f117390b, null, false, 6, null));
                Intrinsics.h(rVarJust);
                return rVarJust;
        }
    }

    public /* synthetic */ a(Function0 function0, Object obj2) {
        this.f117391c = function0;
        this.f117390b = obj2;
    }
}
