package l1;

import androidx.compose.foundation.pager.PagerState;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes15.dex */
public final /* synthetic */ class a implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f191310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PagerState f191311b;

    public /* synthetic */ a(PagerState pagerState, int i) {
        this.f191310a = i;
        this.f191311b = pagerState;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int pageCount;
        switch (this.f191310a) {
            case 0:
                pageCount = this.f191311b.getPageCount();
                break;
            case 1:
                pageCount = this.f191311b.getPageCount();
                break;
            case 2:
                pageCount = PagerState.settledPage_delegate$lambda$0(this.f191311b);
                break;
            case 3:
                pageCount = PagerState.targetPage_delegate$lambda$0(this.f191311b);
                break;
            default:
                pageCount = this.f191311b.getPageCount();
                break;
        }
        return Integer.valueOf(pageCount);
    }
}
