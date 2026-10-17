package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.MapDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class kw implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f165089a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MapDelegate f165090b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.w8 f165091c;

    public /* synthetic */ kw(MapDelegate mapDelegate, com.revolut.core.ui_kit.delegates.w8 w8Var, int i) {
        this.f165089a = i;
        this.f165090b = mapDelegate;
        this.f165091c = w8Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f165089a) {
            case 0:
                this.f165090b.f52762c.onNext(this.f165091c);
                break;
            default:
                this.f165090b.d.onNext(this.f165091c);
                break;
        }
    }
}
