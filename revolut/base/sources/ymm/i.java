package ymm;

import java.util.function.Supplier;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class i implements Supplier {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f315070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object[] f315071b;

    public /* synthetic */ i(String str, Object[] objArr) {
        this.f315070a = str;
        this.f315071b = objArr;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        return String.format(this.f315070a, this.f315071b);
    }
}
