package fgm;

import io.reactivex.rxjava3.core.Observable;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class g implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f135108a;

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.f135108a) {
            case 0:
                return Observable.empty();
            case 1:
                return new byte[8192];
            default:
                return new char[8192];
        }
    }
}
