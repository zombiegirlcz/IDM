package mfm;

import java.util.concurrent.Callable;
import kfm.o;

/* JADX INFO: loaded from: classes13.dex */
public final class d implements Callable, o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f205040a;

    public d(Object obj2) {
        this.f205040a = obj2;
    }

    @Override // kfm.o, androidx.arch.core.util.Function
    public final Object apply(Object obj2) {
        return this.f205040a;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f205040a;
    }
}
