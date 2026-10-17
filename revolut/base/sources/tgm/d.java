package tgm;

import ce9.m;
import fgm.p;
import igm.o;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public final class d extends Single {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f271207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f271208c;

    public /* synthetic */ d(Object obj2, Object obj3, int i) {
        this.f271206a = i;
        this.f271207b = obj2;
        this.f271208c = obj3;
    }

    @Override // io.reactivex.rxjava3.core.Single
    public final void j(p pVar) {
        switch (this.f271206a) {
            case 0:
                ((Completable) this.f271208c).c(new ngm.g(pVar, (SingleSource) this.f271207b, 4));
                break;
            case 1:
                ((Single) this.f271207b).c(new ogm.f(pVar, (igm.a) this.f271208c, 2));
                break;
            case 2:
                ((h) this.f271207b).c(new ngm.g(pVar, (com.onfido.android.sdk.capture.ui.camera.c) this.f271208c));
                break;
            case 3:
                e eVar = (e) this.f271207b;
                ryc.a aVar = new ryc.a();
                aVar.f258290b = this;
                aVar.f258289a = pVar;
                eVar.c(aVar);
                break;
            default:
                SingleSource[] singleSourceArr = new SingleSource[8];
                try {
                    int i = 0;
                    for (SingleSource singleSource : (ArrayList) this.f271207b) {
                        if (singleSource == null) {
                            Throwable nullPointerException = new NullPointerException("One of the sources is null");
                            pVar.onSubscribe(jgm.c.INSTANCE);
                            pVar.onError(nullPointerException);
                        } else {
                            if (i == singleSourceArr.length) {
                                singleSourceArr = (SingleSource[]) Arrays.copyOf(singleSourceArr, (i >> 2) + i);
                            }
                            int i2 = i + 1;
                            singleSourceArr[i] = singleSource;
                            i = i2;
                        }
                        break;
                    }
                    if (i == 0) {
                        Throwable noSuchElementException = new NoSuchElementException();
                        pVar.onSubscribe(jgm.c.INSTANCE);
                        pVar.onError(noSuchElementException);
                    } else if (i == 1) {
                        singleSourceArr[0].c(new k7i.i(pVar, new pak.h(this, 28), 29));
                    } else {
                        j jVar = new j(i, pVar, (o) this.f271208c);
                        pVar.onSubscribe(jVar);
                        for (int i3 = 0; i3 < i && !jVar.isDisposed(); i3++) {
                            singleSourceArr[i3].c(jVar.f271224c[i3]);
                        }
                    }
                } catch (Throwable th10) {
                    m.F(th10);
                    pVar.onSubscribe(jgm.c.INSTANCE);
                    pVar.onError(th10);
                }
                break;
        }
    }
}
