package c9h;

import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class d implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f22458a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f22459b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w4l.k f22460c;

    public /* synthetic */ d(k kVar, w4l.k kVar2, int i) {
        this.f22458a = i;
        this.f22459b = kVar;
        this.f22460c = kVar2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        List portfolioInfos = (List) obj2;
        switch (this.f22458a) {
            case 0:
                Intrinsics.checkNotNullParameter(portfolioInfos, "portfolioInfos");
                break;
            default:
                Intrinsics.checkNotNullParameter(portfolioInfos, "portfolioInfos");
                break;
        }
        return this.f22459b.j(portfolioInfos, this.f22460c);
    }
}
