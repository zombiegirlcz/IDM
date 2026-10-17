package ydm;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import skm.h1;
import skm.r0;
import ylm.q;

/* JADX INFO: loaded from: classes23.dex */
public final class j implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f312724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f312725b;

    public /* synthetic */ j(Object obj2, int i) {
        this.f312724a = i;
        this.f312725b = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f312724a) {
            case 0:
                ((r0) this.f312725b).dispose();
                break;
            case 1:
                Throwable th10 = (Throwable) obj2;
                if (th10 != null) {
                    ((h1) this.f312725b).A(new CancellationException(th10.getMessage()));
                }
                break;
            default:
                ((q) this.f312725b).cancel();
                break;
        }
        return Unit.f186387a;
    }
}
