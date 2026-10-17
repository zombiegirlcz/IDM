package tx0;

import aw0.x8;
import com.revolut.core.ui_kit.views.ActionsView;
import com.revolut.core.ui_kit.views.navbar.PhotoHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class c4 implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f275096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PhotoHeaderView f275097b;

    public /* synthetic */ c4(PhotoHeaderView photoHeaderView, int i) {
        this.f275096a = i;
        this.f275097b = photoHeaderView;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f275096a) {
            case 0:
                this.f275097b.S.onNext((ActionsView.Item) obj2);
                break;
            case 1:
                this.f275097b.R.onNext((String) obj2);
                break;
            default:
                PhotoHeaderView photoHeaderView = this.f275097b;
                photoHeaderView.H = (x8) obj2;
                photoHeaderView.y();
                break;
        }
        return Unit.f186387a;
    }
}
