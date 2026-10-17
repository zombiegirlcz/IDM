package qgm;

import igm.p;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import sgm.h0;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends Maybe {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f246368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f246369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f246370c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f246368a = i;
        this.f246369b = obj2;
        this.f246370c = obj3;
    }

    @Override // io.reactivex.rxjava3.core.Maybe
    public final void e(fgm.e eVar) {
        switch (this.f246368a) {
            case 0:
                ((Single) this.f246369b).c(new ogm.l(eVar, (p) this.f246370c));
                break;
            default:
                ((Observable) this.f246369b).subscribe(new h0(eVar, (igm.c) this.f246370c));
                break;
        }
    }
}
