package wq0;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299380a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f299381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f299382c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ h(j jVar, boolean z, Function0 function0) {
        this.f299381b = jVar;
        this.f299382c = z;
        this.d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f299380a) {
            case 0:
                if (this.f299382c) {
                    this.f299381b.f299383a.setVisibility(0);
                }
                this.d.invoke();
                break;
            default:
                j jVar = this.f299381b;
                jVar.f299384b = null;
                if (!this.f299382c) {
                    jVar.f299383a.setVisibility(8);
                }
                this.d.invoke();
                break;
        }
    }

    public /* synthetic */ h(boolean z, j jVar, Function0 function0) {
        this.f299382c = z;
        this.f299381b = jVar;
        this.d = function0;
    }
}
