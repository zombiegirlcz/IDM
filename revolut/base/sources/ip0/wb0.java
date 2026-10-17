package ip0;

import android.view.View;
import com.revolut.core.ui_kit.delegates.RowQuantityDelegate;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class wb0 implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f166977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RowQuantityDelegate f166978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.revolut.core.ui_kit.delegates.bg f166979c;

    public /* synthetic */ wb0(RowQuantityDelegate rowQuantityDelegate, com.revolut.core.ui_kit.delegates.bg bgVar, int i) {
        this.f166977a = i;
        this.f166978b = rowQuantityDelegate;
        this.f166979c = bgVar;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f166977a) {
            case 0:
                ((ihm.f) this.f166978b.d.getValue()).onNext(this.f166979c);
                break;
            default:
                ((ihm.f) this.f166978b.e.getValue()).onNext(this.f166979c);
                break;
        }
    }
}
