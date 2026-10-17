package tw0;

import androidx.recyclerview.widget.RecyclerView;
import com.revolut.core.ui_kit.delegates.y8;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import skm.c2;

/* JADX INFO: loaded from: classes19.dex */
public final class r {

    @NotNull
    public static final o Companion = new o();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y8 f274867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zkm.d f274868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f274869c;
    public RecyclerView d;
    public final LinkedList e;
    public boolean f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q f274870g;

    public r(y8 viewHolder) {
        Intrinsics.checkNotNullParameter(viewHolder, "viewHolder");
        this.f274867a = viewHolder;
        c2 c2VarE = skm.e0.e();
        skm.p0 p0Var = skm.p0.f264001a;
        this.f274868b = skm.e0.c(kotlin.coroutines.e.d(c2VarE, zkm.o.f323119a));
        this.e = new LinkedList();
        this.f274870g = new q(this);
        viewHolder.itemView.addOnAttachStateChangeListener(new p(this));
    }

    public final void a(int i) {
        boolean z = this.f274869c;
        boolean z3 = i == 0;
        this.f274869c = z3;
        if (z3 == z) {
            return;
        }
        zkm.d dVar = this.f274868b;
        if (!z3) {
            skm.e0.n(dVar.f323100a);
        } else {
            if (this.e.isEmpty()) {
                return;
            }
            this.f = true;
            skm.e0.C(dVar, null, null, new tjf.p0(this, null, 18), 3);
        }
    }
}
