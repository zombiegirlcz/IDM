package dlm;

import dce.l0;
import fgm.p;
import io.reactivex.rxjava3.disposables.Disposable;
import skm.l;
import yhm.m;
import yhm.o;

/* JADX INFO: loaded from: classes14.dex */
public final class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f115799a;

    public /* synthetic */ a(l lVar) {
        this.f115799a = lVar;
    }

    @Override // fgm.p
    public void onError(Throwable th10) {
        m.Companion aVar = m.INSTANCE;
        this.f115799a.resumeWith(o.a(th10));
    }

    @Override // fgm.p
    public void onSubscribe(Disposable disposable) {
        this.f115799a.r(new l0(disposable, 27));
    }

    @Override // fgm.p
    public void onSuccess(Object obj2) {
        m.Companion aVar = m.INSTANCE;
        this.f115799a.resumeWith(obj2);
    }
}
