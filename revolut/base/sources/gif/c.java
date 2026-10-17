package gif;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class c implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f144175b;

    public /* synthetic */ c(h hVar, int i) {
        this.f144174a = i;
        this.f144175b = hVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f144174a) {
            case 0:
                h hVar = this.f144175b;
                return ((ihm.f) hVar.f144185j.getValue()).startWith(Boolean.valueOf(hVar.a()));
            default:
                return Boolean.valueOf(this.f144175b.a());
        }
    }
}
