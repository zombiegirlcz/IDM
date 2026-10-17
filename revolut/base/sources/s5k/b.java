package s5k;

import com.revolut.feature.shared.help_centre.api.faq.SharedFaqDestination;
import dii.g;
import eii.e;
import eii.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class b implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f260096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f260097b;

    public /* synthetic */ b(d dVar, int i) {
        this.f260096a = i;
        this.f260097b = dVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f260096a) {
            case 0:
                g result = (g) obj2;
                Intrinsics.checkNotNullParameter(result, "result");
                if ((result instanceof dii.c) && Intrinsics.f(((dii.c) result).f115066a.f275445a, "ITEM_ID_SUBTITLE_LEARN_MORE")) {
                    this.f260097b.A2(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("df1c63f2-24a6-45b0-8cf9-f31284c9c852", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                }
                break;
            default:
                k result2 = (k) obj2;
                Intrinsics.checkNotNullParameter(result2, "result");
                if (result2 instanceof e) {
                    this.f260097b.A2(new SharedFaqDestination((SharedFaqDestination.StartPoint) new SharedFaqDestination.StartPoint.FaqExplicit("question.uae-limits-and-fees", 14), (SharedFaqDestination.PassthroughData) null, false, 14));
                }
                break;
        }
        return Unit.f186387a;
    }
}
