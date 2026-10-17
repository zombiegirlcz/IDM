package lki;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class s implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f196470a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z f196471b;

    public /* synthetic */ s(z zVar, int i) {
        this.f196470a = i;
        this.f196471b = zVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f196470a) {
            case 0:
                z zVar = this.f196471b;
                zVar.r();
                zVar.q();
                break;
            default:
                z zVar2 = this.f196471b;
                zVar2.r();
                zVar2.q();
                break;
        }
        return Unit.f186387a;
    }
}
