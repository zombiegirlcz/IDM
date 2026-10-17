package gic;

import com.revolut.kompot.common.ExternalDestination;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f144109a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h f144110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f144111c;

    public /* synthetic */ b(h hVar, String str, int i) {
        this.f144109a = i;
        this.f144110b = hVar;
        this.f144111c = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f144109a) {
            case 0:
                knm.b.j(this.f144110b.f144118m, new ExternalDestination.Browser(this.f144111c, null));
                break;
            default:
                knm.b.j(this.f144110b.f144118m, new ExternalDestination.Browser(this.f144111c, null));
                break;
        }
        return Unit.f186387a;
    }
}
