package tpi;

import ald.o;
import efm.r;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
public final class i extends fsi.c implements j {

    @NotNull
    public static final h Companion = new h();
    public static final fsi.b o = new fsi.b("PROGRESS_DELEGATE_ID");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final rpi.c f273405h;
    public final kz0.b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ConcurrentHashMap f273406j;
    public final AtomicInteger k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final ihm.f f273407l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public kz0.a f273408m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ifm.c f273409n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(rpi.c keyboardView, kz0.b progressDialogFactory) {
        super(o);
        Intrinsics.checkNotNullParameter(keyboardView, "keyboardView");
        Intrinsics.checkNotNullParameter(progressDialogFactory, "progressDialogFactory");
        this.f273405h = keyboardView;
        this.i = progressDialogFactory;
        this.f273406j = new ConcurrentHashMap();
        this.k = new AtomicInteger(0);
        this.f273407l = v0.a.d("create(...)");
    }

    public final boolean N() {
        Collection collectionValues = this.f273406j.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        Collection<Boolean> collection = collectionValues;
        if (!collection.isEmpty()) {
            for (Boolean bool : collection) {
                Intrinsics.h(bool);
                if (bool.booleanValue()) {
                    return false;
                }
            }
        }
        return this.k.get() <= 0;
    }

    public final void O(r rVar) {
        this.f273406j.put(rVar, Boolean.FALSE);
        if (N()) {
            R();
        }
    }

    public final void Q() {
        AtomicInteger atomicInteger = this.k;
        atomicInteger.decrementAndGet();
        if (N()) {
            atomicInteger.set(0);
            R();
        }
    }

    public final void R() {
        try {
            kz0.a aVar = this.f273408m;
            if (aVar != null) {
                aVar.dismiss();
            }
            this.f273408m = null;
            ifm.c cVar = this.f273409n;
            if (cVar != null) {
                cVar.dispose();
            }
            this.f273409n = null;
        } catch (Throwable th10) {
            gom.e.f145194a.d(th10);
        }
    }

    public final void V(long j2, boolean z) {
        if (N() || this.f273408m != null) {
            return;
        }
        if (z) {
            ((rpi.b) this.f273405h).N(false);
        }
        R();
        kz0.a aVarA = this.i.a(j2);
        this.f273408m = aVarA;
        this.f273409n = aVarA.a().subscribe(new pv9.b(new o(1, this.f273407l, ihm.f.class, "onNext", "onNext(Ljava/lang/Object;)V", 0, 16), 21));
        try {
            kz0.a aVar = this.f273408m;
            if (aVar != null) {
                aVar.show();
            }
        } catch (Throwable th10) {
            gom.e.f145194a.d(th10);
        }
    }

    public final void W(boolean z) {
        this.k.incrementAndGet();
        V(1000L, z);
    }
}
