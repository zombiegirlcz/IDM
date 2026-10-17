package y7d;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class y implements Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f311502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a0 f311503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ RecyclerView.ViewHolder f311504c;

    public /* synthetic */ y(a0 a0Var, RecyclerView.ViewHolder viewHolder, int i) {
        this.f311502a = i;
        this.f311503b = a0Var;
        this.f311504c = viewHolder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f311502a) {
            case 0:
                this.f311503b.dispatchAddStarting(this.f311504c);
                break;
            case 1:
                this.f311503b.dispatchAddFinished(this.f311504c);
                break;
            default:
                this.f311503b.dispatchRemoveStarting(this.f311504c);
                break;
        }
        return Unit.f186387a;
    }
}
