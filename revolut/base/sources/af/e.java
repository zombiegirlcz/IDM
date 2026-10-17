package af;

import android.content.Context;
import androidx.core.os.UserManagerCompat;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class e implements g, i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f3811a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3812b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final cf.b f3813c;
    public final Set d;
    public final Executor e;

    public e(Context context, String str, Set set, cf.b bVar, Executor executor) {
        this.f3811a = new c(context, 0, str);
        this.d = set;
        this.e = executor;
        this.f3813c = bVar;
        this.f3812b = context;
    }

    public final void a() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!UserManagerCompat.isUserUnlocked(this.f3812b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new d(this, 0));
        }
    }
}
