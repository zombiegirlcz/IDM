package hi0;

import af.j;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.messaging.FirebaseMessaging;
import hh0.e;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pd.g;

/* JADX INFO: loaded from: classes.dex */
public final class c extends gi0.b implements e {

    @NotNull
    public static final a Companion = new a(0);

    public static final class a extends ee.b {
        public /* synthetic */ a(int i) {
            this();
        }

        private a() {
            super(new an0.e(22));
        }
    }

    private c() {
    }

    public final ufm.b a() {
        FirebaseMessaging firebaseMessaging;
        j jVar = FirebaseMessaging.k;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = FirebaseMessaging.getInstance(g.c());
        }
        firebaseMessaging.getClass();
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        firebaseMessaging.f.execute(new ce.j(firebaseMessaging, taskCompletionSource, 2));
        Task task = taskCompletionSource.getTask();
        Intrinsics.checkNotNullExpressionValue(task, "getToken(...)");
        return rd0.e.t(task);
    }
}
