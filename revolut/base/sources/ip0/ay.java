package ip0;

import com.revolut.core.ui_kit.delegates.NewRevolutCardDelegate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class ay implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f163504a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ NewRevolutCardDelegate f163505b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ NewRevolutCardDelegate.Model f163506c;

    public /* synthetic */ ay(NewRevolutCardDelegate newRevolutCardDelegate, NewRevolutCardDelegate.Model model, int i) {
        this.f163504a = i;
        this.f163505b = newRevolutCardDelegate;
        this.f163506c = model;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f163504a) {
            case 0:
                this.f163505b.o.onNext(this.f163506c);
                break;
            case 1:
                this.f163505b.o.onNext(this.f163506c);
                break;
            default:
                this.f163505b.o.onNext(this.f163506c);
                break;
        }
        return Unit.f186387a;
    }
}
