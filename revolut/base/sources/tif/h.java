package tif;

import com.revolut.core.extensions.rx.BreadcrumbException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class h implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f271501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AtomicReference f271502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ q f271503c;
    public final /* synthetic */ BreadcrumbException d;

    public /* synthetic */ h(AtomicReference atomicReference, q qVar, BreadcrumbException breadcrumbException, int i) {
        this.f271501a = i;
        this.f271502b = atomicReference;
        this.f271503c = qVar;
        this.d = breadcrumbException;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj2) {
        switch (this.f271501a) {
            case 0:
                this.f271502b.set(this.f271503c.b(this.d));
                break;
            case 1:
                this.f271502b.set(this.f271503c.b(this.d));
                break;
            case 2:
                this.f271502b.set(this.f271503c.b(this.d));
                break;
            default:
                this.f271502b.set(this.f271503c.b(this.d));
                break;
        }
        return Unit.f186387a;
    }
}
