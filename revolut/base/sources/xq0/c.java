package xq0;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ip0.mc0;
import ip0.nc0;
import ip0.oc0;
import ix0.f2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes19.dex */
public final class c {

    @NotNull
    private static final a Companion = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f308026a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RecyclerView f308027b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public oc0 f308028c;
    public boolean d;
    public boolean e;
    public final Handler f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x.b f308029g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final f2 f308030h;

    public c(RecyclerView recyclerView, View itemView) {
        Intrinsics.checkNotNullParameter(itemView, "itemView");
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        this.f308026a = itemView;
        this.f308027b = recyclerView;
        this.f308028c = nc0.f165491a;
        this.f = new Handler(Looper.getMainLooper());
        this.f308029g = new x.b(this, 5);
        f2 f2Var = new f2(itemView, new tul.b(this, 18));
        this.f308030h = f2Var;
        b bVar = new b(this);
        f2Var.a();
        recyclerView.addOnItemTouchListener(bVar);
    }

    public final void a() {
        if (!Intrinsics.f(this.f308028c, mc0.f165357a) || this.e || !this.f308030h.f169236c || this.d) {
            return;
        }
        Handler handler = this.f;
        x.b bVar = this.f308029g;
        handler.removeCallbacks(bVar);
        this.d = true;
        handler.postDelayed(bVar, 4000L);
    }
}
