package nhm;

import java.util.NoSuchElementException;
import java.util.function.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class r implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f215611a;

    @Override // java.util.function.Supplier
    public final Object get() {
        return new NoSuchElementException(String.valueOf(this.f215611a));
    }
}
