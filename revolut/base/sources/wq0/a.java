package wq0;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f299369a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f299370b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f299371c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ a(d dVar, boolean z, Function0 function0) {
        this.f299370b = dVar;
        this.f299371c = z;
        this.d = function0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f299369a) {
            case 0:
                if (this.f299371c) {
                    this.f299370b.f299372a.setVisibility(0);
                }
                this.d.invoke();
                break;
            default:
                d dVar = this.f299370b;
                dVar.d = null;
                if (!this.f299371c) {
                    dVar.f299372a.setVisibility(8);
                }
                this.d.invoke();
                break;
        }
    }

    public /* synthetic */ a(boolean z, d dVar, Function0 function0) {
        this.f299371c = z;
        this.f299370b = dVar;
        this.d = function0;
    }
}
