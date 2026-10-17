package vq0;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class f implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f291290a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f291291b;

    public /* synthetic */ f(h hVar, int i) {
        this.f291290a = i;
        this.f291291b = hVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f291290a) {
            case 0:
                this.f291291b.f = false;
                break;
            case 1:
                this.f291291b.f = true;
                break;
            case 2:
                this.f291291b.f291294g = true;
                break;
            default:
                this.f291291b.f291294g = false;
                break;
        }
        return Unit.f186387a;
    }
}
