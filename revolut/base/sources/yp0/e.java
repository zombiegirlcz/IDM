package yp0;

import com.revolut.core.ui_kit.R$id;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f315721a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ k f315722b;

    public /* synthetic */ e(k kVar, int i) {
        this.f315721a = i;
        this.f315722b = kVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f315721a) {
            case 0:
                k kVar = this.f315722b;
                if (kVar.f315739a.getTag(R$id.internal_fast_smooth_scroll_operation_tag) == null) {
                    kVar.e.invoke();
                    break;
                }
                break;
            default:
                k kVar2 = this.f315722b;
                if (!kVar2.f) {
                    k.a(kVar2);
                    break;
                }
                break;
        }
    }
}
