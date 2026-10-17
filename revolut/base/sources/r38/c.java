package r38;

import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class c implements kfm.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f251202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ref$ObjectRef f251203b;

    public /* synthetic */ c(Ref$ObjectRef ref$ObjectRef, int i) {
        this.f251202a = i;
        this.f251203b = ref$ObjectRef;
    }

    @Override // kfm.a
    public final void run() {
        switch (this.f251202a) {
            case 0:
                ((ifm.c) this.f251203b.f186409a).dispose();
                break;
            default:
                ((ifm.c) this.f251203b.f186409a).dispose();
                break;
        }
    }
}
