package mfm;

import java.util.ArrayList;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f205038a;

    public a(int i) {
        this.f205038a = i;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return new ArrayList(this.f205038a);
    }
}
