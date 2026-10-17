package e8;

import android.view.View;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* JADX INFO: loaded from: classes.dex */
public final class q implements nfm.i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f123508a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f123509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object f123510c;
    public Object d;

    public q(View root, int i) {
        this.f123508a = 2;
        Intrinsics.checkNotNullParameter(root, "root");
        this.f123510c = root;
        this.f123509b = i;
        this.d = Unit.f186387a;
    }

    public boolean a(dom.a aVar) {
        Object obj2;
        Object obj3 = this.f123510c;
        while (true) {
            Object[] objArr = (Object[]) obj3;
            if (objArr == null) {
                return false;
            }
            for (int i = 0; i < 4 && (obj2 = objArr[i]) != null; i++) {
                if (obj2 == zfm.m.COMPLETE) {
                    aVar.onComplete();
                    return true;
                }
                if (obj2 instanceof zfm.k) {
                    aVar.onError(((zfm.k) obj2).f322037a);
                    return true;
                }
                if (obj2 instanceof zfm.l) {
                    aVar.e(((zfm.l) obj2).f322038a);
                } else {
                    aVar.onNext(obj2);
                }
            }
            obj3 = objArr[4];
        }
    }

    public void c(Object obj2) {
        int i = this.f123509b;
        if (i == 4) {
            Object[] objArr = new Object[5];
            ((Object[]) this.d)[4] = objArr;
            this.d = objArr;
            i = 0;
        }
        ((Object[]) this.d)[i] = obj2;
        this.f123509b = i + 1;
    }

    @Override // nfm.j
    public void clear() {
        while (poll() != null) {
        }
    }

    public void d(zfm.a aVar) {
        Object obj2;
        for (Object[] objArr = (Object[]) this.f123510c; objArr != null; objArr = objArr[4]) {
            for (int i = 0; i < 4 && (obj2 = objArr[i]) != null; i++) {
                if (aVar.test(obj2)) {
                    return;
                }
            }
        }
    }

    public String e() {
        StringBuilder sb6 = new StringBuilder("$");
        int i = this.f123509b + 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj2 = ((Object[]) this.f123510c)[i2];
            if (obj2 instanceof SerialDescriptor) {
                SerialDescriptor serialDescriptor = (SerialDescriptor) obj2;
                if (!Intrinsics.f(serialDescriptor.getKind(), olm.k.f226488c)) {
                    int i3 = ((int[]) this.d)[i2];
                    if (i3 >= 0) {
                        sb6.append(".");
                        sb6.append(serialDescriptor.d(i3));
                    }
                } else if (((int[]) this.d)[i2] != -1) {
                    sb6.append("[");
                    sb6.append(((int[]) this.d)[i2]);
                    sb6.append("]");
                }
            } else if (obj2 != slm.r.f264279a) {
                sb6.append("['");
                sb6.append(obj2);
                sb6.append("']");
            }
        }
        return sb6.toString();
    }

    public View f() {
        if (this.d == Unit.f186387a) {
            this.d = ((View) this.f123510c).findViewById(this.f123509b);
        }
        return (View) this.d;
    }

    @Override // nfm.j
    public boolean isEmpty() {
        ham.a aVar = (ham.a) ((AtomicReference) this.d).get();
        AtomicInteger atomicInteger = aVar.f150531a;
        while (true) {
            int i = atomicInteger.get();
            if (i >= aVar.length() - 1) {
                aVar = (ham.a) aVar.get(aVar.length() - 1);
                if (aVar == null) {
                    break;
                }
                atomicInteger = aVar.f150531a;
            } else {
                Object obj2 = aVar.get(i);
                if (i == atomicInteger.get()) {
                    if (obj2 == null) {
                        break;
                    }
                    return false;
                }
            }
        }
        return true;
    }

    @Override // nfm.j
    public boolean offer(Object obj2) {
        int i;
        mfm.f.b(obj2, "value is null");
        ham.a aVar = (ham.a) this.f123510c;
        int i2 = this.f123509b;
        if (i2 == aVar.length() - 1) {
            ham.a aVar2 = new ham.a(aVar.length());
            this.f123510c = aVar2;
            aVar2.lazySet(0, obj2);
            aVar.lazySet(aVar.length() - 1, aVar2);
            i = 1;
        } else {
            aVar.lazySet(i2, obj2);
            i = i2 + 1;
        }
        this.f123509b = i;
        return true;
    }

    @Override // nfm.j
    public Object poll() {
        AtomicReference atomicReference = (AtomicReference) this.d;
        ham.a aVar = (ham.a) atomicReference.get();
        AtomicInteger atomicInteger = aVar.f150531a;
        while (true) {
            int i = atomicInteger.get();
            if (i >= aVar.length() - 1) {
                ham.a aVar2 = (ham.a) aVar.get(aVar.length() - 1);
                if (aVar2 == null) {
                    break;
                }
                while (!atomicReference.compareAndSet(aVar, aVar2) && atomicReference.get() == aVar) {
                }
                aVar = (ham.a) atomicReference.get();
                atomicInteger = aVar.f150531a;
            } else {
                Object obj2 = aVar.get(i);
                if (i != atomicInteger.get()) {
                    continue;
                } else {
                    if (obj2 == null) {
                        break;
                    }
                    if (atomicInteger.compareAndSet(i, i + 1)) {
                        aVar.lazySet(i, null);
                        return obj2;
                    }
                }
            }
        }
        return null;
    }

    public String toString() {
        switch (this.f123508a) {
            case 3:
                return e();
            default:
                return super.toString();
        }
    }

    public q(int i, byte b4) {
        this.f123508a = i;
        switch (i) {
            case 4:
                Object[] objArr = new Object[5];
                this.f123510c = objArr;
                this.d = objArr;
                break;
        }
    }

    public q(int i) {
        this.f123508a = 1;
        ham.a aVar = new ham.a(Math.max(2, i) + 1);
        this.f123510c = aVar;
        this.d = new AtomicReference(aVar);
    }

    public q(r rVar) {
        this.f123508a = 0;
        this.d = z8.d.a(150, new a31.a(this, 6));
        this.f123510c = rVar;
    }
}
