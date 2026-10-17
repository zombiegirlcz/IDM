package p4c;

import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class y implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f232910a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f232911b;

    public /* synthetic */ y(a0 a0Var, k kVar, int i) {
        this.f232910a = i;
        this.f232911b = kVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f232910a) {
            case 0:
                Function0 getDefaultLoadingItems = (Function0) obj2;
                Intrinsics.checkNotNullParameter(getDefaultLoadingItems, "getDefaultLoadingItems");
                return new t(true, a0.a(this.f232911b), null, (List) getDefaultLoadingItems.invoke(), 94);
            default:
                List it8 = (List) obj2;
                Intrinsics.checkNotNullParameter(it8, "it");
                return new t(false, a0.a(this.f232911b), null, it8, 94);
        }
    }
}
