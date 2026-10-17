package mx0;

import android.view.View;
import com.revolut.core.ui_kit.internal.views.tag.TagViewData;
import com.revolut.core.ui_kit.views.DoubleTagView;

/* JADX INFO: loaded from: classes20.dex */
public final /* synthetic */ class h5 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f209730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DoubleTagView f209731b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ TagViewData f209732c;

    public /* synthetic */ h5(DoubleTagView doubleTagView, TagViewData tagViewData, int i) {
        this.f209730a = i;
        this.f209731b = doubleTagView;
        this.f209732c = tagViewData;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f209730a) {
            case 0:
                this.f209731b.f58516b.onNext(this.f209732c);
                break;
            default:
                this.f209731b.f.onNext(this.f209732c);
                break;
        }
    }
}
