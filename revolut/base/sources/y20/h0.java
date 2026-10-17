package y20;

import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes19.dex */
public final /* synthetic */ class h0 implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f310500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b1 f310501b;

    public /* synthetic */ h0(b1 b1Var, int i) {
        this.f310500a = i;
        this.f310501b = b1Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f310500a) {
            case 0:
                Boolean bool = (Boolean) this.f310501b.f310459j.f285201a.T2("is_how_to_use_files_explanation_was_shown", Boolean.TYPE);
                return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
            default:
                com.revolut.data.database.models.openbanking.d.D(Boolean.TYPE, this.f310501b.f310459j.f285201a, "is_how_to_use_files_explanation_was_shown", Boolean.TRUE);
                return Unit.f186387a;
        }
    }
}
